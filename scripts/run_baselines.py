import os
import csv
import subprocess
from datetime import datetime
import time

# ================= CẤU HÌNH =================
BASE_DIR = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
# Mac dinh chay FULL (120 ham). Chay pilot: set bien moi truong DATASET_CSV=<path>\pilot_sample.csv
CSV_PATH = os.getenv("DATASET_CSV", os.path.join(BASE_DIR, "data", "full_ground_truth.csv"))
LOG_PATH = os.path.join(BASE_DIR, "results", "generation_log.csv")

# Thư mục xuất file
OUT_DIRS = {
    "randoop": os.path.join(BASE_DIR, "generated_tests", "randoop", "java"),
    "evosuite": os.path.join(BASE_DIR, "generated_tests", "evosuite", "java"),
    "pynguin": os.path.join(BASE_DIR, "generated_tests", "pynguin", "python")
}

# Tên công cụ (Đã check thư mục root)
RANDOOP_JAR = os.path.join(BASE_DIR, "randoop-all-4.3.4.jar")
EVOSUITE_JAR = os.path.join(BASE_DIR, "evosuite-1.2.0.jar")
# EvoSuite 1.2.0 chi chay duoc tren JDK 8/11 — tren JDK 17 chet InaccessibleObjectException
# (module system khoa reflection, --add-opens khong cuu duoc process con).
# May co java mac dinh la 17+: set EVOSUITE_JAVA tro den java.exe cua JDK 11.
EVOSUITE_JAVA = os.getenv("EVOSUITE_JAVA", "java")
# EvoSuite master spawn CLIENT bang java lay tu JAVA_HOME -> phai tro JAVA_HOME
# ve cung JDK voi EVOSUITE_JAVA, neu khong client van chay JDK 17 va chet ngam
# (master van exit 0 -> "thanh cong" gia).
EVOSUITE_ENV = os.environ.copy()
if EVOSUITE_JAVA != "java":
    EVOSUITE_ENV["JAVA_HOME"] = os.path.dirname(os.path.dirname(EVOSUITE_JAVA))
# Search budget 60s/class (mac dinh cua EvoSuite) + JVM overhead ~ 90-120s/run.
# Timeout phai LON HON tong nay, neu khong moi run hop le deu bi kill oan.
# Class lon (vd HelpFormatter ~1500 LOC) can nhieu hon: set EVOSUITE_TIMEOUT=360.
EVOSUITE_TIMEOUT = int(os.getenv("EVOSUITE_TIMEOUT", "180"))
PYNGUIN_BIN = "pynguin"
# Chay lai rieng tung tool: set BASELINE_TOOLS=evosuite (hoac "randoop", "pynguin", danh sach phay)
BASELINE_TOOLS = {t.strip() for t in os.getenv("BASELINE_TOOLS", "randoop,evosuite,pynguin").split(",")}

# Cho phép Pynguin chạy mà không báo lỗi Danger
os.environ["PYNGUIN_DANGER_AWARE"] = "1"
# ============================================

def java_classpath(repo_name):
    """Ghep classpath tu MOI target/classes trong repo (ho tro repo multi-module).

    Vi du gson mine ham tu ca 2 module `gson/` va `extras/` -> cp phai gom ca hai,
    neu chi lay <repo>/target/classes se thieu class (NoClassDefFound khi gen test).
    """
    root = os.path.join(BASE_DIR, "data", "raw", repo_name)
    cps = []
    direct = os.path.join(root, "target", "classes")
    if os.path.isdir(direct):
        cps.append(direct)
    if os.path.isdir(root):
        for sub in sorted(os.listdir(root)):
            c = os.path.join(root, sub, "target", "classes")
            if os.path.isdir(c) and c not in cps:
                cps.append(c)
    return os.pathsep.join(cps) if cps else direct


def extract_context(file_path, lang):
    file_path = file_path.replace("\\", "/")
    if lang == "java":
        if "src/main/java/" in file_path:
            pkg_path = file_path.split("src/main/java/")[1]
        else:
            pkg_path = file_path.split("/")[-1]
            return "", pkg_path.replace(".java", "")
        class_name = pkg_path.split("/")[-1].replace(".java", "")
        package_name = pkg_path.replace("/" + class_name + ".java", "").replace("/", ".")
        return package_name, class_name
    elif lang == "python":
        if "src/" in file_path:
            mod_path = file_path.split("src/")[1]
        else:
            mod_path = file_path.split("/")[-1]
        module_name = mod_path.replace("/", ".").replace(".py", "")
        return module_name, ""
    return "", ""

def append_to_log(log_writer, log_file, func_id, lang, source, test_path, status):
    log_writer.writerow({
        "function_id": func_id,
        "language": lang,
        "test_source": source,
        "model": "baseline_tool",
        "system_fingerprint": "",
        "test_path": test_path,
        "gen_status": status,
        "timestamp": datetime.now().isoformat()
    })
    log_file.flush()

def main():
    for d in OUT_DIRS.values():
        os.makedirs(d, exist_ok=True)
    os.makedirs(os.path.join(BASE_DIR, "results"), exist_ok=True)

    # utf-8-sig: bo qua BOM neu CSV duoc xuat tu Excel/PowerShell (BOM lam sai ten cot dau)
    with open(CSV_PATH, "r", encoding="utf-8-sig") as f:
        reader = csv.DictReader(f)
        rows = list(reader)

    print(f"Bắt đầu chạy baseline cho {len(rows)} hàm...")

    log_fieldnames = ["function_id", "language", "test_source", "model", "system_fingerprint", "test_path", "gen_status", "timestamp"]
    log_exists = os.path.exists(LOG_PATH)
    
    log_file = open(LOG_PATH, "a" if log_exists else "w", encoding="utf-8", newline="")
    log_writer = csv.DictWriter(log_file, fieldnames=log_fieldnames)
    if not log_exists:
        log_writer.writeheader()

    for i, row in enumerate(rows):
        func_id = row.get("function_id", row.get("func_id"))
        lang = row["language"]
        file_col = row["file"]
        package_name, class_name = extract_context(file_col, lang)
        
        # Tự động trích xuất tên repo từ đường dẫn file
        file_normalized = file_col.replace("\\", "/")
        repo_name = file_normalized.split("/raw/")[1].split("/")[0] if "/raw/" in file_normalized else ("commons-cli" if lang == "java" else "flask")


        if lang == "java":
            cp = java_classpath(repo_name)

            # RANDOOP
            if "randoop" in BASELINE_TOOLS:
                print(f"\n[{func_id}] Chạy Randoop cho {package_name}.{class_name}")
                out_file = f"generated_tests/randoop/java/{func_id}_Test.java"
                cmd = f"java -classpath \"{RANDOOP_JAR};{cp}\" randoop.main.Main gentests --testclass={package_name}.{class_name} --junit-output-dir=\"{OUT_DIRS['randoop']}\" --time-limit=10"
                try:
                    res = subprocess.run(cmd, shell=True, capture_output=True, text=True)
                    if res.returncode == 0:
                        status = "ok"
                        print("   -> Randoop chạy thành công.")
                    else:
                        status = "failed"
                        print(f"   -> LỖI RANDOOP: {res.stderr.strip()}")
                except Exception as e:
                    status = "error"
                    print(f"   -> LỖI EXCEPTION: {e}")
                append_to_log(log_writer, log_file, func_id, lang, "randoop", out_file, status)

            # EVOSUITE
            if "evosuite" in BASELINE_TOOLS:
                print(f"[{func_id}] Chạy EvoSuite cho {package_name}.{class_name}")
                out_file = f"generated_tests/evosuite/java/{func_id}_Test.java"
                evosuite_cmd = [
                    EVOSUITE_JAVA, "-jar", EVOSUITE_JAR,
                    "-class", f"{package_name}.{class_name}",
                    "-projectCP", cp,
                    "-Dsearch_budget=60",
                    f"-Dtest_dir={OUT_DIRS['evosuite']}"
                ]
                # EvoSuite exit 0 ke ca khi that bai -> phai kiem tra file test co that
                expected_test = os.path.join(OUT_DIRS['evosuite'], *package_name.split("."), f"{class_name}_ESTest.java")
                try:
                    res = subprocess.run(evosuite_cmd, shell=False, capture_output=True, text=True,
                                         timeout=EVOSUITE_TIMEOUT, env=EVOSUITE_ENV)
                    if res.returncode == 0 and os.path.exists(expected_test):
                        status = "ok"
                        print("   -> EvoSuite chạy thành công.")
                    else:
                        status = "failed"
                        # In ra một đoạn lỗi nhỏ để dễ debug
                        err = (res.stderr or res.stdout or "").strip()
                        print(f"   -> LỖI EVOSUITE (exit={res.returncode}, file={os.path.exists(expected_test)}): {err[:200]}...")
                except subprocess.TimeoutExpired:
                    status = "failed"
                    print(f"   -> LỖI EVOSUITE: Quá thời gian {EVOSUITE_TIMEOUT} giây (Timeout). Ghi nhận Fail.")
                except Exception as e:
                    status = "error"
                    print(f"   -> LỖI EXCEPTION: {e}")
                append_to_log(log_writer, log_file, func_id, lang, "evosuite", out_file, status)

        elif lang == "python" and "pynguin" in BASELINE_TOOLS:
            # PYNGUIN
            print(f"\n[{func_id}] Chạy Pynguin cho module {package_name}")
            out_file = f"generated_tests/pynguin/python/test_{func_id}.py"
            py_project_path = os.path.join(BASE_DIR, "data", "raw", repo_name, "src")
            cmd = f"{PYNGUIN_BIN} --project-path \"{py_project_path}\" --output-path \"{OUT_DIRS['pynguin']}\" --module-name {package_name} -v"
            try:
                res = subprocess.run(cmd, shell=True, capture_output=True, text=True)
                if res.returncode == 0:
                    status = "ok"
                    print("   -> Pynguin chạy thành công.")
                else:
                    status = "failed"
                    err_msg = res.stderr.strip() if res.stderr.strip() else res.stdout.strip()
                    print(f"   -> LỖI PYNGUIN: {err_msg}")
            except Exception as e:
                status = "error"
                print(f"   -> LỖI EXCEPTION (Có cài Pynguin chưa?): {e}")
            append_to_log(log_writer, log_file, func_id, lang, "pynguin", out_file, status)

    log_file.close()
    print("\nĐÃ HOÀN THÀNH CHẠY BASELINE (Randoop, EvoSuite, Pynguin).")

if __name__ == "__main__": 
    main()

import os
import csv
import subprocess
from datetime import datetime
import time

# ================= CẤU HÌNH =================
BASE_DIR = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
CSV_PATH = os.path.join(BASE_DIR, "data", "pilot_sample.csv")
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
PYNGUIN_BIN = "pynguin"

# Cho phép Pynguin chạy mà không báo lỗi Danger
os.environ["PYNGUIN_DANGER_AWARE"] = "1"
# ============================================

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

    with open(CSV_PATH, "r", encoding="utf-8") as f:
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

        if lang == "java":
            # RANDOOP
            print(f"\n[{func_id}] Chạy Randoop cho {package_name}.{class_name}")
            out_file = f"generated_tests/randoop/java/{func_id}_Test.java"
            cp = os.path.join(BASE_DIR, "data", "raw", "commons-cli", "target", "classes")
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

            # EVOSUITE (TẠM THỜI ẨN VÌ GÂY TREO MÁY ẢO JAVA)
            # print(f"[{func_id}] Chạy EvoSuite cho {package_name}.{class_name}")
            # out_file = f"generated_tests/evosuite/java/{func_id}_Test.java"
            # append_to_log(log_writer, log_file, func_id, lang, "evosuite", out_file, "skipped")

        elif lang == "python":
            # PYNGUIN
            print(f"\n[{func_id}] Chạy Pynguin cho module {package_name}")
            out_file = f"generated_tests/pynguin/python/test_{func_id}.py"
            py_project_path = os.path.join(BASE_DIR, "data", "raw", "flask", "src")
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

"""
run_experiment_rq4_context.py -- RQ4 (EXPLORATORY / POST-HOC, khong thuoc N=120 da
dang ky trong proposal). Chi chay khi nhom quyet dinh lam phan tich bo sung va (neu
can) da xin GV xac nhan day khong phai ket qua chinh thuc thay the RQ1-3.

Y HET run_experiment.py (cung model/temp/exemplar) TRU MOT BIEN DUY NHAT: prompt duoc
bo sung "Real API Context" trich THAT tu source file (xem scripts/extract_context.py)
truoc phan "Actual Task", de kiem tra gia thuyet trong Discussion Sec 5.4/5.5: phan lon
loi Java (wrong-target qua overload resolution) va loi Python (nham module-level
function voi instance-method) co the giam khi LLM thay ro CAU TRUC class/module that.

AN TOAN VOI DU LIEU DA CO:
  - Ghi test moi vao generated_tests/gpt4o_ctx/ (thu muc RIENG, KHONG phai
    generated_tests/gpt4o/ cua N=120 da bao cao).
  - Log rieng: results/generation_log_rq4.csv (KHONG dung chung generation_log.csv).
  - KHONG doc/ghi ms-analysis/results/metrics_full.csv hay bat ky file ket qua
    N=120 nao. Do luong RQ4 phai chay qua 1 pipeline do RIENG, roi so sanh nhu
    1 dieu kien moi -- khong ghi de len RQ1-3.

Yeu cau: bien moi truong OPENAI_API_KEY (chua duoc cau hinh tren may nay -- day la
buoc DUY NHAT can nguoi dung, xem cau tra loi trong hoi thoai).

Usage (giong het run_experiment.py, chi doi TEST_SOURCE):
  export OPENAI_API_KEY=sk-...
  python scripts/run_experiment_rq4_context.py
"""
import os
import sys
import csv
import time
from datetime import datetime
from openai import OpenAI

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from extract_context import java_class_skeleton, python_module_skeleton

# ================= CAU HINH (giong run_experiment.py, chi doi TEST_SOURCE + log path) =====
API_KEY = os.getenv("OPENAI_API_KEY")
MODEL = "gpt-4o-mini-2024-07-18"
TEST_SOURCE = "gpt4o_ctx"          # thu muc RIENG -- khong dung "gpt4o" cua N=120 goc
MAX_TOKENS = 2048
TOP_P = 1.0
TEMPERATURE = 0.0

BASE_DIR = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
CSV_PATH = os.getenv("DATASET_CSV", os.path.join(BASE_DIR, "data", "full_ground_truth.csv"))
OUT_DIR = os.path.join(BASE_DIR, "generated_tests", TEST_SOURCE)
LOG_PATH = os.path.join(BASE_DIR, "results", "generation_log_rq4.csv")       # RIENG
API_LOG_TXT = os.path.join(BASE_DIR, "results", "rq4_api_log.txt")           # RIENG
DATA_ROOT = os.getenv("DATA_ROOT", os.path.join(BASE_DIR, "data"))
# ============================================================================


def clean_code_block(text, language):
    text = text.strip()
    if text.startswith(f"```{language}"):
        text = text[len(f"```{language}"):]
    elif text.startswith("```"):
        text = text[3:]
    if text.endswith("```"):
        text = text[:-3]
    return text.strip()


def extract_context_names(file_path, lang):
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


def full_source_file_path(row):
    """File goc CHUA CA CLASS/MODULE (khac data/java_functions/<id>.java, la ham
    trich rieng) -- can de trich skeleton toan class/module, khong chi 1 ham.
    Cot `file` khong dong nhat: Java ghi 'data-research/raw/...', Python ghi
    'data/raw/...' truc tiep -- chuan hoa ve phan sau 'raw/' truoc khi noi DATA_ROOT."""
    file_col = row["file"].replace("\\", "/")
    if "raw/" in file_col:
        file_col = "raw/" + file_col.split("raw/", 1)[1]
    return os.path.join(DATA_ROOT, file_col)


def main():
    if not API_KEY:
        print("LOI: chua thiet lap OPENAI_API_KEY. Day la buoc CAN NGUOI DUNG "
              "(xem giai thich trong hoi thoai) -- script dung, khong sinh test nao.")
        return 1

    client = OpenAI(api_key=API_KEY)
    os.makedirs(os.path.join(OUT_DIR, "java"), exist_ok=True)
    os.makedirs(os.path.join(OUT_DIR, "python"), exist_ok=True)
    os.makedirs(os.path.join(BASE_DIR, "results"), exist_ok=True)

    with open(CSV_PATH, "r", encoding="utf-8-sig") as f:
        rows = list(csv.DictReader(f))
    print(f"[RQ4-context] Da nap {len(rows)} ham tu {CSV_PATH}.")

    log_fields = ["function_id", "language", "test_source", "model", "context_chars",
                  "test_path", "gen_status", "timestamp"]
    log_exists = os.path.exists(LOG_PATH)
    processed = set()
    if log_exists:
        with open(LOG_PATH, encoding="utf-8-sig") as f:
            for r in csv.DictReader(f):
                processed.add(r["function_id"])
    log_f = open(LOG_PATH, "a" if log_exists else "w", encoding="utf-8", newline="")
    log_w = csv.DictWriter(log_f, fieldnames=log_fields)
    if not log_exists:
        log_w.writeheader()

    for i, row in enumerate(rows):
        func_id = row.get("func_id", row.get("function_id"))
        lang = row["language"]
        if func_id in processed:
            print(f"[{i+1}/{len(rows)}] {func_id} da co, bo qua.")
            continue

        source_path = os.path.join(DATA_ROOT, row["raw_source_path"].removeprefix("data-research/"))
        if not os.path.exists(source_path):
            print(f"CANH BAO: khong thay {source_path}, bo qua {func_id}"); continue
        source_code = open(source_path, encoding="utf-8", errors="replace").read()

        full_path = full_source_file_path(row)
        skeleton = ""
        if os.path.exists(full_path):
            full_src = open(full_path, encoding="utf-8", errors="replace").read()
            skeleton = (java_class_skeleton(full_src) if lang == "java"
                        else python_module_skeleton(full_src))

        package_name, class_name = extract_context_names(row["file"], lang)
        func_name = row["func_name"]

        ctx_block = (
            f"\n### Real API Context (extracted from the actual source file — use this "
            f"to call the EXACT method you are asked to test, not a same-named method "
            f"elsewhere in the class/module) ###\n```{lang}\n{skeleton}\n```\n"
            if skeleton else ""
        )

        if lang == "java":
            prompt = (
                "You are an expert software tester.\n"
                "Generate JUnit 5 tests to achieve maximum branch coverage and mutation score.\n"
                "Do not output any explanations, only the executable Java code.\n\n"
                "### Example Input ###\nClass: org.example.MathUtils\nFunction: add\nCode:\n"
                "```java\npackage org.example;\npublic class MathUtils {\n"
                "    public static int add(int a, int b) {\n"
                "        if (a < 0 && b < 0) return 0;\n        return a + b;\n    }\n}\n```\n\n"
                "### Example Output ###\n```java\npackage org.example;\n"
                "import org.junit.jupiter.api.Test;\nimport static org.junit.jupiter.api.Assertions.*;\n\n"
                "public class MathUtilsTest {\n    @Test\n    void testAdd_BothNegative() {\n"
                "        assertEquals(0, MathUtils.add(-1, -1));\n    }\n    @Test\n"
                "    void testAdd_Normal() {\n        assertEquals(5, MathUtils.add(2, 3));\n    }\n}\n```\n"
                f"{ctx_block}\n"
                "### Actual Task ###\n"
                f"The function below belongs to public class `{package_name}.{class_name}`.\n"
                f"Generate JUnit 5 tests in package `{package_name}` that call `{func_name}` "
                f"on the EXACT class/nested-class shown in the Real API Context above.\n"
                f"Include the correct `package {package_name};` at the top of the file.\n\n"
                f"```java\n{source_code}\n```"
            )
        else:
            prompt = (
                "You are an expert software tester.\n"
                "Generate pytest tests to achieve maximum branch coverage and mutation score.\n"
                "Do not output any explanations, only the executable Python code.\n\n"
                "### Example Input ###\nModule: mymath.utils\nFunction: add\nCode:\n"
                "```python\ndef add(a, b):\n    if a < 0 and b < 0:\n        return 0\n"
                "    return a + b\n```\n\n### Example Output ###\n```python\nimport pytest\n"
                "from mymath.utils import add\n\ndef test_add_both_negative():\n"
                "    assert add(-1, -1) == 0\n\ndef test_add_normal():\n"
                "    assert add(2, 3) == 5\n```\n"
                f"{ctx_block}\n"
                "### Actual Task ###\n"
                f"The function below belongs to the installed module `{package_name}`.\n"
                f"Generate pytest tests for `{func_name}`.\n"
                "Use the Real API Context above to determine whether it is a module-level "
                "function or a method of a class — import/call it accordingly.\n"
                f"You MUST import the target from its real module: `from {package_name} import ...`\n"
                "Do NOT re-implement or copy the function into the test file.\n\n"
                f"```python\n{source_code}\n```"
            )

        print(f"[{i+1}/{len(rows)}] [RQ4-context] Goi API cho {func_id} ({lang}, ctx={len(skeleton)} chars)...")
        out_ext = ".java" if lang == "java" else ".py"
        test_file_name = f"{func_id}_Test{out_ext}" if lang == "java" else f"test_{func_id}.py"
        out_file_path = os.path.join(OUT_DIR, lang, test_file_name)
        rel_test_path = f"generated_tests/{TEST_SOURCE}/{lang}/{test_file_name}"

        try:
            resp = client.chat.completions.create(
                model=MODEL, temperature=TEMPERATURE, top_p=TOP_P, max_tokens=MAX_TOKENS,
                messages=[{"role": "user", "content": prompt}])
            code = clean_code_block(resp.choices[0].message.content, lang)
            open(out_file_path, "w", encoding="utf-8").write(code)
            in_t, out_t = resp.usage.prompt_tokens, resp.usage.completion_tokens
            cost = (in_t * 0.150 + out_t * 0.600) / 1_000_000
            with open(API_LOG_TXT, "a", encoding="utf-8") as f:
                f.write(f"[{datetime.now().isoformat()}] {func_id} cost=${cost:.6f}\n")
            log_w.writerow({"function_id": func_id, "language": lang, "test_source": TEST_SOURCE,
                             "model": MODEL, "context_chars": len(skeleton), "test_path": rel_test_path,
                             "gen_status": "ok", "timestamp": datetime.now().isoformat()})
            log_f.flush()
            print(f"  -> {rel_test_path}")
        except Exception as e:
            print(f"  -> LOI API tai {func_id}: {e}")
            log_w.writerow({"function_id": func_id, "language": lang, "test_source": TEST_SOURCE,
                             "model": MODEL, "context_chars": len(skeleton), "test_path": "",
                             "gen_status": "api_error", "timestamp": datetime.now().isoformat()})
            log_f.flush()
            time.sleep(2)

    log_f.close()
    print(f"\n[RQ4-context] XONG. Test moi trong {OUT_DIR}/, log tai {LOG_PATH}.")
    print("Buoc tiep theo: do bang measure_java_from_reports.py / measure_python module "
          "voi method='gpt4o-mini-ctx', ghi vao 1 file KET QUA RIENG (khong ghi vao "
          "metrics_full.csv), roi so sanh RQ4 nhu 1 dieu kien moi trong report.")
    return 0


if __name__ == "__main__":
    sys.exit(main())

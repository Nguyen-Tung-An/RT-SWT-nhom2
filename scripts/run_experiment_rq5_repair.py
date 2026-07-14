"""
run_experiment_rq5_repair.py -- RQ5 (EXPLORATORY / POST-HOC, xay tren RQ4). Day la
KY THUAT DUY NHAT nhom quyet dinh thu them sau context (RQ4), theo thoa thuan: bao
cao ket qua du dat hay khong dat nguong, roi DUNG -- khong tiep tuc thu them ky
thuat khac chi vi chua dat so dep (tranh optional stopping / p-hacking).

Co che: voi MOI ham RQ4 CHUA hieu qua (Java: branch_coverage==0; Python: khong
pass het file), dua NGUOC lai cho GPT: (a) code test RQ4 da sinh, (b) tin hieu
that ve ly do that bai --
  - Java: khong co compiler-error sach (log Maven/JVM lan nay lan kia dinh OOM/
    stack-trace khong lien quan code) -> dung tin hieu THAT nhung ON DINH hon:
    "test nay dat 0% coverage tren dong {start}-{end} cua {class}.{method}" +
    nhac lai skeleton — day la mot dang execution/coverage feedback, KHONG phai
    compiler-diagnostic feedback (ghi ro trong report, khong nhan la 2 thu giong nhau).
  - Python: chay lai pytest TUOI (khong doc log cu) tren test RQ4, lay dung stdout
    that (assert/exception that) lam feedback -- sach hon nhieu so voi Java.
-- roi goi API 1 LAN DUY NHAT/ham de sua. Ham DA hieu qua o RQ4 thi GIU NGUYEN
(khong repair cai da chay tot).

AN TOAN VOI DU LIEU DA CO: ghi test moi vao generated_tests/gpt4o_ctx_repair/
(thu muc RIENG), khong dung log/log-out cua RQ4/N=120. Do bang method=
'gpt4o-mini-ctx-repair', ghi vao metrics_rq5.csv (RIENG, khong cham metrics_full.csv
/ metrics_rq4.csv).

Yeu cau: OPENAI_API_KEY (nguoi dung tu dat, xem hoi thoai).
Usage:
  python scripts/run_experiment_rq5_repair.py
"""
import os
import sys
import csv
import shutil
import subprocess
import time
from datetime import datetime
from openai import OpenAI

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from extract_context import java_class_skeleton, python_module_skeleton
from run_experiment_rq4_context import (
    extract_context_names, full_source_file_path, clean_code_block,
)

API_KEY = os.getenv("OPENAI_API_KEY")
MODEL = "gpt-4o-mini-2024-07-18"
TEST_SOURCE = "gpt4o_ctx_repair"
MAX_TOKENS = 2048
TOP_P = 1.0
TEMPERATURE = 0.0
PYTEST_TIMEOUT = 60

BASE_DIR = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
CSV_PATH = os.getenv("DATASET_CSV", os.path.join(BASE_DIR, "data", "full_ground_truth.csv"))
RQ4_DIR = os.path.join(BASE_DIR, "generated_tests", "gpt4o_ctx")
OUT_DIR = os.path.join(BASE_DIR, "generated_tests", TEST_SOURCE)
RQ4_METRICS = os.path.join(BASE_DIR, "ms-analysis", "results", "metrics_rq4.csv")
LOG_PATH = os.path.join(BASE_DIR, "results", "generation_log_rq5.csv")
DATA_ROOT = os.getenv("DATA_ROOT", os.path.join(BASE_DIR, "data"))


def load_rq4_metrics():
    with open(RQ4_METRICS, encoding="utf-8-sig") as f:
        return {r["function_id"]: r for r in csv.DictReader(f)}


def python_failure_text(test_path):
    """Chay lai pytest TUOI tren test RQ4 that, lay dung stdout that (khong doc log cu)."""
    try:
        r = subprocess.run([sys.executable, "-m", "pytest", "-q", "-p", "no:cacheprovider", test_path],
                           cwd=BASE_DIR, capture_output=True, text=True,
                           encoding="utf-8", errors="replace", timeout=PYTEST_TIMEOUT)
        out = (r.stdout or "") + (r.stderr or "")
        return "\n".join(l for l in out.splitlines() if l.strip())[-1500:]
    except subprocess.TimeoutExpired:
        return "(pytest TIMEOUT khi chay lai test nay)"


def main():
    if not API_KEY:
        print("LOI: chua thiet lap OPENAI_API_KEY."); return 1
    if not os.path.exists(RQ4_METRICS):
        print(f"LOI: khong thay {RQ4_METRICS} -- chay RQ4 truoc."); return 1

    client = OpenAI(api_key=API_KEY)
    os.makedirs(os.path.join(OUT_DIR, "java"), exist_ok=True)
    os.makedirs(os.path.join(OUT_DIR, "python"), exist_ok=True)
    os.makedirs(os.path.join(BASE_DIR, "results"), exist_ok=True)

    rq4 = load_rq4_metrics()
    rows = list(csv.DictReader(open(CSV_PATH, encoding="utf-8-sig")))

    log_fields = ["function_id", "language", "test_source", "model", "action",
                  "test_path", "gen_status", "timestamp"]
    log_exists = os.path.exists(LOG_PATH)
    processed = set()
    if log_exists:
        with open(LOG_PATH, encoding="utf-8-sig") as f:
            processed = {r["function_id"] for r in csv.DictReader(f)}
    log_f = open(LOG_PATH, "a" if log_exists else "w", encoding="utf-8", newline="")
    log_w = csv.DictWriter(log_f, fieldnames=log_fields)
    if not log_exists:
        log_w.writeheader()

    n_repair, n_carry = 0, 0
    for i, row in enumerate(rows):
        func_id = row.get("func_id", row.get("function_id"))
        lang = row["language"]
        if func_id in processed:
            print(f"[{i+1}/{len(rows)}] {func_id} da co, bo qua.")
            continue

        rq4_row = rq4.get(func_id)
        rq4_ext = ".java" if lang == "java" else ".py"
        rq4_name = f"{func_id}_Test{rq4_ext}" if lang == "java" else f"test_{func_id}.py"
        rq4_test_path = os.path.join(RQ4_DIR, lang, rq4_name)
        out_test_path = os.path.join(OUT_DIR, lang, rq4_name)

        if not os.path.exists(rq4_test_path):
            print(f"[{i+1}/{len(rows)}] {func_id}: khong co test RQ4, bo qua.")
            continue

        needs_repair = (
            rq4_row is not None and (
                (lang == "java" and float(rq4_row.get("branch_coverage") or 0) == 0)
                or (lang == "python" and rq4_row.get("compiled") == "0")
            )
        )

        if not needs_repair:
            shutil.copy(rq4_test_path, out_test_path)
            n_carry += 1
            log_w.writerow({"function_id": func_id, "language": lang, "test_source": TEST_SOURCE,
                             "model": MODEL, "action": "carry-forward-no-repair-needed",
                             "test_path": f"generated_tests/{TEST_SOURCE}/{lang}/{rq4_name}",
                             "gen_status": "ok", "timestamp": datetime.now().isoformat()})
            log_f.flush()
            print(f"[{i+1}/{len(rows)}] {func_id}: RQ4 da hieu qua, giu nguyen (khong repair).")
            continue

        rq4_code = open(rq4_test_path, encoding="utf-8", errors="replace").read()
        full_path = full_source_file_path(row)
        skeleton = ""
        if os.path.exists(full_path):
            full_src = open(full_path, encoding="utf-8", errors="replace").read()
            skeleton = (java_class_skeleton(full_src) if lang == "java"
                        else python_module_skeleton(full_src))
        package_name, class_name = extract_context_names(row["file"], lang)
        func_name = row["func_name"]

        if lang == "java":
            lo, hi = row["start_line"], row["end_line"]
            feedback = (
                f"When executed, this test achieved 0% branch coverage of the target method "
                f"`{package_name}.{class_name}::{func_name}` (source lines {lo}-{hi}). This "
                f"usually means the test failed to compile, or it called a different method "
                f"than the one intended (e.g. a same-named method elsewhere in the class "
                f"hierarchy). Here is the real API structure again:\n```java\n{skeleton}\n```"
            )
        else:
            fail_text = python_failure_text(rq4_test_path)
            feedback = (
                f"When executed against the real module, this test produced:\n"
                f"```\n{fail_text}\n```\nHere is the real module API again:\n"
                f"```python\n{skeleton}\n```"
            )

        prompt = (
            "You are an expert software tester. You previously wrote the following "
            f"{lang} test for the function `{func_name}`:\n\n"
            f"```{lang}\n{rq4_code}\n```\n\n"
            f"{feedback}\n\n"
            "Fix the test so it compiles, runs, and correctly exercises the exact target "
            "method shown in the API context. Do not output any explanations, only the "
            "corrected, complete, executable code."
        )

        print(f"[{i+1}/{len(rows)}] [RQ5-repair] Goi API sua cho {func_id} ({lang})...")
        try:
            resp = client.chat.completions.create(
                model=MODEL, temperature=TEMPERATURE, top_p=TOP_P, max_tokens=MAX_TOKENS,
                messages=[{"role": "user", "content": prompt}])
            code = clean_code_block(resp.choices[0].message.content, lang)
            open(out_test_path, "w", encoding="utf-8").write(code)
            log_w.writerow({"function_id": func_id, "language": lang, "test_source": TEST_SOURCE,
                             "model": MODEL, "action": "repaired",
                             "test_path": f"generated_tests/{TEST_SOURCE}/{lang}/{rq4_name}",
                             "gen_status": "ok", "timestamp": datetime.now().isoformat()})
            log_f.flush()
            n_repair += 1
            print(f"  -> repaired, saved.")
        except Exception as e:
            print(f"  -> LOI API tai {func_id}: {e}")
            shutil.copy(rq4_test_path, out_test_path)  # fallback: giu ban RQ4 cu neu API loi
            log_w.writerow({"function_id": func_id, "language": lang, "test_source": TEST_SOURCE,
                             "model": MODEL, "action": "api_error_fallback_rq4",
                             "test_path": f"generated_tests/{TEST_SOURCE}/{lang}/{rq4_name}",
                             "gen_status": "api_error", "timestamp": datetime.now().isoformat()})
            log_f.flush()
            time.sleep(2)

    log_f.close()
    print(f"\n[RQ5-repair] XONG. Repaired={n_repair}, carried-forward={n_carry}. "
          f"Test moi trong {OUT_DIR}/, log tai {LOG_PATH}.")
    return 0


if __name__ == "__main__":
    sys.exit(main())

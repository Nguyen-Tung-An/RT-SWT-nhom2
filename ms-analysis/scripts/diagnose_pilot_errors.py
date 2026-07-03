"""
Chẩn đoán chi tiết vì sao từng hàm pilot Python bị INVALID trong measure_python.py.

Chạy lại đúng các bước của harness cho TỪNG hàm và ghi nguyên văn lỗi ở từng giai đoạn:
  P1  solution.py có parse được không (SyntaxError/IndentationError?)
  P2  `import solution` có chạy được không
  P3  pytest --collect-only (bước quyết định compiled=0/1 trong harness)
  P4  pytest chạy test trên BẢN GỐC (green-check — harness hiện chưa làm bước này)
  P5  heuristic: test có tự định nghĩa lại hàm/logic thay vì gọi hàm gốc không

Input : ms-analysis/data/pilot_functions.csv + pilot_llm_output.csv
        (tạo bằng scripts/prep_contract_inputs.py)
Output: ms-analysis/results/pilot_python_error_log.md

Usage:  python ms-analysis/scripts/diagnose_pilot_errors.py
"""
import ast
import os
import subprocess
import sys
import tempfile

import pandas as pd

HERE = os.path.dirname(os.path.abspath(__file__))
MS = os.path.dirname(HERE)
sys.path.insert(0, HERE)
from measure_python import strip_self_imports  # noqa: E402 - dùng đúng logic harness

PY = sys.executable
OUT = os.path.join(MS, "results", "pilot_python_error_log.md")


def run(cmd, cwd, timeout=60):
    try:
        r = subprocess.run(cmd, cwd=cwd, capture_output=True, text=True,
                           encoding="utf-8", errors="replace", timeout=timeout)
        return r.returncode, (r.stdout or "") + (r.stderr or "")
    except subprocess.TimeoutExpired:
        return -1, f"TIMEOUT sau {timeout}s"


def tail(text, n=8):
    lines = [l for l in text.strip().splitlines() if l.strip()]
    return "\n".join(lines[-n:])


def defines_own_logic(test_code: str, func_name: str) -> bool:
    """Test có tự định nghĩa hàm trùng tên / method trùng tên trong class Mock không?"""
    try:
        tree = ast.parse(test_code)
    except SyntaxError:
        return False
    for node in ast.walk(tree):
        if isinstance(node, (ast.FunctionDef, ast.AsyncFunctionDef)):
            if node.name == func_name and not node.name.startswith("test_"):
                return True
    return False


def diagnose(fid, code, func_name, test_code):
    rec = {"id": fid, "name": func_name, "phase": None, "err": "", "detail": [],
           "mock": defines_own_logic(test_code, func_name)}

    # P1 — parse solution
    try:
        ast.parse(code)
        rec["detail"].append("P1 parse solution.py: OK")
    except SyntaxError as e:
        rec["phase"] = "P1-SOLUTION-SYNTAX"
        rec["err"] = f"{type(e).__name__}: {e.msg} (dòng {e.lineno}: `{(e.text or '').strip()[:60]}`)"
        rec["detail"].append(f"P1 parse solution.py: **{rec['err']}**")
        return rec  # các bước sau chắc chắn fail

    with tempfile.TemporaryDirectory() as wd:
        open(os.path.join(wd, "solution.py"), "w", encoding="utf-8").write(code)
        test = "from solution import *\n" + strip_self_imports(test_code, func_name)
        open(os.path.join(wd, "test_gen.py"), "w", encoding="utf-8").write(test)

        # P2 — import solution
        rc, out = run([PY, "-c", "import solution"], wd, 30)
        if rc != 0:
            rec["phase"] = "P2-SOLUTION-IMPORT"
            rec["err"] = tail(out, 2)
            rec["detail"].append(f"P2 import solution: rc={rc}\n```\n{tail(out)}\n```")
            return rec
        rec["detail"].append("P2 import solution: OK")

        # P3 — pytest collect (bước 'compiled' của harness)
        rc, out = run([PY, "-m", "pytest", "--collect-only", "-q", "test_gen.py"], wd, 60)
        if rc not in (0, 5):
            rec["phase"] = "P3-COLLECT"
            rec["err"] = tail(out, 2)
            rec["detail"].append(f"P3 pytest --collect-only: rc={rc}\n```\n{tail(out)}\n```")
            return rec
        rec["detail"].append(f"P3 pytest --collect-only: OK (rc={rc})")

        # P4 — chạy test trên bản gốc (green-check)
        rc, out = run([PY, "-m", "pytest", "-q", "test_gen.py"], wd, 90)
        if rc != 0:
            rec["phase"] = "P4-RED-ON-ORIGINAL"
            rec["err"] = tail(out, 2)
            rec["detail"].append(f"P4 pytest trên bản gốc: rc={rc} — test FAIL trên chính code gốc "
                                 f"⇒ mutation score sẽ là số ảo\n```\n{tail(out, 12)}\n```")
            return rec
        rec["detail"].append(f"P4 pytest trên bản gốc: PASS\n```\n{tail(out, 4)}\n```")

    rec["phase"] = "OK"
    return rec


def main() -> int:
    fdf = pd.read_csv(os.path.join(MS, "data", "pilot_functions.csv"))
    tdf = pd.read_csv(os.path.join(MS, "data", "pilot_llm_output.csv"))
    tmap = {str(r["function_id"]): str(r["generated_test"]) for _, r in tdf.iterrows()}

    recs = []
    for _, f in fdf.iterrows():
        if str(f["language"]).lower() != "python":
            continue
        fid = str(f["function_id"])
        print(f"dang chan doan {fid} ...")
        recs.append(diagnose(fid, str(f["code"]), str(f["function_name"]), tmap.get(fid, "")))

    lines = ["# Pilot Python — Error log chi tiết theo từng hàm",
             "",
             f"Sinh bởi `scripts/diagnose_pilot_errors.py` — chạy lại đúng pipeline của "
             f"`measure_python.py` cho {len(recs)} hàm Python trong pilot.",
             "",
             "| Hàm | Giai đoạn fail | Test tự re-implement? | Lỗi (tóm tắt) |",
             "|---|---|---|---|"]
    for r in recs:
        err_short = r["err"].splitlines()[-1][:90] if r["err"] else "—"
        mock = "⚠️ CÓ" if r["mock"] else "không"
        lines.append(f"| {r['id']} | {r['phase']} | {mock} | `{err_short}` |")

    lines += ["", "**Chú giải giai đoạn:** P1 = solution.py lỗi cú pháp (data không standalone) · "
              "P2 = solution.py không import được · P3 = pytest không collect được test "
              "(harness đặt compiled=0 tại đây) · P4 = test FAIL trên bản gốc "
              "(green-check — harness hiện bỏ qua nên mutation 100% là số ảo) · "
              "OK = đo được hợp lệ.", "", "---", ""]

    for r in recs:
        lines.append(f"## {r['id']} — `{r['name']}` → **{r['phase']}**")
        if r["mock"]:
            lines.append("> ⚠️ Generated test **tự định nghĩa lại hàm cùng tên** thay vì gọi "
                         "hàm từ `solution` — dù chạy được, coverage hàm gốc vẫn = 0.")
        lines.extend(r["detail"])
        lines.append("")

    os.makedirs(os.path.dirname(OUT), exist_ok=True)
    open(OUT, "w", encoding="utf-8").write("\n".join(lines))
    print(f"\nda ghi {len(recs)} muc -> {os.path.relpath(OUT, MS)}")
    return 0


if __name__ == "__main__":
    sys.exit(main())

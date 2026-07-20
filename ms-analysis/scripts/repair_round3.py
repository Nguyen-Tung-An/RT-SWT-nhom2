"""Vong sua loi 3: loi that + BANG CHUNG DO DUOC (repair_evidence) cho 12 file con chet.

Khac vong 2 o dung mot diem: prompt duoc bo sung khoi bang chung sinh boi
repair_evidence.build() — noi ro ten symbol nam o module nao, lop truu tuong thay
bang lop nao, va doi tuong dich thuc chat la kieu gi trong runtime. Vong 2 chi dua
thong bao loi (biet HONG), vong 3 dua ca cau tra loi (biet SUA O DAU).

Chay:
  python ms-analysis/scripts/repair_round3.py --rounds 2
"""
from __future__ import annotations

import argparse
import csv
import os
import re
import shutil
import subprocess
import sys
import tempfile

REPO = os.path.dirname(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))
sys.path.insert(0, os.path.join(REPO, "ms-analysis", "scripts"))
sys.path.insert(0, os.path.join(REPO, "scripts"))
sys.path.insert(0, os.path.join(REPO, "data", "raw", "flask", "src"))
sys.path.insert(0, os.path.join(REPO, "data", "raw", "requests", "src"))
PY = sys.executable

MODEL = "gpt-4o-mini-2024-07-18"
CONFTEST = os.path.join(REPO, "data", "raw", "flask", "tests", "conftest.py")
DEAD = ["PY-001", "PY-008", "PY-009", "PY-011", "PY-014", "PY-015",
        "PY-032", "PY-036", "PY-040", "PY-043", "PY-044", "PY-058"]


def run_test(path: str) -> tuple[int, str, int, int]:
    with tempfile.TemporaryDirectory() as wd:
        shutil.copy(path, os.path.join(wd, os.path.basename(path)))
        if os.path.exists(CONFTEST):
            shutil.copy(CONFTEST, os.path.join(wd, "conftest.py"))
        try:
            r = subprocess.run([PY, "-m", "pytest", "-q", "-p", "no:cacheprovider",
                                os.path.basename(path)], cwd=wd, capture_output=True,
                               text=True, encoding="utf-8", errors="replace", timeout=180)
        except subprocess.TimeoutExpired:
            return 1, "TIMEOUT sau 180s", 0, 0
        out = (r.stdout or "") + (r.stderr or "")
        npass = int(m.group(1)) if (m := re.search(r"(\d+) passed", out)) else 0
        nfail = int(m.group(1)) if (m := re.search(r"(\d+) failed", out)) else 0
        nerr = len(re.findall(r"^ERROR ", out, re.M))
        return r.returncode, out, npass, nfail + nerr


def build_prompt(rec: dict, code: str, err: str) -> str:
    import prompt_v3
    import repair_evidence
    tail = "\n".join(l for l in err.splitlines() if l.strip())[-2500:]
    evidence = repair_evidence.build(err, rec)
    return (
        "The pytest file below was generated for the target described after it, but it "
        "FAILS when executed. Fix it.\n\n"
        "### Current test file ###\n"
        f"```python\n{code}\n```\n\n"
        "### Actual pytest output ###\n"
        f"```\n{tail}\n```\n"
        f"{evidence}\n"
        "A pytest conftest.py from the project is available in the same directory. It "
        "provides these fixtures you may request as test arguments:\n"
        "  app       - a configured Flask application\n"
        "  app_ctx   - an ACTIVE application context\n"
        "  req_ctx   - an ACTIVE request context (use when the code needs `request`)\n"
        "  client    - a test client (already usable; do NOT wrap it in `with client:` "
        "if it is already active - that raises 'Cannot nest client invocations')\n\n"
        "### Target being tested ###\n"
        f"{prompt_v3.target_spec(rec)}\n\n"
        "### Source of the target ###\n"
        f"```python\n{prompt_v3.load_source(rec)}\n```\n\n"
        "### Instructions ###\n"
        "1. The error output and the measured-evidence block above are REAL. Trust them "
        "over your assumptions about how the code behaves.\n"
        "2. The evidence block was produced by inspecting the actual installed packages. "
        "If it says a name lives in a specific module, import it from there.\n"
        "3. Names that appear in the target's source as local aliases "
        "(`from X import Y as Z`) are NOT importable public names. Import the public "
        "name instead.\n"
        "4. If an assertion failed, the output shows the ACTUAL value. Change the "
        "expectation to match reality - do not weaken the assertion to something "
        "trivially true (e.g. `assert True`), and do not delete the test.\n"
        "5. The test must actually CALL the target function. Do not assert on a mock you "
        "created yourself - that passes without testing anything.\n"
        "6. Output the COMPLETE corrected file, executable code only, no explanation.\n"
    )


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("--rounds", type=int, default=2)
    ap.add_argument("--limit", type=int, default=0)
    a = ap.parse_args()

    from openai import OpenAI
    from run_experiment import clean_code_block
    cli = OpenAI(api_key=os.environ["OPENAI_API_KEY"])

    gt = {r["func_id"]: r for r in csv.DictReader(
        open(os.path.join(REPO, "data", "full_ground_truth_v3.csv"), encoding="utf-8-sig"))}

    out_dir = os.path.join(REPO, "generated_tests", "gpt4o_v3r3e", "python")
    os.makedirs(out_dir, exist_ok=True)

    targets = DEAD[:a.limit] if a.limit else DEAD
    results, cost = [], 0.0
    for i, fid in enumerate(targets, 1):
        stem = f"test_{fid.replace('-', '_').lower()}.py"
        # bat dau tu ban TOT NHAT hien co
        src = os.path.join(REPO, "generated_tests", "gpt4o_v3r2c", "python", stem)
        if not os.path.exists(src):
            src = os.path.join(REPO, "generated_tests", "gpt4o_v3", "python", stem)
        code = open(src, encoding="utf-8", errors="replace").read()
        rc, err, p0, _ = run_test(src)
        # Xep hang tien do theo THU TU TU DIEN: (so test pass, co collect duoc).
        # Chi so sanh theo so pass thi mot ban da sua duoc ImportError (tu "chet luc
        # collect" thanh "collect duoc, fail assert") van bi coi la ngang ban cu va
        # bi vut di — artifact luu lai se lam nguoi doc tuong model khong sua gi ca.
        best = (p0, "error during collection" not in err)
        best_code = code

        for _ in range(a.rounds):
            if rc == 0:
                break
            try:
                resp = cli.chat.completions.create(
                    model=MODEL, temperature=0.0, top_p=1.0, max_tokens=2560,
                    messages=[{"role": "user", "content": build_prompt(gt[fid], code, err)}])
            except Exception as e:  # noqa: BLE001
                print(f"  {fid}: LOI API {e}")
                break
            cost += (resp.usage.prompt_tokens * 0.150
                     + resp.usage.completion_tokens * 0.600) / 1e6
            code = clean_code_block(resp.choices[0].message.content, "python")
            dst = os.path.join(out_dir, stem)
            open(dst, "w", encoding="utf-8").write(code)
            rc, err, p1, _ = run_test(dst)
            score = (p1, "error during collection" not in err)
            if score > best:
                best, best_code = score, code

        best_pass = best[0]
        open(os.path.join(out_dir, stem), "w", encoding="utf-8").write(best_code)
        mark = "CUU DUOC" if p0 == 0 and best_pass > 0 else ("van chet" if best_pass == 0 else "")
        print(f"  [{i:2d}/{len(targets)}] {fid}  pass {p0} -> {best_pass}  {mark}", flush=True)
        results.append({"func_id": fid, "pass_before": p0, "pass_after": best_pass,
                        "rescued": int(p0 == 0 and best_pass > 0)})

    outp = os.path.join(REPO, "ms-analysis", "results", "repair_v3r3e.csv")
    with open(outp, "w", encoding="utf-8", newline="") as fh:
        w = csv.DictWriter(fh, fieldnames=["func_id", "pass_before", "pass_after", "rescued"])
        w.writeheader()
        w.writerows(results)
    resc = sum(r["rescued"] for r in results)
    print(f"\n{len(results)} file chet -> CUU DUOC {resc}  (chi phi ${cost:.4f})")
    print(f"-> {outp}")
    return 0


if __name__ == "__main__":
    sys.exit(main())

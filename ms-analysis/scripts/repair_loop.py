"""Vong SUA LOI co phan hoi: dua LOI THAT nguoc lai cho model thay vi doan truoc.

Vi sao huong nay khac han v2/v3:
  v2, v3 deu la 'doan truoc' — nhet them thong tin vao prompt roi hy vong model dung dung.
  Cach do da cham tran: v1->v2 +13 file co test pass, v2->v3 +6, va phan con lai la
  'model khong biet hanh vi that' chu khong phai 'prompt thieu thong tin'.
  Vong sua loi thi KHONG doan: no chay test, bat exception THAT, roi dua chinh thong bao
  loi do nguoc lai. Model khong con phai suy dien hanh vi runtime — no duoc NHIN THAY.

Day cung la ly do huong nay co the cham vao nhom 'assert-sai' (22 ca) ma prompt khong
cham duoc: thong bao loi cua pytest chua ca gia tri THUC TE lan gia tri KY VONG.

Ngoai ra co the kem conftest.py that cua du an (--with-conftest). flask/tests/conftest.py
dinh nghia san fixture app / app_ctx / req_ctx / client; rieng req_ctx la
    with app.test_request_context() as ctx: yield ctx
tuc dung thu ma 6 ca 'There is no request in this context' dang thieu. Goi y chung chung
trong prompt v3 da that bai o nhom nay, nen thu dua ha tang test THAT cua du an vao.
LUU Y THIET KE: bat conftest lam DOI thiet lap thi nghiem (test khong con chay trong thu
muc tran). Phai bao cao nhu mot nhanh rieng, khong tron vao ket qua v3.

Chay:
  python ms-analysis/scripts/repair_loop.py --version v3 --dead-only --rounds 1
  python ms-analysis/scripts/repair_loop.py --version v3 --dead-only --with-conftest
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
PY = sys.executable

MODEL = "gpt-4o-mini-2024-07-18"
CONFTEST = os.path.join(REPO, "data", "raw", "flask", "tests", "conftest.py")


def run_test(path: str, with_conftest: bool) -> tuple[int, str, int, int]:
    """-> (rc, output, n_pass, n_fail). Chay trong thu muc tam nhu harness that."""
    with tempfile.TemporaryDirectory() as wd:
        shutil.copy(path, os.path.join(wd, os.path.basename(path)))
        if with_conftest and os.path.exists(CONFTEST):
            shutil.copy(CONFTEST, os.path.join(wd, "conftest.py"))
        try:
            r = subprocess.run([PY, "-m", "pytest", "-q", "-p", "no:cacheprovider",
                                os.path.basename(path)], cwd=wd, capture_output=True,
                               text=True, encoding="utf-8", errors="replace", timeout=120)
        except subprocess.TimeoutExpired:
            return 1, "TIMEOUT sau 120s", 0, 0
        out = (r.stdout or "") + (r.stderr or "")
        npass = int(m.group(1)) if (m := re.search(r"(\d+) passed", out)) else 0
        nfail = int(m.group(1)) if (m := re.search(r"(\d+) failed", out)) else 0
        nerr = len(re.findall(r"^ERROR ", out, re.M))
        return r.returncode, out, npass, nfail + nerr


def repair_prompt(rec: dict, code: str, err: str, with_conftest: bool) -> str:
    import prompt_v3
    tail = "\n".join(l for l in err.splitlines() if l.strip())[-2500:]
    extra = ""
    if with_conftest:
        extra = ("\nA pytest conftest.py from the project is available in the same "
                 "directory. It provides these fixtures you may request as test "
                 "arguments:\n"
                 "  app       - a configured Flask application\n"
                 "  app_ctx   - an ACTIVE application context\n"
                 "  req_ctx   - an ACTIVE request context (use this when the code under "
                 "test needs `request`)\n"
                 "  client    - a test client\n"
                 "Prefer these fixtures over building contexts by hand.\n")
    return (
        "The pytest file below was generated for the target described after it, but it "
        "FAILS when executed. Fix it.\n\n"
        "### Current test file ###\n"
        f"```python\n{code}\n```\n\n"
        "### Actual pytest output ###\n"
        f"```\n{tail}\n```\n"
        f"{extra}\n"
        "### Target being tested ###\n"
        f"{prompt_v3.target_spec(rec)}\n\n"
        "### Source of the target ###\n"
        f"```python\n{prompt_v3.load_source(rec)}\n```\n\n"
        "### Instructions ###\n"
        "1. The error output above is REAL - it is what actually happened. Trust it over "
        "your assumptions about how the code behaves.\n"
        "2. If an assertion failed, the output shows the ACTUAL value. Change the "
        "expectation to match reality - do not weaken the assertion to something trivially "
        "true, and do not delete the test.\n"
        "3. If an import failed, the name is in the wrong module. Either import it from the "
        "correct place or trigger the condition through the public API.\n"
        "4. Keep every test that already passes unchanged.\n"
        "5. Output the COMPLETE corrected file, executable code only, no explanation.\n"
    )


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("--version", default="v3")
    ap.add_argument("--rounds", type=int, default=1)
    ap.add_argument("--dead-only", action="store_true", help="chi sua file 0 test pass")
    ap.add_argument("--with-conftest", action="store_true")
    ap.add_argument("--limit", type=int, default=0)
    a = ap.parse_args()

    from openai import OpenAI
    from run_experiment import clean_code_block
    cli = OpenAI(api_key=os.environ["OPENAI_API_KEY"])

    gt = {r["func_id"]: r for r in csv.DictReader(
        open(os.path.join(REPO, "data", "full_ground_truth_v3.csv"), encoding="utf-8-sig"))}
    prev = {r["func_id"]: r for r in csv.DictReader(
        open(os.path.join(REPO, "ms-analysis", "results", f"why_fail_{a.version}.csv"),
             encoding="utf-8-sig"))}

    src_dir = os.path.join(REPO, "generated_tests",
                           {"v1": "gpt4o", "v2": "gpt4o_v2", "v3": "gpt4o_v3"}[a.version],
                           "python")
    tag = f"{a.version}r{a.rounds}" + ("c" if a.with_conftest else "")
    out_dir = os.path.join(REPO, "generated_tests", f"gpt4o_{tag}", "python")
    os.makedirs(out_dir, exist_ok=True)

    targets = [f for f, r in sorted(prev.items())
               if not a.dead_only or int(r["n_pass"] or 0) == 0]
    if a.limit:
        targets = targets[:a.limit]

    results, cost = [], 0.0
    for i, fid in enumerate(targets, 1):
        src = os.path.join(src_dir, f"test_{fid.replace('-', '_').lower()}.py")
        if not os.path.exists(src):
            continue
        code = open(src, encoding="utf-8", errors="replace").read()
        rc, err, p0, f0 = run_test(src, a.with_conftest)
        before = p0
        # GIU BAN TOT NHAT qua cac vong. Khong co cai nay thi vong sau co the pha vong
        # truoc: PY-003 dat 3 test pass sau vong 1 roi ve 0 sau vong 2. Sua loi khong
        # don dieu tang, nen phai chot lai moc tot nhat thay vi lay ban cuoi cung.
        best_pass, best_code = p0, code

        for _ in range(a.rounds):
            if rc == 0:
                break
            try:
                resp = cli.chat.completions.create(
                    model=MODEL, temperature=0.0, top_p=1.0, max_tokens=2560,
                    messages=[{"role": "user",
                               "content": repair_prompt(gt[fid], code, err, a.with_conftest)}])
            except Exception as e:  # noqa: BLE001
                print(f"  {fid}: LOI API {e}")
                break
            cost += (resp.usage.prompt_tokens * 0.150
                     + resp.usage.completion_tokens * 0.600) / 1e6
            code = clean_code_block(resp.choices[0].message.content, "python")
            dst = os.path.join(out_dir, os.path.basename(src))
            open(dst, "w", encoding="utf-8").write(code)
            rc, err, p1, f1 = run_test(dst, a.with_conftest)
            if p1 > best_pass:
                best_pass, best_code = p1, code

        # ghi lai ban TOT NHAT, khong phai ban cuoi
        dst = os.path.join(out_dir, os.path.basename(src))
        open(dst, "w", encoding="utf-8").write(best_code)
        after = best_pass
        mark = "CUU DUOC" if before == 0 and after > 0 else ("van chet" if after == 0 else "")
        print(f"  [{i:2d}/{len(targets)}] {fid}  pass {before} -> {after}  {mark}")
        results.append({"func_id": fid, "pass_before": before, "pass_after": after,
                        "rescued": int(before == 0 and after > 0)})

    outp = os.path.join(REPO, "ms-analysis", "results", f"repair_{tag}.csv")
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

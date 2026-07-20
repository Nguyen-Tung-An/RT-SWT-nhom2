"""Vong SUA LOI co phan hoi cho JAVA — dua TOAN VAN thong bao javac nguoc lai cho model.

Vi sao huong nay khac han v2/v3/v4:
  v2..v4 deu la 'doan truoc' — nhet them thong tin vao prompt (khoang dong, import,
  cong thuc truy cap private) roi hy vong model dung dung. Duong do da di duoc mot doan
  (17/60 -> 25/60) nhung 35 ca con lai van hong.
  Vong sua loi thi KHONG doan: no goi javac, bat TOAN VAN thong bao loi — von CHI THANG
  ra ten symbol, dong, cot, va cac overload ung vien — roi dua chinh thong bao do nguoc
  lai. Model khong con phai suy dien API cua thu vien; no duoc NHIN THAY.

Ban Python cua y tuong nay (repair_loop.py) cuu duoc 7/20 file chet voi $0.02.

BAI HOC BAT BUOC MANG SANG: PHAI GIU BAN TOT NHAT QUA CAC VONG.
  O ban Python, lay ban CUOI CUNG khien PY-003 dat 3 test pass sau vong 1 roi ve 0 sau
  vong 2. Sua loi khong don dieu tang. O day diem so la cap
      (bien dich duoc, -so_loi_javac)
  nen mot vong lam giam so loi van duoc ghi nhan, con mot vong lam hong them thi bi bo.
  Vong lap dung ngay khi bien dich duoc — khong co gi de cai them theo tieu chi nay.

Do lai bang CHINH check_java_compile.py (khong sua file do) de con so so sanh duoc voi
v1/v4: script nay hop nhat 25 file da dat + 35 ban sua tot nhat vao mot thu muc rieng,
roi goi check_java_compile.py tren thu muc do.

Chay:
  python ms-analysis/scripts/repair_java.py --rounds 2
  python ms-analysis/scripts/repair_java.py --rounds 2 --limit 3   # thu truoc cho re
"""
from __future__ import annotations

import argparse
import collections
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

import check_java_compile as cjc  # noqa: E402
import prompt_v4  # noqa: E402

MODEL = "gpt-4o-mini-2024-07-18"
GT_V3 = os.path.join(REPO, "data", "full_ground_truth_v3.csv")
GT_BASE = os.path.join(REPO, "data", "full_ground_truth.csv")
V4_CSV = os.path.join(REPO, "ms-analysis", "results", "java_compile_v4.csv")
SRC_DIR = os.path.join(REPO, "generated_tests", "gpt4o_v4", "java")


# --------------------------------------------------------------------------- compile
_CP_CACHE: dict[str, str | None] = {}


def classpath_for(rec: dict) -> str | None:
    """Classpath giong het check_java_compile: target/classes cua module + deps."""
    rd = cjc.module_dir(rec)
    if rd in _CP_CACHE:
        return _CP_CACHE[rd]
    classes = os.path.join(rd, "target", "classes")
    cp = None
    if os.path.isdir(classes):
        deps = cjc.build_classpath(rd)
        if deps:
            cp = classes + os.pathsep + deps
    _CP_CACHE[rd] = cp
    return cp


def compile_test(code: str, fid: str, cp: str) -> tuple[bool, str]:
    """Bien dich mot file test trong package that. -> (ok, toan van output javac).

    Sao lai dung quy trinh cua check_java_compile (doi ten lop cho duy nhat, dat vao
    thu muc theo package) de ket qua o day va ket qua do cuoi cung khong lech nhau.
    """
    code = code.lstrip("﻿")
    pm = re.search(r"^\s*package\s+([\w.]+)\s*;", code, re.M)
    pkg = pm.group(1) if pm else ""
    cm = re.search(r"\bclass\s+(\w+)", code)
    orig = cm.group(1) if cm else fid.replace("-", "_") + "_Test"
    uniq = f"{orig}_{fid.replace('-', '_')}"
    code = re.sub(rf"\bclass\s+{re.escape(orig)}\b", f"class {uniq}", code, count=1)

    with tempfile.TemporaryDirectory() as wd:
        d = os.path.join(wd, *pkg.split(".")) if pkg else wd
        os.makedirs(d, exist_ok=True)
        p = os.path.join(d, uniq + ".java")
        open(p, "w", encoding="utf-8", newline="\n").write(code)
        try:
            r = subprocess.run(["javac", "-nowarn", "-cp", cp,
                                "-d", os.path.join(wd, "out"), p],
                               capture_output=True, text=True, encoding="utf-8",
                               errors="replace", timeout=180)
        except subprocess.TimeoutExpired:
            return False, "TIMEOUT: javac qua 180s"
    out = (r.stdout or "") + (r.stderr or "")
    # Bo duong dan thu muc tam khoi thong bao — no vo nghia voi model va ton token.
    out = re.sub(r"^[A-Za-z]:[\\/][^\s:]*[\\/](\w+\.java)", r"\1", out, flags=re.M)
    return r.returncode == 0, out


def n_errors(out: str) -> int:
    m = re.search(r"^(\d+) errors?$", out, re.M)
    if m:
        return int(m.group(1))
    return len(re.findall(r"^\S*\.java:\d+: error:", out, re.M)) or (0 if not out else 1)


def score(ok: bool, out: str) -> tuple[int, int]:
    """Diem so de chon ban tot nhat: bien dich duoc truoc, roi it loi hon."""
    return (1 if ok else 0, -n_errors(out) if not ok else 0)


# --------------------------------------------------------------------------- prompt
def repair_prompt(rec: dict, code: str, err: str) -> str:
    tail = "\n".join(l for l in err.splitlines() if l.strip())[-3500:]
    return (
        "The JUnit 5 test file below was generated for the target described after it, but "
        "it DOES NOT COMPILE. Fix it so that javac accepts it.\n\n"
        "### Current test file ###\n"
        f"```java\n{code}\n```\n\n"
        "### Actual javac output ###\n"
        f"```\n{tail}\n```\n\n"
        "### Target being tested ###\n"
        f"{prompt_v4.target_spec(rec)}\n\n"
        "### Source of the target ###\n"
        f"```java\n{prompt_v4.load_source(rec)}\n```\n\n"
        "### Instructions ###\n"
        "1. The javac output above is REAL - it is what actually happened when this exact "
        "file was compiled against this exact version of the project. Trust it over your "
        "assumptions about the library's API.\n"
        "2. 'cannot find symbol' means that name does not exist in THIS version. Do not "
        "invent a replacement name - use only members you can see in the target source "
        "above, or reach the behaviour through a different member that does exist.\n"
        "3. If a call is ambiguous, javac lists the candidate overloads. Disambiguate by "
        "casting the argument to the exact declared parameter type of the overload you want.\n"
        "4. If a constructor does not apply, javac prints the required signature. Use it.\n"
        "5. If a member has private access, use reflection (getDeclaredMethod / "
        "getDeclaredField + setAccessible(true)); do not delete the test.\n"
        "6. If a class is abstract, instantiate a concrete subclass or use its factory "
        "method instead of `new`.\n"
        "7. Keep the same package declaration and keep testing the SAME target method. Do "
        "not stub, mock or re-implement the target, and do not replace the tests with "
        "trivially-true assertions.\n"
        "8. Import every type with its fully-qualified package.\n"
        "9. Output the COMPLETE corrected file, executable Java only, no explanation.\n"
    )


# --------------------------------------------------------------------------- main
def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("--rounds", type=int, default=2)
    ap.add_argument("--limit", type=int, default=0)
    ap.add_argument("--tag", default="v4rep")
    ap.add_argument("--no-measure", action="store_true",
                    help="bo qua buoc goi check_java_compile.py cuoi cung")
    a = ap.parse_args()

    from openai import OpenAI
    from run_experiment import clean_code_block
    cli = OpenAI(api_key=os.environ["OPENAI_API_KEY"])

    gt3 = {r["func_id"]: r for r in csv.DictReader(open(GT_V3, encoding="utf-8-sig"))}
    gtb = {r["func_id"]: r for r in csv.DictReader(open(GT_BASE, encoding="utf-8-sig"))}
    prev = list(csv.DictReader(open(V4_CSV, encoding="utf-8-sig")))

    out_dir = os.path.join(REPO, "generated_tests", f"gpt4o_{a.tag}", "java")
    os.makedirs(out_dir, exist_ok=True)
    # Thu muc do phai chua CA 60 file: 25 ban da dat giu nguyen + 35 ban duoc sua.
    for r in prev:
        s = os.path.join(SRC_DIR, r["func_id"] + "_Test.java")
        if os.path.exists(s):
            shutil.copy(s, os.path.join(out_dir, os.path.basename(s)))

    targets = [r for r in prev if str(r["compiles"]) != "1"]
    if a.limit:
        targets = targets[:a.limit]
    print(f"{len(targets)} ca khong bien dich duoc trong v4 -> sua, toi da {a.rounds} vong\n")

    results, cost = [], 0.0
    for i, row in enumerate(targets, 1):
        fid = row["func_id"]
        rec = gt3.get(fid) or gtb.get(fid)
        src = os.path.join(SRC_DIR, fid + "_Test.java")
        if rec is None or not os.path.exists(src):
            print(f"  [{i:2d}/{len(targets)}] {fid}  BO QUA (thieu metadata hoac file test)")
            continue
        cp = classpath_for(gtb.get(fid) or rec)
        if not cp:
            print(f"  [{i:2d}/{len(targets)}] {fid}  BO QUA (khong lay duoc classpath)")
            continue

        code = open(src, encoding="utf-8", errors="replace").read()
        ok, err = compile_test(code, fid, cp)
        e0 = n_errors(err)
        best_ok, best_sc, best_code, best_err = ok, score(ok, err), code, err
        rounds_used = 0

        for _ in range(a.rounds):
            if best_ok:
                break  # da dat tieu chi — khong co gi de cai them
            rounds_used += 1
            try:
                resp = cli.chat.completions.create(
                    model=MODEL, temperature=0.0, top_p=1.0, max_tokens=3072,
                    messages=[{"role": "user",
                               "content": repair_prompt(rec, code, err)}])
            except Exception as e:  # noqa: BLE001
                print(f"  {fid}: LOI API {e}")
                break
            cost += (resp.usage.prompt_tokens * 0.150
                     + resp.usage.completion_tokens * 0.600) / 1e6
            code = clean_code_block(resp.choices[0].message.content or "", "java")
            if not code.strip():
                break
            ok, err = compile_test(code, fid, cp)
            sc = score(ok, err)
            # GIU BAN TOT NHAT — khong lay ban cuoi cung (bai hoc PY-003 ban Python).
            if sc > best_sc:
                best_ok, best_sc, best_code, best_err = ok, sc, code, err

        open(os.path.join(out_dir, fid + "_Test.java"), "w",
             encoding="utf-8", newline="\n").write(best_code)

        et_after = "" if best_ok else cjc.classify(best_err)[0]
        mark = "CUU DUOC" if best_ok else "van hong"
        print(f"  [{i:2d}/{len(targets)}] {fid}  loi {e0} -> "
              f"{0 if best_ok else n_errors(best_err)}  {mark}"
              f"{'' if best_ok else '  ' + et_after}")
        results.append({
            "func_id": fid,
            "visibility": (rec.get("visibility") or "").strip(),
            "repo": row.get("repo", ""),
            "err_type_before": row.get("error_type", ""),
            "n_err_before": e0,
            "compiles_after": int(best_ok),
            "n_err_after": 0 if best_ok else n_errors(best_err),
            "err_type_after": et_after,
            "rounds_used": rounds_used,
            "rescued": int(best_ok),
        })

    outp = os.path.join(REPO, "ms-analysis", "results", f"repair_java_{a.tag}.csv")
    with open(outp, "w", encoding="utf-8", newline="") as fh:
        w = csv.DictWriter(fh, fieldnames=list(results[0].keys()) if results else ["func_id"])
        w.writeheader()
        w.writerows(results)

    resc = sum(r["rescued"] for r in results)
    print(f"\n{len(results)} ca hong -> CUU DUOC {resc}   (chi phi ${cost:.4f})")
    print(f"-> {outp}")

    # Phan tang theo visibility (chi tren cac ca da sua)
    tier: dict[str, list[int]] = collections.defaultdict(list)
    for r in results:
        tier[r["visibility"] or "?"].append(r["rescued"])
    print("\nCuu duoc theo visibility (tren cac ca hong cua v4):")
    for k in ("public", "protected", "package-private", "private", "?"):
        if k in tier:
            v = tier[k]
            print(f"   {k:16s} {sum(v)}/{len(v)}")

    if not a.no_measure:
        print("\n=== Do lai bang check_java_compile.py tren thu muc hop nhat ===")
        env = dict(os.environ)
        env["JAVA_TEST_DIR"] = os.path.join("generated_tests", f"gpt4o_{a.tag}", "java")
        env["JAVA_OUT"] = f"java_compile_{a.tag}.csv"
        subprocess.run([sys.executable,
                        os.path.join(REPO, "ms-analysis", "scripts", "check_java_compile.py")],
                       cwd=REPO, env=env)
    return 0


if __name__ == "__main__":
    sys.exit(main())

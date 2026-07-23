"""Do baseline (EvoSuite / Randoop / Pynguin) bang CUNG bo 4 tang nhu GPT.

Van de phai giai: baseline sinh theo LOP (Java) hoac MODULE (Python), con harness do lai
lam viec theo TUNG HAM. Ngoai ra moi cong cu co hinh dang output khac nhau:
    EvoSuite : <Class>_ESTest.java + <Class>_ESTest_scaffolding.java   (BAT BUOC ca hai —
               ESTest 'extends' scaffolding, bien dich thieu la hong)
    Randoop  : <Class>RegressionTest.java + ...Test0.java, Test1.java  (nhieu file)
    Pynguin  : test_<module>.py                                        (mot file/module)

Cach lam: gom TAT CA file cua lop/module lien quan, bien dich/chay chung, roi quy ket qua
ve tung ham bang khoang dong [start_line, end_line] — dung nguyen tac da dung cho GPT.
Dot bien cung chi trong khoang dong cua ham, tren BAN SAO ma nguon.

Chay:
  python ms-analysis/scripts/measure_baseline.py --tool randoop
  python ms-analysis/scripts/measure_baseline.py --tool evosuite --jdk tools/jdk11/bin/java.exe
  python ms-analysis/scripts/measure_baseline.py --tool pynguin --variant default
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

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import check_java_compile as C  # noqa: E402
import mutation_java as MJ  # noqa: E402

REPO = C.REPO
GT = os.environ.get("BL_GT", "data/clean_v3.csv")

JAVA_DIRS = {"evosuite": "generated_tests/clean_evosuite/java",
             "randoop": "generated_tests/clean_randoop/java"}
PY_DIRS = {"default": "generated_tests/clean_pynguin_default",
           "fixed": "generated_tests/clean_pynguin_fixed"}


def rows(lang: str) -> list[dict]:
    return [r for r in csv.DictReader(open(os.path.join(REPO, GT), encoding="utf-8-sig"))
            if r["language"] == lang]


def suite_files_java(tool: str, rec: dict) -> list[str]:
    """Moi file test cua LOP chua ham nay (ke ca scaffolding / cac phan Randoop)."""
    f = rec["file"].replace("\\", "/")
    i = f.find("src/main/java/")
    if i < 0:
        return []
    rel = f[i + len("src/main/java/"):]
    pkg_dir = os.path.dirname(rel)
    cls = os.path.basename(rel).replace(".java", "")
    d = os.path.join(REPO, JAVA_DIRS[tool], pkg_dir)
    if not os.path.isdir(d):
        return []
    out = []
    for fn in sorted(os.listdir(d)):
        if not fn.endswith(".java"):
            continue
        # khop dung lop: <Class>_ESTest*.java hoac <Class>RegressionTest*.java
        if re.match(rf"^{re.escape(cls)}(_ESTest|RegressionTest|Test)", fn):
            out.append(os.path.join(d, fn))
    return out


def measure_java(tool: str, jdk: str) -> list[dict]:
    jcp = MJ.junit_cp()
    JAVAC = (os.path.join(os.path.dirname(jdk), "javac.exe") if jdk != "java" else "javac")
    if not os.path.exists(JAVAC):
        JAVAC = "javac"
    runner_out = tempfile.mkdtemp(prefix="junit_runner_")
    r = MJ.run([jdk, "-version"])
    # JUnitRunner phai duoc bien dich bang CHINH JDK se chay no. Truoc day dung `javac`
    # mac dinh (JDK 17 -> class version 61) roi chay bang JDK 11 (chi doc toi 55) ->
    # LinkageError: UnsupportedClassVersionError. Runner khong nap duoc nen khong in
    # RESULT, va harness ghi nhan "0 test chay" — dung loai "0 gia tao" lan thu sau.
    subprocess.run([JAVAC, "-nowarn", "-cp", jcp, "-d", runner_out,
                    os.path.join(MJ.SCRIPTS, "JUnitRunner.java")],
                   capture_output=True, text=True)

    cp_cache: dict[str, str] = {}
    results = []
    recs = rows("java")
    for i, rec in enumerate(recs, 1):
        fid = rec["func_id"]
        files = suite_files_java(tool, rec)
        base = {"func_id": fid, "n_test": 0, "n_mutant": 0, "n_killed": 0,
                "mutation_score": "", "note": ""}
        if not files:
            base["note"] = "khong co suite cho lop nay"
            results.append(base)
            print(f"  [{i:2d}/{len(recs)}] {fid}  khong co suite")
            continue

        md = C.module_dir(rec)
        if md not in cp_cache:
            cp_cache[md] = C.build_classpath(md) or ""
        # EvoSuite chay tren bytecode JDK 11 (xem build_jdk11_classes.py); Randoop JDK 17
        classes = os.path.join(md, "target",
                               "classes-jdk11" if tool == "evosuite" else "classes")
        if not os.path.isdir(classes):
            classes = os.path.join(md, "target", "classes")
        # EvoSuite test dung @RunWith(EvoRunner.class) va org.evosuite.runtime.* ->
        # BAT BUOC co evosuite-standalone-runtime tren classpath. Thieu no thi suite bien
        # dich duoc nhung Launcher phat hien 0 test, im lang — dung loai "0 gia tao".
        extra = ""
        if tool == "evosuite":
            for b, _, fs in os.walk(os.path.expanduser("~/.m2/repository/org/evosuite")):
                for fn in fs:
                    if fn.startswith("evosuite-standalone-runtime") and fn.endswith(".jar")                             and "sources" not in fn:
                        extra = os.path.join(b, fn)
                        break
                if extra:
                    break
        base_cp = jcp + os.pathsep + classes + os.pathsep + cp_cache[md] + os.pathsep + runner_out
        if extra:
            base_cp += os.pathsep + extra

        with tempfile.TemporaryDirectory() as wd:
            src_d = os.path.join(wd, "src")
            os.makedirs(src_d, exist_ok=True)
            fqs = []
            for p in files:
                code = open(p, encoding="utf-8", errors="replace").read().lstrip("﻿")
                pm = re.search(r"^\s*package\s+([\w.]+)\s*;", code, re.M)
                pkg = pm.group(1) if pm else ""
                d = os.path.join(src_d, *pkg.split(".")) if pkg else src_d
                os.makedirs(d, exist_ok=True)
                open(os.path.join(d, os.path.basename(p)), "w",
                     encoding="utf-8", newline="\n").write(code)
                cls = os.path.basename(p).replace(".java", "")
                if "scaffolding" not in cls:
                    fqs.append(f"{pkg}.{cls}" if pkg else cls)

            tout = os.path.join(wd, "tc")
            srcs = [os.path.join(b, f) for b, _, fs in os.walk(src_d)
                    for f in fs if f.endswith(".java")]
            cc = subprocess.run([JAVAC, "-nowarn", "-cp", base_cp, "-d", tout, *srcs],
                                capture_output=True, text=True, encoding="utf-8",
                                errors="replace")
            if cc.returncode != 0:
                base["note"] = "suite khong bien dich duoc"
                results.append(base)
                print(f"  [{i:2d}/{len(recs)}] {fid}  khong bien dich")
                continue

            # green-check tren ban goc
            total = fails = 0
            for fq in fqs:
                rr = MJ.run([jdk, "-cp", tout + os.pathsep + base_cp, "JUnitRunner", fq],
                            timeout=240)
                m = re.search(r"RESULT (\d+) (\d+) (\d+)", (rr.stdout or "") if rr else "")
                if m:
                    total += int(m.group(1))
                    fails += int(m.group(3))
            base["n_test"] = total
            if total == 0:
                base["note"] = "khong co test nao chay"
                results.append(base)
                print(f"  [{i:2d}/{len(recs)}] {fid}  0 test chay")
                continue
            if fails:
                base["note"] = f"RED tren ban goc ({fails}/{total})"
                results.append(base)
                print(f"  [{i:2d}/{len(recs)}] {fid}  RED {fails}/{total}")
                continue

            # dot bien trong khoang dong cua HAM
            f = rec["file"].replace("\\", "/")
            j = f.find("raw/")
            mod_src = os.path.join(REPO, "data", "raw", f[j + 4:])
            srctxt = open(mod_src, encoding="utf-8", errors="replace").read()
            lo, hi = int(rec["start_line"]), int(rec["end_line"])
            muts = MJ.gen_mutants(srctxt, lo, hi)
            rel = f[j + 4:]
            k = rel.find("src/main/java/")
            rel_cls = rel[k + len("src/main/java/"):] if k >= 0 else os.path.basename(rel)

            nm = len(muts)
            nk = 0
            for mut in muts:
                mp = os.path.join(wd, "mut", rel_cls)
                os.makedirs(os.path.dirname(mp), exist_ok=True)
                open(mp, "w", encoding="utf-8", newline="\n").write(mut)
                mout = os.path.join(wd, "mc")
                shutil.rmtree(mout, ignore_errors=True)
                os.makedirs(mout, exist_ok=True)
                cm = subprocess.run([JAVAC, "-nowarn", "-cp", base_cp, "-d", mout, mp],
                                    capture_output=True, text=True)
                if cm.returncode != 0:
                    nm -= 1
                    continue
                killed = False
                for fq in fqs:
                    r2 = MJ.run([jdk, "-cp", mout + os.pathsep + tout + os.pathsep + base_cp,
                                 "JUnitRunner", fq], timeout=180)
                    if r2 is None or r2.returncode != 0:
                        killed = True
                        break
                nk += killed
            base["n_mutant"], base["n_killed"] = nm, nk
            base["mutation_score"] = round(nk / nm * 100, 2) if nm else ""
            results.append(base)
            print(f"  [{i:2d}/{len(recs)}] {fid}  test={total} ms={base['mutation_score']} "
                  f"({nk}/{nm})")
    return results


def measure_python(variant: str) -> list[dict]:
    import mutation_on_target as MT
    d = PY_DIRS[variant]
    recs = rows("python")
    results = []
    for i, rec in enumerate(recs, 1):
        fid = rec["func_id"]
        mod = rec.get("module_or_package", "")
        tp = os.path.join(REPO, d, "test_" + mod.replace(".", "_") + ".py")
        if not os.path.exists(tp):
            results.append({"func_id": fid, "branch_coverage": 0.0, "mutation_score": "",
                            "n_mutant": 0, "n_killed": 0, "note": "khong co suite cho module"})
            print(f"  [{i:2d}/{len(recs)}] {fid}  khong co suite ({mod})")
            continue
        try:
            r = MT.measure(rec, tp, with_conftest=True)
        except Exception as e:  # noqa: BLE001
            r = {"branch_coverage": 0.0, "mutation_score": "", "n_mutant": 0,
                 "n_killed": 0, "note": f"loi: {type(e).__name__}"}
        results.append({"func_id": fid, **r})
        print(f"  [{i:2d}/{len(recs)}] {fid}  bc={r['branch_coverage']} "
              f"ms={r['mutation_score']}  {r['note']}")
    return results


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("--tool", required=True, choices=["evosuite", "randoop", "pynguin"])
    ap.add_argument("--variant", default="default", choices=["default", "fixed"])
    ap.add_argument("--jdk", default="java")
    a = ap.parse_args()

    if a.tool == "pynguin":
        res = measure_python(a.variant)
        tag = f"pynguin_{a.variant}"
        cols = ["func_id", "branch_coverage", "mutation_score", "n_mutant", "n_killed", "note"]
    else:
        jdk = os.path.abspath(a.jdk) if a.jdk != "java" else "java"
        res = measure_java(a.tool, jdk)
        tag = a.tool
        cols = ["func_id", "n_test", "n_mutant", "n_killed", "mutation_score", "note"]

    out = os.path.join(REPO, "ms-analysis", "results", f"baseline_T4_{tag}.csv")
    with open(out, "w", encoding="utf-8", newline="") as fh:
        w = csv.DictWriter(fh, fieldnames=cols)
        w.writeheader()
        for r in res:
            w.writerow({c: r.get(c, "") for c in cols})

    pos = sum(1 for r in res if r.get("mutation_score") not in ("", None)
              and float(r["mutation_score"]) > 0)
    print(f"\n=== {tag} (n={len(res)}) ===")
    print(f"  GIET DUOC MUTANT (T4): {pos}/{len(res)} ({100 * pos / len(res):.1f}%)")
    print(f"-> {out}")
    return 0


if __name__ == "__main__":
    sys.exit(main())

"""Do MUTATION CHAM DICH cho Java — tang 4, tuong duong mutation_on_target.py ben Python.

Vi sao can. Moi con so Java da bao cao deu dung o 'bien dich duoc', va tang do vua duoc
chung minh la co the LACH: mot test reflection goi getDeclaredMethod("tenBia") van compile
rc=0 va chi hong luc chay. Nen 'bien dich duoc' khong the la ket luan.

Mutation cham dich khong lach duoc: mot mutant chi bi giet khi test THUC SU chay qua dung
doan ma bi doi VA phan biet duoc ket qua. No bao ham ca 'chay duoc', 'cham dich' va
'phat hien duoc loi'.

Cach lam (khong dung PIT de tranh dung lai ha tang cua chinh bai bao dang bi nghi ngo):
  1. bien dich file test -> thu muc rieng
  2. chay JUnit that bang JUnitRunner. Test phai XANH tren ban goc, neu khong thi loai
     (green-check, cung nguyen tac ben Python)
  3. sinh mutant TRONG KHOANG DONG [start_line, end_line] cua ham dich, tren BAN SAO ma
     nguon; bien dich lai DUNG file do vao thu muc override dat TRUOC target/classes ->
     lop dot bien che lop goc, khong dung toi target/classes that
  4. chay lai test: test that bai => mutant bi giet
  Toan bo ghi vao thu muc tam. Ban goc data/raw khong bao gio bi sua.

Toan tu dot bien giu TRUNG voi dong co AST ben Python de hai ngon ngu so sanh duoc:
  + <-> -, * <-> /, > <-> >=, < <-> <=, == <-> !=, && <-> ||, true <-> false, n -> n+1

Chay:  python ms-analysis/scripts/mutation_java.py --suite v4
       python ms-analysis/scripts/mutation_java.py --suite v1 --limit 10
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

REPO = C.REPO
SCRIPTS = os.path.dirname(os.path.abspath(__file__))
MAX_MUTANTS = 20

SUITES = {
    "v1": "generated_tests/gpt4o/java",
    "v4": "generated_tests/gpt4o_v4/java",
    "clean_v1": "generated_tests/clean_v1/java",
    "clean_v4": "generated_tests/clean_v4/java",
}

# (regex, thay the) — ap dung TUNG toan tu mot, moi lan mot vi tri
MUTATORS = [
    (r"(?<![+\-=!<>])\+(?![+=])", "-"),
    (r"(?<![+\-=!<>])-(?![-=>])", "+"),
    (r"(?<![*/=])\*(?![*=/])", "/"),
    (r"(?<![*/=])/(?![/*=])", "*"),
    (r">=", "> "),
    (r"<=", "< "),
    (r"(?<![<>=!])==(?!=)", "!="),
    (r"!=", "=="),
    (r"&&", "||"),
    (r"\|\|", "&&"),
    (r"\btrue\b", "false"),
    (r"\bfalse\b", "true"),
]


def junit_cp() -> str:
    """Classpath JUnit, ghep DUNG CAP phien ban.

    JUnit 5 = jupiter 5.x + platform 1.x  (hai dong so hieu KHAC nhau)
    JUnit 6 = jupiter 6.x + platform 6.x

    Cai bay da mac: lay 'ban moi nhat' cua tung artifact -> tron jupiter 6.0.3 voi test
    viet theo phong cach JUnit 5. Launcher tra ve RESULT 0 0 0, rc=0 — KHONG bao loi, chi
    im lang khong tim thay test nao. Neu khong bat duoc, moi ham se ra 'khong co test nao
    chay' va tang 4 bang 0 mot cach GIA TAO — dung loai artifact do luong ma ca phien nay
    dang di sua.
    """
    # Sap xep theo SO, khong theo chuoi. Cai bay thu hai da mac: sorted() dat "1.9.3"
    # SAU "1.14.4" (vi '9' > '1' o ky tu thu ba), nen [-1] chon nham 1.9.3 va lai lech cap.
    def ver(path: str, prefix: str) -> tuple:
        v = os.path.basename(path)[len(prefix) + 1:-4]
        return tuple(int(x) if x.isdigit() else 0 for x in re.split(r"[.\-]", v))

    names = ("junit-jupiter-api", "junit-jupiter-engine", "junit-platform-launcher",
             "junit-platform-engine", "junit-platform-commons", "opentest4j",
             "apiguardian-api")
    found: dict[str, list[str]] = {w: [] for w in names}
    for base, _, files in os.walk(os.path.expanduser("~/.m2/repository")):
        for f in files:
            if not f.endswith(".jar") or "sources" in f or "javadoc" in f:
                continue
            for w in names:
                if f.startswith(w + "-"):
                    found[w].append(os.path.join(base, f))

    # jupiter 5.M.P  <->  platform 1.M.P  (cung minor+patch, khac major)
    jup = [h for h in found["junit-jupiter-api"] if ver(h, "junit-jupiter-api")[0] == 5]
    if not jup:
        raise SystemExit("LOI: khong co junit-jupiter-api 5.x trong ~/.m2")
    target = max(ver(h, "junit-jupiter-api") for h in jup)   # vd (5, 14, 4)
    plat = (1,) + target[1:]

    jars = []
    for w in names:
        hits = found[w]
        if not hits:
            continue
        if w.startswith("junit-jupiter"):
            want_v = target
        elif w.startswith("junit-platform"):
            want_v = plat
        else:
            jars.append(max(hits, key=lambda h: ver(h, w)))
            continue
        exact = [h for h in hits if ver(h, w) == want_v]
        if not exact:
            raise SystemExit(f"LOI: khong thay {w} phien ban "
                             f"{'.'.join(map(str, want_v))} trong ~/.m2. Lech cap jupiter/"
                             f"platform lam Launcher phat hien 0 test ma KHONG bao loi.")
        jars.append(exact[0])
    return os.pathsep.join(jars)


def gen_mutants(src: str, lo: int, hi: int) -> list[str]:
    """Sinh toi da MAX_MUTANTS ban dot bien, moi ban doi DUNG MOT vi tri trong [lo,hi]."""
    lines = src.splitlines(keepends=True)
    out = []
    for idx in range(lo - 1, min(hi, len(lines))):
        line = lines[idx]
        if line.strip().startswith(("//", "*", "/*")):
            continue
        for rx, rep in MUTATORS:
            for m in re.finditer(rx, line):
                new_line = line[:m.start()] + rep + line[m.end():]
                if new_line == line:
                    continue
                mutated = lines[:idx] + [new_line] + lines[idx + 1:]
                out.append("".join(mutated))
                if len(out) >= MAX_MUTANTS:
                    return out
    return out


def run(cmd, cwd=None, timeout=180):
    return subprocess.run(cmd, cwd=cwd, capture_output=True, text=True,
                          encoding="utf-8", errors="replace", timeout=timeout)


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("--suite", default="v4", choices=sorted(SUITES))
    ap.add_argument("--limit", type=int, default=0)
    a = ap.parse_args()

    gen_dir = os.path.join(REPO, SUITES[a.suite])
    jcp = junit_cp()
    if not jcp:
        print("LOI: khong tim thay jar JUnit trong ~/.m2")
        return 1

    # bien dich JUnitRunner mot lan
    runner_out = tempfile.mkdtemp(prefix="junit_runner_")
    r = run(["javac", "-nowarn", "-cp", jcp, "-d", runner_out,
             os.path.join(SCRIPTS, "JUnitRunner.java")])
    if r.returncode != 0:
        print("LOI bien dich JUnitRunner:\n" + (r.stdout + r.stderr)[:800])
        return 1

    rows = [r for r in csv.DictReader(open(os.path.join(REPO, os.environ.get("MJ_GT", "data/full_ground_truth.csv")), encoding="utf-8-sig"))
            if r["language"] == "java"]
    if a.limit:
        rows = rows[:a.limit]

    cp_cache: dict[str, str] = {}
    results = []

    for i, rec in enumerate(rows, 1):
        fid = rec["func_id"]
        md = C.module_dir(rec)
        classes = os.path.join(md, "target", "classes")
        if md not in cp_cache:
            cp_cache[md] = C.build_classpath(md) or ""
        # JUnit CUA TA phai dung TRUOC. Classpath cua du an chua JUnit rieng va
        # LECH phien ban (commons-math: jupiter-api 5.10.2 + platform-commons 1.14.2
        # + vintage-engine 5.14.2). Neu de chung truoc, Launcher phat hien 0 test va
        # KHONG bao loi -> moi ham ra "khong co test nao chay" va tang 4 bang 0 gia tao.
        base_cp = jcp + os.pathsep + classes + os.pathsep + cp_cache[md]

        src_test = os.path.join(gen_dir, fid + "_Test.java")
        note, ms, nk, nm, ntest = "", "", 0, 0, 0
        if not os.path.exists(src_test):
            note = "khong co file test"
        else:
            code = open(src_test, encoding="utf-8", errors="replace").read().lstrip("﻿")
            pm = re.search(r"^\s*package\s+([\w.]+)\s*;", code, re.M)
            pkg = pm.group(1) if pm else ""
            cm = re.search(r"\bclass\s+(\w+)", code)
            orig = cm.group(1) if cm else fid.replace("-", "_") + "_Test"
            uniq = f"{orig}_{fid.replace('-', '_')}"
            code = re.sub(rf"\bclass\s+{re.escape(orig)}\b", f"class {uniq}", code, count=1)
            fq = f"{pkg}.{uniq}" if pkg else uniq

            with tempfile.TemporaryDirectory() as wd:
                d = os.path.join(wd, "src", *pkg.split(".")) if pkg else os.path.join(wd, "src")
                os.makedirs(d, exist_ok=True)
                tp = os.path.join(d, uniq + ".java")
                open(tp, "w", encoding="utf-8", newline="\n").write(code)
                tout = os.path.join(wd, "tclasses")
                rc = run(["javac", "-nowarn", "-cp", base_cp, "-d", tout, tp])
                if rc.returncode != 0:
                    note = "test khong bien dich duoc"
                else:
                    full_cp = tout + os.pathsep + runner_out + os.pathsep + base_cp
                    rr = run(["java", "-cp", full_cp, "JUnitRunner", fq])
                    m = re.search(r"RESULT (\d+) (\d+) (\d+)", rr.stdout or "")
                    ntest = int(m.group(1)) if m else 0
                    nfail = int(m.group(3)) if m else 0
                    if ntest == 0:
                        note = "khong co test nao chay"
                    elif nfail > 0:
                        note = f"RED tren ban goc ({nfail}/{ntest} that bai)"
                    else:
                        # green -> dot bien
                        f = rec["file"].replace("\\", "/")
                        j = f.find("raw/")
                        mod_src = os.path.join(REPO, "data", "raw", f[j + 4:])
                        srctxt = open(mod_src, encoding="utf-8", errors="replace").read()
                        lo, hi = int(rec["start_line"]), int(rec["end_line"])
                        muts = gen_mutants(srctxt, lo, hi)
                        nm = len(muts)
                        if nm == 0:
                            note = "khong co diem dot bien"
                        else:
                            rel = f[j + 4:]
                            k = rel.find("src/main/java/")
                            rel_cls = rel[k + len("src/main/java/"):] if k >= 0 else os.path.basename(rel)
                            for mut in muts:
                                mdir = os.path.join(wd, "mut", os.path.dirname(rel_cls))
                                os.makedirs(mdir, exist_ok=True)
                                mp = os.path.join(wd, "mut", rel_cls)
                                open(mp, "w", encoding="utf-8", newline="\n").write(mut)
                                mout = os.path.join(wd, "mclasses")
                                shutil.rmtree(mout, ignore_errors=True)
                                os.makedirs(mout, exist_ok=True)
                                cm_ = run(["javac", "-nowarn", "-cp", base_cp, "-d", mout, mp])
                                if cm_.returncode != 0:
                                    nm -= 1          # mutant khong bien dich duoc -> bo, khong tinh
                                    continue
                                # lop dot bien dat TRUOC target/classes de che lop goc
                                mcp = mout + os.pathsep + tout + os.pathsep + runner_out + os.pathsep + base_cp
                                try:
                                    r2 = run(["java", "-cp", mcp, "JUnitRunner", fq], timeout=120)
                                    if r2.returncode != 0:
                                        nk += 1
                                except subprocess.TimeoutExpired:
                                    nk += 1
                            ms = round(nk / nm * 100, 2) if nm > 0 else ""
                            if nm == 0:
                                note = "moi mutant deu khong bien dich duoc"

        results.append({"func_id": fid, "visibility": "", "n_test": ntest,
                        "n_mutant": nm, "n_killed": nk, "mutation_score": ms, "note": note})
        print(f"  [{i:2d}/{len(rows)}] {fid}  test={ntest:2d}  ms="
              f"{ms if ms != '' else '  -  '}  ({nk}/{nm})  {note}")

    out = os.path.join(REPO, "ms-analysis", "results", f"mutation_java_{a.suite}.csv")
    with open(out, "w", encoding="utf-8", newline="") as fh:
        w = csv.DictWriter(fh, fieldnames=list(results[0].keys()))
        w.writeheader()
        w.writerows(results)

    n = len(results)
    green = sum(1 for r in results if r["n_test"] > 0 and not r["note"].startswith("RED"))
    pos = sum(1 for r in results if r["mutation_score"] not in ("", None)
              and float(r["mutation_score"]) > 0)
    print(f"\n=== JAVA suite {a.suite} (n={n}) ===")
    print(f"  test XANH tren ban goc     : {green}/{n}")
    print(f"  GIET DUOC MUTANT (ms>0)    : {pos}/{n} ({100 * pos / n:.1f}%)   <- tang 4")
    print(f"\n-> {out}")
    return 0


if __name__ == "__main__":
    sys.exit(main())

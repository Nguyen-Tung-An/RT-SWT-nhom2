"""Chay baseline Java (EvoSuite + Randoop) tren dataset sach.

Theo dung PREREGISTRATION-clean.md — khong doi budget, khong doi phien ban:
  EvoSuite 1.2.0, 60 s/class, CAN JDK 11 (da xac minh: JDK 17 loi
                  DependencyAnalysis.initInheritanceTree, khong sinh duoc test nao)
  Randoop  4.3.3, 60 s/class, chay duoc tren JDK 17

Sinh theo LOP (khong theo ham) — dung cach ca hai cong cu hoat dong, va dung cach bai goc
da lam. Sau do harness do se cat theo khoang dong tung ham.

LUU Y WINDOWS: classpath phai dung ';'. Git Bash mangle dau ';' nen script nay tu build
classpath bang os.pathsep va goi subprocess KHONG qua shell.

Chay:
  python ms-analysis/scripts/run_baseline_java.py --tool randoop
  python ms-analysis/scripts/run_baseline_java.py --tool evosuite --jdk tools/jdk11/bin/java.exe
"""
from __future__ import annotations

import argparse
import collections
import csv
import os
import subprocess
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import check_java_compile as C  # noqa: E402

REPO = C.REPO
TOOLS = os.path.join(REPO, "tools")
GT = os.environ.get("BL_GT", "data/clean_v3.csv")
BUDGET = 60  # giay/lop — GIU NGUYEN bai goc


def targets() -> dict[str, list[dict]]:
    """Gom ham theo LOP day du (package.Class) — don vi sinh cua ca hai cong cu."""
    rows = [r for r in csv.DictReader(open(os.path.join(REPO, GT), encoding="utf-8-sig"))
            if r["language"] == "java"]
    by: dict[str, list[dict]] = {}
    for r in rows:
        f = r["file"].replace("\\", "/")
        i = f.find("src/main/java/")
        if i < 0:
            continue
        fq = f[i + len("src/main/java/"):].replace(".java", "").replace("/", ".")
        by.setdefault(fq, []).append(r)
    return by


def sane_cp(cp: str) -> str:
    """Bo jar co bytecode Java 12+ khoi classpath cua EvoSuite.

    ASM trong EvoSuite 1.2.0 qua cu: gap class file major version >= 56 (Java 12+) la
    client JVM chet, master van exit 0 -> "thanh cong" gia, 0 file test.
    Da kiem chung: gson voi classpath day du -> 0 test; bo dep ngoai -> 55 test.
    (Script goc cua nhom cung ghi nhan dieu nay: "uu tien ban sane, ASM cu gap major
    version 65 la chet".)

    Cach loc: doc 4 byte dau cua 1 .class bat ky trong jar de biet major version.
    """
    import zipfile
    keep = []
    for p in cp.split(os.pathsep):
        if not p:
            continue
        if not p.endswith(".jar"):
            keep.append(p)          # thu muc classes: giu
            continue
        try:
            with zipfile.ZipFile(p) as z:
                names = z.namelist()
                # MULTI-RELEASE: bytecode moi nam trong META-INF/versions/<N>/ chu KHONG
                # nam trong cac class goc. Chi soi 20 class dau se bo sot hoan toan —
                # loc dau tien cua toi chi bo duoc 1/30 jar vi ly do nay.
                mr = False
                for n in names:
                    if n.startswith("META-INF/versions/"):
                        part = n.split("/")
                        if len(part) > 2 and part[2].isdigit() and int(part[2]) >= 12:
                            mr = True
                            break
                if mr:
                    continue
                worst = 0
                for n in [x for x in names if x.endswith(".class")][:40]:
                    b = z.read(n)[:8]
                    if len(b) >= 8:
                        worst = max(worst, int.from_bytes(b[6:8], "big"))
                if worst and worst <= 55:   # <= Java 11
                    keep.append(p)
        except Exception:  # noqa: BLE001
            continue                # jar hong/khong doc duoc -> bo cho an toan
    return os.pathsep.join(keep)


def jdk_major(java_exe: str) -> int:
    """Phien ban major cua JDK. '1.8.0_422' -> 8; '11.0.25' -> 11."""
    try:
        r = subprocess.run([java_exe, "-version"], capture_output=True, text=True,
                           encoding="utf-8", errors="replace", timeout=30)
        import re as _re
        m = _re.search(r'version "(\d+)(?:\.(\d+))?', (r.stdout or "") + (r.stderr or ""))
        if not m:
            return 0
        maj = int(m.group(1))
        return int(m.group(2)) if maj == 1 and m.group(2) else maj
    except Exception:  # noqa: BLE001
        return 0


def run(cmd, cwd, timeout, env=None):
    """subprocess KHONG qua shell — tranh Git Bash mangle ';' trong classpath."""
    try:
        return subprocess.run(cmd, cwd=cwd, capture_output=True, text=True,
                              encoding="utf-8", errors="replace", timeout=timeout, env=env)
    except subprocess.TimeoutExpired:
        return None


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("--tool", required=True, choices=["evosuite", "randoop"])
    ap.add_argument("--jdk", default="java", help="duong dan java.exe (EvoSuite can JDK 11)")
    ap.add_argument("--limit", type=int, default=0)
    a = ap.parse_args()

    # Tuyet doi hoa: subprocess chay voi cwd = thu muc module, nen duong dan tuong doi hong.
    if a.jdk != "java":
        a.jdk = os.path.abspath(a.jdk)
        if not os.path.exists(a.jdk):
            print(f"LOI: khong thay JDK {a.jdk}")
            return 1
    jar = os.path.join(TOOLS, "evosuite-1.2.0.jar" if a.tool == "evosuite"
                       else "randoop-all-4.3.3.jar")
    if not os.path.exists(jar):
        print(f"LOI: khong thay {jar}")
        return 1

    out_root = os.path.join(REPO, "generated_tests", f"clean_{a.tool}", "java")
    os.makedirs(out_root, exist_ok=True)
    log_dir = os.path.join(REPO, "ms-analysis", "results", f"{a.tool}_logs")
    os.makedirs(log_dir, exist_ok=True)

    by = targets()
    items = sorted(by.items())
    if a.limit:
        items = items[:a.limit]

    cp_cache: dict[str, str] = {}
    tally: collections.Counter = collections.Counter()
    rows_out = []

    for i, (fq, recs) in enumerate(items, 1):
        md = C.module_dir(recs[0])
        classes = os.path.join(md, "target", "classes")
        if md not in cp_cache:
            cp_cache[md] = C.build_classpath(md) or ""
        # EvoSuite 1.2.0 chay tren JDK 11 nen phai dung BYTECODE JDK 11 (target/classes
        # la ban JDK 17 -> UnsupportedClassVersionError). Randoop chay JDK 17 nen giu nguyen.
        if a.tool == "evosuite":
            cj = os.path.join(md, "target", "classes-jdk11")
            if not os.path.isdir(cj) or not any(
                    f.endswith(".class") for _, _, fs in os.walk(cj) for f in fs):
                print(f"  [{i:2d}/{len(items)}] {fq:58s} bo qua (khong co bytecode JDK 11)")
                tally["khong-co-bytecode-jdk11"] += 1
                rows_out.append({"class": fq, "n_func": len(recs), "rc": "",
                                 "status": "khong-co-bytecode-jdk11"})
                continue
            # SAI LECH PHAI KHAI BAO: EvoSuite chay voi classpath CHI GOM classes cua
            # module, KHONG co dependency ngoai. Ly do: voi classpath day du, ASM cu cua
            # EvoSuite 1.2.0 chet ngam (master exit 0, 0 file test) — da kiem chung tren
            # gson: classpath day du -> 0 test; chi classes -> 55 test.
            # Da thu loc jar Java 12+ (ke ca multi-release META-INF/versions) nhung khong
            # tim ra dung jar gay loi. Hau qua: EvoSuite co the yeu hon binh thuong tren
            # lop can dependency ngoai. Phai ghi ro khi bao cao.
            proj_cp = cj
        else:
            proj_cp = classes + os.pathsep + cp_cache[md]

        if a.tool == "evosuite":
            # EvoSuite dung deep reflection vao noi bo JDK. Tu Java 9 (ke ca 11) JPMS chan
            # lai: "InaccessibleObjectException: module java.base does not opens java.util".
            # Phai mo tuong minh cac package no cham toi, neu khong no khong sinh duoc test
            # nao (rc=0 nhung rong — dung loai that bai im lang).
            # CHI them khi JDK >= 9. JDK 8 khong hieu co nay va se tu choi khoi dong JVM
            # ("Could not create the Java Virtual Machine"). JDK 8 cung khong co JPMS nen
            # khong can mo gi ca.
            opens = []
            if jdk_major(a.jdk) >= 9:
                for m in ("java.base/java.util", "java.base/java.lang",
                          "java.base/java.lang.reflect", "java.base/java.io",
                          "java.base/java.text", "java.base/java.net",
                          "java.desktop/java.awt", "java.desktop/java.awt.font"):
                    opens += ["--add-opens", m + "=ALL-UNNAMED"]
            cmd = [a.jdk, *opens, "-jar", jar, "-class", fq, "-projectCP", proj_cp,
                   f"-Dsearch_budget={BUDGET}", "-Dassertion_timeout=30",
                   "-Dtest_dir=" + out_root, "-Dshow_progress=false"]
        else:
            cmd = [a.jdk, "-cp", proj_cp + os.pathsep + jar, "randoop.main.Main",
                   "gentests", f"--testclass={fq}", f"--time-limit={BUDGET}",
                   "--junit-output-dir=" + out_root,
                   "--junit-package-name=" + fq.rsplit(".", 1)[0],
                   "--regression-test-basename=" + fq.rsplit(".", 1)[-1] + "RegressionTest",
                   "--no-error-revealing-tests=true"]

        # EvoSuite master spawn CLIENT bang java lay tu JAVA_HOME. Neu khong set, client
        # van chay JDK mac dinh (17) va chet ngam trong khi master exit 0 -> "thanh cong"
        # gia. Manh nay lay tu script goc cua nhom (scripts/run_baselines.py:27-32).
        env = None
        if a.tool == "evosuite" and a.jdk != "java":
            env = os.environ.copy()
            env["JAVA_HOME"] = os.path.dirname(os.path.dirname(a.jdk))
        r = run(cmd, md, BUDGET + 240, env)
        blob = ((r.stdout or "") + (r.stderr or "")) if r else "TIMEOUT"
        rc = r.returncode if r else -1
        with open(os.path.join(log_dir, fq + ".log"), "w", encoding="utf-8") as fh:
            fh.write(f"cmd: {' '.join(cmd)}\nrc={rc}\n\n{blob}\n")

        # co sinh duoc file test khong
        made = 0
        for base, _, files in os.walk(out_root):
            for f in files:
                if f.endswith(".java") and fq.rsplit(".", 1)[-1] in f:
                    made += 1
        status = "ok" if made else ("timeout" if rc == -1 else f"no-output(rc={rc})")
        tally[status] += 1
        rows_out.append({"class": fq, "n_func": len(recs), "rc": rc, "status": status})
        print(f"  [{i:2d}/{len(items)}] {fq:58s} {status}")

    out = os.path.join(REPO, "ms-analysis", "results", f"baseline_{a.tool}_clean.csv")
    with open(out, "w", encoding="utf-8", newline="") as fh:
        w = csv.DictWriter(fh, fieldnames=["class", "n_func", "rc", "status"])
        w.writeheader()
        w.writerows(rows_out)

    print(f"\n=== {a.tool} tren dataset sach ===")
    for k, v in tally.most_common():
        print(f"  {k:20s} {v}")
    print(f"-> {out}")
    print(f"-> test: {out_root}")
    return 0


if __name__ == "__main__":
    sys.exit(main())

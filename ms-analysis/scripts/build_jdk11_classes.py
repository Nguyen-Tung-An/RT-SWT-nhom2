"""Bien dich lai ma nguon bang JDK 11 vao thu muc RIENG (target/classes-jdk11).

Vi sao can. Chuoi nguyen nhan da go xong tung buoc:
  1. EvoSuite 1.2.0 tren JDK 17 -> InaccessibleObjectException (JPMS chan deep reflection)
  2. Chuyen sang JDK 11 nhung master spawn CLIENT bang JAVA_HOME -> phai set JAVA_HOME,
     khong thi client van chay JDK 17 va chet ngam (master exit 0 = "thanh cong" gia).
     (Manh nay lay tu script goc cua nhom — scripts/run_baselines.py dong 27-32.)
  3. Sau khi sua JAVA_HOME thi loi that lo ra:
        UnsupportedClassVersionError: ... compiled by a more recent version of the
        Java Runtime
     Vi 8 repo da duoc build bang JDK 17 -> bytecode version 61, JDK 11 khong doc duoc.

Nen phai co bytecode JDK 11. Nhung KHONG duoc ghi de target/classes: harness do mutation
Java (mutation_java.py) va check_java_compile.py dang dung chinh thu muc do, ghi de se lam
sai moi so da do. Vi vay bien dich ra target/classes-jdk11 rieng.

Dung javac cua JDK 11 truc tiep thay vi Maven: thu Maven voi
-Dproject.build.outputDirectory khong an (van ghi vao target/classes), va `mvn clean` thi
se xoa mat bytecode JDK 17 dang dung.

Chay:  python ms-analysis/scripts/build_jdk11_classes.py
       python ms-analysis/scripts/build_jdk11_classes.py --repos commons-cli,jsoup
"""
from __future__ import annotations

import argparse
import os
import subprocess
import sys

REPO = os.path.dirname(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))
JDK11 = os.path.join(REPO, "tools", "jdk11", "bin", "javac.exe")
RAW = os.path.join(REPO, "data", "raw")


def modules_with_src() -> list[str]:
    """Moi thu muc co src/main/java (ho tro repo da module: gson/gson, gson/extras...)."""
    out = []
    for base, dirs, _ in os.walk(RAW):
        if base.replace("\\", "/").endswith("src/main/java"):
            mod = os.path.dirname(os.path.dirname(os.path.dirname(base)))
            if mod not in out:
                out.append(mod)
        # khong di sau vao target/ cho nhanh
        dirs[:] = [d for d in dirs if d not in ("target", ".git", "node_modules")]
    return sorted(out)


def classpath_for(mod: str) -> str:
    """Classpath: dep tu _cp.txt (da cache) + classes cua cac module anh em."""
    parts = []
    cache = os.path.join(mod, "target", "_cp.txt")
    if os.path.isfile(cache):
        c = open(cache, encoding="utf-8", errors="replace").read().strip()
        if c:
            parts.append(c)
    # module anh em trong cung repo (gson can gson/ khi build extras/)
    repo_root = mod
    while repo_root != RAW and os.path.dirname(repo_root) != RAW:
        repo_root = os.path.dirname(repo_root)
    for base, dirs, _ in os.walk(repo_root):
        dirs[:] = [d for d in dirs if d not in (".git", "node_modules")]
        if base.replace("\\", "/").endswith("target/classes-jdk11"):
            parts.append(base)
    return os.pathsep.join(p for p in parts if p)


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("--repos", default="", help="loc theo ten repo, phay ngan cach")
    a = ap.parse_args()

    if not os.path.exists(JDK11):
        print(f"LOI: khong thay javac JDK 11 tai {JDK11}")
        return 1

    mods = modules_with_src()
    if a.repos:
        want = {w.strip() for w in a.repos.split(",") if w.strip()}
        mods = [m for m in mods if any(w in m.replace("\\", "/") for w in want)]

    ok = fail = 0
    for i, mod in enumerate(mods, 1):
        src = os.path.join(mod, "src", "main", "java")
        out = os.path.join(mod, "target", "classes-jdk11")
        rel = os.path.relpath(mod, RAW)
        srcs = []
        for base, _, files in os.walk(src):
            # Bo module-info.java: no khai bao JPMS module va 'requires' cac module khong
            # co tren module-path (gson: com.google.errorprone.annotations) -> javac dung
            # ngay. Ta bien dich cho CLASSPATH phi-module nen khong can no.
            srcs += [os.path.join(base, f) for f in files
                     if f.endswith(".java") and f != "module-info.java"]
        if not srcs:
            continue
        os.makedirs(out, exist_ok=True)
        listing = os.path.join(out, "_sources.txt")
        with open(listing, "w", encoding="utf-8") as fh:
            fh.write("\n".join(srcs))

        cmd = [JDK11, "-nowarn", "-encoding", "UTF-8", "-d", out]
        cp = classpath_for(mod)
        if cp:
            cmd += ["-cp", cp]
        cmd.append("@" + listing)
        try:
            r = subprocess.run(cmd, capture_output=True, text=True, encoding="utf-8",
                               errors="replace", timeout=900)
        except subprocess.TimeoutExpired:
            print(f"  [{i}/{len(mods)}] {rel:44s} TIMEOUT")
            fail += 1
            continue

        n = sum(1 for b, _, fs in os.walk(out) for f in fs if f.endswith(".class"))
        # javac co the bao loi nhung VAN sinh phan lon class — dem class moi la thuoc do
        if n:
            ok += 1
            note = "" if r.returncode == 0 else f" (co loi, van sinh {n} class)"
            print(f"  [{i}/{len(mods)}] {rel:44s} {n} class{note}")
        else:
            fail += 1
            err = (r.stderr or r.stdout or "").strip().splitlines()
            print(f"  [{i}/{len(mods)}] {rel:44s} THAT BAI: {err[0][:70] if err else '?'}")

    print(f"\nModule co bytecode JDK 11: {ok}   that bai: {fail}")
    print("Ban goc target/classes (JDK 17) KHONG bi dung toi.")
    return 0


if __name__ == "__main__":
    sys.exit(main())

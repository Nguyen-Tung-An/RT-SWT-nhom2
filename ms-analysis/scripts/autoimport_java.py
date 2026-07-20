"""Tu them import con thieu roi bien dich lai — do xem bao nhieu ca CHI thieu import.

Vi sao lam theo huong nay: hai lan phan loai TINH (symbol co that hay bia ra) deu cho ket
qua sai. Kiem chung thu cong lo ra CR/LF nam trong commons-csv/Constants.java,
SetOperationCardinalityHelper la lop long trong CollectionUtils.java, Paint la java.awt.Paint
— deu bi gan nham la 'bia ra'. Bo phan loai khong bat duoc lop long, hang package-private,
va lop JDK ngoai danh sach cung.

Nen thay vi gan nhan, CHUNG MINH BANG KIEN TAO: phan giai symbol thieu thanh ten day du tu
classpath that + ma nguon, chen import, bien dich lai. Ty le tang len bao nhieu chinh la
phan 'chi thieu import'. Khong con phu thuoc vao phan loai chu quan cua toi.

Chay:  python ms-analysis/scripts/autoimport_java.py
"""
from __future__ import annotations

import collections
import csv
import json
import os
import re
import subprocess
import sys
import tempfile

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import check_java_compile as C  # noqa: E402

REPO = C.REPO
OUT = os.path.join(REPO, "ms-analysis", "results", "java_autoimport.csv")

JDK_PKGS = ["java.util", "java.io", "java.nio.file", "java.nio.charset", "java.awt",
            "java.awt.geom", "java.awt.image", "java.math", "java.text", "java.time",
            "java.util.function", "java.util.stream", "javax.swing"]


def fqn_index(module: str, cp: str) -> dict[str, list[str]]:
    """ten don -> danh sach ten day du. Gom tu ma nguon du an + moi jar tren classpath."""
    idx: dict[str, set[str]] = collections.defaultdict(set)

    # (a) ma nguon du an: lay ca lop LONG NHAU (thu bo phan loai truoc bo sot)
    root = module
    while root and not os.path.isdir(os.path.join(root, "src")) and len(root) > len(REPO) + 10:
        root = os.path.dirname(root)
    for base, _, files in os.walk(root or module):
        if os.sep + "target" + os.sep in base + os.sep:
            continue
        for f in files:
            if not f.endswith(".java"):
                continue
            p = os.path.join(base, f)
            try:
                txt = open(p, encoding="utf-8", errors="replace").read()
            except OSError:
                continue
            pm = re.search(r"^\s*package\s+([\w.]+)\s*;", txt, re.M)
            pkg = pm.group(1) if pm else ""
            top = f[:-5]
            if pkg:
                idx[top].add(f"{pkg}.{top}")
            for m in re.finditer(r"\b(?:static\s+)?(?:final\s+)?(?:public|protected|private)?\s*"
                                 r"(?:static\s+)?(?:final\s+)?(?:class|interface|enum)\s+(\w+)", txt):
                nested = m.group(1)
                if nested != top and pkg:
                    idx[nested].add(f"{pkg}.{top}.{nested}")

    # (b) jar tren classpath
    for jar in (cp or "").split(os.pathsep):
        if not jar.endswith(".jar") or not os.path.exists(jar):
            continue
        try:
            r = subprocess.run(["jar", "tf", jar], capture_output=True, text=True,
                               encoding="utf-8", errors="replace", timeout=60)
        except Exception:  # noqa: BLE001
            continue
        for line in (r.stdout or "").splitlines():
            if not line.endswith(".class") or "$" in line:
                continue
            fq = line[:-6].replace("/", ".")
            idx[fq.rsplit(".", 1)[-1]].add(fq)

    # (c) JDK: thu nap lop that
    return {k: sorted(v) for k, v in idx.items()}


def jdk_fqn(name: str) -> str | None:
    for pkg in JDK_PKGS:
        try:
            r = subprocess.run(["java", "-e"], capture_output=True, timeout=5)
        except Exception:  # noqa: BLE001
            pass
        break
    for pkg in JDK_PKGS:
        cand = f"{pkg}.{name}"
        try:
            rr = subprocess.run(["jshell", "-q", "-s", "-"], input=f"Class.forName(\"{cand}\");\n/exit\n",
                                capture_output=True, text=True, timeout=30)
            if "ClassNotFoundException" not in (rr.stdout or ""):
                return cand
        except Exception:  # noqa: BLE001
            return None
    return None


JDK_STATIC = {n: f"java.awt.{n}" for n in
              ("Color", "BasicStroke", "Font", "Graphics2D", "Paint", "Shape", "Stroke",
               "Rectangle", "Dimension", "Insets", "GradientPaint", "TexturePaint")}
JDK_STATIC.update({n: f"java.awt.geom.{n}" for n in
                   ("Rectangle2D", "Point2D", "Line2D", "Ellipse2D", "AffineTransform")})


def compile_one(code: str, pkg: str, cls: str, full_cp: str) -> tuple[bool, str]:
    with tempfile.TemporaryDirectory() as wd:
        d = os.path.join(wd, *pkg.split(".")) if pkg else wd
        os.makedirs(d, exist_ok=True)
        p = os.path.join(d, cls + ".java")
        open(p, "w", encoding="utf-8", newline="\n").write(code)
        try:
            r = subprocess.run(["javac", "-nowarn", "-cp", full_cp, "-d",
                                os.path.join(wd, "out"), p], capture_output=True,
                               text=True, encoding="utf-8", errors="replace", timeout=180)
            return r.returncode == 0, r.stdout + r.stderr
        except subprocess.TimeoutExpired:
            return False, "TIMEOUT"


def add_imports(code: str, imports: list[str]) -> str:
    if not imports:
        return code
    lines = code.splitlines()
    at = 0
    for i, l in enumerate(lines):
        if l.strip().startswith("package "):
            at = i + 1
            break
    block = [f"import {i};" for i in sorted(set(imports))]
    return "\n".join(lines[:at] + [""] + block + lines[at:])


def main() -> int:
    gt = {r["func_id"]: r for r in csv.DictReader(open(C.GT, encoding="utf-8-sig"))
          if r["language"] == "java"}
    comp = {r["func_id"]: r for r in csv.DictReader(
        open(os.path.join(REPO, "ms-analysis/results/java_compile_check.csv"),
             encoding="utf-8-sig"))}
    fails = [f for f, r in sorted(comp.items()) if r["compiles"] == "0"]

    idx_cache, cp_cache, rows = {}, {}, []
    fixed = 0
    for fid in fails:
        rec = gt[fid]
        md = C.module_dir(rec)
        if md not in cp_cache:
            cp_cache[md] = C.build_classpath(md) or ""
            idx_cache[md] = fqn_index(md, cp_cache[md])
        full_cp = os.path.join(md, "target", "classes") + os.pathsep + cp_cache[md]
        idx = idx_cache[md]

        src = os.path.join(C.GEN, fid + "_Test.java")
        code = open(src, encoding="utf-8", errors="replace").read().lstrip("﻿")
        pm = re.search(r"^\s*package\s+([\w.]+)\s*;", code, re.M)
        pkg = pm.group(1) if pm else ""
        cm = re.search(r"\bclass\s+(\w+)", code)
        orig = cm.group(1) if cm else fid.replace("-", "_") + "_Test"
        uniq = f"{orig}_{fid.replace('-', '_')}"
        code = re.sub(rf"\bclass\s+{re.escape(orig)}\b", f"class {uniq}", code, count=1)

        added: list[str] = []
        for _ in range(6):                       # lap: moi vong javac lo ra symbol thieu ke tiep
            ok, out = compile_one(code, pkg, uniq, full_cp)
            if ok:
                break
            want = {v for k, v in re.findall(r"symbol:\s+(class|variable|method)\s+(\w+)", out)}
            new = []
            for name in want:
                if name in JDK_STATIC:
                    new.append(JDK_STATIC[name])
                elif name in idx and len(idx[name]) >= 1:
                    new.append(idx[name][0])
            new = [i for i in new if i not in added]
            if not new:
                break
            added += new
            code = add_imports(code, added)

        ok, out = compile_one(code, pkg, uniq, full_cp)
        fixed += ok
        first = next((l for l in out.splitlines() if "error:" in l), "")
        print(f"  {fid}  {'FIXED' if ok else 'van hong'}  +{len(added)} import"
              f"{'' if ok else '  ' + first[-60:]}")
        rows.append({"func_id": fid, "fixed_by_import": int(ok),
                     "n_imports_added": len(added), "imports": ";".join(added)[:200],
                     "remaining_error": "" if ok else first[-90:]})

    with open(OUT, "w", encoding="utf-8", newline="") as fh:
        w = csv.DictWriter(fh, fieldnames=["func_id", "fixed_by_import", "n_imports_added",
                                           "imports", "remaining_error"])
        w.writeheader()
        w.writerows(rows)

    base_ok = sum(1 for r in comp.values() if r["compiles"] == "1")
    print(f"\n=== KET QUA ===")
    print(f"  bien dich duoc TRUOC        : {base_ok}/60 ({100 * base_ok / 60:.1f}%)")
    print(f"  cuu duoc chi bang THEM IMPORT: {fixed}/{len(fails)}")
    print(f"  bien dich duoc SAU           : {base_ok + fixed}/60 "
          f"({100 * (base_ok + fixed) / 60:.1f}%)")
    print(f"\n-> {OUT}")
    return 0


if __name__ == "__main__":
    sys.exit(main())

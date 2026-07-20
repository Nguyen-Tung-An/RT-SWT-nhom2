"""Symbol bi thieu la BIA RA hay CO THAT ma chi thieu import?

Day la phan biet quyet dinh khi giai thich ty le bien dich 28.3%:
  - 'bia ra'      : model tuong tuong API khong ton tai -> gioi han KIEN THUC model,
                    prompt kho sua
  - 'thieu import': lop/hang CO THAT trong du an hoac JDK, model dung dung ten nhung
                    khong khai bao import -> loi CO HOC, sua duoc bang mot buoc tu dong

Neu phan lon la 'thieu import' thi con so 28.3% dang do mot thu khac han voi 'model khong
biet viet test': no dang do mot khiem khuyet co hoc cua khau sinh ma bat ky IDE nao cung
vá duoc.

Cach xac minh: voi tung symbol, tim khai bao trong (a) ma nguon cua chinh du an,
(b) cac jar tren classpath, (c) java.* / javax.* cua JDK.

Chay:  python ms-analysis/scripts/classify_java_errors.py
"""
from __future__ import annotations

import collections
import csv
import json
import os
import re
import subprocess
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import check_java_compile as C  # noqa: E402

REPO = C.REPO
ERRS = os.path.join(REPO, "ms-analysis", "results", "java_errors.json")
OUT = os.path.join(REPO, "ms-analysis", "results", "java_error_classes.csv")

# lop JDK hay dung ma model quen import
JDK_HINT = {
    "Color", "BasicStroke", "Font", "Graphics2D", "Rectangle2D", "Point2D", "Shape",
    "BufferedImage", "File", "IOException", "List", "ArrayList", "Map", "HashMap",
    "Set", "HashSet", "Arrays", "Collections", "Optional", "Stream", "Path", "Paths",
    "Charset", "StandardCharsets", "Reader", "Writer", "StringWriter", "StringReader",
    "InputStream", "OutputStream", "Date", "Locale", "TimeZone", "BigDecimal",
    "BigInteger", "Function", "Supplier", "Consumer", "Predicate", "Comparator",
}

# API cua JUnit 5 — luon co san khi test chay, khong duoc tinh la 'bia ra'
JUNIT_API = {
    "assertEquals", "assertNotEquals", "assertTrue", "assertFalse", "assertNull",
    "assertNotNull", "assertThrows", "assertDoesNotThrow", "assertArrayEquals",
    "assertSame", "assertNotSame", "fail", "assertAll", "assertIterableEquals",
    "assertLinesMatch", "assertTimeout", "assertInstanceOf",
}


def source_index(module: str) -> tuple[set[str], set[str]]:
    """-> (ten LOP, ten FIELD/METHOD) khai bao trong ma nguon.

    Ban dau chi index ten lop, khien hang so va method (CR, EOF, assertThrows, body)
    bi gan nham la 'bia ra'. Symbol trong javac co 3 loai — class / variable / method —
    va phai tra theo dung loai, neu khong ty le 'bia ra' bi thoi phong.
    """
    classes: set[str] = set()
    members: set[str] = set()
    for base, _, files in os.walk(os.path.dirname(module) or module):
        if os.sep + "target" + os.sep in base + os.sep:
            continue
        for f in files:
            if not f.endswith(".java"):
                continue
            classes.add(f[:-5])
            try:
                txt = open(os.path.join(base, f), encoding="utf-8", errors="replace").read()
            except OSError:
                continue
            # field: '... TYPE NAME =' hoac '... TYPE NAME;'
            members.update(re.findall(r"(?:static\s+)?(?:final\s+)?[\w<>\[\],.\s]+?(\w+)\s*(?:=|;)", txt)[:4000])
            # method: 'TYPE NAME(' o dau dong khai bao
            members.update(re.findall(r"\w[\w<>\[\],.\s]*\s+(\w+)\s*\([^)]*\)\s*(?:throws[^{;]*)?[{;]", txt)[:4000])
    return classes, members


def jar_index(cp: str) -> set[str]:
    names: set[str] = set()
    for jar in (cp or "").split(os.pathsep):
        if not jar.endswith(".jar") or not os.path.exists(jar):
            continue
        try:
            r = subprocess.run(["jar", "tf", jar], capture_output=True, text=True,
                               encoding="utf-8", errors="replace", timeout=60)
        except Exception:  # noqa: BLE001
            continue
        for line in (r.stdout or "").splitlines():
            if line.endswith(".class"):
                names.add(os.path.basename(line)[:-6].split("$")[-1])
    return names


def main() -> int:
    if not os.path.exists(ERRS):
        print(f"LOI: khong thay {ERRS} — chay java_errs.py truoc")
        return 1
    errs = json.load(open(ERRS, encoding="utf-8"))
    gt = {r["func_id"]: r for r in csv.DictReader(open(C.GT, encoding="utf-8-sig"))
          if r["language"] == "java"}

    src_cache: dict[str, set[str]] = {}
    mem_cache: dict[str, set[str]] = {}
    jar_cache: dict[str, set[str]] = {}
    rows, tally = [], collections.Counter()

    for fid, e in sorted(errs.items()):
        rec = gt.get(fid)
        if not rec:
            continue
        md = C.module_dir(rec)
        if md not in src_cache:
            cls, mem = source_index(md)
            src_cache[md] = cls
            mem_cache[md] = mem
            jar_cache[md] = jar_index(C.build_classpath(md) or "")
        known_cls = src_cache[md] | jar_cache[md] | JDK_HINT
        known_mem = mem_cache[md] | JUNIT_API

        syms = [(k, v) for k, v in e.get("symbols", [])]
        if not syms:
            verdict, detail = "khong-phai-symbol", ""
        else:
            uniq = {(k, v) for k, v in syms}
            found = {v for k, v in uniq
                     if (v in known_cls if k == "class" else (v in known_mem or v in known_cls))}
            miss = {v for _, v in uniq} - found
            if not miss:
                verdict = "THIEU IMPORT (symbol co that)"
                detail = ",".join(sorted(found))[:60]
            elif found:
                verdict = "hon hop"
                detail = f"co:{','.join(sorted(found))[:26]} | bia:{','.join(sorted(miss))[:26]}"
            else:
                verdict = "BIA RA (khong tim thay o dau)"
                detail = ",".join(sorted(miss))[:60]
        tally[verdict] += 1
        rows.append({"func_id": fid, "n_error": e.get("n_error"), "verdict": verdict,
                     "detail": detail})
        print(f"  {fid}  {e.get('n_error'):3d} loi  {verdict:32s} {detail}")

    with open(OUT, "w", encoding="utf-8", newline="") as fh:
        w = csv.DictWriter(fh, fieldnames=["func_id", "n_error", "verdict", "detail"])
        w.writeheader()
        w.writerows(rows)

    print(f"\n{'PHAN LOAI':34s} {'ca':>4s}")
    for k, v in tally.most_common():
        print(f"{k:34s} {v:4d}")
    print(f"\n-> {OUT}")
    return 0


if __name__ == "__main__":
    sys.exit(main())

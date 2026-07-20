"""Kiem chung full_ground_truth_v2.csv: moi muc tieu co THAT SU goi duoc khong?

Vi sao can: enrich_ground_truth.py suy ra qualname/import_hint tu AST. Suy ra dung cu phap
KHONG co nghia la chay duoc. Truoc khi dot API sinh lai 120 test, phai chung minh tung
muc tieu thuc su resolve duoc — dung bai hoc cua chinh du an: "chay xanh != co so lieu",
moi buoc phai xac minh bang artefact that.

Python: import module pinned that -> di theo qualname -> xac nhan la callable + doi chieu
        chu ky. Day la kiem chung DONG (that su chay).
Java  : doi chieu class + ten + so tham so trong source that (kiem chung TINH).

Chay:  python ms-analysis/scripts/verify_targets.py
       python ms-analysis/scripts/verify_targets.py --fail-only
"""
from __future__ import annotations

import argparse
import csv
import importlib
import inspect
import os
import re
import sys

REPO = os.path.dirname(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))
GT_V2 = os.path.join(REPO, "data", "full_ground_truth_v2.csv")

# uu tien source pinned hon package cai san
for p in (os.path.join(REPO, "data", "raw", "flask", "src"),
          os.path.join(REPO, "data", "raw", "requests", "src")):
    if p not in sys.path:
        sys.path.insert(0, p)


def verify_python(rec: dict) -> tuple[str, str]:
    """-> (status, detail). status: ok | closure | FAIL"""
    mod_name = rec["module_or_package"]
    qual = rec["qualname"]
    if not mod_name or not qual:
        return "FAIL", "thieu module/qualname"
    try:
        mod = importlib.import_module(mod_name)
    except Exception as e:
        return "FAIL", f"import {mod_name}: {type(e).__name__}: {str(e)[:60]}"

    obj, walked = mod, []
    for part in qual.split("."):
        # closure khong the resolve qua getattr -> dung lai o ham bao ngoai
        if rec["receiver_kind"] == "nested-function" and walked and callable(obj):
            return "closure", f"dung o {'.'.join(walked)} (closure, khong resolve truc tiep)"
        if not hasattr(obj, part):
            return "FAIL", f"khong tim thay .{part} tren {'.'.join(walked) or mod_name}"
        obj = getattr(obj, part)
        walked.append(part)

    if not callable(obj):
        return "FAIL", f"{qual} khong callable (type={type(obj).__name__})"

    # doi chieu chu ky
    want = [p for p in rec["param_types"].split(",") if p]
    try:
        got = [p for p in inspect.signature(obj).parameters if p not in ("self", "cls")]
    except (TypeError, ValueError):
        return "ok", "callable (khong doc duoc signature)"
    if want and got and want != got:
        return "ok", f"callable, signature lech: v2={want} vs that={got}"
    return "ok", f"callable({', '.join(got)})"


def verify_java(rec: dict) -> tuple[str, str]:
    f = rec["file"].replace("\\", "/")
    i = f.find("raw/")
    path = os.path.join(REPO, "data", "raw", f[i + 4:]) if i >= 0 else os.path.join(REPO, f)
    if not os.path.exists(path):
        return "FAIL", "source-missing"
    src = open(path, encoding="utf-8", errors="replace").read()

    cls = rec["class_path"].split(".")[-1]
    if cls and not re.search(r"\b(?:class|interface|enum|record)\s+" + re.escape(cls) + r"\b", src):
        return "FAIL", f"khong thay khai bao class {cls}"

    name = rec["func_name"].split("::")[-1]
    hits = list(re.finditer(r"\b" + re.escape(name) + r"\s*\(([^)]*)\)", src))
    if not hits:
        return "FAIL", f"khong thay method {name}"

    want = [p for p in rec["param_types"].split(",") if p]
    for h in hits:
        args = [a.strip() for a in h.group(1).split(",") if a.strip()]
        if len(args) == len(want):
            return "ok", f"{cls}.{name}({', '.join(want)}) — khop {len(want)} tham so"
    return "ok", f"{name} ton tai nhung khong khop arity {len(want)} ({len(hits)} overload)"


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("--fail-only", action="store_true")
    a = ap.parse_args()

    rows = list(csv.DictReader(open(GT_V2, encoding="utf-8")))
    tally = {"ok": 0, "closure": 0, "FAIL": 0}
    fails = []

    for r in rows:
        st, detail = (verify_python(r) if r["language"] == "python" else verify_java(r))
        tally[st] += 1
        if st == "FAIL":
            fails.append((r["func_id"], r["language"], r["qualname"], detail))
        if not a.fail_only and st != "FAIL":
            print(f"  {st:8s} {r['func_id']:7s} {r['qualname'][:52]:52s} {detail[:44]}")

    print()
    print(f"KET QUA: ok={tally['ok']}  closure={tally['closure']}  FAIL={tally['FAIL']}"
          f"   (tong {len(rows)})")
    if fails:
        print()
        print("=== CAC CA THAT BAI ===")
        for fid, lang, q, d in fails:
            print(f"  {fid} ({lang}) {q}\n      -> {d}")
    return 1 if fails else 0


if __name__ == "__main__":
    sys.exit(main())

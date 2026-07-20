"""Vi sao tung ham bi 0%? Phan loai NGUYEN NHAN thay vi gop chung.

"0%" trong metrics hien dang tron it nhat 4 tinh huong khac han nhau ve y nghia. Gop lai
roi lay median la loi pham tru — mot so trong do KHONG PHAI phep do:

  A no-suite       Pynguin khong sinh duoc test nao (crash/timeout) -> KHONG CO phep do.
                   Bao 0 la bia so lieu; dung phai la N/A.
  B red-on-original Co suite nhung test do bi do ngay tren ban goc -> suite hong, khong
                   dung de ket luan gi ve do phu.
  C not-reached    Suite xanh nhung KHONG he cham toi ham muc tieu (0 nhanh duoc thuc thi
                   trong khoang dong cua ham) -> 0 THAT, va giai thich duoc: Pynguin sinh
                   theo MODULE, khong nham vao ham nao ca.
  D no-branch      Ham khong co nhanh nao trong khoang dong -> ty le nhanh KHONG XAC DINH
                   (mau so = 0). Bao 0 la sai; PIT o phia Java duoc xu ly la N/A.
  E measured       Co so lieu that.

Chay:  python ms-analysis/scripts/diagnose_zero.py
       python ms-analysis/scripts/diagnose_zero.py --csv ms-analysis/results/_pynguin_v2.csv
"""
from __future__ import annotations

import argparse
import ast
import csv
import json
import os
import shutil
import subprocess
import sys
import tempfile

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import greencheck  # noqa: E402
import measure_pynguin as mp  # noqa: E402

REPO = mp.REPO_ROOT
PY = sys.executable
SAVE_DIR = mp.SAVE_DIR


def branches_in_range(mod_file: str, lo: int, hi: int) -> int:
    """So NHANH tinh duoc trong khoang dong — de phan biet 'khong co nhanh' voi 'khong cham toi'."""
    try:
        tree = ast.parse(open(mod_file, encoding="utf-8", errors="replace").read())
    except SyntaxError:
        return -1
    n = 0
    for node in ast.walk(tree):
        ln = getattr(node, "lineno", None)
        if ln is None or not (lo <= ln <= hi):
            continue
        if isinstance(node, (ast.If, ast.While, ast.For, ast.AsyncFor, ast.IfExp)):
            n += 1
        elif isinstance(node, ast.Try):
            n += len(node.handlers)
        elif isinstance(node, ast.BoolOp):
            n += len(node.values) - 1
    return n


def cov_detail(mod_file: str, suite: str, lo: int, hi: int):
    """-> (mode, n_green, n_all, executed, missing) do that bang coverage.py."""
    with tempfile.TemporaryDirectory() as wd:
        tf = os.path.join(wd, os.path.basename(suite))
        shutil.copy(suite, tf)
        all_nodes, green, mode = greencheck.green_nodes(tf, wd)
        if not green:
            return mode, 0, len(all_nodes), None, None
        sel = greencheck.pytest_args(tf, green, all_nodes)
        mp.run([PY, "-m", "coverage", "run", "--branch", f"--include={mod_file}",
                "-m", "pytest", "-q", "-p", "no:cacheprovider", *sel], wd)
        mp.run([PY, "-m", "coverage", "json", "-o", os.path.join(wd, "c.json")], wd)
        try:
            cj = json.load(open(os.path.join(wd, "c.json"), encoding="utf-8"))
        except OSError:
            # coverage khong ghi duoc data nao -> khong dong nao cua module duoc chay
            return mode, len(green), len(all_nodes), -1, -1
        norm = os.path.normcase(os.path.normpath(mod_file))
        for fp, info in cj.get("files", {}).items():
            if os.path.normcase(os.path.normpath(os.path.abspath(fp))) != norm:
                continue
            ex = [b for b in info.get("executed_branches", []) if lo <= b[0] <= hi]
            mi = [b for b in info.get("missing_branches", []) if lo <= b[0] <= hi]
            return mode, len(green), len(all_nodes), len(ex), len(mi)
        # module KHONG xuat hien trong bao cao coverage -> suite chua he import no.
        # Vi du that: test_flask_logging.py la file 4 dong, 1 test chi gan mot chuoi ky tu,
        # khong import gi, khong goi gi — pass rong. Pynguin "thanh cong" (rc=0, co file)
        # nhung suite vo nghia.
        return mode, len(green), len(all_nodes), -1, -1


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("--csv", default="ms-analysis/results/_pynguin_v2.csv")
    ap.add_argument("--deep", action="store_true",
                    help="chay coverage that cho tung ham (cham hon, chinh xac hon)")
    a = ap.parse_args()

    gt = [r for r in csv.DictReader(open(os.path.join(REPO, "data", "full_ground_truth.csv"),
                                         encoding="utf-8-sig")) if r["language"] == "python"]
    measured = {}
    p = os.path.join(REPO, a.csv)
    if os.path.exists(p):
        measured = {r["function_id"]: r for r in csv.DictReader(open(p, encoding="utf-8-sig"))}

    logs = os.path.join(REPO, "pynguin-report", "run-logs")
    tally: dict[str, list[str]] = {}
    rows_out = []

    for r in gt:
        fid = r["func_id"]
        mod_file = mp.module_file(r)
        _, mod = mp.project_and_module(r)
        key = mod.replace(".", "_")
        suite = os.path.join(SAVE_DIR, f"test_{key}.py")
        lo, hi = int(r["start_line"]), int(r["end_line"])
        nbr = branches_in_range(mod_file, lo, hi)
        log = os.path.join(logs, key + ".log")

        cause = detail = ""
        if not os.path.exists(suite):
            if os.path.exists(log):
                first = open(log, encoding="utf-8", errors="replace").readline().strip()
                why = "timeout" if first.startswith("TIMEOUT") else "crash"
                blob = open(log, encoding="utf-8", errors="replace").read()
                t = ""
                if "Can't pickle" in blob:
                    t = blob.split("Can't pickle <class '")[1].split("'")[0]
                cause, detail = "A no-suite", f"{why}{(' ' + t) if t else ''}"
            else:
                cause, detail = "A no-suite", "chua chay"
        elif nbr == 0:
            cause, detail = "D no-branch", f"khong co nhanh trong dong {lo}-{hi}"
        elif a.deep:
            mode, ng, na, ex, mi = cov_detail(mod_file, suite, lo, hi)
            if mode == "collect-fail" or ng == 0:
                cause, detail = "B red-on-original", f"{mode}, 0/{na} test xanh"
            elif ex == -1:
                # xac nhan bang tin hieu TINH: suite co nhac den module khong?
                body = open(suite, encoding="utf-8", errors="replace").read()
                touches = mod.split(".")[-1] in body or "import" in body
                nline = sum(1 for _ in open(suite, encoding="utf-8", errors="replace"))
                cause = "F empty-suite" if not touches else "C not-reached"
                detail = (f"{ng}/{na} test xanh, suite {nline} dong, "
                          f"{'KHONG import module nao' if not touches else 'co import nhung khong cham ham'}")
            elif ex is None:
                cause, detail = "B red-on-original", "khong doc duoc coverage"
            elif ex == 0 and mi == 0:
                cause, detail = "D no-branch", "coverage khong thay nhanh nao trong khoang"
            elif ex == 0:
                cause, detail = "C not-reached", f"{ng}/{na} test xanh, 0/{ex + mi} nhanh cham toi"
            else:
                cause, detail = "E measured", f"{ex}/{ex + mi} nhanh, {ng}/{na} test xanh"
        else:
            bc = (measured.get(fid, {}).get("branch_coverage") or "").strip()
            if bc in ("", "0", "0.0"):
                cause, detail = "?? can --deep", f"co suite, bc={bc or 'chua do'}"
            else:
                cause, detail = "E measured", f"bc={bc}"

        tally.setdefault(cause, []).append(fid)
        rows_out.append({"func_id": fid, "module": mod, "start": lo, "end": hi,
                         "n_branch_ast": nbr, "cause": cause, "detail": detail})
        print(f"  {fid:7s} {mod:26s} {cause:18s} {detail}")

    out = os.path.join(REPO, "ms-analysis", "results", "zero_diagnosis.csv")
    with open(out, "w", encoding="utf-8", newline="") as fh:
        w = csv.DictWriter(fh, fieldnames=list(rows_out[0].keys()))
        w.writeheader()
        w.writerows(rows_out)

    print(f"\n-> {out}\n")
    print(f"{'NGUYEN NHAN':20s} {'ham':>4s}   y nghia")
    meaning = {
        "A no-suite": "KHONG CO phep do -> phai la N/A, khong phai 0",
        "B red-on-original": "suite hong -> khong ket luan duoc ve do phu",
        "C not-reached": "0 THAT, giai thich duoc (Pynguin sinh theo module)",
        "D no-branch": "ty le nhanh KHONG XAC DINH (mau so = 0)",
        "E measured": "so lieu that",
        "F empty-suite": "suite pass rong, khong he cham module -> 0 that nhung vo nghia",
    }
    for k, v in sorted(tally.items(), key=lambda kv: -len(kv[1])):
        print(f"{k:20s} {len(v):4d}   {meaning.get(k, '')}")
    return 0


if __name__ == "__main__":
    sys.exit(main())

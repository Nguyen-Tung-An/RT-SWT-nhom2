"""
measure_python_module.py — Harness đo Python theo PHƯƠNG ÁN B (chốt 05/07/2026):
đo test trong MODULE THẬT (flask/requests cài editable từ clone pinned commit),
không dùng sandbox solution.py.

Chuẩn bị (1 lần):  pip install -e data/raw/flask -e data/raw/requests
Với mỗi hàm:
  1. Test của LLM import từ module thật (vd `from flask.helpers import get_root_path`).
  2. GREEN-CHECK: test phải PASS trên bản gốc — fail ⇒ INVALID (compiled=0).
  3. Branch coverage: coverage.py --branch, --include=<file module đích>,
     chỉ đếm branch có dòng nguồn trong [start_line, end_line] của hàm
     (line number khớp tuyệt đối vì cùng commit với CSV).
  4. Mutation score: mutate TRỰC TIẾP thân hàm trong file module thật
     (AST, mỗi mutant 1 vị trí, chỉ trong khoảng dòng của hàm), chạy lại test,
     khôi phục file sau khi đo. Test fail ⇒ mutant bị giết.

Usage:
  python ms-analysis/scripts/measure_python_module.py \
      --csv data/pilot_sample.csv --tests-dir generated_tests/gpt4o/python \
      --method gpt4o-mini --out ms-analysis/results/metrics.csv
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

REPO_ROOT = os.path.dirname(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))
PY = sys.executable
MAX_MUTANTS = 30
PYTEST_TIMEOUT = 90

_BIN = {ast.Add: ast.Sub, ast.Sub: ast.Add, ast.Mult: ast.Div, ast.Div: ast.Mult}
_CMP = {ast.Gt: ast.GtE, ast.GtE: ast.Gt, ast.Lt: ast.LtE, ast.LtE: ast.Lt,
        ast.Eq: ast.NotEq, ast.NotEq: ast.Eq}
_BOOL = {ast.And: ast.Or, ast.Or: ast.And}


def run(cmd, cwd, timeout=PYTEST_TIMEOUT):
    return subprocess.run(cmd, cwd=cwd, capture_output=True, text=True,
                          encoding="utf-8", errors="replace", timeout=timeout)


def module_file(row):
    """CSV `file` -> path local. Chiu duoc ca 2 dang prefix trong CSV:
    java:   data-research/raw/<repo>/...   python: data/raw/<repo>/..."""
    f = row["file"].replace("\\", "/")
    marker = "raw/"
    idx = f.find(marker)
    rel = f[idx + len(marker):] if idx >= 0 else f
    return os.path.normpath(os.path.join(REPO_ROOT, "data", "raw", rel))


def mutation_sites_in_range(tree, lo, hi):
    out = []
    for node in ast.walk(tree):
        ln = getattr(node, "lineno", None)
        if ln is None or not (lo <= ln <= hi):
            continue
        if isinstance(node, ast.BinOp) and type(node.op) in _BIN:
            out.append((node, "bin"))
        elif isinstance(node, ast.Compare) and len(node.ops) == 1 and type(node.ops[0]) in _CMP:
            out.append((node, "cmp"))
        elif isinstance(node, ast.BoolOp) and type(node.op) in _BOOL:
            out.append((node, "bool"))
        elif isinstance(node, ast.Constant) and isinstance(node.value, bool):
            out.append((node, "boolconst"))
        elif (isinstance(node, ast.Constant) and isinstance(node.value, (int, float))
              and not isinstance(node.value, bool)):
            out.append((node, "num"))
    return out


def gen_module_mutants(src, lo, hi):
    """Sinh cac ban module da mutate DUNG 1 vi tri trong khoang dong [lo,hi]."""
    try:
        n = len(mutation_sites_in_range(ast.parse(src), lo, hi))
    except SyntaxError:
        return []
    mutants = []
    for i in range(min(n, MAX_MUTANTS)):
        tree = ast.parse(src)
        node, kind = mutation_sites_in_range(tree, lo, hi)[i]
        try:
            if kind == "bin":
                node.op = _BIN[type(node.op)]()
            elif kind == "cmp":
                node.ops[0] = _CMP[type(node.ops[0])]()
            elif kind == "bool":
                node.op = _BOOL[type(node.op)]()
            elif kind == "boolconst":
                node.value = not node.value
            elif kind == "num":
                node.value = node.value + 1
            mutants.append(ast.unparse(ast.fix_missing_locations(tree)))
        except Exception:
            continue
    return mutants


def branch_cov_in_range(cov_json, mod_file, lo, hi):
    mod_norm = os.path.normcase(os.path.normpath(mod_file))
    for fpath, info in cov_json.get("files", {}).items():
        if os.path.normcase(os.path.normpath(os.path.abspath(fpath))) != mod_norm:
            continue
        ex = [b for b in info.get("executed_branches", []) if lo <= b[0] <= hi]
        mi = [b for b in info.get("missing_branches", []) if lo <= b[0] <= hi]
        total = len(ex) + len(mi)
        if total == 0:
            return None  # ham khong co branch trong bao cao
        return round(len(ex) / total * 100, 2)
    return None


def measure_one(row, test_src):
    mod_file = module_file(row)
    lo, hi = int(row["start_line"]), int(row["end_line"])
    if not os.path.exists(mod_file):
        print(f"{row['func_id']}: KHONG THAY module file {mod_file}")
        return {"branch_coverage": 0.0, "mutation_score": 0.0, "compiled": 0}

    with tempfile.TemporaryDirectory() as wd:
        tf = os.path.join(wd, "test_gen.py")
        open(tf, "w", encoding="utf-8").write(test_src.lstrip("﻿"))

        # 1) GREEN-CHECK tren ban goc
        try:
            r = run([PY, "-m", "pytest", "-q", "-p", "no:cacheprovider", tf], wd)
        except subprocess.TimeoutExpired:
            return {"branch_coverage": 0.0, "mutation_score": 0.0, "compiled": 0}
        if r.returncode != 0:
            tail = "\n".join(l for l in (r.stdout or "").splitlines() if l.strip())[-300:]
            print(f"{row['func_id']}: RED-ON-ORIGINAL\n{tail}")
            return {"branch_coverage": 0.0, "mutation_score": 0.0, "compiled": 0}

        # 2) BRANCH COVERAGE trong khoang dong cua ham
        run([PY, "-m", "coverage", "run", "--branch", f"--include={mod_file}",
             "-m", "pytest", "-q", "-p", "no:cacheprovider", tf], wd)
        run([PY, "-m", "coverage", "json", "-o", "cov.json"], wd)
        bc = None
        cj = os.path.join(wd, "cov.json")
        if os.path.exists(cj):
            bc = branch_cov_in_range(json.load(open(cj)), mod_file, lo, hi)
        bc = 0.0 if bc is None else bc

        # 3) MUTATION: mutate truc tiep than ham trong module that, khoi phuc sau
        original = open(mod_file, encoding="utf-8").read()
        muts = gen_module_mutants(original, lo, hi)
        killed = 0
        try:
            for m in muts:
                open(mod_file, "w", encoding="utf-8", newline="\n").write(m)
                try:
                    r = run([PY, "-m", "pytest", "-q", "-p", "no:cacheprovider", tf], wd, timeout=60)
                    if r.returncode != 0:
                        killed += 1
                except subprocess.TimeoutExpired:
                    killed += 1
        finally:
            open(mod_file, "w", encoding="utf-8", newline="\n").write(original)
        ms = round(killed / len(muts) * 100, 2) if muts else 0.0
        return {"branch_coverage": bc, "mutation_score": ms, "compiled": 1}


def main() -> int:
    ap = argparse.ArgumentParser(description="Do Python phuong an B (module that)")
    ap.add_argument("--csv", default=os.path.join("data", "pilot_sample.csv"))
    ap.add_argument("--tests-dir", default=os.path.join("generated_tests", "gpt4o", "python"))
    ap.add_argument("--method", default="gpt4o-mini")
    ap.add_argument("--out", default=os.path.join("ms-analysis", "results", "metrics.csv"))
    args = ap.parse_args()

    rows_out = []
    src_rows = [r for r in csv.DictReader(open(os.path.join(REPO_ROOT, args.csv), encoding="utf-8-sig"))
                if r["language"] == "python"]
    tests_dir = os.path.join(REPO_ROOT, args.tests_dir)
    for r in src_rows:
        tf = os.path.join(tests_dir, f"test_{r['func_id']}.py")
        if not os.path.exists(tf):
            print(f"{r['func_id']}: chua co test, bo qua")
            continue
        res = measure_one(r, open(tf, encoding="utf-8", errors="replace").read())
        rows_out.append({"function_id": r["func_id"], "language": "python", "cc": r["cc"],
                         "method": args.method, **res})
        print(f"{r['func_id']}: compiled={res['compiled']} bc={res['branch_coverage']} ms={res['mutation_score']}")

    out = os.path.join(REPO_ROOT, args.out)
    os.makedirs(os.path.dirname(out), exist_ok=True)
    fields = ["function_id", "language", "cc", "method", "branch_coverage", "mutation_score", "compiled"]
    old = []
    if os.path.exists(out):
        old = [x for x in csv.DictReader(open(out, encoding="utf-8-sig"))
               if not (x["method"] == args.method and any(x["function_id"] == n["function_id"] for n in rows_out))]
    with open(out, "w", encoding="utf-8", newline="") as f:
        w = csv.DictWriter(f, fieldnames=fields)
        w.writeheader()
        for x in old + rows_out:
            w.writerow({k: x.get(k, "") for k in fields})
    print(f"\nSaved {len(rows_out)} rows (method={args.method}) -> {args.out}")
    return 0


if __name__ == "__main__":
    sys.exit(main())

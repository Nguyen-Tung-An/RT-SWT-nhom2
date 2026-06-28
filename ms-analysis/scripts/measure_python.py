"""
measure_python.py - Harness đo Branch Coverage + Mutation Score cho test Python.
Nhóm 2 - SE1944 (vai trò MS). Sinh ra `metrics.csv` (xem DATA_CONTRACT.md §5).

Với mỗi (hàm, phương pháp):
  1. Ghi mã nguồn hàm -> solution.py
  2. Ghép test sinh ra -> test_gen.py (prepend `from solution import *`)
  3. compiled? thu test bằng pytest --collect-only. Lỗi -> compiled=0, điểm=0 (INVALID).
  4. Branch coverage: coverage.py (--branch) trên solution.py.
  5. Mutation score: bộ mutation AST tích hợp (xấp xỉ PIT/pytest-mutagen).

LƯU Ý (đọc kỹ): proposal ghi "pytest-mutagen", NHƯNG pytest-mutagen là framework
mutation THỦ CÔNG (phải tự khai báo mutant) -> KHÔNG tự động hoá được cho 100 hàm.
Script này dùng một mutation engine AST tích hợp để có con số tự động, minh bạch.
>>> Khuyến nghị: amend "pytest-mutagen" -> "mutmut" (công cụ mutation tự động chuẩn
    của Python) nếu cần con số "chính chủ". Khi đó chỉ thay hàm mutation_score().

Cách dùng:
    pip install pytest coverage
    python scripts/measure_python.py --functions data/functions.csv \
        --tests data/llm_output.csv --method gpt4o-mini --out results/metrics.csv
"""
from __future__ import annotations

import argparse
import ast
import copy
import json
import os
import subprocess
import sys
import tempfile

import pandas as pd

PY = sys.executable
MAX_MUTANTS = 30          # chặn thời gian chạy
PYTEST_TIMEOUT = 60


# --------------------------------------------------------------------------- #
# Mutation engine (AST) - các toán tử mutation cơ bản
# --------------------------------------------------------------------------- #
_BIN = {ast.Add: ast.Sub, ast.Sub: ast.Add, ast.Mult: ast.Div, ast.Div: ast.Mult}
_CMP = {ast.Gt: ast.GtE, ast.GtE: ast.Gt, ast.Lt: ast.LtE, ast.LtE: ast.Lt,
        ast.Eq: ast.NotEq, ast.NotEq: ast.Eq}
_BOOL = {ast.And: ast.Or, ast.Or: ast.And}


def _sites(tree):
    """Liệt kê (node, kind) có thể mutate."""
    out = []
    for node in ast.walk(tree):
        if isinstance(node, ast.BinOp) and type(node.op) in _BIN:
            out.append((node, "bin"))
        elif isinstance(node, ast.Compare) and len(node.ops) == 1 and type(node.ops[0]) in _CMP:
            out.append((node, "cmp"))
        elif isinstance(node, ast.BoolOp) and type(node.op) in _BOOL:
            out.append((node, "bool"))
        elif isinstance(node, ast.Constant) and isinstance(node.value, bool):
            out.append((node, "boolconst"))
        elif isinstance(node, ast.Constant) and isinstance(node.value, (int, float)) and not isinstance(node.value, bool):
            out.append((node, "num"))
    return out


def gen_mutants(src: str):
    """Trả list mã nguồn đã mutate (mỗi mutant đổi đúng 1 vị trí)."""
    try:
        base = ast.parse(src)
    except SyntaxError:
        return []
    n = len(_sites(base))
    mutants = []
    for i in range(min(n, MAX_MUTANTS)):
        tree = ast.parse(src)
        node, kind = _sites(tree)[i]
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


# --------------------------------------------------------------------------- #
def strip_self_imports(test_code: str, func_name: str) -> str:
    """Bỏ các dòng import module-under-test (đoán sai) để không ModuleNotFound."""
    guesses = {"solution", "example", "module_under_test", "under_test",
               "main", "code", "src", func_name}
    keep = []
    for line in test_code.splitlines():
        s = line.strip()
        if s.startswith(("from ", "import ")) and any(g in s.split() or g in s for g in guesses):
            # giữ lại import thư viện chuẩn (pytest, math, ...)
            if any(g in s for g in guesses) and "pytest" not in s:
                continue
        keep.append(line)
    return "\n".join(keep)


def _run(cmd, cwd, timeout=PYTEST_TIMEOUT):
    return subprocess.run(cmd, cwd=cwd, capture_output=True, text=True, timeout=timeout)


def branch_coverage(workdir: str) -> float:
    _run([PY, "-m", "coverage", "run", "--branch", "-m", "pytest", "-q", "test_gen.py"], workdir)
    _run([PY, "-m", "coverage", "json", "-o", "cov.json"], workdir)
    path = os.path.join(workdir, "cov.json")
    if not os.path.exists(path):
        return 0.0
    data = json.load(open(path))
    for fpath, info in data.get("files", {}).items():
        if os.path.basename(fpath) == "solution.py":
            s = info["summary"]
            nb = s.get("num_branches", 0)
            if nb > 0:
                return round(s.get("covered_branches", 0) / nb * 100, 2)
            return round(s.get("percent_covered", 0.0), 2)
    return 0.0


def mutation_score(workdir: str, base_src: str) -> float:
    muts = gen_mutants(base_src)
    if not muts:
        return 0.0
    sol = os.path.join(workdir, "solution.py")
    killed = 0
    for m in muts:
        open(sol, "w", encoding="utf-8").write(m)
        try:
            r = _run([PY, "-m", "pytest", "-q", "test_gen.py"], workdir, timeout=30)
            if r.returncode != 0:          # test fail -> mutant bị giết
                killed += 1
        except subprocess.TimeoutExpired:
            killed += 1                    # treo = coi như giết (vòng lặp vô hạn do mutate)
    open(sol, "w", encoding="utf-8").write(base_src)   # khôi phục
    return round(killed / len(muts) * 100, 2)


def measure_one(code: str, func_name: str, test_code: str) -> dict:
    with tempfile.TemporaryDirectory() as wd:
        open(os.path.join(wd, "solution.py"), "w", encoding="utf-8").write(code)
        test = "from solution import *\n" + strip_self_imports(test_code, func_name)
        open(os.path.join(wd, "test_gen.py"), "w", encoding="utf-8").write(test)
        # compiled? thử collect
        try:
            r = _run([PY, "-m", "pytest", "--collect-only", "-q", "test_gen.py"], wd, timeout=30)
            compiled = 1 if r.returncode in (0, 5) and "error" not in r.stdout.lower() else 0
            if r.returncode not in (0, 5):
                compiled = 0
        except Exception:
            compiled = 0
        if not compiled:
            return {"branch_coverage": 0.0, "mutation_score": 0.0, "compiled": 0}
        try:
            bc = branch_coverage(wd)
            ms = mutation_score(wd, code)
            return {"branch_coverage": bc, "mutation_score": ms, "compiled": 1}
        except Exception:
            return {"branch_coverage": 0.0, "mutation_score": 0.0, "compiled": 0}


def main() -> None:
    ap = argparse.ArgumentParser(description="Đo coverage + mutation cho test Python (MS)")
    ap.add_argument("--functions", required=True, help="functions.csv (function_id,language,code,cc,function_name)")
    ap.add_argument("--tests", required=True, help="CSV co cot function_id + generated_test")
    ap.add_argument("--method", default="gpt4o-mini", help="ten phuong phap ghi vao metrics.csv")
    ap.add_argument("--out", default="results/metrics.csv")
    args = ap.parse_args()

    fdf = pd.read_csv(args.functions)
    tdf = pd.read_csv(args.tests)
    fmap = {str(r["function_id"]): r for _, r in fdf.iterrows()}

    rows = []
    pyn = tdf.merge(fdf[["function_id"]], on="function_id")  # chỉ id có trong functions
    for _, t in tdf.iterrows():
        fid = str(t["function_id"])
        f = fmap.get(fid)
        if f is None or str(f["language"]).lower() != "python":
            continue
        name = str(f.get("function_name", "")) or ""
        res = measure_one(str(f["code"]), name, str(t.get("generated_test", "")))
        rows.append({"function_id": fid, "language": "python", "cc": f["cc"],
                     "method": args.method, **res})
        print(f"{fid}: compiled={res['compiled']} bc={res['branch_coverage']} ms={res['mutation_score']}")

    os.makedirs(os.path.dirname(args.out) or ".", exist_ok=True)
    df = pd.DataFrame(rows)
    if os.path.exists(args.out):                       # gộp với metrics đã có (vd Java)
        old = pd.read_csv(args.out)
        df = pd.concat([old, df], ignore_index=True).drop_duplicates(
            subset=["function_id", "method"], keep="last")
    df.to_csv(args.out, index=False)
    print(f"\nSaved {len(rows)} python rows -> {args.out}")


if __name__ == "__main__":
    main()

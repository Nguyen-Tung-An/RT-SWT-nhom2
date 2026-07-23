"""
measure_pynguin.py — Baseline Python (Pynguin) do THEO CUNG "Phuong an B" (module that,
khong sandbox) va CUNG harness bc/mutation nhu measure_python_module.py (GPT).

Khac voi GPT (1 test file rieng/ham, prompt one-shot theo tung ham), Pynguin sinh 1 TEST
SUITE CHO CA MODULE (khong target duoc 1 ham don le) — giong cach EvoSuite sinh theo CLASS
o phia Java. Vi vay: chay Pynguin 1 LAN / module (nhom theo cot `file` trong CSV), roi CAT
theo khoang dong [start_line,end_line] cua TUNG ham de tinh bc/mutation rieng — dung logic
filter nhu measure_java_from_reports.py da lam cho JaCoCo (EvoSuite Java).

Ghi ket qua vao CUNG file voi baseline Java (metrics_full.csv, method=pynguin,
language=python) — de analyze_8lib.py tu dong ghep cap RQ2-B (gpt vs pynguin) ma
khong can sua gi them (vong lap `for bmethod in base['method'].unique()`).

YEU CAU: bien moi truong PYNGUIN_DANGER_AWARE=1 (Pynguin thuc thi code that cua module —
da chap nhan tuong tu EvoSuite/Randoop o Java, cung mot loai rui ro "chay code that de
sinh test").

Usage (vi du 1 module de kiem tra truoc khi chay full):
  PYNGUIN_DANGER_AWARE=1 python ms-analysis/scripts/measure_pynguin.py \
      --csv data/full_ground_truth.csv --files flask/src/flask/logging.py \
      --search-time 60 --out ms-analysis/results/metrics_full.csv

Chay full (22 module, ~90s/module + mutation):
  PYNGUIN_DANGER_AWARE=1 python ms-analysis/scripts/measure_pynguin.py --search-time 90
"""
from __future__ import annotations

import argparse
import ast
import csv
import glob
import json
import os
import shutil
import subprocess
import sys
import tempfile

import greencheck

REPO_ROOT = os.path.dirname(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))
PY = sys.executable
# Interpreter rieng cho giai doan SINH. Hai giai doan can moi truong nguoc nhau:
#   sinh — Pynguin tu nap module qua --project-path. Neu package DA pip install thi
#          worker process cua no chet (requests.adapters: sinh duoc 28 test khi chua cai,
#          nhung "Could not restart worker process" khi da cai).
#   do   — suite lam `import requests.adapters`, BAT BUOC package phai import duoc.
# Nen tach bang HAI INTERPRETER thay vi cai/go qua lai giua chung.
PYNGUIN_PY = PY
MAX_MUTANTS = 20
PYTEST_TIMEOUT = 120

_BIN = {ast.Add: ast.Sub, ast.Sub: ast.Add, ast.Mult: ast.Div, ast.Div: ast.Mult}
_CMP = {ast.Gt: ast.GtE, ast.GtE: ast.Gt, ast.Lt: ast.LtE, ast.LtE: ast.Lt,
        ast.Eq: ast.NotEq, ast.NotEq: ast.Eq}
_BOOL = {ast.And: ast.Or, ast.Or: ast.And}


def run(cmd, cwd, timeout=PYTEST_TIMEOUT, env=None):
    e = os.environ.copy()
    if env:
        e.update(env)
    return subprocess.run(cmd, cwd=cwd, capture_output=True, text=True,
                          encoding="utf-8", errors="replace", timeout=timeout, env=e)


def module_file(row):
    f = row["file"].replace("\\", "/")
    idx = f.find("raw/")
    rel = f[idx + len("raw/"):] if idx >= 0 else f
    return os.path.normpath(os.path.join(REPO_ROOT, "data", "raw", rel))


def project_and_module(row):
    """data/raw/flask/src/flask/json/provider.py -> (project=data/raw/flask/src, module=flask.json.provider)"""
    f = module_file(row)
    parts = f.replace("\\", "/").split("/")
    i = parts.index("src")
    project = os.path.normpath("/".join(parts[:i + 1]))
    mod = ".".join(parts[i + 1:]).removesuffix(".py")
    return project, mod


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
            return None
        return round(len(ex) / total * 100, 2)
    return None


SAVE_DIR = os.path.join(REPO_ROOT, "generated_tests", "pynguin", "python")
LOG_DIR = os.path.join(REPO_ROOT, "pynguin-report", "run-logs")
SEC_PER_200_LOC = 90          # budget co so
MAX_SEARCH_TIME = 900         # tran an toan


def scaled_budget(module_path, base=SEC_PER_200_LOC):
    """Budget ti le kich thuoc module.

    Audit sau bao ve: Pynguin that bai HOAN TOAN tren module lon (flask/app.py 1625 LOC,
    flask/cli.py 1127 LOC) trong khi moi module <=385 LOC deu cho suite do duoc. Budget
    90s co dinh khong du cho file lon -> nang theo LOC de baseline duoc doi xu cong bang.
    """
    try:
        loc = sum(1 for _ in open(module_path, encoding="utf-8", errors="replace"))
    except OSError:
        return base
    return max(base, min(MAX_SEARCH_TIME, int(base * (loc / 200.0))))


def gen_pynguin_suite(project, mod, search_time, work_root, module_path=None):
    """Chay Pynguin 1 lan cho ca module, tra ve duong dan file test sinh ra (hoac None).

    Khac ban cu: (1) budget scale theo LOC, (2) LUU suite + log ra repo de lan sau chi
    can do lai, khong phai sinh lai (truoc day sinh vao temp dir roi mat -> thu muc
    generated_tests/pynguin trong 0 file, khong the tai kiem chung).
    """
    if module_path:
        search_time = scaled_budget(module_path)
    out_dir = os.path.join(work_root, "pynguin_out_" + mod.replace(".", "_"))
    shutil.rmtree(out_dir, ignore_errors=True)
    os.makedirs(out_dir, exist_ok=True)
    cmd = [PYNGUIN_PY, "-m", "pynguin", "--project-path", project, "--output-path", out_dir,
           "--module-name", mod, "--maximum-search-time", str(search_time)]
    # NHANH P-fixed (dang ky truoc): tat master-worker. Pynguin mac dinh fork worker roi
    # dung dill tuan tu hoa trang thai module, chet tren type object C-extension khong
    # resolve duoc bang ten (_ctypes._CData, _json.Scanner) -> rc=2, khong sinh gi.
    # Da kiem chung: flask.app tu crash -> chay duoc khi tat.
    if os.environ.get("PYNGUIN_FIXED") == "1":
        cmd += ["--nouse_master_worker", "--nosubprocess_if_recommended"]
    os.makedirs(LOG_DIR, exist_ok=True)
    log_path = os.path.join(LOG_DIR, mod.replace(".", "_") + ".log")
    try:
        r = run(cmd, REPO_ROOT, timeout=search_time + 120, env={"PYNGUIN_DANGER_AWARE": "1"})
    except subprocess.TimeoutExpired:
        with open(log_path, "w", encoding="utf-8") as fh:
            fh.write(f"TIMEOUT sau {search_time + 120}s\ncmd: {' '.join(cmd)}\n")
        print(f"  !! pynguin TIMEOUT cho {mod} (budget {search_time}s)")
        return None

    with open(log_path, "w", encoding="utf-8") as fh:
        fh.write(f"cmd: {' '.join(cmd)}\nrc={r.returncode}\n\n[stdout]\n{r.stdout}\n"
                 f"[stderr]\n{r.stderr}\n")

    tests = glob.glob(os.path.join(out_dir, "test_*.py"))
    if not tests:
        tail = "\n".join(l for l in (r.stdout + r.stderr).splitlines() if l.strip())[-400:]
        print(f"  !! pynguin khong sinh test cho {mod} (rc={r.returncode}, "
              f"budget {search_time}s) — log: {log_path}\n{tail}")
        return None

    os.makedirs(SAVE_DIR, exist_ok=True)
    saved = os.path.join(SAVE_DIR, "test_" + mod.replace(".", "_") + ".py")
    shutil.copy(tests[0], saved)
    print(f"  .. {mod}: budget {search_time}s, suite luu tai {saved}")
    return tests[0]


def measure_module(mod_file, rows, test_path):
    """1 test suite (Pynguin) dung chung cho TAT CA ham trong `rows` (cung 1 file)."""
    results = {r["func_id"]: {"branch_coverage": 0.0, "mutation_score": "", "compiled": 0} for r in rows}

    with tempfile.TemporaryDirectory() as wd:
        tf = os.path.join(wd, os.path.basename(test_path))
        shutil.copy(test_path, tf)

        # 1) GREEN-CHECK theo TUNG TEST — truoc day 1 test hong zero CA MODULE
        all_nodes, green, mode = greencheck.green_nodes(tf, wd)
        if not green:
            print(f"  !! RED-ON-ORIGINAL {mod_file} ({mode}, 0/{len(all_nodes)} test xanh)")
            return results
        if mode == "per-test":
            print(f"  .. {mod_file}: giu {len(green)}/{len(all_nodes)} test xanh")
        sel = greencheck.pytest_args(tf, green, all_nodes)

        # 2) BRANCH COVERAGE toan module (1 lan), cat theo tung ham sau
        run([PY, "-m", "coverage", "run", "--branch", f"--include={mod_file}",
             "-m", "pytest", "-q", "-p", "no:cacheprovider", *sel], wd)
        run([PY, "-m", "coverage", "json", "-o", "cov.json"], wd)
        cj = os.path.join(wd, "cov.json")
        cov_json = json.load(open(cj)) if os.path.exists(cj) else {"files": {}}

        for r_row in rows:
            fid, lo, hi = r_row["func_id"], int(r_row["start_line"]), int(r_row["end_line"])
            bc = branch_cov_in_range(cov_json, mod_file, lo, hi)
            results[fid]["branch_coverage"] = 0.0 if bc is None else bc
            results[fid]["compiled"] = 1

        # 3) MUTATION theo tung ham (mutate 1 vi tri, chay lai CA suite, khoi phuc)
        original_bytes = open(mod_file, "rb").read()
        original = original_bytes.decode("utf-8")
        try:
            for r_row in rows:
                fid, lo, hi = r_row["func_id"], int(r_row["start_line"]), int(r_row["end_line"])
                muts = gen_module_mutants(original, lo, hi)
                if not muts:
                    results[fid]["mutation_score"] = ""
                    continue
                killed = 0
                for m in muts:
                    open(mod_file, "w", encoding="utf-8", newline="\n").write(m)
                    try:
                        rr = run([PY, "-m", "pytest", "-q", "-p", "no:cacheprovider", *sel], wd, timeout=90)
                        if rr.returncode != 0:
                            killed += 1
                    except subprocess.TimeoutExpired:
                        killed += 1
                    finally:
                        open(mod_file, "wb").write(original_bytes)
                results[fid]["mutation_score"] = round(killed / len(muts) * 100, 2)
                print(f"    {fid}: bc={results[fid]['branch_coverage']} ms={results[fid]['mutation_score']}")
        finally:
            open(mod_file, "wb").write(original_bytes)

    return results


def save_rows(out_csv, method, new_rows):
    fields = ["function_id", "language", "cc", "method", "branch_coverage", "mutation_score", "compiled", "note"]
    old = []
    if os.path.exists(out_csv):
        with open(out_csv, encoding="utf-8-sig") as f:
            old = [r for r in csv.DictReader(f)
                   if not (r["method"] == method and any(r["function_id"] == n["function_id"] for n in new_rows))]
    with open(out_csv, "w", encoding="utf-8", newline="") as f:
        w = csv.DictWriter(f, fieldnames=fields)
        w.writeheader()
        for r in old + new_rows:
            w.writerow({k: r.get(k, "") for k in fields})


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--csv", default=os.path.join("data", "full_ground_truth.csv"))
    ap.add_argument("--out", default=os.path.join("ms-analysis", "results", "metrics_full.csv"))
    ap.add_argument("--search-time", type=int, default=90, help="giay Pynguin duoc tim moi module")
    ap.add_argument("--gen-only", action="store_true",
                    help="chi SINH suite va luu lai, bo qua giai doan do")
    ap.add_argument("--pynguin-python", default="",
                    help="interpreter chay Pynguin (venv KHONG cai flask/requests)")
    ap.add_argument("--use-saved", action="store_true",
                    help="do lai suite da luu trong generated_tests/pynguin thay vi sinh moi "
                         "(tach giai doan sinh khoi giai doan do — xem ghi chu o main)")
    ap.add_argument("--files", default="", help="loc theo file (phay), vd flask/src/flask/logging.py — de test truoc khi chay full")
    args = ap.parse_args()

    global PYNGUIN_PY
    if args.pynguin_python:
        # tuyet doi hoa: subprocess tren Windows khong giai duoc duong dan tuong doi
        PYNGUIN_PY = os.path.abspath(args.pynguin_python)
        if not os.path.exists(PYNGUIN_PY):
            print(f"LOI: khong thay interpreter {PYNGUIN_PY}")
            return 1
        print(f"Giai doan SINH dung: {PYNGUIN_PY}")

    if os.environ.get("PYNGUIN_DANGER_AWARE") != "1":
        print("LOI: can PYNGUIN_DANGER_AWARE=1 (Pynguin thuc thi code that cua module).")
        return 1

    src_rows = [r for r in csv.DictReader(open(os.path.join(REPO_ROOT, args.csv), encoding="utf-8-sig"))
                if r["language"] == "python"]
    by_file = {}
    for r in src_rows:
        by_file.setdefault(r["file"], []).append(r)

    want_files = {s.strip() for s in args.files.split(",") if s.strip()}
    work_root = os.path.join(REPO_ROOT, "ms-analysis", "results", "_pynguin_work")
    os.makedirs(work_root, exist_ok=True)
    out_csv = os.path.join(REPO_ROOT, args.out)

    all_results = []
    for file_key, rows in sorted(by_file.items()):
        if want_files and not any(w in file_key for w in want_files):
            continue
        mod_file = module_file(rows[0])
        project, mod = project_and_module(rows[0])
        print(f"\n================ {mod} ({len(rows)} ham) ================")
        if not os.path.exists(mod_file):
            print(f"  !! khong thay {mod_file}, bo qua")
            for r in rows:
                all_results.append({"function_id": r["func_id"], "language": "python", "cc": r["cc"],
                                    "method": "pynguin", "branch_coverage": 0, "mutation_score": "",
                                    "compiled": 0, "note": "module-file-missing"})
            continue
        try:
            # --use-saved: TACH giai doan sinh khoi giai doan do.
            # Ly do (audit sau bao ve): hai giai doan doi hoi moi truong NGUOC NHAU.
            #   sinh  — Pynguin tu tim module qua --project-path; neu package DA duoc pip
            #           install thi worker process cua no chet (xem audit-pynguin-0pct.md)
            #   do    — suite sinh ra lam `import requests.adapters`, BAT BUOC package
            #           phai import duoc
            # Harness cu lam ca hai trong CUNG moi truong da cai -> tu pha giai doan sinh.
            saved = os.path.join(SAVE_DIR, "test_" + mod.replace(".", "_") + ".py")
            if args.use_saved and os.path.exists(saved):
                print(f"  .. dung suite da luu: {saved}")
                test_path = saved
            else:
                test_path = gen_pynguin_suite(project, mod, args.search_time, work_root,
                                              module_path=mod_file)
            if not test_path:
                for r in rows:
                    all_results.append({"function_id": r["func_id"], "language": "python", "cc": r["cc"],
                                        "method": "pynguin", "branch_coverage": 0, "mutation_score": "",
                                        "compiled": 0, "note": "pynguin-no-output"})
                save_rows(out_csv, "pynguin", all_results)
                continue
            if args.gen_only:
                print("  (--gen-only) da sinh xong, bo qua do.")
                continue
            res = measure_module(mod_file, rows, test_path)
            for r in rows:
                rr = res[r["func_id"]]
                all_results.append({"function_id": r["func_id"], "language": "python", "cc": r["cc"],
                                    "method": "pynguin", **rr})
            save_rows(out_csv, "pynguin", all_results)
        except Exception as e:  # noqa: BLE001 — 1 module loi khong duoc lam mat du lieu cac module khac
            print(f"  !! {mod}: loi khong xu ly duoc, ghi INVALID: {e!r}")
            for r in rows:
                all_results.append({"function_id": r["func_id"], "language": "python", "cc": r["cc"],
                                    "method": "pynguin", "branch_coverage": 0, "mutation_score": 0, "compiled": 0})
            save_rows(out_csv, "pynguin", all_results)

    print(f"\nXONG. {len(all_results)} hang -> {out_csv}")
    return 0


if __name__ == "__main__":
    sys.exit(main())

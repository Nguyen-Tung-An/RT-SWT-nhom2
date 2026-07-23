"""Do MUTATION TRONG KHOANG DONG CUA HAM DICH — tieu chi that su co nghia.

Vi sao can script nay. Moi tieu chi da bao cao truoc do deu la TANG NONG:
    bien dich duoc      -> chua noi len test co chay khong
    >=1 test pass       -> chua noi len test co cham ham dich khong
    branch_coverage > 0 -> chua noi len test co PHAT HIEN duoc loi khong
Mot test chay xanh, cham dung ham, nhung khong giet duoc mutant nao thi khong bao ve duoc
gi ca — no chi khang dinh 'goi ham nay khong nem exception'.

Con so that tren du lieu bai bao:
    Python  15/60 (25.0%) co mutation > 0
    Java     1/60 ( 1.7%) co mutation > 0
Java: mot ham duy nhat tren 60. Do moi la ket qua, phan con lai la ket qua suong.

Script nay do lai tren CAC SUITE HIEN TAI (sau v2/v3/vong sua loi) de biet cac ban va co
dich chuyen duoc tang 4 khong, hay chi lam dep tang nong.

Dung lai dong co dot bien AST cua measure_python_module.py (swap +/-, x/:, >/>=, </<=,
==/!=, and/or, dao bool const, +1 numeric const; toi da 20 mutant/ham) de so sanh duoc
truc tiep voi so lieu bai bao.

Chay:
  python ms-analysis/scripts/mutation_on_target.py --suite v3
  python ms-analysis/scripts/mutation_on_target.py --suite best   # v3 + ban sua loi tot nhat
"""
from __future__ import annotations

import argparse
import ast
import csv
import os
import shutil
import subprocess
import sys
import tempfile

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import greencheck  # noqa: E402
import measure_python_module as M  # noqa: E402

REPO = M.REPO_ROOT
PY = sys.executable
CONFTEST = os.path.join(REPO, "data", "raw", "flask", "tests", "conftest.py")

# ---- BAN SAO CO LAP -------------------------------------------------------------
# Dot bien phai GHI DE file nguon. Neu ghi thang vao data/raw/*/src thi bat ky tien trinh
# nao khac dang do tren cung cay nguon (vd mot workflow chay song song) se doc phai ma da
# bi dot bien -> ket qua cua HO sai ma khong ai biet.
# Nen: sao ca cay nguon ra thu muc tam, dot bien tren BAN SAO, va dat ban sao len dau
# PYTHONPATH. Da kiem chung ban sao de duoc editable install.
SHADOW: dict[str, str] = {}


def make_shadow() -> str:
    """Sao flask/src va requests/src ra 1 thu muc tam dung chung. Tra ve duong dan do."""
    import atexit
    if SHADOW.get("dir"):
        return SHADOW["dir"]
    d = tempfile.mkdtemp(prefix="mut_shadow_")
    for pkg in ("flask", "requests"):
        src = os.path.join(REPO, "data", "raw", pkg, "src")
        if os.path.isdir(src):
            for entry in os.listdir(src):
                s_, d_ = os.path.join(src, entry), os.path.join(d, entry)
                if os.path.isdir(s_):
                    shutil.copytree(s_, d_, dirs_exist_ok=True)
                else:
                    shutil.copy2(s_, d_)
    SHADOW["dir"] = d
    atexit.register(lambda: shutil.rmtree(d, ignore_errors=True))
    return d


def shadow_path(mod_file: str) -> str:
    """Duong dan tuong ung cua mod_file trong ban sao."""
    f = mod_file.replace("\\", "/")
    i = f.find("/src/")
    return os.path.join(make_shadow(), f[i + 5:]) if i >= 0 else mod_file


def run_env(cmd, cwd, timeout=120):
    e = os.environ.copy()
    e["PYTHONPATH"] = make_shadow() + os.pathsep + e.get("PYTHONPATH", "")
    e["PYTHONDONTWRITEBYTECODE"] = "1"
    return subprocess.run(cmd, cwd=cwd, capture_output=True, text=True,
                          encoding="utf-8", errors="replace", timeout=timeout, env=e)


SUITES = {
    "ho_v1": ["generated_tests/heldout_v1/python"],  # HELDOUT_MT
    "ho_v3": ["generated_tests/heldout_v3/python"],
    "v1": ["generated_tests/gpt4o/python"],
    "v2": ["generated_tests/gpt4o_v2/python"],
    "v3": ["generated_tests/gpt4o_v3/python"],
    # 'best': uu tien ban da sua loi, lui ve v3 neu khong co
    "best": ["generated_tests/gpt4o_v3r2c/python", "generated_tests/gpt4o_v3/python"],
    "clean_v1": ["generated_tests/clean_v1/python"],
    "clean_v3": ["generated_tests/clean_v3/python"],
    "clean_v3fair": ["generated_tests/clean_v3fair/python"],
}


def find_test(fid: str, dirs: list[str]) -> str | None:
    for d in dirs:
        for name in (f"test_{fid.replace('-', '_').lower()}.py", f"test_{fid}.py"):
            p = os.path.join(REPO, d, name)
            if os.path.exists(p):
                return p
    return None


def measure(rec: dict, test_path: str, with_conftest: bool) -> dict:
    """-> {branch_coverage, mutation_score, n_mutant, n_killed, note}"""
    mod_file = M.module_file(rec) if hasattr(M, "module_file") else None
    if mod_file is None:
        f = rec["file"].replace("\\", "/")
        i = f.find("raw/")
        mod_file = os.path.normpath(os.path.join(REPO, "data", "raw", f[i + 4:]))
    lo, hi = int(rec["start_line"]), int(rec["end_line"])
    src = open(mod_file, encoding="utf-8", errors="replace").read()
    shadow_file = shadow_path(mod_file)   # chi GHI vao ban sao, khong bao gio vao ban goc

    with tempfile.TemporaryDirectory() as wd:
        tf = os.path.join(wd, os.path.basename(test_path))
        shutil.copy(test_path, tf)
        if with_conftest and os.path.exists(CONFTEST):
            shutil.copy(CONFTEST, os.path.join(wd, "conftest.py"))

        all_nodes, green, mode = greencheck.green_nodes(tf, wd)
        if not green:
            return {"branch_coverage": 0.0, "mutation_score": "", "n_mutant": 0,
                    "n_killed": 0, "note": f"khong co test xanh ({mode})"}
        sel = greencheck.pytest_args(tf, green, all_nodes)

        # branch coverage trong khoang dong ham
        run_env([PY, "-m", "coverage", "run", "--branch", f"--include={shadow_file}",
                 "-m", "pytest", "-q", "-p", "no:cacheprovider", *sel], wd)
        run_env([PY, "-m", "coverage", "json", "-o", os.path.join(wd, "c.json")], wd)
        bc = 0.0
        try:
            import json
            cj = json.load(open(os.path.join(wd, "c.json"), encoding="utf-8"))
            norm = os.path.normcase(os.path.normpath(shadow_file))
            for fp, info in cj.get("files", {}).items():
                if os.path.normcase(os.path.normpath(os.path.abspath(fp))) != norm:
                    continue
                ex = [b for b in info.get("executed_branches", []) if lo <= b[0] <= hi]
                mi = [b for b in info.get("missing_branches", []) if lo <= b[0] <= hi]
                bc = round(len(ex) / (len(ex) + len(mi)) * 100, 2) if (ex or mi) else 0.0
        except Exception:  # noqa: BLE001
            pass

        if bc == 0.0:
            return {"branch_coverage": 0.0, "mutation_score": "", "n_mutant": 0,
                    "n_killed": 0, "note": "test xanh nhung KHONG cham ham dich"}

        # dot bien trong khoang dong ham
        mutants = M.gen_module_mutants(src, lo, hi)
        if not mutants:
            return {"branch_coverage": bc, "mutation_score": "", "n_mutant": 0,
                    "n_killed": 0, "note": "khong co diem dot bien (metric khong xac dinh)"}
        killed = 0
        for mut in mutants:
            # GHI VAO BAN SAO. Ghi vao mod_file goc se lam hong phep do cua bat ky tien
            # trinh nao khac dang doc cung cay nguon.
            open(shadow_file, "w", encoding="utf-8", newline="\n").write(mut)
            try:
                r = run_env([PY, "-m", "pytest", "-q", "-p", "no:cacheprovider", *sel],
                            wd, timeout=60)
                killed += (r.returncode != 0)
            except subprocess.TimeoutExpired:
                killed += 1
            finally:
                open(shadow_file, "w", encoding="utf-8", newline="\n").write(src)
        return {"branch_coverage": bc,
                "mutation_score": round(killed / len(mutants) * 100, 2),
                "n_mutant": len(mutants), "n_killed": killed, "note": ""}


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("--suite", default="best", choices=sorted(SUITES))
    ap.add_argument("--with-conftest", action="store_true", default=True)
    ap.add_argument("--limit", type=int, default=0)
    a = ap.parse_args()

    gt = [r for r in csv.DictReader(open(os.path.join(REPO, os.environ.get("MT_GT","data/full_ground_truth.csv")),
                                         encoding="utf-8-sig")) if r["language"] == "python"]
    if a.limit:
        gt = gt[:a.limit]

    out, rows = os.path.join(REPO, "ms-analysis", "results",
                             f"mutation_on_target_{a.suite}.csv"), []
    for i, rec in enumerate(gt, 1):
        fid = rec["func_id"]
        tp = find_test(fid, SUITES[a.suite])
        if not tp:
            rows.append({"func_id": fid, "branch_coverage": 0.0, "mutation_score": "",
                         "n_mutant": 0, "n_killed": 0, "note": "khong co file test"})
            print(f"  [{i:2d}/{len(gt)}] {fid}  khong co file test")
            continue
        try:
            r = measure(rec, tp, a.with_conftest)
        except Exception as e:  # noqa: BLE001
            r = {"branch_coverage": 0.0, "mutation_score": "", "n_mutant": 0,
                 "n_killed": 0, "note": f"loi: {type(e).__name__}"}
        rows.append({"func_id": fid, **r})
        ms = r["mutation_score"]
        print(f"  [{i:2d}/{len(gt)}] {fid}  bc={r['branch_coverage']:5.1f}  "
              f"ms={ms if ms != '' else '  -  '}  "
              f"({r['n_killed']}/{r['n_mutant']})  {r['note']}")

    with open(out, "w", encoding="utf-8", newline="") as fh:
        w = csv.DictWriter(fh, fieldnames=["func_id", "branch_coverage", "mutation_score",
                                           "n_mutant", "n_killed", "note"])
        w.writeheader()
        w.writerows(rows)

    n = len(rows)
    pos = sum(1 for r in rows if r["mutation_score"] not in ("", None) and float(r["mutation_score"]) > 0)
    touch = sum(1 for r in rows if float(r["branch_coverage"] or 0) > 0)
    print(f"\n=== SUITE {a.suite} (n={n}) ===")
    print(f"  cham ham dich (bc>0)      : {touch}/{n} ({100 * touch / n:.1f}%)")
    print(f"  GIET DUOC MUTANT (ms>0)   : {pos}/{n} ({100 * pos / n:.1f}%)   <- tieu chi that")
    print(f"\n-> {out}")
    return 0


if __name__ == "__main__":
    sys.exit(main())

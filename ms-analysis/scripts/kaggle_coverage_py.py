# =====================================================================
# Kaggle MS - Do luong (Project Mode) - Nhom 2 / SE1944  [8-LIB / git] COVERAGE (RQ1/RQ3)
# Giu nguyen bai [BAN SUA 5], CHI va 3 loi khien 80% invalid tren Kaggle:
#   [FIX-A] EP flask/requests BAN PINNED (go ban Kaggle) + in version -> tranh sai version.
#   [FIX-B] BOC try/except quanh 'class YourClass(_RealCls)' -> het TypeError luc COLLECT (48 bai chet).
#   [FIX-C] Dem passed/failed that (0 test chay => invalid) thay cho do chuoi loi (truoc bo sot TypeError -> "ok" 0% ao).
#           + branch coverage that + doc theo 3 lop all/valid/touched (median lop 'all' bi 0 keo xuong).
# DUNG: click cell -> Ctrl+A -> Delete -> DAN TOAN BO file nay -> Run All. (Add Input = nhom2-data; Internet ON)
# =====================================================================
import os, sys, glob, re, csv, json, subprocess, shutil, importlib, tempfile
import importlib.util  # [FIX-D] 'import importlib' KHONG tu nap importlib.util -> _resolvable() AttributeError -> strip nham MOI import hop le (false-invalid hang loat neu chay o moi truong chua nap san util). Nap tuong minh de tai lap on dinh.

# ----- INPUT tu dong tim -----
_h = glob.glob("/kaggle/input/**/full_ground_truth.csv", recursive=True)
INPUT = os.path.dirname(os.path.dirname(_h[0])) if _h else "/kaggle/input"
OUT = "/kaggle/working/results_ms"
os.makedirs(OUT, exist_ok=True)
print("INPUT =", INPUT)
print("INPUT co:", os.listdir(INPUT) if os.path.isdir(INPUT) else "KHONG THAY")

# ----- Cai deps + NAP source flask/requests -----
subprocess.run([sys.executable, "-m", "pip", "-q", "install", "-U", "pytest", "coverage>=7.5", "scipy", "matplotlib"], check=False)
# [FIX-A] go flask/requests cua Kaggle de ep dung ban pinned trong dataset
subprocess.run([sys.executable, "-m", "pip", "-q", "uninstall", "-y", "flask", "requests"], check=False)  # chi flask/requests (clean env)
for pkg in ["flask", "requests"]:
    src = f"{INPUT}/data/raw/{pkg}"
    dst = f"/kaggle/working/{pkg}_src"
    if os.path.isdir(src):
        if not os.path.isdir(dst):
            shutil.copytree(src, dst)
        subprocess.run([sys.executable, "-m", "pip", "-q", "install", "-e", dst], capture_output=True, text=True)
        srcdir = os.path.join(dst, "src")
        use = srcdir if os.path.isdir(srcdir) else dst
        if use not in sys.path:
            sys.path.insert(0, use)
        print(pkg, "src ->", use)
    else:
        print(pkg, ": khong thay", src)
importlib.invalidate_caches()
# [FIX-A] xac nhan ban dang dung (phai tro /kaggle/working/*_src, KHONG phai /opt/conda)
print("== FLASK/REQUESTS dang dung ==")
for m in ("flask", "requests"):
    try:
        mm = importlib.import_module(m); print(" ", m, getattr(mm, "__version__", "?"), "->", getattr(mm, "__file__", "?"))
    except Exception as e:
        print(" ", m, "IMPORT LOI:", e)
for _d in ["werkzeug", "click", "jinja2", "urllib3"]:
    try:
        print("   dep", _d, getattr(importlib.import_module(_d), "__version__", "?"))
    except Exception as _e:
        print("   dep", _d, "loi:", str(_e)[:60])

# ----- Helpers (giu nguyen bai cu) -----
PH = ("your_module", "your_app", "module_under_test", "my_module", "app_module", "module", "proxy_module")

def _resolvable(root):
    try:
        return importlib.util.find_spec(root) is not None
    except Exception:
        return False

def strip_ph(code):
    out = []
    for ln in code.splitlines():
        if "# replace with" in ln.lower():
            continue
        m = re.match(r"^\s*from\s+([.\w]+)\s+import", ln) or re.match(r"^\s*import\s+([.\w]+)", ln)
        if m:
            root = m.group(1).lstrip(".").split(".")[0]
            if ln.lstrip().startswith("from .") or root in PH or not _resolvable(root):
                continue
        out.append(ln)
    return "\n".join(out)

def module_from_file(p):
    p = (p or "").strip().replace("\\", "/")
    if not p.endswith(".py"):
        return None
    p = p[:-3]
    if "/src/" in p:
        return p.split("/src/", 1)[1].replace("/", ".")
    for pkg in ("flask", "requests"):
        i = p.find("/" + pkg + "/")
        if i >= 0:
            return p[i + 1:].replace("/", ".")
    return None

def enclosing_class(mod, start):
    try:
        spec = importlib.util.find_spec(mod)
        lines = open(spec.origin, encoding="utf-8").read().splitlines()
    except Exception:
        return None
    for i in range(min(start, len(lines)) - 1, -1, -1):
        m = re.match(r"^class\s+([A-Za-z_]\w*)", lines[i])
        if m:
            return m.group(1)
    return None

def err_snippet(blob):
    for ln in reversed(blob.splitlines()):
        t = ln.strip()
        if re.search(r"(Error|Exception)\b", t) and (":" in t or t.endswith("Error")):
            return t[:90]
    return ""

# [FIX-C] branch coverage that (fallback line% neu ham khong co nhanh)
def func_cov(cj, base, s, e):
    if not os.path.exists(cj):
        return 0.0
    d = json.load(open(cj))
    for f, info in d.get("files", {}).items():
        if os.path.basename(f) == base:
            rng = set(range(s, e + 1))
            ex = [l for l in info.get("executed_lines", []) if l in rng]
            mis = [l for l in info.get("missing_lines", []) if l in rng]
            t = len(ex) + len(mis); linep = round(len(ex) / t * 100, 2) if t else 0.0
            eb = [b for b in info.get("executed_branches", []) if b and b[0] in rng]
            mb = [b for b in info.get("missing_branches", []) if b and b[0] in rng]
            tb = len(eb) + len(mb)
            return round(len(eb) / tb * 100, 2) if tb else linep
    return 0.0

def measure(mod, test_code, base, s, e, func_name=""):
    real = enclosing_class(mod, s)
    prelude = f"import pytest\nfrom {mod} import *\n"
    fn = (func_name or "").strip()
    if re.fullmatch(r"[A-Za-z_]\w*", fn):
        prelude += f"try:\n    from {mod} import {fn}\nexcept Exception:\n    pass\n"
    if real:
        # [FIX-B] boc try/except: class flask khong subclass duoc -> fallback plain, KHONG chet collect
        prelude += (f"try:\n    from {mod} import {real} as _RealCls\nexcept Exception:\n    _RealCls = object\n"
                    f"try:\n    class YourClass(_RealCls):\n        def __init__(self, *a, **k):\n            pass\n"
                    f"except Exception:\n    class YourClass:\n        def __init__(self, *a, **k):\n            pass\n")
    body = strip_ph(test_code)
    selfimpl = bool(fn and re.search(rf"^\s*def\s+{re.escape(fn)}\s*\(", body, re.M))
    with tempfile.TemporaryDirectory() as wd:
        open(f"{wd}/test_x.py", "w").write(prelude + "\n" + body)
        env = dict(os.environ); env["PYTHONPATH"] = os.pathsep.join(sys.path)
        r = subprocess.run([sys.executable, "-m", "coverage", "run", "--branch", f"--source={mod}", "-m", "pytest", "-q", "test_x.py"],
                           cwd=wd, capture_output=True, text=True, env=env)
        blob = r.stdout + r.stderr
        # [FIX-C] dem test that: 0 test chay (passed+failed==0) => invalid THAT
        pm = re.search(r"(\d+) passed", blob); fm = re.search(r"(\d+) failed", blob)
        passed = int(pm.group(1)) if pm else 0; failed = int(fm.group(1)) if fm else 0
        if passed + failed == 0:
            note = "invalid:" + (err_snippet(blob) or "no-test")
            return 0, 0.0, note, passed, failed
        subprocess.run([sys.executable, "-m", "coverage", "json", "-o", "cov.json"], cwd=wd, capture_output=True, text=True, env=env)
        cov = func_cov(f"{wd}/cov.json", base, s, e)
        note = "ok-selfimpl" if selfimpl else ("ok-no-touch" if cov == 0.0 else "ok")
        return 1, cov, note, passed, failed


# ----- Do GPT tests (project mode) -----
gt = {r["func_id"]: r for r in csv.DictReader(open(f"{INPUT}/csv/full_ground_truth.csv")) if r["language"] == "python"}
tests = {}
for tp in glob.glob(f"{INPUT}/generated_tests/gpt4o/python/*.py"):
    m = re.search(r"(PY[_-]?\d+)", os.path.basename(tp), re.I)
    if m:
        tests[m.group(1).replace("_", "-").upper()] = open(tp, encoding="utf-8").read()
rows = []
for fid in sorted(gt):
    r = gt[fid]
    if fid not in tests:
        rows.append({"function_id": fid, "language": "python", "cc": r["cc"], "method": "gpt4o-mini", "branch_coverage": 0.0, "compiled": 0, "note": "no-test-file", "tests_passed": 0, "tests_failed": 0}); continue
    mod = module_from_file(r["file"])
    if not mod:
        rows.append({"function_id": fid, "language": "python", "cc": r["cc"], "method": "gpt4o-mini", "branch_coverage": 0.0, "compiled": 0, "note": "no-module-path", "tests_passed": 0, "tests_failed": 0}); continue
    c, cov, note, pa, fa = measure(mod, tests[fid], os.path.basename(r["file"]), int(r["start_line"]), int(r["end_line"]), r.get("func_name", ""))
    rows.append({"function_id": fid, "language": "python", "cc": r["cc"], "method": "gpt4o-mini", "branch_coverage": cov, "compiled": c, "note": note, "tests_passed": pa, "tests_failed": fa})
    print(fid, c, cov, note, f"pass={pa}/{pa+fa}")
print("\nSo ham do:", len(rows), "(can = 60)")

import pandas as pd, numpy as np
from scipy import stats
_df = pd.DataFrame(rows)
_df.to_csv(f"{OUT}/metrics_project.csv", index=False)
_df["note_cat"] = _df["note"].str.split(" | ", regex=False).str[0].str.split(":").str[0]
print("\n== NOTE breakdown =="); print(_df["note_cat"].value_counts())
print("Valid (>=1 test chay):", int(_df["compiled"].sum()), "/", len(_df), "| invalid-rate:", round((_df["compiled"] == 0).mean() * 100, 1), "%")
tp_ = _df["tests_passed"].sum(); tf_ = _df["tests_failed"].sum()
print("Pass-rate runtime:", int(tp_), "/", int(tp_ + tf_), "=", round(tp_ / (tp_ + tf_) * 100, 1) if (tp_ + tf_) else "n/a", "%")
print("\n== Loi chi tiet (invalid) =="); 
for n in sorted(set(_df.loc[_df["compiled"] == 0, "note"])): print("  -", n)

# [FIX-C] RQ1/RQ3 doc theo 3 lop; lop 'touched' (test cham ham that) la ket luan chinh
SUBSETS = {"all": _df, "valid": _df[_df["compiled"] == 1], "touched": _df[(_df["compiled"] == 1) & (_df["branch_coverage"] > 0)]}
out = []
for tag, sub in SUBSETS.items():
    x = sub["branch_coverage"].to_numpy(float); d = x - 80; d = d[d != 0]
    try: w, p = (stats.wilcoxon(d, alternative="greater") if d.size else (None, None))
    except ValueError: w, p = None, None
    out.append({"rq": f"RQ1_py_{tag}", "test": "one-sample Wilcoxon", "n": len(x), "stat": w, "p": p,
                "median": float(np.median(x)) if x.size else None,
                "decision": "reject H0 (>=80%)" if (p is not None and p < 0.05 and np.median(x) >= 80) else "fail to reject H0"})
    ss = sub[["cc", "branch_coverage"]].copy(); ss["cc"] = pd.to_numeric(ss["cc"], errors="coerce"); ss = ss.dropna()
    rho, pp = (stats.spearmanr(ss["cc"], ss["branch_coverage"]) if ss["cc"].nunique() > 1 else (None, None))
    out.append({"rq": f"RQ3_py_{tag}", "test": "Spearman", "n": len(ss), "stat": rho, "p": pp, "median": None,
                "decision": "reject H0 (tuong quan am)" if (rho is not None and rho < 0 and pp is not None and pp < 0.05) else "fail to reject H0"})
pd.DataFrame(out).to_csv(f"{OUT}/summary.csv", index=False)
print("\n== SUMMARY (doc lop 'touched') =="); print(pd.DataFrame(out).to_string(index=False))
print("\nLuu:", f"{OUT}/metrics_project.csv", "+", f"{OUT}/summary.csv")

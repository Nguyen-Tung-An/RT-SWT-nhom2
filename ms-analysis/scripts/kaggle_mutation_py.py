# =====================================================================
# Kaggle MS - MUTATION SCORE Python (mutmut) cho test gpt-4o-mini (flask/requests) — RQ2 phan (A) [8-LIB/git]
# Dán vào 1 cell -> Run All (Internet ON). Chạy RIÊNG, khác cell coverage/Java.
# Tái dùng ĐÚNG logic import/normalize của kaggle_ms_measure_v2.py, chỉ THÊM mutmut.
# KHÔNG bịa số: mutmut đo mutation THẬT. Baseline (phần B) cần Hải, không chế ở đây.
# Ra: /kaggle/working/results_py_mut/{metrics_py_mut.csv, summary_py_mut.csv}
#
# CÁCH ĐO (đã validate luồng trong sandbox):
#  - mutmut đòi baseline XANH. FIX: thay vì bỏ cả suite khi có test fail, ta chỉ lấy các node PASS
#    (pytest -v) rồi chạy mutmut trên chúng -> nhiều bài có điểm thật hơn (bài bị bỏ chỉ còn khi 0 test PASS).
#  - Scope per-function: gắn '# pragma: no mutate' cho mọi dòng NGOÀI [start,end] -> mutmut chỉ đột biến thân hàm.
#  - Điểm = (killed + timeout) / (killed + timeout + survived + suspicious) * 100, parse bằng `mutmut result-ids`.
#  - Test không chạm hàm thật (mock/self-impl) -> mutmut ra ~0 (mọi mutant sống) — đây là FINDING thật, không phải lỗi.
# =====================================================================
import os, sys, glob, re, csv, subprocess, shutil, importlib, tempfile, shlex
import importlib.util  # [FIX-D] xem kaggle_coverage_py: nap tuong minh, tranh _resolvable() strip nham import hop le

_h = glob.glob("/kaggle/input/**/full_ground_truth.csv", recursive=True)
INPUT = os.path.dirname(os.path.dirname(_h[0])) if _h else "/kaggle/input"
OUT = "/kaggle/working/results_py_mut"; os.makedirs(OUT, exist_ok=True)
print("INPUT =", INPUT)

# ----- deps: pin mutmut==2.4.4 (đã kiểm luồng), pytest, scipy -----
subprocess.run([sys.executable, "-m", "pip", "-q", "install", "-U", "pytest", "scipy"], check=False)
subprocess.run([sys.executable, "-m", "pip", "-q", "install", "mutmut==2.4.4"], check=False)
subprocess.run([sys.executable, "-m", "pip", "-q", "uninstall", "-y", "flask", "requests"], check=False)  # chi flask/requests (clean env)  # ep pinned
for pkg in ["flask", "requests"]:
    src = f"{INPUT}/data/raw/{pkg}"; dst = f"/kaggle/working/{pkg}_src"
    if os.path.isdir(src):
        if not os.path.isdir(dst): shutil.copytree(src, dst)
        subprocess.run([sys.executable, "-m", "pip", "-q", "install", "-e", dst], capture_output=True, text=True)
        srcdir = os.path.join(dst, "src"); use = srcdir if os.path.isdir(srcdir) else dst
        if use not in sys.path: sys.path.insert(0, use)
        print(pkg, "src ->", use)
importlib.invalidate_caches()

# ----- helpers COPY tu v2 (giu nguyen) -----
PH = ("your_module", "your_app", "module_under_test", "my_module", "app_module", "module", "proxy_module")

def _resolvable(root):
    try: return importlib.util.find_spec(root) is not None
    except Exception: return False

def strip_ph(code):
    out = []
    for ln in code.splitlines():
        if "# replace with" in ln.lower(): continue
        m = re.match(r"^\s*from\s+([.\w]+)\s+import", ln) or re.match(r"^\s*import\s+([.\w]+)", ln)
        if m:
            root = m.group(1).lstrip(".").split(".")[0]
            if ln.lstrip().startswith("from .") or root in PH or not _resolvable(root): continue
        out.append(ln)
    return "\n".join(out)

def module_from_file(p):
    p = (p or "").strip().replace("\\", "/")
    if not p.endswith(".py"): return None
    p = p[:-3]
    if "/src/" in p: return p.split("/src/", 1)[1].replace("/", ".")
    for pkg in ("flask", "requests"):
        i = p.find("/" + pkg + "/")
        if i >= 0: return p[i + 1:].replace("/", ".")
    return None

def enclosing_class(mod, start):
    try:
        spec = importlib.util.find_spec(mod)
        lines = open(spec.origin, encoding="utf-8").read().splitlines()
    except Exception:
        return None
    for i in range(min(start, len(lines)) - 1, -1, -1):
        m = re.match(r"^class\s+([A-Za-z_]\w*)", lines[i])
        if m: return m.group(1)
    return None

def build_test(mod, test_code, func_name=""):
    """prelude giong v2 + than test da strip -> chuoi test_x.py (base-class YourClass them o ngoai theo start that)"""
    prelude = f"import pytest\nfrom {mod} import *\n"
    fn = (func_name or "").strip()
    if re.fullmatch(r"[A-Za-z_]\w*", fn):
        prelude += f"try:\n    from {mod} import {fn}\nexcept Exception:\n    pass\n"
    body = strip_ph(test_code)
    selfimpl = bool(fn and re.search(rf"^\s*def\s+{re.escape(fn)}\s*\(", body, re.M))
    return prelude, body, selfimpl

def pytest_nodes(wd, testbase, env):
    """Chay pytest -v; tra ve (passed, failed, cat, [node PASSED]). Dung node PASS de chay mutmut suite XANH."""
    r = subprocess.run([sys.executable, "-m", "pytest", "-v", "--tb=no", "-p", "no:cacheprovider", testbase],
                       cwd=wd, capture_output=True, text=True, env=env)
    blob = r.stdout + r.stderr
    passing = re.findall(rf"^({re.escape(testbase)}::\S+)\s+PASSED", blob, re.M)
    pm = re.search(r"(\d+) passed", blob); fm = re.search(r"(\d+) failed", blob)
    p = int(pm.group(1)) if pm else len(passing); f = int(fm.group(1)) if fm else 0
    cat = ""
    if p + f == 0:
        if "SyntaxError" in blob: cat = "syntax"
        elif "errors during collection" in blob or "ModuleNotFoundError" in blob or "ImportError" in blob: cat = "import/collection"
        else: cat = "all-error"
    return p, f, cat, passing

def pragma_scope(origin, s, e):
    """Gan '# pragma: no mutate' cho moi dong NGOAI [s,e]. Tra ve noi dung goc de restore.
       An toan: bo qua dong ket thuc bang '\\' (line-continuation); compile-check truoc khi dung."""
    orig = open(origin, encoding="utf-8").read()
    lines = orig.split("\n"); out = []
    for i, ln in enumerate(lines, start=1):
        body = ln.rstrip("\r")
        if body.strip() and not (s <= i <= e) and not body.rstrip().endswith("\\"):
            ln = body + "  # pragma: no mutate"
        out.append(ln)
    new = "\n".join(out)
    try:
        compile(new, origin, "exec")
    except SyntaxError:
        return orig, False   # pragma lam hong (hiem) -> khong dung
    open(origin, "w", encoding="utf-8").write(new)
    return orig, True

def mutmut_score(wd, origin, runner, env):
    """chay mutmut + parse result-ids -> (score float|None, counts dict). runner = lenh pytest chi node PASS."""
    subprocess.run([sys.executable, "-m", "mutmut", "run", "--paths-to-mutate", origin,
                    "--tests-dir", wd, "--runner", runner],
                   cwd=wd, capture_output=True, text=True, env=env, timeout=300)
    cnt = {}
    for st in ("killed", "timeout", "survived", "suspicious"):
        r = subprocess.run([sys.executable, "-m", "mutmut", "result-ids", st],
                           cwd=wd, capture_output=True, text=True, env=env)
        cnt[st] = len((r.stdout or "").split())
    tot = sum(cnt.values())
    score = round((cnt["killed"] + cnt["timeout"]) / tot * 100, 2) if tot else None
    return score, cnt

# ----- doc gt + test -----
gt = {r["func_id"]: r for r in csv.DictReader(open(f"{INPUT}/csv/full_ground_truth.csv")) if r["language"] == "python"}
tests = {}
for tp in glob.glob(f"{INPUT}/generated_tests/gpt4o/python/*.py"):
    m = re.search(r"(PY[_-]?\d+)", os.path.basename(tp), re.I)
    if m: tests[m.group(1).replace("_", "-").upper()] = open(tp, encoding="utf-8").read()

rows = []
for fid in sorted(gt):
    r = gt[fid]; mod = module_from_file(r["file"]); s = int(r["start_line"]); e = int(r["end_line"])
    row = {"function_id": fid, "language": "python", "cc": r["cc"], "method": "gpt4o-mini", "mutation_score": "", "note": ""}
    if not mod or fid not in tests:
        row["note"] = "no-module-path" if not mod else "no-test-file"; rows.append(row); print(fid, row["note"]); continue
    try:
        spec = importlib.util.find_spec(mod); origin = spec.origin if spec else None
    except Exception:
        origin = None
    if not origin or not os.path.exists(origin):
        row["note"] = "no-origin"; rows.append(row); print(fid, "no-origin"); continue

    prelude, body, selfimpl = build_test(mod, tests[fid], r.get("func_name", ""))
    # them base-class YourClass neu co (giong v2)
    real = enclosing_class(mod, s)
    if real:
        prelude += (f"try:\n    from {mod} import {real} as _RealCls\nexcept Exception:\n    _RealCls = object\n"
                    f"try:\n    class YourClass(_RealCls):\n        def __init__(self, *a, **k):\n            pass\n"
                    f"except Exception:\n    class YourClass:\n        def __init__(self, *a, **k):\n            pass\n")
    with tempfile.TemporaryDirectory() as wd:
        open(os.path.join(wd, "test_x.py"), "w", encoding="utf-8").write(prelude + "\n" + body)
        env = dict(os.environ); env["PYTHONPATH"] = os.pathsep.join(sys.path)
        p, f, cat, passing = pytest_nodes(wd, "test_x.py", env)
        if p == 0 or not passing:   # khong co test nao PASS -> khong do duoc mutation
            row["note"] = ("invalid:" + cat) if p + f == 0 else f"no-passing-test(fail={f})"
            rows.append(row); print(fid, row["note"]); continue
        # CHI chay mutmut tren cac node PASS -> baseline mutmut XANH (fix: khong bo ca suite khi co test fail)
        runner = f"{sys.executable} -m pytest -q " + " ".join(shlex.quote(n) for n in passing)
        orig, ok = pragma_scope(origin, s, e)
        if not ok:
            row["note"] = "pragma-broke"; rows.append(row); print(fid, "pragma-broke"); continue
        try:
            score, cnt = mutmut_score(wd, origin, runner, env)
        except subprocess.TimeoutExpired:
            score, cnt = None, {}; row["note"] = "mut-timeout"
        finally:
            open(origin, "w", encoding="utf-8").write(orig)  # RESTORE nguon goc
        tag = f"(pass={p}/{p+f};{cnt.get('killed',0)}k/{sum(cnt.values()) if cnt else 0})"
        if score is None:
            if not row["note"]: row["note"] = "no-mutants" + tag
            print(fid, row["note"])
        else:
            row["mutation_score"] = score
            row["note"] = ("ok-selfimpl" if selfimpl else ("ok" if score > 0 else "ok-no-touch")) + tag
            print(fid, "mutation=", score, row["note"])
    rows.append(row)

# ----- ghi + RQ2 phan (A) Python: mutation median >= 60% -----
import pandas as pd, numpy as np
from scipy import stats
df = pd.DataFrame(rows); df.to_csv(f"{OUT}/metrics_py_mut.csv", index=False)
m = pd.to_numeric(df["mutation_score"], errors="coerce").dropna()
print("\n== Do mutation duoc:", len(m), "/", len(df), "ham (tren cac test PASS cua moi bai) | note:"); print(df["note"].value_counts())
out = []
if len(m):
    d = m.to_numpy(float) - 60; d = d[d != 0]
    try: w, pv = (stats.wilcoxon(d, alternative="greater") if d.size else (None, None))
    except ValueError: w, pv = None, None
    out.append({"rq": "RQ2A_python_mutation_vs_60", "n": len(m), "median": float(np.median(m)),
                "stat": w, "p": pv,
                "decision": "reject H0 (>=60%)" if (pv is not None and pv < 0.05 and np.median(m) >= 60) else "fail to reject H0"})
    print("Mutation median (Python):", round(float(np.median(m)), 2), "%")
pd.DataFrame(out).to_csv(f"{OUT}/summary_py_mut.csv", index=False)
print(pd.DataFrame(out).to_string(index=False) if out else "(chua do duoc mutation nao — co the do suite do/khong cham ham)")
print("\nLuu:", f"{OUT}/metrics_py_mut.csv", "+", f"{OUT}/summary_py_mut.csv")
print("LUU Y: RQ2 phan (A) - mutation cua GPT (Python). Phan (B) so baseline can Hai sinh baseline (Pynguin) commons-lang/flask.")

# =====================================================================
# PHAN TICH 8-LIB — dong bo dinh dang metrics cua nhom (git). Chay LOCAL.
# Gop: coverage+mutation gpt-4o-mini (Python do tren Kaggle, Java lay tu nhom) + baseline (git metrics_full.csv).
# Ra: RQ1 (cov>=80%), RQ2-A (mut>=60%), RQ2-B (gpt vs baseline), RQ3 (CC~cov), kem effect size.
# KHONG bia: chi tinh tren so co that; thieu phan nao thi bao "thieu".
#
# Dung:
#   python analyze_8lib.py --py-cov results/metrics_project.csv --py-mut results/metrics_py_mut.csv \
#          --baseline metrics_baseline_git.csv [--java-gpt results/metrics_java_gpt.csv] --out results
# Dinh dang metrics chuan git: function_id,language,cc,method,branch_coverage,mutation_score,compiled
# =====================================================================
import os, argparse
import pandas as pd, numpy as np
from scipy import stats

ap = argparse.ArgumentParser()
ap.add_argument("--py-cov", default="", help="coverage Python gpt-4o-mini (metrics_project.csv)")
ap.add_argument("--py-mut", default="", help="mutation Python gpt-4o-mini (metrics_py_mut.csv)")
ap.add_argument("--java-gpt", default="", help="metrics Java gpt-4o-mini (tu nhom, dinh dang git)")
ap.add_argument("--baseline", default="metrics_baseline_git.csv", help="git metrics_full.csv (evosuite/randoop)")
ap.add_argument("--out", default="results")
A = ap.parse_args()
os.makedirs(A.out, exist_ok=True)

def rb_effect(d):
    d = np.asarray(d, float); d = d[d != 0]
    if d.size == 0: return None
    r = stats.rankdata(np.abs(d)); wp = r[d > 0].sum(); wn = r[d < 0].sum(); tot = wp + wn
    return round(float((wp - wn) / tot), 3) if tot else None

ALIAS = {"func_id":"function_id","id":"function_id","fid":"function_id","lang":"language",
         "coverage":"branch_coverage","branch_cov":"branch_coverage","bc":"branch_coverage","cov":"branch_coverage","line_coverage":"branch_coverage",
         "mutation":"mutation_score","mut":"mutation_score","ms":"mutation_score","mutation_pct":"mutation_score",
         "valid":"compiled","compile":"compiled"}
def load(path, tag):
    if not path or not os.path.exists(path):
        print(f"[thieu] {tag}: {path or '(khong truyen)'}"); return None
    df = pd.read_csv(path)
    df = df.rename(columns={c: ALIAS.get(c.strip().lower(), c.strip().lower()) for c in df.columns})
    if "language" not in df.columns: df["language"] = "java"   # file Java thuan
    df["language"] = df["language"].astype(str).str.lower().str.strip()
    if "compiled" not in df.columns: df["compiled"] = 1
    for c in ("branch_coverage", "mutation_score", "cc", "compiled"):
        if c in df.columns: df[c] = pd.to_numeric(df[c], errors="coerce")
    print(f"[ok] {tag}: {path} ({len(df)} dong)")
    return df

# ---- gop metrics gpt-4o-mini (Python do + Java tu nhom) ----
gpt = []
pc = load(A.py_cov, "Python coverage gpt")
if pc is not None:
    d = pc[["function_id", "language", "cc", "branch_coverage", "compiled"]].copy(); d["method"] = "gpt-4o-mini"
    gpt.append(d)
pm = load(A.py_mut, "Python mutation gpt")
jg = load(A.java_gpt, "Java gpt (tu nhom)")
if jg is not None:
    keep = [c for c in ("function_id", "language", "cc", "branch_coverage", "mutation_score", "compiled") if c in jg.columns]
    d = jg[keep].copy(); d["method"] = "gpt-4o-mini"; gpt.append(d)
gptdf = pd.concat(gpt, ignore_index=True) if gpt else pd.DataFrame()
# gan mutation Python vao dung function_id
if pm is not None and not gptdf.empty:
    pmm = pm[["function_id", "mutation_score"]].dropna(subset=["mutation_score"])
    if "mutation_score" in gptdf.columns:
        gptdf = gptdf.merge(pmm, on="function_id", how="left", suffixes=("", "_py"))
        gptdf["mutation_score"] = gptdf["mutation_score"].fillna(gptdf.pop("mutation_score_py"))
    else:
        gptdf = gptdf.merge(pmm, on="function_id", how="left")

base = load(A.baseline, "Baseline nhom (git)")
allm = pd.concat([x for x in (gptdf, base) if x is not None and not x.empty], ignore_index=True) if (not gptdf.empty or base is not None) else pd.DataFrame()
if not allm.empty:
    allm.to_csv(os.path.join(A.out, "metrics_merged_8lib.csv"), index=False)

rows = []
def wilcox_vs(x, thr, alt="greater"):
    d = np.asarray(x, float) - thr; d = d[d != 0]
    try: w, p = (stats.wilcoxon(d, alternative=alt) if d.size else (None, None))
    except ValueError: w, p = None, None
    return w, p, rb_effect(d)

# ===== RQ1: end-to-end coverage over every assigned target =====
# Missing/invalid/not-covered is zero in the primary estimand.  The effective
# subset is reported separately and must never replace the primary result.
if not gptdf.empty and "branch_coverage" in gptdf.columns:
    for lang in ["python", "java", "all"]:
        sub = gptdf if lang == "all" else gptdf[gptdf["language"] == lang]
        x = sub["branch_coverage"].fillna(0)
        if len(x):
            w, p, e = wilcox_vs(x, 80)
            med = float(np.median(x))
            rows.append({"rq": f"RQ1_ALL_cov>=80_{lang}", "n": len(x), "median": round(med, 2), "stat": w, "p": p, "effect_rb": e,
                         "decision": "evidence median > 80" if (p is not None and p < 0.05) else "insufficient evidence median > 80"})
        eff = sub[(sub.get("compiled", 1) == 1) & (sub["branch_coverage"] > 0)]
        xe = eff["branch_coverage"].dropna()
        if len(xe):
            rows.append({"rq": f"RQ1_EFFECTIVE_cov_{lang}", "n": len(xe),
                         "median": round(float(np.median(xe)), 2), "stat": "", "p": "",
                         "effect_rb": "", "decision": "descriptive only; survivor subset"})

# ===== RQ2-A: end-to-end mutation over every assigned target =====
if not gptdf.empty and "mutation_score" in gptdf.columns:
    for lang in ["python", "java", "all"]:
        sub = gptdf if lang == "all" else gptdf[gptdf["language"] == lang]
        x = sub["mutation_score"].fillna(0)
        if len(x):
            w, p, e = wilcox_vs(x, 60)
            med = float(np.median(x))
            rows.append({"rq": f"RQ2A_ALL_mut>=60_{lang}", "n": len(x), "median": round(med, 2), "stat": w, "p": p, "effect_rb": e,
                         "decision": "evidence median > 60" if (p is not None and p < 0.05) else "insufficient evidence median > 60"})
        xe = sub["mutation_score"].dropna()
        if len(xe):
            rows.append({"rq": f"RQ2A_EFFECTIVE_mut_{lang}", "n": len(xe),
                         "median": round(float(np.median(xe)), 2), "stat": "", "p": "",
                         "effect_rb": "", "decision": "descriptive only; available reports"})

# ===== RQ2-B: paired end-to-end comparison; absent reports count as zero =====
if not gptdf.empty and base is not None and "mutation_score" in gptdf.columns:
    g = gptdf[["function_id", "language", "mutation_score"]].copy()
    g["mutation_score"] = g["mutation_score"].fillna(0)
    for bmethod in sorted(base["method"].dropna().unique()):
        if str(bmethod).lower().replace("-", "") in {"gpt4omini", "gpt4o"}:
            continue
        b = base[base["method"] == bmethod][["function_id", "language", "mutation_score"]].copy()
        b["mutation_score"] = b["mutation_score"].fillna(0)
        j = g.merge(b, on="function_id", suffixes=("_gpt", "_base"))
        if len(j) >= 3:
            diff = j["mutation_score_gpt"].to_numpy(float) - j["mutation_score_base"].to_numpy(float)
            dd = diff[diff != 0]
            try: w, p = stats.wilcoxon(j["mutation_score_gpt"], j["mutation_score_base"]) if dd.size else (None, None)
            except ValueError: w, p = None, None
            effect = rb_effect(diff)
            direction = "GPT higher" if effect is not None and effect > 0 else "GPT lower"
            significant = p is not None and p < 0.05
            rows.append({"rq": f"RQ2B_gpt_vs_{bmethod}", "n": len(j),
                         "median": round(float(j["mutation_score_gpt"].median() - j["mutation_score_base"].median()), 2),
                         "stat": w, "p": p, "effect_rb": effect,
                         "decision": (f"significant; {direction}" if significant else "no significant difference")})
        else:
            rows.append({"rq": f"RQ2B_gpt_vs_{bmethod}", "n": len(j), "median": None, "stat": None, "p": None, "effect_rb": None, "decision": "thieu cap ghep"})

# ===== RQ3: CC vs end-to-end coverage, with failures retained as zero =====
if not gptdf.empty and "branch_coverage" in gptdf.columns:
    for lang in ["python", "java", "all"]:
        sub = gptdf if lang == "all" else gptdf[gptdf["language"] == lang]
        eff = sub[["cc", "branch_coverage"]].copy()
        eff["branch_coverage"] = eff["branch_coverage"].fillna(0)
        eff = eff.dropna(subset=["cc"])
        if eff["cc"].nunique() > 1:
            rho, p = stats.spearmanr(eff["cc"], eff["branch_coverage"])
            rows.append({"rq": f"RQ3_cc~cov_{lang}", "n": len(eff), "median": None, "stat": round(float(rho), 3), "p": p,
                         "effect_rb": round(float(rho), 3),
                         "decision": "evidence of negative association" if (rho < 0 and p is not None and p < 0.05) else "insufficient evidence of negative association"})

res = pd.DataFrame(rows)
res.to_csv(os.path.join(A.out, "summary_8lib.csv"), index=False)
print("\n===== SUMMARY 8-LIB =====")
print(res.to_string(index=False) if len(res) else "(chua co du lieu — can it nhat py-cov)")
print("\nLuu:", os.path.join(A.out, "summary_8lib.csv"), "| effect_rb = rank-biserial / Spearman rho")
print("Ghi chu: Java gpt-4o-mini lay tu nhom (--java-gpt). Baseline = metrics_full.csv cua nhom (evosuite/randoop).")

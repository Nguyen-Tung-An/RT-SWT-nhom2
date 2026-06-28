"""Generator: tao notebooks/pilot_analysis.ipynb + full_analysis.ipynb. Chay: python build_notebooks.py"""
import json, os

# ---------------- PILOT (Tuan 7) ----------------
p_md = r"""# Pilot Analysis (Tuần 7) — MS · Nhóm 2

Mục 7.3 RBL-4: (1) tính metric trên pilot, (2) vẽ histogram phân phối, (3) **xác nhận lựa chọn statistical test**.

> Sửa `INPUT` cho trỏ tới `metrics.csv` của pilot. Mặc định dùng data giả để chạy thử."""
p_load = r'''import os, numpy as np, pandas as pd
import matplotlib; matplotlib.use("Agg"); import matplotlib.pyplot as plt
from scipy import stats

INPUT = "data/metrics.sample.csv"   # <-- doi thanh results/pilot/metrics.csv
GPT = "gpt4o-mini"
df = pd.read_csv(INPUT)
df["compiled"] = df["compiled"].astype(int)
df.loc[df["compiled"]==0, ["branch_coverage","mutation_score"]] = 0.0   # proposal §5.1 b4
gpt = df[df["method"]==GPT]
print("N hàm GPT:", gpt["function_id"].nunique(), "| invalid rate:",
      round((gpt["compiled"]==0).mean()*100,1), "%")'''
p_desc = r'''# 1) Descriptive stats
display(df.groupby(["method","language"])[["branch_coverage","mutation_score"]].describe().round(1))'''
p_hist = r'''# 2) Histogram phan phoi (GPT)
os.makedirs("results/figures", exist_ok=True)
fig, ax = plt.subplots(1,2, figsize=(10,4))
ax[0].hist(gpt["branch_coverage"].dropna(), bins=10); ax[0].axvline(80, color="r", ls="--", label="thr 80%")
ax[0].set_title("Branch Coverage"); ax[0].legend()
ax[1].hist(gpt["mutation_score"].dropna(), bins=10); ax[1].axvline(60, color="r", ls="--", label="thr 60%")
ax[1].set_title("Mutation Score"); ax[1].legend()
fig.tight_layout(); fig.savefig("results/figures/pilot_hist.png", dpi=300); plt.show()'''
p_test = r'''# 3) Xac nhan statistical test
x = gpt["branch_coverage"].dropna()
if len(x) >= 3:
    W, p = stats.shapiro(x)
    print(f"Shapiro normality p={p:.4f} ->", "KHONG chuan" if p<0.05 else "co the chuan")
print("=> Phan phoi metric thuong KHONG chuan => giu kiem dinh PHI THAM SO da chon trong proposal:")
print("   RQ1 One-sample Wilcoxon | RQ2 Paired Wilcoxon | RQ3 Spearman.")
print("Neu phan phoi RAT khac du kien (vd toan 0 do non-compile) -> ghi notes.md, bao PL, viet amendment (RBL-4 §7.3).")'''
p_end = r"""## Kết luận pilot
- Pipeline đo chạy đúng, format `metrics.csv` hợp lệ → tiến hành full (Tuần 8).
- Test phi tham số phù hợp → **giữ nguyên** lựa chọn trong proposal (không HARKing).
- Nếu invalid rate > 20% hoặc phân phối bất thường → báo PL/GV trước khi scale."""

# ---------------- FULL (Tuan 8) ----------------
f_md = r"""# Full Analysis (Tuần 8) — MS · Nhóm 2

Mục 8.3 RBL-4 / proposal §5.6: metric + statistical test (α=0.05) + effect size + kết luận từng RQ → `summary.csv`.
**Notebook phải Restart & Run All không lỗi.**

> Sửa `INPUT` trỏ tới `results/full/metrics.csv`. Mặc định data giả để chạy thử."""
f_load = r'''import os, csv, json, numpy as np, pandas as pd
import matplotlib; matplotlib.use("Agg"); import matplotlib.pyplot as plt
from scipy import stats

INPUT = "data/metrics.sample.csv"   # <-- doi thanh results/full/metrics.csv
GPT, ALPHA, COV_THR, MUT_THR = "gpt4o-mini", 0.05, 80.0, 60.0
df = pd.read_csv(INPUT); df["compiled"]=df["compiled"].astype(int)
df.loc[df["compiled"]==0, ["branch_coverage","mutation_score"]] = 0.0
gpt = df[df["method"]==GPT].copy()
bname = next((m for m in df["method"].unique() if m!=GPT), None)
base = df[df["method"]==bname].copy()
print("GPT method:", GPT, "| baseline:", bname, "| N:", gpt["function_id"].nunique())'''
f_rq1 = r'''# RQ1 - One-sample Wilcoxon: branch coverage GPT vs 80%
x = gpt["branch_coverage"].dropna().to_numpy(float); diff = x-COV_THR; nz = diff[diff!=0]
if nz.size:
    w,p = stats.wilcoxon(nz, alternative="greater")
else:
    w,p = None, None
rq1 = {"median": float(np.median(x)), "statistic": (float(w) if w is not None else None),
       "p_value": (float(p) if p is not None else None),
       "reject_H0": bool(p is not None and p<ALPHA and np.median(x)>=COV_THR)}
print("RQ1:", rq1)'''
f_rq2 = r'''# RQ2 - Paired Wilcoxon: mutation GPT vs baseline + rank-biserial
m = pd.merge(gpt[["function_id","mutation_score"]], base[["function_id","mutation_score"]],
             on="function_id", suffixes=("_gpt","_base"))
g = m["mutation_score_gpt"].to_numpy(float); b = m["mutation_score_base"].to_numpy(float)
d = g-b; d2 = d[d!=0]
if d2.size:
    w2,p2 = stats.wilcoxon(g,b, alternative="greater")
    r = stats.rankdata(np.abs(d2)); rb = float((r[d2>0].sum()-r[d2<0].sum())/r.sum())
else:
    w2,p2,rb = None,None,0.0
rq2 = {"median_gpt": float(np.median(g)), "median_base": float(np.median(b)),
       "statistic": (float(w2) if w2 is not None else None),
       "p_value": (float(p2) if p2 is not None else None), "effect_size_rb": rb,
       "reject_H0": bool(p2 is not None and p2<ALPHA and np.median(g)>=MUT_THR)}
print("RQ2:", rq2)'''
f_rq3 = r'''# RQ3 - Spearman: CC vs chat luong (GPT)
def sp(col):
    s = gpt[["cc",col]].dropna()
    if s["cc"].nunique()<2 or len(s)<3: return (None,None)
    rho,p = stats.spearmanr(s["cc"], s[col]); return (float(rho), float(p))
rho_c,p_c = sp("branch_coverage"); rho_m,p_m = sp("mutation_score")
rq3 = {"rho_cov":rho_c,"p_cov":p_c,"rho_mut":rho_m,"p_mut":p_m,
       "reject_H0": bool((rho_c is not None and rho_c<0 and p_c<ALPHA) or (rho_m is not None and rho_m<0 and p_m<ALPHA))}
print("RQ3:", rq3)'''
f_sum = r'''# Ghi summary.csv (moi RQ 1 dong)
os.makedirs("results", exist_ok=True)
rows = [
 {"rq":"RQ1","metric":"branch_coverage","test":"one-sample Wilcoxon","statistic":rq1["statistic"],
  "p_value":rq1["p_value"],"effect_size":rq1["median"],"n":int(len(x)),
  "decision":"reject H0" if rq1["reject_H0"] else "fail to reject H0"},
 {"rq":"RQ2","metric":"mutation_score","test":"paired Wilcoxon","statistic":rq2["statistic"],
  "p_value":rq2["p_value"],"effect_size":rq2["effect_size_rb"],"n":int(len(m)),
  "decision":"reject H0" if rq2["reject_H0"] else "fail to reject H0"},
 {"rq":"RQ3","metric":"cc_vs_quality","test":"Spearman","statistic":None,
  "p_value":(min([v for v in [p_c,p_m] if v is not None], default=None)),
  "effect_size":f"rho_cov={rho_c}, rho_mut={rho_m}","n":int(gpt["cc"].notna().sum()),
  "decision":"reject H0" if rq3["reject_H0"] else "fail to reject H0"},
]
pd.DataFrame(rows).to_csv("results/summary.csv", index=False)
display(pd.DataFrame(rows))'''
f_fig = r'''# Figures (>=300 DPI)
os.makedirs("results/figures", exist_ok=True)
fig,ax = plt.subplots(1,2, figsize=(10,4.5))
for a,col,t in [(ax[0],"branch_coverage","Branch Cov (GPT)"),(ax[1],"mutation_score","Mutation (GPT)")]:
    data=[gpt[gpt["language"]==L][col].dropna().to_numpy() for L in ["java","python"]]
    a.boxplot([d if len(d) else [0] for d in data], labels=["Java","Python"], showmeans=True)
    a.set_title(t); a.set_ylim(-5,105); a.grid(axis="y",alpha=.3)
fig.tight_layout(); fig.savefig("results/figures/fig1_distribution.png", dpi=300); plt.show()
fig,a = plt.subplots(figsize=(6,4.5))
a.boxplot([gpt["mutation_score"].dropna() if len(gpt) else [0], base["mutation_score"].dropna() if len(base) else [0]],
          labels=[f"GPT","Baseline"], showmeans=True)
a.set_title("Mutation: GPT vs Baseline"); a.set_ylim(-5,105); a.grid(axis="y",alpha=.3)
fig.tight_layout(); fig.savefig("results/figures/fig2_comparison.png", dpi=300); plt.show()'''
f_end = r"""## Kết luận (diễn giải tổ hợp — proposal §6.2)
Đối chiếu `summary.csv`:
- **Double positive** (RQ1 & RQ2 reject H0): gpt-4o-mini đạt cả coverage lẫn mutation → thay được công cụ truyền thống ở CC 5–10.
- **Mixed** (RQ1 reject, RQ2 không): coverage cao nhưng mutation thấp → test "hình thức", thiếu assert phát hiện lỗi.
- **Double negative**: không đạt ngưỡng → one-shot không hiệu quả ở CC 5–10; chỉ ra ranh giới ứng dụng.
- RQ3 ρ<0 có ý nghĩa → CC càng cao chất lượng càng giảm (xác nhận "điểm gãy").

> Nhắc: kết luận nói rõ đối tượng là **gpt-4o-mini** (amendment v1.1). Bàn giao `summary.csv` + `figures/` cho RW."""


def md(s): return {"cell_type": "markdown", "metadata": {}, "source": s.splitlines(keepends=True)}
def code(s): return {"cell_type": "code", "metadata": {}, "execution_count": None, "outputs": [], "source": s.splitlines(keepends=True)}


def build(path, cells):
    nb = {"cells": cells, "metadata": {"kernelspec": {"display_name": "Python 3", "language": "python", "name": "python3"},
          "language_info": {"name": "python"}}, "nbformat": 4, "nbformat_minor": 5}
    json.dump(nb, open(path, "w", encoding="utf-8"), ensure_ascii=False, indent=1)
    print("wrote", path, len(cells), "cells")


os.makedirs("notebooks", exist_ok=True)
build("notebooks/pilot_analysis.ipynb",
      [md(p_md), code(p_load), code(p_desc), code(p_hist), code(p_test), md(p_end)])
build("notebooks/full_analysis.ipynb",
      [md(f_md), code(f_load), code(f_rq1), code(f_rq2), code(f_rq3), code(f_sum), code(f_fig), md(f_end)])

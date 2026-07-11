# Ve hinh cho paper (300 DPI) — ban 8-lib, chay tu ms-analysis/scripts/.
# Tu dong dung nhung gi co: Python (da do) + baseline git (metrics_full.csv); them Java khi co metrics_java_gpt.csv.
import os, csv
import matplotlib; matplotlib.use("Agg")
import matplotlib.pyplot as plt
HERE=os.path.dirname(os.path.abspath(__file__)); R=os.path.join(os.path.dirname(HERE),"results")
def load(p):
    return list(csv.DictReader(open(p))) if os.path.exists(p) else []
def col(rows,c,filt=lambda r:True):
    out=[]
    for r in rows:
        if not filt(r): continue
        v=r.get(c,"")
        try: out.append(float(v))
        except: pass
    return out
pycov=load(os.path.join(R,"metrics_project.csv"))
pymut=load(os.path.join(R,"metrics_py_mut.csv"))
base=load(os.path.join(R,"metrics_full.csv"))
jgpt=load(os.path.join(R,"metrics_java_gpt.csv"))
# tap effective
py_cov=[float(r["branch_coverage"]) for r in pycov if r.get("compiled")=="1" and float(r.get("branch_coverage",0))>0]
py_mut=col(pymut,"mutation_score")
ja_cov=col(jgpt,"branch_coverage") if jgpt else []
ja_mut=col(jgpt,"mutation_score") if jgpt else []
bev_cov=col(base,"branch_coverage",lambda r:r.get("method")=="evosuite"); bev_mut=col(base,"mutation_score",lambda r:r.get("method")=="evosuite")
brd_cov=col(base,"branch_coverage",lambda r:r.get("method")=="randoop"); brd_mut=col(base,"mutation_score",lambda r:r.get("method")=="randoop")

# ---- FIG1: phan bo coverage & mutation cua gpt-4o-mini (vs nguong) ----
fig,ax=plt.subplots(1,2,figsize=(9,4))
data1=[d for d in [py_cov, ja_cov] if d]; lab1=[f"Python\n(n={len(py_cov)})"]+([f"Java\n(n={len(ja_cov)})"] if ja_cov else [])
ax[0].boxplot(data1,tick_labels=lab1,showmeans=True); ax[0].axhline(80,ls="--",c="r",lw=1,label="nguong 80%")
ax[0].set_title("Branch Coverage — gpt-4o-mini"); ax[0].set_ylabel("%"); ax[0].legend(fontsize=8)
data2=[d for d in [py_mut, ja_mut] if d]; lab2=[f"Python\n(n={len(py_mut)})"]+([f"Java\n(n={len(ja_mut)})"] if ja_mut else [])
ax[1].boxplot(data2,tick_labels=lab2,showmeans=True); ax[1].axhline(60,ls="--",c="r",lw=1,label="nguong 60%")
ax[1].set_title("Mutation Score — gpt-4o-mini"); ax[1].set_ylabel("%"); ax[1].legend(fontsize=8)
plt.tight_layout(); plt.savefig(os.path.join(R,"fig1_distribution.png"),dpi=300); plt.close()

# ---- FIG2: gpt vs baseline (mutation) — Java neu co, kem baseline ----
fig,ax=plt.subplots(figsize=(7,4))
groups=[]; labels=[]
if ja_mut: groups.append(ja_mut); labels.append(f"GPT Java\n(n={len(ja_mut)})")
groups.append(py_mut); labels.append(f"GPT Python\n(n={len(py_mut)})")
if bev_mut: groups.append(bev_mut); labels.append(f"EvoSuite\n(n={len(bev_mut)})")
if brd_mut: groups.append(brd_mut); labels.append(f"Randoop\n(n={len(brd_mut)})")
ax.boxplot(groups,tick_labels=labels,showmeans=True); ax.axhline(60,ls="--",c="r",lw=1,label="nguong 60%")
ax.set_title("Mutation Score: GPT vs Baseline"); ax.set_ylabel("%"); ax.legend(fontsize=8)
plt.tight_layout(); plt.savefig(os.path.join(R,"fig2_comparison.png"),dpi=300); plt.close()
print("Da ve:", os.path.join(R,"fig1_distribution.png"), "+ fig2_comparison.png")
print(f"Python cov n={len(py_cov)} | Python mut n={len(py_mut)} | Java gpt: {'CO' if jgpt else 'CHUA'} | baseline evosuite n={len(bev_mut)} randoop n={len(brd_mut)}")

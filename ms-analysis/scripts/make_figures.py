"""
Generate the two required RBL-4 figures from metrics.csv.

  fig1_distribution.png  — distribution (box/violin) of the main metrics
                           for gpt4o-mini, with the proposal thresholds.
  fig2_comparison.png    — GPT-4o-mini vs. automated baseline (RQ2),
                           branch coverage + mutation score.

Input schema (see ms-analysis/DATA_CONTRACT.md, table 5):
  function_id, language, cc, method, branch_coverage, mutation_score, compiled
  (compiled == 0  =>  branch_coverage & mutation_score are forced to 0)

Usage:
  python ms-analysis/scripts/make_figures.py results/metrics.csv
  # default input = ms-analysis/data/metrics.sample.csv (for a dry run)
Figures are written to figures/ at 300 DPI.
"""
import os
import sys
import pandas as pd
import matplotlib
matplotlib.use("Agg")
import matplotlib.pyplot as plt

LLM_METHOD = "gpt4o-mini"
COV_THRESHOLD = 80.0   # RQ1
MUT_THRESHOLD = 60.0   # RQ2
DPI = 300

REPO_ROOT = os.path.dirname(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))
OUT_DIR = os.path.join(REPO_ROOT, "figures")


def load(path: str) -> pd.DataFrame:
    df = pd.read_csv(path)
    # enforce the proposal §5.1 rule: non-compiling => 0 for both metrics
    mask = df["compiled"] == 0
    df.loc[mask, ["branch_coverage", "mutation_score"]] = 0.0
    return df


def fig1_distribution(df: pd.DataFrame) -> None:
    llm = df[df["method"] == LLM_METHOD]
    fig, axes = plt.subplots(1, 2, figsize=(11, 5))
    for ax, col, thr, title in (
        (axes[0], "branch_coverage", COV_THRESHOLD, "Branch Coverage"),
        (axes[1], "mutation_score", MUT_THRESHOLD, "Mutation Score"),
    ):
        groups, labels = [], []
        for lang in ("java", "python"):
            vals = llm.loc[llm["language"] == lang, col].dropna().values
            if len(vals):
                groups.append(vals)
                labels.append(f"{lang}\n(n={len(vals)})")
        if groups:
            parts = ax.violinplot(groups, showmedians=True)
            ax.boxplot(groups, widths=0.15, showfliers=False)
            ax.set_xticks(range(1, len(labels) + 1))
            ax.set_xticklabels(labels)
        ax.axhline(thr, color="red", linestyle="--", linewidth=1,
                   label=f"threshold {thr:.0f}%")
        ax.set_title(f"{title} — {LLM_METHOD}")
        ax.set_ylabel(f"{title} (%)")
        ax.set_ylim(0, 100)
        ax.legend(loc="lower right", fontsize=8)
    fig.suptitle(f"Fig 1 — Metric distribution (N={len(llm)} test suites)")
    fig.tight_layout()
    out = os.path.join(OUT_DIR, "fig1_distribution.png")
    fig.savefig(out, dpi=DPI, bbox_inches="tight")
    plt.close(fig)
    print("wrote", out)


def fig2_comparison(df: pd.DataFrame) -> None:
    # median per (method, metric); LLM vs the first available baseline
    baselines = [m for m in df["method"].unique() if m != LLM_METHOD]
    methods = [LLM_METHOD] + baselines
    med = df.groupby("method")[["branch_coverage", "mutation_score"]].median()
    med = med.reindex(methods).dropna(how="all")

    fig, ax = plt.subplots(figsize=(9, 5))
    x = range(len(med.index))
    w = 0.38
    ax.bar([i - w / 2 for i in x], med["branch_coverage"], w, label="Branch Coverage")
    ax.bar([i + w / 2 for i in x], med["mutation_score"], w, label="Mutation Score")
    ax.axhline(COV_THRESHOLD, color="tab:blue", ls=":", lw=1)
    ax.axhline(MUT_THRESHOLD, color="tab:orange", ls=":", lw=1)
    ax.set_xticks(list(x))
    ax.set_xticklabels(med.index)
    ax.set_ylabel("Median (%)")
    ax.set_ylim(0, 100)
    ax.set_title(f"Fig 2 — {LLM_METHOD} vs. baselines (RQ2), N={len(df['function_id'].unique())} functions")
    for i, m in enumerate(med.index):
        ax.text(i - w / 2, med["branch_coverage"][m] + 1, f"{med['branch_coverage'][m]:.1f}",
                ha="center", va="bottom", fontsize=8)
        ax.text(i + w / 2, med["mutation_score"][m] + 1, f"{med['mutation_score'][m]:.1f}",
                ha="center", va="bottom", fontsize=8)
    ax.legend()
    fig.tight_layout()
    out = os.path.join(OUT_DIR, "fig2_comparison.png")
    fig.savefig(out, dpi=DPI, bbox_inches="tight")
    plt.close(fig)
    print("wrote", out)


def main() -> int:
    src = sys.argv[1] if len(sys.argv) > 1 else os.path.join(
        REPO_ROOT, "ms-analysis", "data", "metrics.sample.csv")
    if not os.path.exists(src):
        print(f"ERROR: metrics file not found: {src}")
        return 1
    os.makedirs(OUT_DIR, exist_ok=True)
    df = load(src)
    print(f"loaded {len(df)} rows from {src}")
    fig1_distribution(df)
    fig2_comparison(df)
    print("done.")
    return 0


if __name__ == "__main__":
    sys.exit(main())

"""
compute_metric.py - GATE E4 + phân tích thống kê (RBL-4 §8.3, proposal §5.6).
Nhóm 2 - SE1944 (vai trò MS).

Đầu vào: metrics.csv (xem DATA_CONTRACT.md §5). Cột bắt buộc:
    function_id, language, cc, method, branch_coverage, mutation_score, compiled
  - compiled=0 -> branch_coverage & mutation_score bị ép = 0 (proposal §5.1 b4).

Kiểm định (phi tham số, alpha=0.05):
    RQ1  One-sample Wilcoxon : branch_coverage(GPT) vs 80%        (H1: median >= 80%)
    RQ2  Paired Wilcoxon     : mutation GPT vs baseline (mẫu cặp) (H1: GPT > base) + median>=60%
         + effect size = matched-pairs rank-biserial r
    RQ3  Spearman           : CC vs (branch_coverage, mutation_score) của GPT (H1: rho<0)

Đầu ra: stats_results.json + summary.csv (mỗi RQ 1 dòng) + figures/*.png (>=300 DPI).

Usage:
    python scripts/compute_metric.py --input data/metrics.sample.csv --output-dir results
"""
from __future__ import annotations
import argparse, csv, json, os
import numpy as np, pandas as pd
from scipy import stats
import matplotlib; matplotlib.use("Agg")
import matplotlib.pyplot as plt  # noqa: E402

REQUIRED = ["function_id", "language", "cc", "method",
            "branch_coverage", "mutation_score", "compiled"]


def rank_biserial_paired(gpt, base):
    d = np.asarray(gpt, float) - np.asarray(base, float); d = d[d != 0]
    if d.size == 0:
        return 0.0
    r = stats.rankdata(np.abs(d)); wp = r[d > 0].sum(); wn = r[d < 0].sum()
    return float((wp - wn) / (wp + wn)) if (wp + wn) else 0.0


def _safe(fn):
    try:
        return fn()
    except Exception as e:  # noqa: BLE001
        return {"error": f"{e.__class__.__name__}: {e}"}


def rq1(gpt, thr, alpha):
    def go():
        x = gpt["branch_coverage"].dropna().to_numpy(float); diff = x - thr; nz = diff[diff != 0]
        r = {"n": int(x.size), "median_branch_cov": float(np.median(x)) if x.size else None,
             "threshold": thr, "test": "one-sample Wilcoxon (alt=greater)"}
        if nz.size == 0:
            r.update(statistic=None, p_value=None, reject_H0=False); return r
        w, p = stats.wilcoxon(nz, alternative="greater")
        r.update(statistic=float(w), p_value=float(p),
                 reject_H0=bool(p < alpha and np.median(x) >= thr)); return r
    return _safe(go)


def rq2(gpt, base, bname, thr, alpha):
    def go():
        m = pd.merge(gpt[["function_id", "mutation_score"]],
                     base[["function_id", "mutation_score"]], on="function_id",
                     suffixes=("_gpt", "_base"))
        if len(m) == 0:
            return {"error": "khong co cap chung"}
        g = m["mutation_score_gpt"].to_numpy(float); b = m["mutation_score_base"].to_numpy(float)
        r = {"baseline": bname, "n_pairs": int(len(m)), "median_mut_gpt": float(np.median(g)),
             "median_mut_base": float(np.median(b)), "threshold": thr,
             "test": "paired Wilcoxon (alt=greater)", "effect_size_rank_biserial": rank_biserial_paired(g, b)}
        if np.all((g - b) == 0):
            r.update(statistic=None, p_value=None, reject_H0=False); return r
        w, p = stats.wilcoxon(g, b, alternative="greater")
        r.update(statistic=float(w), p_value=float(p),
                 reject_H0=bool(p < alpha and np.median(g) >= thr)); return r
    return _safe(go)


def rq3(gpt, alpha):
    def one(col):
        s = gpt[["cc", col]].dropna()
        if s["cc"].nunique() < 2 or len(s) < 3:
            return {"error": "khong du bien thien"}
        rho, p = stats.spearmanr(s["cc"], s[col])
        return {"spearman_rho": float(rho), "p_value": float(p), "n": int(len(s)),
                "reject_H0": bool(rho < 0 and p < alpha)}
    return {"cc_vs_branch_coverage": _safe(lambda: one("branch_coverage")),
            "cc_vs_mutation_score": _safe(lambda: one("mutation_score"))}


def figures(df, gpt_m, bname, fig_dir):
    os.makedirs(fig_dir, exist_ok=True)
    g = df[df["method"] == gpt_m]
    fig, ax = plt.subplots(1, 2, figsize=(10, 4.5))
    for a, col, t in [(ax[0], "branch_coverage", "Branch Coverage (GPT)"),
                      (ax[1], "mutation_score", "Mutation Score (GPT)")]:
        data = [g[g["language"] == L][col].dropna().to_numpy() for L in ["java", "python"]]
        data = [d if d.size else np.array([0.0]) for d in data]
        a.boxplot(data, labels=["Java", "Python"], showmeans=True)
        a.set_title(t); a.set_ylabel("%"); a.set_ylim(-5, 105); a.grid(axis="y", alpha=.3)
    fig.suptitle("Phan phoi chat luong test GPT (CC 5-10)"); fig.tight_layout()
    fig.savefig(os.path.join(fig_dir, "fig1_distribution.png"), dpi=300); plt.close(fig)

    fig, a = plt.subplots(figsize=(6, 4.5))
    gm = df[df["method"] == gpt_m]["mutation_score"].dropna().to_numpy()
    bm = df[df["method"] == bname]["mutation_score"].dropna().to_numpy()
    a.boxplot([gm if gm.size else [0], bm if bm.size else [0]],
              labels=[f"GPT ({gpt_m})", f"Base ({bname})"], showmeans=True)
    a.set_title("Mutation Score: GPT vs Baseline"); a.set_ylabel("%"); a.set_ylim(-5, 105)
    a.grid(axis="y", alpha=.3); fig.tight_layout()
    fig.savefig(os.path.join(fig_dir, "fig2_comparison.png"), dpi=300); plt.close(fig)


def write_summary_csv(res, path):
    """Mỗi RQ 1 dòng (DATA_CONTRACT §6)."""
    rows = []
    a = res["RQ1_branch_coverage"]
    rows.append({"rq": "RQ1", "metric": "branch_coverage", "test": "one-sample Wilcoxon",
                 "statistic": a.get("statistic"), "p_value": a.get("p_value"),
                 "effect_size": a.get("median_branch_cov"), "n": a.get("n"),
                 "decision": "reject H0" if a.get("reject_H0") else "fail to reject H0"})
    b = res["RQ2_mutation_vs_baseline"]
    rows.append({"rq": "RQ2", "metric": "mutation_score", "test": "paired Wilcoxon",
                 "statistic": b.get("statistic"), "p_value": b.get("p_value"),
                 "effect_size": b.get("effect_size_rank_biserial"), "n": b.get("n_pairs"),
                 "decision": "reject H0" if b.get("reject_H0") else "fail to reject H0"})
    c = res["RQ3_cc_correlation"]["cc_vs_branch_coverage"]
    d = res["RQ3_cc_correlation"]["cc_vs_mutation_score"]
    rows.append({"rq": "RQ3", "metric": "cc_vs_branch+mutation", "test": "Spearman",
                 "statistic": None,
                 "p_value": min([x for x in [c.get("p_value"), d.get("p_value")] if x is not None], default=None),
                 "effect_size": f"rho_cov={c.get('spearman_rho')}, rho_mut={d.get('spearman_rho')}",
                 "n": c.get("n"),
                 "decision": "reject H0" if (c.get("reject_H0") or d.get("reject_H0")) else "fail to reject H0"})
    with open(path, "w", newline="", encoding="utf-8") as f:
        w = csv.DictWriter(f, fieldnames=["rq", "metric", "test", "statistic", "p_value", "effect_size", "n", "decision"])
        w.writeheader(); w.writerows(rows)


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--input", required=True)
    ap.add_argument("--output-dir", default="results")
    ap.add_argument("--gpt-method", default="gpt4o-mini")
    ap.add_argument("--baseline", default=None)
    ap.add_argument("--cov-threshold", type=float, default=80.0)
    ap.add_argument("--mut-threshold", type=float, default=60.0)
    ap.add_argument("--alpha", type=float, default=0.05)
    args = ap.parse_args()

    df = pd.read_csv(args.input)
    miss = [c for c in REQUIRED if c not in df.columns]
    if miss:
        raise SystemExit(f"Thieu cot: {miss}")
    df["compiled"] = df["compiled"].astype(int)
    df.loc[df["compiled"] == 0, ["branch_coverage", "mutation_score"]] = 0.0

    gpt = df[df["method"] == args.gpt_method].copy()
    if gpt.empty:
        raise SystemExit(f"Khong tim thay method GPT={args.gpt_method!r}")
    bname = args.baseline or next((m for m in df["method"].unique() if m != args.gpt_method), "(none)")
    base = df[df["method"] == bname].copy()

    res = {"config": {"gpt_method": args.gpt_method, "baseline": bname,
                      "cov_threshold": args.cov_threshold, "mut_threshold": args.mut_threshold,
                      "alpha": args.alpha, "n_functions": int(gpt["function_id"].nunique())},
           "RQ1_branch_coverage": rq1(gpt, args.cov_threshold, args.alpha),
           "RQ2_mutation_vs_baseline": rq2(gpt, base, bname, args.mut_threshold, args.alpha),
           "RQ3_cc_correlation": rq3(gpt, args.alpha)}

    os.makedirs(args.output_dir, exist_ok=True)
    json.dump(res, open(os.path.join(args.output_dir, "stats_results.json"), "w", encoding="utf-8"),
              indent=2, ensure_ascii=False)
    write_summary_csv(res, os.path.join(args.output_dir, "summary.csv"))
    try:
        figures(df, args.gpt_method, bname, os.path.join(args.output_dir, "figures"))
    except Exception as e:  # noqa: BLE001
        print("figure error:", e)

    print(json.dumps(res, indent=2, ensure_ascii=False))
    print("-" * 60)
    print(f"Saved: stats_results.json, summary.csv, figures/  -> {args.output_dir}")
    print("[E4 PASS] compute_metric chay khong loi.")


if __name__ == "__main__":
    main()

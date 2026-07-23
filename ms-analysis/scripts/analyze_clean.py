"""Kiem dinh thong ke cho nghien cuu dataset sach — theo dung PREREGISTRATION-clean.md.

Khoa truoc khi chay: paired Wilcoxon ghep theo func_id, alpha = 0.05, effect size
matched-pairs rank-biserial. Java va Python TACH RIENG (toolchain khac, Java co access
control con Python khong). Bao cao HAI muc: 'all' (n=60, khong do duoc = 0) va 'effective'
(chi tap > 0).

RQ-A  dataset goc vs dataset sach, CUNG prompt v1
RQ-B  v1 vs v3-fair tren dataset sach (ca hai one-shot, khac dung MOT bien)
RQ-C  GPT vs baseline (EvoSuite / Randoop / Pynguin x2 nhanh)

Chay:  python ms-analysis/scripts/analyze_clean.py
"""
from __future__ import annotations

import csv
import math
import os
import statistics as st

REPO = os.path.dirname(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))
R = os.path.join(REPO, "ms-analysis", "results")

# CJ-048: miner tu gan nham (LocalTime.getField that ra la protected, khong phai public)
# -> vi pham chinh tieu chi F2 cua nghien cuu. Loai khoi phan tich, ghi ro o Threats.
EXCLUDE = {"CJ-048"}


def load(name: str, col: str = "mutation_score") -> dict[str, float | None]:
    p = os.path.join(R, name + ".csv")
    if not os.path.exists(p):
        return {}
    out = {}
    for r in csv.DictReader(open(p, encoding="utf-8-sig")):
        fid = r.get("func_id") or r.get("function_id")
        if not fid or fid in EXCLUDE:
            continue
        v = (r.get(col) or "").strip()
        try:
            out[fid] = float(v)
        except ValueError:
            out[fid] = None
    return out


def wilcoxon(pairs: list[tuple[float, float]]):
    """Paired Wilcoxon signed-rank, xap xi chuan. -> (n_khac0, W, z, p, rank_biserial)."""
    d = [b - a for a, b in pairs if b - a != 0]
    n = len(d)
    if n < 6:
        return n, None, None, None, None
    order = sorted(range(n), key=lambda i: abs(d[i]))
    ranks = [0.0] * n
    i = 0
    while i < n:
        j = i
        while j + 1 < n and abs(d[order[j + 1]]) == abs(d[order[i]]):
            j += 1
        avg = (i + j) / 2 + 1
        for k in range(i, j + 1):
            ranks[order[k]] = avg
        i = j + 1
    wp = sum(r for r, x in zip(ranks, d) if x > 0)
    wm = sum(r for r, x in zip(ranks, d) if x < 0)
    w = min(wp, wm)
    mu = n * (n + 1) / 4
    sd = math.sqrt(n * (n + 1) * (2 * n + 1) / 24)
    z = (w - mu) / sd if sd else 0.0
    p = 2 * (1 - 0.5 * (1 + math.erf(abs(z) / math.sqrt(2))))
    rb = (wp - wm) / (wp + wm) if (wp + wm) else 0.0
    return n, w, z, max(0.0, min(1.0, p)), rb


def pos(d: dict, ids=None) -> int:
    ids = ids or d.keys()
    return sum(1 for f in ids if d.get(f) is not None and d[f] > 0)


def compare(label: str, a: dict, b: dict, na: str, nb: str) -> None:
    ids = sorted(set(a) & set(b))
    if not ids:
        print(f"\n{label}: khong ghep cap duoc (thieu du lieu)")
        return
    pa = [(a[f] or 0.0) for f in ids]
    pb = [(b[f] or 0.0) for f in ids]
    n, w, z, p, rb = wilcoxon(list(zip(pa, pb)))
    print(f"\n{label}   (n ghep cap = {len(ids)})")
    print(f"  {na:26s} T4>0 = {pos(a, ids):2d}   median(all) = {st.median(pa):5.1f}")
    print(f"  {nb:26s} T4>0 = {pos(b, ids):2d}   median(all) = {st.median(pb):5.1f}")
    gain = sum(1 for f in ids if (b.get(f) or 0) > 0 and (a.get(f) or 0) == 0)
    lose = sum(1 for f in ids if (a.get(f) or 0) > 0 and (b.get(f) or 0) == 0)
    print(f"  ghep cap: duoc +{gain}, mat -{lose}")
    if p is None:
        print(f"  Wilcoxon: n_khac0={n} (<6) — KHONG du de kiem dinh")
    else:
        sig = "CO y nghia" if p < 0.05 else "khong co y nghia"
        print(f"  Wilcoxon: n_khac0={n}  p={p:.4f}  rank-biserial={rb:+.3f}  -> {sig} (alpha=0.05)")


def main() -> int:
    print("=" * 72)
    print("KIEM DINH — dataset sach (loai CJ-048: miner gan nham public/protected)")
    print("=" * 72)

    # ---------- RQ-A: dataset goc vs sach, CUNG prompt v1 ----------
    print("\n\n########## RQ-A: dataset GOC vs SACH (cung prompt v1) ##########")
    print("Luu y: KHONG phai so sanh co kiem soat — hai tap ham khac nhau, tap sach de hon")
    print("theo thiet ke. Chi bao cao muc do chenh lech, khong quy nhan qua.")
    for lang, old, new in [("PYTHON", "mutation_on_target_v1", "mutation_on_target_clean_v1"),
                           ("JAVA", "mutation_java_v1", "mutation_java_clean_v1")]:
        o, nw = load(old), load(new)
        if o and nw:
            print(f"\n  {lang}:  goc T4>0 = {pos(o)}/{len(o)}   sach T4>0 = {pos(nw)}/{len(nw)}")

    # ---------- RQ-B: v1 vs v3-fair (ca hai one-shot) ----------
    print("\n\n########## RQ-B: v1 vs v3-fair — ca hai ONE-SHOT, khac 1 bien ##########")
    compare("PYTHON", load("mutation_on_target_clean_v1"), load("mutation_on_target_clean_v3fair"),
            "v1 (spec toi thieu)", "v3-fair (+dac ta muc tieu)")
    compare("JAVA", load("mutation_java_clean_v1"), load("mutation_java_clean_v3fair"),
            "v1 (spec toi thieu)", "v3-fair (+dac ta muc tieu)")

    print("\n  [quan sat phu — KHONG dung tra loi RQ-B vi khac v1 o HAI bien]")
    for lang, a, b in [("PYTHON", "mutation_on_target_clean_v1", "mutation_on_target_clean_v3"),
                       ("JAVA", "mutation_java_clean_v1", "mutation_java_clean_v4")]:
        da, db = load(a), load(b)
        if da and db:
            print(f"    {lang} v1={pos(da)} -> bien the zero-shot/v4={pos(db)}")

    # ---------- RQ-C: GPT vs baseline ----------
    print("\n\n########## RQ-C: GPT vs BASELINE ##########")
    gpt_j = load("mutation_java_clean_v3fair")
    gpt_p = load("mutation_on_target_clean_v3fair")
    for tool, f in [("Randoop", "baseline_T4_randoop"), ("EvoSuite", "baseline_T4_evosuite")]:
        d = load(f)
        if d:
            compare(f"JAVA — GPT v3-fair vs {tool}", gpt_j, d, "GPT v3-fair", tool)
        else:
            print(f"\nJAVA — {tool}: chua co so lieu")
    for var in ("default", "fixed"):
        d = load(f"baseline_T4_pynguin_{var}")
        if d:
            compare(f"PYTHON — GPT v3-fair vs Pynguin ({var})", gpt_p, d,
                    "GPT v3-fair", f"Pynguin {var}")
        else:
            print(f"\nPYTHON — Pynguin {var}: chua co so lieu")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())

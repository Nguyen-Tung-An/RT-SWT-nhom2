"""So sanh A/B: prompt v1 vs prompt v2 tren cung 120 ham, cung model, cung tham so.

Thiet ke: bien thao tac DUY NHAT la prompt (xem scripts/run_experiment_v2.py). Vi vay moi
chenh lech do duoc o day quy duoc cho chat luong MO TA MUC TIEU, khong phai cho model.

Gia thuyet kiem dinh (dang ky TRUOC khi doc so lieu v2, chong HARKing):
  H1  Ty le INVALID giam, va giam MANH HON o nhom bi mo ta sai trong v1
      (python method 63% hong vs module-level function 6%; java 18/58 sai class).
  H0  Prompt khong anh huong: ty le invalid nhu nhau.
  Neu H1 SAI — invalid khong giam — thi ket luan la nguyen nhan nam o cho khac
  (nang luc model, do kho cua muc tieu), va phai bao cao dung nhu vay.

Phan tang theo `receiver_kind` cua full_ground_truth_v2.csv chinh la phep thu quan trong:
neu prompt that su la nguyen nhan thi muc cai thien phai TAP TRUNG o nhom method/nested,
gan nhu khong doi o nhom ham module-level (vi v1 von da mo ta dung nhom nay).

Chay:
  python ms-analysis/scripts/compare_v1_v2.py \
      --v1 ms-analysis/results/metrics_merged_8lib.csv --v1-method gpt-4o-mini \
      --v2 ms-analysis/results/metrics_v2.csv          --v2-method gpt-4o-mini-v2
"""
from __future__ import annotations

import argparse
import csv
import os
import statistics as st

REPO = os.path.dirname(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))
GT_V2 = os.path.join(REPO, "data", "full_ground_truth_v2.csv")


def load(path: str, method: str) -> dict[str, dict]:
    rows = list(csv.DictReader(open(os.path.join(REPO, path), encoding="utf-8-sig")))
    got = {r.get("method", "") for r in rows}
    sel = [r for r in rows if r.get("method") == method]
    if not sel:
        raise SystemExit(f"khong thay method='{method}' trong {path}. Co: {sorted(got)}")
    return {r["function_id"]: r for r in sel}


def num(r: dict, key: str):
    v = (r.get(key) or "").strip()
    try:
        return float(v)
    except ValueError:
        return None


def wilcoxon_signed_rank(pairs: list[tuple[float, float]]):
    """Paired Wilcoxon, xap xi chuan (cung ho kiem dinh voi bai bao). -> (n, W, z, p)."""
    d = [b - a for a, b in pairs if b - a != 0]
    n = len(d)
    if n < 6:
        return n, None, None, None
    order = sorted(range(n), key=lambda i: abs(d[i]))
    ranks = [0.0] * n
    i = 0
    while i < n:                                    # rank trung binh cho cac gia tri bang nhau
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
    sd = (n * (n + 1) * (2 * n + 1) / 24) ** 0.5
    z = (w - mu) / sd if sd else 0.0
    p = 2 * (1 - 0.5 * (1 + _erf(abs(z) / 2 ** 0.5)))
    return n, w, z, max(0.0, min(1.0, p))


def _erf(x: float) -> float:
    import math
    return math.erf(x)


def pct(part: int, whole: int) -> str:
    return f"{100.0 * part / whole:5.1f}%" if whole else "    —"


def block(title: str, ids: list[str], v1: dict, v2: dict) -> None:
    ids = [i for i in ids if i in v1 and i in v2]
    if not ids:
        return
    c1 = sum(1 for i in ids if (v1[i].get("compiled") or "0").strip() in ("1", "1.0"))
    c2 = sum(1 for i in ids if (v2[i].get("compiled") or "0").strip() in ("1", "1.0"))
    print(f"\n{title}  (n={len(ids)})")
    print(f"  VALID      v1 {c1:3d} ({pct(c1, len(ids))})   ->   "
          f"v2 {c2:3d} ({pct(c2, len(ids))})   thay doi {c2 - c1:+d}")

    for metric in ("branch_coverage", "mutation_score"):
        pairs = [(num(v1[i], metric), num(v2[i], metric)) for i in ids]
        pairs = [(a, b) for a, b in pairs if a is not None and b is not None]
        if not pairs:
            continue
        m1 = st.median(a for a, _ in pairs)
        m2 = st.median(b for _, b in pairs)
        n, w, z, p = wilcoxon_signed_rank(pairs)
        tail = f"Wilcoxon n={n} p={p:.4f}" if p is not None else f"n={n} (qua it de kiem dinh)"
        print(f"  {metric:16s} median v1 {m1:6.2f} -> v2 {m2:6.2f}  "
              f"({m2 - m1:+6.2f} pp)  {tail}")


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("--v1", default="ms-analysis/results/metrics_merged_8lib.csv")
    ap.add_argument("--v1-method", default="gpt-4o-mini")
    ap.add_argument("--v2", default="ms-analysis/results/metrics_v2.csv")
    ap.add_argument("--v2-method", default="gpt-4o-mini-v2")
    a = ap.parse_args()

    v1, v2 = load(a.v1, a.v1_method), load(a.v2, a.v2_method)
    gt = {r["func_id"]: r for r in csv.DictReader(open(GT_V2, encoding="utf-8-sig"))}

    common = sorted(set(v1) & set(v2))
    print(f"Ghep cap duoc {len(common)}/{len(gt)} ham "
          f"(v1={len(v1)}, v2={len(v2)}).")
    if not common:
        return 1

    block("=== TOAN BO ===", common, v1, v2)
    for lang in ("python", "java"):
        ids = [i for i in common if gt.get(i, {}).get("language") == lang]
        block(f"=== {lang.upper()} ===", ids, v1, v2)

    print("\n=== PHAN TANG THEO receiver_kind (phep thu nguyen nhan) ===")
    print("neu prompt LA nguyen nhan: cai thien tap trung o method/nested, "
          "gan nhu khong doi o ham module-level")
    kinds: dict[str, list[str]] = {}
    for i in common:
        kinds.setdefault(gt.get(i, {}).get("receiver_kind", "?"), []).append(i)
    for k, ids in sorted(kinds.items(), key=lambda kv: -len(kv[1])):
        block(f"--- {k} ---", ids, v1, v2)
    return 0


if __name__ == "__main__":
    raise SystemExit(main())

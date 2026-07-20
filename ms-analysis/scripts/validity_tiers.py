"""Bao cao tinh HOP LE theo TANG, thay vi mot co 'compiled' gop chung.

Van de: ca hai ngon ngu deu dung mot co nhi phan 'compiled' nhung no khong do cung mot
thu, va o ca hai truong hop deu do NHE hon cai ma nguoi doc hieu.

  Python (kaggle_coverage_py.py:146) — compiled=1 <=> passed + failed > 0
      tuc "co it nhat 1 test CHAY", khong phai "test PASS". File ma ca 5 test deu fail
      van duoc tinh la valid. Thuc te: 12/32 ham 'valid' KHONG co test nao pass,
      9/32 co coverage=0 (note 'ok-no-touch' — khong he cham ham dich).

  Java (measure_java_from_reports.py:117) — compiled=1 gan CUNG cho moi dong ghi ra.
      Dong duoc ghi khi khoang dong co du lieu bc/ms. Nhung JaCoCo liet ke MOI lop trong
      du an ke ca lop chua he duoc nap (mi>0, ci=0 -> bc=0.0), nen dong van duoc ghi.
      Ham co test khong bien dich duoc van nhan compiled=1.

Cach sua khong phai doi nguong cho dep, ma la BAO CAO DU 4 TANG de nguoi doc tu chon
muc nghiem ngat — va de khong the vo tinh doc nham:

  T0 khong chay duoc  : khong co file test / khong collect duoc test nao
  T1 co test chay     : >=1 test duoc thuc thi (dinh nghia 'compiled' hien tai cua bai bao)
  T2 co test XANH     : >=1 test PASS
  T3 co test XANH VA CHAM DICH : >=1 test pass VA branch_coverage > 0

Chi T3 moi bien minh duoc cho phat bieu "test nay kiem thu ham do".

Chay:  python ms-analysis/scripts/validity_tiers.py
"""
from __future__ import annotations

import argparse
import csv
import os
import sys

REPO = os.path.dirname(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))
PROJ = os.path.join(REPO, "ms-analysis", "results", "metrics_project.csv")


def tier(r: dict) -> int:
    if (r.get("compiled") or "0") != "1":
        return 0
    npass = int(r.get("tests_passed") or 0)
    if npass == 0:
        return 1
    try:
        cov = float(r.get("branch_coverage") or 0)
    except ValueError:
        cov = 0.0
    return 3 if cov > 0 else 2


LABEL = {0: "T0 khong chay duoc",
         1: "T1 co test chay (= 'compiled' cua bai bao)",
         2: "T2 co test XANH",
         3: "T3 co test XANH va CHAM ham dich"}


def report(rows: list[dict], name: str) -> dict:
    n = len(rows)
    t = {k: 0 for k in range(4)}
    for r in rows:
        t[tier(r)] += 1
    print(f"\n=== {name} (n={n}) ===")
    print(f"{'tang':46s} {'ham':>4s} {'rieng tang':>11s} {'tich luy':>10s}")
    cum = 0
    for k in (3, 2, 1, 0):
        pass
    # tich luy tu tang cao xuong: 'it nhat dat tang k'
    for k in (0, 1, 2, 3):
        atleast = sum(v for kk, v in t.items() if kk >= k)
        print(f"{LABEL[k]:46s} {t[k]:4d} {100 * t[k] / n:10.1f}% {100 * atleast / n:9.1f}%")
    print(f"\n  Bai bao bao cao 'valid' = T1 tro len = {sum(v for k, v in t.items() if k >= 1)}/{n}"
          f" ({100 * sum(v for k, v in t.items() if k >= 1) / n:.1f}%)")
    print(f"  Nhung chi T3 = {t[3]}/{n} ({100 * t[3] / n:.1f}%) thuc su kiem thu duoc ham dich.")
    return t


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("--csv", default=PROJ)
    a = ap.parse_args()

    if not os.path.exists(a.csv):
        print(f"LOI: khong thay {a.csv}")
        return 1
    rows = list(csv.DictReader(open(a.csv, encoding="utf-8-sig")))
    py = [r for r in rows if r.get("language") == "python"]
    if py:
        report(py, "PYTHON (gpt-4o-mini, bai bao)")

    out = os.path.join(REPO, "ms-analysis", "results", "validity_tiers.csv")
    with open(out, "w", encoding="utf-8", newline="") as fh:
        w = csv.writer(fh)
        w.writerow(["function_id", "language", "tier", "tier_label", "tests_passed",
                    "tests_failed", "branch_coverage", "note"])
        for r in rows:
            k = tier(r)
            w.writerow([r.get("function_id"), r.get("language"), k, LABEL[k],
                        r.get("tests_passed"), r.get("tests_failed"),
                        r.get("branch_coverage"), r.get("note")])
    print(f"\n-> {out}")
    return 0


if __name__ == "__main__":
    sys.exit(main())

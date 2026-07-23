"""Sinh ms-analysis/RESULTS-clean.md — bang so lieu hop nhat cho bai thu hai.

Doc thang tu cac file CSV do duoc, khong go tay con so nao. Chay lai bat cu luc nao sau
khi co them ket qua:

    python ms-analysis/scripts/report_clean.py

Bao cao SONG SONG hai cong xanh phia Java (xem PREREGISTRATION-clean.md muc 4bis) va
SONG SONG hai nhanh Pynguin (muc 3.1). Khong chon ban dep hon.
"""
from __future__ import annotations

import csv
import importlib.util
import os
import statistics as st

REPO = os.path.dirname(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))
R = os.path.join(REPO, "ms-analysis", "results")
OUT = os.path.join(REPO, "ms-analysis", "RESULTS-clean.md")

_spec = importlib.util.spec_from_file_location(
    "ac", os.path.join(os.path.dirname(os.path.abspath(__file__)), "analyze_clean.py"))
AC = importlib.util.module_from_spec(_spec)
_spec.loader.exec_module(AC)

# CJ-048 bi loai (miner tu gan nham protected->public). AC.load da loai san.
EXCLUDED = sorted(AC.EXCLUDE)


def load(name: str, col: str = "mutation_score") -> dict[str, float | None]:
    return AC.load(name, col)


def row(label: str, d: dict) -> str:
    if not d:
        return f"| {label} | — | — | — | — |"
    vals = [(v or 0.0) for v in d.values()]
    pos = [v for v in vals if v > 0]
    eff = f"{st.median(pos):.1f}" if pos else "—"
    return (f"| {label} | {len(d)} | {len(pos)} ({len(pos)/len(d)*100:.1f}\\%) "
            f"| {st.median(vals):.1f} | {eff} |")


def test_line(label: str, a: dict, b: dict) -> str:
    ids = sorted(set(a) & set(b))
    if not ids:
        return f"| {label} | — | — | — | thiếu dữ liệu |"
    pa = [(a[f] or 0.0) for f in ids]
    pb = [(b[f] or 0.0) for f in ids]
    n, _w, _z, p, rb = AC.wilcoxon(list(zip(pa, pb)))
    gain = sum(1 for f in ids if (b.get(f) or 0) > 0 and (a.get(f) or 0) == 0)
    lose = sum(1 for f in ids if (a.get(f) or 0) > 0 and (b.get(f) or 0) == 0)
    if p is None:
        return f"| {label} | {n} | +{gain} / −{lose} | — | n<6, không kiểm định được |"
    verdict = "**có ý nghĩa**" if p < 0.05 else "không có ý nghĩa"
    return f"| {label} | {n} | +{gain} / −{lose} | {p:.4f} / {rb:+.3f} | {verdict} |"


HEAD = ("| Điều kiện | n | T4 > 0 | median (all) | median (hiệu dụng) |\n"
        "|---|---:|---:|---:|---:|")
THEAD = ("| So sánh | n≠0 | được / mất | p / rank-biserial | Kết luận |\n"
         "|---|---:|---:|---|---|")


def main() -> int:
    L: list[str] = []
    w = L.append
    w("# Kết quả — dataset sạch\n")
    w("Sinh tự động bởi `ms-analysis/scripts/report_clean.py`. Không con số nào gõ tay.\n")
    w(f"Loại khỏi phân tích: {', '.join(EXCLUDED)} "
      "(miner tự gán nhầm `protected`→`public`, vi phạm chính tiêu chí F2).\n")

    # ---------------- PYTHON ----------------
    w("\n---\n\n## Python (n=60)\n")
    w("### T4 — mutation score > 0 (tầng chính, không lách được)\n")
    w(HEAD)
    w(row("GPT-4o-mini v1", load("mutation_on_target_clean_v1")))
    w(row("GPT-4o-mini v2", load("mutation_on_target_clean_v3fair")))
    w(row("Pynguin (mặc định)", load("baseline_T4_pynguin_default")))
    w(row("Pynguin (tắt master–worker)", load("baseline_T4_pynguin_fixed")))
    w("\n### T3 — branch coverage > 0 trong khoảng dòng của hàm\n")
    w(HEAD.replace("T4 > 0", "T3 > 0"))
    w(row("GPT-4o-mini v1", load("mutation_on_target_clean_v1", "branch_coverage")))
    w(row("GPT-4o-mini v2", load("mutation_on_target_clean_v3fair", "branch_coverage")))
    w(row("Pynguin (mặc định)", load("baseline_T4_pynguin_default", "branch_coverage")))
    w(row("Pynguin (tắt master–worker)", load("baseline_T4_pynguin_fixed", "branch_coverage")))

    w("\n### Kiểm định — Python\n")
    w(THEAD)
    w(test_line("RQ-B  v1 → v2  (T3)",
                load("mutation_on_target_clean_v1", "branch_coverage"),
                load("mutation_on_target_clean_v3fair", "branch_coverage")))
    w(test_line("RQ-B  v1 → v2  (T4)",
                load("mutation_on_target_clean_v1"),
                load("mutation_on_target_clean_v3fair")))
    for v, lab in (("default", "mặc định"), ("fixed", "tắt m–w")):
        w(test_line(f"RQ-C  GPT v1 vs Pynguin ({lab})  (T4)",
                    load("mutation_on_target_clean_v1"), load(f"baseline_T4_pynguin_{v}")))
        w(test_line(f"RQ-C  GPT v2 vs Pynguin ({lab})  (T4)",
                    load("mutation_on_target_clean_v3fair"), load(f"baseline_T4_pynguin_{v}")))

    # ---------------- JAVA ----------------
    for gate, suf, title in (("pertest", "", "cổng ≥1 test xanh (đúng đặc tả đã đăng ký)"),
                             ("strict", "_strictgate", "cổng cả suite phải xanh (bản cũ)")):
        w(f"\n---\n\n## Java (n=59) — {title}\n")
        w(HEAD)
        w(row("GPT-4o-mini v1", load("mutation_java_clean_v1" + suf)))
        w(row("GPT-4o-mini v2", load("mutation_java_clean_v3fair" + suf)))
        w(row("EvoSuite 1.2.0", load("baseline_T4_evosuite" + suf)))
        w(row("Randoop 4.3.3", load("baseline_T4_randoop" + suf)))
        w(f"\n### Kiểm định — Java, {title}\n")
        w(THEAD)
        w(test_line("RQ-B  v1 → v2  (T4)",
                    load("mutation_java_clean_v1" + suf),
                    load("mutation_java_clean_v3fair" + suf)))
        for tool, f in (("EvoSuite", "baseline_T4_evosuite"), ("Randoop", "baseline_T4_randoop")):
            w(test_line(f"RQ-C  GPT v1 vs {tool}  (T4)",
                        load("mutation_java_clean_v1" + suf), load(f + suf)))
            w(test_line(f"RQ-C  GPT v2 vs {tool}  (T4)",
                        load("mutation_java_clean_v3fair" + suf), load(f + suf)))

    # ---------------- RQ-A ----------------
    w("\n---\n\n## RQ-A — dataset gốc vs dataset sạch, **cùng prompt v1**\n")
    w("Không phải so sánh có kiểm soát: hai tập hàm khác nhau, tập sạch dễ hơn *theo thiết "
      "kế*. Chỉ báo cáo mức chênh, không quy nhân quả. Mỗi cặp đo bằng **cùng một cổng "
      "xanh** để so được.\n")
    w("| Ngôn ngữ | cổng | gốc | sạch |\n|---|---|---:|---:|")
    # Neu mutation_java_v1.csv van y het ban _strictgate thi dataset GOC chua duoc do lai
    # bang cong per-test -> hang do se la so LECH CONG, khong duoc in ra.
    def same_file(a: str, b: str) -> bool:
        pa, pb = os.path.join(R, a + ".csv"), os.path.join(R, b + ".csv")
        if not (os.path.exists(pa) and os.path.exists(pb)):
            return False
        return open(pa, "rb").read() == open(pb, "rb").read()

    java_pertest_ready = not same_file("mutation_java_v1", "mutation_java_v1_strictgate")
    for lang, old, new, gate in (
            ("Python", "mutation_on_target_v1", "mutation_on_target_clean_v1", "per-test"),
            ("Java", "mutation_java_v1_strictgate", "mutation_java_clean_v1_strictgate", "cả suite"),
            ("Java", "mutation_java_v1", "mutation_java_clean_v1", "per-test")):
        if lang == "Java" and gate == "per-test" and not java_pertest_ready:
            w("| Java | per-test | *(dataset gốc chưa đo lại bằng cổng per-test)* | — |")
            continue
        o, nw = load(old), load(new)
        if not (o and nw):
            continue
        po, pn = sum(1 for v in o.values() if v and v > 0), sum(1 for v in nw.values() if v and v > 0)
        w(f"| {lang} | {gate} | {po}/{len(o)} ({po/len(o)*100:.1f}\\%) "
          f"| {pn}/{len(nw)} ({pn/len(nw)*100:.1f}\\%) |")

    # ---------------- ly do that bai ----------------
    w("\n---\n\n## Vì sao hỏng — phân bố lý do\n")
    for name, f in (("Java GPT v1", "mutation_java_clean_v1"),
                    ("Java GPT v2", "mutation_java_clean_v3fair"),
                    ("Java EvoSuite", "baseline_T4_evosuite"),
                    ("Java Randoop", "baseline_T4_randoop"),
                    ("Python GPT v1", "mutation_on_target_clean_v1"),
                    ("Python GPT v2", "mutation_on_target_clean_v3fair"),
                    ("Python Pynguin (mặc định)", "baseline_T4_pynguin_default"),
                    ("Python Pynguin (tắt m–w)", "baseline_T4_pynguin_fixed")):
        p = os.path.join(R, f + ".csv")
        if not os.path.exists(p):
            continue
        cnt: dict[str, int] = {}
        for r in csv.DictReader(open(p, encoding="utf-8-sig")):
            if r["func_id"] in AC.EXCLUDE:
                continue
            k = (r.get("note") or "").strip() or "đo được"
            cnt[k] = cnt.get(k, 0) + 1
        w(f"\n**{name}**\n")
        for k, v in sorted(cnt.items(), key=lambda x: -x[1]):
            w(f"- {v} — {k}")

    open(OUT, "w", encoding="utf-8", newline="\n").write("\n".join(L) + "\n")
    print("->", OUT)
    return 0


if __name__ == "__main__":
    raise SystemExit(main())

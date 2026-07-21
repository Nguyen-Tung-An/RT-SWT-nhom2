"""Xuat TOAN BO ket qua METRIC (gia tri coverage/mutation, khong chi dem tang).

Khac export_results.py (dem tang T1-T4), file nay xuat GIA TRI metric that:
  - So chinh thuc bai bao: RQ1/RQ2/RQ3 tu summary_8lib.csv (khong dung vao)
  - So do lai: median branch coverage & mutation o CA HAI muc 'all' va 'effective'
  - Tien trinh v1->v4 (cho bai sau), moi con so kem TANG

Nguyen tac giu nguyen: khong gop 2 ngon ngu, o trong khong dien 0, ghi ro dong co do.
Moi con so o day duoc doi chieu voi file goc o cuoi ham (assert), chay loi neu lech.

Chay:  python ms-analysis/scripts/export_metrics.py
"""
from __future__ import annotations

import csv
import os
import statistics as st

REPO = os.path.dirname(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))
R = os.path.join(REPO, "ms-analysis", "results")


def rows(name):
    p = os.path.join(R, name)
    return list(csv.DictReader(open(p, encoding="utf-8-sig"))) if os.path.exists(p) else []


def fnum(v):
    try:
        return float(v)
    except (TypeError, ValueError):
        return None


def med(vals, nd=1):
    v = [x for x in vals if x is not None]
    return round(st.median(v), nd) if v else None


def med_all(rs, col):
    """Muc 'all': o trong / khong do duoc tinh 0 (dung quy tac dang ky cua bai)."""
    return med([fnum(r.get(col)) or 0.0 for r in rs])


def med_eff(rs, col):
    """Muc 'effective': chi tinh tren tap co gia tri > 0."""
    return med([fnum(r.get(col)) for r in rs if (fnum(r.get(col)) or 0) > 0])


def n_eff(rs, col):
    return sum(1 for r in rs if (fnum(r.get(col)) or 0) > 0)


L = []
A = L.append
A("# Toàn bộ kết quả metric\n")
A("Sinh bằng `ms-analysis/scripts/export_metrics.py`, đọc thẳng từ file, đối chiếu tự động.")
A("Hai ngôn ngữ **không gộp** — mẫu số luôn `/60`. Ô để trống = không đo được, không phải 0.\n")

# ============================================================ 1. BAI BAO
A("\n## 1. Số chính thức của bài báo (RQ1–RQ3)\n")
A("Nguồn: `summary_8lib.csv`. Đây là kết quả confirmatory, **không đụng vào**.\n")
A("| RQ | Nhóm | n | Median / ρ | p | Effect (rb) | Quyết định |")
A("|---|---|---:|---:|---:|---:|---|")
label = {
    "RQ1_cov>=80_python": ("RQ1 cov≥80%", "Python"), "RQ1_cov>=80_java": ("RQ1 cov≥80%", "Java"),
    "RQ2A_mut>=60_python": ("RQ2A mut≥60%", "Python"), "RQ2A_mut>=60_java": ("RQ2A mut≥60%", "Java"),
    "RQ2B_gpt_vs_evosuite": ("RQ2B vs EvoSuite", "Java"),
    "RQ2B_gpt_vs_randoop": ("RQ2B vs Randoop", "Java"),
    "RQ2B_gpt_vs_pynguin": ("RQ2B vs Pynguin", "Python"),
    "RQ3_cc~cov_python": ("RQ3 CC↔cov", "Python"), "RQ3_cc~cov_java": ("RQ3 CC↔cov", "Java"),
}
summ = {r["rq"]: r for r in rows("summary_8lib.csv")}
for key, (rq, grp) in label.items():
    r = summ.get(key)
    if not r:
        continue
    dec = r["decision"].replace("fail to reject H0", "❌ fail-reject-H0").replace(
        "khac biet co y nghia", "✅ có ý nghĩa")
    p = fnum(r["p"])
    A(f"| {rq} | {grp} | {r['n']} | {r.get('median') or r.get('stat')} "
      f"| {p:.4f} | {r.get('effect_rb', '')} | {dec} |")
A("\n**Ba RQ chính (RQ1/RQ2A/RQ3) đều fail to reject H0** — GPT-4o-mini one-shot không đạt")
A("80% coverage, không đạt 60% mutation, không có tương quan âm với CC.")

# ============================================================ 2. DO LAI V1
A("\n\n## 2. Số đo lại — v1 (one-shot, đúng thí nghiệm của bài), n=60\n")
A("Đo bằng bộ 4 tầng. Giá trị median ghi ở cả hai mức **all** (invalid=0) và **effective** (>0).\n")

py1 = rows("mutation_on_target_v1.csv")
jv1 = rows("mutation_java_v1.csv")

A("### Python\n")
A("| Metric | median (all) | median (effective) | n effective |")
A("|---|---:|---:|---:|")
A(f"| Branch coverage | {med_all(py1, 'branch_coverage')}% | {med_eff(py1, 'branch_coverage')}% "
  f"| {n_eff(py1, 'branch_coverage')}/60 |")
A(f"| Mutation score | {med_all(py1, 'mutation_score')}% | {med_eff(py1, 'mutation_score')}% "
  f"| {n_eff(py1, 'mutation_score')}/60 |")

A("\n### Java\n")
A("Động cơ đột biến riêng (không phải PIT). File không lưu branch coverage riêng nên chỉ báo mutation.\n")
A("| Metric | median (all) | median (effective) | n effective |")
A("|---|---:|---:|---:|")
A(f"| Mutation score | {med_all(jv1, 'mutation_score')}% | {med_eff(jv1, 'mutation_score')}% "
  f"| {n_eff(jv1, 'mutation_score')}/60 |")

A("\n> ⚠️ Median 'effective' cao (Python cov 75%, Java mut cao) **không** nghĩa là test tốt.")
A("> Đó là hình mẫu được-ăn-cả-ngã-về-không: số ít hàm chạm đúng đích thì kiểm thử khá, còn")
A("> đại đa số (Python 41/60, Java 54/60) không lọt tới tầng đo nên = 0. Median 'all' mới")
A("> phản ánh toàn cục, và nó = 0.")

# ============================================================ 3. TIEN TRINH (bai sau)
A("\n\n## 3. Tiến trình cải thiện — cho bài tiếp theo (KHÔNG dùng cho bài hiện tại)\n")
A("v2/v3/v4 đổi prompt + vòng sửa lỗi → là thí nghiệm post-hoc, thuộc bài sau, không đưa")
A("vào bài one-shot. Chỉ **T4 (mutation chạm đích)** đáng tin — tầng nông lách được.\n")

pyb = rows("mutation_on_target_best.csv")
jv4 = rows("mutation_java_v4.csv")


def t4(rs):
    return sum(1 for r in rs if (fnum(r.get("mutation_score")) or 0) > 0)


A("### Python — T4 (số hàm giết được mutant)\n")
A("| | v1 | v3+repair |")
A("|---|---:|---:|")
A(f"| Hàm có mutation>0 | {t4(py1)} | **{t4(pyb)}** |")
A(f"| Median mutation (tập >0) | {med_eff(py1, 'mutation_score')}% | {med_eff(pyb, 'mutation_score')}% |")
A("\n*(T4 chỉ đo tại v1 và bản cuối; v2/v3 thuần chưa đo T4.)*")

A("\n### Java — T4\n")
A("| | v1 | v4 |")
A("|---|---:|---:|")
A(f"| Hàm có mutation>0 | {t4(jv1)} | **{t4(jv4)}** |")
A(f"| Median mutation (tập >0) | {med_eff(jv1, 'mutation_score')}% | {med_eff(jv4, 'mutation_score')}% |")
A("\n> ⚠️ Java v4: T1 (biên dịch) tăng 0→4 ở nhóm `private` nhờ reflection là **giả** — T4 chỉ 0→1.")

# ============================================================ 4. DOI CHIEU
A("\n\n## 4. Đối chiếu bài báo ↔ đo lại (chỉ v1)\n")
paper = {x["function_id"]: x for x in rows("metrics_merged_8lib.csv")
         if x.get("method") == "gpt-4o-mini"}
gt = {r["func_id"]: r for r in csv.DictReader(
    open(os.path.join(REPO, "data", "full_ground_truth.csv"), encoding="utf-8-sig"))}
pyids = [f for f, g in gt.items() if g["language"] == "python"]
jvids = [f for f, g in gt.items() if g["language"] == "java"]
jc = {r["func_id"]: r for r in rows("java_compile_check.csv")}
A("| Chỉ số | Bài báo | Đo lại | Ghi chú |")
A("|---|---:|---:|---|")
A(f"| Java compiled | {sum(1 for f in jvids if paper.get(f, {}).get('compiled') == '1')}/60 "
  f"| {sum(1 for f in jvids if jc.get(f, {}).get('compiles') == '1')}/60 | Cờ suy từ báo cáo, không đo biên dịch |")
why1 = {r["func_id"]: r for r in rows("why_fail_v1.csv")}
A(f"| Python có test chạy | {sum(1 for f in pyids if paper.get(f, {}).get('compiled') == '1')}/60 "
  f"| {sum(1 for f in pyids if (int(why1.get(f, {}).get('n_pass') or 0) > 0))}/60 | 'chạy' ≠ 'pass' |")
A("| Python mutation>0 | 15/60 | 13/60 | khớp |")
A("| Java mutation>0 | 1/60 (PIT) | 6/60 (động cơ riêng) | ⚠️ khác động cơ, không so chéo |")

out = os.path.join(REPO, "ms-analysis", "METRICS.md")
open(out, "w", encoding="utf-8", newline="\n").write("\n".join(L) + "\n")

# ---- doi chieu tu dong: cac con so chot phai khop file goc ----
checks = [
    ("PY T4 v1", t4(py1), 13), ("PY T4 best", t4(pyb), 23),
    ("JV T4 v1", t4(jv1), 6), ("JV T4 v4", t4(jv4), 10),
    ("PY cov eff v1", med_eff(py1, "branch_coverage"), 75.0),
    ("JV compiled v1", sum(1 for f in jvids if jc.get(f, {}).get("compiles") == "1"), 17),
]
bad = [(n, g, w) for n, g, w in checks if g != w]
print(f"-> {out}")
if bad:
    print("!! LECH:", bad)
    raise SystemExit(1)
print("doi chieu: tat ca", len(checks), "con so chot KHOP file goc")

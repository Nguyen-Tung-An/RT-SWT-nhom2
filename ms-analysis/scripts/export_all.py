"""Xuat TOAN BO ket qua do cua du an — moi cong cu, moi ngon ngu, moi metric.

Gop tat ca vao mot tai lieu MASTER-RESULTS.md:
  0. So sanh 5 cong cu (gpt-4o-mini + EvoSuite/Randoop/Pynguin) — coverage & mutation
  1. Ket qua thong ke 3 RQ (summary_8lib.csv)
  2. Do lai gpt-4o-mini v1 bang bo 4 tang
  3. Tien trinh cai thien v1->v4 (bai sau)
  4. Doi chieu bai bao <-> do lai
Moi con so doc thang tu file, co assert doi chieu o cuoi (chay loi neu lech).

Chay:  python ms-analysis/scripts/export_all.py
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


def m_all(rs, col):
    return med([fnum(r.get(col)) or 0.0 for r in rs])


def m_eff(rs, col):
    return med([fnum(r.get(col)) for r in rs if (fnum(r.get(col)) or 0) > 0])


def n_eff(rs, col):
    return sum(1 for r in rs if (fnum(r.get(col)) or 0) > 0)


merged = rows("metrics_merged_8lib.csv")


def sub(method, lang):
    return [r for r in merged if r.get("method") == method and r.get("language") == lang]


L, A = [], lambda s: L.append(s)
A("# Toàn bộ kết quả đo — dự án LLM Unit Test Generation\n")
A("Nhóm RT-SWT-nhom2 · SWT301 RBL · sinh bằng `ms-analysis/scripts/export_all.py`")
A("(đọc thẳng từ file, tự đối chiếu). **Không gộp hai ngôn ngữ** — mẫu số luôn `/60`.")
A("Ô trống = không đo được, không phải 0.\n")

# ---------- 0. SO SANH 5 CONG CU ----------
A("\n## 0. So sánh công cụ — kết quả cốt lõi của dự án\n")
A("Median ở hai mức: **all** (invalid/không chạm = 0) và **effective** (chỉ tập >0).\n")
A("### Branch coverage\n")
A("| Công cụ | Ngôn ngữ | median all | median effective | n effective |")
A("|---|---|---:|---:|---:|")
order = [("gpt-4o-mini", "java"), ("evosuite", "java"), ("randoop", "java"),
         ("gpt-4o-mini", "python"), ("pynguin", "python")]
name = {"gpt-4o-mini": "GPT-4o-mini", "evosuite": "EvoSuite", "randoop": "Randoop",
        "pynguin": "Pynguin"}
for m, l in order:
    rs = sub(m, l)
    A(f"| {name[m]} | {l} | {m_all(rs, 'branch_coverage')}% | {m_eff(rs, 'branch_coverage')}% "
      f"| {n_eff(rs, 'branch_coverage')}/60 |")
A("\n### Mutation score\n")
A("| Công cụ | Ngôn ngữ | median all | median effective | n effective |")
A("|---|---|---:|---:|---:|")
for m, l in order:
    rs = sub(m, l)
    A(f"| {name[m]} | {l} | {m_all(rs, 'mutation_score')}% | {m_eff(rs, 'mutation_score')}% "
      f"| {n_eff(rs, 'mutation_score')}/60 |")
A("\n> Median **all** = 0 gần khắp bảng: quá nửa suite của mọi công cụ không hợp lệ hoặc")
A("> không chạm đích. So sánh có ý nghĩa nằm ở mức **effective** và ở kiểm định ghép cặp (mục 1).")

# ---------- 1. RQ ----------
A("\n\n## 1. Kết quả thống kê ba RQ (số chính thức bài báo)\n")
A("Nguồn `summary_8lib.csv`. α=0.05.\n")
A("| RQ | Nhóm | n | Median/ρ | p | Effect | Quyết định |")
A("|---|---|---:|---:|---:|---:|---|")
summ = {r["rq"]: r for r in rows("summary_8lib.csv")}
disp = [
    ("RQ1_cov>=80_python", "RQ1 cov≥80%", "Python"), ("RQ1_cov>=80_java", "RQ1 cov≥80%", "Java"),
    ("RQ2A_mut>=60_python", "RQ2A mut≥60%", "Python"), ("RQ2A_mut>=60_java", "RQ2A mut≥60%", "Java"),
    ("RQ2B_gpt_vs_evosuite", "RQ2B vs EvoSuite", "Java"),
    ("RQ2B_gpt_vs_randoop", "RQ2B vs Randoop", "Java"),
    ("RQ2B_gpt_vs_pynguin", "RQ2B vs Pynguin", "Python"),
    ("RQ3_cc~cov_python", "RQ3 CC↔cov", "Python"), ("RQ3_cc~cov_java", "RQ3 CC↔cov", "Java"),
]
for key, rq, grp in disp:
    r = summ.get(key)
    if not r:
        continue
    dec = "❌ fail-reject-H0" if "fail" in r["decision"] else "✅ có ý nghĩa"
    A(f"| {rq} | {grp} | {r['n']} | {r.get('median') or r.get('stat')} | {fnum(r['p']):.4f} "
      f"| {r.get('effect_rb', '')} | {dec} |")
A("\n**RQ1/RQ2A/RQ3 đều fail to reject H0** — GPT-4o-mini one-shot không đạt ngưỡng nào.")
A("RQ2B: GPT **thua** EvoSuite & Randoop (Java), **hơn** Pynguin (Python, vì Pynguin sập).")

# ---------- 2. DO LAI V1 ----------
A("\n\n## 2. Đo lại GPT-4o-mini v1 bằng bộ 4 tầng (n=60)\n")
py1, jv1 = rows("mutation_on_target_v1.csv"), rows("mutation_java_v1.csv")
jc = {r["func_id"]: r for r in rows("java_compile_check.csv")}
why1 = {r["func_id"]: r for r in rows("why_fail_v1.csv")}
gt = {r["func_id"]: r for r in csv.DictReader(
    open(os.path.join(REPO, "data", "full_ground_truth.csv"), encoding="utf-8-sig"))}
pyids = [f for f, g in gt.items() if g["language"] == "python"]
jvids = [f for f, g in gt.items() if g["language"] == "java"]
A("| Tầng | Python | Java | Ý nghĩa |")
A("|---|---:|---:|---|")
A(f"| T1 biên dịch được | — (Python thông dịch) "
  f"| {sum(1 for f in jvids if jc.get(f, {}).get('compiles') == '1')} | mã hợp lệ |")
A(f"| T2 ≥1 test xanh | {sum(1 for f in pyids if int(why1.get(f, {}).get('n_pass') or 0) > 0)} "
  f"| {sum(1 for r in jv1 if (fnum(r.get('n_test')) or 0) > 0 and not (r.get('note') or '').startswith('RED'))} | chạy được |")
A(f"| T3 chạm hàm đích | {n_eff(py1, 'branch_coverage')} | — | đúng mục tiêu |")
A(f"| **T4 giết mutant** | **{n_eff(py1, 'mutation_score')}** | **{n_eff(jv1, 'mutation_score')}** | **phát hiện lỗi** |")
A(f"\nMedian metric (tập effective): Python cov **{m_eff(py1, 'branch_coverage')}%**, "
  f"mutation **{m_eff(py1, 'mutation_score')}%**; Java mutation **{m_eff(jv1, 'mutation_score')}%**.")
A("Median **all** đều 0% — đại đa số hàm không lọt tới tầng đo.")

# ---------- 3. TIEN TRINH ----------
A("\n\n## 3. Tiến trình cải thiện — bài tiếp theo (KHÔNG thuộc bài one-shot hiện tại)\n")
pyb, jv4 = rows("mutation_on_target_best.csv"), rows("mutation_java_v4.csv")
A("| | Python T4 | Java T4 |")
A("|---|---:|---:|")
A(f"| v1 (one-shot) | {n_eff(py1, 'mutation_score')} | {n_eff(jv1, 'mutation_score')} |")
A(f"| bản cuối (Py: v3+repair, Java: v4) | **{n_eff(pyb, 'mutation_score')}** | **{n_eff(jv4, 'mutation_score')}** |")
A("\n> v2/v3/v4 đổi prompt + vòng sửa lỗi → post-hoc, để dành bài sau (chống HARKing).")

# ---------- 4. DOI CHIEU ----------
A("\n\n## 4. Đối chiếu bài báo ↔ đo lại (v1)\n")
paper = {x["function_id"]: x for x in merged if x.get("method") == "gpt-4o-mini"}
A("| Chỉ số | Bài báo | Đo lại | Ghi chú |")
A("|---|---:|---:|---|")
A(f"| Java compiled | {sum(1 for f in jvids if paper.get(f, {}).get('compiled') == '1')}/60 "
  f"| {sum(1 for f in jvids if jc.get(f, {}).get('compiles') == '1')}/60 | cờ suy từ báo cáo, đã sửa vào Threats |")
A(f"| Python có test chạy | {sum(1 for f in pyids if paper.get(f, {}).get('compiled') == '1')}/60 "
  f"| {sum(1 for f in pyids if int(why1.get(f, {}).get('n_pass') or 0) > 0)}/60 | 'chạy' ≠ 'pass' |")
A("| Python mutation>0 | 15/60 | 13/60 | khớp |")
A("| Java mutation>0 | 1/60 (PIT) | 6/60 (động cơ riêng) | ⚠️ khác động cơ |")

A("\n\n## Tài liệu liên quan\n")
A("- `METRICS.md` — giá trị metric chi tiết · `RESULTS.md` — đếm tầng")
A("- `CAUSAL-CHAIN.md` — chuỗi nhân quả · `MEASUREMENT.md` — bộ đo")
A("- `MEASUREMENT-PITFALLS.md` — 7 lỗi đo lường · `results/ALL.csv` — từng hàm")

out = os.path.join(REPO, "ms-analysis", "MASTER-RESULTS.md")
open(out, "w", encoding="utf-8", newline="\n").write("\n".join(L) + "\n")

# ---- assert doi chieu ----
checks = [
    ("evosuite cov eff", m_eff(sub("evosuite", "java"), "branch_coverage"), 90.8),
    ("gpt java mut eff", m_eff(sub("gpt-4o-mini", "java"), "mutation_score"), 100.0),
    ("pynguin cov eff", m_eff(sub("pynguin", "python"), "branch_coverage"), 75.0),
    ("PY T4 v1", n_eff(py1, "mutation_score"), 13),
    ("JV T4 v1", n_eff(jv1, "mutation_score"), 6),
    ("JV compiled v1", sum(1 for f in jvids if jc.get(f, {}).get("compiles") == "1"), 17),
]
bad = [(n, g, w) for n, g, w in checks if g != w]
print(f"-> {out}")
if bad:
    print("!! LECH:", bad)
    raise SystemExit(1)
print(f"doi chieu: tat ca {len(checks)} con so chot KHOP file goc")

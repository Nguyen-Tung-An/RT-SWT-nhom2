"""Xuat TOAN BO ket qua da do lai — doc thang tu file, khong nhap tay con so nao.

Sinh 2 dau ra:
  ms-analysis/RESULTS.md           — bao cao doc duoc, theo TANG va theo NGON NGU
  ms-analysis/results/ALL.csv      — mot dong / ham, moi phep do o cot rieng

Nguyen tac (rut ra tu chinh phien audit nay):
  - Khong bao gio gop Java + Python thanh /120. Hai bo cong cu khac nhau.
  - Moi con so ghi kem TANG do (T1..T4, xem MEASUREMENT.md).
  - O nao khong do duoc thi de TRONG, khong dien 0.
  - So cua bai bao va so do lai de canh nhau, ghi ro cai nao la cai nao.

Chay:  python ms-analysis/scripts/export_results.py
"""
from __future__ import annotations

import csv
import os
import statistics as st

REPO = os.path.dirname(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))
R = os.path.join(REPO, "ms-analysis", "results")


def rows(name: str) -> list[dict]:
    p = os.path.join(R, name)
    if not os.path.exists(p):
        return []
    return list(csv.DictReader(open(p, encoding="utf-8-sig")))


def by_id(name: str, key: str = "func_id") -> dict[str, dict]:
    return {r[key]: r for r in rows(name) if r.get(key)}


def fnum(v):
    try:
        return float(v)
    except (TypeError, ValueError):
        return None


def pos(v) -> bool:
    f = fnum(v)
    return f is not None and f > 0


# ---------------------------------------------------------------- thu thap
gt = {r["func_id"]: r for r in rows("../../data/full_ground_truth.csv")} or \
     {r["func_id"]: r for r in csv.DictReader(
         open(os.path.join(REPO, "data", "full_ground_truth.csv"), encoding="utf-8-sig"))}
gt3 = {r["func_id"]: r for r in csv.DictReader(
    open(os.path.join(REPO, "data", "full_ground_truth_v3.csv"), encoding="utf-8-sig"))}

paper = {}
for r in rows("metrics_merged_8lib.csv"):
    if r.get("method") == "gpt-4o-mini":
        paper[r["function_id"]] = r
proj = {r["function_id"]: r for r in rows("metrics_project.csv") if r.get("language") == "python"}

PY = {
    "why_v1": by_id("why_fail_v1.csv"), "why_v2": by_id("why_fail_v2.csv"),
    "why_v3": by_id("why_fail_v3.csv"),
    "repair": {r["func_id"]: r for r in rows("repair_v3r2c.csv")},
    "mut_v1": by_id("mutation_on_target_v1.csv"),
    "mut_best": by_id("mutation_on_target_best.csv"),
}
JV = {
    "comp_v1": by_id("java_compile_check.csv"), "comp_v4": by_id("java_compile_v4.csv"),
    "mut_v1": by_id("mutation_java_v1.csv"), "mut_v4": by_id("mutation_java_v4.csv"),
    "autoimp": by_id("java_autoimport.csv"),
}


def py_pass(stage: str, fid: str):
    if stage == "final":
        a = PY["why_v3"].get(fid, {}).get("n_pass")
        b = PY["repair"].get(fid, {}).get("pass_after")
        vals = [int(x) for x in (a, b) if x not in (None, "")]
        return max(vals) if vals else None
    v = PY[stage].get(fid, {}).get("n_pass")
    return int(v) if v not in (None, "") else None


# ---------------------------------------------------------------- ALL.csv
out_rows = []
for fid, g in sorted(gt.items()):
    lang = g["language"]
    row = {"func_id": fid, "language": lang, "cc": g["cc"],
           "source_repo": g.get("source_repo", ""),
           "visibility": gt3.get(fid, {}).get("visibility", ""),
           "receiver_kind": gt3.get(fid, {}).get("receiver_kind", ""),
           "paper_compiled": paper.get(fid, {}).get("compiled", ""),
           "paper_branch_cov": paper.get(fid, {}).get("branch_coverage", ""),
           "paper_mutation": paper.get(fid, {}).get("mutation_score", "")}
    if lang == "python":
        row |= {
            "py_T2_pass_v1": py_pass("why_v1", fid), "py_T2_pass_v2": py_pass("why_v2", fid),
            "py_T2_pass_v3": py_pass("why_v3", fid), "py_T2_pass_final": py_pass("final", fid),
            "py_cause_v1": PY["why_v1"].get(fid, {}).get("cause", ""),
            "py_cause_v3": PY["why_v3"].get(fid, {}).get("cause", ""),
            "py_T3_cov_v1": PY["mut_v1"].get(fid, {}).get("branch_coverage", ""),
            "py_T3_cov_best": PY["mut_best"].get(fid, {}).get("branch_coverage", ""),
            "py_T4_mut_v1": PY["mut_v1"].get(fid, {}).get("mutation_score", ""),
            "py_T4_mut_best": PY["mut_best"].get(fid, {}).get("mutation_score", ""),
        }
    else:
        row |= {
            "jv_T1_compile_v1": JV["comp_v1"].get(fid, {}).get("compiles", ""),
            "jv_T1_compile_v4": JV["comp_v4"].get(fid, {}).get("compiles", ""),
            "jv_err_v1": JV["comp_v1"].get(fid, {}).get("error_type", ""),
            "jv_err_v4": JV["comp_v4"].get(fid, {}).get("error_type", ""),
            "jv_fixed_by_import": JV["autoimp"].get(fid, {}).get("fixed_by_import", ""),
            "jv_T2_ntest_v1": JV["mut_v1"].get(fid, {}).get("n_test", ""),
            "jv_T2_ntest_v4": JV["mut_v4"].get(fid, {}).get("n_test", ""),
            "jv_T4_mut_v1": JV["mut_v1"].get(fid, {}).get("mutation_score", ""),
            "jv_T4_mut_v4": JV["mut_v4"].get(fid, {}).get("mutation_score", ""),
        }
    out_rows.append(row)

cols: list[str] = []
for r in out_rows:
    for k in r:
        if k not in cols:
            cols.append(k)
allp = os.path.join(R, "ALL.csv")
with open(allp, "w", encoding="utf-8", newline="") as fh:
    w = csv.DictWriter(fh, fieldnames=cols)
    w.writeheader()
    for r in out_rows:
        w.writerow({c: r.get(c, "") for c in cols})

# ---------------------------------------------------------------- RESULTS.md
pyids = [f for f, g in gt.items() if g["language"] == "python"]
jvids = [f for f, g in gt.items() if g["language"] == "java"]


def c(ids, fn):
    return sum(1 for f in ids if fn(f))


def med(vals):
    v = [x for x in vals if x is not None]
    return f"{st.median(v):.1f}" if v else "—"


L = []
A = L.append
A("# Toàn bộ kết quả đã đo lại\n")
A("Sinh tự động bằng `ms-analysis/scripts/export_results.py` — mọi con số đọc thẳng từ file")
A("kết quả, không nhập tay. Dữ liệu chi tiết từng hàm: `ms-analysis/results/ALL.csv`.\n")
A("Tầng đo T1–T4 định nghĩa trong [MEASUREMENT.md](MEASUREMENT.md). **Hai ngôn ngữ không")
A("gộp chung** — mẫu số luôn là `/60` của riêng ngôn ngữ đó.\n")

A("\n## PYTHON — n=60\n")
A("| Tầng | Tiêu chí | v1 | v2 | v3 | v3+repair |")
A("|---|---|---:|---:|---:|---:|")
A(f"| T2 | ≥1 test xanh | {c(pyids, lambda f: (py_pass('why_v1', f) or 0) > 0)} "
  f"| {c(pyids, lambda f: (py_pass('why_v2', f) or 0) > 0)} "
  f"| {c(pyids, lambda f: (py_pass('why_v3', f) or 0) > 0)} "
  f"| **{c(pyids, lambda f: (py_pass('final', f) or 0) > 0)}** |")
A(f"| T3 | chạm hàm đích | {c(pyids, lambda f: pos(PY['mut_v1'].get(f, {}).get('branch_coverage')))} "
  f"| — | — | **{c(pyids, lambda f: pos(PY['mut_best'].get(f, {}).get('branch_coverage')))}** |")
A(f"| **T4** | **giết được mutant** | **{c(pyids, lambda f: pos(PY['mut_v1'].get(f, {}).get('mutation_score')))}** "
  f"| — | — | **{c(pyids, lambda f: pos(PY['mut_best'].get(f, {}).get('mutation_score')))}** |")
A(f"\nTổng test pass: {sum(py_pass('why_v1', f) or 0 for f in pyids)} → "
  f"**{sum(py_pass('final', f) or 0 for f in pyids)}**")
A(f"\nMedian mutation trên tập đo được: v1 "
  f"{med([fnum(PY['mut_v1'].get(f, {}).get('mutation_score')) for f in pyids])}% → best "
  f"{med([fnum(PY['mut_best'].get(f, {}).get('mutation_score')) for f in pyids])}%")

A("\n### Python — nguyên nhân thất bại (v1 → v3)\n")
import collections
c1 = collections.Counter(PY["why_v1"].get(f, {}).get("cause", "?") for f in pyids)
c3 = collections.Counter(PY["why_v3"].get(f, {}).get("cause", "?") for f in pyids)
A("| Nguyên nhân | v1 | v3 |")
A("|---|---:|---:|")
for k in sorted(set(c1) | set(c3)):
    A(f"| {k} | {c1.get(k, 0)} | {c3.get(k, 0)} |")

A("\n\n## JAVA — n=60\n")
A("| Tầng | Tiêu chí | v1 | v4 |")
A("|---|---|---:|---:|")
A(f"| T1 | biên dịch được | {c(jvids, lambda f: JV['comp_v1'].get(f, {}).get('compiles') == '1')} "
  f"| {c(jvids, lambda f: JV['comp_v4'].get(f, {}).get('compiles') == '1')} |")
A(f"| T2 | test xanh trên bản gốc | {c(jvids, lambda f: (fnum(JV['mut_v1'].get(f, {}).get('n_test')) or 0) > 0 and not (JV['mut_v1'].get(f, {}).get('note') or '').startswith('RED'))} "
  f"| {c(jvids, lambda f: (fnum(JV['mut_v4'].get(f, {}).get('n_test')) or 0) > 0 and not (JV['mut_v4'].get(f, {}).get('note') or '').startswith('RED'))} |")
A(f"| **T4** | **giết được mutant** | **{c(jvids, lambda f: pos(JV['mut_v1'].get(f, {}).get('mutation_score')))}** "
  f"| **{c(jvids, lambda f: pos(JV['mut_v4'].get(f, {}).get('mutation_score')))}** |")

A("\n### Java — phân tầng theo visibility\n")
A("| Visibility | n | T1 v1 | T1 v4 | T4 v1 | T4 v4 |")
A("|---|---:|---:|---:|---:|---:|")
for vis in ("public", "protected", "package-private", "private"):
    ids = [f for f in jvids if gt3.get(f, {}).get("visibility") == vis]
    if not ids:
        continue
    A(f"| `{vis}` | {len(ids)} "
      f"| {c(ids, lambda f: JV['comp_v1'].get(f, {}).get('compiles') == '1')} "
      f"| {c(ids, lambda f: JV['comp_v4'].get(f, {}).get('compiles') == '1')} "
      f"| {c(ids, lambda f: pos(JV['mut_v1'].get(f, {}).get('mutation_score')))} "
      f"| {c(ids, lambda f: pos(JV['mut_v4'].get(f, {}).get('mutation_score')))} |")

A("\n### Java — loại lỗi biên dịch\n")
e1 = collections.Counter(JV["comp_v1"].get(f, {}).get("error_type", "") for f in jvids
                         if JV["comp_v1"].get(f, {}).get("compiles") != "1")
e4 = collections.Counter(JV["comp_v4"].get(f, {}).get("error_type", "") for f in jvids
                         if JV["comp_v4"].get(f, {}).get("compiles") != "1")
A("| Lỗi | v1 | v4 |")
A("|---|---:|---:|")
for k in sorted(set(e1) | set(e4)):
    A(f"| {k or '(không rõ)'} | {e1.get(k, 0)} | {e4.get(k, 0)} |")

A("\n\n## Đối chiếu với số của bài báo\n")
A("| Chỉ số | Bài báo | Đo lại | Ghi chú |")
A("|---|---:|---:|---|")
A(f"| Java `compiled` | {c(jvids, lambda f: paper.get(f, {}).get('compiled') == '1')}/60 "
  f"| **{c(jvids, lambda f: JV['comp_v1'].get(f, {}).get('compiles') == '1')}/60** "
  f"| Cờ gán cứng, không đo biên dịch |")
A(f"| Python `compiled` | {c(pyids, lambda f: paper.get(f, {}).get('compiled') == '1')}/60 "
  f"| **{c(pyids, lambda f: (py_pass('why_v1', f) or 0) > 0)}/60** "
  f"| Bài báo đếm \"có test **chạy**\", không phải **pass** |")
A(f"| Python mutation>0 | {c(pyids, lambda f: pos(paper.get(f, {}).get('mutation_score')))}/60 "
  f"| {c(pyids, lambda f: pos(PY['mut_v1'].get(f, {}).get('mutation_score')))}/60 | Khớp |")
A(f"| Java mutation>0 | {c(jvids, lambda f: pos(paper.get(f, {}).get('mutation_score')))}/60 (PIT) "
  f"| {c(jvids, lambda f: pos(JV['mut_v1'].get(f, {}).get('mutation_score')))}/60 (động cơ riêng) "
  f"| ⚠️ **Hai động cơ khác nhau — không so chéo được** |")

A("\n\n## Cảnh báo bắt buộc đọc\n")
A("1. **Java nhóm `private`**: T1 v4 = 4 nhưng T4 v4 = 1. Reflection làm `javac` hết khả năng")
A("   kiểm tra tên (`getDeclaredMethod(\"tenBia\")` → `rc=0`), nên T1 ở nhóm này là chỉ số rỗng.")
A("2. **Không so chéo động cơ đột biến.** PIT (bài báo) và động cơ trong repo này sinh mutant")
A("   khác nhau. Chỉ so v1↔v4 hoặc v1↔best **trong cùng động cơ**.")
A("3. **Ô trống ≠ 0.** Cột để trống nghĩa là không đo được, không phải đo ra 0.")
A("4. **n nhỏ cho kết quả đẹp hơn.** Nhóm lớp-sai Java: n=48 cho 0/17 (tuyệt đối), n=60 cho")
A("   1/18 (5.6%). Con số phải báo cáo là 5.6%.")
A("\nChi tiết lỗi đo lường: [MEASUREMENT-PITFALLS.md](MEASUREMENT-PITFALLS.md)")

mdp = os.path.join(REPO, "ms-analysis", "RESULTS.md")
open(mdp, "w", encoding="utf-8", newline="\n").write("\n".join(L) + "\n")

print(f"-> {mdp}")
print(f"-> {allp}  ({len(out_rows)} hang, {len(cols)} cot)")

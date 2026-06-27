# Hypotheses Draft — GPT-4 zero-shot unit test cho hàm Java/Python ở complexity trung bình

Ngày: 2026-06-09

> PICO: **P** = hàm Java+Python ở cyclomatic complexity trung bình (N≈30–40/ngôn ngữ) · **I** = GPT-4 zero-shot, temp=0 · **C** = test sinh viên viết tay (comparative) + threshold sanity · **O** = line coverage, mutation score, compile/pass rate.
> ⚠️ GPT-4 và sinh viên viết test cho **cùng các hàm** → dữ liệu **paired** → Wilcoxon signed-rank (paired). So sánh **Java vs Python** là 2 nhóm **độc lập** → Mann-Whitney U.

## 5A. RQ (công thức PICO)

- **RQ1 (comparative, primary):** GPT-4 zero-shot (I) sinh unit test cho hàm Java/Python ở CC trung bình (P) có đạt **line coverage cao hơn test sinh viên viết tay** (C) không?
- **RQ2 (comparative, primary, GAP-M):** GPT-4 zero-shot (I) có đạt **mutation score (fault-detection) cao hơn test sinh viên** (C) không?
- **RQ3 (absolute, sanity):** GPT-4 zero-shot (I) đạt **compile-and-run pass rate ≥ 66%** (O) không?
- **RQ4 (comparative, GAP-T):** Có **khác biệt line coverage giữa Java và Python** khi dùng GPT-4 zero-shot không?

---

## RQ1 — Line coverage: GPT-4 vs test sinh viên (comparative)

H0: GPT-4 zero-shot **KHÔNG tốt hơn** test sinh viên về line coverage (median hiệu cov_GPT4 − cov_SV ≤ 0).

H1: GPT-4 zero-shot **tốt hơn** test sinh viên về line coverage (median hiệu > 0).

Statistical test dự kiến: **Wilcoxon signed-rank (paired, one-sided)** (α = 0.05)
*Sanity phụ:* line coverage GPT-4 ≥ 40% (one-sample Wilcoxon) — khớp `design-rationale.md`.

## RQ2 — Mutation score: GPT-4 vs test sinh viên (comparative, GAP-M)

H0: GPT-4 zero-shot **KHÔNG tốt hơn** test sinh viên về mutation score (median hiệu ≤ 0).

H1: GPT-4 zero-shot **tốt hơn** test sinh viên về mutation score (median hiệu > 0).

Statistical test dự kiến: **Wilcoxon signed-rank (paired, one-sided)** (α = 0.05)
*Sanity phụ:* mutation GPT-4 ≥ 40% (one-sample Wilcoxon).

## RQ3 — Compile-and-run pass rate (absolute threshold)

H0: GPT-4 zero-shot **KHÔNG đạt** compile-and-run pass rate ≥ 66%.

H1: GPT-4 zero-shot **đạt** compile-and-run pass rate ≥ 66%.

Statistical test dự kiến: **Binomial exact test (one-sided, p0 = 0.66)** (α = 0.05)

## RQ4 — Line coverage Java vs Python (comparative, GAP-T)

H0: **KHÔNG có** khác biệt line coverage giữa Java và Python (GPT-4 zero-shot).

H1: **CÓ** khác biệt line coverage giữa Java và Python.

Statistical test dự kiến: **Mann-Whitney U (two independent groups, two-sided)** (α = 0.05)

---

## Ghi chú
- Threshold trong H0/sanity khớp `design-rationale.md`: pass ≥66% (#1), coverage ≥40% (#121), mutation ≥40% (#10) — đều Case 2 floor.
- RQ1/RQ2 **paired** (GPT-4 vs SV cùng hàm) → Wilcoxon signed-rank; RQ4 **independent** (Java vs Python) → Mann-Whitney U. Không trộn lẫn.
- 4 RQ → cân nhắc hiệu chỉnh đa kiểm định **Holm–Bonferroni**.
- Test chọn TRƯỚC pilot; pilot Tuần 7 chỉ confirm phân phối, lệch → amendment proposal §8.6.

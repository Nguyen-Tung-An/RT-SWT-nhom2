# Hypotheses

| RQ | Gap | Metric | H0 | H1 | Threshold | Statistical test | Cơ sở ngưỡng (từ evidence table) |
|----|-----|--------|----|----|-----------|------------------|----------------------------------|
| **RQ1** | GAP-M | Line coverage | GPT-4 zero-shot **KHÔNG** đạt line coverage trung vị ≥ 70% | GPT-4 zero-shot **ĐẠT** line coverage trung vị ≥ 70% | ≥ 70% | **Wilcoxon signed-rank** (one-sample, một phía) | #121 baseline GPT-4 zero-shot = **0.36**; EvoSuite ~**0.39** hàm phức tạp (#20) → 70% trên complexity trung bình là mốc "đủ dùng" |
| **RQ2** | GAP-M | Compile-and-run pass rate | Tỷ lệ test biên dịch + chạy không lỗi **KHÔNG** ≥ 80% | Tỷ lệ test biên dịch + chạy không lỗi **≥ 80%** | ≥ 80% | **Binomial test** (one-sample proportion, một phía) | #1 syntactic correctness **66.5%**; #49 compile rate raw-LLM **7.2%** → 80% là mốc aspirational, có thể bị bác bỏ |
| **RQ3** | GAP-M | Mutation score (fault detection) | Mutation score trung vị **KHÔNG** ≥ 40% | Mutation score trung vị **≥ 40%** | ≥ 40% | **Wilcoxon signed-rank** (one-sample, một phía) | #10 mutation score trung bình **40.21%** (12 LLM open-weight, complexity cao) |
| **RQ4** | GAP-T | Line coverage (Java vs Python) | **KHÔNG** có khác biệt line coverage giữa Java và Python | **CÓ** khác biệt line coverage giữa Java và Python | (so sánh 2 nhóm) | **Mann-Whitney U** (two independent groups, hai phía) | GPT-4 zero-shot mới đo tách lẻ: #1 chỉ Java, #141 chỉ Python → chưa ai so sánh cùng thiết kế |

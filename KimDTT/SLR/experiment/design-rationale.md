# Experiment Design Rationale — GPT-4 zero-shot unit test cho hàm Java/Python ở complexity trung bình

Ngày: 2026-06-09 | GAP source: `SLR/gap-analysis.md`

> Baseline = **comparative chính** (vs test sinh viên) **+ threshold phụ** (sanity, Case 2 floor). Thứ tự derive: Dataset → Metric → Threshold → Baseline → Pipeline.

## Bảng Quyết định

| Quyết định | Giá trị | Nguồn gốc |
|------------|----------|----------|
| LLM/Tool | **GPT-4** (pin version, vd `gpt-4-0613`), **zero-shot**, temperature=0 | GAP-T: cột Tool/LLM (#1, #141) |
| Dataset | **Hàm Java + Python ở cyclomatic complexity TRUNG BÌNH** (curate, N≈30–40/ngôn ngữ); Java từ Defects4J subset, Python từ OSS lọc CC | GAP-D: không benchmark sẵn đúng medium CC |
| Metric chính 1 | **Line coverage** (`coverage.py` Python, **JaCoCo** Java) | Consensus ≥4 paper |
| Metric chính 2 | **Mutation score** (**PIT** Java, **mutmut** Python) | GAP-M: fault-detection (#10, #49) |
| Metric phụ | **Compile-and-run pass rate** (`pytest` / JUnit5 + subprocess) | Consensus (#1, #49, #20) |
| Baseline type | **Human (comparative)** = test sinh viên viết tay **+ absolute threshold (sanity)** | Claim type RQ = comparative (01_rq.md) |
| Threshold line coverage | **≥ 40%** | Case 2: floor=36% từ #121 (GPT-4 zero-shot baseline line cov 0.36) |
| Threshold mutation | **≥ 40%** | Case 2: floor=40.21% từ #10 |
| Threshold compile/pass | **≥ 66%** | Case 2: floor=66.5% từ #1 (syntactic correctness, function-level) |
| Pipeline base | **#10 (Huang, TOSEM 2025)** | Evaluation paradigm gần nhất: function-level, coverage + mutation + pass cùng nhau, kiểm soát complexity |

## Lý giải threshold (đều là sanity phụ — mốc chính là test sinh viên)

- **Line coverage ≥ 40% — Case 2 — floor=36% từ #121 (Ryan'24).** #121 báo cáo GPT-4 zero-shot baseline line coverage = 0.36 (trước khi áp SymPrompt). Đây là mức GPT-4 zero-shot thực tế gần nhất → floor=36%, làm tròn lên 40%.
- **Mutation score ≥ 40% — Case 2 — floor=40.21% từ #10 (Huang'25).** #10 đo mutation trung bình 12 LLM = 40.21% trên hàm complexity cao → dùng làm floor, làm tròn 40%.
- **Compile-and-run pass rate ≥ 66% — Case 2 — floor=66.5% từ #1 (Antal'25).** #1 báo cáo GPT-4 syntactic correctness 66.5% ở function-level (loại #49 7.2% vì class-level, không comparable). Floor=66.5% → 66%.

## Pipeline (base #10 — liệt kê thay đổi)

**Base paper #10 (Huang, TOSEM 2025):** function-level, đo coverage + mutation + pass@1 cùng nhau, kiểm soát cyclomatic complexity, Python. (Prompt recipe GPT-4 zero-shot kế thừa từ #1 & #141.)

**Thay đổi so với base:**
1. **Đổi model sang GPT-4 zero-shot** (base dùng 12 LLM open-weight, KHÔNG có GPT-4) — đúng GAP-T.
2. **Thêm Java** (base chỉ Python) → so sánh cross-language (GAP-T secondary).
3. **Phân tầng theo complexity TRUNG BÌNH** (base kiểm soát ở mức CAO, mean 14.87) — đúng GAP-M.
4. **Thêm baseline con người = test sinh viên viết tay** (base không có) → claim comparative.
5. Giữ **đo đồng thời coverage + mutation + pass** (kế thừa điểm mạnh của base) — lấp GAP-M "đo cả hai cùng lúc".

**Các bước:** (1) curate hàm Java+Python medium CC (đo CC bằng `lizard`/`radon`) → (2) sinh viên viết test tay (baseline) + GPT-4 zero-shot sinh test (temp=0) → (3) chạy test: JUnit5/pytest → compile-and-run pass rate → (4) JaCoCo/coverage.py → line coverage → (5) PIT/mutmut → mutation score → (6) so sánh **paired** GPT-4 vs sinh viên trên từng hàm; so sánh **Java vs Python** (independent).

# GAP Analysis — Unit test generation bằng GPT-4 (zero-shot) cho hàm Java/Python ở cyclomatic complexity trung bình
Evidence table: N = 9 paper | Ngày: 2026-06-09 | Ngưỡng GAP-S = ceil(0.4×9) = 4 paper

> Nguồn GAP: `gap_statement.md`. File này bổ sung 2 phần còn thiếu theo checklist: **bảng kiểm tra phản chứng** và **feasibility check**.

## Bảng GAP

| Cột | Phát hiện | Loại GAP | Phản chứng |
|------|----------|----------|------------|
| Tool/LLM | Chỉ #1 (GPT-4 Turbo, Java) & #141 (GPT-4o, Python) đạt "GPT-4 + zero-shot + function-level" — **chưa ai chạy GPT-4 zero-shot trên cả Java VÀ Python trong cùng một nghiên cứu**. Model suy luận mới (o1/o3) chưa paper nào đánh giá | GAP-T | ✅ Kiểm tra 9 paper |
| Metric | **Chưa paper GPT-4-zero-shot nào đo đồng thời coverage + fault-detection**, và không ai báo cáo **phân tầng theo cyclomatic complexity TRUNG BÌNH** | **GAP-M** | ✅ Kiểm tra 9 paper |
| Dataset | Dataset của nhóm GPT-4 zero-shot đều nhỏ/lệch (VUL4J 50 hàm; HumanEval synthetic). #10 kiểm soát complexity nhưng ở mức **CAO** (mean 14.87) và không dùng GPT-4 | GAP-D | ✅ Kiểm tra 9 paper |
| Hạn chế | "Ít model → kém tổng quát" thừa nhận bởi #1, #20, #121, #170 = **4/9** | GAP-S | ✅ Kiểm tra 9 paper |

## GAP Chính: GAP-M

Chưa có nghiên cứu nào dùng **GPT-4 (zero-shot)** sinh unit test cho **hàm Java/Python ở cyclomatic complexity trung bình** mà **đo đồng thời độ phủ (coverage) lẫn khả năng phát hiện lỗi (mutation/fault-detection)**, có **phân tầng theo độ phức tạp**.

## GAP Secondary: GAP-T

Chưa nghiên cứu nào chạy **GPT-4 zero-shot trên cả Java và Python trong cùng một thiết kế** để so sánh hiệu năng giữa hai ngôn ngữ (#1 chỉ Java; #141 chỉ Python).

## Chi tiết kiểm tra phản chứng

### GAP-M: "Không paper GPT-4-zero-shot nào đo coverage + fault-detection cùng nhau, phân tầng theo medium CC"

| Paper | Đã làm không? | Ghi chú |
|--------|--------------|---------|
| #1 | Không | GPT-4 zero-shot ✓ nhưng chỉ đo semantic/fault-witnessing (7.5%), **không đo coverage**; không phân tầng CC |
| #141 | Không | GPT-4o zero-shot ✓ nhưng chỉ đo error & test-smell, **không coverage, không fault-detection** |
| #10 | Không | đo coverage + mutation cùng nhau ✓, kiểm soát CC ✓ nhưng **CC CAO** (14.87) và **KHÔNG GPT-4** |
| #121 | Không | GPT-4 nhưng **bọc SymPrompt** (không zero-shot thuần); đo coverage, không mutation |
| #49 | Không | GPT-4 nhưng **5 kỹ thuật prompt** + class-level; có coverage+MSR nhưng không phân tầng medium CC |
| #20 | Không | GPT-3.5-turbo, không GPT-4 |
| #170 | Không | Phind-CodeLlama default; coverage, không mutation |
| #13, #8 | Không* | UNVERIFIED (paywall) |

**Kết luận: XÁC NHẬN.** Không paper nào hội đủ (GPT-4 zero-shot) × (coverage + fault-detection) × (phân tầng medium CC).

### GAP-T: "Chưa ai chạy GPT-4 zero-shot trên CẢ Java và Python trong cùng nghiên cứu"

| Paper | Đã làm không? | Ghi chú |
|--------|--------------|---------|
| #1 | Không | GPT-4 zero-shot — **chỉ Java** |
| #141 | Không | GPT-4o zero-shot — **chỉ Python** |
| #121, #170 | Không | có GPT-4 nhưng chỉ Python (và không zero-shot thuần) |
| #49 | Không | đa ngôn ngữ? — chỉ Java, prompt nâng cao |
| còn lại | Không | không GPT-4 zero-shot |

**Kết luận: XÁC NHẬN.**

## Feasibility Check — GAP Chính (GAP-M)

| Tiêu chí | Mức | Ghi chú |
|----------|-----|---------|
| Dataset | ⚠️ | Không benchmark sẵn đúng "medium CC" → cần **curate** hàm Java+Python từ OSS/Defects4J theo CC (<1 tuần) |
| Tool/API | ⚠️ | GPT-4 API trả phí; zero-shot N hàm → <$5 nếu N nhỏ |
| Compute | ✅ | API + JUnit/pytest + mutation (PIT/mutmut) chạy CPU/Colab |
| Ground truth | ⚠️ | Baseline = **test sinh viên viết tay** → công sức lớn; ≤5h nếu N nhỏ, >20h nếu N lớn |
| Skills | ⚠️ | Cần mutation testing **2 ngôn ngữ** (PIT cho Java, mutmut cho Python) + coverage — học <1 tuần |
| Thời gian | ⚠️ | 2 ngôn ngữ + build dataset + viết test tay → tight, ít buffer |
| Contribution | ✅ | Baseline GPT-4 zero-shot cross-language ở medium CC — chưa ai làm |

**Kết quả:** 2 ✅ / 5 ⚠️ / 0 ❌ → **Rủi ro cao** (≥3 ⚠️) — cần mitigation cụ thể trước khi commit.

**Mitigation đề xuất (downscope):**
- Giữ **N nhỏ** (vd 30–40 hàm/ngôn ngữ) để giảm cả API cost lẫn công viết test tay (ground truth) xuống ≤5h.
- Dùng **Defects4J subset** (Java) + một benchmark Python có sẵn, lọc theo CC trung bình → tránh build dataset từ đầu.
- Nếu viết test sinh viên vẫn quá nặng → cân nhắc **bỏ baseline human, chuyển sang absolute threshold** (xem mục cần chốt bên dưới).

# Toàn bộ kết quả metric

Sinh bằng `ms-analysis/scripts/export_metrics.py`, đọc thẳng từ file, đối chiếu tự động.
Hai ngôn ngữ **không gộp** — mẫu số luôn `/60`. Ô để trống = không đo được, không phải 0.


## 1. Số chính thức của bài báo (RQ1–RQ3)

Nguồn: `summary_8lib.csv`. Đây là kết quả confirmatory, **không đụng vào**.

| RQ | Nhóm | n | Median / ρ | p | Effect (rb) | Quyết định |
|---|---|---:|---:|---:|---:|---|
| RQ1 cov≥80% | Python | 23 | 75.0 | 0.6653 | -0.101 | ❌ fail-reject-H0 |
| RQ1 cov≥80% | Java | 5 | 50.0 | 0.9062 | -0.6 | ❌ fail-reject-H0 |
| RQ2A mut≥60% | Python | 17 | 36.84 | 0.9916 | -0.66 | ❌ fail-reject-H0 |
| RQ2A mut≥60% | Java | 54 | 0.0 | 1.0000 | -0.999 | ❌ fail-reject-H0 |
| RQ2B vs EvoSuite | Java | 54 | 0.0 | 0.0004 | -1.0 | ✅ có ý nghĩa |
| RQ2B vs Randoop | Java | 54 | 0.0 | 0.0033 | -1.0 | ✅ có ý nghĩa |
| RQ2B vs Pynguin | Python | 13 | 36.84 | 0.0098 | 0.848 | ✅ có ý nghĩa |
| RQ3 CC↔cov | Python | 23 | 0.181 | 0.4078 | 0.181 | ❌ fail-reject-H0 |
| RQ3 CC↔cov | Java | 5 | 0.132 | 0.8330 | 0.132 | ❌ fail-reject-H0 |

**Ba RQ chính (RQ1/RQ2A/RQ3) đều fail to reject H0** — GPT-4o-mini one-shot không đạt
80% coverage, không đạt 60% mutation, không có tương quan âm với CC.


## 2. Số đo lại — v1 (one-shot, đúng thí nghiệm của bài), n=60

Đo bằng bộ 4 tầng. Giá trị median ghi ở cả hai mức **all** (invalid=0) và **effective** (>0).

### Python

| Metric | median (all) | median (effective) | n effective |
|---|---:|---:|---:|
| Branch coverage | 0.0% | 75.0% | 19/60 |
| Mutation score | 0.0% | 75.0% | 13/60 |

### Java

Động cơ đột biến riêng (không phải PIT). File không lưu branch coverage riêng nên chỉ báo mutation.

| Metric | median (all) | median (effective) | n effective |
|---|---:|---:|---:|
| Mutation score | 0.0% | 96.2% | 6/60 |

> ⚠️ Median 'effective' cao (Python cov 75%, Java mut cao) **không** nghĩa là test tốt.
> Đó là hình mẫu được-ăn-cả-ngã-về-không: số ít hàm chạm đúng đích thì kiểm thử khá, còn
> đại đa số (Python 41/60, Java 54/60) không lọt tới tầng đo nên = 0. Median 'all' mới
> phản ánh toàn cục, và nó = 0.


## 3. Tiến trình cải thiện — cho bài tiếp theo (KHÔNG dùng cho bài hiện tại)

v2/v3/v4 đổi prompt + vòng sửa lỗi → là thí nghiệm post-hoc, thuộc bài sau, không đưa
vào bài one-shot. Chỉ **T4 (mutation chạm đích)** đáng tin — tầng nông lách được.

### Python — T4 (số hàm giết được mutant)

| | v1 | v3+repair |
|---|---:|---:|
| Hàm có mutation>0 | 13 | **23** |
| Median mutation (tập >0) | 75.0% | 100.0% |

*(T4 chỉ đo tại v1 và bản cuối; v2/v3 thuần chưa đo T4.)*

### Java — T4

| | v1 | v4 |
|---|---:|---:|
| Hàm có mutation>0 | 6 | **10** |
| Median mutation (tập >0) | 96.2% | 90.6% |

> ⚠️ Java v4: T1 (biên dịch) tăng 0→4 ở nhóm `private` nhờ reflection là **giả** — T4 chỉ 0→1.


## 4. Đối chiếu bài báo ↔ đo lại (chỉ v1)

| Chỉ số | Bài báo | Đo lại | Ghi chú |
|---|---:|---:|---|
| Java compiled | 51/60 | 17/60 | Cờ suy từ báo cáo, không đo biên dịch |
| Python có test chạy | 32/60 | 21/60 | 'chạy' ≠ 'pass' |
| Python mutation>0 | 15/60 | 13/60 | khớp |
| Java mutation>0 | 1/60 (PIT) | 6/60 (động cơ riêng) | ⚠️ khác động cơ, không so chéo |

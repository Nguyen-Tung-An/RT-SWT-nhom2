# Toàn bộ kết quả đo — dự án LLM Unit Test Generation

Nhóm RT-SWT-nhom2 · SWT301 RBL · sinh bằng `ms-analysis/scripts/export_all.py`
(đọc thẳng từ file, tự đối chiếu). **Không gộp hai ngôn ngữ** — mẫu số luôn `/60`.
Ô trống = không đo được, không phải 0.


## 0. So sánh công cụ — kết quả cốt lõi của dự án

Median ở hai mức: **all** (invalid/không chạm = 0) và **effective** (chỉ tập >0).

### Branch coverage

| Công cụ | Ngôn ngữ | median all | median effective | n effective |
|---|---|---:|---:|---:|
| GPT-4o-mini | java | 0.0% | 50.0% | 5/60 |
| EvoSuite | java | 55.0% | 90.8% | 40/60 |
| Randoop | java | 21.1% | 68.3% | 34/60 |
| GPT-4o-mini | python | 0.0% | 75.0% | 23/60 |
| Pynguin | python | 0.0% | 75.0% | 8/60 |

### Mutation score

| Công cụ | Ngôn ngữ | median all | median effective | n effective |
|---|---|---:|---:|---:|
| GPT-4o-mini | java | 0.0% | 100.0% | 1/60 |
| EvoSuite | java | 0.0% | 69.1% | 19/60 |
| Randoop | java | 0.0% | 69.1% | 13/60 |
| GPT-4o-mini | python | 0.0% | 45.5% | 15/60 |
| Pynguin | python | 0.0% | 87.5% | 2/60 |

> Median **all** = 0 gần khắp bảng: quá nửa suite của mọi công cụ không hợp lệ hoặc
> không chạm đích. So sánh có ý nghĩa nằm ở mức **effective** và ở kiểm định ghép cặp (mục 1).


## 1. Kết quả thống kê ba RQ (số chính thức bài báo)

Nguồn `summary_8lib.csv`. α=0.05.

| RQ | Nhóm | n | Median/ρ | p | Effect | Quyết định |
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

**RQ1/RQ2A/RQ3 đều fail to reject H0** — GPT-4o-mini one-shot không đạt ngưỡng nào.
RQ2B: GPT **thua** EvoSuite & Randoop (Java), **hơn** Pynguin (Python, vì Pynguin sập).


## 2. Đo lại GPT-4o-mini v1 bằng bộ 4 tầng (n=60)

| Tầng | Python | Java | Ý nghĩa |
|---|---:|---:|---|
| T1 biên dịch được | — (Python thông dịch) | 17 | mã hợp lệ |
| T2 ≥1 test xanh | 21 | 8 | chạy được |
| T3 chạm hàm đích | 19 | — | đúng mục tiêu |
| **T4 giết mutant** | **13** | **6** | **phát hiện lỗi** |

Median metric (tập effective): Python cov **75.0%**, mutation **75.0%**; Java mutation **96.2%**.
Median **all** đều 0% — đại đa số hàm không lọt tới tầng đo.


## 3. Tiến trình cải thiện — bài tiếp theo (KHÔNG thuộc bài one-shot hiện tại)

| | Python T4 | Java T4 |
|---|---:|---:|
| v1 (one-shot) | 13 | 6 |
| bản cuối (Py: v3+repair, Java: v4) | **23** | **10** |

> v2/v3/v4 đổi prompt + vòng sửa lỗi → post-hoc, để dành bài sau (chống HARKing).


## 4. Đối chiếu bài báo ↔ đo lại (v1)

| Chỉ số | Bài báo | Đo lại | Ghi chú |
|---|---:|---:|---|
| Java compiled | 51/60 | 17/60 | cờ suy từ báo cáo, đã sửa vào Threats |
| Python có test chạy | 32/60 | 21/60 | 'chạy' ≠ 'pass' |
| Python mutation>0 | 15/60 | 13/60 | khớp |
| Java mutation>0 | 1/60 (PIT) | 6/60 (động cơ riêng) | ⚠️ khác động cơ |


## Tài liệu liên quan

- `METRICS.md` — giá trị metric chi tiết · `RESULTS.md` — đếm tầng
- `CAUSAL-CHAIN.md` — chuỗi nhân quả · `MEASUREMENT.md` — bộ đo
- `MEASUREMENT-PITFALLS.md` — 7 lỗi đo lường · `results/ALL.csv` — từng hàm

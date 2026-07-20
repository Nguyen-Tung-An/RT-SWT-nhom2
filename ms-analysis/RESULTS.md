# Toàn bộ kết quả đã đo lại

Sinh tự động bằng `ms-analysis/scripts/export_results.py` — mọi con số đọc thẳng từ file
kết quả, không nhập tay. Dữ liệu chi tiết từng hàm: `ms-analysis/results/ALL.csv`.

Tầng đo T1–T4 định nghĩa trong [MEASUREMENT.md](MEASUREMENT.md). **Hai ngôn ngữ không
gộp chung** — mẫu số luôn là `/60` của riêng ngôn ngữ đó.


## PYTHON — n=60

| Tầng | Tiêu chí | v1 | v2 | v3 | v3+repair |
|---|---|---:|---:|---:|---:|
| T2 | ≥1 test xanh | 21 | 34 | 40 | **48** |
| T3 | chạm hàm đích | 19 | — | — | **47** |
| **T4** | **giết được mutant** | **13** | — | — | **23** |

Tổng test pass: 75 → **177**

Median mutation trên tập đo được: v1 66.7% → best 55.6%

### Python — nguyên nhân thất bại (v1 → v3)

| Nguyên nhân | v1 | v3 |
|---|---:|---:|
| 1-import-sai-ten | 22 | 4 |
| 2-thieu-module | 1 | 1 |
| 4-thuoc-tinh-khong-ton-tai | 6 | 8 |
| 5-sai-chu-ky-goi | 9 | 9 |
| 7-runtime-khac | 3 | 7 |
| 8-assert-sai | 10 | 22 |
| OK-xanh | 4 | 4 |
| z-khac | 5 | 5 |


## JAVA — n=60

| Tầng | Tiêu chí | v1 | v4 |
|---|---|---:|---:|
| T1 | biên dịch được | 17 | 25 |
| T2 | test xanh trên bản gốc | 8 | 10 |
| **T4** | **giết được mutant** | **6** | **10** |

### Java — phân tầng theo visibility

| Visibility | n | T1 v1 | T1 v4 | T4 v1 | T4 v4 |
|---|---:|---:|---:|---:|---:|
| `public` | 35 | 16 | 17 | 6 | 8 |
| `protected` | 4 | 0 | 1 | 0 | 0 |
| `package-private` | 4 | 1 | 3 | 0 | 1 |
| `private` | 17 | 0 | 4 | 0 | 1 |

### Java — loại lỗi biên dịch

| Lỗi | v1 | v4 |
|---|---:|---:|
| khac | 27 | 19 |
| overload-nhap-nhang | 3 | 4 |
| sai-constructor | 4 | 1 |
| sai-kieu | 4 | 0 |
| sai-tham-so | 1 | 1 |
| thieu-override | 0 | 4 |
| thieu-package | 1 | 1 |
| truy-cap-private | 3 | 5 |


## Đối chiếu với số của bài báo

| Chỉ số | Bài báo | Đo lại | Ghi chú |
|---|---:|---:|---|
| Java `compiled` | 51/60 | **17/60** | Cờ gán cứng, không đo biên dịch |
| Python `compiled` | 32/60 | **21/60** | Bài báo đếm "có test **chạy**", không phải **pass** |
| Python mutation>0 | 15/60 | 13/60 | Khớp |
| Java mutation>0 | 1/60 (PIT) | 6/60 (động cơ riêng) | ⚠️ **Hai động cơ khác nhau — không so chéo được** |


## Cảnh báo bắt buộc đọc

1. **Java nhóm `private`**: T1 v4 = 4 nhưng T4 v4 = 1. Reflection làm `javac` hết khả năng
   kiểm tra tên (`getDeclaredMethod("tenBia")` → `rc=0`), nên T1 ở nhóm này là chỉ số rỗng.
2. **Không so chéo động cơ đột biến.** PIT (bài báo) và động cơ trong repo này sinh mutant
   khác nhau. Chỉ so v1↔v4 hoặc v1↔best **trong cùng động cơ**.
3. **Ô trống ≠ 0.** Cột để trống nghĩa là không đo được, không phải đo ra 0.
4. **n nhỏ cho kết quả đẹp hơn.** Nhóm lớp-sai Java: n=48 cho 0/17 (tuyệt đối), n=60 cho
   1/18 (5.6%). Con số phải báo cáo là 5.6%.

Chi tiết lỗi đo lường: [MEASUREMENT-PITFALLS.md](MEASUREMENT-PITFALLS.md)

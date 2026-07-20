# Danh mục lỗi đo lường

Bảy lỗi tìm được trong một phiên audit. Tất cả **cùng một khuôn**:

> Một chỉ số ngừng đo được thứ nó tuyên bố đo — và **không có gì báo động**.
> Không exception, không cảnh báo, không con số bất thường. Nó chỉ trả về một giá trị
> trông hợp lý.

**Bốn trong bảy lỗi do chính người audit tạo ra trong lúc đi sửa ba lỗi kia.** Đó là điểm
đáng sợ nhất: biết về loại lỗi này không miễn nhiễm với nó.

---

## Nhóm A — lỗi trong pipeline gốc

### A1. Java `compiled=1` là hằng số gán cứng

`measure_java_from_reports.py:117` gán `compiled: 1` cho **mọi** dòng ghi ra. Một dòng
được ghi khi khoảng dòng của hàm có dữ liệu trong `jacoco.xml`.

Nhưng **JaCoCo liệt kê mọi lớp trong dự án** — kể cả lớp chưa hề được nạp (`mi>0, ci=0`,
nên `bc = 0/(mb+0) = 0.0`). Dòng vẫn được ghi.

**Hệ quả:** hàm có test không biên dịch được vẫn nhận `compiled=1`.
**Sai lệch:** báo 51/60 (85%), thật 17/60 (28%) — **34 hàm**.
**Bằng chứng:** `commons-collections` có 0/61854 lệnh được chạy nhưng vẫn liệt kê đủ mọi lớp.

### A2. Python `compiled=1` nghĩa là "có test **chạy**", không phải "**pass**"

`kaggle_coverage_py.py:146`:
```python
if passed + failed == 0: return 0, ...   # compiled = 0
return 1, ...                             # compiled = 1
```

File mà **cả 5 test đều fail** vẫn là "valid".

**Sai lệch:** 12/32 hàm "valid" có **0 test pass**; 9/32 có coverage=0.
Báo 53.3% valid, thật **30.0%** chạm được hàm đích.

### A3. Pynguin crash bị gán 0 thay vì N/A

Harness in 400 ký tự cuối stderr rồi gán `branch_coverage = 0`. Phân loại lại 60 hàm:

| Nguyên nhân | Hàm |
|---|---:|
| **Không sinh được test nào** (crash/timeout) | **50** |
| Số liệu thật | 8 |
| Suite xanh nhưng không chạm đích | 1 |
| Suite pass rỗng (4 dòng, không import gì) | 1 |

**50/60 ô "0%" là ô trống, không phải số 0 đo được.** Gán 0 rồi lấy median là lỗi phạm trù.

---

## Nhóm B — lỗi do người audit tạo ra

### B1. Prompt v4 làm chỉ số mất ý nghĩa

Dạy model dùng reflection cho mục tiêu `private`. Nhưng reflection biến mọi tên thành
**chuỗi ký tự**:

```java
getDeclaredMethod("hamNayHoanToanKhongTonTai_12345", String.class)   // javac rc=0
```

**Hệ quả:** "biên dịch được" ở nhóm private nhảy 0→4, nhưng con số đó không kiểm chứng
được gì. Đã báo cáo 41.7% rồi phải rút về **35%**.

**Đây là dạng nguy hiểm nhất:** không phải đọc sai chỉ số có sẵn, mà **thay đổi cách sinh
theo hướng làm chỉ số ngừng đo được**, rồi báo cáo mức tăng như thành tích.

Phát hiện nhờ một agent phản biện nêu ra, không phải tự nhận ra.

### B2. Đột biến ghi đè bản gốc

Script mutation ghi thẳng vào `data/raw/*/src` trong khi **hai workflow khác đang chạy
test trên cùng cây nguồn**. Họ sẽ đọc phải mã đã bị đột biến.

Đã sửa sang bản sao cô lập. **Bản vá đầu tiên không áp dụng được** (vòng đột biến vẫn ghi
vào bản gốc) — phát hiện khi đọc lại file. Bỏ qua bước kiểm tra đó là hỏng dữ liệu của cả
hai luồng.

### B3. Classpath JUnit sai thứ tự → 0 test, im lặng

Ba tầng bẫy chồng nhau:

1. Trộn jupiter 6.0.3 với test viết theo JUnit 5 → `RESULT 0 0 0`, `rc=0`
2. `sorted()` đặt `"1.9.3"` **sau** `"1.14.4"` → chọn nhầm platform
3. **Thủ phạm thật:** classpath dự án đứng trước jar của ta. `commons-math` mang theo
   `jupiter-api 5.10.2` + `platform-commons 1.14.2` + `vintage-engine 5.14.2`

**Nếu không bắt được:** cả 60 hàm Java ra "không có test nào chạy", T4 = **0/60 giả tạo**,
và nó sẽ trông giống một kết quả thật.
**Sau khi sửa:** `JA-005` từ `RESULT 0 0 0` → `RESULT 9 9 0`, mutation 80%.

### B4. Bốn chẩn đoán sai đã công bố rồi phải rút

| Đã nói | Thực tế |
|---|---|
| "0% đã không còn" (Pynguin) | Khái quát từ **n=1**; 7/10 y hệt bài báo |
| "12 hàm trôi phiên bản thư viện" | `uv.lock` khớp máy; thuần khác biệt **định nghĩa**, trùng khít 12/12 |
| "`private` không thể kiểm thử bằng bất kỳ công cụ nào" | Reflection làm được, đã chạy thật |
| "9 ca xanh mà không chạm đích" | **7/9 thực ra có 0 test pass** |

---

## Kiểm thử phòng vệ

Áp dụng cho **mọi** chỉ số trước khi báo cáo:

| # | Câu hỏi | Bắt được lỗi |
|---|---|---|
| 1 | Chỉ số có **hằng số gán cứng** ở đâu không? | A1 |
| 2 | Nếu bước phía dưới hỏng hoàn toàn, chỉ số có đổi không? | A1, B3 |
| 3 | "Hợp lệ" nghĩa chính xác là gì — **chạy**, **pass**, hay **chạm đích**? | A2 |
| 4 | Ô trống có đang bị gán 0 không? | A3 |
| 5 | Thay đổi vừa rồi có làm chỉ số **dễ đạt hơn** thay vì kết quả tốt hơn? | **B1** |
| 6 | Phép đo có ghi vào tài nguyên dùng chung? | B2 |
| 7 | Phiên bản công cụ có khớp cặp? Ta có đứng **đầu** classpath? | B3 |
| 8 | Kết luận dựa trên bao nhiêu ca? **n nhỏ cho kết quả đẹp hơn** | B4, `0/17` → `1/18` |
| 9 | Số này là **đo trong môi trường tái lập** hay của thí nghiệm gốc? | B4 |

## Hai bài học khái quát

**1. Đo bằng kiến tạo, không bằng gán nhãn.** Hai lần phân loại tĩnh "symbol bịa hay
thiếu import" đều sai. Chỉ khi **tự thêm import rồi biên dịch lại** mới có câu trả lời
(cứu 2/43 — bác bỏ giả thuyết).

**2. Chỉ tin tầng không lách được.** T1/T2 lách được bằng reflection hoặc test rỗng. T4
thì không: mutant chỉ bị giết khi test **thực sự chạy qua đoạn mã bị đổi và phân biệt được
kết quả**.

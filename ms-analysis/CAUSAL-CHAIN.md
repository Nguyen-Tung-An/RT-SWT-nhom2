# Chuỗi nhân quả — vì sao test sinh ra hỏng

Mỗi mắt xích dưới đây đều có **bằng chứng đo được**, không phải suy luận. Mỗi con số ghi
kèm **tầng đo** (xem `MEASUREMENT.md`) và mẫu số `/60` của riêng ngôn ngữ.

---

## Java — mắt xích 1: miner gán sai lớp

Khâu mine dataset gán hàm cho **lớp lồng nhau gần nhất** mà không pop stack:

| `func_name` trong ground truth v1 | Lớp thật |
|---|---|
| `Builder::getOptionValues` | `CommandLine` |
| `NonOptionAction::handleLongOptionWithEqual` | `DefaultParser` |
| `OptionComparator::appendOptionGroup` | `HelpFormatter` |

**18/60** hàm Java bị gán sai. Đối chiếu với biên dịch thật (T1):

| | Biên dịch OK | FAIL | Tỷ lệ |
|---|---:|---:|---:|
| Lớp **SAI** | 1 | 17 | **5.6%** |
| Lớp **ĐÚNG** | 16 | 26 | **38.1%** |

Chênh gần **7 lần**.

> ⚠️ Với n=48 (trước khi đo nốt `commons-math`/`gson`) tỷ lệ nhóm sai là **0/17 — tuyệt
> đối**. Thêm 12 hàm thành 1/18. **n nhỏ hơn cho kết quả đẹp hơn**; con số phải báo cáo
> là 5.6%, không phải 0%.

## Java — mắt xích 2: rào cản truy cập

Phân bố modifier của mục tiêu (đọc dòng khai báo thật tại `start_line`):

| Modifier | n | T1 OK | Tỷ lệ |
|---|---:|---:|---:|
| `public` | 35 | 16 | 46% |
| `protected` | 4 | 0 | **0%** |
| `package-private` | 4 | 1 | 25% |
| **`private`** | **17** | **0** | **0%** |

**21/60 (35%) mục tiêu không public.** Phân loại lỗi javac: **22/41 (54%)** ca thất bại là
rào cản truy cập.

**Nhưng `private` KHÔNG phải bức tường.** Chứng minh chạy thật
(`private-access-demo/ReflMain.java`), ba bước:

1. `getDeclaredMethod` + `setAccessible(true)` → biên dịch `rc=0`
2. `invoke()` → vào tới **dòng 735 bên trong** `DefaultParser.isShortOption`, NPE vì
   `this.options` null → **đã vượt rào truy cập**
3. Dựng trạng thái bằng `Field.setAccessible` + `set`:
   ```
   isShortOption("-a")=true  ("-x")=false  ("--alpha")=false  ("notopt")=false  ("-")=false
   ```

Hàm private được kiểm thử đầy đủ, phân biệt cả 5 nhánh. Prompt v1–v3 **không hề nói cho
model biết có thể dùng reflection**.

> ⚠️ Nhưng xem `MEASUREMENT.md`: reflection làm **T1 mất ý nghĩa**. Mức tăng 0→4 ở nhóm
> private **không được tính là cải thiện** cho tới khi có số T4.

## Java — mắt xích 3: giả thuyết bị bác bỏ

Ba giả thuyết nghe hợp lý, cả ba **sai**:

| Giả thuyết | Kiểm chứng | Kết quả |
|---|---|---|
| Miner ghi sai khoảng dòng | Đối chiếu source | ❌ 51/51 khớp |
| Model bịa API | Tra thủ công | ❌ `CR`/`LF` có trong `Constants.java`, `Paint` là `java.awt.Paint` |
| Chỉ thiếu import | **Tự thêm import rồi biên dịch lại** | ❌ chỉ cứu **2/43** |

Giả thuyết thứ ba được bác bỏ **bằng kiến tạo**, không bằng gán nhãn — vì hai lần phân
loại tĩnh trước đó đều sai.

---

## Python — mắt xích 1: đặc tả mục tiêu

`full_ground_truth.csv` **không có cột class**. Prompt v1 chỉ nói
*"Generate pytest tests for `raise_routing_exception`"* trong khi thật ra là
`Flask.raise_routing_exception`:

```python
# v1: from flask.app import raise_routing_exception   ← ImportError
# v2: from flask.app import Flask → dựng instance     ← đúng
```

Phép thử nhân quả có nhóm đối chứng:

| Nhóm | n | import-sai v1→v2 |
|---|---:|---|
| **instance (method)** | 38 | **20 → 1** (−95%) |
| function/nested (đối chứng) | 20 | 1 → 1 (**không đổi**) |

Cải thiện **tập trung hoàn toàn** ở nhóm bị mô tả sai; nhóm đối chứng đứng yên.

## Python — mắt xích 2: dựng trạng thái receiver

v2 sửa được định danh nhưng **11/26** ca chết ở `__init__`:

```
App.__init__() missing 'import_name'      Config.__init__() missing 'root_path'
Blueprint.__init__() missing 'import_name'  JSONProvider.__init__() missing 'app'
```

v3 cung cấp constructor **đã kiểm chứng chạy thật** (39/41 method) → lỗi `__init__`
**11 → 0**.

## Điểm hội tụ

| | Nút thắt 1 | Nút thắt 2 |
|---|---|---|
| **Python** | Định danh mục tiêu | **Dựng trạng thái receiver** |
| **Java** | Rào cản truy cập | **Dựng trạng thái receiver** |

Hai ngôn ngữ, hai rào cản đầu **hoàn toàn khác nhau**, cùng một nút thắt thứ hai. Bằng
chứng Java: reflection vượt được truy cập rồi vẫn NPE vì `this.options` null — đúng cái
đã chặn Python.

Đây là kết quả trung tâm: **nút thắt thứ hai không phụ thuộc ngôn ngữ hay cơ chế chặn.**

---

## Bảng kết quả (đã xác minh)

### Python, n=60

| Tầng | v1 | v2 | v3 | v3+repair |
|---|---:|---:|---:|---:|
| T2 ≥1 test xanh | 21 | 34 | 40 | **48** |
| T3 chạm hàm đích | 19 | — | — | **47** |
| **T4 giết mutant** | **13** | — | — | **23** |

Truyền dẫn T2→T4: +27 → **+10** (37%).

### Java, n=60

| Tầng | v1 | v4 |
|---|---:|---:|
| T1 biên dịch | 17 | 25 (**21** trừ reflection) |
| **T4 giết mutant** | *đang đo* | *đang đo* |

### Đối chiếu với bài báo

| | Bài báo | Đo lại | Bản chất |
|---|---:|---:|---|
| Java "compiled" | 51/60 (85%) | **17/60 (28%)** | Cờ gán cứng |
| Python "valid" | 32/60 (53%) | **18/60 (30%)** T3 | "chạy" ≠ "hợp lệ" |
| Python mutation>0 | 15/60 | 13/60 (đo lại) | khớp |
| Java mutation>0 | **1/60** | *đang đo* | — |

**Hướng kết luận của bài báo được củng cố** — chất lượng test còn *thấp hơn* báo cáo.
Chỉ các con số cụ thể phải sửa.

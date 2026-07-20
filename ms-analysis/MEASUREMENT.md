# Bộ đo — cái gì đo được, cái gì lách được

Tài liệu này định nghĩa **bốn tầng** đánh giá một test sinh tự động, và chỉ rõ tầng nào
có thể bị lách. Mọi con số trong `CAUSAL-CHAIN.md` đều phải ghi kèm tầng của nó.

## Bốn tầng

| Tầng | Tiêu chí | Trả lời được câu hỏi gì | Lách được không |
|---|---|---|---|
| **T1** | File test tồn tại và biên dịch / collect được | *Có phải mã hợp lệ không?* | ✅ **Có** |
| **T2** | ≥1 test **chạy xanh** trên bản gốc | *Có chạy được không?* | ✅ **Có** |
| **T3** | `branch_coverage > 0` trong `[start_line, end_line]` của hàm đích | *Có chạm đúng hàm không?* | ⚠️ Khó |
| **T4** | `mutation_score > 0` trong cùng khoảng dòng | *Có **phát hiện được lỗi** không?* | ❌ **Không** |

**Chỉ T4 biện minh được cho phát biểu "test này kiểm thử hàm đó".**

## Vì sao T1 và T2 lách được — bằng chứng đã chạy

**T1 với reflection (Java).** Reflection biến mọi tên thành chuỗi ký tự, nên `javac` hết
khả năng kiểm tra:

```java
DefaultParser.class.getDeclaredMethod("hamNayHoanToanKhongTonTai_12345", String.class)
```
→ `javac rc=0`. Chỉ hỏng lúc chạy: `NoSuchMethodException`.

Hệ quả thật: prompt v4 dạy model dùng reflection cho 17 mục tiêu `private`. Nhóm này
"biên dịch được" nhảy 0 → 4, nhưng **con số đó không kiểm chứng được gì**. Trừ phần dựa
vào reflection, v4 thật là **21/60**, không phải 25/60.

**T2 với test rỗng.** Suite Pynguin cho `flask.logging` là file 4 dòng:

```python
def test_case_0():
    str_0 = " @\n-%y=Ub8x+\tkv="
```

Không import gì, không gọi gì. Test này **pass** — nên T2 ghi nhận thành công.

## Công cụ

| Script | Đo tầng | Ghi chú |
|---|---|---|
| `why_fail.py` | T1, T2 | Chạy pytest thật, phân loại exception thực tế |
| `validity_tiers.py` | T1→T4 | Báo cáo cả bốn tầng từ `metrics_project.csv`, chống đọc nhầm một cờ gộp |
| `mutation_on_target.py` | T3, T4 | **Python.** Đột biến AST trong khoảng dòng hàm đích |
| `check_java_compile.py` | T1 | **Java.** `javac` thật với classpath thật |
| `mutation_java.py` + `JUnitRunner.java` | T2, T3, T4 | **Java.** JUnit Launcher API + đột biến nguồn |
| `diagnose_zero.py` | — | Phân loại **nguyên nhân** của mỗi ô 0% |
| `greencheck.py` | T2 | Green-check **theo từng test**, không all-or-nothing |

## Ba nguyên tắc bắt buộc

### 1. Cô lập bản sao

Đột biến **phải ghi đè mã nguồn**. Ghi thẳng vào `data/raw/*/src` sẽ làm hỏng phép đo của
mọi tiến trình khác đang đọc cùng cây nguồn — âm thầm, không ai biết.

`mutation_on_target.py` sao cây nguồn ra thư mục tạm, đột biến trên **bản sao**, đặt bản
sao đầu `PYTHONPATH`. Đã kiểm chứng bản sao đè được editable install.

Kiểm tra sau mỗi lần chạy: `git status data/raw/` phải **rỗng**.

### 2. Đối chứng phiên bản công cụ

JUnit 5 = jupiter `5.x` + platform `1.x`. JUnit 6 = jupiter `6.x` + platform `6.x`.
Trộn lẫn → `Launcher` trả `RESULT 0 0 0`, `rc=0` — **không exception, không cảnh báo**.

Thêm hai bẫy đã mắc:
- `sorted()` đặt `"1.9.3"` **sau** `"1.14.4"` (so sánh chuỗi) → chọn nhầm phiên bản
- Classpath của dự án đứng **trước** jar của ta. `commons-math` mang theo
  `junit-jupiter-api 5.10.2` + `junit-platform-commons 1.14.2` + `junit-vintage-engine 5.14.2`
  — tự nó đã lệch, và nó che mất bộ đúng

Sửa: jar JUnit của ta **đầu classpath**. Kết quả: `JA-005` từ `RESULT 0 0 0` → `RESULT 9 9 0`,
mutation 80% (16/20).

Nếu không bắt được, cả 60 hàm Java sẽ ra *"không có test nào chạy"* và T4 = 0/60 **giả tạo**.

### 3. Không gộp hai ngôn ngữ

Java dùng `javac`/JUnit/JaCoCo, Python dùng `pytest`/coverage.py. Loại lỗi không quy đổi
được: Java có `private` cưỡng chế, Python không. Mọi con số ghi mẫu số **`/60` của riêng
ngôn ngữ đó**, không bao giờ `/120`.

## Số hiện tại

### Python (n=60)

| Tầng | v1 | v3 + vòng sửa lỗi |
|---|---:|---:|
| T2 ≥1 test xanh | 21 | **48** |
| T3 chạm hàm đích | 19 | **47** |
| **T4 giết được mutant** | **13** | **23** |

Tỷ lệ truyền dẫn T2→T4: **+27 chỉ thành +10** — 37%.

### Java (n=60)

| Tầng | v1 | v4 |
|---|---:|---:|
| T2 test xanh trên bản gốc | 8 | 10 |
| T1 biên dịch được | 17 | 25 (**21** nếu trừ phần dựa reflection) |
| **T4 giết được mutant** | **6** | **10** |

Phân tầng T4 theo visibility:

| | n | v1 | v4 |
|---|---:|---:|---:|
| `public` | 35 | 6 | 8 |
| `protected` | 4 | 0 | 0 |
| `package-private` | 4 | 0 | 1 |
| `private` | 17 | 0 | **1** |

**Nhóm `private`: T1 đạt 4 nhưng T4 chỉ 1.** Ba trong bốn ca "biên dịch được" nhờ reflection
**không giết được mutant nào** — xác nhận đúng cảnh báo rằng T1 với reflection là chỉ số rỗng.

> ⚠️ Bài báo báo Java `mutation>0` = **1/60** (dùng PIT). Đo lại **cùng bộ test v1** bằng
> động cơ đột biến riêng cho **6/60**. Chênh 6 lần — hai động cơ sinh mutant khác nhau nên
> **không so sánh chéo được**. Chỉ so v1↔v4 trong cùng động cơ.

## Chạy lại

```bash
python ms-analysis/scripts/validity_tiers.py
python ms-analysis/scripts/mutation_on_target.py --suite v1
python ms-analysis/scripts/mutation_on_target.py --suite best
python ms-analysis/scripts/check_java_compile.py
PYTHONUNBUFFERED=1 python ms-analysis/scripts/mutation_java.py --suite v1
PYTHONUNBUFFERED=1 python ms-analysis/scripts/mutation_java.py --suite v4
```

Môi trường Python đóng băng tại `ms-analysis/requirements-lock-2026-07.txt`.

# Tổng hợp phiên bản công cụ đã dùng trong dự án

**Ngày tổng hợp:** 2026-07-15. Các version dưới đây lấy trực tiếp từ máy đang chạy pipeline
đo (`java -version`, `pip show ...`, hoặc trích từ code/amendment đã có) — không suy đoán.

## Môi trường chạy

| Công cụ | Version | Dùng cho |
|---|---|---|
| Python (chính) | 3.14.5 | Sinh test (API), đo Java, script phân tích |
| Python (venv riêng) | 3.10.11 (`.venv-pynguin310/`) | Pynguin baseline — 3.14 không sinh test được (TracingAbortedException) |
| JDK 11 + JDK 8 | OpenJDK 11.0.31 + Temurin 8u492-b09 | EvoSuite — 39 hàm sinh dưới JDK 11; 21 hàm (csv/gson/joda) phải chạy JDK 8 (notes.md 04/07; sửa 17/07 — dòng cũ ghi "bắt buộc JDK 11" là chưa đủ) |
| JDK 17 | OpenJDK 17.0.19 | Randoop, gpt-4o-mini test, Maven build chính |
| Maven | 3.9.16 | Build/test toàn bộ 8 repo Java |

## Model & API

| | Giá trị |
|---|---|
| Model LLM chính thức (N=120) | `gpt-4o-mini-2024-07-18` (pinned snapshot) |
| `openai` (Python SDK) | 2.45.0 |
| Temperature / top_p / max_tokens | 0 / 1 / 2048 |

## Đo lường Java

| Công cụ | Version | Vai trò |
|---|---|---|
| JaCoCo | `0.8.12` | Branch coverage |
| PIT (pitest-maven) | `1.17.2` | Mutation testing |
| Maven Surefire | `3.2.5` | Chạy test khi cần gọi trực tiếp (không qua lifecycle mặc định) |
| EvoSuite | `1.2.0` (standalone-runtime) | Baseline search-based |
| Randoop | **chưa xác nhận được version chính xác** trên máy này — cần hỏi lại Hải/Phúc (người đã chạy baseline này) |

## Đo lường Python

| Công cụ | Version | Vai trò |
|---|---|---|
| `pytest` | 8.4.2 | Green-check + chạy test |
| `coverage.py` | 7.15.1 | Branch coverage |
| Pynguin | 0.45.0 | Baseline sinh test tự động |
| `mutmut` | 2.4.4 | Mutation cho test **gpt-4o-mini** (RQ2-A chính thức — `kaggle_mutation_py.py`, ra `metrics_py_mut.csv`) |
| Mutation AST tự viết | `ast` (Python built-in), không thư viện ngoài | Mutation cho baseline **Pynguin** (`measure_pynguin.py`) + các arm RQ4/RQ5 (`measure_python_module.py`) — swap binary/comparison/boolean, đảo bool const, +1 numeric const, ≤20 mutant/hàm |

## Trích xuất dữ liệu & dataset

| Công cụ | Version | Vai trò |
|---|---|---|
| Lizard | `1.23.0` | Đo Cyclomatic Complexity khi mine dataset (amendment v1.2) |
| `javalang` (Python) | 0.13.0 | Parse AST Java — trích API skeleton cho RQ4/RQ5 |

## Phiên bản source code được pin (repo mục tiêu)

| Repo | Version/commit | Ghi chú |
|---|---|---|
| commons-cli | release `102` | Bản ổn định |
| commons-math | release `97` | Bản ổn định |
| commons-csv | release `102` | Bản ổn định |
| joda-time | `2.14.2`, pin 2026-04-28 | Bản ổn định |
| gson | `2.14.1-SNAPSHOT`, pin 2026-06-25 | ⚠️ Bản dev |
| jsoup | `1.23.1-SNAPSHOT`, pin 2026-06-25 | ⚠️ Bản dev |
| jfreechart | pin 2025-06-07 | Bản ổn định, commit cũ nhất trong 8 repo |
| commons-collections | pin 2026-06-27 | Bản ổn định |
| **Flask** | `3.2.0.dev`, pin 2026-05-31 | ⚠️ **Bản dev/pre-release, chưa từng phát hành chính thức** |
| **requests** | `2.34.2`, pin 2026-06-15 | ⚠️ Rất mới so với ngày huấn luyện model |

*2 dòng Flask/requests đánh dấu ⚠️ chính là bằng chứng cho giả thuyết "model không nhận diện được phiên bản tool" đã thảo luận — 2/2 repo Python đều là bản dev/rất mới, trong khi Java chỉ 2/8 repo là SNAPSHOT.*

## Việc còn thiếu (cần xác nhận thêm)

- [ ] Version Randoop chính xác — hỏi Hải hoặc Phúc, hoặc kiểm tra `.jar` file đã dùng khi chạy baseline
- [x] ~~Bổ sung version `mutmut`~~ — xác nhận 2026-07-17: `mutmut==2.4.4` (pin trong `kaggle_mutation_py.py`) đo mutation Python cho test gpt-4o-mini; Hypothesis xác nhận KHÔNG dùng trong kết quả báo cáo

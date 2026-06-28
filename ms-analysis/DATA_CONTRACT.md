# DATA CONTRACT — Nhóm 2 (SE1944)

Tài liệu chốt **định dạng giao–nhận dữ liệu** giữa DG → LR → MS. Mọi file là CSV,
UTF-8, có header, phân tách bằng dấu phẩy, escape chuẩn (code nhiều dòng để trong
1 ô, có dấu `"`). `function_id` là khóa nối xuyên suốt mọi file.

## Luồng dữ liệu

```
DG: functions.csv ─┐
DG: ground_truth.csv │
DG: baseline_tests.csv ─┤→ MS: measure_python.py / measure_java ─→ MS: metrics.csv ─→ MS: compute_metric / full_analysis.ipynb ─→ summary.csv + figures
LR: llm_output.csv ─┘
```

---

## 1. `functions.csv` — DG tạo (tập hàm đã lọc CC 5–10)

| Cột | Kiểu | Mô tả |
|---|---|---|
| `function_id` | str | Khóa duy nhất, vd `py_001`, `jv_023`. **Bất biến.** |
| `language` | str | `python` hoặc `java`. |
| `code` | str | Mã nguồn hàm (1 hàm/ô). |
| `cc` | int | Cyclomatic Complexity (Lizard), phải ∈ [5,10]. |
| `source_file` | str | Đường dẫn gốc, vd `requests/src/requests/sessions.py`. |
| `function_name` | str | Tên hàm. |

Ràng buộc: đúng 50 `python` + 50 `java` (proposal §5.2); mọi `cc` ∈ [5,10]; `function_id` không trùng.

## 2. `ground_truth.csv` — DG tạo (oracle = source code, proposal §5.4)

| Cột | Kiểu | Mô tả |
|---|---|---|
| `function_id` | str | Khóa nối tới `functions.csv`. |
| `reference_code` | str | Mã nguồn tham chiếu dùng làm oracle khi đo coverage/mutation (thường = `code`). |
| `iaa_checked` | int | 1 nếu được người thứ 2 rà; 0 nếu chưa. |
| `notes` | str | Ghi chú (vd hàm có side-effect, cần stub). |

> Với bài toán test-generation, "ground truth" là **chính mã nguồn hàm** (coverage/mutation tính tự động trên đó). IAA (Cohen's Kappa, ngưỡng trong proposal §5.4) chỉ áp dụng nếu nhóm **rà thủ công** tính đúng/sai của test trên một mẫu — ghi kết quả vào `notes`.

## 3. `llm_output.csv` — LR tạo (output của `run_experiment.py`)

| Cột | Kiểu | Mô tả |
|---|---|---|
| `function_id` | str | Khóa nối. |
| `language` | str | `python`/`java`. |
| `cc` | int | Copy từ functions.csv. |
| `strategy` | str | `one_shot` (mặc định) / `zero_shot`. |
| `model` | str | vd `gpt-4o-mini-2024-07-18` (amendment v1.1). |
| `system_fingerprint` | str | Ghi lại để tái lặp (Threat 7.1). |
| `status` | str | `OK` / `INVALID` (rỗng) / `ERROR`. |
| `n_chars` | int | Độ dài test sinh ra. |
| `cost_usd` | float | Chi phí call. |
| `generated_test` | str | **Mã test do LLM sinh** (đầu vào để MS đo). |

## 4. `baseline_tests.csv` — DG tạo (test từ công cụ truyền thống)

Cùng khóa, dùng cho RQ2. Cột: `function_id`, `language`, `method` (`randoop`/`evosuite`/`pynguin`), `generated_test`.

## 5. `metrics.csv` — **MS tạo** (output của measure_python / measure_java)

Mỗi dòng = (1 hàm) × (1 phương pháp). Đây là **đầu vào trực tiếp của `compute_metric.py`**.

| Cột | Kiểu | Mô tả |
|---|---|---|
| `function_id` | str | Khóa nối. |
| `language` | str | `python`/`java`. |
| `cc` | int | Để chạy RQ3 (tương quan CC). |
| `method` | str | `gpt4o-mini` (đối tượng chính) + baseline (`randoop`/`evosuite`/`pynguin`). |
| `branch_coverage` | float | % (0–100), JaCoCo (Java) / Coverage.py (Python). |
| `mutation_score` | float | % (0–100), PIT (Java) / pytest-mutagen|mutmut (Python). |
| `compiled` | int | 1/0. **Nếu 0 → branch_coverage & mutation_score bị ép = 0** (proposal §5.1 b4). |

Ví dụ:
```csv
function_id,language,cc,method,branch_coverage,mutation_score,compiled
py_001,python,7,gpt4o-mini,86.0,61.5,1
py_001,python,7,pynguin,78.0,64.0,1
jv_001,java,8,gpt4o-mini,0,0,0
```

## 6. `summary.csv` — MS tạo (kết quả cuối, mỗi RQ 1 dòng)

| Cột | Mô tả |
|---|---|
| `rq` | RQ1 / RQ2 / RQ3 |
| `metric` | branch_coverage / mutation_score / correlation |
| `test` | one-sample Wilcoxon / paired Wilcoxon / Spearman |
| `statistic` | giá trị thống kê |
| `p_value` | p |
| `effect_size` | rank-biserial r (RQ2) / ρ (RQ3) |
| `n` | cỡ mẫu |
| `decision` | reject H0 / fail to reject H0 |

# Đo Java gpt-4o-mini trên Kaggle (RQ1/RQ2-A/RQ3 Java + input RQ2-B)

Script: `ms-analysis/scripts/kaggle_java_8lib.py` — tự clone 8 repo Defects4J đúng commit pin, Maven build,
đo branch coverage (JaCoCo) + mutation (PIT) **theo từng hàm** trong `data/full_ground_truth.csv`,
xuất `results_java/metrics_java_gpt.csv` (định dạng git: `function_id,language,cc,branch_coverage,mutation_score,compiled,note`).

> **Lưu ý phương pháp:** baseline (`ms-analysis/results/metrics_full.csv`) do Lộc đo bằng harness Maven local.
> Số Java gpt đo bằng harness Kaggle này → khi so RQ2-B phải ghi threat "khác harness đo".
> Nếu có số gpt đo cùng harness với baseline thì ưu tiên số đó.

## Chuẩn bị dataset (1 lần)
Zip gồm 3 phần (đều lấy từ repo này): `csv/full_ground_truth.csv` (= `data/full_ground_truth.csv`),
`generated_tests/gpt4o/` (60 java + 60 python), `data/raw/{flask,requests}` (bản pinned — chỉ cần cho phần Python).
MS đã đóng sẵn: `nhom2-8lib-JAVA-PY.zip` (xin file từ Phúc, ~4MB).
Kaggle → Create → New Dataset → kéo zip → Title `nhom2-8lib` → Create → **đợi hết chữ "Processing"**.

## Chạy
1. New Notebook → Add Input → `nhom2-8lib` → Settings → **Internet ON** (Accelerator: None).
2. Cell 1 (kiểm dataset):
```python
import glob
print(glob.glob("/kaggle/input/**/full_ground_truth.csv", recursive=True))
print("test java:", len(glob.glob("/kaggle/input/**/generated_tests/gpt4o/java/*.java", recursive=True)))
```
3. Cell 2: dán toàn bộ `kaggle_java_8lib.py`.
4. **Save Version → Save & Run All (Commit)** — chạy batch, đóng tab được, log không mất. Đợi 30–90'.

## Đọc log (số thật hay không nằm ở đây)
Thứ tự phải thấy: `GT_CSV = /kaggle/input/...` + `so file test java: 60` (script fail-fast ngay giây thứ 5
nếu thiếu dataset — hết cảnh build 60' xong mới chết) → `MVN: Apache Maven 3.9.x` → `jars tai qua Maven: N`
(**N ≥ 10**, ít hơn là compile-error hàng loạt GIẢ) → `BUILD OK` × 8 repo → `GT java doc duoc: 60 ham`
→ từng hàm `JA-0xx bc= <số> ms= <số>` kèm dòng `[CSV] ...` (xem live trong tab Logs) → `== Do duoc: X / 60`.

Hàm lỗi được ghi trung thực: `no-build` / `no-test` / `compile-error` với `compiled=0` (không bịa 0% giả).
Log chi tiết build/PIT nằm ở `results_java/logs/`.

## Lấy kết quả
Version → tab Output → tải `results_java/metrics_java_gpt.csv` → đặt vào `ms-analysis/results/` → chạy:
```
python ms-analysis/scripts/analyze_8lib.py --py-cov ms-analysis/results/metrics_project.csv --py-mut ms-analysis/results/metrics_py_mut.csv --java-gpt ms-analysis/results/metrics_java_gpt.csv --baseline ms-analysis/results/metrics_full.csv --out ms-analysis/results
python ms-analysis/scripts/make_figures_8lib.py
```
→ `summary_8lib.csv` đủ RQ1/RQ2-A/RQ2-B/RQ3 hai ngôn ngữ + effect size; điền `[JAVA: ...]` trong
`paper/sections/04_results.tex`, copy hình mới sang `paper/figures/`.

## Sự cố
- CSV được **ghi ngay sau mỗi hàm** + mirror ra log dạng `[CSV] ...` → version bị kill vẫn cứu được:
  copy toàn bộ log thành `log.txt` → `python ms-analysis/scripts/rebuild_tu_log.py log.txt`.
- Chạy lại cell cùng session → tự resume (bỏ qua hàm đã có trong CSV).
- Ít hàm đo được / lỗi lạ → gửi MS các dòng `[DBG]`, `JAVAC LOI`, `TOP LOI COMPILE` trong log.

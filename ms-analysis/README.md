# MS — Measurement & Stats (Nhóm 2 · SE1944)

Bộ công cụ cho vai trò **MS**: đo Branch Coverage + Mutation Score rồi chạy kiểm định thống kê
cho 3 RQ. Khớp `proposal_ver2_one-shot.md` + **amendment v1.1 (gpt-4o-mini)**.

## Cấu trúc
```
ms-analysis/
├── DATA_CONTRACT.md            # schema 4 CSV giao–nhận DG/LR/MS  ← đọc trước
├── proposal-amendment-v1.1.md  # đổi model sang gpt-4o-mini (chờ GV duyệt)
├── scripts/
│   ├── compute_metric.py       # Gate E4: Wilcoxon/Spearman + effect size → summary.csv + figures
│   ├── measure_python.py       # đo Python: coverage.py + mutation AST → metrics.csv
│   └── make_sample_data.py     # data giả để chạy thử
├── measure_java/               # đo Java (JaCoCo + PIT) — CHẠY LOCAL
│   ├── pom.xml · run_java_metrics.sh · README.md
├── notebooks/
│   ├── pilot_analysis.ipynb    # Tuần 7: histogram + descriptive + xác nhận test
│   └── full_analysis.ipynb     # Tuần 8: test + effect size + kết luận → summary.csv
├── build_notebooks.py · requirements.txt
└── results/                    # output: metrics.csv, summary.csv, stats_results.json, figures/
```

## Cài đặt
```bash
pip install -r requirements.txt   # pandas numpy scipy matplotlib pytest coverage
```

## Vị trí MS trong dây chuyền (đọc DATA_CONTRACT.md)
```
DG: functions.csv + ground_truth.csv + baseline_tests.csv
LR: llm_output.csv (generated_test)
        │
        ▼  MS đo lường
measure_python.py / measure_java  ─►  results/metrics.csv
        │
        ▼  MS phân tích
compute_metric.py | full_analysis.ipynb  ─►  summary.csv + figures/  ─►  bàn giao RW
```
**MS phụ thuộc đầu vào của DG & LR** — không có `llm_output.csv` + `functions.csv` thì chưa đo thật được. Dùng `make_sample_data.py` để dựng/kiểm thử trước.

## Quy trình theo tuần (RBL-4)
```bash
# GATE E4 (Tuần 6) — phải chạy không lỗi trước khi bắt đầu Tuần 7
python scripts/make_sample_data.py --output-dir data
python scripts/compute_metric.py --input data/metrics.sample.csv --output-dir results

# Đo thử trên data giả (xác nhận harness Python chạy)
python scripts/measure_python.py --functions data/functions.sample.csv \
    --tests data/llm_output.sample.csv --method gpt4o-mini --out results/metrics.csv

# TUẦN 7 (pilot): có pilot metrics → mở notebooks/pilot_analysis.ipynb (sửa INPUT)
# TUẦN 8 (full):  có full metrics  → notebooks/full_analysis.ipynb → summary.csv (Restart & Run All)
```

## Đo thật (khi có data của DG/LR)
1. **Python:** `measure_python.py --functions functions.csv --tests llm_output.csv --method gpt4o-mini --out results/metrics.csv`; lặp lại với `--tests baseline_tests.csv --method pynguin`.
2. **Java:** chạy `measure_java/run_java_metrics.sh` cho từng hàm (local, JDK+Maven) → nối vào cùng `results/metrics.csv`.
3. `compute_metric.py --input results/metrics.csv` hoặc `full_analysis.ipynb` → `summary.csv` + figures.

## Ghi chú quan trọng
- **Model:** theo amendment v1.1, đối tượng là **gpt-4o-mini** (cần GV duyệt). `metrics.csv` dùng `method = gpt4o-mini`.
- **Mutation Python:** proposal ghi *pytest-mutagen* nhưng đó là framework mutation **thủ công**. `measure_python.py` dùng mutation engine AST tích hợp để tự động hoá. **Khuyến nghị amend pytest-mutagen → `mutmut`** nếu cần con số chính chủ (chỉ thay hàm `mutation_score()`).
- **Java** phải đo **local** (JDK/Maven) — không chạy Kaggle. Kaggle dùng để chạy notebook phân tích + đo phần Python.
- **Không HARKing:** giữ nguyên RQ/metric/threshold/test; chỉ amend model có lý do kỹ thuật + GV duyệt.
- Test không tính được → ghi `compiled=0` (điểm 0, INVALID), tính riêng invalid rate; **không** điền bừa.

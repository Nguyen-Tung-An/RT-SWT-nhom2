# Randoop suites — đã gỡ khỏi repo (dọn repo 2026-07-16)

207 file test Randoop máy sinh (~150MB) đã được gỡ để repo gọn nhẹ.
**Không ảnh hưởng số liệu bài báo** — mọi metric đã đo và chốt trong:

- `ms-analysis/results/metrics_full.csv` (method=randoop, 60 hàm)
- `ms-analysis/results/metrics_merged_8lib.csv` / `summary_8lib.csv` (RQ2-B: n=54, p=0.003, r=-1.00)

Cần lại file gốc:

- Lấy từ git history: `git checkout ca0058e -- generated_tests/randoop/`
- Hoặc sinh lại: `python scripts/run_baselines.py` (Randoop, budget 60s/hàm — output không tất định 100% giữa các lần chạy)

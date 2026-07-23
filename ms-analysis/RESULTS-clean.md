# Kết quả — dataset sạch

Sinh tự động bởi `ms-analysis/scripts/report_clean.py`. Không con số nào gõ tay.

Loại khỏi phân tích: CJ-048 (miner tự gán nhầm `protected`→`public`, vi phạm chính tiêu chí F2).


---

## Python (n=60)

### T4 — mutation score > 0 (tầng chính, không lách được)

| Điều kiện | n | T4 > 0 | median (all) | median (hiệu dụng) |
|---|---:|---:|---:|---:|
| GPT-4o-mini v1 | 60 | 16 (26.7\%) | 0.0 | 84.4 |
| GPT-4o-mini v2 | 60 | 22 (36.7\%) | 0.0 | 88.9 |
| Pynguin (mặc định) | 60 | 2 (3.3\%) | 0.0 | 75.0 |
| Pynguin (tắt master–worker) | 60 | 2 (3.3\%) | 0.0 | 75.0 |

### T3 — branch coverage > 0 trong khoảng dòng của hàm

| Điều kiện | n | T3 > 0 | median (all) | median (hiệu dụng) |
|---|---:|---:|---:|---:|
| GPT-4o-mini v1 | 60 | 29 (48.3\%) | 0.0 | 75.0 |
| GPT-4o-mini v2 | 60 | 42 (70.0\%) | 50.0 | 79.2 |
| Pynguin (mặc định) | 60 | 4 (6.7\%) | 0.0 | 100.0 |
| Pynguin (tắt master–worker) | 60 | 6 (10.0\%) | 0.0 | 30.0 |

### Kiểm định — Python

| So sánh | n≠0 | được / mất | p / rank-biserial | Kết luận |
|---|---:|---:|---|---|
| RQ-B  v1 → v2  (T3) | 32 | +18 / −5 | 0.0027 / +0.608 | **có ý nghĩa** |
| RQ-B  v1 → v2  (T4) | 16 | +9 / −3 | 0.3259 / +0.279 | không có ý nghĩa |
| RQ-C  GPT v1 vs Pynguin (mặc định)  (T4) | 18 | +2 / −16 | 0.0027 / -0.807 | **có ý nghĩa** |
| RQ-C  GPT v2 vs Pynguin (mặc định)  (T4) | 22 | +1 / −21 | 0.0001 / -0.960 | **có ý nghĩa** |
| RQ-C  GPT v1 vs Pynguin (tắt m–w)  (T4) | 18 | +2 / −16 | 0.0027 / -0.807 | **có ý nghĩa** |
| RQ-C  GPT v2 vs Pynguin (tắt m–w)  (T4) | 22 | +1 / −21 | 0.0001 / -0.960 | **có ý nghĩa** |

---

## Java (n=59) — cổng ≥1 test xanh (đúng đặc tả đã đăng ký)

| Điều kiện | n | T4 > 0 | median (all) | median (hiệu dụng) |
|---|---:|---:|---:|---:|
| GPT-4o-mini v1 | 59 | 16 (27.1\%) | 0.0 | 100.0 |
| GPT-4o-mini v2 | 59 | 16 (27.1\%) | 0.0 | 93.8 |
| EvoSuite 1.2.0 | 59 | 24 (40.7\%) | 0.0 | 100.0 |
| Randoop 4.3.3 | 59 | 18 (30.5\%) | 0.0 | 68.8 |

### Kiểm định — Java, cổng ≥1 test xanh (đúng đặc tả đã đăng ký)

| So sánh | n≠0 | được / mất | p / rank-biserial | Kết luận |
|---|---:|---:|---|---|
| RQ-B  v1 → v2  (T4) | 4 | +1 / −1 | — | n<6, không kiểm định được |
| RQ-C  GPT v1 vs EvoSuite  (T4) | 26 | +16 / −8 | 0.1307 / +0.339 | không có ý nghĩa |
| RQ-C  GPT v2 vs EvoSuite  (T4) | 28 | +17 / −9 | 0.1035 / +0.352 | không có ý nghĩa |
| RQ-C  GPT v1 vs Randoop  (T4) | 23 | +10 / −8 | 0.6051 / -0.123 | không có ý nghĩa |
| RQ-C  GPT v2 vs Randoop  (T4) | 22 | +9 / −7 | 0.8076 / -0.059 | không có ý nghĩa |

---

## Java (n=59) — cổng cả suite phải xanh (bản cũ)

| Điều kiện | n | T4 > 0 | median (all) | median (hiệu dụng) |
|---|---:|---:|---:|---:|
| GPT-4o-mini v1 | 59 | 12 (20.3\%) | 0.0 | 100.0 |
| GPT-4o-mini v2 | 59 | 10 (16.9\%) | 0.0 | 100.0 |
| EvoSuite 1.2.0 | 59 | 24 (40.7\%) | 0.0 | 100.0 |
| Randoop 4.3.3 | 59 | 18 (30.5\%) | 0.0 | 68.8 |

### Kiểm định — Java, cổng cả suite phải xanh (bản cũ)

| So sánh | n≠0 | được / mất | p / rank-biserial | Kết luận |
|---|---:|---:|---|---|
| RQ-B  v1 → v2  (T4) | 4 | +1 / −3 | — | n<6, không kiểm định được |
| RQ-C  GPT v1 vs EvoSuite  (T4) | 25 | +18 / −6 | 0.0436 / +0.462 | **có ý nghĩa** |
| RQ-C  GPT v2 vs EvoSuite  (T4) | 24 | +19 / −5 | 0.0278 / +0.513 | **có ý nghĩa** |
| RQ-C  GPT v1 vs Randoop  (T4) | 22 | +12 / −6 | 0.8202 / +0.055 | không có ý nghĩa |
| RQ-C  GPT v2 vs Randoop  (T4) | 20 | +12 / −4 | 0.4898 / +0.176 | không có ý nghĩa |

---

## RQ-A — dataset gốc vs dataset sạch, **cùng prompt v1**

Không phải so sánh có kiểm soát: hai tập hàm khác nhau, tập sạch dễ hơn *theo thiết kế*. Chỉ báo cáo mức chênh, không quy nhân quả. Mỗi cặp đo bằng **cùng một cổng xanh** để so được.

| Ngôn ngữ | cổng | gốc | sạch |
|---|---|---:|---:|
| Python | per-test | 13/60 (21.7\%) | 16/60 (26.7\%) |
| Java | cả suite | 6/60 (10.0\%) | 12/59 (20.3\%) |
| Java | per-test | *(dataset gốc chưa đo lại bằng cổng per-test)* | — |

---

## Vì sao hỏng — phân bố lý do


**Java GPT v1**

- 38 — test khong bien dich duoc
- 13 — đo được
- 2 — loc 4/5 test xanh
- 1 — loc 7/9 test xanh
- 1 — loc 3/7 test xanh
- 1 — loc 4/6 test xanh
- 1 — khong co diem dot bien
- 1 — loc 1/4 test xanh
- 1 — RED tren ban goc (7/7 that bai)

**Java GPT v2**

- 38 — test khong bien dich duoc
- 10 — đo được
- 1 — loc 5/6 test xanh
- 1 — loc 7/9 test xanh
- 1 — loc 4/7 test xanh
- 1 — loc 4/5 test xanh
- 1 — loc 6/8 test xanh
- 1 — loc 3/5 test xanh
- 1 — khong co diem dot bien
- 1 — loc 1/5 test xanh
- 1 — RED tren ban goc (6/6 that bai)
- 1 — khong co test nao chay
- 1 — loc 6/7 test xanh

**Java EvoSuite**

- 33 — đo được
- 24 — khong co suite cho lop nay
- 1 — RED tren ban goc (1/620)
- 1 — RED tren ban goc (3/12)

**Java Randoop**

- 51 — đo được
- 7 — khong co suite cho lop nay
- 1 — RED tren ban goc (946/1544)

**Python GPT v1**

- 24 — đo được
- 17 — khong co test xanh (collect-fail)
- 13 — khong co test xanh (per-test)
- 5 — khong co diem dot bien (metric khong xac dinh)
- 1 — test xanh nhung KHONG cham ham dich

**Python GPT v2**

- 36 — đo được
- 14 — khong co test xanh (per-test)
- 6 — khong co diem dot bien (metric khong xac dinh)
- 4 — khong co test xanh (collect-fail)

**Python Pynguin (mặc định)**

- 39 — khong co suite cho module
- 12 — test xanh nhung KHONG cham ham dich
- 5 — khong co test xanh (collect-fail)
- 4 — đo được

**Python Pynguin (tắt m–w)**

- 35 — khong co suite cho module
- 16 — khong co test xanh (collect-fail)
- 6 — đo được
- 3 — test xanh nhung KHONG cham ham dich

# Nhật ký — bài thứ hai (dataset sạch)

Cập nhật 2026-07-24. **Đây là file duy nhất cần đọc trước khi viết báo cáo.** Mọi con số
trong bài phải lấy từ đây hoặc từ `ms-analysis/RESULTS-clean.md` (file đó sinh tự động,
không gõ tay).

---

## 0. Dùng file nào

| Cần gì | Đọc file |
|---|---|
| **Số liệu cuối** | `ms-analysis/RESULTS-clean.md` — sinh bởi `scripts/report_clean.py` |
| Đăng ký trước (giả thuyết, cấu hình khoá) | `ms-analysis/PREREGISTRATION-clean.md` |
| Tiêu chuẩn chọn dữ liệu | `ms-analysis/DATA-STANDARDS.md` |
| Danh mục lỗi đo lường (§6 của bài dùng cái này) | `ms-analysis/MEASUREMENT-PITFALLS.md` |
| Vì sao v2 giúp Python mà không giúp Java | `ms-analysis/ANALYSIS-why-v2-helps-python-not-java.md` |
| Bài đang viết | `paper2/main.tex` + `paper2/sections/*.tex` |
| Bản .txt từng phần | `paper2/backup/*.txt` (chạy `python paper2/backup_txt.py`) |

Sinh lại toàn bộ bảng số:

```bash
python ms-analysis/scripts/report_clean.py
```

---

## 1. Đã làm gì

### 1.1 Dựng dataset sạch

Đào từ 10 repo (8 Java, 2 Python) ở commit cố định. Lizard 1.23.0 đo CC, giữ băng
`5 ≤ CC ≤ 10`. Thêm 5 tiêu chí, **chốt trước khi sinh test nào**:

- **F1** thân hàm ≥ 3 dòng
- **F2** public / không bắt đầu bằng `_`
- **F3** tên không nhập nhằng (không trùng trong lớp/module)
- **F4** lớp chủ xác định đúng — stack độ sâu ngoặc **có pop**
- **F5** (Python) import được, `getattr` ra, callable được

Phễu: **1848 → 753 (F3) → 474 (F2) → pool Java 406 / Python 64**. Lấy mẫu 60 + 60.

Script: `ms-analysis/scripts/mine_clean.py`. Dữ liệu: `data/clean_v3.csv`.

**Loại 1 hàm**: `CJ-048` — miner tự gán nhầm `protected` → `public`, vi phạm chính F2.
Java báo cáo **n = 59**, Python **n = 60**.

### 1.2 Sinh test

`gpt-4o-mini-2024-07-18`, temperature 0, top_p 1.0, max_tokens 2048, **một lần gọi API cho
mỗi hàm**, không vòng lặp sửa lỗi, không retrieval.

Hai điều kiện, **cả hai đều one-shot** (cùng đúng một ví dụ mẫu), **khác đúng một biến**:

- **v1** — prompt gốc: nêu tên hàm + mã nguồn
- **v2** — v1 nguyên vẹn + chèn khối `### Target ###`: tên đủ điều kiện, chữ ký, lớp chủ,
  và một lời gọi constructor **đã chạy thật và xác nhận dựng được receiver**

Script: `scripts/run_experiment_v3fair.py`. Trong code và tên file, v2 = `v3fair`.

### 1.3 Đo — bốn tầng

| Tầng | Tiêu chí |
|---|---|
| T1 | biên dịch / collect được |
| T2 | ≥ 1 test xanh trên bản gốc |
| T3 | branch coverage > 0 **trong khoảng dòng của hàm đích** |
| **T4** | **mutation score > 0** trong cùng khoảng dòng — **tiêu chí chính** |

T1 và T2 **lách được**, đã chứng minh bằng ca có thật trong corpus này, nên mọi kết luận
đặt trên T4.

Script: `mutation_on_target.py` (Python), `mutation_java.py` + `JUnitRunner.java` (Java).
Đột biến luôn ghi vào **bản sao cô lập**, không đụng `data/raw`.

### 1.4 Baseline

- **EvoSuite 1.2.0** — 60 s/lớp, JDK 11, bytecode biên dịch riêng ra `target/classes-jdk11`
- **Randoop 4.3.3** — 60 s/lớp, JDK 17
- **Pynguin 0.45.0** — 90 s/module, **chạy CẢ HAI cấu hình, báo cáo song song**
  (mặc định / tắt master–worker)

Script: `ms-analysis/scripts/measure_baseline.py`.

### 1.5 Thống kê

Paired Wilcoxon signed-rank, ghép theo `func_id`, α = 0.05, effect size matched-pairs
rank-biserial. **Java và Python tách riêng**, mẫu số luôn của riêng ngôn ngữ đó.
Báo cáo hai mức song song: *all* (không đo được = 0) và *effective* (chỉ tập > 0).

Script: `ms-analysis/scripts/analyze_clean.py`.

### 1.6 Hai lần sửa công cụ đo, đều đã khai báo

1. **Lệch JDK** — runner + test biên dịch bằng JDK 17 rồi chạy bằng JDK 11 →
   `UnsupportedClassVersionError` nuốt trong tiến trình con → EvoSuite ra **0/60 giả**.
   Nếu tin số đó, bài sẽ viết "GPT vượt trội EvoSuite có ý nghĩa thống kê" (p = 0.005).
2. **Bất đối xứng cổng xanh** — Python lọc theo từng test (đúng T2 đã đăng ký), Java lại
   loại cả hàm nếu một test đỏ. Đã sửa cho khớp đặc tả; **báo cáo song song cả hai cổng**,
   số trước khi sửa lưu ở `*_strictgate.csv` và đã commit **trước** khi chạy lại.

Cả hai vào §6 của bài. Chi tiết: `MEASUREMENT-PITFALLS.md`.

---

## 2. Số chốt

### Python (n = 60) — đã xong hẳn

| | T3 chạm đích | T4 phát hiện lỗi |
|---|---:|---:|
| GPT v1 | 29/60 (48.3 %) | 16/60 (26.7 %) |
| GPT v2 | **42/60 (70.0 %)** | 22/60 (36.7 %) |
| Pynguin mặc định | 4/60 (6.7 %) | 2/60 (3.3 %) |
| Pynguin tắt m–w | 6/60 (10.0 %) | 2/60 (3.3 %) |

**RQ-B tách đôi giữa hai tầng — đây là phát hiện chính:**

| | p | rank-biserial | |
|---|---:|---:|---|
| T3 v1 → v2 | 0.0027 | +0.608 | **có ý nghĩa** |
| T4 v1 → v2 | 0.3259 | +0.279 | không có ý nghĩa |

Đặc tả mục tiêu đưa test **tới** được hàm, nhưng không làm test **kiểm tra** gì thêm.

**RQ-C Python** — GPT vượt Pynguin ở mọi tổ hợp: p = 0.0001 (v2) và 0.0027 (v1), cả hai
nhánh Pynguin, rank-biserial −0.81 đến −0.96.

**Cơ chế** (`ANALYSIS-why-v2-helps-python-not-java.md`): Python collect-fail 17 → 4 (cứu
14). Java không biên dịch được 39 → 39, **trùng 36/39**. Đặc tả mục tiêu sửa được *tên*,
không sửa được *kiểu*.

### Java (n = 59)

| | cổng cả suite | cổng ≥1 test xanh |
|---|---:|---:|
| GPT v1 | 12 (20.3 %) | 16 (27.1 %) |
| GPT v2 | 10 (16.9 %) | 16 (27.1 %) |
| EvoSuite | 24 (40.7 %) | 23 (39.0 %) |
| Randoop | 18 (30.5 %) | *đang chạy* |

Cả hai baseline Java đều **trên** GPT — ngược hẳn với Python.

### RQ-A — dataset gốc vs sạch, cùng prompt v1

Không phải so sánh có kiểm soát (hai tập hàm khác nhau). Phải so **cùng một cổng xanh**:

| | gốc | sạch |
|---|---:|---:|
| Python (per-test) | 13/60 (21.7 %) | 16/60 (26.7 %) |
| Java (cổng cả suite) | 6/60 (10.0 %) | 12/59 (20.3 %) |

---

## 3. KHÔNG DÙNG — file cũ / đã bỏ

Để tránh lấy nhầm khi viết bài. Không có gì trong danh sách này được vào báo cáo.

| File | Vì sao bỏ |
|---|---|
| `mutation_java_clean_v4.csv`, `mutation_java_v4.csv` | prompt v4 dạy dùng reflection → T1 mất ý nghĩa |
| `mutation_on_target_clean_v3.csv`, `mutation_on_target_v3.csv` | v3 là **zero-shot**, lệch v1 ở *hai* biến |
| `mutation_on_target_best.csv` | chọn bản tốt nhất trong 3 phiên bản = chọn số |
| `mutation_on_target_ho_v1/ho_v3.csv` | mẫu held-out chỉ ~30 hàm, không đủ |
| `repair_v3r*.csv`, `java_autoimport.csv` | các vòng tự sửa lỗi — phạm vi bài này là **one-shot, không vòng lặp** |
| `metrics_*.csv`, `summary_8lib.csv`, `RESULTS.md`, `MASTER-RESULTS.md` | của **bài thứ nhất**, dataset khác |
| `_*.csv` (tiền tố gạch dưới) | file nháp/tạm |

**Bài thứ nhất không đụng vào.** Dataset của nó đã khoá bằng amendment v1.2 và đã bảo vệ
trước GV. Bài này đứng cạnh nó, không thay nó.

---

## 4. Còn phải làm

- [ ] **Randoop** đo lại với cổng mới — đang chạy
- [ ] **CJ-046 (EvoSuite)** — lần chạy trước biên dịch được (ms = 87.5), lần này báo
      "suite không biên dịch được". Bước biên dịch nằm *trước* chỗ sửa cổng, nên **không
      phải** do đổi cổng. Phải chạy lại riêng ca này xem có phải dao động giữa các lần
      chạy không. Nếu đúng là dao động thì phải ghi vào §6 — bài đang nói cấu hình là tất
      định.
- [ ] Đo lại **dataset gốc Java** bằng cổng per-test, để RQ-A so được ở cả hai cổng
- [ ] Viết `paper2/sections/04_results.tex`
- [ ] Viết **Abstract** (cuối cùng, cần đủ N và p)
- [ ] Bạn tự viết lại bằng lời của mình + khai báo dùng AI theo RBL-5b

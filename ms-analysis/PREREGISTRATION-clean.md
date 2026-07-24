# Đăng ký trước — nghiên cứu trên dataset sạch

**Ngày ghi:** 2026-07-21
**Trạng thái khi ghi:** dataset đã mine + verify; test v1/v3/v4 đã sinh; **baseline CHƯA chạy**;
kết quả baseline **CHƯA ai nhìn thấy**.

Tài liệu này khoá mọi quyết định cấu hình **trước** khi chạy baseline, để không lặp lại
vấn đề post-hoc của bài gốc. Commit này là dấu thời gian.

---

## 1. Câu hỏi nghiên cứu

**RQ-A.** Trên dataset dựng theo `DATA-STANDARDS.md` (100% public, không nhập nhằng, lớp
chủ xác định đúng, verify động), GPT-4o-mini one-shot đạt branch coverage và mutation score
bao nhiêu — và có khác biệt so với dataset xây dựng lỏng lẻo không?

**RQ-B.** Prompt cung cấp đặc tả mục tiêu đầy đủ (v3/v4) có tốt hơn prompt gốc (v1) trên
dataset sạch không?

**RQ-C.** So với baseline tự động (EvoSuite, Randoop cho Java; Pynguin cho Python), GPT-4o-mini
đứng ở đâu trên dataset sạch?

---

## 2. Giả thuyết — ghi TRƯỚC khi thấy số

| | Dự đoán | Cơ sở |
|---|---|---|
| **H-A** | Chỉ số trên dataset sạch **cao hơn đáng kể** dataset gốc, **cùng prompt** | Đã quan sát: Java T4 6/60 → 12/60; Python (n=30) 21.7% → 56.7% |
| **H-B** | v3/v4 **KHÔNG tốt hơn**, có thể **tệ hơn** v1 trên dataset sạch | Đã quan sát n=30: v3 thua v1 17→12, mất 5 được 0. Scaffolding của v3 sinh ra để chữa bệnh dataset bẩn; dataset sạch không có bệnh đó |
| **H-C** | Chưa dự đoán — **chưa có dữ liệu nào** về baseline trên dataset này | |

**H-B đi ngược kỳ vọng thông thường** ("prompt tốt hơn thì kết quả tốt hơn"). Ghi ra đây
để nếu kết quả ủng hộ nó thì đó là dự đoán trước, không phải giải thích sau.

---

## 3. Cấu hình baseline — KHOÁ

### 3.1 Pynguin (Python) — chạy **CẢ HAI** config, báo cáo **song song**

| Nhánh | Cấu hình | Vai trò |
|---|---|---|
| **P-default** | mặc định (`use_master_worker=True`) | Giống hệt bài gốc → so sánh được |
| **P-fixed** | `--nouse_master_worker --nosubprocess_if_recommended` | Baseline chạy được thật → so sánh công bằng |

**Lý do chạy cả hai** (ghi trước, không phải biện minh sau):

Pynguin mặc định **crash trên module flask** — `dill` không pickle được type object
C-extension (`_ctypes._CData`, `_json.Scanner`), worker chết, `rc=2`, không sinh gì. Đã
chứng minh trong phiên audit: `flask.app` từ crash → chạy được khi tắt master-worker.

Dataset sạch có **28 hàm flask**, nên config quyết định phần lớn dữ liệu.

**Đây không phải HARKing.** RQ, metric, ngưỡng, kiểm định đều không đổi — chỉ sửa dụng cụ
đo bị hỏng. Và quan trọng: sửa làm **baseline mạnh lên** → GPT trông **tệ đi**. Thay đổi
post-hoc bất lợi cho chính mình không phải result-shopping. Nhưng vẫn phải khai báo, nên
báo cáo **cả hai nhánh**, và chênh lệch giữa chúng tự nó là kết quả.

Budget: **90 s/module** (giữ nguyên bài gốc).

### 3.2 EvoSuite (Java)

| | |
|---|---|
| Phiên bản | **1.2.0** (tải từ GitHub release chính thức) |
| Budget | **60 s/class** (giữ nguyên bài gốc) |
| JDK | thử JDK 17 trước; nếu lỗi thì JDK 11 rồi JDK 8 (theo `tool-versions.md`: bài gốc cần 11 cho 39 hàm, 8 cho 21 hàm) |
| `separateClassLoader` | **false** khi đo (bài gốc: bật gây JaCoCo báo 0% sai) |

### 3.3 Randoop (Java)

| | |
|---|---|
| Phiên bản | **4.3.3** |
| Budget | **60 s/class** |
| JDK | 17 |

Đây là nghiên cứu độc lập với dataset và harness riêng, nên phiên bản công cụ chỉ là một
thông số của Method — không phải độ lệch so với bài trước. Mọi công cụ (GPT v1/v3/v4,
EvoSuite, Randoop, Pynguin) đều chạy trên **cùng dataset, cùng harness 4 tầng**, nên
RQ-C so sánh được nội bộ.

*Giới hạn duy nhất:* đừng so trực tiếp con số Randoop ở đây với con số Randoop của bài gốc
(bài gốc dùng 4.3.4 — theo `scripts/run_baselines.py`). Nghiên cứu này không thực hiện
phép so đó.

---

## 3bis. Bổ sung sau đăng ký — điều kiện **v3-fair** (ghi 2026-07-21)

**Phát hiện sau khi đã đăng ký, ghi lại đầy đủ thay vì lặng lẽ sửa.**

Khi rà lại prompt, `prompt_v3.py` hoá ra được viết lại từ đầu nên **không có exemplar**:

| Khối | v1 | v3 |
|---|---|---|
| `### Example Input/Output ###` | ✅ | ❌ |
| `### Target ###` | ❌ | ✅ |

Nghĩa là v1 là **one-shot** (1 exemplar) còn v3 thực chất là **zero-shot + metadata**. Hai
điều kiện khác nhau ở **hai biến**, nên chênh lệch v1↔v3 **không quy được** cho đặc tả mục
tiêu — và gọi v3 là "one-shot cải tiến" là sai nhãn.

**Sửa:** thêm điều kiện **v3-fair** (`scripts/run_experiment_v3fair.py`) — giữ **nguyên vẹn**
prompt v1 (exemplar + `### Actual Task ###`), **chỉ chèn thêm** khối `### Target ###`.

| | v1 | v3-fair | v3 |
|---|---|---|---|
| Exemplar | ✅ | ✅ | ❌ |
| Khối Target | ❌ | ✅ | ✅ |
| One-shot đúng nghĩa | ✅ | ✅ | ❌ |

**Ảnh hưởng tới RQ-B:**
- Điều kiện **chính** để trả lời RQ-B là **v1 vs v3-fair** — chỉ một biến khác nhau, quy
  được nhân quả.
- **v3 giữ lại như quan sát phụ**, và mọi phát biểu về nó phải ghi rõ nó là zero-shot,
  khác v1 ở hai chiều.

**Giả thuyết H-B giữ nguyên như đã đăng ký** (v3/v4 không tốt hơn, có thể tệ hơn) — không
sửa sau khi thấy số. v3-fair sinh xong 120/120 nhưng **chưa đo** khi ghi mục này.

---

## 4. Đo lường — khoá

Dùng nguyên bộ 4 tầng của `MEASUREMENT.md`, không đổi:

| Tầng | Tiêu chí |
|---|---|
| T1 | biên dịch / collect được |
| T2 | ≥1 test xanh trên bản gốc |
| T3 | branch coverage > 0 trong `[start_line, end_line]` |
| **T4** | **mutation score > 0** — tiêu chí chính, không lách được |

**Kiểm định:** paired Wilcoxon (ghép theo `func_id`), α = 0.05, effect size
matched-pairs rank-biserial. Ngưỡng RQ giữ nguyên bài gốc: coverage 80%, mutation 60%.

**Báo cáo hai mức:** *all* (n=60/ngôn ngữ, không đo được = 0) và *effective* (>0).
Không được bỏ mức *all* dù *effective* đẹp hơn.

**Không gộp Java + Python.** Mẫu số luôn `/60` của riêng ngôn ngữ.

---

## 4bis. Sửa cài đặt cổng xanh phía Java (ghi 2026-07-23, **sau** khi thấy số)

**Phải ghi rõ vì đây là thay đổi công cụ đo sau khi đã có kết quả — và nó có lợi cho
phía chúng tôi trong RQ-C.**

### Đã sai ở đâu

Mục 4 khoá `T2 = "≥1 test xanh trên bản gốc"`. Phía Python (`greencheck.py`) cài đúng như
vậy: giữ các test xanh, bỏ các test đỏ, rồi đột biến. Phía Java (`mutation_java.py`) lại
cài **"cả suite phải xanh"** — chỉ một test đỏ là loại luôn hàm đó khỏi tầng 4.

Hai ngôn ngữ đo hai thứ khác nhau dưới cùng một tên. Bản Java **vi phạm chính đặc tả đã
khoá trước**. Docstring của chính file đó ghi *"Test phải XANH trên bản gốc, nếu không thì
loại (green-check, **cùng nguyên tắc bên Python**)"* — ý định là per-test, cài đặt lại là
whole-suite.

### Đã sửa gì

1. `JUnitRunner` in thêm một dòng `GREEN <tênMethod>` cho mỗi test **pass**, và nhận danh
   sách method để chỉ chạy đúng những test đó.
2. Nếu suite có test đỏ: lọc lấy các test xanh, **chạy lại trên bản gốc để xác nhận tái
   lập** (toàn xanh, số test > 0). Không tái lập được thì quay về cổng nghiêm ngặt.
3. Tiêu chí giết mutant đổi từ `returncode != 0` sang **`RESULT` có `bad > 0`**.
   `returncode = 2` nghĩa là không nạp được lớp test / không chọn được method — hỏng hạ
   tầng, không phải bằng chứng phát hiện lỗi, nhưng bản cũ vẫn đếm là "giết được".

Bước 1 là **bắt buộc về mặt đúng đắn**, không chỉ là công bằng: nếu lọc mà vẫn chạy cả
lớp, các test vốn đã đỏ sẽ làm **mọi** mutant trông như bị giết → mutation score 100% giả.
Đó chính là lý do bản gốc chọn chặn cả suite.

### Cam kết kèm theo

- Số theo **cổng nghiêm ngặt đã lưu vào `*_strictgate.csv` và commit `ca5485f` TRƯỚC khi
  chạy lại**. Git có dấu thời gian; không thể chọn số sau.
- Báo cáo **song song cả hai cổng** trong bài, đúng như cách xử lý hai nhánh Pynguin.
- Áp dụng **như nhau** cho GPT và cho cả hai baseline Java. Không sửa riêng cho một phía.
- Python **không chạy lại** — vốn đã đúng đặc tả.

### Hướng thay đổi

Số ca "RED trên bản gốc" được cứu: GPT v1 **6**, GPT v2 **8**, EvoSuite **1**, Randoop **1**
(đếm lại từ CSV: hàm bị cổng nghiêm ngặt loại nhưng cổng per-test đo được. Con số 8/10/2/2
ghi ban đầu ở đây là **sai** — đó là số ca có nhãn `RED trên bản gốc` ở bản strict, 7/9/2/1,
và tôi còn cộng nhầm. Phúc bắt được; đã sửa cả trong bài). Nghĩa là
sửa này **có lợi cho GPT** ở RQ-C (so với baseline) và **có lợi nhẹ cho v2** ở RQ-B. Vì
hướng thay đổi thuận theo phía chúng tôi, mọi kết luận RQ-C chỉ được phát biểu nếu **đúng
ở cả hai cổng**. Nếu hai cổng cho kết luận trái nhau, báo cáo là **không kết luận được**.

---

## 5. Cam kết chống thiên lệch

- [x] Prompt v1/v3/v4 **đã đóng băng** (commit trước ngày ghi này)
- [x] Dataset **đã khoá** — `data/clean_v3.csv`, 120 hàm, verify 120/120
- [x] Cấu hình baseline khoá **trước khi chạy** (tài liệu này)
- [x] Giả thuyết ghi trước, kể cả H-B đi ngược kỳ vọng
- [ ] Chạy baseline **một lần**, không tinh chỉnh config sau khi thấy số
- [ ] Báo cáo **cả hai nhánh Pynguin**, không chọn nhánh đẹp hơn
- [ ] Nếu phải đổi config sau khi thấy kết quả → **ghi rõ đã đổi gì và vì sao**

---

## 6. Quan hệ với bài hiện tại

Đây là **nghiên cứu mới**, dataset mới. Bài one-shot hiện tại (120 hàm gốc, amendment v1.2)
**không đổi** — đã bảo vệ, số giữ nguyên. Kết quả ở đây **không được** thay vào bài cũ.

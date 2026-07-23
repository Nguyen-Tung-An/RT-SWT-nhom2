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
| Phiên bản | **4.3.3** ⚠️ |
| Budget | **60 s/class** (giữ nguyên bài gốc) |
| JDK | 17 |

> ⚠️ **Sai lệch phải khai báo:** `tool-versions.md` ghi phiên bản Randoop của bài gốc
> *"chưa xác nhận được"*. Ta dùng **4.3.3**, có thể **khác** bản gốc. Nên số Randoop
> **không so chéo trực tiếp** với bài gốc được — chỉ dùng để so trong nghiên cứu này.

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

## 5. Cam kết chống thiên lệch

- [x] Prompt v1/v3/v4 **đã đóng băng** (commit trước ngày ghi này)
- [x] Dataset **đã khoá** — `data/clean_v3.csv`, 120 hàm, verify 120/120
- [x] Cấu hình baseline khoá **trước khi chạy** (tài liệu này)
- [x] Giả thuyết ghi trước, kể cả H-B đi ngược kỳ vọng
- [ ] Chạy baseline **một lần**, không tinh chỉnh config sau khi thấy số
- [ ] Báo cáo **cả hai nhánh Pynguin**, không chọn nhánh đẹp hơn
- [ ] Khai báo sai lệch phiên bản Randoop
- [ ] Nếu phải đổi config sau khi thấy kết quả → **ghi rõ đã đổi gì và vì sao**

---

## 6. Quan hệ với bài hiện tại

Đây là **nghiên cứu mới**, dataset mới. Bài one-shot hiện tại (120 hàm gốc, amendment v1.2)
**không đổi** — đã bảo vệ, số giữ nguyên. Kết quả ở đây **không được** thay vào bài cũ.

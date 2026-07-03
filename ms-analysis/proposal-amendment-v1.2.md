# Proposal Amendment v1.2 — Chốt dataset: bộ hàm mined từ 10 repo OSS (pinned commit)

**Nhóm:** Nhóm 2 · **Topic:** SE1944
**Ngày:** 2026-07-02 · **Trạng thái:** Nhóm đã chốt — trình GV xác nhận cùng amendment v1.1 trước full run (theo proposal §5.2 note + §8.6)
**Áp dụng cho:** `proposal_ver2_one-shot.md` (sau amendment v1.1)

---

## 1. Lý do amendment

Proposal §5.2 ghi dataset là **Defects4J (Java) + CodeXGLUE (Python)**. Khi rà soát lại (open item ghi trong §5.2 note), nhóm phát hiện:

1. Các paper trong SLR **không thống nhất dùng** bộ dữ liệu này; CodeXGLUE là benchmark code-intelligence (summarization/translation), **không phải** bộ hàm chạy được kèm hạ tầng test phù hợp cho test generation.
2. Để đo branch coverage / mutation score, mỗi hàm cần **source code chạy được + ngữ cảnh biên dịch** — mining trực tiếp từ repo gốc tại commit cố định đáp ứng điều này và tái lặp được.

Đây là ràng buộc kỹ thuật được phát hiện **trước khi chạy full experiment** và đã được ghi nhận công khai trong proposal như open item — không phải thay đổi sau khi thấy kết quả (không HARKing).

## 2. Các thay đổi (chỉ đổi *nguồn dataset*, KHÔNG đổi RQ/metric/threshold/test)

| Mục | Trước | Sau (v1.2) |
|---|---|---|
| §5.2 Dataset name | Defects4J + CodeXGLUE | **Bộ hàm nhóm tự mine từ 10 repo OSS, pin commit** (provenance: `data/raw/README.md`) |
| §5.2 Source | github.com/rjust/defects4j, github.com/microsoft/CodeXGLUE | **Java:** 8 subject program của Defects4J (commons-math/cli/csv/collections, gson, jsoup, joda-time, jfreechart). **Python:** requests, flask. Tất cả pin commit, ngày tải 2026-06-27 |
| §5.2 Size (N) | 100 hàm (50 Java + 50 Python) | **120 hàm (60 Java + 60 Python)**; pilot = 24 hàm (20%) |
| §5.2 Preprocessing | Lizard, lọc CC ∈ [5,10] | **giữ nguyên** (lizard 1.23.0) + pin commit, xoá `.git/` sau clone |
| §5.1 bước 1 | "Extract từ Defects4J và CodeXGLUE" | "Mine hàm trực tiếp từ 10 repo pinned" |

**Tính liên tục với tài liệu nền:** phía Java vẫn là các **subject program của Defects4J** — cùng mã nguồn mà Gu et al. (2025) [8] và Broide et al. (2026) [10] sử dụng qua framework Defects4J; nhóm chỉ mine hàm trực tiếp tại commit pin thay vì qua framework.

**Giữ nguyên tuyệt đối (chống HARKing):** 3 RQ, metric (Branch Coverage, Mutation Score), threshold (80% / 60% / ρ<−0.5), statistical test (One-sample Wilcoxon, Paired Wilcoxon, Spearman, α=0.05), model (gpt-4o-mini theo v1.1), baseline, cách tính điểm INVALID.

## 3. Bổ sung Threats to Validity (§7.2 External Validity)

> Bộ dữ liệu do nhóm tự mine nên **phân bố không đều giữa các repo** (Python: flask 48 hàm, requests 12 hàm) và chỉ phủ 2 hệ sinh thái (Apache-style Java libraries, web framework Python). Kết quả không tổng quát hóa cho mọi loại mã nguồn; báo cáo phải nêu rõ thành phần dataset và phân bố theo repo.

## 4. Tác động tới mã nguồn

- Không đổi pipeline: `run_experiment.py` đã đọc hàm theo `raw_source_path` trong CSV; `data/full_ground_truth.csv` (120 hàm) và `data/pilot_sample.csv` (24 hàm) đã ở đúng schema.
- Số hàm full run trong tài liệu/kịch bản: cập nhật 100 → **120**.

## 5. Minh chứng & phê duyệt

- Provenance đầy đủ (URL, license, commit pin, ngày tải, layout CSV): `data/raw/README.md`.
- Trình GV xác nhận amendment này **cùng lúc với amendment v1.1, trước khi chạy full experiment (Tuần 8)**.

*Soạn: RW (Lộc) — thay mặt nhóm 2, theo quyết định nhóm ngày 2026-07-02.*

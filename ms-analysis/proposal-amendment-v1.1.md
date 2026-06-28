# Proposal Amendment v1.1 — Đổi model sang `gpt-4o-mini`

**Nhóm:** Nhóm 2 · **Topic:** SE1944
**Ngày:** 2026-06-28 · **Trạng thái:** Chờ GV phê duyệt (theo proposal §8.6)
**Áp dụng cho:** `proposal_ver2_one-shot.md`

---

## 1. Lý do amendment (technical / access constraint)

Tại thời điểm chuẩn bị thực nghiệm, nhóm chỉ có quyền truy cập API **`gpt-4o-mini`** (không có hạn mức `gpt-4o`). Đây là **ràng buộc kỹ thuật khách quan** đúng điều kiện áp dụng amendment trong proposal §8.6, **không phải** thay đổi sau khi đã thấy kết quả (không HARKing).

`gpt-4o-mini` là lựa chọn **hợp lệ về mặt học thuật**: Paper [5] (Konstantinou et al., 2026) đánh giá chính `GPT-4o-mini` trên test generation, nên việc dùng mini vẫn nằm trong phạm vi tài liệu nền của nhóm.

## 2. Các thay đổi (chỉ đổi *model*, KHÔNG đổi RQ/metric/threshold/test)

| Mục | Trước | Sau (v1.1) |
|---|---|---|
| §5.3 Model | `gpt-4o-2024-08-06` | **`gpt-4o-mini-2024-07-18`** (pin snapshot để tái lặp — Threat 7.1) |
| §5.3 Hyperparameters | `temperature=0.0, top_p=1.0, max_tokens=2048` | **giữ nguyên** |
| §5.3 Prompting | one-shot (1 exemplar) | **giữ nguyên** |
| §8.2 Đơn giá | $2.5 / $10 per 1M (in/out) | **$0.15 / $0.60 per 1M** (kiểm tra giá hiện hành tại openai.com/pricing) |
| §8.2 Tổng chi phí | ~$15.00 | **~$1.00** |
| RQ1–RQ3 & hypotheses | "GPT-4o" | thay chữ **"GPT-4o-mini"** (đối tượng nghiên cứu là mini) |

**Giữ nguyên tuyệt đối (chống HARKing):** 3 RQ, metric (Branch Coverage, Mutation Score), threshold (80% / 60% / ρ<−0.5), statistical test (One-sample Wilcoxon, Paired Wilcoxon, Spearman, α=0.05), dataset, baseline (Randoop/EvoSuite/Pynguin), cách tính điểm INVALID.

## 3. Bổ sung Threats to Validity (§7.2 External Validity)

> `gpt-4o-mini` là mô hình **nhẹ hơn** `gpt-4o`. Do đó kết quả Branch Coverage, Mutation Score và "ranh giới đứt gãy CC" thu được **phản ánh năng lực của gpt-4o-mini**, **không** được tổng quát hóa trực tiếp cho `gpt-4o`. Kết luận trong báo cáo phải nêu rõ đối tượng là gpt-4o-mini. Đây cũng là một biến để thảo luận: nếu mini đã đạt/không đạt ngưỡng, cần nói rõ kỳ vọng gpt-4o (mạnh hơn) có thể khác.

## 4. Tác động tới mã nguồn

- `experiment-runner/scripts/config.py`: `MODEL = "gpt-4o-mini-2024-07-18"`; cập nhật `PRICE_INPUT_PER_M = 0.15`, `PRICE_OUTPUT_PER_M = 0.60`.
- Không đổi gì ở pipeline đo lường / thống kê (metric & test không phụ thuộc model).

## 5. Minh chứng & phê duyệt

- Đính kèm khi nộp GV: kết quả **pilot** (Tuần 7) trên gpt-4o-mini làm minh chứng pipeline chạy đúng.
- Cần GV xác nhận amendment này **trước khi chạy full experiment (Tuần 8)**.

*Ký: PL (Ân) — thay mặt nhóm 2.*

# Plagiarism Check Log (RBL-5b)

Ghi lại kết quả quét đạo văn cho TỪNG section trước khi nộp — tương tự
`ai_check_log.md`, nhưng đây là quét TRÙNG LẶP với nguồn khác (không phải quét AI-generated).

**Quy trình:** viết/dẫn nguồn → tự review (đối chiếu mọi đoạn mượn ý có `\cite{}` chưa) →
chạy công cụ quét → ghi kết quả + hành động.

**Công cụ đề xuất:** Turnitin (qua LMS trường FPT, nếu môn học cấp quyền nộp thử/xem
Similarity Report) — hoặc công cụ khác nhóm/GV chỉ định. **Chưa xác nhận trường có cấp
quyền tự quét trước khi nộp chính thức hay không** — cần hỏi GV/kiểm tra LMS trước.

| Ngày | Section | Công cụ | Similarity (%) | Nguồn trùng chính | Hành động |
|---|---|---|---|---|---|
| _vd: 2026-07-20_ | _02_related_ | _Turnitin_ | _8%_ | _(tên nguồn nếu có)_ | _OK / viết lại đoạn X_ |

## Checklist tự review trước khi quét (làm được ngay, không cần công cụ)

- [ ] Mọi số liệu/kết quả mượn từ 17 paper trong `references.bib` đều có `\cite{}` đi kèm
      (đã rà 1 lượt — xem `paper/sections/02_related.tex`, `05_discussion.tex`).
- [ ] Không đoạn nào chép nguyên văn (verbatim) từ abstract/paper gốc — chỉ diễn giải lại
      bằng câu chữ của nhóm, kèm trích dẫn.
- [ ] Phần Method (`03_method.tex`) mô tả đúng quy trình nhóm tự làm — không copy mô tả
      từ paper khác.
- [ ] Nếu có đoạn trích dẫn trực tiếp (quote nguyên văn), phải để trong dấu ngoặc kép rõ
      ràng, không tính là văn của nhóm.

## Ghi chú

- Mục tiêu: đảm bảo phần trăm trùng lặp nằm trong ngưỡng cho phép của môn học (hỏi GV
  ngưỡng cụ thể nếu chưa rõ — RBL-0/RBL-5 có thể đã quy định).
- Similarity report thường tính CẢ phần trích dẫn hợp lệ (`\cite{}`, tên tác giả, số liệu
  paper khác) là "trùng" — không phải cứ có % trùng là đạo văn; cần đọc kỹ report để phân
  biệt trùng-hợp-lệ (có trích dẫn) và trùng-không-nguồn (vấn đề thật).
- Lưu screenshot/PDF report vào thư mục này nếu GV yêu cầu minh chứng.

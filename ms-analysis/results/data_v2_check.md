# Kiểm định Data v2 (functions.rar từ DG - Kim, nhận 03/07/2026)

Kiểm bằng script tự động (P1 = `ast.parse`, P2 = `import solution`, P3 = quét tên chưa định nghĩa trong **thân hàm** — đã loại trừ tên chỉ nằm trong annotation vì có `from __future__ import annotations`).

## Kết quả tổng

| Hạng mục | v1 (cũ) | v2 (mới) |
|---|---|---|
| Java: nội dung khớp CSV | ❌ lệch (vd JA-002 chứa hàm `concat` lạ, không phải `getOptionValues`) | ✅ đã khớp — cả 60 file thay nội dung |
| Python P1 — parse được | 9/12 pilot FAIL (method thụt dòng) | ✅ **60/60 PASS** (đã dedent) |
| Python P2 — import được | 2/12 pilot FAIL (thiếu import) | ✅ **60/60 PASS** (nhờ `__future__ annotations`) |
| Python P3 — chạy được lúc runtime | — | ⚠️ **52/60 còn rủi ro** (chi tiết dưới) |

## ⚠️ Rủi ro còn lại (P3): tên chưa định nghĩa trong thân hàm

Phân loại 52 file bị gắn cờ:

- **12 file chỉ vướng `self`** (PY-002, 012, 023, 025, 026, 031, 043, 048, 051, 052, 053, 059): chấp nhận được — test có thể truyền mock object làm tham số đầu.
- **~40 file tham chiếu tên không tồn tại trong file** (`click`, `current_app`, `RequestRedirect`, `HTTPException`, `to_key_val_list`, ...): khi test gọi hàm và chạm vào nhánh dùng tên đó → `NameError` → test fail trên chính bản gốc → INVALID hoặc coverage thấp **do data, không phải do LLM** (threat to validity).
- 2 file còn relative import trong thân hàm (PY-001, PY-060) — chết khi chạm nhánh đó.

Danh sách đầy đủ từng file + tên thiếu: chạy `scan_undefined.py` (hỏi RW) hoặc xem log buổi kiểm 03/07.

## Nhóm cần chốt 1 trong 2 hướng (trước khi Hải sinh test mới)

- **A. Vá tiếp data:** thêm import thật / stub cho từng tên thiếu. Ưu: giữ pipeline hiện tại. Nhược: ~40 file × nhiều tên, dễ sai, stub ảo làm méo mutation score.
- **B. Đo trong ngữ cảnh module thật:** cài flask/requests (commit pin) vào env đo, test import từ module thật thay vì `solution.py`. Ưu: đo đúng bản chất. Nhược: sửa `measure_python.py` + prompt phải đổi lại import theo module thật.

> Lưu ý: hướng B mâu thuẫn với prompt fix hiện tại của LR (bắt `from solution import`) — chọn hướng nào thì prompt + harness phải đi cùng nhau. Quyết định này ảnh hưởng trực tiếp validity của RQ1/RQ2, nên ghi vào notes.md + báo GV nếu đổi thiết kế đo.

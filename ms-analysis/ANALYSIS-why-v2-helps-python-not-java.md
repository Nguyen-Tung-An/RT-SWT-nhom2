# Đặc tả mục tiêu sửa được *tên*, không sửa được *kiểu*

Cùng một thay đổi prompt (thêm khối `### Target ###`: tên đầy đủ, chữ ký, lớp chủ, và một
lời gọi constructor **đã chạy thật**), hai ngôn ngữ phản ứng ngược nhau.

## Số liệu

| | v1 | v2 | giao nhau | diễn giải |
|---|---:|---:|---:|---|
| **Java** — không biên dịch được | 39 | 39 | **36/39** | gần như **không đổi gì** |
| **Python** — collect-fail | 17 | **4** | 3 | **cứu được 14**, làm hỏng mới 1 |

Java: chỉ 3 hàm đổi mỗi chiều (`CJ-023, CJ-035, CJ-059` ↔ `CJ-022, CJ-037, CJ-057`) —
mức nhiễu, không phải hiệu ứng.

## Vì sao ngược nhau

Khối `### Target ###` cung cấp **định danh**: tên đủ điều kiện, module/lớp chủ, chữ ký,
cách dựng receiver.

- **Python** kiểm tra định danh **lúc chạy**. Rào cản ở tầng đó *chính là* định danh:
  import sai tên module, gọi hàm không tồn tại, gọi method trên lớp sai. Cấp đúng định
  danh thì rào cản biến mất → 17 → 4.
- **Java** kiểm tra định danh **và kiểu** lúc biên dịch. Định danh đúng rồi vẫn phải sinh
  ra lời gọi **đúng kiểu** cho toàn bộ API xung quanh: đúng số/kiểu tham số của
  constructor, đúng kiểu trả về, đúng exception phải khai báo, đúng generic. Đặc tả mục
  tiêu không chạm tới phần đó → 39 → 39.

Nói gọn: **đặc tả mục tiêu giải quyết bài toán *địa chỉ*, không giải quyết bài toán
*kiểu*.** Python ở tầng này chỉ có bài toán địa chỉ nên được lợi gần như trọn vẹn; Java có
cả hai nên gần như không được lợi gì.

## Hệ quả cho kết luận của bài

Điều này khớp với và giải thích được kết quả tách đôi ở Python (RQ-B): T3 (chạm đích) cải
thiện **có ý nghĩa** (29→42, p=0.003) còn T4 (phát hiện lỗi) thì **không** (16→22,
p=0.33). Chạm được đích là bài toán địa chỉ. Phát hiện được lỗi thì phải **dựng đúng
trạng thái receiver rồi khẳng định đúng hành vi** — không phải bài toán địa chỉ.

Ba tầng rào cản, xếp theo thứ tự, cùng một câu chuyện cho cả hai ngôn ngữ:

1. **địa chỉ** — gọi đúng thứ cần gọi → đặc tả mục tiêu sửa được
2. **kiểu** — gọi cho đúng kiểu (chỉ Java) → đặc tả mục tiêu **không** sửa được
3. **trạng thái** — dựng được receiver ở đúng trạng thái để hành vi lộ ra → **không** sửa
   được bằng prompt ở dạng đã thử

Python `khong co test xanh (per-test)` giữ nguyên 13 → 14 qua hai điều kiện (giao 7): sửa
xong tầng 1 thì lộ ra tầng 3, chứ tầng 3 không nhỏ đi.

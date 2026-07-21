# Kế hoạch tập held-out — biến prompt cải thiện thành kết quả hợp lệ

## Vấn đề cần giải

Prompt v2/v3/v4 được thiết kế bằng cách **quan sát chính 120 hàm đó hỏng ở đâu** rồi thêm
đúng thông tin để sửa (import sai → thêm class; chết ở `__init__` → thêm constructor).
Nên con số cải thiện (Python T4 13→23) **thiên lệch lạc quan**: 120 hàm vừa là tập
*tinh chỉnh* prompt, vừa là tập *báo cáo* kết quả.

Đây **không phải HARKing** (RQ không đổi, vẫn one-shot) — mà là **overfitting lên tập
đánh giá**. Cách sửa chuẩn của ML: tách tập *phát triển* khỏi tập *kiểm tra*.

## Nguyên tắc train/dev/test

| Tập | Vai trò | Là gì |
|---|---|---|
| **DEV** (đã có) | Nơi prompt được tinh chỉnh | **120 hàm gốc** — đã dùng để chẩn đoán lỗi và thiết kế v2/v3/v4 |
| **TEST** (cần crawl) | Nơi báo cáo kết quả | **Tập hàm MỚI**, cùng tiêu chí, prompt **chưa từng thấy** |

Prompt v2/v3/v4 phải **đóng băng TRƯỚC** khi chạy trên TEST. Không được nhìn kết quả TEST
rồi chỉnh prompt lần nữa — nếu chỉnh, TEST lại thành DEV và mất tính hợp lệ.

## Thiết kế tập TEST

### Tiêu chí — GIỮ NGUYÊN của dự án gốc (không đổi để so được)
- Cyclomatic Complexity **5–10**, đo bằng **Lizard 1.23.0**
- Ngôn ngữ: Java + Python, cân bằng
- Repo pin commit, có provenance (URL + license + hash)
- Cùng cách lọc INVALID, cùng 4 tầng đo

### Cỡ mẫu
| | Số hàm | Lý do |
|---|---:|---|
| Tối thiểu | **30/ngôn ngữ (60 tổng)** | đủ cho Wilcoxon ghép cặp có power; bằng nửa tập gốc |
| Lý tưởng | 60/ngôn ngữ (120 tổng) | bằng tập gốc, so sánh trực tiếp phân phối |

Bắt đầu **60 tổng** (30+30) — vừa đủ kết luận, vừa không tốn quá nhiều API/thời gian.

### Nguồn hàm mới — hai lựa chọn

**Phương án A — hàm mới từ CHÍNH 10 repo cũ (khuyến nghị, rẻ)**
- 10 repo đã clone, đã pin commit, đã build. Chỉ cần lấy hàm CC 5–10 **chưa nằm trong 120**.
- Mỗi repo còn nhiều hàm đủ điều kiện chưa lấy.
- Ưu: môi trường sẵn sàng, provenance giữ nguyên. Nhược: cùng codebase → ít đa dạng.

**Phương án B — repo MỚI hoàn toàn (mạnh hơn, tốn hơn)**
- Thêm 2–4 repo OSS mới cùng hệ sinh thái (vd Java: `commons-lang`, `guava`; Python:
  `click`, `httpx`).
- Ưu: chứng minh prompt tổng quát hoá sang codebase khác. Nhược: phải clone/pin/build mới.

→ **Làm A trước** (nhanh, đủ trả lời câu hỏi chính). Nếu reviewer đòi tổng quát hoá thì bổ sung B.

## Các điều kiện so sánh — chạy TẤT CẢ trên tập TEST

| Điều kiện | One-shot? | Vai trò |
|---|---|---|
| **v1** (prompt gốc) | ✅ | baseline — tái lập kết quả bài hiện tại trên tập mới |
| **v3/v4** (prompt cải thiện) | ✅ | câu hỏi chính: đặc tả mục tiêu tốt hơn có giúp không |
| v3 + repair loop | ❌ (nhiều vòng) | so sánh phụ: vòng phản hồi thêm được bao nhiêu |

## Đo bằng bộ 4 tầng đã có

Dùng nguyên `mutation_on_target.py` (Python) + `mutation_java.py` (Java) + `check_java_compile.py`.
Báo cáo **T4 (mutation chạm đích)** là chính — tầng không lách được. Kèm T1/T2/T3.

## Câu hỏi nghiên cứu cho bài follow-up

> **RQ-A:** Cung cấp đặc tả mục tiêu đầy đủ (tên đủ điều kiện, chữ ký, constructor đã
> kiểm chứng, cách truy cập) trong một lần gọi có nâng tỷ lệ test hợp lệ & hiệu quả của
> GPT-4o-mini trên code CC 5–10 không?
>
> **RQ-B:** Vòng phản hồi sửa lỗi thêm được bao nhiêu so với chỉ cải thiện prompt one-shot?
>
> **RQ-C:** Cải thiện tập trung ở nhóm lỗi nào (định danh mục tiêu vs dựng trạng thái vs
> hành vi), và nhóm nào prompt/repair KHÔNG chạm được?

Cả ba đều dự đoán **trước** khi chạy TEST → không HARKing, không overfitting.

## Điều gì làm nó hợp lệ (checklist chống thiên lệch)

- [ ] Prompt v2/v3/v4 **đóng băng** (commit, ghi hash) trước khi crawl TEST
- [ ] Tập TEST crawl bằng **đúng script tiêu chí** của tập gốc (Lizard 5–10, pin commit)
- [ ] Không hàm nào của TEST trùng 120 hàm DEV (kiểm tra bằng `func_name`+`file`+`start_line`)
- [ ] Chạy TEST **một lần**, không chỉnh prompt sau khi thấy số
- [ ] Báo cáo **cả v1 lẫn v3/v4** trên TEST cạnh nhau (không giấu baseline)
- [ ] Ghi rõ: DEV dùng để phát triển prompt, TEST dùng để báo cáo — trong Method

## Quan hệ với bài hiện tại

- **Bài hiện tại (one-shot v1) KHÔNG đổi** — giữ nguyên, đã bảo vệ. v1 vẫn là baseline.
- Bài follow-up **thêm** TEST + prompt cải thiện. Đây là **đóng góp mới**, không phải sửa
  lén số bài cũ.
- Hai bài bổ trợ nhau: bài 1 = "one-shot thất bại thế nào & vì sao"; bài 2 = "vá được
  bao nhiêu, nút nào không vá được".

## Ước lượng công sức

| Việc | Thời gian |
|---|---|
| Crawl + lọc CC 60 hàm mới (phương án A) | ~2–3h (script mine đã có) |
| Sinh test v1 + v3/v4 trên 60 hàm (~$0.10 API) | ~30 phút |
| Đo 4 tầng | ~1–2h (harness đã có) |
| Phân tích + viết | tuỳ nhóm |

Toàn bộ hạ tầng (mine, sinh, đo) **đã có sẵn** từ phiên audit — chỉ cần trỏ vào tập hàm mới.

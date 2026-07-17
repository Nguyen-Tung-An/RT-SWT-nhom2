# Luyện vấn đáp — xếp theo RỦI RO (khả năng bị hỏi × độ yếu của nhóm)

**Ngày:** 2026-07-17. Bổ sung cho `kich-ban-bao-ve-chi-tiet.md`.
Luyện từ TRÊN xuống. Số liệu dưới đây đã đối chiếu sau audit — **không nói theo số cũ**.
Mỗi câu ghi: bẫy · người trả lời chính · câu mẫu (nói gọn, không đọc).

---

## #1 — "Kết quả tệ vậy, nhóm fail à?" 🔴 DỄ HỎI NHẤT
**Bẫy:** trả lời kiểu xin lỗi/nhận sai = tự bắn vào chân. Đây KHÔNG phải nhóm fail.
**Ai:** Ân (PL) mở, ai cũng phải thuộc.
> "Không ạ. Câu hỏi khoa học của bọn em là 'LLM one-shot có đạt ngưỡng không', và câu
> trả lời 'KHÔNG, và đây là cơ chế vì sao' là một kết quả đầy đủ. Bọn em không đi tìm
> số đẹp — bọn em đo trung thực và phát hiện được 2 kiểu lỗi khác nhau ở 2 ngôn ngữ,
> điều chỉ thấy được vì đo trong project thật. Đó mới là đóng góp."

## #2 — "Cho xem log/dữ liệu gốc chứng minh đi" 🔴 NGUY HIỂM NHẤT (dễ hỏi + nhóm yếu)
**Bẫy:** 2 chỗ chưa có artefact — log Pynguin gốc (câu dill/_json) + raw per-test RQ4/RQ5
(233/267/682, hiện chỉ trong Excel). **Việc cần làm TRƯỚC:** Phúc commit 2 file này.
**Ai:** Phúc (MS) / Lộc (Java).
> "Số liệu chính từng hàm ở `metrics_full.csv` (240 dòng) và `summary_8lib.csv`, em mở
> ngay được. [Nếu hỏi Pynguin/per-test:] Log chi tiết đó bọn em đang bổ sung nốt vào
> repo — hiện tổng hợp trong file Excel `final_metrics_export.xlsx`, em cho thầy/cô xem
> sheet tương ứng." → KHÔNG bịa "có log" nếu chưa commit; nói thẳng đang bổ sung.

## #3 — "Python dùng 2 công cụ mutation khác nhau — so sánh RQ2-B có công bằng không?" 🟠
**Bẫy:** đây là điểm yếu phương pháp THẬT. Đừng giấu — bài đã khai báo là threat.
**Ai:** Phúc (MS).
> "Đúng ạ, đây là hạn chế bọn em chủ động khai báo trong Threats. Test GPT đo bằng
> mutmut 2.4.4, test Pynguin đo bằng engine AST tự viết — 2 operator set khác nhau nên
> RQ2-B Python là so chéo công cụ. Nhưng cả hai cùng bắt buộc green-on-original và cùng
> cắt theo khoảng dòng hàm; và vì Pynguin coverage trên dataset này là 0.0%, hướng kết
> luận không phụ thuộc chọn công cụ. Java thì không dính — PIT chấm cả 2 arm."

## #4 — "Java effective chỉ n=5 mà kết luận r=−1.00, tin được không?" 🟠
**Bẫy:** n nhỏ là thật. Đừng cãi là "đủ lớn".
**Ai:** Phúc (MS).
> "Bọn em thừa nhận n effective nhỏ (5–28 mỗi ô), riêng Java RQ1/RQ3 chỉ n=5 — đã ghi
> ở Threats là point estimate mang tính chỉ báo, không phải chính xác. Nhưng r=−1.00
> nghĩa là EvoSuite/Randoop thắng MỌI cặp có khác biệt, hướng rất nhất quán. Và con số
> quan trọng hơn là mức 'all' (n=60/ngôn ngữ) median 0% — cái đó không phụ thuộc n nhỏ."

## #5 — "RQ4/RQ5 thêm sau khi thấy kết quả — có phải HARKing không?" 🟠
**Bẫy:** phải trả lời CHÍNH XÁC, không mơ hồ. Nhóm KHÔNG yếu chỗ này nếu nói đúng.
**Ai:** Lộc (RW) / Ân.
> "Bọn em khai báo rõ RQ4/RQ5 là exploratory post-hoc — ý tưởng nảy SAU khi có N=120.
> Chính vì thế bọn em (1) tách hẳn khỏi RQ1–3 confirmatory, (2) ghi kết quả vào thư mục
> và file riêng, N=120 gốc không bị đè, (3) chạy đúng 1 lần theo cam kết trước, (4) báo
> cả kết quả xấu — Python repair còn tệ đi, bọn em không giấu. Gộp nó vào RQ chính thức
> mới là HARKing; tách ra và khai báo là chống HARKing."

## #6 — "Sao dùng gpt-4o-mini chứ không gpt-4o?" 🟡
**Ai:** Hải (LR) / Ân.
> "Ràng buộc quyền truy cập API: account của nhóm không có gpt-4o khi chạy thực nghiệm.
> Bọn em ghi thành amendment v1.1 (soạn 28/06, chốt 02/07) — cả hai đều TRƯỚC full run,
> nên không phải chọn model sau khi thấy kết quả. Và gpt-4o-mini cũng được đánh giá độc
> lập trong literature bọn em review, nên vẫn nằm trong nền bằng chứng. Kết quả chỉ đại
> diện cho gpt-4o-mini — đã ghi ở External Validity, không suy rộng cho gpt-4o."

## #7 — "Paper Kumar 99.05% — nguồn ở đâu?" 🟡 (dễ yếu nếu chưa chuẩn bị)
**Bẫy:** metadata bib đáng ngờ, chưa có PDF. **Việc TRƯỚC:** Kim chuẩn bị PDF gốc.
**Ai:** Kim (DG).
> "Số đó lấy từ bảng evidence table nhóm tổng hợp ở RBL-1/2; em có [PDF/bản ghi] để
> đối chiếu ạ." → Nếu CHƯA có PDF: "Em xin phép bổ sung nguồn chính xác sau buổi này."
> KHÔNG khẳng định chắc nếu chưa cầm PDF trong tay.

## #8 — "Ngưỡng 80%/60% ở đâu ra, có tự đặt sau khi thấy số không?" 🟡
**Ai:** Ân / Lộc.
> "Chốt trong proposal TRƯỚC khi có bất kỳ data nào. 80% là mốc adequacy hay được trích
> dẫn trong industry; 60% đặt cố ý TRÊN dải ~34% mutation mà literature báo cho test LLM
> (Konstantinou 33.82%, TestForge 33.8%). Còn có ngưỡng RQ3 đăng ký là ρ<−0.5 — kết quả
> ρ dương nên fail ngay từ dấu. Tất cả pre-registered, có trong amendment."

## #9 — "Randoop là search-based à?" 🟡 (câu bẫy — dễ nếu biết)
**Ai:** ai cũng phải biết.
> "Không ạ — Randoop là feedback-directed RANDOM testing. Chỉ EvoSuite mới là search-based
> (genetic). Khi gộp cả hai bọn em gọi là 'automated baselines', không gọi search-based."

## #10 — "Bài này có dùng AI viết không?" 🟡 (chắc chắn bị hỏi — trả lời THẲNG)
**Ai:** Ân (PL).
> "Có, và bọn em khai báo minh bạch trong mục AI Use Disclosure của bài. Bản nháp kỹ
> thuật có hỗ trợ AI; các phần chính do từng thành viên tự viết lại bằng lời mình — bọn
> em có log AI-check từng section (`ai_check_log.md`, đều 0–5% trên 3 công cụ độc lập) và
> đối chiếu mọi số liệu với dữ liệu gốc. Không giấu, không lách."

---

## Câu XOÁY phụ (ít gặp hơn, nhưng chuẩn bị)

- **"3 ô mutation thiếu là gì?"** → JA-017 (jfreechart) + JA-048/JA-058 (jsoup): PIT
  không sinh mutant trong khoảng dòng hàm → N/A hợp lệ, báo missing thay vì impute 0.
  **KHÔNG nói "Minion crash"** (số cũ sai). Phúc/Lộc.
- **"Chi phí bao nhiêu?"** → "$1 là budget đăng ký; thực chi dưới đó rất xa (~$0.05)." Hải.
- **"JDK nào chạy EvoSuite?"** → hỗn hợp: JDK 11 cho 39 hàm, JDK 8 cho 21 hàm
  (csv/gson/joda chết runtime trên 11). Lộc.
- **"Sao flask nhiều hàm hơn requests?"** → 48/60, hệ quả cấu trúc 2 project; không
  resample sau khi đã đo; khai báo threat External Validity. Kim.
- **"Tái lập được không?"** → pipeline ĐO không ngẫu nhiên (pinned commit + snapshot +
  temp 0). Sinh test của EvoSuite/Randoop/Pynguin là stochastic, nhưng suite đã sinh lưu
  trong repo → đo lại từ suite tái lập được. Lộc/Phúc.

---

## Nguyên tắc chung khi bị hỏi khó (dán lên tường)

1. **Kết quả âm ≠ nhóm fail.** Nói với sự tự tin, không xin lỗi.
2. **Chưa có artefact thì nói "đang bổ sung", KHÔNG bịa "có rồi".**
3. **Điểm yếu đã khai báo trong bài** (2 instrument, n nhỏ) → chỉ vào chỗ đã ghi, đừng
   giấu — "bọn em chủ động khai báo ở Threats" là câu mạnh.
4. **Đoạn kể trải nghiệm** ("lần đầu bọn em thấy...", "bọn em kiểm tra pipeline...") →
   đúng người trực tiếp làm trả lời, không ai đóng thế.
5. **Số đã sửa sau audit** (Minion crash, +36.84 median diff, TestForge, Randoop) →
   tuyệt đối không lỡ miệng nói theo bản cũ. Xem mục 6 `kich-ban-bao-ve-chi-tiet.md`.

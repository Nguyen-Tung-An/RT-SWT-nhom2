# Bộ khung tự viết lại Abstract (cho Lộc)

**Cách dùng (quan trọng — làm đúng thứ tự):**
1. Đọc kỹ 8 ý dưới đây cho đến khi hiểu, KHÔNG mở file abstract cũ.
2. Viết 8 ý thành ~8–12 câu tiếng Anh **bằng lời của mình**, theo trí nhớ.
   Văn không cần bóng bẩy — câu ngắn, chắc, đúng số liệu là đạt.
3. Viết xong mới mở bản cũ đối chiếu: chỉ kiểm tra SỐ LIỆU, không copy câu chữ.
4. Đưa Claude đối chiếu lần cuối (kiểm tra số liệu + ngữ pháp, không viết hộ).
5. Scan lại Copyleaks (1 credit) và ghi kết quả vào `ai_check_log.md`.

---

## 8 ý bắt buộc phải có (đúng thứ tự logic)

1. **Bối cảnh / khoảng trống:** LLM đang được đề xuất cho việc sinh unit test,
   nhưng đa số đánh giá hiện có dùng benchmark đơn giản, được tuyển chọn sẵn,
   và không kiểm soát độ phức tạp cấu trúc (cyclomatic complexity) của code.

2. **Thiết kế nghiên cứu:** đo khả năng one-shot "nguyên bản" (không retrieval,
   không repair) của gpt-4o-mini trên **120 hàm thực tế** (60 Java, 60 Python),
   **CC 5–10**, lấy từ **10 repository open-source** (pinned commit), đo **bên trong
   project gốc**. Baseline: **EvoSuite + Randoop** (Java), **Pynguin** (Python).
   Metric: **branch coverage + mutation score**. Thống kê non-parametric, **α = 0.05**.

3. **Kết quả toàn mẫu (N=120):** median branch coverage = **0%**,
   median mutation score = **0%**.

4. **Tập effective (compile được + gọi đúng target): 28/120 (23.3%)** —
   median coverage **75.0%** (dưới ngưỡng 80%);
   mutation **36.84%** (Python) / **0%** (Java) (dưới ngưỡng 60%).

5. **So với baseline:** thua cả EvoSuite lẫn Randoop với **r = −1.00** (mỗi so sánh);
   "thắng" Pynguin nhưng CHỈ vì Pynguin tự lỗi trên dataset này
   (median coverage **0.0%**) — không phải vì LLM mạnh.

6. **Tương quan CC–chất lượng trong dải 5–10:** không có ý nghĩa thống kê.
   Hiệu ứng chi phối là kết cục **nhị phân** compile/wrong-target,
   không phải suy giảm dần theo độ phức tạp.

7. **Java và Python fail theo 2 cách khác nhau:** Python chủ yếu lỗi
   **import lúc compile**; Java chủ yếu **gọi nhầm method âm thầm**
   (silent wrong-method resolution). Chỉ nhìn thấy điều này vì đo trên
   project thật thay vì hàm bị tách rời.

8. **Kết luận:** one-shot LLM chưa thay thế được search-based tools trên code
   thực độ phức tạp trung bình — và điều này lý giải vì sao cả lĩnh vực đang
   chuyển sang pipeline có feedback / context-augmentation.

---

## Thuật ngữ GIỮ NGUYÊN (đừng né — né là sai chuyên môn)

branch coverage, mutation score, cyclomatic complexity (CC), one-shot,
large language model / LLM, unit-test generation, EvoSuite, Randoop, Pynguin,
gpt-4o-mini, non-parametric, rank-biserial r, median

## Cụm văn phong TRÁNH copy từ bản nháp cũ (Copyleaks đã flag)

- "generation is one of the tasks ... increasingly proposed for"
- "evaluations rely on"
- "The headline number is stark"
- "Even the most favourable slice of the data"
- "loses decisively"

(Tránh = tự diễn đạt khác đi theo giọng mình, KHÔNG phải bỏ nội dung.)

## Bản tiếng Việt hoàn chỉnh (để tự dịch sang tiếng Anh)

> **Cách dùng bản này:** đọc hiểu từng câu, rồi TỰ DỊCH TAY sang tiếng Anh
> bằng vốn từ của mình. **KHÔNG dùng Google Translate / DeepL / ChatGPT để dịch**
> — máy dịch ra vẫn là văn máy (detector vẫn bắt), và thường dịch sai thuật ngữ.
> Các thuật ngữ in nghiêng giữ nguyên tiếng Anh khi dịch.

Sinh unit test tự động là một trong những ứng dụng mà các mô hình ngôn ngữ lớn
(*LLM*) ngày càng được đề xuất, nhưng phần lớn đánh giá hiện có dựa trên các
benchmark đơn giản, được tuyển chọn sẵn, và không kiểm soát độ phức tạp cấu trúc
của code cần kiểm thử. Trong nghiên cứu này, chúng tôi đo trực tiếp năng lực
*one-shot* nguyên bản của *gpt-4o-mini*: 120 hàm thực tế (60 Java, 60 Python) có
độ phức tạp cyclomatic trung bình (5 ≤ CC ≤ 10), lấy từ 10 repository mã nguồn
mở đã ghim commit, và đo ngay bên trong project gốc; đối chứng với các baseline
tự động (*EvoSuite* và *Randoop* cho Java; *Pynguin* cho Python) trên hai thước
đo *branch coverage* và *mutation score*, dùng kiểm định thống kê phi tham số
(α = 0.05) xuyên suốt.

Kết quả tổng quát rất rõ: trên toàn bộ mẫu (N = 120), median *branch coverage*
và median *mutation score* đều bằng 0%. Ngay cả lát cắt thuận lợi nhất — 28/120
(23.3%) bộ test thực sự biên dịch được và chạm đúng hàm mục tiêu — cũng chỉ đạt
median coverage 75.0% (dưới ngưỡng 80%) và median mutation 36.84% cho Python,
0% cho Java (đều dưới ngưỡng 60%). Khi so cặp với baseline, gpt-4o-mini thua cả
hai công cụ search-based trên Java (*rank-biserial* r = −1.00 với cả EvoSuite
lẫn Randoop); với Pynguin thì thắng trên danh nghĩa, nhưng chỉ vì bản thân
Pynguin lỗi trên dataset này (median coverage 0.0%), chứ không phải vì LLM làm
tốt.

Trong dải CC 5–10 được lấy mẫu, độ phức tạp và chất lượng test không có tương
quan có ý nghĩa thống kê — hiệu ứng chi phối là kết cục nhị phân
biên-dịch/gọi-nhầm-target, chứ không phải suy giảm dần theo độ phức tạp. Java và
Python thất bại theo hai cách hoàn toàn khác nhau: Python chủ yếu do lỗi import
lúc biên dịch, Java chủ yếu do gọi nhầm method một cách âm thầm — khác biệt chỉ
nhìn thấy được nhờ đo trên code project thật thay vì hàm bị tách rời. Tổng hợp
lại, kết quả cho thấy sinh test một lượt bằng LLM, không kèm retrieval hay vòng
repair, chưa thể thay thế công cụ search-based trên code thực tế độ phức tạp
trung bình — và điều đó lý giải trực tiếp vì sao lĩnh vực này đang dịch chuyển
sang các pipeline sinh test có feedback và bổ sung ngữ cảnh.

---

## Checklist số liệu sau khi viết xong (tick từng ô)

- [ ] 120 hàm = 60 Java + 60 Python, CC 5–10, 10 repo pinned
- [ ] Median toàn mẫu: coverage 0%, mutation 0%
- [ ] Effective: 28/120 = 23.3%
- [ ] Effective coverage 75.0% (ngưỡng 80%)
- [ ] Effective mutation: 36.84% Python, 0% Java (ngưỡng 60%)
- [ ] r = −1.00 với cả EvoSuite và Randoop
- [ ] Pynguin median coverage 0.0%
- [ ] α = 0.05

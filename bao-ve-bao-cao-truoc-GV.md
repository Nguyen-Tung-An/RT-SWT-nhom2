# Chuẩn bị bảo vệ báo cáo trước GV — vì sao kết quả thấp, chứng minh bằng gì

**Mục đích:** tài liệu này giúp trả lời 3 câu hỏi GV nhiều khả năng sẽ hỏi:
(1) tại sao kết quả tệ, (2) bằng chứng đâu, (3) đã chạy thực nghiệm thế nào.

---

## 0. Câu trả lời 1 câu (nói trước, chi tiết sau)

> "GPT-4o-mini one-shot không đạt ngưỡng vì nó thiếu ngữ cảnh cấu trúc code thật —
> không phải vì code sai hay đo sai. Chúng tôi đã chứng minh điều này bằng thực
> nghiệm (RQ4/RQ5), không chỉ suy đoán, và kết quả khớp với các nghiên cứu khác
> đã công bố (Haratian et al. 2026, Sapozhnikov et al. 2024)."

---

## 1. Nguyên nhân — 2 lớp lỗi độc lập chồng lên nhau (không dùng số % — dễ bị hỏi vặn)

**Lưu ý khi trình bày:** tránh nói kiểu "prompt chiếm 50% nguyên nhân" — GV có thể hỏi
vặn "vậy sửa prompt xong sao vẫn không đạt ngưỡng?" (đúng câu hỏi Lộc vừa đặt ra). Cách
trình bày đúng hơn: có **2 tầng lỗi tách biệt**, sửa được tầng 1 (một phần) không có
nghĩa là giải quyết được tầng 2.

### 1.1 Tầng 1 — Sai cấu trúc (gọi nhầm hàm / import sai): SỬA ĐƯỢC MỘT PHẦN bằng prompt
**Cơ chế:** one-shot prompt chỉ đưa GPT đoạn source của **1 hàm trích rời**, không cho
thấy toàn bộ class/module thật. GPT phải đoán tên method/import, và đôi khi đoán trúng
**1 method khác có thật** cùng tên nhưng không phải hàm mục tiêu. Đây là loại lỗi chiếm
**số lượng ca nhiều nhất** (46/60 Java no-touch, 23/28 Python ImportError).

**Bằng chứng cụ thể (show trực tiếp cho GV):**
- `data/java_functions/JA-002.java` (hàm mục tiêu: `CommandLine.Builder::getOptionValues`)
  so với `generated_tests/gpt4o/java/JA-002_Test.java` (GPT gọi `commandLine.getOptionValues()`
  — method THẬT nhưng thuộc `CommandLine`, không phải `CommandLine.Builder`).
- **Bằng chứng thực nghiệm:** RQ4 — khi thêm class skeleton thật vào prompt, tỷ lệ
  effective Java tăng gấp đôi (8.3%→18.3%), rồi RQ5 tăng tiếp lên 25.0%. Đây là **thí
  nghiệm có đối chứng** (cùng 60 hàm, chỉ đổi 1 biến là prompt), không phải suy luận.
- **Nhưng chỉ "một phần":** effective rate tăng gấp 3 lần, KHÔNG nhảy lên gần 100% —
  nghĩa là có context vẫn không đảm bảo GPT dùng đúng (context là điều kiện cần, không
  đủ). Đây là bằng chứng cho việc không nên nói "sửa prompt sẽ hết vấn đề này".

### 1.2 Tầng 2 — Sai suy luận hành vi runtime: KHÔNG sửa được bằng prompt
**Bằng chứng:** mutation score đứng yên ở 0% xuyên suốt 3 giai đoạn (gốc→RQ4→RQ5), dù
effective rate (tầng 1) đã cải thiện. Ví dụ `flask.logging.has_level_handler`: GPT hiểu
sai cách logger hierarchy hoạt động — **lỗi giống hệt** ở cả bản có context lẫn không có
context. Đây là giới hạn hiểu **hành vi thật của code**, không phải thiếu thông tin cấu
trúc — không có prompt nào sửa được bằng 1 lần gọi, cần model mạnh hơn hoặc kiến trúc
khác hẳn (multi-agent, nhiều vòng lặp).

**Kết luận khi trình bày:** khoảng cách tới ngưỡng 80%/60% không đến từ 1 nguyên nhân
đơn — dù sửa tối đa tầng 1 (prompt), tầng 2 (model) vẫn giữ nguyên, nên kết quả tổng
thể không thể vượt ngưỡng chỉ bằng kỹ thuật prompt. Đây chính là phát hiện có giá trị
của RQ4/RQ5, không phải thất bại của việc thử nghiệm.

### 1.3 Ngoài 2 tầng lỗi trên — 2 yếu tố bối cảnh cần nêu riêng (không phải "nguyên nhân lỗi")

**Do thiết kế dữ liệu (chủ đích, không phải điểm yếu):** dataset đo **trong repo thật**
(Apache Commons, Gson, Flask), không phải hàm cô lập như HumanEval/TestEval. Đây là lý
do số liệu thấp hơn các paper dùng benchmark cô lập (98% coverage) — literature nhóm
review (GAP-T) đã dự đoán đúng điều này trước khi có kết quả.

**Do artifact công cụ đo (đã phát hiện, cô lập riêng, không lẫn vào kết luận chính):**
- Python "compiled" nhị phân (cả file phải pass 100%) khiến RQ4 trông tệ hơn thật
  (11.7% vs thực chất 33.3% nếu đếm từng test case).
- Pynguin baseline = 0% do Python 3.14 không tương thích (đã fix 1 phần bằng venv 3.10).
- 3/60 ô mutation baseline không có số (JA-017 jfreechart + JA-048/JA-058 jsoup):
  PIT không sinh được mutant nào trong khoảng dòng của hàm ở CẢ 2 tool → N/A hợp lệ,
  loại khỏi phân tích mutation thay vì impute 0. (Sửa 2026-07-17: bản cũ ghi nhầm
  "jfreechart PIT crash JA-005/JA-035/JA-007" — sai với metrics_full.csv, JA-005 có
  ms=86.59.)

---

## 2. Khi GV hỏi "chứng minh bằng cách nào" — show đúng file/bằng chứng này

| GV hỏi | Show cái gì | Ở đâu |
|---|---|---|
| "Sao biết là do prompt, không phải code nhóm sai?" | Ví dụ JA-002 side-by-side + kết quả RQ4 (effective rate tăng gấp đôi khi đổi ĐÚNG 1 biến prompt) | `05_discussion.tex` §RQ4, `generated_tests/gpt4o/java/JA-002_Test.java` |
| "Có đo sai không?" | Threats to Validity — liệt kê rõ 2 bug hạ tầng đã tìm và sửa (không giấu), cách khác biệt với lỗi LLM | `06_threats.tex` §Construct Validity |
| "Kết quả này có phải chỉ nhóm mình gặp không?" | Bảng so sánh với Haratian et al. (63% compile error), Sapozhnikov et al. (>50% malformed) | `02_related.tex` §2.2, `05_discussion.tex` |
| "Đã thử cải thiện chưa?" | RQ4 (context) + RQ5 (repair), cả 2 kết quả thật (kể cả Python bị tệ đi ở RQ5 — không giấu) | `05_discussion.tex` §RQ4/§RQ5 |
| "Số liệu này có đáng tin không?" | File Excel tổng hợp, công thức đối chiếu đã kiểm chứng bằng Excel COM, không hardcode | `ms-analysis/results/final_metrics_export.xlsx` |
| "Có tự nghĩ ra ngưỡng/tiêu chí sau khi thấy kết quả không (HARKing)?" | 2 amendment (v1.1 đổi model, v1.2 đổi dataset) đều ký **trước** full run, có ngày tháng rõ ràng; RQ4/RQ5 khai báo rõ là exploratory/post-hoc, không thay RQ1-3 | `ms-analysis/proposal-amendment-v1.1.md`, `v1.2.md` |

---

## 3. Trình bày quy trình chạy thực nghiệm (kể theo trình tự, dễ theo dõi)

**Bước 1 — Chốt thiết kế trước khi chạy (chống HARKing):**
Đăng ký RQ1-3, ngưỡng (80% coverage / 60% mutation), test thống kê (Wilcoxon, Spearman,
α=0.05) từ proposal ban đầu. 2 lần điều chỉnh (model → gpt-4o-mini do giới hạn quyền truy
cập API; dataset → mine trực tiếp 10 repo pin thay vì Defects4J+CodeXGLUE) đều có văn bản
amendment ký **trước** khi chạy full experiment, không phải sửa sau khi thấy số.

**Bước 2 — Sinh test (Hải):** gọi API `gpt-4o-mini-2024-07-18`, one-shot (1 ví dụ mẫu),
temperature=0, cho 120 hàm (60 Java + 60 Python).

**Bước 3 — Đo lường (Phúc: Python, Lộc: Java):**
- Java: Maven + JaCoCo (coverage) + PIT (mutation), đo **trong chính repo thật** (không
  cô lập hàm), cô lập từng hàm/lần chạy để 1 lỗi compile không làm oan hàm khác.
- Python: coverage.py + AST-mutation tự viết, đo trong module đã cài editable, bắt buộc
  green-check trước khi tính mutation (tránh "giết mutant giả" trên suite đã fail sẵn).
- Baseline: EvoSuite/Randoop (Java, 60s budget), Pynguin (Python, 90s budget, DYNAMOSA).

**Bước 4 — Thống kê:** Wilcoxon một mẫu (RQ1/RQ2 ngưỡng), Wilcoxon cặp (RQ2 so baseline),
Spearman (RQ3), báo cáo cả 2 mức "all" (N=60/ngôn ngữ, mặc định 0% nếu invalid) và
"effective" (chỉ tính suite chạy đúng), tránh chỉ khoe số đẹp.

**Bước 5 — Phát hiện kết quả thấp, KHÔNG dừng ở đó:** thay vì chỉ báo cáo số, nhóm truy
nguyên nhân gốc (đọc log lỗi thật, không suy diễn) → phát hiện 2 kiểu lỗi khác nhau ở
2 ngôn ngữ (Java: gọi nhầm hàm; Python: import sai).

**Bước 6 — Kiểm chứng giả thuyết nguyên nhân bằng thực nghiệm (RQ4/RQ5):** thử đúng 2
kỹ thuật cải thiện (context, feedback loop), làm 1 lần, báo cáo trung thực dù kết quả
tốt hay xấu, rồi dừng — không tiếp tục thử đến khi ra số đẹp (tránh p-hacking).

---

## 4. Câu hỏi GV có thể hỏi thêm — trả lời mẫu

**Q: "Sao không dùng gpt-4o thật thay vì mini?"**
A: Giới hạn quyền truy cập API tại thời điểm chạy (amendment v1.1, ký trước full run).
Đây cũng là biến số đã ghi rõ trong Threats to Validity — kết quả chỉ đại diện cho
gpt-4o-mini, không suy rộng cho gpt-4o.

**Q: "Tại sao không thử thêm kỹ thuật khác để đạt ngưỡng?"**
A: Chủ động dừng sau 2 kỹ thuật (context + repair) theo nguyên tắc chống HARKing/
optional-stopping — cứ thử đến khi ra số đẹp thì không còn là bằng chứng khoa học,
chỉ là số ăn may trên đúng 120 hàm này.

**Q: "Kết quả 'thất bại' vậy có phải đề tài không thành công?"**
A: Không — RQ1-3 là câu hỏi khoa học hợp lệ, câu trả lời "KHÔNG đạt, và đây là lý do
tại sao" là kết quả đầy đủ. Chính GAP-T ban đầu (proposal) đã dự đoán đúng hiện tượng
này trước khi có dữ liệu.

---

*File này không phải phần nộp chính thức — dùng để chuẩn bị trả lời khi GV hỏi trực
tiếp. Số liệu trích dẫn khớp với `paper/sections/*.tex` và
`ms-analysis/results/final_metrics_export.xlsx`.*

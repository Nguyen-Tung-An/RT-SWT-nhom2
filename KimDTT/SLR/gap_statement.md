# Gap Statement – Sinh unit test tự động bằng GPT-4 (zero-shot) cho hàm Java/Python ở độ phức tạp chu trình trung bình

Evidence table: N = 9 paper (trong đó chỉ **2 paper** dùng GPT-4 family thuần zero-shot ở function-level: #1, #141; 1 paper treo #13; 6 paper lệch tiêu chí)

## Các khoảng trống phát hiện

### GAP-T (Technology): Rất ít nghiên cứu dùng GPT-4 family theo đúng cấu hình *zero-shot* ở mức hàm; chưa có nghiên cứu nào phủ cả Java lẫn Python
**Bằng chứng:** (cột **Tool/LLM**)
- Gần nhất: **#1** dùng **GPT-4 Turbo zero-shot** (Java) và **#141** dùng **GPT-4o zero-shot** (Python) — đây là 2 paper duy nhất đạt "GPT-4 + zero-shot + function-level".
- Còn thiếu: KHÔNG paper nào chạy GPT-4 zero-shot trên **cả Java và Python trong cùng một nghiên cứu** (#1 chỉ Java, #141 chỉ Python). Các paper khác lệch ở chính cột này: #10 dùng **12 LLM open-weight, không có GPT-4**; #20 dùng **GPT-3.5-turbo**; #170 default **Phind-CodeLlama-34B**; #121 và #49 *có* GPT-4 nhưng **bọc trong kỹ thuật prompting nâng cao** (SymPrompt multi-step / 5 prompt techniques) làm mất điều kiện zero-shot. Model suy luận mới (o1/o3/GPT-4.1) chưa paper nào đánh giá.

### GAP-M (Metric): Trong nhóm GPT-4 zero-shot, chưa có nghiên cứu nào đo đồng thời độ phủ + khả năng phát hiện lỗi, và không paper nào báo cáo kết quả phân tầng theo độ phức tạp trung bình
**Bằng chứng:** (cột **Metric** + **Kết quả**)
- Gần nhất: **#1** đo được khả năng bắt lỗi (semantic/fault-witnessing correctness = **7.5%**); **#10** và **#49** có chạm mutation score / bug detection.
- Còn thiếu: 2 paper GPT-4 zero-shot đo **lệch nhau và không đủ**: #1 đo correctness nhưng **không đo coverage/mutation**; #141 chỉ đo **error & test-smell** (chất lượng cú pháp/maintainability), **không đo coverage lẫn fault-detection**. → Không có paper GPT-4-zero-shot nào báo cáo trọn bộ *coverage + mutation/fault-detection + maintainability*. Quan trọng nhất: **không paper nào báo cáo kết quả phân tầng theo cyclomatic complexity TRUNG BÌNH** — chỉ #10 kiểm soát complexity nhưng ở **mức CAO** (mean 14.87) và lại không dùng GPT-4.

### GAP-D (Dataset): Dataset của các nghiên cứu GPT-4 zero-shot đều nhỏ và/hoặc không đại diện cho hàm real-world ở độ phức tạp trung bình
**Bằng chứng:** (cột **Dataset**)
- Gần nhất: **#10 (ULT)** là dataset function-level real-world tốt nhất — **3,909 hàm Python** có kiểm soát cyclomatic complexity — nhưng **không chạy GPT-4**. Dataset của nhóm GPT-4 zero-shot là **#1 (VUL4J, 50 hàm)** và **#141 (HumanEval, ~164 bài)**.
- Còn thiếu: dataset GPT-4 zero-shot vừa **nhỏ** vừa **lệch domain**: VUL4J = 50 hàm thuộc domain hẹp (lỗ hổng bảo mật), HumanEval = bài **synthetic đơn giản** (không real-world, không kiểm soát complexity). → Chưa có nghiên cứu GPT-4 zero-shot nào trên **dataset hàm real-world quy mô lớn được kiểm soát ở mức complexity TRUNG BÌNH**.

## Phát biểu GAP tổng hợp

Chưa có nghiên cứu nào đánh giá **GPT-4 (zero-shot)** sinh unit test cho **hàm Java/Python ở độ phức tạp chu trình trung bình** trên **dữ liệu real-world quy mô đủ lớn**, đồng thời đo **cả độ phủ lẫn khả năng phát hiện lỗi**. Hai nghiên cứu gần nhất bị tách rời và đều có lỗ hổng: **#1** (GPT-4 zero-shot, Java — nhưng domain lỗ hổng & chỉ 50 hàm, không đo coverage) và **#141** (GPT-4o zero-shot, Python — nhưng HumanEval synthetic & chỉ đo lỗi/test-smell); trong khi **#10** kiểm soát được độ phức tạp nhưng lại không dùng GPT-4. Đây là khoảng trống mà proposal sẽ lấp.

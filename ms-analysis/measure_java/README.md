# Đo lường Java (JaCoCo + PIT) — vai trò MS

**Chạy LOCAL, không chạy được trên Kaggle** (cần JDK + Maven, môi trường build đầy đủ).

## Yêu cầu
- JDK 17+  (`java -version`)
- Maven 3.8+ (`mvn -version`)
- Lần chạy đầu Maven sẽ tải JUnit5/JaCoCo/PIT về `~/.m2` (cần mạng).

## Quy ước đóng gói 1 hàm
PIT/JaCoCo cần class biên dịch được. Mỗi hàm Java bọc trong class `Example`:

`Example.java`
```java
public class Example {
    // <dán hàm static từ functions.csv vào đây>
    public static int f0(int x) { if (x > 7) return x - 7; else if (x < -7) return x + 7; return 0; }
}
```
`ExampleTest.java` (chính là `generated_test` của LR, đảm bảo gọi `Example.f0(...)` và class tên `ExampleTest`).

## Đo 1 hàm
```bash
chmod +x run_java_metrics.sh
./run_java_metrics.sh Example.java ExampleTest.java jv_000 8 ../results/metrics.csv
```
Ghi 1 dòng: `function_id,language,cc,method,branch_coverage,mutation_score,compiled`.
- Compile lỗi → `compiled=0`, điểm `0` (proposal §5.1 b4).
- Branch coverage = `BRANCH_COVERED/(BRANCH_COVERED+BRANCH_MISSED)` từ `jacoco.csv`.
- Mutation score = `(KILLED+TIMED_OUT)/total` từ PIT `mutations.xml`.

## Chạy hàng loạt 50 hàm Java
Viết vòng lặp đọc `functions.csv` (Java) + `llm_output.csv`/`baseline_tests.csv`, sinh cặp
`Example.java`/`ExampleTest.java` cho từng `function_id` rồi gọi script trên, nối vào cùng
`results/metrics.csv`. Gợi ý: một script Python nhỏ tách `code` + `generated_test` ra file tạm
theo `function_id`, rồi `subprocess` gọi `run_java_metrics.sh`.

## Lưu ý đo lường
- Hàm có dependency ngoài (I/O, mạng) sẽ khó cô lập → ghi `notes` trong `ground_truth.csv`.
- Cùng một `metrics.csv` chứa cả dòng Java (script này) và dòng Python (`measure_python.py`)
  → nạp thẳng vào `compute_metric.py` / `full_analysis.ipynb`.

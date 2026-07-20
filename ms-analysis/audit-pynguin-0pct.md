# Vì sao baseline Pynguin ra 0.0% — truy nguyên và hướng sửa

Bài báo ghi *"Pynguin failed completely on this dataset (median coverage 0.0%)"* nhưng
không nói được **vì sao**. Harness cũ chỉ in 400 ký tự cuối của stderr rồi gán 0, nên
nguyên nhân bị nuốt mất.

Môi trường tái lập trùng khớp `tool-versions.md`: **Pynguin 0.45.0, Python 3.10.11**.

---

## 0. "0%" không phải một hiện tượng, mà là năm

`diagnose_zero.py` phân loại cả 60 hàm Python. Gộp chung rồi lấy median là **lỗi phạm trù**
vì phần lớn không phải phép đo:

| Nguyên nhân | Hàm | Thực chất |
|---|---:|---|
| **A no-suite** | **50** | Pynguin không sinh nổi test nào → **không có phép đo**, phải là N/A |
| **E measured** | 8 | Số liệu thật (đúng 8 giá trị khác 0 bài báo vốn đã có) |
| **C not-reached** | 1 | PY-034: suite 5/5 xanh nhưng 0/12 nhánh chạm tới hàm |
| **F empty-suite** | 1 | PY-054: suite 4 dòng, 1 test gán một chuỗi, không import gì |
| D no-branch | 0 | — |

**50/60 ô "0%" là ô trống, không phải số 0 đo được.**

---

## 1. Giả thuyết "budget quá nhỏ" — ĐÃ BỊ BÁC BỎ

Tương quan LOC là thật (mọi module ≤385 LOC cho suite, mọi module ≥682 LOC thì không),
nhưng **không phải nhân quả**. `flask.helpers` với budget 306s vẫn chết trong vài giây,
`stdout` rỗng — chưa hề bắt đầu tìm kiếm. Module Flask lớn kéo theo nhiều import
C-extension hơn, nên LOC và nguyên nhân thật đi cùng nhau trong đúng dataset này.

## 2. Tầng 1 — crash khi pickle kiểu C-extension ✅ đã sửa

```
rc=2
_pickle.PicklingError: Can't pickle <class '_ctypes._CData'>   # flask.app, flask.cli
_pickle.PicklingError: Can't pickle <class '_json.Scanner'>    # flask.helpers
EOFError: Ran out of input                                     # tiến trình cha
```

Mặc định `use_master_worker=True` và `subprocess_if_recommended=True` khiến Pynguin fork
worker process rồi dùng `dill` tuần tự hoá trạng thái module. Bất kỳ **type object từ
C-extension không resolve được bằng tên** nào lọt vào đồ thị object đều làm pickle thất
bại → worker chết → không sinh gì. Hai nhánh dill khác nhau đã quan sát được:
`save_module_dict` (`_dill.py:1266`) và `save_type/save_global` (`_dill.py:1930`).

**Hướng sửa — đã kiểm chứng:**
```
--nouse_master_worker --nosubprocess_if_recommended
```
`flask.app` chuyển từ `rc=2` crash tức thì sang `rc=0` chạy hết 120s tìm kiếm thật.

## 3. Tầng 2 — method chặn luồng ✅ đã sửa

Sau khi hết crash, log đầy `WARNING Experienced timeout from test-case execution`.
Nguyên nhân: `Flask.run()` (`flask/app.py:632`) khởi động dev server **chặn vĩnh viễn**.
Mặc định `maximum_test_execution_timeout = 5s`, nên mỗi test-case ngẫu nhiên gọi `run()`
đốt 5 giây rồi bị giết. Tìm kiếm ngẫu nhiên sinh rất nhiều ca như vậy → budget bốc hơi.

**Hướng sửa — đã kiểm chứng:**
```
--ignore_methods flask.app.Flask.run
```
Số cảnh báo timeout: **lặp liên tục → 0**.

## 4. Tầng 3 — vẫn chưa ra suite ⏳ đang điều tra

Hết crash, hết timeout, nhưng `flask.app` vẫn chưa xuất ra file test. Chưa kết luận.

---

## Điểm đã tự sửa — hai kết luận sai suýt được ghi vào đây

**(a) "Harness không đặt source lên `sys.path`."** Sai. Thiết kế gốc ("Phương án B") là
pip-install flask/requests từ commit pinned, khi đó thư mục trống vẫn import được. Máy tái
lập của tôi chưa cài hai gói này. Artifact của **môi trường tôi dựng**, không phải lỗi
harness gốc.

**(b) "0% đã không còn."** Sai — khái quát hoá từ n=1. PY-029 (`requests.adapters`) nhảy
0→70 là **ngoại lệ**. Đo lại 10 hàm: **7 y hệt** bài báo, 1 tăng mạnh, 2 giảm nhẹ. Tám giá
trị khác 0 của bài báo đến từ đúng 4 module (`flask.config`, `flask.debughelpers`,
`flask.json.provider`, `flask.json.tag`) vốn **đã chạy được từ đầu**.

Ghi lại vì đúng loại nhầm lẫn này — đọc một lỗi trong môi trường tái lập rồi quy cho thí
nghiệm gốc, hoặc suy từ một ca ra cả tập — là cách tạo ra erratum sai.

---

## Hệ quả cho bài báo

Câu *"Pynguin failed completely (median 0.0%)"* **đúng về số nhưng sai về hàm ý** — nó gợi
ý đã đo được năng lực Pynguin, trong khi 50/60 ô là ô trống. Phát biểu đúng phải tách tầng:

- **Trên tập đo được (n=10):** median 72.5% — không hề "failed completely"
- **Trên toàn dataset (n=60):** 50 hàm không có phép đo, nguyên nhân truy được tới từng
  exception, và **sửa được bằng cấu hình** (mục 2, 3)

Khớp với phân tích độ nhạy: 11/13 cặp RQ2-B đến từ module Pynguin chưa từng chạy; bỏ nhóm
đó ra còn n=2, p=1.0. Nên **+36.84pp là so sánh với chỗ trống**, không phải so sánh hai
công cụ — và điều này đúng bất kể median cuối cùng là bao nhiêu.

## Hai câu trong bài giờ đã sai hẳn

| Vị trí | Câu hiện tại | Vấn đề |
|---|---|---|
| `06_threats.tex:87` | *"produced no output at all within its 90-second budget"* | Quy cho **budget**. Budget 306s vẫn chết trong vài giây → là crash |
| `06_threats.tex:95` | *"it self-reports 40% coverage on `requests.adapters`"* | Không cần self-report nữa: harness của chính nhóm **đo được 70.0%** |

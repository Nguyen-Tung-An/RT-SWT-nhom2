# Vì sao baseline Pynguin ra 0.0% — truy nguyên sau bảo vệ

Bài báo ghi *"Pynguin failed completely on this dataset (median coverage 0.0%)"* nhưng
không nói được **vì sao**. Harness cũ chỉ in 400 ký tự cuối của stderr rồi gán 0, nên
nguyên nhân bị nuốt mất. Sau khi bản vá (3/3) bắt harness ghi log đầy đủ và lưu lại suite
sinh ra, nguyên nhân lộ ra — và nó **không phải** thứ tôi đoán ban đầu.

Môi trường tái lập trùng khớp `tool-versions.md`: **Pynguin 0.45.0, Python 3.10.11**.

---

## Giả thuyết cũ đã BỊ BÁC BỎ

> "Budget 90s cố định là quá nhỏ cho module lớn; mọi module ≤385 LOC đều cho suite đo
> được, mọi module ≥682 LOC đều không."

Tương quan LOC là **thật**, nhưng nó **không phải nguyên nhân**. Chạy lại `flask.helpers`
(682 LOC) với budget 306s: vẫn không sinh được gì, và chết **trong vài giây** — `stdout`
rỗng, tức Pynguin chưa hề bắt đầu tìm kiếm. Cho thêm thời gian không cứu được thứ chết
trước khi dùng đến thời gian đó.

Đây là ví dụ tương quan bị nhầm thành nhân quả: module Flask lớn kéo theo nhiều import
C-extension hơn, nên LOC và nguyên nhân thật đi cùng nhau trong đúng dataset này.

## Nguyên nhân thật số 1 — Pynguin crash khi pickle kiểu C-extension

```
rc=2
_pickle.PicklingError: Can't pickle <class '_json.Scanner'>: it's not found as _json.Scanner
EOFError: Ran out of input          # tiến trình cha, sau khi worker chết
```

Pynguin 0.45 chạy phân tích trong **worker process** và dùng `dill` để tuần tự hoá trạng
thái module. Module nào (kể cả gián tiếp) kéo theo kiểu C-extension không pickle được thì
worker chết ngay, chưa sinh test nào. Đây là **giới hạn kiến trúc của công cụ**, không
phải "Pynguin sinh test kém".

Hệ quả cho cách diễn giải: 0.0% ở nhóm module này **không đo được năng lực sinh test** của
Pynguin. Nó là *tool crash*. Gộp chung vào median rồi kết luận "GPT hơn Pynguin +36.84pp"
là so sánh với một baseline chưa từng chạy.

## Điểm đã tự sửa — một kết luận sai suýt được ghi vào đây

Lần chạy đầu, `requests.adapters` báo `collect-fail`, và tôi đã định kết luận rằng harness
có lỗi: nó copy suite vào `tempfile.TemporaryDirectory()` trống rồi chạy pytest ở đó mà
không đặt source pinned lên `sys.path`.

**Sai.** Thiết kế gốc ("Phương án B") là **pip-install** flask/requests từ commit pinned,
khi đó thư mục trống vẫn import được. Máy tái lập của tôi chưa cài hai gói này, nên
`ModuleNotFoundError: No module named 'requests'` là artifact của **môi trường tôi dựng**,
không phải lỗi harness gốc. Đã cài `pip install -e data/raw/flask -e data/raw/requests`
rồi chạy lại.

Ghi lại ở đây vì đúng loại nhầm lẫn này — đọc một lỗi trong môi trường tái lập rồi quy cho
thí nghiệm gốc — là cách tạo ra erratum sai.

## Trạng thái

| Nguyên nhân | Trạng thái | Sửa được không |
|---|---|---|
| Crash pickle C-extension | ✅ tái lập được, có log | ❌ không — giới hạn Pynguin 0.45. Phải báo là N/A, không phải 0 |
| Budget cố định 90s | ⚠️ có thật nhưng không phải nguyên nhân chính | ✅ đã scale theo LOC (công bằng hơn, không đổi kết luận) |
| Suite sinh ra bị mất | ✅ đã sửa — lưu vào `generated_tests/pynguin/` | ✅ |
| Green-check all-or-nothing | ✅ đã sửa — per-test | ✅ |

## Việc còn phải làm

- Chạy `triage_pynguin.py` để đếm chính xác bao nhiêu/22 module chết vì crash so với
  thật sự sinh được suite yếu. Con số đó quyết định RQ2-B nên phát biểu thế nào.
- Nếu tỷ lệ crash cao: median 0.0% phải được báo lại theo **tập áp dụng được**, kèm số
  module bị loại và lý do — chứ không phải im lặng gán 0.

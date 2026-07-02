# Pilot Python — Error log chi tiết theo từng hàm

Sinh bởi `scripts/diagnose_pilot_errors.py` — chạy lại đúng pipeline của `measure_python.py` cho 12 hàm Python trong pilot.

| Hàm | Giai đoạn fail | Test tự re-implement? | Lỗi (tóm tắt) |
|---|---|---|---|
| PY-001 | P1-SOLUTION-SYNTAX | ⚠️ CÓ | `IndentationError: unexpected indent (dòng 1: `def raise_routing_exception(self, request: R` |
| PY-002 | P1-SOLUTION-SYNTAX | không | `IndentationError: unexpected indent (dòng 1: `def update_template_context(`)` |
| PY-011 | P1-SOLUTION-SYNTAX | ⚠️ CÓ | `IndentationError: unexpected indent (dòng 1: `def handle_exception(self, ctx: AppContext, ` |
| PY-012 | P1-SOLUTION-SYNTAX | không | `IndentationError: unexpected indent (dòng 1: `def process_response(self, ctx: AppContext, ` |
| PY-021 | P1-SOLUTION-SYNTAX | không | `IndentationError: unexpected indent (dòng 1: `def create_url_adapter(self, request: Reques` |
| PY-022 | P1-SOLUTION-SYNTAX | không | `IndentationError: unexpected indent (dòng 1: `def handle_user_exception(`)` |
| PY-031 | P1-SOLUTION-SYNTAX | không | `IndentationError: unexpected indent (dòng 1: `def preprocess_request(self, ctx: AppContext` |
| PY-032 | P1-SOLUTION-SYNTAX | không | `IndentationError: unexpected indent (dòng 1: `def wsgi_app(`)` |
| PY-040 | P3-COLLECT | không | `no tests collected, 1 error in 0.30s` |
| PY-041 | P4-RED-ON-ORIGINAL | không | `4 failed in 0.24s` |
| PY-046 | P1-SOLUTION-SYNTAX | không | `IndentationError: unexpected indent (dòng 1: `def __init_subclass__(cls, **kwargs: t.Any) ` |
| PY-047 | P4-RED-ON-ORIGINAL | không | `5 failed in 0.14s` |

**Chú giải giai đoạn:** P1 = solution.py lỗi cú pháp (data không standalone) · P2 = solution.py không import được · P3 = pytest không collect được test (harness đặt compiled=0 tại đây) · P4 = test FAIL trên bản gốc (green-check — harness hiện bỏ qua nên mutation 100% là số ảo) · OK = đo được hợp lệ.

---

## PY-001 — `raise_routing_exception` → **P1-SOLUTION-SYNTAX**
> ⚠️ Generated test **tự định nghĩa lại hàm cùng tên** thay vì gọi hàm từ `solution` — dù chạy được, coverage hàm gốc vẫn = 0.
P1 parse solution.py: **IndentationError: unexpected indent (dòng 1: `def raise_routing_exception(self, request: Request) -> t.NoR`)**

## PY-002 — `update_template_context` → **P1-SOLUTION-SYNTAX**
P1 parse solution.py: **IndentationError: unexpected indent (dòng 1: `def update_template_context(`)**

## PY-011 — `handle_exception` → **P1-SOLUTION-SYNTAX**
> ⚠️ Generated test **tự định nghĩa lại hàm cùng tên** thay vì gọi hàm từ `solution` — dù chạy được, coverage hàm gốc vẫn = 0.
P1 parse solution.py: **IndentationError: unexpected indent (dòng 1: `def handle_exception(self, ctx: AppContext, e: Exception) ->`)**

## PY-012 — `process_response` → **P1-SOLUTION-SYNTAX**
P1 parse solution.py: **IndentationError: unexpected indent (dòng 1: `def process_response(self, ctx: AppContext, response: Respon`)**

## PY-021 — `create_url_adapter` → **P1-SOLUTION-SYNTAX**
P1 parse solution.py: **IndentationError: unexpected indent (dòng 1: `def create_url_adapter(self, request: Request | None) -> Map`)**

## PY-022 — `handle_user_exception` → **P1-SOLUTION-SYNTAX**
P1 parse solution.py: **IndentationError: unexpected indent (dòng 1: `def handle_user_exception(`)**

## PY-031 — `preprocess_request` → **P1-SOLUTION-SYNTAX**
P1 parse solution.py: **IndentationError: unexpected indent (dòng 1: `def preprocess_request(self, ctx: AppContext) -> ft.Response`)**

## PY-032 — `wsgi_app` → **P1-SOLUTION-SYNTAX**
P1 parse solution.py: **IndentationError: unexpected indent (dòng 1: `def wsgi_app(`)**

## PY-040 — `_validate_key` → **P3-COLLECT**
P1 parse solution.py: OK
P2 import solution: OK
P3 pytest --collect-only: rc=2
```
           ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
test_gen.py:3: in <module>
    import click
E   ModuleNotFoundError: No module named 'click'
=========================== short test summary info ===========================
ERROR test_gen.py
!!!!!!!!!!!!!!!!!!! Interrupted: 1 error during collection !!!!!!!!!!!!!!!!!!!!
no tests collected, 1 error in 0.30s
```

## PY-041 — `get_root_path` → **P4-RED-ON-ORIGINAL**
P1 parse solution.py: OK
P2 import solution: OK
P3 pytest --collect-only: OK (rc=0)
P4 pytest trên bản gốc: rc=1 — test FAIL trên chính code gốc ⇒ mutation score sẽ là số ảo
```
        """
        # Module already imported and has a file attribute. Use that first.
>       mod = sys.modules.get(import_name)
              ^^^
E       NameError: name 'sys' is not defined. Did you forget to import 'sys'?
solution.py:11: NameError
=========================== short test summary info ===========================
FAILED test_gen.py::test_get_root_path_module_with_file - NameError: name 'sy...
FAILED test_gen.py::test_get_root_path_namespace_package - NameError: name 's...
FAILED test_gen.py::test_get_root_path_unloaded_main_module - NameError: name...
FAILED test_gen.py::test_get_root_path_no_file - NameError: name 'sys' is not...
4 failed in 0.24s
```

## PY-046 — `__init_subclass__` → **P1-SOLUTION-SYNTAX**
P1 parse solution.py: **IndentationError: unexpected indent (dòng 1: `def __init_subclass__(cls, **kwargs: t.Any) -> None:`)**

## PY-047 — `_find_package_path` → **P4-RED-ON-ORIGINAL**
P1 parse solution.py: OK
P2 import solution: OK
P3 pytest --collect-only: OK (rc=0)
P4 pytest trên bản gốc: rc=1 — test FAIL trên chính code gốc ⇒ mutation score sẽ là số ảo
```
    def test_find_package_path_empty_string():
>       assert _find_package_path("") == os.getcwd()
               ^^^^^^^^^^^^^^^^^^
E       NameError: name '_find_package_path' is not defined
test_gen.py:21: NameError
=========================== short test summary info ===========================
FAILED test_gen.py::test_find_package_path_valid_module - NameError: name '_f...
FAILED test_gen.py::test_find_package_path_valid_namespace_package - NameErro...
FAILED test_gen.py::test_find_package_path_invalid_module - NameError: name '...
FAILED test_gen.py::test_find_package_path_main_module - NameError: name '_fi...
FAILED test_gen.py::test_find_package_path_empty_string - NameError: name '_f...
5 failed in 0.14s
```

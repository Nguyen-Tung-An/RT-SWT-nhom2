# Pilot Python — Error log chi tiết theo từng hàm

Sinh bởi `scripts/diagnose_pilot_errors.py` — chạy lại đúng pipeline của `measure_python.py` cho 12 hàm Python trong pilot.

| Hàm | Giai đoạn fail | Test tự re-implement? | Lỗi (tóm tắt) |
|---|---|---|---|
| PY-001 | P3-COLLECT | ⚠️ CÓ | `no tests collected, 1 error in 0.36s` |
| PY-002 | P4-RED-ON-ORIGINAL | không | `2 failed, 1 passed in 0.18s` |
| PY-011 | P3-COLLECT | ⚠️ CÓ | `no tests collected, 1 error in 0.32s` |
| PY-012 | P3-COLLECT | không | `no tests collected, 1 error in 0.33s` |
| PY-021 | P3-COLLECT | không | `no tests collected, 1 error in 0.40s` |
| PY-022 | P3-COLLECT | không | `no tests collected, 1 error in 0.30s` |
| PY-031 | P3-COLLECT | không | `no tests collected, 1 error in 0.23s` |
| PY-032 | P4-RED-ON-ORIGINAL | không | `4 errors in 0.04s` |
| PY-040 | P3-COLLECT | không | `no tests collected, 1 error in 0.32s` |
| PY-041 | P4-RED-ON-ORIGINAL | không | `3 failed, 1 passed in 0.21s` |
| PY-046 | P3-COLLECT | không | `no tests collected, 1 error in 0.32s` |
| PY-047 | P4-RED-ON-ORIGINAL | không | `5 failed in 0.23s` |

**Chú giải giai đoạn:** P1 = solution.py lỗi cú pháp (data không standalone) · P2 = solution.py không import được · P3 = pytest không collect được test (harness đặt compiled=0 tại đây) · P4 = test FAIL trên bản gốc (green-check — harness hiện bỏ qua nên mutation 100% là số ảo) · OK = đo được hợp lệ.

---

## PY-001 — `raise_routing_exception` → **P3-COLLECT**
> ⚠️ Generated test **tự định nghĩa lại hàm cùng tên** thay vì gọi hàm từ `solution` — dù chạy được, coverage hàm gốc vẫn = 0.
P1 parse solution.py: OK
P2 import solution: OK
P3 pytest --collect-only: rc=2
```
           ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
test_gen.py:3: in <module>
    from flask.app import Flask, Request, RequestRedirect, FormDataRoutingRedirect
E   ModuleNotFoundError: No module named 'flask'
=========================== short test summary info ===========================
ERROR test_gen.py
!!!!!!!!!!!!!!!!!!! Interrupted: 1 error during collection !!!!!!!!!!!!!!!!!!!!
no tests collected, 1 error in 0.36s
```

## PY-002 — `update_template_context` → **P4-RED-ON-ORIGINAL**
P1 parse solution.py: OK
P2 import solution: OK
P3 pytest --collect-only: OK (rc=0)
P4 pytest trên bản gốc: rc=1 — test FAIL trên chính code gốc ⇒ mutation score sẽ là số ảo
```
        # copy to re-apply after all context functions.
        orig_ctx = context.copy()
        for name in names:
            if name in self.template_context_processors:
                for func in self.template_context_processors[name]:
>                   context.update(self.ensure_sync(func)())
E                   TypeError: Mock.keys() returned a non-iterable (type Mock)
solution.py:31: TypeError
=========================== short test summary info ===========================
FAILED test_gen.py::test_update_template_context_with_request - TypeError: Mo...
FAILED test_gen.py::test_update_template_context_without_request - TypeError:...
2 failed, 1 passed in 0.18s
```

## PY-011 — `handle_exception` → **P3-COLLECT**
> ⚠️ Generated test **tự định nghĩa lại hàm cùng tên** thay vì gọi hàm từ `solution` — dù chạy được, coverage hàm gốc vẫn = 0.
P1 parse solution.py: OK
P2 import solution: OK
P3 pytest --collect-only: rc=2
```
           ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
test_gen.py:3: in <module>
    from flask.app import AppContext, Response, InternalServerError
E   ModuleNotFoundError: No module named 'flask'
=========================== short test summary info ===========================
ERROR test_gen.py
!!!!!!!!!!!!!!!!!!! Interrupted: 1 error during collection !!!!!!!!!!!!!!!!!!!!
no tests collected, 1 error in 0.32s
```

## PY-012 — `process_response` → **P3-COLLECT**
P1 parse solution.py: OK
P2 import solution: OK
P3 pytest --collect-only: rc=2
```
           ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
test_gen.py:3: in <module>
    from flask.app import Flask, AppContext, Response
E   ModuleNotFoundError: No module named 'flask'
=========================== short test summary info ===========================
ERROR test_gen.py
!!!!!!!!!!!!!!!!!!! Interrupted: 1 error during collection !!!!!!!!!!!!!!!!!!!!
no tests collected, 1 error in 0.33s
```

## PY-021 — `create_url_adapter` → **P3-COLLECT**
P1 parse solution.py: OK
P2 import solution: OK
P3 pytest --collect-only: rc=2
```
           ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
test_gen.py:3: in <module>
    from flask.app import Flask
E   ModuleNotFoundError: No module named 'flask'
=========================== short test summary info ===========================
ERROR test_gen.py
!!!!!!!!!!!!!!!!!!! Interrupted: 1 error during collection !!!!!!!!!!!!!!!!!!!!
no tests collected, 1 error in 0.40s
```

## PY-022 — `handle_user_exception` → **P3-COLLECT**
P1 parse solution.py: OK
P2 import solution: OK
P3 pytest --collect-only: rc=2
```
           ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
test_gen.py:3: in <module>
    from werkzeug.exceptions import BadRequestKeyError, HTTPException
E   ModuleNotFoundError: No module named 'werkzeug'
=========================== short test summary info ===========================
ERROR test_gen.py
!!!!!!!!!!!!!!!!!!! Interrupted: 1 error during collection !!!!!!!!!!!!!!!!!!!!
no tests collected, 1 error in 0.30s
```

## PY-031 — `preprocess_request` → **P3-COLLECT**
P1 parse solution.py: OK
P2 import solution: OK
P3 pytest --collect-only: rc=2
```
           ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
test_gen.py:3: in <module>
    from flask.app import Flask, AppContext
E   ModuleNotFoundError: No module named 'flask'
=========================== short test summary info ===========================
ERROR test_gen.py
!!!!!!!!!!!!!!!!!!! Interrupted: 1 error during collection !!!!!!!!!!!!!!!!!!!!
no tests collected, 1 error in 0.23s
```

## PY-032 — `wsgi_app` → **P4-RED-ON-ORIGINAL**
P1 parse solution.py: OK
P2 import solution: OK
P3 pytest --collect-only: OK (rc=0)
P4 pytest trên bản gốc: rc=1 — test FAIL trên chính code gốc ⇒ mutation score sẽ là số ảo
```
file C:\Users\qhung\AppData\Local\Temp\tmpy317vxxl\test_gen.py, line 39
  def test_wsgi_app_preserve_context(mocker):
E       fixture 'mocker' not found
>       available fixtures: cache, capfd, capfdbinary, caplog, capsys, capsysbinary, capteesys, doctest_namespace, monkeypatch, pytestconfig, record_property, record_testsuite_property, record_xml_attribute, recwarn, subtests, tmp_path, tmp_path_factory, tmpdir, tmpdir_factory
>       use 'pytest --fixtures [testpath]' for help on them.
C:\Users\qhung\AppData\Local\Temp\tmpy317vxxl\test_gen.py:39
=========================== short test summary info ===========================
ERROR test_gen.py::test_wsgi_app_successful_response
ERROR test_gen.py::test_wsgi_app_exception_handling
ERROR test_gen.py::test_wsgi_app_unhandled_exception
ERROR test_gen.py::test_wsgi_app_preserve_context
4 errors in 0.04s
```

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
no tests collected, 1 error in 0.32s
```

## PY-041 — `get_root_path` → **P4-RED-ON-ORIGINAL**
P1 parse solution.py: OK
P2 import solution: OK
P3 pytest --collect-only: OK (rc=0)
P4 pytest trên bản gốc: rc=1 — test FAIL trên chính code gốc ⇒ mutation score sẽ là số ảo
```
        module_name = "test_module_no_file"
        sys.modules[module_name] = type(sys)(module_name)  # Create a module without a __file__
        try:
>           with pytest.raises(RuntimeError):
                 ^^^^^^^^^^^^^^^^^^^^^^^^^^^
E           Failed: DID NOT RAISE RuntimeError
test_gen.py:36: Failed
=========================== short test summary info ===========================
FAILED test_gen.py::test_get_root_path_namespace_package - Failed: DID NOT RA...
FAILED test_gen.py::test_get_root_path_unloaded_main_module - AssertionError:...
FAILED test_gen.py::test_get_root_path_no_file - Failed: DID NOT RAISE Runtim...
3 failed, 1 passed in 0.21s
```

## PY-046 — `__init_subclass__` → **P3-COLLECT**
P1 parse solution.py: OK
P2 import solution: OK
P3 pytest --collect-only: rc=2
```
           ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
test_gen.py:3: in <module>
    from flask.app import Flask
E   ModuleNotFoundError: No module named 'flask'
=========================== short test summary info ===========================
ERROR test_gen.py
!!!!!!!!!!!!!!!!!!! Interrupted: 1 error during collection !!!!!!!!!!!!!!!!!!!!
no tests collected, 1 error in 0.32s
```

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
5 failed in 0.23s
```

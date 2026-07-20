import pytest
import warnings
from flask import Flask, AppContext

class TestFlaskInitSubclass:
    
    def test_init_subclass_no_warning_on_override(self):
        class MyFlask(Flask):
            def handle_http_exception(self, e):
                return "Handled"

        with pytest.warns(None) as record:
            MyFlask.__init_subclass__()
        assert len(record) == 0

    def test_init_subclass_warning_on_old_signature(self):
        class MyFlask(Flask):
            def handle_http_exception(self, e, ctx):
                return "Handled with ctx"

        with pytest.warns(DeprecationWarning) as record:
            MyFlask.__init_subclass__()
        assert len(record) == 1
        assert "The 'handle_http_exception' method now takes 'ctx: AppContext'" in str(record[0].message)

    def test_init_subclass_warning_on_missing_ctx_param(self):
        class MyFlask(Flask):
            def handle_http_exception(self, e):
                return "Handled without ctx"

        with pytest.warns(DeprecationWarning) as record:
            MyFlask.__init_subclass__()
        assert len(record) == 1
        assert "The 'handle_http_exception' method now takes 'ctx: AppContext'" in str(record[0].message)

    def test_init_subclass_no_warning_on_correct_signature(self):
        class MyFlask(Flask):
            def handle_http_exception(self, e, ctx: AppContext):
                return "Handled with correct signature"

        with pytest.warns(None) as record:
            MyFlask.__init_subclass__()
        assert len(record) == 0

    def test_init_subclass_warning_on_string_annotation(self):
        class MyFlask(Flask):
            def handle_http_exception(self, e, ctx: 'AppContext'):
                return "Handled with string annotation"

        with pytest.warns(DeprecationWarning) as record:
            MyFlask.__init_subclass__()
        assert len(record) == 1
        assert "The 'handle_http_exception' method now takes 'ctx: AppContext'" in str(record[0].message)
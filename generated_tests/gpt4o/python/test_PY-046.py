import pytest
from flask import Flask, AppContext

class TestFlaskSubclass(Flask):
    def handle_http_exception(self):
        pass

    def handle_user_exception(self):
        pass

    def handle_exception(self):
        pass

    def log_exception(self):
        pass

    def dispatch_request(self):
        pass

    def full_dispatch_request(self):
        pass

    def finalize_request(self):
        pass

    def make_default_options_response(self):
        pass

    def preprocess_request(self):
        pass

    def process_response(self):
        pass

    def do_teardown_request(self):
        pass

    def do_teardown_appcontext(self):
        pass

def test_init_subclass_warning_for_old_signature(monkeypatch):
    with pytest.warns(DeprecationWarning, match="The 'handle_http_exception' method now takes 'ctx: AppContext'"):
        TestFlaskSubclass.__init_subclass__()

    with pytest.warns(DeprecationWarning, match="The 'handle_user_exception' method now takes 'ctx: AppContext'"):
        TestFlaskSubclass.__init_subclass__()

    with pytest.warns(DeprecationWarning, match="The 'handle_exception' method now takes 'ctx: AppContext'"):
        TestFlaskSubclass.__init_subclass__()

    with pytest.warns(DeprecationWarning, match="The 'log_exception' method now takes 'ctx: AppContext'"):
        TestFlaskSubclass.__init_subclass__()

    with pytest.warns(DeprecationWarning, match="The 'dispatch_request' method now takes 'ctx: AppContext'"):
        TestFlaskSubclass.__init_subclass__()

    with pytest.warns(DeprecationWarning, match="The 'full_dispatch_request' method now takes 'ctx: AppContext'"):
        TestFlaskSubclass.__init_subclass__()

    with pytest.warns(DeprecationWarning, match="The 'finalize_request' method now takes 'ctx: AppContext'"):
        TestFlaskSubclass.__init_subclass__()

    with pytest.warns(DeprecationWarning, match="The 'make_default_options_response' method now takes 'ctx: AppContext'"):
        TestFlaskSubclass.__init_subclass__()

    with pytest.warns(DeprecationWarning, match="The 'preprocess_request' method now takes 'ctx: AppContext'"):
        TestFlaskSubclass.__init_subclass__()

    with pytest.warns(DeprecationWarning, match="The 'process_response' method now takes 'ctx: AppContext'"):
        TestFlaskSubclass.__init_subclass__()

    with pytest.warns(DeprecationWarning, match="The 'do_teardown_request' method now takes 'ctx: AppContext'"):
        TestFlaskSubclass.__init_subclass__()

    with pytest.warns(DeprecationWarning, match="The 'do_teardown_appcontext' method now takes 'ctx: AppContext'"):
        TestFlaskSubclass.__init_subclass__()
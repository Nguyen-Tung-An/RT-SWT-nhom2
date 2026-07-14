import pytest
from flask.app import Flask

class TestFlaskSubclass(Flask):
    def handle_http_exception(self, e):
        pass

    def handle_user_exception(self, e):
        pass

    def handle_exception(self, e):
        pass

    def log_exception(self, exc_info):
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

    def process_response(self, response):
        pass

    def do_teardown_request(self, exc):
        pass

    def do_teardown_appcontext(self, exc):
        pass

def test_init_subclass_warning():
    with pytest.warns(DeprecationWarning, match="The 'handle_http_exception' method now takes 'ctx: AppContext'"):
        TestFlaskSubclass.handle_http_exception(None)

    with pytest.warns(DeprecationWarning, match="The 'handle_user_exception' method now takes 'ctx: AppContext'"):
        TestFlaskSubclass.handle_user_exception(None)

    with pytest.warns(DeprecationWarning, match="The 'handle_exception' method now takes 'ctx: AppContext'"):
        TestFlaskSubclass.handle_exception(None)

    with pytest.warns(DeprecationWarning, match="The 'log_exception' method now takes 'ctx: AppContext'"):
        TestFlaskSubclass.log_exception(None)

    with pytest.warns(DeprecationWarning, match="The 'dispatch_request' method now takes 'ctx: AppContext'"):
        TestFlaskSubclass.dispatch_request()

    with pytest.warns(DeprecationWarning, match="The 'full_dispatch_request' method now takes 'ctx: AppContext'"):
        TestFlaskSubclass.full_dispatch_request()

    with pytest.warns(DeprecationWarning, match="The 'finalize_request' method now takes 'ctx: AppContext'"):
        TestFlaskSubclass.finalize_request()

    with pytest.warns(DeprecationWarning, match="The 'make_default_options_response' method now takes 'ctx: AppContext'"):
        TestFlaskSubclass.make_default_options_response()

    with pytest.warns(DeprecationWarning, match="The 'preprocess_request' method now takes 'ctx: AppContext'"):
        TestFlaskSubclass.preprocess_request()

    with pytest.warns(DeprecationWarning, match="The 'process_response' method now takes 'ctx: AppContext'"):
        TestFlaskSubclass.process_response(None)

    with pytest.warns(DeprecationWarning, match="The 'do_teardown_request' method now takes 'ctx: AppContext'"):
        TestFlaskSubclass.do_teardown_request(None)

    with pytest.warns(DeprecationWarning, match="The 'do_teardown_appcontext' method now takes 'ctx: AppContext'"):
        TestFlaskSubclass.do_teardown_appcontext(None)
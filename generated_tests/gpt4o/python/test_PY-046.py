import pytest
from flask.app import Flask

class TestFlaskSubclass(Flask):
    def handle_http_exception(self, e):
        pass

    def handle_user_exception(self, e):
        pass

    def handle_exception(self, e):
        pass

    def log_exception(self, e):
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
        return response

    def do_teardown_request(self, exc=None):
        pass

    def do_teardown_appcontext(self, exc=None):
        pass

def test_init_subclass_warning(mocker):
    mock_warning = mocker.patch("warnings.warn")
    TestFlaskSubclass.__init_subclass__()

    assert mock_warning.call_count == 10
    for method in [
        "handle_http_exception",
        "handle_user_exception",
        "handle_exception",
        "log_exception",
        "dispatch_request",
        "full_dispatch_request",
        "finalize_request",
        "make_default_options_response",
        "preprocess_request",
        "process_response",
        "do_teardown_request",
        "do_teardown_appcontext",
    ]:
        mock_warning.assert_any_call(
            f"The '{method}' method now takes 'ctx: AppContext' as the first parameter. The old signature is deprecated and will not be supported in Flask 4.0.",
            DeprecationWarning,
            stacklevel=2,
        )
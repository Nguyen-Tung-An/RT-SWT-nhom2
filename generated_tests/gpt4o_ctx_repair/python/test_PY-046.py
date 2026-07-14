import pytest
from flask import Flask

class TestFlaskSubclass(Flask):
    def handle_http_exception(self, ctx, e):
        pass

    def handle_user_exception(self, ctx, e):
        pass

    def handle_exception(self, ctx, e):
        pass

    def log_exception(self, ctx, exc_info):
        pass

    def dispatch_request(self, ctx):
        pass

    def full_dispatch_request(self, ctx):
        pass

    def finalize_request(self, ctx, rv, from_error_handler):
        pass

    def make_default_options_response(self, ctx):
        pass

    def preprocess_request(self, ctx):
        pass

    def process_response(self, ctx, response):
        pass

    def do_teardown_request(self, ctx, exc):
        pass

    def do_teardown_appcontext(self, ctx, exc):
        pass

def test_init_subclass_warning():
    with pytest.warns(DeprecationWarning, match="The 'handle_http_exception' method now takes 'ctx: AppContext' as the first parameter."):
        TestFlaskSubclass().handle_http_exception(None, None)

    with pytest.warns(DeprecationWarning, match="The 'handle_user_exception' method now takes 'ctx: AppContext' as the first parameter."):
        TestFlaskSubclass().handle_user_exception(None, None)

    with pytest.warns(DeprecationWarning, match="The 'handle_exception' method now takes 'ctx: AppContext' as the first parameter."):
        TestFlaskSubclass().handle_exception(None, None)

    with pytest.warns(DeprecationWarning, match="The 'log_exception' method now takes 'ctx: AppContext' as the first parameter."):
        TestFlaskSubclass().log_exception(None, None)

    with pytest.warns(DeprecationWarning, match="The 'dispatch_request' method now takes 'ctx: AppContext' as the first parameter."):
        TestFlaskSubclass().dispatch_request(None)

    with pytest.warns(DeprecationWarning, match="The 'full_dispatch_request' method now takes 'ctx: AppContext' as the first parameter."):
        TestFlaskSubclass().full_dispatch_request(None)

    with pytest.warns(DeprecationWarning, match="The 'finalize_request' method now takes 'ctx: AppContext' as the first parameter."):
        TestFlaskSubclass().finalize_request(None, None, None)

    with pytest.warns(DeprecationWarning, match="The 'make_default_options_response' method now takes 'ctx: AppContext' as the first parameter."):
        TestFlaskSubclass().make_default_options_response(None)

    with pytest.warns(DeprecationWarning, match="The 'preprocess_request' method now takes 'ctx: AppContext' as the first parameter."):
        TestFlaskSubclass().preprocess_request(None)

    with pytest.warns(DeprecationWarning, match="The 'process_response' method now takes 'ctx: AppContext' as the first parameter."):
        TestFlaskSubclass().process_response(None, None)

    with pytest.warns(DeprecationWarning, match="The 'do_teardown_request' method now takes 'ctx: AppContext' as the first parameter."):
        TestFlaskSubclass().do_teardown_request(None, None)

    with pytest.warns(DeprecationWarning, match="The 'do_teardown_appcontext' method now takes 'ctx: AppContext' as the first parameter."):
        TestFlaskSubclass().do_teardown_appcontext(None, None)
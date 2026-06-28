import pytest
from flask.app import AppContext, Response, InternalServerError

class MockApp:
    def __init__(self, propagate_exceptions=True, testing=False, debug=False):
        self.config = {"PROPAGATE_EXCEPTIONS": propagate_exceptions}
        self.testing = testing
        self.debug = debug

    def log_exception(self, ctx, exc_info):
        pass

    def _find_error_handler(self, server_error, blueprints):
        return None

    def finalize_request(self, ctx, server_error, from_error_handler=False):
        return server_error

    def ensure_sync(self, handler):
        return handler

    def handle_exception(self, ctx: AppContext, e: Exception) -> Response:
        exc_info = sys.exc_info()
        got_request_exception.send(self, _async_wrapper=self.ensure_sync, exception=e)
        propagate = self.config["PROPAGATE_EXCEPTIONS"]

        if propagate is None:
            propagate = self.testing or self.debug

        if propagate:
            if exc_info[1] is e:
                raise
            raise e

        self.log_exception(ctx, exc_info)
        server_error = InternalServerError(original_exception=e)
        handler = self._find_error_handler(server_error, ctx.request.blueprints)

        if handler is not None:
            server_error = self.ensure_sync(handler)(server_error)

        return self.finalize_request(ctx, server_error, from_error_handler=True)

def test_handle_exception_propagate():
    app = MockApp(propagate_exceptions=True)
    ctx = AppContext()
    with pytest.raises(Exception):
        app.handle_exception(ctx, Exception("Test Exception"))

def test_handle_exception_no_propagate():
    app = MockApp(propagate_exceptions=False)
    ctx = AppContext()
    response = app.handle_exception(ctx, Exception("Test Exception"))
    assert isinstance(response, InternalServerError)

def test_handle_exception_with_testing_mode():
    app = MockApp(propagate_exceptions=False, testing=True)
    ctx = AppContext()
    response = app.handle_exception(ctx, Exception("Test Exception"))
    assert isinstance(response, InternalServerError)

def test_handle_exception_with_debug_mode():
    app = MockApp(propagate_exceptions=False, debug=True)
    ctx = AppContext()
    response = app.handle_exception(ctx, Exception("Test Exception"))
    assert isinstance(response, InternalServerError)
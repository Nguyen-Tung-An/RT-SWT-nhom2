import pytest
from flask.app import handle_user_exception
from werkzeug.exceptions import BadRequestKeyError, HTTPException

class MockAppContext:
    def __init__(self, debug=False, trap_bad_request_errors=False):
        self.debug = debug
        self.config = {"TRAP_BAD_REQUEST_ERRORS": trap_bad_request_errors}
        self.request = MockRequest()

class MockRequest:
    def __init__(self):
        self.blueprints = []

def mock_handler(e):
    return f"Handled: {str(e)}"

def test_handle_user_exception_bad_request_key_error_debug():
    ctx = MockAppContext(debug=True)
    e = BadRequestKeyError("bad_key")
    response = handle_user_exception(ctx, e)
    assert response is None  # Assuming the function returns None for this case

def test_handle_user_exception_bad_request_key_error_no_debug():
    ctx = MockAppContext(debug=False, trap_bad_request_errors=True)
    e = BadRequestKeyError("bad_key")
    response = handle_user_exception(ctx, e)
    assert response is None  # Assuming the function returns None for this case

def test_handle_user_exception_http_exception_not_trapped():
    ctx = MockAppContext()
    e = HTTPException("HTTP error")
    response = handle_user_exception(ctx, e)
    assert response is None  # Assuming the function returns None for this case

def test_handle_user_exception_http_exception_trapped():
    ctx = MockAppContext()
    e = HTTPException("HTTP error")
    ctx.trap_http_exception = lambda x: True
    response = handle_user_exception(ctx, e)
    assert response is None  # Assuming the function returns None for this case

def test_handle_user_exception_no_handler():
    ctx = MockAppContext()
    e = Exception("generic error")
    with pytest.raises(Exception):
        handle_user_exception(ctx, e)
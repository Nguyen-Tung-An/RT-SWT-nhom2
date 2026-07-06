import pytest
from flask.sansio.app import App  # Assuming App is the class containing trap_http_exception
from werkzeug.exceptions import BadRequest, BadRequestKeyError

@pytest.fixture
def app_with_trap_http_exceptions():
    app = App()
    app.config["TRAP_HTTP_EXCEPTIONS"] = True
    return app

@pytest.fixture
def app_with_trap_bad_request_errors():
    app = App()
    app.config["TRAP_HTTP_EXCEPTIONS"] = False
    app.config["TRAP_BAD_REQUEST_ERRORS"] = True
    return app

@pytest.fixture
def app_with_debug_mode():
    app = App()
    app.config["TRAP_HTTP_EXCEPTIONS"] = False
    app.config["TRAP_BAD_REQUEST_ERRORS"] = None
    app.debug = True
    return app

def test_trap_http_exception_true(app_with_trap_http_exceptions):
    assert app_with_trap_http_exceptions.trap_http_exception(Exception("Test")) is True

def test_trap_http_exception_false(app_with_trap_http_exceptions):
    app_with_trap_http_exceptions.config["TRAP_HTTP_EXCEPTIONS"] = False
    assert app_with_trap_http_exceptions.trap_http_exception(Exception("Test")) is False

def test_trap_bad_request_error(app_with_trap_bad_request_errors):
    assert app_with_trap_bad_request_errors.trap_http_exception(BadRequest("Bad Request")) is True

def test_trap_key_error_in_debug_mode(app_with_debug_mode):
    assert app_with_debug_mode.trap_http_exception(BadRequestKeyError("Key Error")) is True

def test_dont_trap_other_exceptions(app_with_debug_mode):
    assert app_with_debug_mode.trap_http_exception(Exception("Some other exception")) is False
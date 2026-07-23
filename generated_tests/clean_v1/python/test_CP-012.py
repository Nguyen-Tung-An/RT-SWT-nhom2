import pytest
from flask.sansio.app import App  # Assuming App is the class containing trap_http_exception
from werkzeug.exceptions import BadRequest, BadRequestKeyError

@pytest.fixture
def app_instance():
    app = App()
    app.config["TRAP_HTTP_EXCEPTIONS"] = False
    app.config["TRAP_BAD_REQUEST_ERRORS"] = False
    app.debug = False
    return app

def test_trap_http_exception_trap_http_exceptions_true(app_instance):
    app_instance.config["TRAP_HTTP_EXCEPTIONS"] = True
    assert app_instance.trap_http_exception(Exception("Test")) is True

def test_trap_http_exception_trap_bad_request_errors_true(app_instance):
    app_instance.config["TRAP_BAD_REQUEST_ERRORS"] = True
    assert app_instance.trap_http_exception(BadRequest("Test")) is True

def test_trap_http_exception_trap_bad_request_errors_false(app_instance):
    app_instance.config["TRAP_BAD_REQUEST_ERRORS"] = False
    assert app_instance.trap_http_exception(BadRequest("Test")) is False

def test_trap_http_exception_key_error_in_debug_mode(app_instance):
    app_instance.config["TRAP_BAD_REQUEST_ERRORS"] = None
    app_instance.debug = True
    assert app_instance.trap_http_exception(BadRequestKeyError("Test")) is True

def test_trap_http_exception_key_error_not_in_debug_mode(app_instance):
    app_instance.config["TRAP_BAD_REQUEST_ERRORS"] = None
    app_instance.debug = False
    assert app_instance.trap_http_exception(BadRequestKeyError("Test")) is False

def test_trap_http_exception_other_exception(app_instance):
    assert app_instance.trap_http_exception(Exception("Other Exception")) is False
import pytest
from flask.app import Flask
from werkzeug.exceptions import BadRequest, BadRequestKeyError

@pytest.fixture
def app():
    app = Flask('test_app')
    app.config['TRAP_HTTP_EXCEPTIONS'] = False
    app.config['TRAP_BAD_REQUEST_ERRORS'] = False
    app.debug = False
    return app

def test_trap_http_exception_trap_http_exceptions_true(app):
    app.config['TRAP_HTTP_EXCEPTIONS'] = True
    with app.test_request_context('/'):
        assert app.trap_http_exception(Exception("Test Exception")) is True

def test_trap_http_exception_trap_bad_request_errors_true(app):
    app.config['TRAP_BAD_REQUEST_ERRORS'] = True
    with app.test_request_context('/'):
        assert app.trap_http_exception(BadRequest("Bad Request")) is True

def test_trap_http_exception_trap_bad_request_key_error_in_debug_mode(app):
    app.config['TRAP_BAD_REQUEST_ERRORS'] = None
    app.debug = True
    with app.test_request_context('/'):
        assert app.trap_http_exception(BadRequestKeyError("Key Error")) is True

def test_trap_http_exception_trap_bad_request_key_error_not_in_debug_mode(app):
    app.config['TRAP_BAD_REQUEST_ERRORS'] = None
    app.debug = False
    with app.test_request_context('/'):
        assert app.trap_http_exception(BadRequestKeyError("Key Error")) is False

def test_trap_http_exception_no_trap(app):
    with app.test_request_context('/'):
        assert app.trap_http_exception(Exception("Some other exception")) is False

def test_trap_http_exception_trap_bad_request_false(app):
    app.config['TRAP_BAD_REQUEST_ERRORS'] = False
    with app.test_request_context('/'):
        assert app.trap_http_exception(BadRequest("Bad Request")) is False
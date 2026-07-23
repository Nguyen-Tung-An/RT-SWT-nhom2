import pytest
from flask import Flask, request
from werkzeug.exceptions import BadRequestKeyError, HTTPException

@pytest.fixture
def app():
    app = Flask('test_app')
    with app.test_request_context('/'):
        yield app

def test_handle_user_exception_http_exception(app):
    class CustomHTTPException(HTTPException):
        pass

    exception = CustomHTTPException("Custom HTTP Exception")
    response = app.handle_user_exception(app.app_context(), exception)
    assert response is not None

def test_handle_user_exception_bad_request_key_error_debug(app):
    app.debug = True
    exception = BadRequestKeyError("bad_key")
    response = app.handle_user_exception(app.app_context(), exception)
    assert response is None  # Expecting to show exception in debug mode

def test_handle_user_exception_bad_request_key_error_no_debug(app):
    app.debug = False
    exception = BadRequestKeyError("bad_key")
    response = app.handle_user_exception(app.app_context(), exception)
    assert response is None  # Expecting to not show exception in non-debug mode

def test_handle_user_exception_no_handler(app):
    class CustomException(Exception):
        pass

    exception = CustomException("No handler for this exception")
    with pytest.raises(CustomException):
        app.handle_user_exception(app.app_context(), exception)

def test_handle_user_exception_with_handler(app):
    @app.errorhandler(HTTPException)
    def handle_http_exception(e):
        return "Handled HTTP Exception", 500

    exception = HTTPException("Handled HTTP Exception")
    response = app.handle_user_exception(app.app_context(), exception)
    assert response[0] == "Handled HTTP Exception"
    assert response[1] == 500
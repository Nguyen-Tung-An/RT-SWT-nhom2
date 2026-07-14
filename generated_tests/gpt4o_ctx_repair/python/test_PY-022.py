import pytest
from flask import Flask, BadRequestKeyError, HTTPException

@pytest.fixture
def app():
    app = Flask(__name__)
    return app

def test_handle_user_exception_bad_request_key_error(app):
    with app.app_context():
        exception = BadRequestKeyError('test_key')
        app.debug = True
        app.config["TRAP_BAD_REQUEST_ERRORS"] = True
        response = app.handle_user_exception(exception)
        assert response is None  # Adjust based on actual expected behavior

def test_handle_user_exception_http_exception(app):
    with app.app_context():
        exception = HTTPException('HTTP error occurred')
        app.trap_http_exception = lambda e: False
        response = app.handle_user_exception(exception)
        assert isinstance(response, HTTPException)

def test_handle_user_exception_no_handler(app):
    with app.app_context():
        exception = Exception('Generic exception')
        with pytest.raises(Exception):
            app.handle_user_exception(exception)

def test_handle_user_exception_with_handler(app):
    with app.app_context():
        exception = Exception('Handled exception')

        def custom_handler(e):
            return 'Handled: ' + str(e)

        app._find_error_handler = lambda e, blueprints: custom_handler
        response = app.handle_user_exception(exception)
        assert response == 'Handled: Handled exception'
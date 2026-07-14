import pytest
from flask.app import Flask, BadRequestKeyError, HTTPException

@pytest.fixture
def app():
    app = Flask(__name__)
    return app

def test_handle_user_exception_bad_request_key_error(app):
    ctx = app.app_context()
    ctx.push()
    exception = BadRequestKeyError('test_key')
    app.debug = True
    app.config["TRAP_BAD_REQUEST_ERRORS"] = True
    response = app.handle_user_exception(ctx, exception)
    assert response is None  # Adjust based on actual expected behavior

def test_handle_user_exception_http_exception(app):
    ctx = app.app_context()
    ctx.push()
    exception = HTTPException('HTTP error occurred')
    app.trap_http_exception = lambda e: False
    response = app.handle_user_exception(ctx, exception)
    assert isinstance(response, HTTPException)

def test_handle_user_exception_no_handler(app):
    ctx = app.app_context()
    ctx.push()
    exception = Exception('Generic exception')
    with pytest.raises(Exception):
        app.handle_user_exception(ctx, exception)

def test_handle_user_exception_with_handler(app):
    ctx = app.app_context()
    ctx.push()
    exception = Exception('Handled exception')

    def custom_handler(e):
        return 'Handled: ' + str(e)

    app._find_error_handler = lambda e, blueprints: custom_handler
    response = app.handle_user_exception(ctx, exception)
    assert response == 'Handled: Handled exception'
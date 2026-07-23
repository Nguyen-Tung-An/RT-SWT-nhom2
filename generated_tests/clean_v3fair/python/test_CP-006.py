import pytest
from flask import Flask
from werkzeug.exceptions import InternalServerError

@pytest.fixture
def app():
    return Flask('test_app')

def test_handle_exception_no_handler(app):
    with app.test_request_context('/'):
        with pytest.raises(InternalServerError):
            app.handle_exception(app.app_context(), Exception("Test Exception"))

def test_handle_exception_with_propagate(app):
    app.config['PROPAGATE_EXCEPTIONS'] = True
    with app.test_request_context('/'):
        with pytest.raises(Exception) as exc_info:
            app.handle_exception(app.app_context(), Exception("Test Exception"))
        assert str(exc_info.value) == "Test Exception"

def test_handle_exception_with_custom_handler(app):
    @app.errorhandler(InternalServerError)
    def custom_error_handler(e):
        return "Custom Error Handler", 500

    with app.test_request_context('/'):
        response = app.handle_exception(app.app_context(), Exception("Test Exception"))
        assert response[0] == "Custom Error Handler"
        assert response[1] == 500

def test_handle_exception_logging(app, caplog):
    with app.test_request_context('/'):
        app.handle_exception(app.app_context(), Exception("Test Exception"))
        assert "Test Exception" in caplog.text
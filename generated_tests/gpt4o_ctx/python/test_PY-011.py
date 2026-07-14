import pytest
from flask.app import Flask, AppContext
from werkzeug.exceptions import InternalServerError

@pytest.fixture
def app():
    app = Flask(__name__)
    app.config["PROPAGATE_EXCEPTIONS"] = False
    return app

@pytest.fixture
def app_context(app):
    with app.app_context() as ctx:
        yield ctx

def test_handle_exception_logs_error(app_context):
    with pytest.raises(InternalServerError):
        app_context.handle_exception(app_context, Exception("Test Exception"))

def test_handle_exception_propagates_error(app_context):
    app_context.config["PROPAGATE_EXCEPTIONS"] = True
    with pytest.raises(Exception) as exc_info:
        app_context.handle_exception(app_context, Exception("Test Exception"))
    assert str(exc_info.value) == "Test Exception"

def test_handle_exception_with_custom_handler(app):
    @app.errorhandler(InternalServerError)
    def custom_error_handler(e):
        return "Custom Error", 500

    with app.app_context():
        response = app.handle_exception(app.app_context, Exception("Test Exception"))
        assert response[0] == "Custom Error"
        assert response[1] == 500

def test_handle_exception_without_handler(app_context):
    app_context.config["PROPAGATE_EXCEPTIONS"] = False
    with pytest.raises(InternalServerError):
        app_context.handle_exception(app_context, Exception("Test Exception"))
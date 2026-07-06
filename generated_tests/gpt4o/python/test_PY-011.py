import pytest
from flask import Flask, request
from flask.app import AppContext, handle_exception
from werkzeug.exceptions import InternalServerError

app = Flask(__name__)

@app.errorhandler(InternalServerError)
def handle_internal_error(e):
    return "Internal Server Error", 500

def test_handle_exception_propagate():
    with app.app_context():
        with pytest.raises(Exception) as excinfo:
            handle_exception(app, AppContext(), Exception("Test Exception"))
        assert str(excinfo.value) == "Test Exception"

def test_handle_exception_no_propagate():
    app.config["PROPAGATE_EXCEPTIONS"] = False
    with app.app_context():
        response = handle_exception(app, AppContext(), Exception("Test Exception"))
        assert response.status_code == 500
        assert response.data.decode() == "Internal Server Error"

def test_handle_exception_with_custom_handler():
    @app.errorhandler(InternalServerError)
    def custom_handler(e):
        return "Custom Error Handler", 500

    with app.app_context():
        response = handle_exception(app, AppContext(), Exception("Test Exception"))
        assert response.status_code == 500
        assert response.data.decode() == "Custom Error Handler"
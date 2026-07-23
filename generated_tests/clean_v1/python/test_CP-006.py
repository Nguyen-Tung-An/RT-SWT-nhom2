import pytest
from flask import Flask, request
from flask.app import AppContext, handle_exception
from werkzeug.exceptions import InternalServerError

app = Flask(__name__)

@app.errorhandler(InternalServerError)
def handle_internal_error(e):
    return "Handled Internal Server Error", 500

def test_handle_exception_propagate():
    with app.app_context():
        with pytest.raises(Exception) as excinfo:
            handle_exception(app, Exception("Test Exception"))
        assert str(excinfo.value) == "Test Exception"

def test_handle_exception_no_propagate():
    app.config["PROPAGATE_EXCEPTIONS"] = False
    with app.app_context():
        response = handle_exception(app, Exception("Test Exception"))
        assert response.status_code == 500
        assert response.data.decode() == "Handled Internal Server Error"

def test_handle_exception_with_active_exception():
    app.config["PROPAGATE_EXCEPTIONS"] = False
    with app.app_context():
        try:
            raise Exception("Active Exception")
        except Exception as e:
            response = handle_exception(app, e)
            assert response.status_code == 500
            assert response.data.decode() == "Handled Internal Server Error"

def test_handle_exception_with_no_error_handler():
    app.config["PROPAGATE_EXCEPTIONS"] = False
    app.error_handler_spec[None][500] = None  # Remove the error handler
    with app.app_context():
        response = handle_exception(app, Exception("Test Exception"))
        assert response.status_code == 500
        assert response.data.decode() == "Handled Internal Server Error"
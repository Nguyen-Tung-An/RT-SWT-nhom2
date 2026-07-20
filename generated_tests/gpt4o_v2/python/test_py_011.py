import pytest
from flask import Flask, jsonify
from werkzeug.exceptions import InternalServerError

class TestFlaskHandleException:
    @pytest.fixture
    def app(self):
        app = Flask(__name__)
        yield app

    def test_handle_exception_propagate_true(self, app):
        app.config["PROPAGATE_EXCEPTIONS"] = True
        with pytest.raises(ValueError) as excinfo:
            app.handle_exception(None, ValueError("Test error"))
        assert str(excinfo.value) == "Test error"

    def test_handle_exception_propagate_false(self, app):
        app.config["PROPAGATE_EXCEPTIONS"] = False
        response = app.handle_exception(None, ValueError("Test error"))
        assert isinstance(response, InternalServerError)
        assert response.original_exception.args[0] == "Test error"

    def test_handle_exception_with_custom_handler(self, app):
        @app.errorhandler(InternalServerError)
        def custom_error_handler(e):
            return jsonify({"error": "Custom error handler"}), 500

        app.config["PROPAGATE_EXCEPTIONS"] = False
        response = app.handle_exception(None, ValueError("Test error"))
        assert response.get_json() == {"error": "Custom error handler"}

    def test_handle_exception_no_handler(self, app):
        app.config["PROPAGATE_EXCEPTIONS"] = False
        response = app.handle_exception(None, ValueError("Test error"))
        assert response.status_code == 500
        assert response.original_exception.args[0] == "Test error"
import pytest
from flask import Flask
from werkzeug.exceptions import InternalServerError

class TestFlaskHandleException:
    @pytest.fixture
    def app(self):
        return Flask(import_name="test_app")

    def test_handle_exception_propagate_true(self, app):
        with app.test_request_context('/'):
            with pytest.raises(ValueError) as excinfo:
                app.handle_exception(app.app_context(), ValueError("Test error"))
            assert str(excinfo.value) == "Test error"

    def test_handle_exception_propagate_false(self, app):
        app.config["PROPAGATE_EXCEPTIONS"] = False
        with app.test_request_context('/'):
            response = app.handle_exception(app.app_context(), ValueError("Test error"))
            assert isinstance(response, InternalServerError)
            assert response.original_exception.args[0] == "Test error"

    def test_handle_exception_with_custom_handler(self, app):
        app.config["PROPAGATE_EXCEPTIONS"] = False

        @app.errorhandler(InternalServerError)
        def custom_error_handler(e):
            return "Custom Error Handler", 500

        with app.test_request_context('/'):
            response = app.handle_exception(app.app_context(), ValueError("Test error"))
            assert response[0] == "Custom Error Handler"
            assert response[1] == 500

    def test_handle_exception_no_handler(self, app):
        app.config["PROPAGATE_EXCEPTIONS"] = False
        with app.test_request_context('/'):
            response = app.handle_exception(app.app_context(), ValueError("Test error"))
            assert isinstance(response, InternalServerError)
            assert response.original_exception.args[0] == "Test error"
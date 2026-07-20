import pytest
from flask.sansio.app import App

class TestFindErrorHandler:
    def setup_method(self):
        self.app = App()
        self.app.error_handler_spec = {
            None: {404: {}, 500: {}},
            'blueprint1': {404: {ValueError: lambda x: "ValueError handler"}, 500: {}},
            'blueprint2': {404: {}, 500: {TypeError: lambda x: "TypeError handler"}},
        }

    def test_find_value_error_handler_in_blueprint(self):
        result = self.app._find_error_handler(ValueError("Not found"), ['blueprint1'])
        assert result("test") == "ValueError handler"

    def test_find_type_error_handler_in_blueprint(self):
        result = self.app._find_error_handler(TypeError("Server error"), ['blueprint2'])
        assert result("test") == "TypeError handler"

    def test_find_no_handler_for_exception(self):
        result = self.app._find_error_handler(KeyError("No handler"), ['blueprint1'])
        assert result is None

    def test_find_handler_with_no_code(self):
        result = self.app._find_error_handler(ValueError("Not found"), ['blueprint2'])
        assert result is None

    def test_find_handler_with_app_level(self):
        self.app.error_handler_spec[None][404] = {ValueError: lambda x: "App ValueError handler"}
        result = self.app._find_error_handler(ValueError("Not found"), [])
        assert result("test") == "App ValueError handler"

    def test_find_handler_with_multiple_blueprints(self):
        result = self.app._find_error_handler(ValueError("Not found"), ['blueprint1', 'blueprint2'])
        assert result("test") == "ValueError handler"

    def test_find_handler_with_none_blueprint(self):
        result = self.app._find_error_handler(ValueError("Not found"), [None])
        assert result is None

    def test_find_handler_with_nonexistent_code(self):
        result = self.app._find_error_handler(Exception("Unknown error"), ['blueprint1'])
        assert result is None
import pytest
from flask.cli import locate_app
from flask import Flask

# Mocking the find_best_app and find_app_by_string functions for testing
def find_best_app(module):
    return Flask(__name__)

def find_app_by_string(module, app_name):
    if app_name == "valid_app":
        return Flask(__name__)
    raise ValueError("App not found")

# Test class for locate_app
class TestLocateApp:
    def test_locate_app_valid_module_no_app(self):
        assert isinstance(locate_app('flask', None, True), Flask)

    def test_locate_app_valid_module_valid_app(self):
        assert isinstance(locate_app('flask', 'valid_app', True), Flask)

    def test_locate_app_valid_module_invalid_app(self):
        with pytest.raises(ValueError, match="App not found"):
            locate_app('flask', 'invalid_app', True)

    def test_locate_app_invalid_module(self):
        with pytest.raises(Exception, match="Could not import 'invalid_module'"):
            locate_app('invalid_module', None, True)

    def test_locate_app_invalid_module_no_raise(self):
        result = locate_app('invalid_module', None, False)
        assert result is None

    def test_locate_app_import_error_with_traceback(self):
        with pytest.raises(Exception) as exc_info:
            locate_app('invalid_module', None, True)
        assert "While importing 'invalid_module'" in str(exc_info.value)

    def test_locate_app_import_error_no_traceback(self):
        with pytest.raises(Exception) as exc_info:
            locate_app('invalid_module', None, True)
        assert "Could not import 'invalid_module'" in str(exc_info.value)
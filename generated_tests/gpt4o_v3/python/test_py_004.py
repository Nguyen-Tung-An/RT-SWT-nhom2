import pytest
from flask.cli import locate_app
from flask import Flask

# Assuming we have a test module named 'test_module' with a Flask app
# and a test module that does not exist to test the ImportError handling.

# Create a simple Flask app for testing
app = Flask(__name__)

# This will be the module we will import
# In a real scenario, this should be in a separate file named test_module.py
import sys
import types
sys.modules['test_module'] = types.ModuleType('test_module')
sys.modules['test_module'].app = app

class TestLocateApp:
    def test_locate_app_valid(self):
        result = locate_app('test_module', 'app')
        assert result is app

    def test_locate_app_none_app_name(self):
        result = locate_app('test_module', None)
        assert result is app

    def test_locate_app_invalid_module(self):
        with pytest.raises(Exception) as excinfo:
            locate_app('invalid_module', 'app')
        assert "Could not import 'invalid_module'" in str(excinfo.value)

    def test_locate_app_invalid_app_name(self):
        with pytest.raises(Exception) as excinfo:
            locate_app('test_module', 'invalid_app')
        assert "No app found" in str(excinfo.value)

    def test_locate_app_no_raise_if_not_found(self):
        result = locate_app('invalid_module', 'app', raise_if_not_found=False)
        assert result is None
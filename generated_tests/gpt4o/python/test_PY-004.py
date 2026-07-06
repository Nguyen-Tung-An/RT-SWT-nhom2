import pytest
from flask.cli import locate_app
from flask import Flask

class NoAppException(Exception):
    pass

def find_best_app(module):
    return Flask(__name__)

def find_app_by_string(module, app_name):
    if app_name == "my_app":
        return Flask(app_name)
    raise NoAppException(f"App '{app_name}' not found.")

def test_locate_app_import_error():
    with pytest.raises(NoAppException, match="Could not import 'non_existent_module'."):
        locate_app("non_existent_module", None)

def test_locate_app_import_error_with_trace():
    with pytest.raises(NoAppException) as excinfo:
        locate_app("non_existent_module", None)
    assert "While importing 'non_existent_module'" in str(excinfo.value)

def test_locate_app_no_app_name():
    app = locate_app(__name__, None)
    assert isinstance(app, Flask)

def test_locate_app_with_valid_app_name():
    app = locate_app(__name__, "my_app")
    assert isinstance(app, Flask)
    assert app.name == "my_app"

def test_locate_app_with_invalid_app_name():
    with pytest.raises(NoAppException, match="App 'invalid_app' not found."):
        locate_app(__name__, "invalid_app")
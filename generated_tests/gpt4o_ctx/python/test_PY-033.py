import pytest
from flask.cli import ScriptInfo
from flask import Flask

def mock_create_app():
    return Flask(__name__)

def test_load_app_with_create_app():
    script_info = ScriptInfo(app_import_path=None, create_app=mock_create_app, set_debug_flag=False)
    app = script_info.load_app()
    assert app is not None
    assert isinstance(app, Flask)

def test_load_app_with_app_import_path():
    script_info = ScriptInfo(app_import_path='myapp:app', create_app=None, set_debug_flag=False)
    # Mocking the prepare_import and locate_app functions
    with pytest.mock.patch('flask.cli.prepare_import', return_value='myapp'):
        with pytest.mock.patch('flask.cli.locate_app', return_value=Flask(__name__)):
            app = script_info.load_app()
            assert app is not None
            assert isinstance(app, Flask)

def test_load_app_with_no_app_found():
    script_info = ScriptInfo(app_import_path=None, create_app=None, set_debug_flag=False)
    with pytest.mock.patch('flask.cli.locate_app', return_value=None):
        with pytest.raises(NoAppException):
            script_info.load_app()

def test_load_app_with_debug_flag():
    script_info = ScriptInfo(app_import_path=None, create_app=mock_create_app, set_debug_flag=True)
    app = script_info.load_app()
    assert app.debug is True
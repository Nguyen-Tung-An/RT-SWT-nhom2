import pytest
from flask import Flask
from flask.cli import ScriptInfo
from unittest.mock import patch

def create_app():
    return Flask('test_app')

def test_load_app_with_create_app():
    script_info = ScriptInfo(create_app=create_app)
    app = script_info.load_app()
    assert isinstance(app, Flask)
    assert app.name == 'test_app'

def test_load_app_with_app_import_path():
    script_info = ScriptInfo(app_import_path='my_module:my_app')
    with patch('flask.cli.locate_app') as mock_locate_app:
        mock_locate_app.return_value = Flask('imported_app')
        app = script_info.load_app()
        assert isinstance(app, Flask)
        assert app.name == 'imported_app'
        mock_locate_app.assert_called_once()

def test_load_app_with_no_app_import_path():
    script_info = ScriptInfo(app_import_path=None)
    with patch('flask.cli.locate_app') as mock_locate_app:
        mock_locate_app.side_effect = [None, Flask('app.py_app')]
        app = script_info.load_app()
        assert isinstance(app, Flask)
        assert app.name == 'app.py_app'
        assert mock_locate_app.call_count == 2

def test_load_app_raises_no_app_exception():
    script_info = ScriptInfo(app_import_path=None)
    with patch('flask.cli.locate_app', return_value=None):
        with pytest.raises(Exception, match="Could not locate a Flask application"):
            script_info.load_app()

def test_load_app_returns_already_loaded_app():
    script_info = ScriptInfo(create_app=create_app)
    app1 = script_info.load_app()
    app2 = script_info.load_app()
    assert app1 is app2
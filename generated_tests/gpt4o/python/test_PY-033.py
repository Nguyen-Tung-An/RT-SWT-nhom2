import pytest
from flask.cli import load_app
from unittest.mock import MagicMock, patch
from flask import Flask

class MockFlaskCLI:
    def __init__(self, create_app=None, app_import_path=None, set_debug_flag=False):
        self.create_app = create_app
        self.app_import_path = app_import_path
        self.set_debug_flag = set_debug_flag
        self._loaded_app = None

def mock_create_app():
    return Flask(__name__)

def test_load_app_with_create_app():
    cli = MockFlaskCLI(create_app=mock_create_app)
    app = cli.load_app()
    assert isinstance(app, Flask)
    assert cli._loaded_app is app

def test_load_app_with_app_import_path():
    cli = MockFlaskCLI(app_import_path='module:app')
    with patch('flask.cli.locate_app') as mock_locate_app:
        mock_locate_app.return_value = Flask(__name__)
        app = cli.load_app()
        assert isinstance(app, Flask)
        assert cli._loaded_app is app
        mock_locate_app.assert_called_once()

def test_load_app_with_no_app_found():
    cli = MockFlaskCLI()
    with pytest.raises(NoAppException):
        cli.load_app()

def test_load_app_with_debug_flag():
    cli = MockFlaskCLI(create_app=mock_create_app, set_debug_flag=True)
    with patch('flask.cli.get_debug_flag', return_value=True):
        app = cli.load_app()
        assert app.debug is True
        assert cli._loaded_app is app

def test_load_app_returns_existing_app():
    cli = MockFlaskCLI(create_app=mock_create_app)
    app1 = cli.load_app()
    app2 = cli.load_app()
    assert app1 is app2
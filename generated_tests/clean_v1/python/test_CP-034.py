import pytest
from flask.cli import load_app
from unittest.mock import MagicMock, patch

class TestLoadApp:
    @patch('flask.cli.locate_app')
    @patch('flask.cli.prepare_import')
    def test_load_app_with_create_app(self, mock_prepare_import, mock_locate_app):
        mock_create_app = MagicMock(return_value='mock_app')
        cli_instance = MagicMock(create_app=mock_create_app, _loaded_app=None)
        app = load_app(cli_instance)
        assert app == 'mock_app'
        mock_create_app.assert_called_once()

    @patch('flask.cli.locate_app')
    @patch('flask.cli.prepare_import')
    def test_load_app_with_app_import_path(self, mock_prepare_import, mock_locate_app):
        cli_instance = MagicMock(app_import_path='module:app', _loaded_app=None)
        mock_prepare_import.return_value = 'mock_import'
        mock_locate_app.return_value = 'mock_app'
        app = load_app(cli_instance)
        assert app == 'mock_app'
        mock_prepare_import.assert_called_once_with('module')
        mock_locate_app.assert_called_once_with('mock_import', 'app')

    @patch('flask.cli.locate_app')
    @patch('flask.cli.prepare_import')
    def test_load_app_with_default_paths(self, mock_prepare_import, mock_locate_app):
        cli_instance = MagicMock(app_import_path=None, _loaded_app=None)
        mock_prepare_import.side_effect = ['mock_import_wsgi', 'mock_import_app']
        mock_locate_app.side_effect = [None, 'mock_app']
        app = load_app(cli_instance)
        assert app == 'mock_app'
        mock_prepare_import.assert_any_call('wsgi.py')
        mock_prepare_import.assert_any_call('app.py')

    def test_load_app_no_app_found(self):
        cli_instance = MagicMock(app_import_path=None, _loaded_app=None)
        with pytest.raises(Exception, match="Could not locate a Flask application."):
            load_app(cli_instance)
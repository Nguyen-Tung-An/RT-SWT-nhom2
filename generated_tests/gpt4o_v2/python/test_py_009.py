import pytest
from flask.cli import run_command
from unittest.mock import MagicMock, patch

class TestRunCommand:
    @patch('flask.cli.is_running_from_reloader', return_value=False)
    @patch('flask.cli.get_debug_flag', return_value=False)
    @patch('flask.cli.show_server_banner')
    @patch('flask.cli.run_simple')
    def test_run_command_no_reload_no_debugger(self, mock_run_simple, mock_show_server_banner, mock_get_debug_flag, mock_is_running_from_reloader):
        info = MagicMock()
        info.load_app.return_value = MagicMock()
        run_command(info, '127.0.0.1', 5000, False, False, False, None, None, None)
        mock_show_server_banner.assert_called_once_with(False, info.app_import_path)
        mock_run_simple.assert_called_once_with('127.0.0.1', 5000, info.load_app(), use_reloader=False, use_debugger=False, threaded=False, ssl_context=None, extra_files=None, exclude_patterns=None)

    @patch('flask.cli.is_running_from_reloader', return_value=True)
    @patch('flask.cli.get_debug_flag', return_value=True)
    @patch('flask.cli.show_server_banner')
    @patch('flask.cli.run_simple')
    def test_run_command_with_reload_and_debugger(self, mock_run_simple, mock_show_server_banner, mock_get_debug_flag, mock_is_running_from_reloader):
        info = MagicMock()
        info.load_app.return_value = MagicMock()
        run_command(info, '127.0.0.1', 5000, True, True, True, None, None, None)
        mock_show_server_banner.assert_called_once_with(True, info.app_import_path)
        mock_run_simple.assert_called_once_with('127.0.0.1', 5000, info.load_app(), use_reloader=True, use_debugger=True, threaded=True, ssl_context=None, extra_files=None, exclude_patterns=None)

    @patch('flask.cli.is_running_from_reloader', return_value=False)
    @patch('flask.cli.get_debug_flag', return_value=False)
    @patch('flask.cli.show_server_banner')
    @patch('flask.cli.run_simple')
    def test_run_command_with_ssl_context(self, mock_run_simple, mock_show_server_banner, mock_get_debug_flag, mock_is_running_from_reloader):
        info = MagicMock()
        info.load_app.return_value = MagicMock()
        cert = ('cert.pem', 'key.pem')
        run_command(info, '127.0.0.1', 5000, False, False, False, cert, None, None)
        mock_run_simple.assert_called_once_with('127.0.0.1', 5000, info.load_app(), use_reloader=False, use_debugger=False, threaded=False, ssl_context=cert, extra_files=None, exclude_patterns=None)

    @patch('flask.cli.is_running_from_reloader', return_value=False)
    @patch('flask.cli.get_debug_flag', return_value=False)
    def test_run_command_load_app_exception(self, mock_get_debug_flag, mock_is_running_from_reloader):
        info = MagicMock()
        info.load_app.side_effect = Exception("Load app failed")
        with pytest.raises(Exception, match="Load app failed"):
            run_command(info, '127.0.0.1', 5000, False, False, False, None, None, None)

    @patch('flask.cli.is_running_from_reloader', return_value=True)
    @patch('flask.cli.get_debug_flag', return_value=False)
    def test_run_command_load_app_exception_reloader(self, mock_get_debug_flag, mock_is_running_from_reloader):
        info = MagicMock()
        info.load_app.side_effect = Exception("Load app failed")
        with pytest.raises(Exception, match="Load app failed"):
            run_command(info, '127.0.0.1', 5000, True, False, False, None, None, None)
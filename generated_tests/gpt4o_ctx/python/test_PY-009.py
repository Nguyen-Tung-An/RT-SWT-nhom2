import pytest
from flask.cli import run_command
from unittest.mock import MagicMock, patch

@pytest.fixture
def mock_script_info():
    info = MagicMock()
    info.load_app.return_value = MagicMock()
    return info

def test_run_command_with_default_values(mock_script_info):
    run_command(mock_script_info, '127.0.0.1', 5000, None, None, False, None, None, None)

def test_run_command_with_custom_values(mock_script_info):
    run_command(mock_script_info, '0.0.0.0', 8000, True, True, True, None, ['file1.py'], ['pattern1'])

def test_run_command_with_ssl_context(mock_script_info):
    ssl_context = ('cert.pem', 'key.pem')
    run_command(mock_script_info, '127.0.0.1', 5000, False, False, False, ssl_context, None, None)

def test_run_command_with_reload_and_debug(mock_script_info):
    with patch('flask.cli.get_debug_flag', return_value=True):
        run_command(mock_script_info, '127.0.0.1', 5000, None, None, False, None, None, None)

def test_run_command_load_app_exception(mock_script_info):
    mock_script_info.load_app.side_effect = Exception("App loading failed")
    with pytest.raises(Exception, match="App loading failed"):
        run_command(mock_script_info, '127.0.0.1', 5000, None, None, False, None, None, None)

def test_run_command_with_reloader(mock_script_info):
    with patch('flask.cli.is_running_from_reloader', return_value=True):
        with patch('flask.cli.traceback.print_exc') as mock_print_exc:
            mock_script_info.load_app.side_effect = Exception("Reload error")
            run_command(mock_script_info, '127.0.0.1', 5000, None, None, False, None, None, None)
            mock_print_exc.assert_called_once()
import pytest
from flask.cli import run_command
from unittest.mock import MagicMock, patch

@pytest.fixture
def mock_script_info():
    mock_info = MagicMock()
    mock_info.load_app.return_value = MagicMock()
    return mock_info

def test_run_command_success(mock_script_info):
    run_command(mock_script_info, '127.0.0.1', 5000, True, True, True, None, None, None)

def test_run_command_no_reload(mock_script_info):
    run_command(mock_script_info, '127.0.0.1', 5000, False, True, True, None, None, None)

def test_run_command_no_debugger(mock_script_info):
    run_command(mock_script_info, '127.0.0.1', 5000, True, False, True, None, None, None)

def test_run_command_with_ssl(mock_script_info):
    cert = ('cert.pem', 'key.pem')
    run_command(mock_script_info, '127.0.0.1', 5000, True, True, True, cert, None, None)

def test_run_command_load_app_exception(mock_script_info):
    mock_script_info.load_app.side_effect = Exception("App loading failed")
    with pytest.raises(Exception, match="App loading failed"):
        run_command(mock_script_info, '127.0.0.1', 5000, True, True, True, None, None, None)

def test_run_command_reload_exception(mock_script_info):
    mock_script_info.load_app.side_effect = Exception("App loading failed")
    with patch('flask.cli.is_running_from_reloader', return_value=True):
        with pytest.raises(Exception, match="App loading failed"):
            run_command(mock_script_info, '127.0.0.1', 5000, True, True, True, None, None, None)
import pytest
from flask.cli import run_command
from unittest.mock import MagicMock, patch

@pytest.fixture
def mock_info():
    mock = MagicMock()
    mock.load_app.return_value = MagicMock()
    return mock

def test_run_command_no_reload_no_debugger(mock_info):
    with patch('flask.cli.run_simple') as mock_run_simple:
        run_command(mock_info, '127.0.0.1', 5000, None, None, False, None, None, None)
        mock_run_simple.assert_called_once()

def test_run_command_with_reload(mock_info):
    with patch('flask.cli.run_simple') as mock_run_simple:
        run_command(mock_info, '127.0.0.1', 5000, True, None, False, None, None, None)
        mock_run_simple.assert_called_once()

def test_run_command_with_debugger(mock_info):
    with patch('flask.cli.run_simple') as mock_run_simple:
        run_command(mock_info, '127.0.0.1', 5000, None, True, False, None, None, None)
        mock_run_simple.assert_called_once()

def test_run_command_with_ssl(mock_info):
    cert = ('cert.pem', 'key.pem')
    with patch('flask.cli.run_simple') as mock_run_simple:
        run_command(mock_info, '127.0.0.1', 5000, None, None, False, cert, None, None)
        mock_run_simple.assert_called_once()

def test_run_command_with_extra_files(mock_info):
    extra_files = ['file1.txt', 'file2.txt']
    with patch('flask.cli.run_simple') as mock_run_simple:
        run_command(mock_info, '127.0.0.1', 5000, None, None, False, None, extra_files, None)
        mock_run_simple.assert_called_once()

def test_run_command_with_exclude_patterns(mock_info):
    exclude_patterns = ['*.pyc', '*.log']
    with patch('flask.cli.run_simple') as mock_run_simple:
        run_command(mock_info, '127.0.0.1', 5000, None, None, False, None, None, exclude_patterns)
        mock_run_simple.assert_called_once()

def test_run_command_load_app_exception(mock_info):
    mock_info.load_app.side_effect = Exception("App loading failed")
    with pytest.raises(Exception, match="App loading failed"):
        run_command(mock_info, '127.0.0.1', 5000, None, None, False, None, None, None)

def test_run_command_reload_exception(mock_info):
    mock_info.load_app.side_effect = Exception("App loading failed")
    with patch('flask.cli.is_running_from_reloader', return_value=True):
        with pytest.raises(Exception, match="App loading failed"):
            run_command(mock_info, '127.0.0.1', 5000, None, None, False, None, None, None)
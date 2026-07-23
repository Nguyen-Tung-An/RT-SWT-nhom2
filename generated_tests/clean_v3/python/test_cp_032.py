import pytest
import ssl
from flask.cli import run_command
from flask import Flask
from werkzeug.serving import run_simple
from unittest.mock import patch

@pytest.fixture
def app():
    app = Flask(__name__)
    return app

@pytest.fixture
def script_info(app):
    from flask.cli import ScriptInfo
    return ScriptInfo(create_app=lambda: app, name='test')

def test_run_command_success(script_info):
    with patch('flask.cli.run_simple') as mock_run_simple:
        run_command(script_info, '127.0.0.1', 5000, reload=False, debugger=False, with_threads=False, cert=None, extra_files=None, exclude_patterns=None)
        mock_run_simple.assert_called_once()

def test_run_command_with_reload(script_info):
    with patch('flask.cli.run_simple') as mock_run_simple:
        run_command(script_info, '127.0.0.1', 5000, reload=True, debugger=False, with_threads=False, cert=None, extra_files=None, exclude_patterns=None)
        mock_run_simple.assert_called_once()

def test_run_command_with_debugger(script_info):
    with patch('flask.cli.run_simple') as mock_run_simple:
        run_command(script_info, '127.0.0.1', 5000, reload=False, debugger=True, with_threads=False, cert=None, extra_files=None, exclude_patterns=None)
        mock_run_simple.assert_called_once()

def test_run_command_with_ssl(script_info):
    cert = ssl.create_default_context()
    with patch('flask.cli.run_simple') as mock_run_simple:
        run_command(script_info, '127.0.0.1', 5000, reload=False, debugger=False, with_threads=False, cert=cert, extra_files=None, exclude_patterns=None)
        mock_run_simple.assert_called_once()

def test_run_command_with_extra_files(script_info):
    with patch('flask.cli.run_simple') as mock_run_simple:
        run_command(script_info, '127.0.0.1', 5000, reload=False, debugger=False, with_threads=False, cert=None, extra_files=['file1.py', 'file2.py'], exclude_patterns=None)
        mock_run_simple.assert_called_once()

def test_run_command_with_exclude_patterns(script_info):
    with patch('flask.cli.run_simple') as mock_run_simple:
        run_command(script_info, '127.0.0.1', 5000, reload=False, debugger=False, with_threads=False, cert=None, extra_files=None, exclude_patterns=['*.pyc'])
        mock_run_simple.assert_called_once()

def test_run_command_load_app_failure(script_info):
    with patch('flask.cli.run_simple') as mock_run_simple:
        with patch.object(script_info, 'load_app', side_effect=Exception("App load failure")):
            with pytest.raises(Exception, match="App load failure"):
                run_command(script_info, '127.0.0.1', 5000, reload=False, debugger=False, with_threads=False, cert=None, extra_files=None, exclude_patterns=None)
            mock_run_simple.assert_not_called()
import pytest
from flask.cli import run_command
from flask import Flask
from werkzeug.serving import run_simple
from unittest.mock import patch

class TestRunCommand:
    @pytest.fixture
    def app_info(self):
        app = Flask(__name__)
        app_import_path = "myapp:app"
        
        class ScriptInfo:
            def load_app(self):
                return app
        
        return ScriptInfo(), app_import_path

    @patch('werkzeug.serving.run_simple')
    def test_run_command_success(self, mock_run_simple, app_info):
        info, app_import_path = app_info
        run_command(info, '127.0.0.1', 5000, reload=False, debugger=False, with_threads=False, cert=None, extra_files=None, exclude_patterns=None)
        mock_run_simple.assert_called_once_with(
            '127.0.0.1', 5000, info.load_app(), use_reloader=False, use_debugger=False, threaded=False, ssl_context=None, extra_files=None, exclude_patterns=None
        )

    @patch('werkzeug.serving.run_simple')
    def test_run_command_with_reload(self, mock_run_simple, app_info):
        info, app_import_path = app_info
        run_command(info, '127.0.0.1', 5000, reload=True, debugger=False, with_threads=False, cert=None, extra_files=None, exclude_patterns=None)
        mock_run_simple.assert_called_once_with(
            '127.0.0.1', 5000, info.load_app(), use_reloader=True, use_debugger=False, threaded=False, ssl_context=None, extra_files=None, exclude_patterns=None
        )

    @patch('werkzeug.serving.run_simple')
    def test_run_command_with_debugger(self, mock_run_simple, app_info):
        info, app_import_path = app_info
        run_command(info, '127.0.0.1', 5000, reload=False, debugger=True, with_threads=False, cert=None, extra_files=None, exclude_patterns=None)
        mock_run_simple.assert_called_once_with(
            '127.0.0.1', 5000, info.load_app(), use_reloader=False, use_debugger=True, threaded=False, ssl_context=None, extra_files=None, exclude_patterns=None
        )

    @patch('werkzeug.serving.run_simple')
    def test_run_command_with_ssl(self, mock_run_simple, app_info):
        info, app_import_path = app_info
        cert = ('cert.pem', 'key.pem')
        run_command(info, '127.0.0.1', 5000, reload=False, debugger=False, with_threads=False, cert=cert, extra_files=None, exclude_patterns=None)
        mock_run_simple.assert_called_once_with(
            '127.0.0.1', 5000, info.load_app(), use_reloader=False, use_debugger=False, threaded=False, ssl_context=cert, extra_files=None, exclude_patterns=None
        )

    @patch('werkzeug.serving.run_simple')
    def test_run_command_with_extra_files(self, mock_run_simple, app_info):
        info, app_import_path = app_info
        extra_files = ['file1.txt', 'file2.txt']
        run_command(info, '127.0.0.1', 5000, reload=False, debugger=False, with_threads=False, cert=None, extra_files=extra_files, exclude_patterns=None)
        mock_run_simple.assert_called_once_with(
            '127.0.0.1', 5000, info.load_app(), use_reloader=False, use_debugger=False, threaded=False, ssl_context=None, extra_files=extra_files, exclude_patterns=None
        )

    @patch('werkzeug.serving.run_simple')
    def test_run_command_with_exclude_patterns(self, mock_run_simple, app_info):
        info, app_import_path = app_info
        exclude_patterns = ['*.pyc', '*.tmp']
        run_command(info, '127.0.0.1', 5000, reload=False, debugger=False, with_threads=False, cert=None, extra_files=None, exclude_patterns=exclude_patterns)
        mock_run_simple.assert_called_once_with(
            '127.0.0.1', 5000, info.load_app(), use_reloader=False, use_debugger=False, threaded=False, ssl_context=None, extra_files=None, exclude_patterns=exclude_patterns
        )

    @pytest.mark.parametrize("reload,debugger", [(None, None), (True, None), (None, True)])
    @patch('werkzeug.serving.run_simple')
    def test_run_command_with_none_reload_debugger(self, mock_run_simple, app_info, reload, debugger):
        info, app_import_path = app_info
        run_command(info, '127.0.0.1', 5000, reload=reload, debugger=debugger, with_threads=False, cert=None, extra_files=None, exclude_patterns=None)
        mock_run_simple.assert_called_once_with(
            '127.0.0.1', 5000, info.load_app(), use_reloader=(reload if reload is not None else False), use_debugger=(debugger if debugger is not None else False), threaded=False, ssl_context=None, extra_files=None, exclude_patterns=None
        )
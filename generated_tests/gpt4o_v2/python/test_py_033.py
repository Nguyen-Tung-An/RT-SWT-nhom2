import pytest
from flask import Flask
from flask.cli import ScriptInfo
from unittest.mock import patch

class TestLoadApp:
    @pytest.fixture
    def script_info(self):
        return ScriptInfo()

    def test_load_app_with_loaded_app(self, script_info):
        script_info._loaded_app = Flask(__name__)
        app = script_info.load_app()
        assert app is script_info._loaded_app

    def test_load_app_with_create_app(self, script_info):
        script_info.create_app = lambda: Flask(__name__)
        app = script_info.load_app()
        assert isinstance(app, Flask)

    def test_load_app_with_app_import_path(self, script_info):
        script_info.app_import_path = "my_module:app"
        with patch('flask.cli.prepare_import') as mock_prepare_import, \
             patch('flask.cli.locate_app') as mock_locate_app:
            mock_prepare_import.return_value = "my_module"
            mock_locate_app.return_value = Flask(__name__)
            app = script_info.load_app()
            mock_prepare_import.assert_called_once_with("my_module")
            mock_locate_app.assert_called_once_with("my_module", "app")
            assert isinstance(app, Flask)

    def test_load_app_with_no_app_found(self, script_info):
        script_info.app_import_path = "non_existent_module:app"
        with patch('flask.cli.prepare_import') as mock_prepare_import, \
             patch('flask.cli.locate_app') as mock_locate_app:
            mock_prepare_import.return_value = "non_existent_module"
            mock_locate_app.return_value = None
            with pytest.raises(NoAppException):
                script_info.load_app()

    def test_load_app_with_default_paths(self, script_info):
        script_info.app_import_path = None
        with patch('flask.cli.prepare_import') as mock_prepare_import, \
             patch('flask.cli.locate_app') as mock_locate_app:
            mock_prepare_import.side_effect = ["wsgi.py", "app.py"]
            mock_locate_app.side_effect = [None, Flask(__name__)]
            app = script_info.load_app()
            mock_prepare_import.assert_any_call("wsgi.py")
            mock_prepare_import.assert_any_call("app.py")
            assert isinstance(app, Flask)

    def test_load_app_with_debug_flag(self, script_info):
        script_info.set_debug_flag = True
        script_info.create_app = lambda: Flask(__name__)
        app = script_info.load_app()
        assert app.debug is True
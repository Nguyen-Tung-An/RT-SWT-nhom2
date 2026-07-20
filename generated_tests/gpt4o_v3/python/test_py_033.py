import pytest
import flask
from flask.cli import ScriptInfo
from flask import Flask

class TestLoadApp:
    def test_load_app_with_create_app(self):
        app = Flask('test_app')
        script_info = ScriptInfo(create_app=lambda: app)
        with app.test_request_context('/'):
            loaded_app = script_info.load_app()
            assert loaded_app is app

    def test_load_app_with_app_import_path(self, monkeypatch):
        app = Flask('test_app')
        monkeypatch.setattr('flask.cli.locate_app', lambda import_name, name: app)
        script_info = ScriptInfo(app_import_path='module_name:app_name')
        with app.test_request_context('/'):
            loaded_app = script_info.load_app()
            assert loaded_app is app

    def test_load_app_with_no_app_found(self, monkeypatch):
        script_info = ScriptInfo(app_import_path='non_existent_module:app_name')
        monkeypatch.setattr('flask.cli.locate_app', lambda import_name, name: None)
        with pytest.raises(Exception, match="Could not locate a Flask application"):
            script_info.load_app()

    def test_load_app_with_default_paths(self, monkeypatch):
        app = Flask('test_app')
        monkeypatch.setattr('flask.cli.locate_app', lambda import_name, name: app)
        script_info = ScriptInfo(app_import_path=None)
        with app.test_request_context('/'):
            loaded_app = script_info.load_app()
            assert loaded_app is app

    def test_load_app_multiple_calls(self):
        app = Flask('test_app')
        script_info = ScriptInfo(create_app=lambda: app)
        with app.test_request_context('/'):
            first_load = script_info.load_app()
            second_load = script_info.load_app()
            assert first_load is second_load
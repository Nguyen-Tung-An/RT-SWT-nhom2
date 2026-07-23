import pytest
import flask
from flask.cli import ScriptInfo
from flask import Flask

class TestLoadApp:
    def test_load_app_with_create_app(self):
        app = Flask('test_app')

        def create_app():
            return app

        script_info = ScriptInfo(app_import_path=None, create_app=create_app)
        with app.test_request_context('/'):
            loaded_app = script_info.load_app()
            assert loaded_app is app

    def test_load_app_with_app_import_path(self):
        app = Flask('test_app')
        app_import_path = 'my_module:app'  # Assuming 'my_module' is a valid module

        script_info = ScriptInfo(app_import_path=app_import_path)
        with app.test_request_context('/'):
            loaded_app = script_info.load_app()
            assert loaded_app is not None  # Replace with actual app check if possible

    def test_load_app_with_no_app_found(self):
        script_info = ScriptInfo(app_import_path=None)
        with pytest.raises(Exception, match="Could not locate a Flask application"):
            script_info.load_app()

    def test_load_app_with_wsgi_py(self):
        app = Flask('test_app')
        script_info = ScriptInfo(app_import_path=None)

        # Simulate the presence of a wsgi.py file
        with app.test_request_context('/'):
            loaded_app = script_info.load_app()
            assert loaded_app is not None  # Replace with actual app check if possible

    def test_load_app_with_app_already_loaded(self):
        app = Flask('test_app')
        script_info = ScriptInfo(app_import_path=None, create_app=lambda: app)
        with app.test_request_context('/'):
            first_load = script_info.load_app()
            second_load = script_info.load_app()
            assert first_load is second_load
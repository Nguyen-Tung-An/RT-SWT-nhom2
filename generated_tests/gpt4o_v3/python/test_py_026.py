import pytest
from flask import Flask
from flask.sansio.app import App

class TestFindErrorHandler:
    @pytest.fixture
    def app(self):
        return Flask(import_name="test_app")

    @pytest.fixture
    def error_handler_app(self, app):
        app = App(import_name="test_app")
        app.error_handler_spec = {
            None: {404: {KeyError: lambda e: "KeyError handler"}},
            'blueprint1': {404: {ValueError: lambda e: "ValueError handler"}},
            'blueprint2': {500: {Exception: lambda e: "General Exception handler"}},
        }
        return app

    def test_find_error_handler_specific_code_blueprint(self, error_handler_app):
        with error_handler_app.test_request_context('/'):
            handler = error_handler_app._find_error_handler(ValueError("Not found"), ['blueprint1'])
            assert handler == "ValueError handler"

    def test_find_error_handler_specific_code_app(self, error_handler_app):
        with error_handler_app.test_request_context('/'):
            handler = error_handler_app._find_error_handler(KeyError("Key not found"), [None])
            assert handler == "KeyError handler"

    def test_find_error_handler_no_handler(self, error_handler_app):
        with error_handler_app.test_request_context('/'):
            handler = error_handler_app._find_error_handler(IndexError("Index out of range"), ['blueprint1'])
            assert handler is None

    def test_find_error_handler_general_exception(self, error_handler_app):
        with error_handler_app.test_request_context('/'):
            handler = error_handler_app._find_error_handler(Exception("General error"), ['blueprint2'])
            assert handler == "General Exception handler"

    def test_find_error_handler_no_blueprints(self, error_handler_app):
        with error_handler_app.test_request_context('/'):
            handler = error_handler_app._find_error_handler(ValueError("Not found"), [])
            assert handler is None

    def test_find_error_handler_with_none_blueprint(self, error_handler_app):
        with error_handler_app.test_request_context('/'):
            handler = error_handler_app._find_error_handler(Exception("General error"), [None])
            assert handler is None
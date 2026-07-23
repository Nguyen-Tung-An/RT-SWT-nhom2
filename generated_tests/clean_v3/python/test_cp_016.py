import pytest
from flask import Flask, request

class TestFlaskPreprocessRequest:
    @pytest.fixture
    def app(self):
        app = Flask("test_app")
        return app

    def test_preprocess_request_with_url_value_preprocessor(self, app):
        @app.url_value_preprocessor
        def preprocess(endpoint, values):
            return "processed"

        with app.test_request_context('/'):
            result = app.preprocess_request(app.app_context())
            assert result == None  # No before_request function to return a value

    def test_preprocess_request_with_before_request_func(self, app):
        @app.before_request
        def before_request_func():
            return "before_request_value"

        with app.test_request_context('/'):
            result = app.preprocess_request(app.app_context())
            assert result == "before_request_value"

    def test_preprocess_request_with_multiple_before_request_funcs(self, app):
        @app.before_request
        def before_request_func_1():
            return None

        @app.before_request
        def before_request_func_2():
            return "before_request_value"

        with app.test_request_context('/'):
            result = app.preprocess_request(app.app_context())
            assert result == "before_request_value"

    def test_preprocess_request_with_no_preprocessors_or_before_request_funcs(self, app):
        with app.test_request_context('/'):
            result = app.preprocess_request(app.app_context())
            assert result == None  # No preprocessor or before_request function
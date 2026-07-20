import pytest
from flask import Flask, request, jsonify
from flask.ctx import AppContext

class TestFlaskPreprocessRequest:
    @pytest.fixture
    def app(self):
        app = Flask(__name__)

        @app.before_request
        def before_request_func():
            return "Before Request"

        @app.url_value_preprocessor
        def url_value_preprocessor(endpoint, values):
            if endpoint == 'test_view':
                return "Preprocessed"

        return app

    @pytest.fixture
    def client(self, app):
        return app.test_client()

    def test_preprocess_request_with_url_value_preprocessor(self, app):
        with app.app_context():
            ctx = AppContext(app)
            ctx.push()
            request.blueprints = ['test_blueprint']
            request.endpoint = 'test_view'
            request.view_args = {}
            result = app.preprocess_request(ctx)
            assert result == "Preprocessed"
            ctx.pop()

    def test_preprocess_request_with_before_request_func(self, app):
        with app.app_context():
            ctx = AppContext(app)
            ctx.push()
            request.blueprints = ['test_blueprint']
            request.endpoint = 'test_view'
            request.view_args = {}
            result = app.preprocess_request(ctx)
            assert result == "Before Request"
            ctx.pop()

    def test_preprocess_request_no_preprocessors(self, app):
        with app.app_context():
            ctx = AppContext(app)
            ctx.push()
            request.blueprints = []
            request.endpoint = 'test_view'
            request.view_args = {}
            result = app.preprocess_request(ctx)
            assert result is None
            ctx.pop()

    def test_preprocess_request_with_multiple_blueprints(self, app):
        with app.app_context():
            ctx = AppContext(app)
            ctx.push()
            request.blueprints = ['test_blueprint', 'another_blueprint']
            request.endpoint = 'test_view'
            request.view_args = {}
            result = app.preprocess_request(ctx)
            assert result == "Preprocessed"
            ctx.pop()

    def test_preprocess_request_with_no_return_value(self, app):
        with app.app_context():
            ctx = AppContext(app)
            ctx.push()
            request.blueprints = ['test_blueprint']
            request.endpoint = 'test_view'
            request.view_args = {}
            app.before_request_funcs['test_blueprint'] = [lambda: None]
            result = app.preprocess_request(ctx)
            assert result is None
            ctx.pop()
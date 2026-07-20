import pytest
from flask import Flask, request, Blueprint

class TestFlaskPreprocessRequest:
    @pytest.fixture
    def app(self):
        app = Flask("test_app")
        return app

    def test_preprocess_request_with_url_value_preprocessor(self, app, req_ctx):
        @app.url_value_preprocessor
        def preprocess(endpoint, values):
            return "processed"

        result = app.preprocess_request(req_ctx)
        assert result == "processed"

    def test_preprocess_request_with_before_request_func(self, app, req_ctx):
        @app.before_request
        def before_request_func():
            return "before_request_processed"

        result = app.preprocess_request(req_ctx)
        assert result == "before_request_processed"

    def test_preprocess_request_with_no_preprocessors(self, app, req_ctx):
        result = app.preprocess_request(req_ctx)
        assert result is None

    def test_preprocess_request_with_multiple_before_request_funcs(self, app, req_ctx):
        @app.before_request
        def first_before_request_func():
            return None

        @app.before_request
        def second_before_request_func():
            return "second_before_request_processed"

        result = app.preprocess_request(req_ctx)
        assert result == "second_before_request_processed"

    def test_preprocess_request_with_blueprint(self, app, req_ctx):
        bp = Blueprint('test_bp', __name__)

        @bp.url_value_preprocessor
        def bp_preprocess(endpoint, values):
            return "blueprint_processed"

        @bp.before_request
        def bp_before_request_func():
            return "blueprint_before_request_processed"

        app.register_blueprint(bp)

        result = app.preprocess_request(req_ctx)
        assert result == "blueprint_before_request_processed"
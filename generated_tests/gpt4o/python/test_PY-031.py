import pytest
from flask import Flask, request
from flask.app import AppContext

@pytest.fixture
def app():
    app = Flask(__name__)

    @app.before_request
    def before_request_func():
        return "Before Request"

    @app.url_value_preprocessor
    def url_value_preprocessor(endpoint, values):
        pass

    return app

def test_preprocess_request_no_preprocessors(app):
    with app.app_context():
        ctx = AppContext(app)
        ctx.push()
        assert preprocess_request(app, ctx) is None
        ctx.pop()

def test_preprocess_request_with_url_value_preprocessor(app):
    @app.url_value_preprocessor
    def url_value_preprocessor(endpoint, values):
        values['test'] = 'value'

    with app.app_context():
        ctx = AppContext(app)
        ctx.push()
        assert preprocess_request(app, ctx) is None
        ctx.pop()

def test_preprocess_request_with_before_request_func(app):
    @app.before_request
    def before_request_func():
        return "Before Request"

    with app.app_context():
        ctx = AppContext(app)
        ctx.push()
        assert preprocess_request(app, ctx) == "Before Request"
        ctx.pop()

def test_preprocess_request_with_multiple_before_request_funcs(app):
    @app.before_request
    def before_request_func_1():
        return None

    @app.before_request
    def before_request_func_2():
        return "Before Request"

    with app.app_context():
        ctx = AppContext(app)
        ctx.push()
        assert preprocess_request(app, ctx) == "Before Request"
        ctx.pop()

def test_preprocess_request_with_url_value_preprocessor_and_before_request_func(app):
    @app.url_value_preprocessor
    def url_value_preprocessor(endpoint, values):
        values['test'] = 'value'

    @app.before_request
    def before_request_func():
        return "Before Request"

    with app.app_context():
        ctx = AppContext(app)
        ctx.push()
        assert preprocess_request(app, ctx) == "Before Request"
        ctx.pop()
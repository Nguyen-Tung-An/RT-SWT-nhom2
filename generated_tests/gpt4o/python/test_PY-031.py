import pytest
from flask.app import Flask, AppContext

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

def test_preprocess_request_no_before_request(app):
    with app.app_context():
        ctx = AppContext(app)
        ctx.push()
        assert app.preprocess_request(ctx) is None
        ctx.pop()

def test_preprocess_request_with_before_request(app):
    with app.app_context():
        ctx = AppContext(app)
        ctx.push()
        app.before_request_funcs['test_blueprint'] = [lambda: "Before Request"]
        assert app.preprocess_request(ctx) == "Before Request"
        ctx.pop()

def test_preprocess_request_with_url_value_preprocessor(app):
    with app.app_context():
        ctx = AppContext(app)
        ctx.push()
        app.url_value_preprocessors['test_blueprint'] = [lambda endpoint, values: None]
        assert app.preprocess_request(ctx) is None
        ctx.pop()

def test_preprocess_request_with_multiple_before_requests(app):
    with app.app_context():
        ctx = AppContext(app)
        ctx.push()
        app.before_request_funcs['test_blueprint'] = [
            lambda: None,
            lambda: "Before Request"
        ]
        assert app.preprocess_request(ctx) == "Before Request"
        ctx.pop()
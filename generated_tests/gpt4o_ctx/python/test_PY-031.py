import pytest
from flask.app import Flask

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
    with app.test_request_context('/'):
        assert app.preprocess_request(app.app_context()) is None

def test_preprocess_request_with_before_request(app):
    with app.test_request_context('/'):
        assert app.preprocess_request(app.app_context()) == "Before Request"

def test_preprocess_request_with_url_value_preprocessor(app):
    @app.url_value_preprocessor
    def custom_url_value_preprocessor(endpoint, values):
        assert endpoint is not None

    with app.test_request_context('/'):
        app.preprocess_request(app.app_context())
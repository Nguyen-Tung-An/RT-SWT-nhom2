import pytest
from flask.app import Flask

@pytest.fixture
def app():
    app = Flask(__name__)
    app.config["TRUSTED_HOSTS"] = None
    app.config["SERVER_NAME"] = "example.com"
    app.config["APPLICATION_ROOT"] = "/"
    app.config["PREFERRED_URL_SCHEME"] = "http"
    return app

def test_create_url_adapter_with_request(app):
    with app.test_request_context(environ={'HTTP_HOST': 'example.com'}):
        adapter = app.create_url_adapter(app.request)
        assert adapter is not None

def test_create_url_adapter_with_trusted_hosts(app):
    app.config["TRUSTED_HOSTS"] = ["example.com"]
    with app.test_request_context(environ={'HTTP_HOST': 'example.com'}):
        adapter = app.create_url_adapter(app.request)
        assert adapter is not None

def test_create_url_adapter_without_request(app):
    adapter = app.create_url_adapter(None)
    assert adapter is not None

def test_create_url_adapter_without_server_name(app):
    app.config["SERVER_NAME"] = None
    adapter = app.create_url_adapter(None)
    assert adapter is None
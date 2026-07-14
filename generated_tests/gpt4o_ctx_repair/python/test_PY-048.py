import pytest
from flask import Flask
from flask.testing import FlaskClient

@pytest.fixture
def app():
    app = Flask(__name__)
    app.config['SERVER_NAME'] = 'localhost'
    app.config['APPLICATION_ROOT'] = '/'
    app.config['PREFERRED_URL_SCHEME'] = 'http'
    return app

def test_flask_client_init_without_base_url(app):
    client = FlaskClient(app)
    assert client.app == app

def test_flask_client_init_with_base_url(app):
    client = FlaskClient(app, base_url='http://example.com')
    assert client.app == app

def test_flask_client_init_with_subdomain(app):
    client = FlaskClient(app, subdomain='test')
    assert client.app == app

def test_flask_client_init_with_url_scheme(app):
    client = FlaskClient(app, url_scheme='https')
    assert client.app == app

def test_flask_client_init_with_invalid_combination(app):
    with pytest.raises(TypeError, match='Cannot pass "subdomain" or "url_scheme" with "base_url".'):
        FlaskClient(app, base_url='http://example.com', subdomain='test')

def test_flask_client_init_with_path_and_query(app):
    client = FlaskClient(app)
    client.open('/test?query=1')
    assert client.app == app
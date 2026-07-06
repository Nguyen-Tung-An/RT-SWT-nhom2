import pytest
from flask import Flask
from flask.testing import FlaskClient

@pytest.fixture
def app():
    app = Flask(__name__)
    app.config['SERVER_NAME'] = 'example.com'
    app.config['APPLICATION_ROOT'] = '/app'
    app.config['PREFERRED_URL_SCHEME'] = 'http'
    return app

def test_init_with_base_url(app):
    client = FlaskClient(app, base_url='http://test.com')
    assert client.base_url == 'http://test.com'

def test_init_with_subdomain(app):
    client = FlaskClient(app, subdomain='api')
    assert client.base_url == 'http://api.example.com/app'

def test_init_with_url_scheme(app):
    client = FlaskClient(app, url_scheme='https')
    assert client.base_url == 'https://localhost/app'

def test_init_with_path_and_no_base_url(app):
    client = FlaskClient(app, path='/test')
    assert client.base_url == 'http://localhost/app/test'

def test_init_with_invalid_combination(app):
    with pytest.raises(AssertionError, match='Cannot pass "subdomain" or "url_scheme" with "base_url".'):
        FlaskClient(app, base_url='http://test.com', subdomain='api')

def test_init_with_empty_path(app):
    client = FlaskClient(app, path='')
    assert client.base_url == 'http://localhost/app/'
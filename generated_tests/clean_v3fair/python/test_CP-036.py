import pytest
from flask import Flask, Request

@pytest.fixture
def app():
    app = Flask('test_app')
    app.config['SERVER_NAME'] = 'example.com'
    app.config['TRUSTED_HOSTS'] = None
    app.config['APPLICATION_ROOT'] = '/'
    app.config['PREFERRED_URL_SCHEME'] = 'http'
    return app

def test_create_url_adapter_with_request(app):
    with app.test_request_context('/'):
        request = Request(environ={'HTTP_HOST': 'example.com'})
        adapter = app.create_url_adapter(request)
        assert adapter is not None

def test_create_url_adapter_with_trusted_hosts(app):
    app.config['TRUSTED_HOSTS'] = ['example.com']
    with app.test_request_context('/'):
        request = Request(environ={'HTTP_HOST': 'example.com'})
        adapter = app.create_url_adapter(request)
        assert adapter is not None
        assert request.trusted_hosts == ['example.com']

def test_create_url_adapter_without_request(app):
    adapter = app.create_url_adapter(None)
    assert adapter is not None

def test_create_url_adapter_without_server_name(app):
    app.config['SERVER_NAME'] = None
    adapter = app.create_url_adapter(None)
    assert adapter is None

def test_create_url_adapter_with_host_matching(app):
    app.url_map.host_matching = True
    with app.test_request_context('/'):
        request = Request(environ={'HTTP_HOST': 'example.com'})
        adapter = app.create_url_adapter(request)
        assert adapter is not None

def test_create_url_adapter_with_subdomain_matching(app):
    app.url_map.host_matching = False
    app.subdomain_matching = True
    with app.test_request_context('/'):
        request = Request(environ={'HTTP_HOST': 'sub.example.com'})
        adapter = app.create_url_adapter(request)
        assert adapter is not None
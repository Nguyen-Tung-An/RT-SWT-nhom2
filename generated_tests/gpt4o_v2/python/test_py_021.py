import pytest
from flask import Flask, Request

class TestFlaskCreateUrlAdapter:
    @pytest.fixture
    def app(self):
        app = Flask(__name__)
        app.config['SERVER_NAME'] = 'example.com'
        app.config['TRUSTED_HOSTS'] = ['example.com', 'sub.example.com']
        app.config['APPLICATION_ROOT'] = '/'
        app.config['PREFERRED_URL_SCHEME'] = 'http'
        return app

    def test_create_url_adapter_with_request(self, app):
        with app.test_request_context('/'):
            request = Request(environ={'HTTP_HOST': 'example.com'})
            adapter = app.create_url_adapter(request)
            assert adapter is not None
            assert adapter.url_for('index') == 'http://example.com/'

    def test_create_url_adapter_with_trusted_hosts(self, app):
        with app.test_request_context('/'):
            request = Request(environ={'HTTP_HOST': 'sub.example.com'})
            adapter = app.create_url_adapter(request)
            assert adapter is not None
            assert adapter.url_for('index') == 'http://sub.example.com/'

    def test_create_url_adapter_without_request(self, app):
        adapter = app.create_url_adapter(None)
        assert adapter is not None
        assert adapter.url_for('index') == 'http://example.com/'

    def test_create_url_adapter_without_server_name(self, app):
        app.config['SERVER_NAME'] = None
        adapter = app.create_url_adapter(None)
        assert adapter is None

    def test_create_url_adapter_with_empty_trusted_hosts(self, app):
        app.config['TRUSTED_HOSTS'] = None
        with app.test_request_context('/'):
            request = Request(environ={'HTTP_HOST': 'example.com'})
            adapter = app.create_url_adapter(request)
            assert adapter is not None
            assert adapter.url_for('index') == 'http://example.com/'
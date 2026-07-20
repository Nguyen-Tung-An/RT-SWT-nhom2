import pytest
from flask import Flask, Request

class TestFlaskCreateUrlAdapter:
    @pytest.fixture
    def app(self):
        return Flask(import_name="test_app")

    def test_create_url_adapter_with_request(self, app):
        with app.test_request_context('/'):
            request = Request(environ={'HTTP_HOST': 'localhost'})
            adapter = app.create_url_adapter(request)
            assert adapter is not None
            assert adapter.url_map is not None

    def test_create_url_adapter_with_trusted_hosts(self, app):
        app.config['TRUSTED_HOSTS'] = ['localhost']
        with app.test_request_context('/'):
            request = Request(environ={'HTTP_HOST': 'localhost'})
            adapter = app.create_url_adapter(request)
            assert adapter is not None
            assert request.trusted_hosts == app.config['TRUSTED_HOSTS']

    def test_create_url_adapter_without_request_and_server_name(self, app):
        app.config['SERVER_NAME'] = None
        with app.test_request_context('/'):
            adapter = app.create_url_adapter(None)
            assert adapter is None

    def test_create_url_adapter_without_request_with_server_name(self, app):
        app.config['SERVER_NAME'] = 'localhost'
        adapter = app.create_url_adapter(None)
        assert adapter is not None
        assert adapter.host == 'localhost'

    def test_create_url_adapter_with_host_matching(self, app):
        app.url_map.host_matching = True
        app.config['SERVER_NAME'] = 'localhost'
        with app.test_request_context('/'):
            request = Request(environ={'HTTP_HOST': 'localhost'})
            adapter = app.create_url_adapter(request)
            assert adapter is not None

    def test_create_url_adapter_with_subdomain_matching(self, app):
        app.url_map.host_matching = False
        app.subdomain_matching = True
        app.config['SERVER_NAME'] = 'localhost'
        with app.test_request_context('/'):
            request = Request(environ={'HTTP_HOST': 'localhost'})
            adapter = app.create_url_adapter(request)
            assert adapter is not None
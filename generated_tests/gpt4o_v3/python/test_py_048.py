import pytest
from flask import Flask
from flask.testing import EnvironBuilder

class TestEnvironBuilderInit:
    @pytest.fixture
    def app(self):
        return Flask("test_app")

    def test_default_initialization(self, app):
        with app.test_request_context('/'):
            builder = EnvironBuilder(app)
            assert builder.path == '/'
            assert builder.base_url.startswith('http://localhost/')

    def test_with_subdomain(self, app):
        with app.test_request_context('/'):
            builder = EnvironBuilder(app, subdomain='test')
            assert builder.path == '/'
            assert builder.base_url.startswith('http://test.localhost/')

    def test_with_url_scheme(self, app):
        with app.test_request_context('/'):
            builder = EnvironBuilder(app, url_scheme='https')
            assert builder.path == '/'
            assert builder.base_url.startswith('https://localhost/')

    def test_with_base_url(self, app):
        with app.test_request_context('/'):
            builder = EnvironBuilder(app, base_url='http://example.com')
            assert builder.path == '/'
            assert builder.base_url == 'http://example.com'

    def test_conflict_with_base_url_and_subdomain(self, app):
        with app.test_request_context('/'):
            with pytest.raises(AssertionError, match='Cannot pass "subdomain" or "url_scheme" with "base_url".'):
                EnvironBuilder(app, base_url='http://example.com', subdomain='test')

    def test_conflict_with_base_url_and_url_scheme(self, app):
        with app.test_request_context('/'):
            with pytest.raises(AssertionError, match='Cannot pass "subdomain" or "url_scheme" with "base_url".'):
                EnvironBuilder(app, base_url='http://example.com', url_scheme='https')
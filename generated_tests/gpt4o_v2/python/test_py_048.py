import pytest
from flask import Flask
from flask.testing import EnvironBuilder

class TestEnvironBuilderInit:
    @pytest.fixture
    def app(self):
        app = Flask(__name__)
        app.config['SERVER_NAME'] = 'example.com'
        app.config['APPLICATION_ROOT'] = '/app'
        app.config['PREFERRED_URL_SCHEME'] = 'http'
        return app

    def test_init_with_default_values(self, app):
        builder = EnvironBuilder(app)
        assert builder.path == '/'
        assert builder.base_url == 'http://localhost/app'

    def test_init_with_custom_path(self, app):
        builder = EnvironBuilder(app, path='/custom')
        assert builder.path == '/custom'
        assert builder.base_url == 'http://localhost/app'

    def test_init_with_base_url(self, app):
        builder = EnvironBuilder(app, base_url='http://custom.url')
        assert builder.path == '/'
        assert builder.base_url == 'http://custom.url'

    def test_init_with_subdomain(self, app):
        builder = EnvironBuilder(app, subdomain='test')
        assert builder.path == '/'
        assert builder.base_url == 'http://test.example.com/app'

    def test_init_with_url_scheme(self, app):
        builder = EnvironBuilder(app, url_scheme='https')
        assert builder.path == '/'
        assert builder.base_url == 'https://localhost/app'

    def test_init_with_subdomain_and_base_url(self, app):
        with pytest.raises(AssertionError, match='Cannot pass "subdomain" or "url_scheme" with "base_url".'):
            EnvironBuilder(app, base_url='http://custom.url', subdomain='test')

    def test_init_with_subdomain_and_url_scheme(self, app):
        with pytest.raises(AssertionError, match='Cannot pass "subdomain" or "url_scheme" with "base_url".'):
            EnvironBuilder(app, base_url='http://custom.url', url_scheme='https')

    def test_init_with_query_in_path(self, app):
        builder = EnvironBuilder(app, path='/custom?query=1')
        assert builder.path == '/custom'
        assert builder.base_url == 'http://localhost/app?query=1'
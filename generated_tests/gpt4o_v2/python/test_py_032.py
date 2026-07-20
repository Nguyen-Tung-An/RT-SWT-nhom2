import pytest
from flask import Flask

class TestFlaskWsgiApp:
    @pytest.fixture
    def app(self):
        app = Flask(__name__)
        return app

    def test_wsgi_app_success(self, app):
        environ = {
            'REQUEST_METHOD': 'GET',
            'PATH_INFO': '/',
            'wsgi.version': (1, 0),
            'wsgi.url_scheme': 'http',
            'SERVER_NAME': 'localhost',
            'SERVER_PORT': '5000',
        }
        response_data = []

        def start_response(status, headers):
            response_data.append((status, headers))

        response = app.wsgi_app(environ, start_response)
        assert response_data[0][0] == '200 OK'
        assert b'<!doctype html>' in response

    def test_wsgi_app_exception_handling(self, app):
        @app.route('/error')
        def error_view():
            raise ValueError("This is a test error")

        environ = {
            'REQUEST_METHOD': 'GET',
            'PATH_INFO': '/error',
            'wsgi.version': (1, 0),
            'wsgi.url_scheme': 'http',
            'SERVER_NAME': 'localhost',
            'SERVER_PORT': '5000',
        }
        response_data = []

        def start_response(status, headers):
            response_data.append((status, headers))

        response = app.wsgi_app(environ, start_response)
        assert response_data[0][0] == '500 INTERNAL SERVER ERROR'
        assert b'This is a test error' in response

    def test_wsgi_app_ignore_error(self, app):
        app.should_ignore_error = lambda e: isinstance(e, ValueError)

        @app.route('/ignore-error')
        def ignore_error_view():
            raise ValueError("This error should be ignored")

        environ = {
            'REQUEST_METHOD': 'GET',
            'PATH_INFO': '/ignore-error',
            'wsgi.version': (1, 0),
            'wsgi.url_scheme': 'http',
            'SERVER_NAME': 'localhost',
            'SERVER_PORT': '5000',
        }
        response_data = []

        def start_response(status, headers):
            response_data.append((status, headers))

        response = app.wsgi_app(environ, start_response)
        assert response_data[0][0] == '200 OK'
        assert b'<!doctype html>' in response

    def test_wsgi_app_preserve_context(self, app):
        environ = {
            'REQUEST_METHOD': 'GET',
            'PATH_INFO': '/',
            'wsgi.version': (1, 0),
            'wsgi.url_scheme': 'http',
            'SERVER_NAME': 'localhost',
            'SERVER_PORT': '5000',
            'werkzeug.debug.preserve_context': lambda ctx: ctx,
        }
        response_data = []

        def start_response(status, headers):
            response_data.append((status, headers))

        response = app.wsgi_app(environ, start_response)
        assert response_data[0][0] == '200 OK'
        assert b'<!doctype html>' in response
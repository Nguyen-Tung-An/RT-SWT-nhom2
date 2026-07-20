import pytest
from flask import Flask, Response

class TestFlaskWsgiApp:
    @pytest.fixture
    def app(self):
        return Flask(import_name="test_app")

    def test_wsgi_app_success(self, app):
        with app.test_request_context('/'):
            environ = {
                'REQUEST_METHOD': 'GET',
                'PATH_INFO': '/',
                'wsgi.version': (1, 0),
                'wsgi.url_scheme': 'http',
                'SERVER_NAME': 'localhost',
                'SERVER_PORT': '5000',
                'SCRIPT_NAME': '',
                'REMOTE_ADDR': '127.0.0.1',
            }
            response = app.wsgi_app(environ, lambda status, headers: None)
            assert isinstance(response, Response)
            assert response.status_code == 200

    def test_wsgi_app_exception_handling(self, app):
        @app.route('/error')
        def error_view():
            raise ValueError("This is a test error")

        with app.test_request_context('/error'):
            environ = {
                'REQUEST_METHOD': 'GET',
                'PATH_INFO': '/error',
                'wsgi.version': (1, 0),
                'wsgi.url_scheme': 'http',
                'SERVER_NAME': 'localhost',
                'SERVER_PORT': '5000',
                'SCRIPT_NAME': '',
                'REMOTE_ADDR': '127.0.0.1',
            }
            response = app.wsgi_app(environ, lambda status, headers: None)
            assert isinstance(response, Response)
            assert response.status_code == 500
            assert "This is a test error" in response.get_data(as_text=True)

    def test_wsgi_app_preserve_context(self, app):
        with app.test_request_context('/'):
            environ = {
                'REQUEST_METHOD': 'GET',
                'PATH_INFO': '/',
                'wsgi.version': (1, 0),
                'wsgi.url_scheme': 'http',
                'SERVER_NAME': 'localhost',
                'SERVER_PORT': '5000',
                'SCRIPT_NAME': '',
                'REMOTE_ADDR': '127.0.0.1',
                'werkzeug.debug.preserve_context': lambda ctx: ctx,
            }
            response = app.wsgi_app(environ, lambda status, headers: None)
            assert isinstance(response, Response)
            assert response.status_code == 200

    def test_wsgi_app_ignore_error(self, app):
        app.should_ignore_error = lambda e: isinstance(e, ValueError)

        @app.route('/ignore-error')
        def ignore_error_view():
            raise ValueError("This error should be ignored")

        with app.test_request_context('/ignore-error'):
            environ = {
                'REQUEST_METHOD': 'GET',
                'PATH_INFO': '/ignore-error',
                'wsgi.version': (1, 0),
                'wsgi.url_scheme': 'http',
                'SERVER_NAME': 'localhost',
                'SERVER_PORT': '5000',
                'SCRIPT_NAME': '',
                'REMOTE_ADDR': '127.0.0.1',
            }
            response = app.wsgi_app(environ, lambda status, headers: None)
            assert isinstance(response, Response)
            assert response.status_code == 500
            assert "This error should be ignored" not in response.get_data(as_text=True)
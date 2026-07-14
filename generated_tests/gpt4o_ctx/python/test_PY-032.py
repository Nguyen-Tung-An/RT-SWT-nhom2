import pytest
from flask.app import Flask

@pytest.fixture
def app():
    return Flask(__name__)

def test_wsgi_app_success(app):
    environ = {
        'REQUEST_METHOD': 'GET',
        'PATH_INFO': '/',
        'wsgi.input': b'',
        'wsgi.errors': sys.stderr,
        'SERVER_NAME': 'localhost',
        'SERVER_PORT': '5000',
        'SCRIPT_NAME': '',
    }
    
    def start_response(status, headers):
        assert status == '200 OK'
        assert headers == [('Content-Type', 'text/html; charset=utf-8')]
    
    response = app.wsgi_app(environ, start_response)
    assert b''.join(response) == b'<!doctype html>\n<title>Hello, World!</title>\n<h1>Hello, World!</h1>'

def test_wsgi_app_exception_handling(app):
    environ = {
        'REQUEST_METHOD': 'GET',
        'PATH_INFO': '/error',
        'wsgi.input': b'',
        'wsgi.errors': sys.stderr,
        'SERVER_NAME': 'localhost',
        'SERVER_PORT': '5000',
        'SCRIPT_NAME': '',
    }
    
    def start_response(status, headers):
        assert status == '500 INTERNAL SERVER ERROR'
    
    response = app.wsgi_app(environ, start_response)
    assert b''.join(response) == b'Internal Server Error'

def test_wsgi_app_preserve_context(app):
    environ = {
        'REQUEST_METHOD': 'GET',
        'PATH_INFO': '/',
        'wsgi.input': b'',
        'wsgi.errors': sys.stderr,
        'SERVER_NAME': 'localhost',
        'SERVER_PORT': '5000',
        'SCRIPT_NAME': '',
        'werkzeug.debug.preserve_context': lambda ctx: None,
    }
    
    def start_response(status, headers):
        assert status == '200 OK'
    
    response = app.wsgi_app(environ, start_response)
    assert b''.join(response) == b'<!doctype html>\n<title>Hello, World!</title>\n<h1>Hello, World!</h1>'
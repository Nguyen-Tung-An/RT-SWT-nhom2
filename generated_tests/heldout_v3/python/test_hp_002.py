import pytest
import flask
from flask.wrappers import Request

class TestLoadFormData:
    @pytest.fixture
    def request(self):
        environ = {
            "REQUEST_METHOD": "GET",
            "PATH_INFO": "/",
            "SERVER_NAME": "localhost",
            "SERVER_PORT": "80",
            "wsgi.url_scheme": "http"
        }
        return Request(environ)

    def test_load_form_data_empty(self, request):
        app = flask.Flask('test_app')
        with app.test_request_context('/'):
            result = request._load_form_data()
            assert result == {}

    def test_load_form_data_with_data(self, request):
        app = flask.Flask('test_app')
        with app.test_request_context('/'):
            request.environ['wsgi.input'] = flask.Request(environ={"REQUEST_METHOD": "POST", "wsgi.input": b'key=value'}).environ['wsgi.input']
            result = request._load_form_data()
            assert result == {'key': ['value']}

    def test_load_form_data_with_multiple_values(self, request):
        app = flask.Flask('test_app')
        with app.test_request_context('/'):
            request.environ['wsgi.input'] = flask.Request(environ={"REQUEST_METHOD": "POST", "wsgi.input": b'key=value1&key=value2'}).environ['wsgi.input']
            result = request._load_form_data()
            assert result == {'key': ['value1', 'value2']}

    def test_load_form_data_with_no_input(self, request):
        app = flask.Flask('test_app')
        with app.test_request_context('/'):
            request.environ['wsgi.input'] = flask.Request(environ={"REQUEST_METHOD": "POST", "wsgi.input": b''}).environ['wsgi.input']
            result = request._load_form_data()
            assert result == {}

    def test_load_form_data_invalid_method(self, request):
        app = flask.Flask('test_app')
        with app.test_request_context('/'):
            request.environ['REQUEST_METHOD'] = 'INVALID'
            result = request._load_form_data()
            assert result == {}
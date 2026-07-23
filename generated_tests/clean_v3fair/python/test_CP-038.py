import pytest
from flask import Flask, request
from flask import Response

@pytest.fixture
def app():
    app = Flask('test_app')
    with app.test_request_context('/'):
        yield app

def test_full_dispatch_request_first_request(app):
    app._got_first_request = False
    response = app.full_dispatch_request(app.app_context())
    assert isinstance(response, Response)

def test_full_dispatch_request_second_request(app):
    app._got_first_request = True
    response = app.full_dispatch_request(app.app_context())
    assert isinstance(response, Response)

def test_full_dispatch_request_with_preprocess(app):
    @app.before_request
    def before_request():
        return "Preprocessed"

    response = app.full_dispatch_request(app.app_context())
    assert response.data == b"Preprocessed"

def test_full_dispatch_request_with_exception(app):
    @app.route('/')
    def index():
        raise ValueError("An error occurred")

    with app.test_request_context('/'):
        response = app.full_dispatch_request(app.app_context())
        assert response.status_code == 500

def test_full_dispatch_request_deprecation_warning(app):
    app.should_ignore_error = True
    with pytest.warns(DeprecationWarning):
        app.full_dispatch_request(app.app_context())
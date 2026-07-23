import pytest
from flask import Flask, Response, request
from flask import g

@pytest.fixture
def app():
    app = Flask('test_app')

    @app.after_request
    def after_request_func(response):
        response.headers['X-After-Request'] = 'Processed'
        return response

    return app

def test_process_response_with_after_request(app):
    with app.test_request_context('/'):
        response = Response("Hello World")
        ctx = app.app_context()
        ctx.push()
        processed_response = app.process_response(ctx, response)
        assert processed_response.headers['X-After-Request'] == 'Processed'

def test_process_response_with_no_after_request(app):
    with app.test_request_context('/'):
        response = Response("Hello World")
        ctx = app.app_context()
        ctx.push()
        processed_response = app.process_response(ctx, response)
        assert processed_response.headers.get('X-After-Request') is None

def test_process_response_with_session(app):
    with app.test_request_context('/'):
        response = Response("Hello World")
        ctx = app.app_context()
        ctx.push()
        g.user = 'test_user'  # Simulate a user session
        processed_response = app.process_response(ctx, response)
        assert processed_response is response  # Ensure the same response is returned

def test_process_response_with_null_session(app):
    with app.test_request_context('/'):
        response = Response("Hello World")
        ctx = app.app_context()
        ctx.push()
        ctx._get_session = lambda: None  # Simulate a null session
        processed_response = app.process_response(ctx, response)
        assert processed_response is response  # Ensure the same response is returned
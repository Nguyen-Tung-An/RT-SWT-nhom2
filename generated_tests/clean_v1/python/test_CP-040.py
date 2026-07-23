import pytest
from flask import Flask, Response
from flask.app import AppContext

@pytest.fixture
def app():
    app = Flask(__name__)

    @app.after_request
    def after_request_func(response):
        response.headers['X-After-Request'] = 'Processed'
        return response

    return app

def test_process_response_with_after_request(app):
    with app.app_context():
        ctx = AppContext(app)
        ctx.push()
        response = Response("Hello World")
        processed_response = app.process_response(ctx, response)
        assert processed_response.headers['X-After-Request'] == 'Processed'

def test_process_response_with_no_after_request(app):
    with app.app_context():
        ctx = AppContext(app)
        ctx.push()
        response = Response("Hello World")
        processed_response = app.process_response(ctx, response)
        assert processed_response.data == b"Hello World"

def test_process_response_with_session(app):
    with app.app_context():
        ctx = AppContext(app)
        ctx.push()
        response = Response("Hello World")
        ctx._get_session = lambda: {}
        processed_response = app.process_response(ctx, response)
        assert processed_response.data == b"Hello World"  # Assuming session does not alter response

def test_process_response_with_null_session(app):
    with app.app_context():
        ctx = AppContext(app)
        ctx.push()
        response = Response("Hello World")
        ctx._get_session = lambda: None
        processed_response = app.process_response(ctx, response)
        assert processed_response.data == b"Hello World"  # Assuming null session does not alter response
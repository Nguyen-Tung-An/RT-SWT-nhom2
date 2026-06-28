import pytest
from flask.app import Flask, AppContext, Response

@pytest.fixture
def app():
    app = Flask(__name__)

    @app.after_request
    def after_request_func(response):
        response.headers['X-After-Request'] = 'Processed'
        return response

    return app

def test_process_response_with_after_request(app):
    with app.app_context() as ctx:
        response = Response("Hello World")
        processed_response = app.process_response(ctx, response)
        assert processed_response.headers['X-After-Request'] == 'Processed'

def test_process_response_with_no_after_request(app):
    with app.app_context() as ctx:
        response = Response("Hello World")
        ctx._after_request_functions = []
        processed_response = app.process_response(ctx, response)
        assert processed_response is response

def test_process_response_with_session(app):
    with app.app_context() as ctx:
        response = Response("Hello World")
        ctx._get_session = lambda: {}
        ctx._session_interface = app.session_interface
        processed_response = app.process_response(ctx, response)
        assert processed_response is response  # Assuming session does not modify response

def test_process_response_with_multiple_after_requests(app):
    with app.app_context() as ctx:
        @app.after_request
        def another_after_request_func(response):
            response.headers['X-Another-After-Request'] = 'Processed'
            return response

        response = Response("Hello World")
        processed_response = app.process_response(ctx, response)
        assert processed_response.headers['X-After-Request'] == 'Processed'
        assert processed_response.headers['X-Another-After-Request'] == 'Processed'
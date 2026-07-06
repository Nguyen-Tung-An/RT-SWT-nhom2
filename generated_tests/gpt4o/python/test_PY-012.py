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
        response = Response("Hello World")
        ctx._after_request_functions.append(app.after_request_funcs[None][0])
        processed_response = app.process_response(ctx, response)
        assert processed_response.headers['X-After-Request'] == 'Processed'

def test_process_response_with_blueprint_after_request(app):
    with app.app_context():
        @app.route('/test')
        def test_route():
            return "Test"

        @app.after_request
        def blueprint_after_request(response):
            response.headers['X-Blueprint'] = 'Processed'
            return response

        app.register_blueprint(app.blueprint, url_prefix='/test')
        response = app.test_client().get('/test')
        processed_response = app.process_response(app.app_context(), response)
        assert processed_response.headers['X-Blueprint'] == 'Processed'

def test_process_response_with_session(app):
    with app.app_context():
        ctx = AppContext(app)
        response = Response("Hello World")
        ctx._get_session = lambda: {}
        app.session_interface.is_null_session = lambda session: False
        app.session_interface.save_session = lambda self, session, response: response.headers.update({'X-Session': 'Saved'})
        processed_response = app.process_response(ctx, response)
        assert processed_response.headers['X-Session'] == 'Saved'
import pytest
from flask.app import Flask

@pytest.fixture
def app():
    app = Flask(__name__)
    return app

def test_process_response_no_after_request_functions(app):
    with app.app_context():
        response = app.make_response("Hello, World!")
        processed_response = app.process_response(app, response)
        assert processed_response.data == b"Hello, World!"

def test_process_response_with_after_request_function(app):
    @app.after_request
    def add_header(response):
        response.headers['X-Added'] = 'Value'
        return response

    with app.app_context():
        response = app.make_response("Hello, World!")
        processed_response = app.process_response(app, response)
        assert processed_response.headers['X-Added'] == 'Value'

def test_process_response_with_blueprint_after_request_function(app):
    from flask import Blueprint

    bp = Blueprint('test', __name__)

    @bp.after_request
    def add_blueprint_header(response):
        response.headers['X-Blueprint-Added'] = 'BlueprintValue'
        return response

    app.register_blueprint(bp)

    with app.app_context():
        response = app.make_response("Hello, World!")
        processed_response = app.process_response(app, response)
        assert processed_response.headers.get('X-Blueprint-Added') is None  # No blueprint called yet

        with app.test_request_context('/test'):
            processed_response = app.process_response(app, response)
            assert processed_response.headers['X-Blueprint-Added'] == 'BlueprintValue'

def test_process_response_with_session(app):
    with app.app_context():
        response = app.make_response("Hello, World!")
        app.session_interface.save_session = lambda *args: None  # Mock save_session
        processed_response = app.process_response(app, response)
        assert processed_response.data == b"Hello, World!"
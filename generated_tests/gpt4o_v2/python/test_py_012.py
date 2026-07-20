import pytest
from flask import Flask, request, jsonify
from flask.ctx import AppContext

class TestFlaskProcessResponse:
    @pytest.fixture
    def app(self):
        app = Flask(__name__)

        @app.after_request
        def after_request_func(response):
            response.headers['X-After-Request'] = 'Processed'
            return response

        return app

    @pytest.fixture
    def app_context(self, app):
        with app.app_context() as ctx:
            yield ctx

    def test_process_response_with_after_request(self, app, app_context):
        response = jsonify({"message": "Hello, World!"})
        processed_response = app.process_response(app_context, response)

        assert processed_response.headers['X-After-Request'] == 'Processed'
        assert processed_response.json == {"message": "Hello, World!"}

    def test_process_response_with_no_after_request(self, app, app_context):
        app.after_request_funcs.clear()  # Clear after request functions
        response = jsonify({"message": "No After Request"})
        processed_response = app.process_response(app_context, response)

        assert 'X-After-Request' not in processed_response.headers
        assert processed_response.json == {"message": "No After Request"}

    def test_process_response_with_null_session(self, app, app_context):
        app.session_interface.is_null_session = lambda session: True  # Mocking null session
        response = jsonify({"message": "Session Null"})
        processed_response = app.process_response(app_context, response)

        assert processed_response.json == {"message": "Session Null"}

    def test_process_response_with_non_null_session(self, app, app_context):
        app.session_interface.is_null_session = lambda session: False  # Mocking non-null session
        response = jsonify({"message": "Session Not Null"})
        processed_response = app.process_response(app_context, response)

        assert processed_response.json == {"message": "Session Not Null"}
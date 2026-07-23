import pytest
from flask import Flask, Response, request
from flask import jsonify

class TestFlaskProcessResponse:
    @pytest.fixture
    def app(self):
        return Flask(import_name="test_app")

    def test_process_response_with_after_request_function(self, app):
        @app.after_request
        def after_request_func(response):
            response.data = b'After request modified'
            return response

        with app.test_request_context('/'):
            response = Response("Original response")
            modified_response = app.process_response(app.app_context(), response)
            assert modified_response.data == b'After request modified'

    def test_process_response_with_blueprint_after_request_function(self, app):
        @app.route('/test')
        def test_route():
            return jsonify(message="Hello")

        @app.after_request
        def after_request_func(response):
            response.data = b'Blueprint modified'
            return response

        with app.test_request_context('/test'):
            response = app.test_client().get('/test')
            assert response.data == b'Blueprint modified'

    def test_process_response_with_null_session(self, app):
        with app.test_request_context('/'):
            response = Response("Response with null session")
            processed_response = app.process_response(app.app_context(), response)
            assert processed_response.data == b'Response with null session'

    def test_process_response_with_non_null_session(self, app):
        with app.test_request_context('/'):
            app.session_interface = app.session_interface
            response = Response("Response with non-null session")
            processed_response = app.process_response(app.app_context(), response)
            assert processed_response.data == b'Response with non-null session'
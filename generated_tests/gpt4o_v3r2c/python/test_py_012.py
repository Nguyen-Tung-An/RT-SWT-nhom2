import pytest
from flask import Flask, request, jsonify

class TestFlaskProcessResponse:
    @pytest.fixture
    def app(self):
        return Flask(import_name="test_app")

    def test_process_response_with_after_request_function(self, app, req_ctx):
        @app.after_request
        def after_request_func(response):
            response.data = b'After Request Modified'
            return response

        response = app.process_response(req_ctx, jsonify({'key': 'value'}))
        assert response.data == b'After Request Modified'

    def test_process_response_with_blueprint_after_request_function(self, app, req_ctx):
        @app.route('/test')
        def test_route():
            return jsonify({'key': 'value'})

        @app.after_request
        def after_request_func(response):
            response.data = b'Blueprint After Request Modified'
            return response

        response = app.process_response(req_ctx, jsonify({'key': 'value'}))
        assert response.data == b'Blueprint After Request Modified'

    def test_process_response_with_null_session(self, app, req_ctx):
        response = app.process_response(req_ctx, jsonify({'key': 'value'}))
        assert response.status_code == 200

    def test_process_response_with_non_null_session(self, app, req_ctx):
        app.session_interface.save_session = lambda *args: None  # Mock save_session
        response = app.process_response(req_ctx, jsonify({'key': 'value'}))
        assert response.status_code == 200
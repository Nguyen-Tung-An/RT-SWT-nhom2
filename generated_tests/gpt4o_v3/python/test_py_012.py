import pytest
from flask import Flask, request, jsonify

class TestFlaskProcessResponse:
    @pytest.fixture
    def app(self):
        return Flask(import_name="test_app")

    def test_process_response_with_after_request_function(self, app):
        @app.after_request
        def after_request_func(response):
            response.data = b'After Request Modified'
            return response

        with app.test_request_context('/'):
            response = app.process_response(app.app_context(), jsonify({'key': 'value'}))
            assert response.data == b'After Request Modified'

    def test_process_response_with_blueprint_after_request_function(self, app):
        @app.route('/test')
        def test_route():
            return jsonify({'key': 'value'})

        @app.after_request
        def after_request_func(response):
            response.data = b'Blueprint After Request Modified'
            return response

        with app.test_request_context('/test'):
            response = app.process_response(app.app_context(), jsonify({'key': 'value'}))
            assert response.data == b'Blueprint After Request Modified'

    def test_process_response_with_null_session(self, app):
        with app.test_request_context('/'):
            response = app.process_response(app.app_context(), jsonify({'key': 'value'}))
            assert response.status_code == 200

    def test_process_response_with_non_null_session(self, app):
        with app.test_request_context('/'):
            app.session_interface.save_session = lambda *args: None  # Mock save_session
            response = app.process_response(app.app_context(), jsonify({'key': 'value'}))
            assert response.status_code == 200
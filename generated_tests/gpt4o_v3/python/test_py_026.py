import pytest
from flask.app import Flask

class TestFindErrorHandler:
    @pytest.fixture
    def app(self):
        return Flask(import_name="test_app")

    def test_find_error_handler_specific_code(self, app):
        @app.errorhandler(404)
        def not_found_error(e):
            return "Not Found", 404

        with app.test_request_context('/'):
            handler = app._find_error_handler(Exception("Not Found"), ['test_blueprint'])
            assert handler is not None
            assert handler() == ("Not Found", 404)

    def test_find_error_handler_specific_exception(self, app):
        class CustomError(Exception):
            pass

        @app.errorhandler(CustomError)
        def custom_error_handler(e):
            return "Custom Error", 500

        with app.test_request_context('/'):
            handler = app._find_error_handler(CustomError("An error occurred"), ['test_blueprint'])
            assert handler is not None
            assert handler() == ("Custom Error", 500)

    def test_find_error_handler_no_handler(self, app):
        with app.test_request_context('/'):
            handler = app._find_error_handler(Exception("Some error"), ['test_blueprint'])
            assert handler is None

    def test_find_error_handler_with_none_blueprint(self, app):
        @app.errorhandler(500)
        def internal_error(e):
            return "Internal Server Error", 500

        with app.test_request_context('/'):
            handler = app._find_error_handler(Exception("Internal Error"), [None])
            assert handler is not None
            assert handler() == ("Internal Server Error", 500)

    def test_find_error_handler_multiple_blueprints(self, app):
        @app.errorhandler(403)
        def forbidden_error(e):
            return "Forbidden", 403

        @app.errorhandler(404)
        def not_found_error(e):
            return "Not Found", 404

        with app.test_request_context('/'):
            handler = app._find_error_handler(Exception("Forbidden"), ['test_blueprint', 'another_blueprint'])
            assert handler is None  # No handler registered for the exception

            handler = app._find_error_handler(Exception("Not Found"), ['test_blueprint', 'another_blueprint'])
            assert handler is not None
            assert handler() == ("Not Found", 404)
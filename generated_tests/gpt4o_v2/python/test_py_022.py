import pytest
from flask import Flask, request
from werkzeug.exceptions import BadRequestKeyError, HTTPException

class TestFlaskHandleUserException:
    @pytest.fixture
    def app(self):
        app = Flask(__name__)
        app.config["TRAP_BAD_REQUEST_ERRORS"] = True
        app.debug = True
        return app

    def test_handle_bad_request_key_error(self, app):
        with app.app_context():
            ctx = app.app_context()
            e = BadRequestKeyError('bad_key')
            response = app.handle_user_exception(ctx, e)
            assert response is not None
            assert hasattr(e, 'show_exception') and e.show_exception is True

    def test_handle_http_exception(self, app):
        class CustomHTTPException(HTTPException):
            code = 400
            description = 'Custom HTTP Exception'

        @app.errorhandler(CustomHTTPException)
        def handle_custom_http_exception(e):
            return 'Handled Custom HTTP Exception', e.code

        with app.app_context():
            ctx = app.app_context()
            e = CustomHTTPException()
            response = app.handle_user_exception(ctx, e)
            assert response[0] == 'Handled Custom HTTP Exception'
            assert response[1] == 400

    def test_handle_unknown_exception(self, app):
        with app.app_context():
            ctx = app.app_context()
            with pytest.raises(Exception):
                app.handle_user_exception(ctx, Exception("Unknown error"))

    def test_handle_http_exception_not_trapped(self, app):
        app.config["TRAP_HTTP_EXCEPTIONS"] = False

        class CustomHTTPException(HTTPException):
            code = 404
            description = 'Not Found'

        with app.app_context():
            ctx = app.app_context()
            e = CustomHTTPException()
            response = app.handle_user_exception(ctx, e)
            assert response[0] == 'Not Found'
            assert response[1] == 404
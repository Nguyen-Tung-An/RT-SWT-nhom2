import pytest
from flask.app import Flask
from werkzeug.exceptions import BadRequest, BadRequestKeyError

class TestTrapHttpException:
    @pytest.fixture
    def app(self):
        return Flask(import_name="test_app")

    def test_trap_http_exceptions_enabled(self, app):
        app.config["TRAP_HTTP_EXCEPTIONS"] = True
        assert app.trap_http_exception(Exception("Some error")) is True

    def test_trap_http_exceptions_disabled(self, app):
        app.config["TRAP_HTTP_EXCEPTIONS"] = False
        assert app.trap_http_exception(Exception("Some error")) is False

    def test_trap_bad_request_errors_enabled(self, app):
        app.config["TRAP_HTTP_EXCEPTIONS"] = False
        app.config["TRAP_BAD_REQUEST_ERRORS"] = True
        assert app.trap_http_exception(BadRequest("Bad request")) is True

    def test_trap_bad_request_errors_disabled(self, app):
        app.config["TRAP_HTTP_EXCEPTIONS"] = False
        app.config["TRAP_BAD_REQUEST_ERRORS"] = False
        assert app.trap_http_exception(BadRequest("Bad request")) is False

    def test_trap_key_error_in_debug_mode(self, app):
        app.config["TRAP_HTTP_EXCEPTIONS"] = False
        app.config["TRAP_BAD_REQUEST_ERRORS"] = None
        app.debug = True
        assert app.trap_http_exception(BadRequestKeyError("Key error")) is True

    def test_no_trap_key_error_in_non_debug_mode(self, app):
        app.config["TRAP_HTTP_EXCEPTIONS"] = False
        app.config["TRAP_BAD_REQUEST_ERRORS"] = None
        app.debug = False
        assert app.trap_http_exception(BadRequestKeyError("Key error")) is False
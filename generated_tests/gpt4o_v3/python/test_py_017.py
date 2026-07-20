import pytest
from flask import Flask
from werkzeug.exceptions import BadRequest, BadRequestKeyError

from flask.sansio.app import App

class TestTrapHttpException:
    @pytest.fixture
    def app(self):
        return App(import_name="test_app")

    def test_trap_http_exceptions_enabled(self, app):
        app.config["TRAP_HTTP_EXCEPTIONS"] = True
        result = app.trap_http_exception(Exception("Some error"))
        assert result is True

    def test_trap_http_exceptions_disabled(self, app):
        app.config["TRAP_HTTP_EXCEPTIONS"] = False
        result = app.trap_http_exception(Exception("Some error"))
        assert result is False

    def test_trap_bad_request_errors_enabled(self, app):
        app.config["TRAP_HTTP_EXCEPTIONS"] = False
        app.config["TRAP_BAD_REQUEST_ERRORS"] = True
        result = app.trap_http_exception(BadRequest("Bad request"))
        assert result is True

    def test_trap_bad_request_errors_disabled(self, app):
        app.config["TRAP_HTTP_EXCEPTIONS"] = False
        app.config["TRAP_BAD_REQUEST_ERRORS"] = False
        result = app.trap_http_exception(BadRequest("Bad request"))
        assert result is False

    def test_trap_key_error_in_debug_mode(self, app):
        app.config["TRAP_HTTP_EXCEPTIONS"] = False
        app.config["TRAP_BAD_REQUEST_ERRORS"] = None
        app.debug = True
        result = app.trap_http_exception(BadRequestKeyError("Key error"))
        assert result is True

    def test_no_trap_key_error_in_non_debug_mode(self, app):
        app.config["TRAP_HTTP_EXCEPTIONS"] = False
        app.config["TRAP_BAD_REQUEST_ERRORS"] = None
        app.debug = False
        result = app.trap_http_exception(BadRequestKeyError("Key error"))
        assert result is False
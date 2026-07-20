import pytest
from flask.sansio.app import App
from werkzeug.exceptions import BadRequest, BadRequestKeyError

class TestTrapHttpException:
    @pytest.fixture
    def app_instance(self):
        app = App()
        app.config["TRAP_HTTP_EXCEPTIONS"] = False
        app.config["TRAP_BAD_REQUEST_ERRORS"] = False
        app.debug = False
        return app

    def test_trap_http_exception_when_trap_http_exceptions_is_true(self, app_instance):
        app_instance.config["TRAP_HTTP_EXCEPTIONS"] = True
        result = app_instance.trap_http_exception(Exception("Some error"))
        assert result is True

    def test_trap_http_exception_when_trap_bad_request_errors_is_true_and_exception_is_bad_request(self, app_instance):
        app_instance.config["TRAP_BAD_REQUEST_ERRORS"] = True
        result = app_instance.trap_http_exception(BadRequest("Bad request"))
        assert result is True

    def test_trap_http_exception_when_trap_bad_request_errors_is_true_and_exception_is_not_bad_request(self, app_instance):
        app_instance.config["TRAP_BAD_REQUEST_ERRORS"] = True
        result = app_instance.trap_http_exception(Exception("Some error"))
        assert result is False

    def test_trap_http_exception_when_trap_bad_request_errors_is_none_and_debug_is_true_and_exception_is_bad_request_key_error(self, app_instance):
        app_instance.config["TRAP_BAD_REQUEST_ERRORS"] = None
        app_instance.debug = True
        result = app_instance.trap_http_exception(BadRequestKeyError("Key error"))
        assert result is True

    def test_trap_http_exception_when_trap_bad_request_errors_is_none_and_debug_is_true_and_exception_is_not_bad_request_key_error(self, app_instance):
        app_instance.config["TRAP_BAD_REQUEST_ERRORS"] = None
        app_instance.debug = True
        result = app_instance.trap_http_exception(Exception("Some error"))
        assert result is False

    def test_trap_http_exception_when_trap_bad_request_errors_is_none_and_debug_is_false(self, app_instance):
        app_instance.config["TRAP_BAD_REQUEST_ERRORS"] = None
        app_instance.debug = False
        result = app_instance.trap_http_exception(BadRequestKeyError("Key error"))
        assert result is False
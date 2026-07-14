import pytest
from flask.sansio.app import App
from werkzeug.exceptions import BadRequest, BadRequestKeyError

@pytest.fixture
def app():
    app_instance = App(__name__, static_url_path='', static_folder='', static_host='', host_matching=False, subdomain_matching=False, template_folder='', instance_path=None, instance_relative_config=False, root_path='')
    app_instance.config["TRAP_HTTP_EXCEPTIONS"] = False
    app_instance.config["TRAP_BAD_REQUEST_ERRORS"] = False
    app_instance.debug = False
    return app_instance

def test_trap_http_exception_false(app):
    exception = Exception("Some error")
    assert app.trap_http_exception(exception) is False

def test_trap_http_exception_trap_http_exceptions(app):
    app.config["TRAP_HTTP_EXCEPTIONS"] = True
    exception = Exception("Some error")
    assert app.trap_http_exception(exception) is True

def test_trap_http_exception_trap_bad_request_errors(app):
    app.config["TRAP_BAD_REQUEST_ERRORS"] = True
    exception = BadRequest("Bad request")
    assert app.trap_http_exception(exception) is True

def test_trap_http_exception_no_trap_bad_request_errors(app):
    app.config["TRAP_BAD_REQUEST_ERRORS"] = False
    exception = BadRequest("Bad request")
    assert app.trap_http_exception(exception) is False

def test_trap_http_exception_debug_mode_trap_key_error(app):
    app.config["TRAP_BAD_REQUEST_ERRORS"] = None
    app.debug = True
    exception = BadRequestKeyError("Key error")
    assert app.trap_http_exception(exception) is True

def test_trap_http_exception_debug_mode_no_trap_key_error(app):
    app.config["TRAP_BAD_REQUEST_ERRORS"] = None
    app.debug = True
    exception = Exception("Some error")
    assert app.trap_http_exception(exception) is False
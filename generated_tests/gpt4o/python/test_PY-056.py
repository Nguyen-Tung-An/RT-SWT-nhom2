import pytest
from flask.sansio.app import handle_url_build_error
from werkzeug.routing import BuildError

class MockApp:
    def __init__(self):
        self.url_build_error_handlers = []

    def add_handler(self, handler):
        self.url_build_error_handlers.append(handler)

def handler_success(error, endpoint, values):
    return "success"

def handler_none(error, endpoint, values):
    return None

def handler_raise(error, endpoint, values):
    raise BuildError("Handler raised an error")

def test_handle_url_build_error_success():
    app = MockApp()
    app.add_handler(handler_success)
    error = BuildError("Test error")
    result = handle_url_build_error(app, error, "test_endpoint", {})
    assert result == "success"

def test_handle_url_build_error_none():
    app = MockApp()
    app.add_handler(handler_none)
    error = BuildError("Test error")
    with pytest.raises(BuildError):
        handle_url_build_error(app, error, "test_endpoint", {})

def test_handle_url_build_error_raise():
    app = MockApp()
    app.add_handler(handler_raise)
    error = BuildError("Test error")
    with pytest.raises(BuildError, match="Handler raised an error"):
        handle_url_build_error(app, error, "test_endpoint", {})

def test_handle_url_build_error_multiple_handlers():
    app = MockApp()
    app.add_handler(handler_none)
    app.add_handler(handler_success)
    error = BuildError("Test error")
    result = handle_url_build_error(app, error, "test_endpoint", {})
    assert result == "success"

def test_handle_url_build_error_re_raise():
    app = MockApp()
    app.add_handler(handler_raise)
    error = BuildError("Test error")
    with pytest.raises(BuildError, match="Test error"):
        handle_url_build_error(app, error, "test_endpoint", {})
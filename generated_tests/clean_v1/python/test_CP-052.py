import pytest
from flask.sansio.app import handle_url_build_error
from werkzeug.routing import BuildError

class MockApp:
    def __init__(self):
        self.url_build_error_handlers = []

    def handle_url_build_error(self, error, endpoint, values):
        return handle_url_build_error(self, error, endpoint, values)

def test_handle_url_build_error_no_handlers():
    app = MockApp()
    with pytest.raises(BuildError):
        app.handle_url_build_error(BuildError(), 'test_endpoint', {})

def test_handle_url_build_error_handler_returns_value():
    app = MockApp()
    
    def handler(error, endpoint, values):
        return "Handled"

    app.url_build_error_handlers.append(handler)
    result = app.handle_url_build_error(BuildError(), 'test_endpoint', {})
    assert result == "Handled"

def test_handle_url_build_error_handler_raises():
    app = MockApp()
    
    def handler(error, endpoint, values):
        raise BuildError()

    app.url_build_error_handlers.append(handler)
    with pytest.raises(BuildError):
        app.handle_url_build_error(BuildError(), 'test_endpoint', {})

def test_handle_url_build_error_multiple_handlers():
    app = MockApp()
    
    def handler1(error, endpoint, values):
        return None

    def handler2(error, endpoint, values):
        return "Handled by second handler"

    app.url_build_error_handlers.extend([handler1, handler2])
    result = app.handle_url_build_error(BuildError(), 'test_endpoint', {})
    assert result == "Handled by second handler"

def test_handle_url_build_error_handler_returns_none():
    app = MockApp()
    
    def handler(error, endpoint, values):
        return None

    app.url_build_error_handlers.append(handler)
    with pytest.raises(BuildError):
        app.handle_url_build_error(BuildError(), 'test_endpoint', {})
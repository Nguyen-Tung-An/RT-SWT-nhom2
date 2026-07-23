import pytest
from flask.app import Flask
from werkzeug.exceptions import BuildError

class CustomErrorHandler:
    def __call__(self, error, endpoint, values):
        if endpoint == "valid_endpoint":
            return "http://example.com/valid"
        return None

def test_handle_url_build_error_valid_endpoint():
    app = Flask('test_app')
    app.url_build_error_handlers.append(CustomErrorHandler())
    
    with app.test_request_context('/'):
        error = BuildError("Test error", "valid_endpoint", {})
        result = app.handle_url_build_error(error, "valid_endpoint", {})
        assert result == "http://example.com/valid"

def test_handle_url_build_error_invalid_endpoint():
    app = Flask('test_app')
    app.url_build_error_handlers.append(CustomErrorHandler())
    
    with app.test_request_context('/'):
        error = BuildError("Test error", "invalid_endpoint", {})
        with pytest.raises(BuildError):
            app.handle_url_build_error(error, "invalid_endpoint", {})

def test_handle_url_build_error_no_handler():
    app = Flask('test_app')
    
    with app.test_request_context('/'):
        error = BuildError("Test error", "no_handler", {})
        with pytest.raises(BuildError):
            app.handle_url_build_error(error, "no_handler", {})

def test_handle_url_build_error_multiple_handlers():
    app = Flask('test_app')
    
    class FirstHandler:
        def __call__(self, error, endpoint, values):
            return None

    class SecondHandler:
        def __call__(self, error, endpoint, values):
            return "http://example.com/second"

    app.url_build_error_handlers.append(FirstHandler())
    app.url_build_error_handlers.append(SecondHandler())
    
    with app.test_request_context('/'):
        error = BuildError("Test error", "any_endpoint", {})
        result = app.handle_url_build_error(error, "any_endpoint", {})
        assert result == "http://example.com/second"
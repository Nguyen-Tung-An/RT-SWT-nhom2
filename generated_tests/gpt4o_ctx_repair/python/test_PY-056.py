import pytest
from flask.sansio.app import App
from werkzeug.routing import BuildError

class MockApp(App):
    def __init__(self):
        super().__init__(import_name='test', static_url_path='', static_folder='', static_host='', host_matching=False, subdomain_matching=False, template_folder='', instance_path=None, instance_relative_config=False, root_path='')

    @property
    def url_build_error_handlers(self):
        if not hasattr(self, '_url_build_error_handlers'):
            self._url_build_error_handlers = []
        return self._url_build_error_handlers

def mock_handler_success(error, endpoint, values):
    return "success"

def mock_handler_none(error, endpoint, values):
    return None

def mock_handler_raise(error, endpoint, values):
    raise BuildError("Handler raised BuildError")

def test_handle_url_build_error_success():
    app = MockApp()
    app.url_build_error_handlers.append(mock_handler_success)
    result = app.handle_url_build_error(BuildError("Test error"), "test_endpoint", {})
    assert result == "success"

def test_handle_url_build_error_none():
    app = MockApp()
    app.url_build_error_handlers.append(mock_handler_none)
    with pytest.raises(BuildError):
        app.handle_url_build_error(BuildError("Test error"), "test_endpoint", {})

def test_handle_url_build_error_raise():
    app = MockApp()
    app.url_build_error_handlers.append(mock_handler_raise)
    with pytest.raises(BuildError, match="Handler raised BuildError"):
        app.handle_url_build_error(BuildError("Test error"), "test_endpoint", {})

def test_handle_url_build_error_multiple_handlers():
    app = MockApp()
    app.url_build_error_handlers.append(mock_handler_none)
    app.url_build_error_handlers.append(mock_handler_success)
    result = app.handle_url_build_error(BuildError("Test error"), "test_endpoint", {})
    assert result == "success"

def test_handle_url_build_error_re_raise():
    app = MockApp()
    app.url_build_error_handlers.append(mock_handler_raise)
    with pytest.raises(BuildError, match="Test error"):
        app.handle_url_build_error(BuildError("Test error"), "test_endpoint", {})
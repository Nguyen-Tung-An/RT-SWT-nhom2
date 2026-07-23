import pytest
from flask.app import Flask
from werkzeug.exceptions import BuildError

class TestHandleUrlBuildError:
    @pytest.fixture
    def app(self):
        return Flask(import_name="test_app")

    def test_handler_returns_value(self, app):
        def handler(error, endpoint, values):
            return "http://example.com"

        app.url_build_error_handlers = [handler]
        with app.test_request_context('/'):
            result = app.handle_url_build_error(BuildError(), 'test_endpoint', {})
            assert result == "http://example.com"

    def test_handler_returns_none(self, app):
        def handler(error, endpoint, values):
            return None

        app.url_build_error_handlers = [handler]
        with app.test_request_context('/'):
            with pytest.raises(BuildError):
                app.handle_url_build_error(BuildError(), 'test_endpoint', {})

    def test_handler_raises_build_error(self, app):
        def handler(error, endpoint, values):
            raise BuildError()

        app.url_build_error_handlers = [handler]
        with app.test_request_context('/'):
            with pytest.raises(BuildError):
                app.handle_url_build_error(BuildError(), 'test_endpoint', {})

    def test_multiple_handlers(self, app):
        def handler1(error, endpoint, values):
            return None

        def handler2(error, endpoint, values):
            return "http://example.com"

        app.url_build_error_handlers = [handler1, handler2]
        with app.test_request_context('/'):
            result = app.handle_url_build_error(BuildError(), 'test_endpoint', {})
            assert result == "http://example.com"

    def test_no_handlers(self, app):
        app.url_build_error_handlers = []
        with app.test_request_context('/'):
            with pytest.raises(BuildError):
                app.handle_url_build_error(BuildError(), 'test_endpoint', {})
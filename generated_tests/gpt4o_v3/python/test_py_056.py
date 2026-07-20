import pytest
from flask import Flask
from werkzeug.exceptions import BuildError

class TestHandleUrlBuildError:
    def setup_method(self):
        self.app = Flask('test_app')
        self.app.url_build_error_handlers = []

    def test_no_handlers(self):
        with self.app.test_request_context('/'):
            with pytest.raises(BuildError):
                self.app.handle_url_build_error(BuildError(), 'test_endpoint', {})

    def test_handler_returns_value(self):
        def handler(error, endpoint, values):
            return "http://example.com"

        self.app.url_build_error_handlers.append(handler)
        with self.app.test_request_context('/'):
            result = self.app.handle_url_build_error(BuildError(), 'test_endpoint', {})
            assert result == "http://example.com"

    def test_handler_raises_build_error(self):
        def handler(error, endpoint, values):
            raise BuildError()

        self.app.url_build_error_handlers.append(handler)
        with self.app.test_request_context('/'):
            with pytest.raises(BuildError):
                self.app.handle_url_build_error(BuildError(), 'test_endpoint', {})

    def test_multiple_handlers(self):
        def handler1(error, endpoint, values):
            return None

        def handler2(error, endpoint, values):
            return "http://example.com"

        self.app.url_build_error_handlers.extend([handler1, handler2])
        with self.app.test_request_context('/'):
            result = self.app.handle_url_build_error(BuildError(), 'test_endpoint', {})
            assert result == "http://example.com"

    def test_handler_returns_none(self):
        def handler(error, endpoint, values):
            return None

        self.app.url_build_error_handlers.append(handler)
        with self.app.test_request_context('/'):
            with pytest.raises(BuildError):
                self.app.handle_url_build_error(BuildError(), 'test_endpoint', {})
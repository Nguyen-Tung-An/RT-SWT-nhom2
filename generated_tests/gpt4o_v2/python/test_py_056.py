import pytest
from flask.sansio.app import App
from werkzeug.routing import BuildError

class TestHandleUrlBuildError:
    def setup_method(self):
        self.app = App()
        self.error = BuildError("Test error", "test_endpoint", {})
        self.values = {"key": "value"}

    def test_handler_returns_value(self):
        def handler(error, endpoint, values):
            return "Handled successfully"

        self.app.url_build_error_handlers = [handler]
        result = self.app.handle_url_build_error(self.error, "test_endpoint", self.values)
        assert result == "Handled successfully"

    def test_handler_returns_none(self):
        def handler(error, endpoint, values):
            return None

        self.app.url_build_error_handlers = [handler]
        with pytest.raises(BuildError):
            self.app.handle_url_build_error(self.error, "test_endpoint", self.values)

    def test_handler_raises_build_error(self):
        def handler(error, endpoint, values):
            raise BuildError("Another error", "test_endpoint", {})

        self.app.url_build_error_handlers = [handler]
        with pytest.raises(BuildError):
            self.app.handle_url_build_error(self.error, "test_endpoint", self.values)

    def test_multiple_handlers_first_returns_value(self):
        def handler1(error, endpoint, values):
            return "First handler"

        def handler2(error, endpoint, values):
            return "Second handler"

        self.app.url_build_error_handlers = [handler1, handler2]
        result = self.app.handle_url_build_error(self.error, "test_endpoint", self.values)
        assert result == "First handler"

    def test_multiple_handlers_all_return_none(self):
        def handler1(error, endpoint, values):
            return None

        def handler2(error, endpoint, values):
            return None

        self.app.url_build_error_handlers = [handler1, handler2]
        with pytest.raises(BuildError):
            self.app.handle_url_build_error(self.error, "test_endpoint", self.values)

    def test_multiple_handlers_last_raises(self):
        def handler1(error, endpoint, values):
            return None

        def handler2(error, endpoint, values):
            raise BuildError("Final error", "test_endpoint", {})

        self.app.url_build_error_handlers = [handler1, handler2]
        with pytest.raises(BuildError):
            self.app.handle_url_build_error(self.error, "test_endpoint", self.values)

    def test_re_raise_active_exception(self):
        def handler(error, endpoint, values):
            raise BuildError("Another error", "test_endpoint", {})

        self.app.url_build_error_handlers = [handler]
        with pytest.raises(BuildError):
            self.app.handle_url_build_error(self.error, "test_endpoint", self.values)
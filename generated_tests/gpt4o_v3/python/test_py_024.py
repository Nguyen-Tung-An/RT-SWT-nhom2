import pytest
from flask import Flask
from flask.ctx import AppContext

class TestAppContextPop:
    @pytest.fixture
    def app_context(self):
        app = Flask('test_app')
        with app.app_context() as ctx:
            yield ctx

    def test_pop_without_exception(self, app_context):
        app_context.pop()
        assert app_context._cv_token is None

    def test_pop_with_active_context(self, app_context):
        app_context._push_count = 1
        app_context.pop()
        assert app_context._push_count == 0

    def test_pop_with_multiple_pushes(self, app_context):
        app_context._push_count = 2
        app_context.pop()
        assert app_context._push_count == 1

    def test_pop_raises_runtime_error_when_not_pushed(self):
        app = Flask('test_app')
        ctx = AppContext(app=app)
        with pytest.raises(RuntimeError, match="Cannot pop this context"):
            ctx.pop()

    def test_pop_raises_runtime_error_when_no_active_context(self):
        app = Flask('test_app')
        ctx = AppContext(app=app)
        ctx._cv_token = 'token'
        with pytest.raises(RuntimeError, match="there is no active context"):
            ctx.pop()

    def test_pop_raises_runtime_error_when_context_mismatch(self, app_context):
        app = Flask('test_app')
        another_ctx = AppContext(app=app)
        another_ctx._cv_token = 'token'
        app_context._cv_token = 'token'
        with pytest.raises(RuntimeError, match="it is not the active context"):
            another_ctx.pop()
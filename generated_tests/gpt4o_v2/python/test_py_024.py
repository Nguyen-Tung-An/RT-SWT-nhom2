import pytest
from flask import Flask
from flask.ctx import AppContext

@pytest.fixture
def app():
    app = Flask(__name__)
    return app

@pytest.fixture
def app_context(app):
    ctx = app.app_context()
    ctx.push()
    yield ctx
    ctx.pop()

def test_pop_success(app_context):
    app_context.pop()
    assert app_context._cv_token is None

def test_pop_multiple_pushes(app):
    ctx = AppContext(app)
    ctx._cv_token = object()  # Simulate a pushed context
    ctx._push_count = 2
    ctx._request = None
    ctx._cv_app = {None: ctx}
    
    ctx.pop()
    assert ctx._push_count == 1  # Should not have popped completely

    ctx.pop()
    assert ctx._cv_token is None  # Should be None after full pop

def test_pop_no_active_context(app):
    ctx = AppContext(app)
    ctx._cv_token = None
    with pytest.raises(RuntimeError, match="Cannot pop this context"):
        ctx.pop()

def test_pop_not_active_context(app):
    ctx1 = AppContext(app)
    ctx2 = AppContext(app)
    ctx1._cv_token = object()  # Simulate a pushed context
    ctx2._cv_token = object()  # Simulate another pushed context
    ctx1._push_count = 1
    ctx2._push_count = 1
    ctx1._cv_app = {None: ctx1}
    ctx2._cv_app = {None: ctx2}
    
    ctx1.pop()
    with pytest.raises(RuntimeError, match="it is not the active context"):
        ctx2.pop()

def test_pop_with_exception(app):
    ctx = AppContext(app)
    ctx._cv_token = object()  # Simulate a pushed context
    ctx._push_count = 1
    ctx._request = None
    ctx._cv_app = {None: ctx}
    
    with pytest.raises(RuntimeError):
        ctx.pop(exc=Exception("Test Exception"))
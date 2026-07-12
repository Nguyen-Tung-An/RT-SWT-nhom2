import pytest
from flask import Flask
from flask.ctx import AppContext

@pytest.fixture
def app():
    app = Flask(__name__)
    with app.app_context():
        yield app

def test_pop_no_active_context(app):
    ctx = AppContext(app)
    with pytest.raises(RuntimeError, match="there is no active context"):
        ctx.pop()

def test_pop_not_pushed_context(app):
    ctx = AppContext(app)
    ctx._cv_token = None
    with pytest.raises(RuntimeError, match="it is not pushed"):
        ctx.pop()

def test_pop_active_context(app):
    ctx = AppContext(app)
    ctx._cv_token = object()
    ctx._push_count = 1
    ctx.push()
    ctx.pop()  # Should not raise an error

def test_pop_multiple_pushes(app):
    ctx = AppContext(app)
    ctx._cv_token = object()
    ctx._push_count = 2
    ctx.push()
    ctx.push()
    ctx.pop()  # Should not raise an error
    assert ctx._push_count == 1  # Check push count is decremented

def test_pop_final_pop(app):
    ctx = AppContext(app)
    ctx._cv_token = object()
    ctx._push_count = 1
    ctx.push()
    ctx.pop()  # Should not raise an error
    assert ctx._cv_token is None  # Check token is reset
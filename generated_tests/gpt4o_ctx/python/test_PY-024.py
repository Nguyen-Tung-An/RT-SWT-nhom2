import pytest
from flask.ctx import AppContext

@pytest.fixture
def app_context():
    app = ...  # Create a Flask app instance
    ctx = AppContext(app)
    ctx.push()
    yield ctx
    ctx.pop()

def test_pop_no_active_context(app_context):
    app_context.pop()  # Should not raise an error

def test_pop_with_unhandled_exception(app_context):
    with pytest.raises(RuntimeError):
        app_context.pop(exc=Exception("Test Exception"))

def test_pop_multiple_pushes(app_context):
    app_context.push()  # Push again
    app_context.pop()   # First pop
    app_context.pop()   # Second pop, should not raise

def test_pop_not_active_context(app_context):
    another_context = AppContext(app_context.app)
    with pytest.raises(RuntimeError):
        another_context.pop()

def test_pop_with_teardown(app_context):
    # Assuming do_teardown_request and do_teardown_appcontext are mocked
    app_context.pop()  # Should trigger teardown functions
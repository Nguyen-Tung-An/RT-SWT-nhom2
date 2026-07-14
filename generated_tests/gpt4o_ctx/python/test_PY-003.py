import pytest
from flask.app import Flask

@pytest.fixture
def app():
    return Flask(__name__)

def test_full_dispatch_request_first_request(app):
    ctx = app.app_context()
    ctx.push()
    response = app.full_dispatch_request(ctx)
    assert response is not None  # Ensure a response is returned

def test_full_dispatch_request_ignore_error(app):
    app.should_ignore_error = True
    ctx = app.app_context()
    ctx.push()
    response = app.full_dispatch_request(ctx)
    assert response is not None  # Ensure a response is returned

def test_full_dispatch_request_exception_handling(app):
    def mock_preprocess_request(ctx):
        raise ValueError("Test Exception")
    
    app.preprocess_request = mock_preprocess_request
    ctx = app.app_context()
    ctx.push()
    response = app.full_dispatch_request(ctx)
    assert response is not None  # Ensure a response is returned

def test_full_dispatch_request_no_preprocess(app):
    ctx = app.app_context()
    ctx.push()
    response = app.full_dispatch_request(ctx)
    assert response is not None  # Ensure a response is returned
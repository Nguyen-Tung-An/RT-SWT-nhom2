import pytest
from flask import Flask

@pytest.fixture
def app():
    return Flask(__name__)

def test_full_dispatch_request_first_request(app):
    with app.test_request_context():
        response = app.full_dispatch_request()
        assert response is not None  # Ensure a response is returned

def test_full_dispatch_request_ignore_error(app):
    app.should_ignore_error = True
    with app.test_request_context():
        response = app.full_dispatch_request()
        assert response is not None  # Ensure a response is returned

def test_full_dispatch_request_exception_handling(app):
    def mock_preprocess_request():
        raise ValueError("Test Exception")
    
    app.preprocess_request = mock_preprocess_request
    with app.test_request_context():
        response = app.full_dispatch_request()
        assert response is not None  # Ensure a response is returned

def test_full_dispatch_request_no_preprocess(app):
    with app.test_request_context():
        response = app.full_dispatch_request()
        assert response is not None  # Ensure a response is returned
import pytest
from flask import Flask, request

# Create a Flask app instance for testing
app = Flask('test_app')

# Sample before_request function
@app.before_request
def before_request_func():
    return "Before Request"

# Sample URL value preprocessor
@app.url_value_preprocessor
def url_value_preprocessor(endpoint, values):
    pass

def test_preprocess_request_with_before_request():
    with app.test_request_context('/'):
        response = app.preprocess_request(app.app_context())
        assert response == "Before Request"

def test_preprocess_request_with_url_value_preprocessor():
    @app.url_value_preprocessor
    def custom_preprocessor(endpoint, values):
        values['custom'] = 'value'

    with app.test_request_context('/'):
        response = app.preprocess_request(app.app_context())
        assert response is None  # No before_request return value

def test_preprocess_request_no_before_request():
    with app.test_request_context('/'):
        response = app.preprocess_request(app.app_context())
        assert response is None  # No before_request return value

def test_preprocess_request_multiple_before_requests():
    @app.before_request
    def another_before_request_func():
        return "Another Before Request"

    with app.test_request_context('/'):
        response = app.preprocess_request(app.app_context())
        assert response == "Another Before Request"

def test_preprocess_request_with_no_context():
    with pytest.raises(RuntimeError, match='Working outside of application context'):
        app.preprocess_request(None)
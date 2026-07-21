import pytest
from flask import Flask, current_app
from flask.wrappers import Request

@pytest.fixture
def app():
    app = Flask(__name__)
    app.debug = True
    yield app

@pytest.fixture
def request(app):
    with app.test_request_context():
        yield Request(environ={'REQUEST_METHOD': 'POST', 'CONTENT_TYPE': 'application/json'})

def test_load_form_data_debug_mode_no_files(request, app):
    current_app = app
    req = request
    req.mimetype = 'application/json'
    req.files = {}
    
    # Assuming _load_form_data is a method of a class that extends Request
    req._load_form_data()
    # No assertion needed, just checking for exceptions

def test_load_form_data_debug_mode_multipart(request, app):
    current_app = app
    req = request
    req.mimetype = 'multipart/form-data'
    req.files = {}
    
    # Assuming _load_form_data is a method of a class that extends Request
    req._load_form_data()
    # No assertion needed, just checking for exceptions

def test_load_form_data_not_debug_mode(request, app):
    current_app = app
    app.debug = False
    req = request
    req.mimetype = 'application/json'
    req.files = {}
    
    # Assuming _load_form_data is a method of a class that extends Request
    req._load_form_data()
    # No assertion needed, just checking for exceptions
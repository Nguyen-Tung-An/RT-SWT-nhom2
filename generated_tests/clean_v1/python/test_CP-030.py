import pytest
from flask import Flask, Request
from werkzeug.exceptions import RequestRedirect
from flask.app import Flask as FlaskApp

@pytest.fixture
def app():
    app = FlaskApp(__name__)
    app.debug = True
    return app

def test_raise_routing_exception_redirect(app):
    request = Request(environ={'REQUEST_METHOD': 'POST'})
    request.routing_exception = RequestRedirect('http://example.com', code=302)
    
    with pytest.raises(RequestRedirect):
        app.raise_routing_exception(request)

def test_raise_routing_exception_no_debug(app):
    app.debug = False
    request = Request(environ={'REQUEST_METHOD': 'POST'})
    request.routing_exception = RequestRedirect('http://example.com', code=302)
    
    with pytest.raises(RequestRedirect):
        app.raise_routing_exception(request)

def test_raise_routing_exception_with_307(app):
    request = Request(environ={'REQUEST_METHOD': 'POST'})
    request.routing_exception = RequestRedirect('http://example.com', code=307)
    
    with pytest.raises(RequestRedirect):
        app.raise_routing_exception(request)

def test_raise_routing_exception_with_308(app):
    request = Request(environ={'REQUEST_METHOD': 'POST'})
    request.routing_exception = RequestRedirect('http://example.com', code=308)
    
    with pytest.raises(RequestRedirect):
        app.raise_routing_exception(request)

def test_raise_routing_exception_get_method(app):
    request = Request(environ={'REQUEST_METHOD': 'GET'})
    request.routing_exception = RequestRedirect('http://example.com', code=302)
    
    with pytest.raises(RequestRedirect):
        app.raise_routing_exception(request)

def test_raise_routing_exception_head_method(app):
    request = Request(environ={'REQUEST_METHOD': 'HEAD'})
    request.routing_exception = RequestRedirect('http://example.com', code=302)
    
    with pytest.raises(RequestRedirect):
        app.raise_routing_exception(request)

def test_raise_routing_exception_options_method(app):
    request = Request(environ={'REQUEST_METHOD': 'OPTIONS'})
    request.routing_exception = RequestRedirect('http://example.com', code=302)
    
    with pytest.raises(RequestRedirect):
        app.raise_routing_exception(request)

def test_raise_form_data_routing_redirect(app):
    from flask.app import FormDataRoutingRedirect
    request = Request(environ={'REQUEST_METHOD': 'POST'})
    request.routing_exception = RequestRedirect('http://example.com', code=302)
    
    app.debug = True
    with pytest.raises(FormDataRoutingRedirect):
        app.raise_routing_exception(request)
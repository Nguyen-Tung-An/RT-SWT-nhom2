import pytest
from flask import Flask, Request
from werkzeug.exceptions import RequestRedirect

@pytest.fixture
def app():
    return Flask(import_name="test_app")

def create_request(exception_code, method='GET'):
    class MockRequest:
        def __init__(self, code, method):
            self.routing_exception = RequestRedirect('', code)
            self.method = method
            
    return MockRequest(exception_code, method)

def test_raise_routing_exception_not_debug(app):
    app.debug = False
    request = create_request(301)
    with pytest.raises(RequestRedirect):
        app.raise_routing_exception(request)

def test_raise_routing_exception_debug_not_redirect(app):
    app.debug = True
    request = create_request(301)
    with pytest.raises(RequestRedirect):
        app.raise_routing_exception(request)

def test_raise_routing_exception_debug_redirect_307(app):
    app.debug = True
    request = create_request(307)
    with pytest.raises(RequestRedirect):
        app.raise_routing_exception(request)

def test_raise_routing_exception_debug_redirect_308(app):
    app.debug = True
    request = create_request(308)
    with pytest.raises(RequestRedirect):
        app.raise_routing_exception(request)

def test_raise_routing_exception_debug_get_method(app):
    app.debug = True
    request = create_request(301, method='GET')
    with pytest.raises(RequestRedirect):
        app.raise_routing_exception(request)

def test_raise_routing_exception_debug_head_method(app):
    app.debug = True
    request = create_request(301, method='HEAD')
    with pytest.raises(RequestRedirect):
        app.raise_routing_exception(request)

def test_raise_routing_exception_debug_options_method(app):
    app.debug = True
    request = create_request(301, method='OPTIONS')
    with pytest.raises(RequestRedirect):
        app.raise_routing_exception(request)

def test_raise_routing_exception_debug_post_method(app):
    app.debug = True
    request = create_request(301, method='POST')
    with pytest.raises(Exception):  # Expecting FormDataRoutingRedirect
        app.raise_routing_exception(request)
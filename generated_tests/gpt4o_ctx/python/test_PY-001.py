import pytest
from flask.app import Flask
from werkzeug.exceptions import RequestRedirect

class MockRequest:
    def __init__(self, routing_exception):
        self.routing_exception = routing_exception

def test_raise_routing_exception_not_debug():
    app = Flask(__name__)
    app.debug = False
    request = MockRequest(RequestRedirect("Redirect", 302))
    
    with pytest.raises(RequestRedirect):
        app.raise_routing_exception(request)

def test_raise_routing_exception_debug_not_redirect():
    app = Flask(__name__)
    app.debug = True
    request = MockRequest(RequestRedirect("Redirect", 301))
    
    with pytest.raises(RequestRedirect):
        app.raise_routing_exception(request)

def test_raise_routing_exception_debug_redirect_307():
    app = Flask(__name__)
    app.debug = True
    request = MockRequest(RequestRedirect("Redirect", 307))
    
    with pytest.raises(RequestRedirect):
        app.raise_routing_exception(request)

def test_raise_routing_exception_debug_redirect_308():
    app = Flask(__name__)
    app.debug = True
    request = MockRequest(RequestRedirect("Redirect", 308))
    
    with pytest.raises(RequestRedirect):
        app.raise_routing_exception(request)

def test_raise_routing_exception_debug_valid_method():
    app = Flask(__name__)
    app.debug = True
    request = MockRequest(RequestRedirect("Redirect", 302))
    request.method = "GET"
    
    with pytest.raises(RequestRedirect):
        app.raise_routing_exception(request)

def test_raise_routing_exception_debug_valid_method_head():
    app = Flask(__name__)
    app.debug = True
    request = MockRequest(RequestRedirect("Redirect", 302))
    request.method = "HEAD"
    
    with pytest.raises(RequestRedirect):
        app.raise_routing_exception(request)

def test_raise_routing_exception_debug_valid_method_options():
    app = Flask(__name__)
    app.debug = True
    request = MockRequest(RequestRedirect("Redirect", 302))
    request.method = "OPTIONS"
    
    with pytest.raises(RequestRedirect):
        app.raise_routing_exception(request)

def test_raise_routing_exception_debug_form_data_redirect():
    app = Flask(__name__)
    app.debug = True
    request = MockRequest(RequestRedirect("Redirect", 302))
    
    with pytest.raises(FormDataRoutingRedirect):
        app.raise_routing_exception(request)
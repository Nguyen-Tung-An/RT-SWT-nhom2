import pytest
from flask import Flask, Request
from werkzeug.exceptions import RequestRedirect
from flask.app import raise_routing_exception

class TestApp:
    def setup_method(self):
        self.app = Flask(__name__)
        self.app.debug = True

    def test_raise_routing_exception_not_debug(self):
        self.app.debug = False
        request = Request(environ={'REQUEST_METHOD': 'POST'})
        request.routing_exception = RequestRedirect('http://example.com', 301)
        
        with pytest.raises(RequestRedirect):
            raise_routing_exception(self.app, request)

    def test_raise_routing_exception_redirect_307(self):
        request = Request(environ={'REQUEST_METHOD': 'POST'})
        request.routing_exception = RequestRedirect('http://example.com', 307)
        
        with pytest.raises(RequestRedirect):
            raise_routing_exception(self.app, request)

    def test_raise_routing_exception_redirect_308(self):
        request = Request(environ={'REQUEST_METHOD': 'POST'})
        request.routing_exception = RequestRedirect('http://example.com', 308)
        
        with pytest.raises(RequestRedirect):
            raise_routing_exception(self.app, request)

    def test_raise_routing_exception_get_method(self):
        request = Request(environ={'REQUEST_METHOD': 'GET'})
        request.routing_exception = RequestRedirect('http://example.com', 301)
        
        with pytest.raises(RequestRedirect):
            raise_routing_exception(self.app, request)

    def test_raise_routing_exception_head_method(self):
        request = Request(environ={'REQUEST_METHOD': 'HEAD'})
        request.routing_exception = RequestRedirect('http://example.com', 301)
        
        with pytest.raises(RequestRedirect):
            raise_routing_exception(self.app, request)

    def test_raise_routing_exception_options_method(self):
        request = Request(environ={'REQUEST_METHOD': 'OPTIONS'})
        request.routing_exception = RequestRedirect('http://example.com', 301)
        
        with pytest.raises(RequestRedirect):
            raise_routing_exception(self.app, request)

    def test_raise_routing_exception_valid_case(self):
        request = Request(environ={'REQUEST_METHOD': 'POST'})
        request.routing_exception = RequestRedirect('http://example.com', 301)
        
        # Simulate the condition where FormDataRoutingRedirect would be raised
        self.app.debug = True
        with pytest.raises(FormDataRoutingRedirect):
            raise_routing_exception(self.app, request)
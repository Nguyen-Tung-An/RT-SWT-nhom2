import pytest
from flask import Flask, Request
from werkzeug.routing import RequestRedirect
from flask.debughelpers import FormDataRoutingRedirect

class TestFlaskRaiseRoutingException:
    @pytest.fixture
    def app(self):
        return Flask(import_name="test_app")

    def test_raise_routing_exception_debug_mode(self, app):
        app.debug = True
        with app.test_request_context('/'):
            request = Request(environ={'REQUEST_METHOD': 'POST'})
            request.routing_exception = RequestRedirect('http://example.com')
            with pytest.raises(FormDataRoutingRedirect):
                app.raise_routing_exception(request)

    def test_raise_routing_exception_non_debug_mode(self, app):
        app.debug = False
        with app.test_request_context('/'):
            request = Request(environ={'REQUEST_METHOD': 'POST'})
            request.routing_exception = RequestRedirect('http://example.com')
            with pytest.raises(RequestRedirect):
                app.raise_routing_exception(request)

    def test_raise_routing_exception_with_307_redirect(self, app):
        app.debug = True
        with app.test_request_context('/'):
            request = Request(environ={'REQUEST_METHOD': 'POST'})
            request.routing_exception = RequestRedirect('http://example.com')
            with pytest.raises(RequestRedirect):
                app.raise_routing_exception(request)

    def test_raise_routing_exception_with_308_redirect(self, app):
        app.debug = True
        with app.test_request_context('/'):
            request = Request(environ={'REQUEST_METHOD': 'POST'})
            request.routing_exception = RequestRedirect('http://example.com')
            with pytest.raises(RequestRedirect):
                app.raise_routing_exception(request)

    def test_raise_routing_exception_with_get_method(self, app):
        app.debug = True
        with app.test_request_context('/'):
            request = Request(environ={'REQUEST_METHOD': 'GET'})
            request.routing_exception = RequestRedirect('http://example.com')
            with pytest.raises(RequestRedirect):
                app.raise_routing_exception(request)

    def test_raise_form_data_routing_redirect(self, app):
        app.debug = True
        with app.test_request_context('/'):
            request = Request(environ={'REQUEST_METHOD': 'POST'})
            request.routing_exception = RequestRedirect('http://example.com')
            with pytest.raises(FormDataRoutingRedirect):
                app.raise_routing_exception(request)
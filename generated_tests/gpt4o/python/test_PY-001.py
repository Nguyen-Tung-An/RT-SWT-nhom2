import pytest
from flask.app import Flask, Request, RequestRedirect, FormDataRoutingRedirect

class MockRequest:
    def __init__(self, routing_exception, method):
        self.routing_exception = routing_exception
        self.method = method

class MockApp:
    def __init__(self, debug):
        self.debug = debug

    def raise_routing_exception(self, request: MockRequest) -> None:
        if (
            not self.debug
            or not isinstance(request.routing_exception, RequestRedirect)
            or request.routing_exception.code in {307, 308}
            or request.method in {"GET", "HEAD", "OPTIONS"}
        ):
            raise request.routing_exception

        raise FormDataRoutingRedirect(request)

def test_raise_routing_exception_not_debug():
    app = MockApp(debug=False)
    request = MockRequest(RequestRedirect(302), "POST")
    with pytest.raises(RequestRedirect):
        app.raise_routing_exception(request)

def test_raise_routing_exception_is_not_redirect():
    app = MockApp(debug=True)
    request = MockRequest(Exception("Some error"), "POST")
    with pytest.raises(Exception):
        app.raise_routing_exception(request)

def test_raise_routing_exception_redirect_307():
    app = MockApp(debug=True)
    request = MockRequest(RequestRedirect(307), "POST")
    with pytest.raises(RequestRedirect):
        app.raise_routing_exception(request)

def test_raise_routing_exception_redirect_308():
    app = MockApp(debug=True)
    request = MockRequest(RequestRedirect(308), "POST")
    with pytest.raises(RequestRedirect):
        app.raise_routing_exception(request)

def test_raise_routing_exception_get_method():
    app = MockApp(debug=True)
    request = MockRequest(RequestRedirect(302), "GET")
    with pytest.raises(RequestRedirect):
        app.raise_routing_exception(request)

def test_raise_routing_exception_head_method():
    app = MockApp(debug=True)
    request = MockRequest(RequestRedirect(302), "HEAD")
    with pytest.raises(RequestRedirect):
        app.raise_routing_exception(request)

def test_raise_routing_exception_options_method():
    app = MockApp(debug=True)
    request = MockRequest(RequestRedirect(302), "OPTIONS")
    with pytest.raises(RequestRedirect):
        app.raise_routing_exception(request)

def test_raise_routing_exception_valid_case():
    app = MockApp(debug=True)
    request = MockRequest(RequestRedirect(302), "POST")
    with pytest.raises(FormDataRoutingRedirect):
        app.raise_routing_exception(request)
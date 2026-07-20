import pytest
from flask import Flask, request
from werkzeug.exceptions import HTTPException

class TestFlaskRaiseRoutingException:
    @pytest.fixture
    def app(self):
        return Flask(import_name="test_app")

    def test_raise_routing_exception_debug_mode(self, app):
        app.debug = True
        with app.test_request_context('/'):
            request.routing_exception = HTTPException('Redirect', response='Redirect', code=301)
            with pytest.raises(HTTPException):
                app.raise_routing_exception(request)

    def test_raise_routing_exception_non_debug_mode(self, app):
        app.debug = False
        with app.test_request_context('/'):
            request.routing_exception = HTTPException('Redirect', response='Redirect', code=301)
            with pytest.raises(HTTPException):
                app.raise_routing_exception(request)

    def test_raise_routing_exception_with_307_redirect(self, app):
        app.debug = True
        with app.test_request_context('/'):
            request.routing_exception = HTTPException('Redirect', response='Redirect', code=307)
            with pytest.raises(HTTPException):
                app.raise_routing_exception(request)

    def test_raise_routing_exception_with_308_redirect(self, app):
        app.debug = True
        with app.test_request_context('/'):
            request.routing_exception = HTTPException('Redirect', response='Redirect', code=308)
            with pytest.raises(HTTPException):
                app.raise_routing_exception(request)

    def test_raise_routing_exception_with_get_method(self, app):
        app.debug = True
        with app.test_request_context('/'):
            request.routing_exception = HTTPException('Redirect', response='Redirect', code=301)
            with pytest.raises(HTTPException):
                app.raise_routing_exception(request)

    def test_raise_form_data_routing_redirect(self, app):
        app.debug = True
        with app.test_request_context('/'):
            request.routing_exception = HTTPException('Redirect', response='Redirect', code=301)
            from flask.debughelpers import FormDataRoutingRedirect
            with pytest.raises(FormDataRoutingRedirect):
                app.raise_routing_exception(request)
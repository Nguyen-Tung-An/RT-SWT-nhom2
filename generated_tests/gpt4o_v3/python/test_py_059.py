import pytest
from flask import Flask, Response
from flask.sessions import SecureCookieSessionInterface

class MockSession:
    def __init__(self, accessed=False, modified=False):
        self.accessed = accessed
        self.modified = modified

    def __bool__(self):
        return True

class TestSecureCookieSessionInterface:
    @pytest.fixture
    def setup_app(self):
        app = Flask('test_app')
        with app.test_request_context('/'):
            yield app

    def test_save_session_accessed(self, setup_app):
        session = MockSession(accessed=True)
        response = Response()
        interface = SecureCookieSessionInterface()
        interface.save_session(setup_app, session, response)
        assert "Cookie" in response.vary

    def test_save_session_not_accessed(self, setup_app):
        session = MockSession(accessed=False)
        response = Response()
        interface = SecureCookieSessionInterface()
        interface.save_session(setup_app, session, response)
        assert "Cookie" not in response.vary

    def test_save_session_empty_modified(self, setup_app):
        session = MockSession(accessed=False, modified=True)
        session.__bool__ = lambda: False  # Simulate empty session
        response = Response()
        interface = SecureCookieSessionInterface()
        interface.save_session(setup_app, session, response)
        assert "Cookie" not in response.vary

    def test_save_session_empty_not_modified(self, setup_app):
        session = MockSession(accessed=False, modified=False)
        session.__bool__ = lambda: False  # Simulate empty session
        response = Response()
        interface = SecureCookieSessionInterface()
        interface.save_session(setup_app, session, response)
        assert "Cookie" not in response.vary

    def test_save_session_should_set_cookie(self, setup_app):
        session = MockSession(accessed=True)
        response = Response()
        interface = SecureCookieSessionInterface()
        interface.should_set_cookie = lambda app, session: True  # Force cookie setting
        interface.save_session(setup_app, session, response)
        assert response.headers.get('Set-Cookie') is not None

    def test_save_session_should_not_set_cookie(self, setup_app):
        session = MockSession(accessed=True)
        response = Response()
        interface = SecureCookieSessionInterface()
        interface.should_set_cookie = lambda app, session: False  # Prevent cookie setting
        interface.save_session(setup_app, session, response)
        assert response.headers.get('Set-Cookie') is None
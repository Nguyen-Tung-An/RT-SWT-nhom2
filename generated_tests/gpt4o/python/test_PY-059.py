import pytest
from flask import Flask, Response
from flask.sessions import SecureCookieSessionInterface

class MockSession:
    def __init__(self, accessed=False, modified=False, data=None):
        self.accessed = accessed
        self.modified = modified
        self.data = data or {}

    def __bool__(self):
        return bool(self.data)

@pytest.fixture
def app():
    return Flask(__name__)

@pytest.fixture
def response():
    return Response()

@pytest.fixture
def session_interface():
    return SecureCookieSessionInterface()

def test_save_session_accessed(app, response, session_interface):
    session = MockSession(accessed=True, data={'key': 'value'})
    session_interface.save_session(app, session, response)
    assert "Vary" in response.vary
    assert "Cookie" in response.vary

def test_save_session_not_accessed(app, response, session_interface):
    session = MockSession(accessed=False, data={'key': 'value'})
    session_interface.save_session(app, session, response)
    assert "Vary" not in response.vary

def test_save_session_empty_not_modified(app, response, session_interface):
    session = MockSession(accessed=True, modified=False, data={})
    session_interface.save_session(app, session, response)
    assert "Vary" not in response.vary

def test_save_session_empty_modified(app, response, session_interface):
    session = MockSession(accessed=True, modified=True, data={})
    session_interface.save_session(app, session, response)
    assert "Vary" in response.vary
    assert response.headers.getlist('Set-Cookie') == []

def test_save_session_should_set_cookie(app, response, session_interface):
    session = MockSession(accessed=True, modified=True, data={'key': 'value'})
    session_interface.should_set_cookie = lambda app, session: True
    session_interface.get_expiration_time = lambda app, session: None
    session_interface.get_signing_serializer = lambda app: lambda x: x
    session_interface.save_session(app, session, response)
    assert "Vary" in response.vary
    assert "Set-Cookie" in response.headers

def test_save_session_should_not_set_cookie(app, response, session_interface):
    session = MockSession(accessed=True, modified=True, data={'key': 'value'})
    session_interface.should_set_cookie = lambda app, session: False
    session_interface.save_session(app, session, response)
    assert "Vary" not in response.vary
    assert "Set-Cookie" not in response.headers
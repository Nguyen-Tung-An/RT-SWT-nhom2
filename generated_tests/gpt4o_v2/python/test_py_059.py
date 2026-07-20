import pytest
from flask import Flask, Response
from flask.sessions import SecureCookieSessionInterface
from werkzeug.datastructures import Headers

class MockSession:
    def __init__(self, accessed=False, modified=False, data=None):
        self.accessed = accessed
        self.modified = modified
        self._data = data or {}

    def __bool__(self):
        return bool(self._data)

    def __getitem__(self, key):
        return self._data[key]

    def __setitem__(self, key, value):
        self._data[key] = value
        self.modified = True

@pytest.fixture
def app():
    return Flask(__name__)

@pytest.fixture
def response():
    return Response(headers=Headers())

@pytest.fixture
def session_interface():
    return SecureCookieSessionInterface()

def test_save_session_with_accessed_and_modified(app, response, session_interface):
    session = MockSession(accessed=True, modified=True, data={'key': 'value'})
    session_interface.save_session(app, session, response)
    assert 'Set-Cookie' in response.headers

def test_save_session_with_accessed_not_modified(app, response, session_interface):
    session = MockSession(accessed=True, modified=False, data={'key': 'value'})
    session_interface.save_session(app, session, response)
    assert 'Set-Cookie' in response.headers

def test_save_session_not_accessed(app, response, session_interface):
    session = MockSession(accessed=False, modified=False, data={'key': 'value'})
    session_interface.save_session(app, session, response)
    assert 'Set-Cookie' not in response.headers

def test_save_session_empty_session_modified(app, response, session_interface):
    session = MockSession(accessed=False, modified=True, data={})
    session_interface.save_session(app, session, response)
    assert 'Set-Cookie' not in response.headers

def test_save_session_empty_session_not_modified(app, response, session_interface):
    session = MockSession(accessed=False, modified=False, data={})
    session_interface.save_session(app, session, response)
    assert 'Set-Cookie' not in response.headers

def test_save_session_should_set_cookie_false(app, response, session_interface):
    session = MockSession(accessed=True, modified=False, data={'key': 'value'})
    session_interface.should_set_cookie = lambda app, session: False
    session_interface.save_session(app, session, response)
    assert 'Set-Cookie' not in response.headers

def test_save_session_should_set_cookie_true(app, response, session_interface):
    session = MockSession(accessed=True, modified=False, data={'key': 'value'})
    session_interface.should_set_cookie = lambda app, session: True
    session_interface.save_session(app, session, response)
    assert 'Set-Cookie' in response.headers
import pytest
from flask import Flask, Response
from flask.sessions import SecureCookieSessionInterface, SessionMixin

class MockSession(SessionMixin):
    def __init__(self, accessed=False, modified=False, data=None):
        self.accessed = accessed
        self.modified = modified
        self._data = data or {}

    def __getitem__(self, key):
        return self._data[key]

    def __setitem__(self, key, value):
        self.modified = True
        self._data[key] = value

    def __delitem__(self, key):
        self.modified = True
        del self._data[key]

    def __iter__(self):
        return iter(self._data)

    def __len__(self):
        return len(self._data)

    def __bool__(self):
        return bool(self._data)

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
    session = MockSession(accessed=True, modified=False, data={'key': 'value'})
    session_interface.save_session(app, session, response)
    assert 'Set-Cookie' in response.headers

def test_save_session_modified(app, response, session_interface):
    session = MockSession(accessed=True, modified=True, data={'key': 'value'})
    session_interface.save_session(app, session, response)
    assert 'Set-Cookie' in response.headers

def test_save_session_empty(app, response, session_interface):
    session = MockSession(accessed=False, modified=False, data={})
    session_interface.save_session(app, session, response)
    assert 'Set-Cookie' not in response.headers

def test_save_session_modified_empty(app, response, session_interface):
    session = MockSession(accessed=True, modified=True, data={})
    session_interface.save_session(app, session, response)
    assert 'Set-Cookie' in response.headers

def test_save_session_should_not_set_cookie(app, response, session_interface):
    session = MockSession(accessed=True, modified=False, data={'key': 'value'})
    session_interface.should_set_cookie = lambda app, session: False
    session_interface.save_session(app, session, response)
    assert 'Set-Cookie' not in response.headers

def test_save_session_delete_cookie(app, response, session_interface):
    session = MockSession(accessed=False, modified=True, data={})
    session_interface.save_session(app, session, response)
    assert 'Set-Cookie' in response.headers
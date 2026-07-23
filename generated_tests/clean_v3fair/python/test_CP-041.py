import pytest
from requests.auth import HTTPDigestAuth
from requests.models import Response

@pytest.fixture
def auth():
    return HTTPDigestAuth(username="test", password="test")

def test_handle_401_not_4xx(auth):
    response = Response()
    response.status_code = 200
    result = auth.handle_401(response)
    assert result == response
    assert auth._thread_local.num_401_calls == 1

def test_handle_401_first_call(auth):
    response = Response()
    response.status_code = 401
    response.headers['www-authenticate'] = 'Digest realm="test"'
    response.request = Response()
    response.request.method = 'GET'
    response.request.url = 'http://example.com'
    response.request.body = None
    auth._thread_local.num_401_calls = 0
    result = auth.handle_401(response)
    assert auth._thread_local.num_401_calls == 1
    assert result.history == [response]

def test_handle_401_second_call(auth):
    response = Response()
    response.status_code = 401
    response.headers['www-authenticate'] = 'Digest realm="test"'
    response.request = Response()
    response.request.method = 'GET'
    response.request.url = 'http://example.com'
    response.request.body = None
    auth._thread_local.num_401_calls = 1
    result = auth.handle_401(response)
    assert auth._thread_local.num_401_calls == 1
    assert result == response

def test_handle_401_no_digest(auth):
    response = Response()
    response.status_code = 401
    response.headers['www-authenticate'] = 'Basic realm="test"'
    response.request = Response()
    response.request.method = 'GET'
    response.request.url = 'http://example.com'
    response.request.body = None
    auth._thread_local.num_401_calls = 0
    result = auth.handle_401(response)
    assert auth._thread_local.num_401_calls == 1
    assert result == response
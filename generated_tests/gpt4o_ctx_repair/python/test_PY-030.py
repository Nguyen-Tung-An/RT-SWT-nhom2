import pytest
from requests.auth import HTTPDigestAuth
from requests.models import Response

@pytest.fixture
def auth():
    return HTTPDigestAuth('username', 'password')

def test_handle_401_not_4xx(auth):
    response = Response()
    response.status_code = 200
    result = auth.handle_401(response)
    assert result == response
    assert auth._thread_local.num_401_calls == 1

def test_handle_401_digest_auth(auth):
    response = Response()
    response.status_code = 401
    response.headers['www-authenticate'] = 'Digest realm="example"'
    auth._thread_local.num_401_calls = 1
    auth._thread_local.pos = None  # Initialize pos attribute
    result = auth.handle_401(response)
    assert auth._thread_local.num_401_calls == 2
    assert result.history == [response]

def test_handle_401_digest_auth_second_call(auth):
    response = Response()
    response.status_code = 401
    response.headers['www-authenticate'] = 'Digest realm="example"'
    auth._thread_local.num_401_calls = 2
    auth._thread_local.pos = None  # Initialize pos attribute
    result = auth.handle_401(response)
    assert auth._thread_local.num_401_calls == 1
    assert result == response

def test_handle_401_no_digest_header(auth):
    response = Response()
    response.status_code = 401
    response.headers['www-authenticate'] = ''
    auth._thread_local.num_401_calls = 1
    auth._thread_local.pos = None  # Initialize pos attribute
    result = auth.handle_401(response)
    assert auth._thread_local.num_401_calls == 1
    assert result == response
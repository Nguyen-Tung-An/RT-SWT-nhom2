import pytest
from requests.auth import AuthBase, handle_401
from requests.models import Response

class MockAuth(AuthBase):
    def __init__(self):
        self._thread_local = type('ThreadLocal', (object,), {})()
        self._thread_local.num_401_calls = 0
        self._thread_local.pos = None
        self._thread_local.chal = None

    def build_digest_header(self, method, url):
        return "Digest auth_header"

@pytest.fixture
def mock_response():
    return Response()

def test_handle_401_not_4xx(mock_response):
    mock_response.status_code = 200
    auth = MockAuth()
    result = auth.handle_401(mock_response)
    assert result == mock_response
    assert auth._thread_local.num_401_calls == 1

def test_handle_401_digest_auth_first_call(mock_response):
    mock_response.status_code = 401
    mock_response.headers['www-authenticate'] = 'Digest realm="test"'
    auth = MockAuth()
    result = auth.handle_401(mock_response)
    assert result != mock_response
    assert auth._thread_local.num_401_calls == 1

def test_handle_401_digest_auth_second_call(mock_response):
    mock_response.status_code = 401
    mock_response.headers['www-authenticate'] = 'Digest realm="test"'
    auth = MockAuth()
    auth._thread_local.num_401_calls = 1
    result = auth.handle_401(mock_response)
    assert result != mock_response
    assert auth._thread_local.num_401_calls == 2

def test_handle_401_no_digest_auth(mock_response):
    mock_response.status_code = 401
    mock_response.headers['www-authenticate'] = 'Basic realm="test"'
    auth = MockAuth()
    result = auth.handle_401(mock_response)
    assert result == mock_response
    assert auth._thread_local.num_401_calls == 1
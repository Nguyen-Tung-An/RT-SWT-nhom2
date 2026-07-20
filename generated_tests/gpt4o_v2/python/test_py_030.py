import pytest
from requests.auth import HTTPDigestAuth
from requests.models import Response
from unittest.mock import Mock

class TestHTTPDigestAuth:
    @pytest.fixture
    def auth(self):
        return HTTPDigestAuth('username', 'password')

    @pytest.fixture
    def response(self):
        r = Response()
        r.status_code = 401
        r.headers = {'www-authenticate': 'Digest realm="test", qop="auth", nonce="abc123"'}
        r.request = Mock()
        r.request.method = 'GET'
        r.request.url = 'http://example.com'
        r.request.body = Mock()
        return r

    def test_handle_401_not_4xx(self, auth):
        r = Response()
        r.status_code = 200
        response = auth.handle_401(r)
        assert response == r
        assert auth._thread_local.num_401_calls == 1

    def test_handle_401_no_digest_auth(self, auth):
        r = Response()
        r.status_code = 401
        r.headers = {'www-authenticate': 'Basic realm="test"'}
        r.request = Mock()
        r.request.method = 'GET'
        r.request.url = 'http://example.com'
        r.request.body = Mock()
        response = auth.handle_401(r)
        assert response == r
        assert auth._thread_local.num_401_calls == 1

    def test_handle_401_digest_auth_first_call(self, auth, response):
        auth._thread_local.num_401_calls = 0
        response.request.body.seek = Mock()
        response.request.body.seek.return_value = None
        response = auth.handle_401(response)
        assert response.status_code == 200
        assert auth._thread_local.num_401_calls == 1

    def test_handle_401_digest_auth_second_call(self, auth, response):
        auth._thread_local.num_401_calls = 1
        response.request.body.seek = Mock()
        response.request.body.seek.return_value = None
        response = auth.handle_401(response)
        assert response.status_code == 401
        assert auth._thread_local.num_401_calls == 1

    def test_handle_401_digest_auth_exceed_limit(self, auth, response):
        auth._thread_local.num_401_calls = 2
        response.request.body.seek = Mock()
        response.request.body.seek.return_value = None
        response = auth.handle_401(response)
        assert response.status_code == 401
        assert auth._thread_local.num_401_calls == 1
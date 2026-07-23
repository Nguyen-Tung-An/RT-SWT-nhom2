import pytest
from requests.auth import HTTPDigestAuth
from requests.models import Response
from unittest.mock import Mock

class TestHTTPDigestAuth:
    def setup_method(self):
        self.auth = HTTPDigestAuth(username="test", password="test")
        self.auth._thread_local = Mock()
        self.auth._thread_local.num_401_calls = 0
        self.auth._thread_local.pos = None

    def test_handle_401_non_4xx_response(self):
        r = Response()
        r.status_code = 200
        result = self.auth.handle_401(r)
        assert result == r
        assert self.auth._thread_local.num_401_calls == 1

    def test_handle_401_with_401_digest_auth(self):
        r = Response()
        r.status_code = 401
        r.headers['www-authenticate'] = 'Digest realm="test"'
        r.request = Mock()
        r.request.body = Mock()
        r.request.method = 'GET'
        r.request.url = 'http://example.com'
        self.auth._thread_local.pos = 0
        
        result = self.auth.handle_401(r)
        assert self.auth._thread_local.num_401_calls == 1
        assert 'Authorization' in result.request.headers

    def test_handle_401_with_401_digest_auth_second_call(self):
        r = Response()
        r.status_code = 401
        r.headers['www-authenticate'] = 'Digest realm="test"'
        r.request = Mock()
        r.request.body = Mock()
        r.request.method = 'GET'
        r.request.url = 'http://example.com'
        self.auth._thread_local.num_401_calls = 1
        self.auth._thread_local.pos = 0
        
        result = self.auth.handle_401(r)
        assert self.auth._thread_local.num_401_calls == 2
        assert 'Authorization' in result.request.headers

    def test_handle_401_with_401_non_digest_auth(self):
        r = Response()
        r.status_code = 401
        r.headers['www-authenticate'] = 'Basic realm="test"'
        r.request = Mock()
        r.request.body = Mock()
        r.request.method = 'GET'
        r.request.url = 'http://example.com'
        
        result = self.auth.handle_401(r)
        assert result == r
        assert self.auth._thread_local.num_401_calls == 1

    def test_handle_401_with_404_response(self):
        r = Response()
        r.status_code = 404
        result = self.auth.handle_401(r)
        assert result == r
        assert self.auth._thread_local.num_401_calls == 1
import pytest
from requests.auth import HTTPDigestAuth
from requests.models import Response

class TestHTTPDigestAuth:
    def setup_method(self):
        self.auth = HTTPDigestAuth(username="test", password="test")

    def test_handle_401_non_4xx_response(self):
        r = Response()
        r.status_code = 200
        result = self.auth.handle_401(r)
        assert result == r
        assert self.auth._thread_local.num_401_calls == 1

    def test_handle_401_401_response_no_digest(self):
        r = Response()
        r.status_code = 401
        r.headers["www-authenticate"] = "Basic realm='example'"
        result = self.auth.handle_401(r)
        assert result == r
        assert self.auth._thread_local.num_401_calls == 1

    def test_handle_401_401_response_with_digest_first_call(self):
        r = Response()
        r.status_code = 401
        r.headers["www-authenticate"] = "Digest realm='example'"
        r.request = Response()  # Simulating a request object
        r.request.method = 'GET'
        r.request.url = 'http://example.com'
        r.request.body = None
        self.auth._thread_local.num_401_calls = 1
        result = self.auth.handle_401(r)
        assert result != r
        assert self.auth._thread_local.num_401_calls == 2

    def test_handle_401_401_response_with_digest_second_call(self):
        r = Response()
        r.status_code = 401
        r.headers["www-authenticate"] = "Digest realm='example'"
        r.request = Response()  # Simulating a request object
        r.request.method = 'GET'
        r.request.url = 'http://example.com'
        r.request.body = None
        self.auth._thread_local.num_401_calls = 2
        result = self.auth.handle_401(r)
        assert result == r
        assert self.auth._thread_local.num_401_calls == 1
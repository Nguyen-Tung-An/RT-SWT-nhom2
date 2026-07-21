import pytest
from requests.adapters import HTTPAdapter
from requests.models import Request

class TestHTTPAdapter:

    def setup_method(self):
        self.adapter = HTTPAdapter()

    def test_request_url_with_http_scheme(self):
        request = Request('GET', 'http://example.com')
        proxies = None
        result = self.adapter.request_url(request, proxies)
        assert result == 'http://example.com'

    def test_request_url_with_https_scheme(self):
        request = Request('GET', 'https://example.com')
        proxies = None
        result = self.adapter.request_url(request, proxies)
        assert result == 'https://example.com'

    def test_request_url_with_proxies(self):
        request = Request('GET', 'http://example.com')
        proxies = {'http': 'http://proxy.com'}
        result = self.adapter.request_url(request, proxies)
        assert result == 'http://proxy.com'

    def test_request_url_with_invalid_url(self):
        request = Request('GET', 'invalid-url')
        proxies = None
        with pytest.raises(ValueError):
            self.adapter.request_url(request, proxies)

    def test_request_url_with_empty_request(self):
        request = Request('GET', '')
        proxies = None
        with pytest.raises(ValueError):
            self.adapter.request_url(request, proxies)

    def test_request_url_with_none_request(self):
        proxies = None
        with pytest.raises(TypeError):
            self.adapter.request_url(None, proxies)
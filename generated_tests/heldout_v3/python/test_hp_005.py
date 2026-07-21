import pytest
from requests.adapters import HTTPAdapter
from requests.models import PreparedRequest
from urllib.parse import urlparse

class TestHTTPAdapter:
    def setup_method(self):
        self.adapter = HTTPAdapter()

    def test_request_url_no_proxy(self):
        request = PreparedRequest()
        request.url = 'http://example.com/path'
        request.path_url = '/path'
        result = self.adapter.request_url(request, None)
        assert result == '/path'

    def test_request_url_with_http_proxy(self):
        request = PreparedRequest()
        request.url = 'http://example.com/path'
        request.path_url = '/path'
        proxies = {'http': 'http://proxy.com'}
        result = self.adapter.request_url(request, proxies)
        assert result == 'http://example.com/path'

    def test_request_url_with_https_proxy(self):
        request = PreparedRequest()
        request.url = 'http://example.com/path'
        request.path_url = '/path'
        proxies = {'http': 'https://proxy.com'}
        result = self.adapter.request_url(request, proxies)
        assert result == '/path'

    def test_request_url_with_socks_proxy(self):
        request = PreparedRequest()
        request.url = 'http://example.com/path'
        request.path_url = '/path'
        proxies = {'http': 'socks5://proxy.com'}
        result = self.adapter.request_url(request, proxies)
        assert result == '/path'

    def test_request_url_with_no_scheme(self):
        request = PreparedRequest()
        request.url = 'example.com/path'
        request.path_url = '/path'
        proxies = {'http': 'http://proxy.com'}
        result = self.adapter.request_url(request, proxies)
        assert result == 'example.com/path'
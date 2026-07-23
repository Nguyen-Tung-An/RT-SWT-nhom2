import pytest
from requests.sessions import SessionRedirectMixin
from requests.models import PreparedRequest

class TestRebuildProxies:
    def setup_method(self):
        self.mixin = SessionRedirectMixin()

    def test_rebuild_proxies_with_http_scheme(self):
        prepared_request = PreparedRequest()
        prepared_request.url = "http://example.com"
        prepared_request.headers = {}
        proxies = {"http": "http://proxy.com"}

        result = self.mixin.rebuild_proxies(prepared_request, proxies)

        assert result == {"http": "http://proxy.com"}
        assert "Proxy-Authorization" not in prepared_request.headers

    def test_rebuild_proxies_with_https_scheme(self):
        prepared_request = PreparedRequest()
        prepared_request.url = "https://example.com"
        prepared_request.headers = {}
        proxies = {"https": "https://proxy.com"}

        result = self.mixin.rebuild_proxies(prepared_request, proxies)

        assert result == {"https": "https://proxy.com"}
        assert "Proxy-Authorization" not in prepared_request.headers

    def test_rebuild_proxies_with_no_proxy(self):
        prepared_request = PreparedRequest()
        prepared_request.url = "http://example.com"
        prepared_request.headers = {}
        proxies = {"http": "http://proxy.com"}
        self.mixin.trust_env = False  # Simulate no proxy trust

        result = self.mixin.rebuild_proxies(prepared_request, proxies)

        assert result == {}
        assert "Proxy-Authorization" not in prepared_request.headers

    def test_rebuild_proxies_with_auth(self):
        prepared_request = PreparedRequest()
        prepared_request.url = "http://example.com"
        prepared_request.headers = {}
        proxies = {"http": "http://user:pass@proxy.com"}

        result = self.mixin.rebuild_proxies(prepared_request, proxies)

        assert result == {"http": "http://user:pass@proxy.com"}
        assert prepared_request.headers["Proxy-Authorization"] == "Basic dXNlcjpwYXNz"

    def test_rebuild_proxies_with_missing_scheme(self):
        prepared_request = PreparedRequest()
        prepared_request.url = "http://example.com"
        prepared_request.headers = {}
        proxies = {}

        result = self.mixin.rebuild_proxies(prepared_request, proxies)

        assert result == {}
        assert "Proxy-Authorization" not in prepared_request.headers

    def test_rebuild_proxies_with_invalid_proxies(self):
        prepared_request = PreparedRequest()
        prepared_request.url = "http://example.com"
        prepared_request.headers = {}
        proxies = {"ftp": "ftp://proxy.com"}

        result = self.mixin.rebuild_proxies(prepared_request, proxies)

        assert result == {}
        assert "Proxy-Authorization" not in prepared_request.headers
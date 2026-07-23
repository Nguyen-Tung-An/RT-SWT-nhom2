import pytest
from requests.sessions import SessionRedirectMixin

class TestSessionRedirectMixin:
    def setup_method(self):
        self.mixin = SessionRedirectMixin()

    def test_strip_auth_different_hostname(self):
        assert self.mixin.should_strip_auth("http://oldhost.com", "http://newhost.com") is True

    def test_strip_auth_same_hostname_http_to_https(self):
        assert self.mixin.should_strip_auth("http://example.com", "https://example.com") is False

    def test_strip_auth_http_to_http_different_port(self):
        assert self.mixin.should_strip_auth("http://example.com:80", "http://example.com:8080") is True

    def test_strip_auth_http_to_http_same_port(self):
        assert self.mixin.should_strip_auth("http://example.com:80", "http://example.com:80") is False

    def test_strip_auth_https_to_http_different_port(self):
        assert self.mixin.should_strip_auth("https://example.com:443", "http://example.com:8080") is True

    def test_strip_auth_https_to_https_same_port(self):
        assert self.mixin.should_strip_auth("https://example.com:443", "https://example.com:443") is False

    def test_strip_auth_http_to_https_default_ports(self):
        assert self.mixin.should_strip_auth("http://example.com", "https://example.com") is False

    def test_strip_auth_https_to_http_default_ports(self):
        assert self.mixin.should_strip_auth("https://example.com", "http://example.com") is True

    def test_strip_auth_http_to_https_non_default_ports(self):
        assert self.mixin.should_strip_auth("http://example.com:80", "https://example.com:8443") is True

    def test_strip_auth_https_to_http_non_default_ports(self):
        assert self.mixin.should_strip_auth("https://example.com:443", "http://example.com:8080") is True
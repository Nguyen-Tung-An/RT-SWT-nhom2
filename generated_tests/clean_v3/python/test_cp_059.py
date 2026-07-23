import pytest
from requests import Request
from requests.utils import resolve_proxies

class TestResolveProxies:

    def test_no_proxies_given(self):
        request = Request(url='http://example.com')
        result = resolve_proxies(request, None, True)
        assert result == {}

    def test_empty_proxies_dict(self):
        request = Request(url='http://example.com')
        result = resolve_proxies(request, {}, True)
        assert result == {}

    def test_proxies_with_no_proxy(self):
        request = Request(url='http://example.com')
        proxies = {'http': 'http://proxy.com', 'no_proxy': 'example.com'}
        result = resolve_proxies(request, proxies, True)
        assert result == {'http': 'http://proxy.com'}

    def test_proxies_with_trust_env(self, monkeypatch):
        monkeypatch.setenv('http_proxy', 'http://envproxy.com')
        request = Request(url='http://example.com')
        proxies = {'no_proxy': 'example.com'}
        result = resolve_proxies(request, proxies, True)
        assert result == {'http': 'http://envproxy.com'}

    def test_proxies_without_trust_env(self, monkeypatch):
        monkeypatch.setenv('http_proxy', 'http://envproxy.com')
        request = Request(url='http://example.com')
        proxies = {'no_proxy': 'example.com'}
        result = resolve_proxies(request, proxies, False)
        assert result == {}

    def test_https_proxies_with_trust_env(self, monkeypatch):
        monkeypatch.setenv('https_proxy', 'https://envproxy.com')
        request = Request(url='https://example.com')
        proxies = {'no_proxy': 'example.com'}
        result = resolve_proxies(request, proxies, True)
        assert result == {'https': 'https://envproxy.com'}

    def test_no_proxy_in_environment(self, monkeypatch):
        monkeypatch.setenv('http_proxy', 'http://envproxy.com')
        request = Request(url='http://example.com')
        proxies = {'http': 'http://proxy.com', 'no_proxy': 'example.com'}
        result = resolve_proxies(request, proxies, True)
        assert result == {'http': 'http://proxy.com'}

    def test_no_proxy_with_empty_environment(self, monkeypatch):
        monkeypatch.delenv('http_proxy', raising=False)
        request = Request(url='http://example.com')
        proxies = {'http': 'http://proxy.com', 'no_proxy': 'example.com'}
        result = resolve_proxies(request, proxies, True)
        assert result == {'http': 'http://proxy.com'}
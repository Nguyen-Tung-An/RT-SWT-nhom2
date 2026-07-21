import pytest
from requests.sessions import SessionRedirectMixin
from requests.models import PreparedRequest

class TestRebuildProxies:
    def setup_method(self):
        self.mixin = SessionRedirectMixin()

    def test_rebuild_proxies_with_http_scheme(self):
        prepared_request = PreparedRequest()
        prepared_request.url = 'http://example.com'
        prepared_request.headers = {}
        proxies = {'http': 'http://proxy.com', 'https': 'https://proxy.com'}
        
        result = self.mixin.rebuild_proxies(prepared_request, proxies)
        
        assert result == proxies
        assert 'Proxy-Authorization' not in prepared_request.headers

    def test_rebuild_proxies_with_https_scheme(self):
        prepared_request = PreparedRequest()
        prepared_request.url = 'https://example.com'
        prepared_request.headers = {}
        proxies = {'http': 'http://proxy.com', 'https': 'https://proxy.com'}
        
        result = self.mixin.rebuild_proxies(prepared_request, proxies)
        
        assert result == proxies
        assert 'Proxy-Authorization' not in prepared_request.headers

    def test_rebuild_proxies_with_no_proxy(self):
        prepared_request = PreparedRequest()
        prepared_request.url = 'http://example.com'
        prepared_request.headers = {}
        proxies = {'http': 'http://proxy.com', 'https': 'https://proxy.com'}
        
        # Simulate NO_PROXY environment variable
        self.mixin.trust_env = False
        
        result = self.mixin.rebuild_proxies(prepared_request, proxies)
        
        assert result == {}
        assert 'Proxy-Authorization' not in prepared_request.headers

    def test_rebuild_proxies_with_auth(self):
        prepared_request = PreparedRequest()
        prepared_request.url = 'http://example.com'
        prepared_request.headers = {}
        proxies = {'http': 'http://user:pass@proxy.com', 'https': 'https://proxy.com'}
        
        result = self.mixin.rebuild_proxies(prepared_request, proxies)
        
        assert result == proxies
        assert prepared_request.headers['Proxy-Authorization'] == 'Basic dXNlcjpwYXNz'

    def test_rebuild_proxies_with_missing_scheme(self):
        prepared_request = PreparedRequest()
        prepared_request.url = 'ftp://example.com'
        prepared_request.headers = {}
        proxies = {'http': 'http://proxy.com'}
        
        result = self.mixin.rebuild_proxies(prepared_request, proxies)
        
        assert result == proxies
        assert 'Proxy-Authorization' not in prepared_request.headers

    def test_rebuild_proxies_with_empty_proxies(self):
        prepared_request = PreparedRequest()
        prepared_request.url = 'http://example.com'
        prepared_request.headers = {}
        proxies = {}
        
        result = self.mixin.rebuild_proxies(prepared_request, proxies)
        
        assert result == {}
        assert 'Proxy-Authorization' not in prepared_request.headers
import pytest
from requests.sessions import SessionRedirectMixin

class TestSessionRedirectMixin:
    def setup_method(self):
        self.mixin = SessionRedirectMixin()

    def test_rebuild_proxies_with_valid_proxies(self):
        prepared_request = {'url': 'http://example.com'}
        proxies = {'http': 'http://proxy.com', 'https': 'https://proxy.com'}
        result = self.mixin.rebuild_proxies(prepared_request, proxies)
        assert result['proxies'] == proxies

    def test_rebuild_proxies_with_empty_proxies(self):
        prepared_request = {'url': 'http://example.com'}
        proxies = {}
        result = self.mixin.rebuild_proxies(prepared_request, proxies)
        assert result['proxies'] == {}

    def test_rebuild_proxies_with_none_proxies(self):
        prepared_request = {'url': 'http://example.com'}
        proxies = None
        result = self.mixin.rebuild_proxies(prepared_request, proxies)
        assert 'proxies' not in result

    def test_rebuild_proxies_with_invalid_proxies(self):
        prepared_request = {'url': 'http://example.com'}
        proxies = 'invalid_proxy'
        with pytest.raises(TypeError):
            self.mixin.rebuild_proxies(prepared_request, proxies)

    def test_rebuild_proxies_with_partial_proxies(self):
        prepared_request = {'url': 'http://example.com'}
        proxies = {'http': 'http://proxy.com'}
        result = self.mixin.rebuild_proxies(prepared_request, proxies)
        assert result['proxies'] == proxies
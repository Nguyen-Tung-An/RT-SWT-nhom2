import pytest
from requests.utils import select_proxy

class TestSelectProxy:
    def test_select_proxy_http(self):
        url = "http://example.com"
        proxies = {
            "http://example.com": "http://proxy1.com",
            "http": "http://proxy2.com",
            "all": "http://proxy3.com"
        }
        assert select_proxy(url, proxies) == "http://proxy1.com"

    def test_select_proxy_https(self):
        url = "https://example.com"
        proxies = {
            "https://example.com": "https://proxy1.com",
            "https": "https://proxy2.com",
            "all": "https://proxy3.com"
        }
        assert select_proxy(url, proxies) == "https://proxy1.com"

    def test_select_proxy_no_matching_scheme(self):
        url = "ftp://example.com"
        proxies = {
            "http": "http://proxy2.com",
            "all": "http://proxy3.com"
        }
        assert select_proxy(url, proxies) == "http://proxy3.com"

    def test_select_proxy_no_proxies(self):
        url = "http://example.com"
        proxies = {}
        assert select_proxy(url, proxies) is None

    def test_select_proxy_no_hostname(self):
        url = "http://"
        proxies = {
            "http": "http://proxy2.com",
            "all": "http://proxy3.com"
        }
        assert select_proxy(url, proxies) == "http://proxy3.com"

    def test_select_proxy_all_key(self):
        url = "http://example.com"
        proxies = {
            "all": "http://proxy3.com"
        }
        assert select_proxy(url, proxies) == "http://proxy3.com"

    def test_select_proxy_multiple_matches(self):
        url = "http://example.com"
        proxies = {
            "http://example.com": "http://proxy1.com",
            "http": "http://proxy2.com",
            "all": "http://proxy3.com"
        }
        assert select_proxy(url, proxies) == "http://proxy1.com"
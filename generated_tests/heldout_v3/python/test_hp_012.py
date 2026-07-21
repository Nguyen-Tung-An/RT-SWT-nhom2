import pytest
from requests.utils import select_proxy

def test_select_proxy_no_proxies():
    url = "http://example.com"
    proxies = None
    result = select_proxy(url, proxies)
    assert result is None

def test_select_proxy_empty_proxies():
    url = "http://example.com"
    proxies = {}
    result = select_proxy(url, proxies)
    assert result is None

def test_select_proxy_http_url():
    url = "http://example.com"
    proxies = {"http": "http://proxy.com"}
    result = select_proxy(url, proxies)
    assert result == "http://proxy.com"

def test_select_proxy_https_url():
    url = "https://example.com"
    proxies = {"https": "https://proxy.com"}
    result = select_proxy(url, proxies)
    assert result == "https://proxy.com"

def test_select_proxy_http_and_https():
    url = "http://example.com"
    proxies = {
        "http": "http://proxy.com",
        "https": "https://secureproxy.com"
    }
    result = select_proxy(url, proxies)
    assert result == "http://proxy.com"

def test_select_proxy_https_with_http_proxy():
    url = "https://example.com"
    proxies = {
        "http": "http://proxy.com",
        "https": "https://secureproxy.com"
    }
    result = select_proxy(url, proxies)
    assert result == "https://secureproxy.com"

def test_select_proxy_invalid_url():
    url = "invalid_url"
    proxies = {"http": "http://proxy.com"}
    result = select_proxy(url, proxies)
    assert result is None

def test_select_proxy_no_matching_proxy():
    url = "http://example.com"
    proxies = {"ftp": "ftp://proxy.com"}
    result = select_proxy(url, proxies)
    assert result is None
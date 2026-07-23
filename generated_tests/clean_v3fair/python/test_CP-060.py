import pytest
from requests.utils import select_proxy

def test_select_proxy_http_scheme():
    proxies = {
        "http://example.com": "http://proxy1",
        "http": "http://proxy2",
        "all": "http://proxy3"
    }
    assert select_proxy("http://example.com", proxies) == "http://proxy1"

def test_select_proxy_https_scheme():
    proxies = {
        "https://example.com": "https://proxy1",
        "https": "https://proxy2",
        "all": "https://proxy3"
    }
    assert select_proxy("https://example.com", proxies) == "https://proxy1"

def test_select_proxy_no_hostname():
    proxies = {
        "http": "http://proxy2",
        "all": "http://proxy3"
    }
    assert select_proxy("http://", proxies) == "http://proxy2"

def test_select_proxy_no_proxies():
    assert select_proxy("http://example.com", None) is None

def test_select_proxy_fallback_to_all():
    proxies = {
        "http": "http://proxy2",
        "all": "http://proxy3"
    }
    assert select_proxy("https://example.com", proxies) == "http://proxy3"

def test_select_proxy_no_matching_scheme():
    proxies = {
        "ftp": "ftp://proxy1",
        "all": "http://proxy3"
    }
    assert select_proxy("http://example.com", proxies) == "http://proxy3"

def test_select_proxy_multiple_matches():
    proxies = {
        "http://example.com": "http://proxy1",
        "http": "http://proxy2",
        "all": "http://proxy3"
    }
    assert select_proxy("http://example.com", proxies) == "http://proxy1"

def test_select_proxy_empty_proxies():
    assert select_proxy("http://example.com", {}) is None
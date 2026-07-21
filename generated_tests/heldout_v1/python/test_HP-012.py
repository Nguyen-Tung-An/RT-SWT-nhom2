import pytest
from requests.utils import select_proxy

def test_select_proxy_with_scheme_and_hostname():
    proxies = {
        "http://example.com": "http://proxy1",
        "http": "http://proxy2",
        "all": "http://proxy3"
    }
    assert select_proxy("http://example.com", proxies) == "http://proxy1"

def test_select_proxy_with_scheme_only():
    proxies = {
        "http": "http://proxy2",
        "all": "http://proxy3"
    }
    assert select_proxy("http://example.com", proxies) == "http://proxy2"

def test_select_proxy_with_all_scheme_and_hostname():
    proxies = {
        "all://example.com": "http://proxy3",
        "all": "http://proxy4"
    }
    assert select_proxy("http://example.com", proxies) == "http://proxy3"

def test_select_proxy_with_only_all_scheme():
    proxies = {
        "all": "http://proxy4"
    }
    assert select_proxy("http://example.com", proxies) == "http://proxy4"

def test_select_proxy_with_no_matching_proxy():
    proxies = {
        "http://another.com": "http://proxy5"
    }
    assert select_proxy("http://example.com", proxies) is None

def test_select_proxy_with_no_proxies():
    assert select_proxy("http://example.com", None) is None

def test_select_proxy_with_invalid_url():
    proxies = {
        "http": "http://proxy2"
    }
    assert select_proxy("invalid_url", proxies) is None
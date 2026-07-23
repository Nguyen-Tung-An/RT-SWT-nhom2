import pytest
from requests.models import Request
from requests.utils import resolve_proxies

def test_resolve_proxies_with_no_proxies():
    request = Request(url='http://example.com')
    proxies = None
    result = resolve_proxies(request, proxies)
    assert result == {}

def test_resolve_proxies_with_empty_proxies():
    request = Request(url='http://example.com')
    proxies = {}
    result = resolve_proxies(request, proxies)
    assert result == {}

def test_resolve_proxies_with_no_proxy_setting():
    request = Request(url='http://example.com')
    proxies = {'http': 'http://proxy.com'}
    result = resolve_proxies(request, proxies)
    assert result == {'http': 'http://proxy.com'}

def test_resolve_proxies_with_trust_env_false():
    request = Request(url='http://example.com')
    proxies = {'http': 'http://proxy.com'}
    result = resolve_proxies(request, proxies, trust_env=False)
    assert result == {'http': 'http://proxy.com'}

def test_resolve_proxies_with_trust_env_true_and_no_proxy():
    request = Request(url='http://example.com')
    proxies = {'http': 'http://proxy.com', 'no_proxy': 'example.com'}
    result = resolve_proxies(request, proxies, trust_env=True)
    assert result == {'http': 'http://proxy.com'}

def test_resolve_proxies_with_trust_env_true_and_bypass():
    request = Request(url='http://example.com')
    proxies = {'http': 'http://proxy.com', 'no_proxy': 'example.com'}
    # Mocking the functions should_bypass_proxies and get_environ_proxies
    with pytest.mock.patch('requests.utils.should_bypass_proxies', return_value=True):
        result = resolve_proxies(request, proxies, trust_env=True)
        assert result == {'http': 'http://proxy.com'}

def test_resolve_proxies_with_trust_env_true_and_proxy_set():
    request = Request(url='http://example.com')
    proxies = {'http': 'http://proxy.com'}
    # Mocking the functions should_bypass_proxies and get_environ_proxies
    with pytest.mock.patch('requests.utils.should_bypass_proxies', return_value=False), \
         pytest.mock.patch('requests.utils.get_environ_proxies', return_value={'http': 'http://envproxy.com'}):
        result = resolve_proxies(request, proxies, trust_env=True)
        assert result == {'http': 'http://envproxy.com'}
import pytest
from requests.adapters import HTTPAdapter
from requests.models import PreparedRequest

def test_request_url_no_proxy():
    adapter = HTTPAdapter()
    request = PreparedRequest()
    request.url = 'http://example.com/path'
    request.path_url = '/path'
    assert adapter.request_url(request, None) == '/path'

def test_request_url_with_http_proxy():
    adapter = HTTPAdapter()
    request = PreparedRequest()
    request.url = 'http://example.com/path'
    request.path_url = '/path'
    proxies = {'http': 'http://proxy.com'}
    assert adapter.request_url(request, proxies) == 'http://example.com/path'

def test_request_url_with_https_proxy():
    adapter = HTTPAdapter()
    request = PreparedRequest()
    request.url = 'https://example.com/path'
    request.path_url = '/path'
    proxies = {'https': 'https://proxy.com'}
    assert adapter.request_url(request, proxies) == '/path'

def test_request_url_with_socks_proxy():
    adapter = HTTPAdapter()
    request = PreparedRequest()
    request.url = 'http://example.com/path'
    request.path_url = '/path'
    proxies = {'http': 'socks5://proxy.com'}
    assert adapter.request_url(request, proxies) == 'http://example.com/path'

def test_request_url_with_no_path_url():
    adapter = HTTPAdapter()
    request = PreparedRequest()
    request.url = 'http://example.com'
    request.path_url = ''
    proxies = {'http': 'http://proxy.com'}
    assert adapter.request_url(request, proxies) == 'http://example.com'
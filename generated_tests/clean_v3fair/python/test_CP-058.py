import pytest
from requests.sessions import SessionRedirectMixin
from requests.models import PreparedRequest

def test_rebuild_proxies_with_no_proxies():
    instance = SessionRedirectMixin()
    prepared_request = PreparedRequest()
    prepared_request.url = "http://example.com"
    prepared_request.headers = {}
    proxies = None
    result = instance.rebuild_proxies(prepared_request, proxies)
    assert result == {}

def test_rebuild_proxies_with_http_scheme():
    instance = SessionRedirectMixin()
    prepared_request = PreparedRequest()
    prepared_request.url = "http://example.com"
    prepared_request.headers = {}
    proxies = {"http": "http://proxy.com"}
    result = instance.rebuild_proxies(prepared_request, proxies)
    assert result == {"http": "http://proxy.com"}

def test_rebuild_proxies_with_https_scheme():
    instance = SessionRedirectMixin()
    prepared_request = PreparedRequest()
    prepared_request.url = "https://example.com"
    prepared_request.headers = {}
    proxies = {"https": "https://proxy.com"}
    result = instance.rebuild_proxies(prepared_request, proxies)
    assert result == {"https": "https://proxy.com"}

def test_rebuild_proxies_with_proxy_authorization():
    instance = SessionRedirectMixin()
    prepared_request = PreparedRequest()
    prepared_request.url = "http://example.com"
    prepared_request.headers = {"Proxy-Authorization": "Basic dXNlcm5hbWU6cGFzc3dvcmQ="}
    proxies = {"http": "http://proxy.com"}
    result = instance.rebuild_proxies(prepared_request, proxies)
    assert "Proxy-Authorization" not in prepared_request.headers
    assert result == {"http": "http://proxy.com"}

def test_rebuild_proxies_with_no_proxy_auth():
    instance = SessionRedirectMixin()
    prepared_request = PreparedRequest()
    prepared_request.url = "http://example.com"
    prepared_request.headers = {}
    proxies = {"http": "http://username:password@proxy.com"}
    result = instance.rebuild_proxies(prepared_request, proxies)
    assert "Proxy-Authorization" in prepared_request.headers
    assert prepared_request.headers["Proxy-Authorization"] == "Basic dXNlcm5hbWU6cGFzc3dvcmQ="
    assert result == {"http": "http://username:password@proxy.com"}

def test_rebuild_proxies_with_no_proxy_key():
    instance = SessionRedirectMixin()
    prepared_request = PreparedRequest()
    prepared_request.url = "http://example.com"
    prepared_request.headers = {}
    proxies = {"http": "http://proxy.com"}
    result = instance.rebuild_proxies(prepared_request, proxies)
    assert "Proxy-Authorization" not in prepared_request.headers
    assert result == {"http": "http://proxy.com"}
import pytest
from requests.sessions import Session, PreparedRequest

@pytest.fixture
def session():
    return Session()

@pytest.fixture
def prepared_request():
    req = PreparedRequest()
    req.url = "http://example.com"
    req.headers = {}
    return req

def test_rebuild_proxies_no_proxies(session, prepared_request):
    proxies = None
    result = session.rebuild_proxies(prepared_request, proxies)
    assert result == {}

def test_rebuild_proxies_with_http_proxy(session, prepared_request):
    proxies = {"http": "http://proxy.com:8080"}
    result = session.rebuild_proxies(prepared_request, proxies)
    assert result == {"http": "http://proxy.com:8080"}

def test_rebuild_proxies_with_https_proxy(session, prepared_request):
    prepared_request.url = "https://example.com"
    proxies = {"https": "https://proxy.com:8080"}
    result = session.rebuild_proxies(prepared_request, proxies)
    assert result == {"https": "https://proxy.com:8080"}

def test_rebuild_proxies_with_no_proxy(session, prepared_request):
    prepared_request.url = "http://example.com"
    proxies = {"http": "http://proxy.com:8080", "no_proxy": "example.com"}
    result = session.rebuild_proxies(prepared_request, proxies)
    assert result == {}

def test_rebuild_proxies_with_auth(session, prepared_request):
    prepared_request.url = "http://example.com"
    proxies = {"http": "http://user:pass@proxy.com:8080"}
    result = session.rebuild_proxies(prepared_request, proxies)
    assert "Proxy-Authorization" in prepared_request.headers
    assert prepared_request.headers["Proxy-Authorization"] == "Basic dXNlcjpwYXNz"

def test_rebuild_proxies_with_https_and_auth(session, prepared_request):
    prepared_request.url = "https://example.com"
    proxies = {"https": "https://user:pass@proxy.com:8080"}
    result = session.rebuild_proxies(prepared_request, proxies)
    assert "Proxy-Authorization" not in prepared_request.headers
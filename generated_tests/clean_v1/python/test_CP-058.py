import pytest
from requests.sessions import Session
from requests.models import PreparedRequest

def test_rebuild_proxies_no_proxy():
    session = Session()
    prepared_request = PreparedRequest()
    prepared_request.url = "http://example.com"
    prepared_request.headers = {}
    proxies = {"http": "http://proxy.com"}

    # Simulate NO_PROXY environment variable
    session.trust_env = True
    session.no_proxy = ["example.com"]

    result = session.rebuild_proxies(prepared_request, proxies)
    assert result == {}

def test_rebuild_proxies_with_proxy():
    session = Session()
    prepared_request = PreparedRequest()
    prepared_request.url = "http://example.com"
    prepared_request.headers = {}
    proxies = {"http": "http://proxy.com"}

    session.trust_env = True
    session.no_proxy = []

    result = session.rebuild_proxies(prepared_request, proxies)
    assert result == {"http": "http://proxy.com"}

def test_rebuild_proxies_with_auth():
    session = Session()
    prepared_request = PreparedRequest()
    prepared_request.url = "http://example.com"
    prepared_request.headers = {}
    proxies = {"http": "http://user:pass@proxy.com"}

    session.trust_env = True
    session.no_proxy = []

    result = session.rebuild_proxies(prepared_request, proxies)
    assert result == {"http": "http://user:pass@proxy.com"}
    assert "Proxy-Authorization" in prepared_request.headers

def test_rebuild_proxies_https_no_auth():
    session = Session()
    prepared_request = PreparedRequest()
    prepared_request.url = "https://example.com"
    prepared_request.headers = {}
    proxies = {"https": "http://proxy.com"}

    session.trust_env = True
    session.no_proxy = []

    result = session.rebuild_proxies(prepared_request, proxies)
    assert result == {"https": "http://proxy.com"}
    assert "Proxy-Authorization" not in prepared_request.headers

def test_rebuild_proxies_key_error():
    session = Session()
    prepared_request = PreparedRequest()
    prepared_request.url = "http://example.com"
    prepared_request.headers = {}
    proxies = {}

    session.trust_env = True
    session.no_proxy = []

    result = session.rebuild_proxies(prepared_request, proxies)
    assert result == {}
import pytest
from requests.sessions import Session, merge_environment_settings

@pytest.fixture
def session():
    return Session()

def test_merge_environment_settings_with_trust_env(session, monkeypatch):
    session.trust_env = True
    monkeypatch.setenv("REQUESTS_CA_BUNDLE", "path/to/ca_bundle")
    url = "http://example.com"
    proxies = {"http": "http://proxy.com"}
    stream = None
    verify = None
    cert = None

    result = merge_environment_settings(session, url, proxies, stream, verify, cert)
    
    assert result["proxies"]["http"] == "http://proxy.com"
    assert result["verify"] == "path/to/ca_bundle"
    assert result["stream"] is None
    assert result["cert"] is None

def test_merge_environment_settings_without_trust_env(session):
    session.trust_env = False
    url = "http://example.com"
    proxies = {"http": "http://proxy.com"}
    stream = True
    verify = True
    cert = "path/to/cert"

    result = merge_environment_settings(session, url, proxies, stream, verify, cert)

    assert result["proxies"]["http"] == "http://proxy.com"
    assert result["verify"] is True
    assert result["stream"] is True
    assert result["cert"] == "path/to/cert"

def test_merge_environment_settings_with_no_proxies(session):
    session.trust_env = True
    url = "http://example.com"
    proxies = None
    stream = False
    verify = None
    cert = None

    result = merge_environment_settings(session, url, proxies, stream, verify, cert)

    assert result["proxies"] is not None
    assert result["stream"] is False
    assert result["verify"] is None
    assert result["cert"] is None

def test_merge_environment_settings_with_custom_proxies(session):
    session.trust_env = True
    url = "http://example.com"
    proxies = {"http": "http://custom_proxy.com", "no_proxy": "localhost"}
    stream = None
    verify = None
    cert = None

    result = merge_environment_settings(session, url, proxies, stream, verify, cert)

    assert result["proxies"]["http"] == "http://custom_proxy.com"
    assert "no_proxy" in result["proxies"]
    assert result["stream"] is None
    assert result["verify"] is None
    assert result["cert"] is None
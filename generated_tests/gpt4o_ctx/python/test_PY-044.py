import pytest
from requests.sessions import Session

@pytest.fixture
def session_instance():
    return Session()

def test_merge_environment_settings_with_trust_env(session_instance, monkeypatch):
    session_instance.trust_env = True
    monkeypatch.setenv("REQUESTS_CA_BUNDLE", "path/to/ca_bundle")
    url = "http://example.com"
    proxies = {"http": "http://proxy.com"}
    stream = True
    verify = None
    cert = None

    result = session_instance.merge_environment_settings(url, proxies, stream, verify, cert)
    
    assert result["proxies"]["http"] == "http://proxy.com"
    assert result["stream"] is True
    assert result["verify"] == "path/to/ca_bundle"
    assert result["cert"] is None

def test_merge_environment_settings_without_trust_env(session_instance):
    session_instance.trust_env = False
    url = "http://example.com"
    proxies = {"http": "http://proxy.com"}
    stream = False
    verify = True
    cert = "path/to/cert"

    result = session_instance.merge_environment_settings(url, proxies, stream, verify, cert)

    assert result["proxies"]["http"] == "http://proxy.com"
    assert result["stream"] is False
    assert result["verify"] is True
    assert result["cert"] == "path/to/cert"

def test_merge_environment_settings_with_no_proxies(session_instance):
    session_instance.trust_env = True
    url = "http://example.com"
    proxies = None
    stream = None
    verify = None
    cert = None

    result = session_instance.merge_environment_settings(url, proxies, stream, verify, cert)

    assert result["proxies"] is None
    assert result["stream"] is None
    assert result["verify"] is None
    assert result["cert"] is None

def test_merge_environment_settings_with_empty_proxies(session_instance):
    session_instance.trust_env = True
    url = "http://example.com"
    proxies = {}
    stream = None
    verify = None
    cert = None

    result = session_instance.merge_environment_settings(url, proxies, stream, verify, cert)

    assert result["proxies"] == {}
    assert result["stream"] is None
    assert result["verify"] is None
    assert result["cert"] is None
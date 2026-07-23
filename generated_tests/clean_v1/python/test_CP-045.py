import pytest
from requests.sessions import Session

@pytest.fixture
def session():
    return Session()

def test_should_strip_auth_different_hostname(session):
    assert session.should_strip_auth("http://example.com", "http://another.com") is True

def test_should_strip_auth_http_to_https_same_host(session):
    assert session.should_strip_auth("http://example.com", "https://example.com") is False

def test_should_strip_auth_http_to_https_different_port(session):
    assert session.should_strip_auth("http://example.com:80", "https://example.com:443") is False

def test_should_strip_auth_http_to_http_different_port(session):
    assert session.should_strip_auth("http://example.com:80", "http://example.com:8080") is True

def test_should_strip_auth_https_to_http_different_port(session):
    assert session.should_strip_auth("https://example.com:443", "http://example.com:8080") is True

def test_should_strip_auth_http_to_http_same_port(session):
    assert session.should_strip_auth("http://example.com:80", "http://example.com:80") is False

def test_should_strip_auth_https_to_https_same_port(session):
    assert session.should_strip_auth("https://example.com:443", "https://example.com:443") is False

def test_should_strip_auth_http_to_https_default_ports(session):
    assert session.should_strip_auth("http://example.com", "https://example.com") is False

def test_should_strip_auth_https_to_http_default_ports(session):
    assert session.should_strip_auth("https://example.com", "http://example.com") is True
import pytest
from requests.sessions import Session

@pytest.fixture
def session():
    return Session()

def test_should_strip_auth_different_hostname(session):
    assert session.should_strip_auth("http://example.com", "http://another.com") is True

def test_should_strip_auth_same_hostname_http_to_https(session):
    assert session.should_strip_auth("http://example.com", "https://example.com") is False

def test_should_strip_auth_same_hostname_different_ports(session):
    assert session.should_strip_auth("http://example.com:80", "http://example.com:8080") is True
    assert session.should_strip_auth("http://example.com:8080", "http://example.com:80") is True

def test_should_strip_auth_same_hostname_default_ports(session):
    assert session.should_strip_auth("http://example.com", "http://example.com:80") is False
    assert session.should_strip_auth("https://example.com", "https://example.com:443") is False

def test_should_strip_auth_http_to_https_with_standard_ports(session):
    assert session.should_strip_auth("http://example.com:80", "https://example.com:443") is False

def test_should_strip_auth_different_schemes(session):
    assert session.should_strip_auth("http://example.com", "ftp://example.com") is True
    assert session.should_strip_auth("https://example.com", "http://example.com") is True
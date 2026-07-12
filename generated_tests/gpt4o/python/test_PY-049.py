import pytest
from requests.sessions import Session

def test_should_strip_auth_hostname_different():
    session = Session()
    assert session.should_strip_auth("http://example.com", "http://another.com") is True

def test_should_strip_auth_http_to_https_same_host():
    session = Session()
    assert session.should_strip_auth("http://example.com", "https://example.com") is False

def test_should_strip_auth_http_to_https_different_ports():
    session = Session()
    assert session.should_strip_auth("http://example.com:80", "https://example.com:443") is False

def test_should_strip_auth_http_to_http_different_ports():
    session = Session()
    assert session.should_strip_auth("http://example.com:80", "http://example.com:8080") is True

def test_should_strip_auth_https_to_http_different_ports():
    session = Session()
    assert session.should_strip_auth("https://example.com:443", "http://example.com:8080") is True

def test_should_strip_auth_same_scheme_same_host_same_port():
    session = Session()
    assert session.should_strip_auth("http://example.com:80", "http://example.com:80") is False

def test_should_strip_auth_default_port_http():
    session = Session()
    assert session.should_strip_auth("http://example.com", "http://example.com:80") is False

def test_should_strip_auth_default_port_https():
    session = Session()
    assert session.should_strip_auth("https://example.com", "https://example.com:443") is False

def test_should_strip_auth_http_to_https_with_non_default_ports():
    session = Session()
    assert session.should_strip_auth("http://example.com:8080", "https://example.com:443") is True
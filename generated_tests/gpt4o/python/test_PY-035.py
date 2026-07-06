import pytest
from requests.cookies import CookieJar, remove_cookie_by_name

@pytest.fixture
def cookie_jar():
    jar = CookieJar()
    jar.set_cookie(create_cookie("test_cookie", "value1", domain="example.com", path="/"))
    jar.set_cookie(create_cookie("test_cookie", "value2", domain="example.com", path="/subpath"))
    jar.set_cookie(create_cookie("other_cookie", "value3", domain="example.com", path="/"))
    return jar

def create_cookie(name, value, domain, path):
    from http.cookies import SimpleCookie
    cookie = SimpleCookie()
    cookie[name] = value
    cookie[name]["domain"] = domain
    cookie[name]["path"] = path
    return cookie[name]

def test_remove_cookie_by_name_no_domain_no_path(cookie_jar):
    remove_cookie_by_name(cookie_jar, "test_cookie")
    assert "test_cookie" not in cookie_jar

def test_remove_cookie_by_name_with_domain(cookie_jar):
    remove_cookie_by_name(cookie_jar, "test_cookie", domain="example.com")
    assert "test_cookie" not in cookie_jar

def test_remove_cookie_by_name_with_path(cookie_jar):
    remove_cookie_by_name(cookie_jar, "test_cookie", path="/subpath")
    assert "test_cookie" in cookie_jar  # Should still exist in root path
    assert "test_cookie" not in cookie_jar  # Should be removed from subpath

def test_remove_non_existent_cookie(cookie_jar):
    remove_cookie_by_name(cookie_jar, "non_existent_cookie")
    assert len(cookie_jar) == 3  # No cookies should be removed

def test_remove_cookie_with_specific_domain_and_path(cookie_jar):
    remove_cookie_by_name(cookie_jar, "test_cookie", domain="example.com", path="/subpath")
    assert "test_cookie" not in cookie_jar  # Should be removed from subpath
    assert len(cookie_jar) == 2  # Other cookies should remain

def test_remove_cookie_with_different_domain(cookie_jar):
    remove_cookie_by_name(cookie_jar, "test_cookie", domain="other.com")
    assert "test_cookie" in cookie_jar  # Should remain since domain doesn't match
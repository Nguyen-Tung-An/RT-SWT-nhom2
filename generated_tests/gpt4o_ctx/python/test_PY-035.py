import pytest
from requests.cookies import remove_cookie_by_name
from http.cookies import SimpleCookie

class MockCookieJar:
    def __init__(self):
        self.cookies = []

    def __iter__(self):
        return iter(self.cookies)

    def clear(self, domain, path, name):
        self.cookies = [cookie for cookie in self.cookies if not (cookie.domain == domain and cookie.path == path and cookie.name == name)]

    def set_cookie(self, name, value, domain=None, path=None):
        cookie = SimpleCookie()
        cookie[name] = value
        cookie[name]["domain"] = domain
        cookie[name]["path"] = path
        self.cookies.append(cookie[name])

def test_remove_cookie_by_name_no_domain_no_path():
    jar = MockCookieJar()
    jar.set_cookie("test_cookie", "value1")
    jar.set_cookie("test_cookie", "value2", domain="example.com")
    jar.set_cookie("other_cookie", "value3")

    remove_cookie_by_name(jar, "test_cookie")

    assert len(jar.cookies) == 1
    assert jar.cookies[0].key == "other_cookie"

def test_remove_cookie_by_name_with_domain():
    jar = MockCookieJar()
    jar.set_cookie("test_cookie", "value1", domain="example.com")
    jar.set_cookie("test_cookie", "value2", domain="test.com")
    jar.set_cookie("other_cookie", "value3", domain="example.com")

    remove_cookie_by_name(jar, "test_cookie", domain="example.com")

    assert len(jar.cookies) == 2
    assert jar.cookies[0].key == "test_cookie"
    assert jar.cookies[0]["domain"] == "test.com"
    assert jar.cookies[1].key == "other_cookie"

def test_remove_cookie_by_name_with_path():
    jar = MockCookieJar()
    jar.set_cookie("test_cookie", "value1", path="/path1")
    jar.set_cookie("test_cookie", "value2", path="/path2")
    jar.set_cookie("other_cookie", "value3", path="/path1")

    remove_cookie_by_name(jar, "test_cookie", path="/path1")

    assert len(jar.cookies) == 2
    assert jar.cookies[0].key == "test_cookie"
    assert jar.cookies[0]["path"] == "/path2"
    assert jar.cookies[1].key == "other_cookie"

def test_remove_cookie_by_name_with_domain_and_path():
    jar = MockCookieJar()
    jar.set_cookie("test_cookie", "value1", domain="example.com", path="/path1")
    jar.set_cookie("test_cookie", "value2", domain="example.com", path="/path2")
    jar.set_cookie("other_cookie", "value3", domain="example.com", path="/path1")

    remove_cookie_by_name(jar, "test_cookie", domain="example.com", path="/path1")

    assert len(jar.cookies) == 2
    assert jar.cookies[0].key == "test_cookie"
    assert jar.cookies[0]["path"] == "/path2"
    assert jar.cookies[1].key == "other_cookie"
import pytest
from requests.cookies import RequestsCookieJar, CookieConflictError

@pytest.fixture
def cookie_jar():
    jar = RequestsCookieJar()
    jar.set("cookie1", "value1", domain="example.com", path="/")
    jar.set("cookie1", "value2", domain="example.com", path="/")  # Duplicate cookie
    jar.set("cookie3", "value3", domain="example.com", path="/path")
    return jar

def test_find_no_duplicates_single(cookie_jar):
    assert cookie_jar.get("cookie1", None, "example.com", "/") == "value1"

def test_find_no_duplicates_multiple_same_path(cookie_jar):
    with pytest.raises(CookieConflictError):
        cookie_jar.get("cookie1", None, "example.com", "/")

def test_find_no_duplicates_different_path(cookie_jar):
    assert cookie_jar.get("cookie3", None, "example.com", "/path") == "value3"

def test_find_no_duplicates_key_error(cookie_jar):
    assert cookie_jar.get("nonexistent", None, "example.com", "/") is None
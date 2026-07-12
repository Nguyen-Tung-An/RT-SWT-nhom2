import pytest
from requests.cookies import RequestsCookieJar, CookieConflictError

@pytest.fixture
def cookie_jar():
    jar = RequestsCookieJar()
    jar.set('cookie1', 'value1', domain='example.com', path='/')
    jar.set('cookie2', 'value2', domain='example.com', path='/')
    jar.set('cookie3', 'value3', domain='example.com', path='/subpath')
    return jar

def test_find_no_duplicates_single_cookie(cookie_jar):
    assert cookie_jar._find_no_duplicates('cookie1', 'example.com', '/') == 'value1'

def test_find_no_duplicates_multiple_cookies_same_domain_path(cookie_jar):
    with pytest.raises(CookieConflictError):
        cookie_jar._find_no_duplicates('cookie1', 'example.com', '/')

def test_find_no_duplicates_different_path(cookie_jar):
    assert cookie_jar._find_no_duplicates('cookie3', 'example.com', '/subpath') == 'value3'

def test_find_no_duplicates_no_cookie(cookie_jar):
    with pytest.raises(KeyError):
        cookie_jar._find_no_duplicates('nonexistent_cookie', 'example.com', '/')

def test_find_no_duplicates_no_domain(cookie_jar):
    assert cookie_jar._find_no_duplicates('cookie1') == 'value1'
    assert cookie_jar._find_no_duplicates('cookie2') == 'value2'
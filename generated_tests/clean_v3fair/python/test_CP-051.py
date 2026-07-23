import pytest
from requests.cookies import remove_cookie_by_name
from http.cookies import SimpleCookie

@pytest.fixture
def cookiejar():
    cookie = SimpleCookie()
    cookie['test_cookie'] = 'value'
    cookie['test_cookie']['domain'] = 'example.com'
    cookie['test_cookie']['path'] = '/'
    return cookie

def test_remove_cookie_by_name_exact_match(cookiejar):
    remove_cookie_by_name(cookiejar, 'test_cookie', 'example.com', '/')
    assert 'test_cookie' not in cookiejar

def test_remove_cookie_by_name_different_domain(cookiejar):
    remove_cookie_by_name(cookiejar, 'test_cookie', 'another.com', '/')
    assert 'test_cookie' in cookiejar

def test_remove_cookie_by_name_different_path(cookiejar):
    remove_cookie_by_name(cookiejar, 'test_cookie', 'example.com', '/another_path')
    assert 'test_cookie' in cookiejar

def test_remove_cookie_by_name_no_domain_no_path(cookiejar):
    remove_cookie_by_name(cookiejar, 'test_cookie')
    assert 'test_cookie' not in cookiejar

def test_remove_nonexistent_cookie(cookiejar):
    remove_cookie_by_name(cookiejar, 'nonexistent_cookie', 'example.com', '/')
    assert 'test_cookie' in cookiejar

def test_remove_cookie_by_name_with_none_domain_and_path(cookiejar):
    remove_cookie_by_name(cookiejar, 'test_cookie', None, None)
    assert 'test_cookie' not in cookiejar
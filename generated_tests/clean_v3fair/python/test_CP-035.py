import pytest
from requests.cookies import merge_cookies
from http.cookiejar import CookieJar, Cookie

def test_merge_cookies_with_dict():
    jar = CookieJar()
    cookies = {'name': 'value', 'name2': 'value2'}
    merged_jar = merge_cookies(jar, cookies)
    assert len(merged_jar) == 2
    assert merged_jar._cookies['']['name'].value == 'value'
    assert merged_jar._cookies['']['name2'].value == 'value2'

def test_merge_cookies_with_cookiejar():
    jar1 = CookieJar()
    jar2 = CookieJar()
    jar2.set_cookie(Cookie(0, 'name', 'value'))
    merged_jar = merge_cookies(jar1, jar2)
    assert len(merged_jar) == 1
    assert merged_jar._cookies['']['name'].value == 'value'

def test_merge_cookies_with_empty_dict():
    jar = CookieJar()
    merged_jar = merge_cookies(jar, {})
    assert len(merged_jar) == 0

def test_merge_cookies_with_none():
    jar = CookieJar()
    merged_jar = merge_cookies(jar, None)
    assert len(merged_jar) == 0

def test_merge_cookies_invalid_cookiejar():
    with pytest.raises(ValueError, match="You can only merge into CookieJar"):
        merge_cookies({}, {'name': 'value'})

def test_merge_cookies_overwrite():
    jar = CookieJar()
    jar.set_cookie(Cookie(0, 'name', 'value1'))
    cookies = {'name': 'value2'}
    merged_jar = merge_cookies(jar, cookies)
    assert merged_jar._cookies['']['name'].value == 'value1'  # Check no overwrite

def test_merge_cookies_update_method():
    jar = CookieJar()
    jar.set_cookie(Cookie(0, 'name', 'value1'))
    jar.set_cookie(Cookie(1, 'name2', 'value2'))
    jar2 = CookieJar()
    jar2.set_cookie(Cookie(2, 'name', 'value3'))  # Same name, different value
    merged_jar = merge_cookies(jar, jar2)
    assert merged_jar._cookies['']['name'].value == 'value1'  # Check no overwrite
    assert merged_jar._cookies['']['name2'].value == 'value2'  # Check existing cookie remains
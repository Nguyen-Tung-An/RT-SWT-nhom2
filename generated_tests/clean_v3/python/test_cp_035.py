import pytest
import cookielib
from requests.cookies import merge_cookies

def test_merge_cookies_with_empty_dict():
    jar = cookielib.CookieJar()
    result = merge_cookies(jar, {})
    assert len(result) == 0

def test_merge_cookies_with_none():
    jar = cookielib.CookieJar()
    result = merge_cookies(jar, None)
    assert len(result) == 0

def test_merge_cookies_with_valid_dict():
    jar = cookielib.CookieJar()
    cookies = {'session_id': 'abc123', 'user_id': 'user1'}
    result = merge_cookies(jar, cookies)
    assert len(result) == 2
    assert result.get('session_id').value == 'abc123'
    assert result.get('user_id').value == 'user1'

def test_merge_cookies_with_cookiejar():
    jar1 = cookielib.CookieJar()
    jar2 = cookielib.CookieJar()
    cookie = cookielib.Cookie(version=0, name='session_id', value='abc123', port=None, port_specified=False,
                              domain='example.com', domain_specified=True, domain_initial_dot=False,
                              path='/', path_specified=True, secure=False, expires=None, discard=True,
                              comment=None, comment_url=None, rest=None)
    jar2.set_cookie(cookie)
    result = merge_cookies(jar1, jar2)
    assert len(result) == 1
    assert result.get('session_id').value == 'abc123'

def test_merge_cookies_with_invalid_cookiejar():
    with pytest.raises(ValueError, match="You can only merge into CookieJar"):
        merge_cookies({}, {'session_id': 'abc123'})

def test_merge_cookies_with_overwrite():
    jar = cookielib.CookieJar()
    cookies = {'session_id': 'abc123', 'session_id': 'xyz789'}
    result = merge_cookies(jar, cookies)
    assert len(result) == 1
    assert result.get('session_id').value == 'xyz789'
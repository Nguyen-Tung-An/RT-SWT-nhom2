import pytest
from requests.cookies import merge_cookies
import cookielib

def test_merge_cookies_with_dict():
    cookiejar = cookielib.CookieJar()
    cookies = {'session_id': 'abc123', 'user_id': 'user1'}
    merged_cookies = merge_cookies(cookiejar, cookies)
    assert len(merged_cookies) == 2
    assert merged_cookies.get('session_id').value == 'abc123'
    assert merged_cookies.get('user_id').value == 'user1'

def test_merge_cookies_with_cookiejar():
    cookiejar1 = cookielib.CookieJar()
    cookiejar2 = cookielib.CookieJar()
    cookiejar2.set_cookie(cookielib.Cookie(version=0, name='session_id', value='abc123', port=None, port_specified=False, domain='example.com', domain_specified=False, domain_initial_dot=False, path='/', path_specified=True, secure=False, expires=None, discard=True, comment=None, comment_url=None, rest=None))
    merged_cookies = merge_cookies(cookiejar1, cookiejar2)
    assert len(merged_cookies) == 1
    assert merged_cookies.get('session_id').value == 'abc123'

def test_merge_cookies_with_invalid_cookiejar():
    with pytest.raises(ValueError, match="You can only merge into CookieJar"):
        merge_cookies({}, {'session_id': 'abc123'})

def test_merge_cookies_with_none():
    cookiejar = cookielib.CookieJar()
    merged_cookies = merge_cookies(cookiejar, None)
    assert len(merged_cookies) == 0
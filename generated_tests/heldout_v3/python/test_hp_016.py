import pytest
from requests.cookies import cookiejar_from_dict
from http.cookies import SimpleCookie
from requests.cookies import RequestsCookieJar

def test_cookiejar_from_dict_with_none_dict():
    result = cookiejar_from_dict(None)
    assert isinstance(result, RequestsCookieJar)
    assert len(result) == 0

def test_cookiejar_from_dict_with_empty_dict():
    result = cookiejar_from_dict({})
    assert isinstance(result, RequestsCookieJar)
    assert len(result) == 0

def test_cookiejar_from_dict_with_single_cookie():
    result = cookiejar_from_dict({'cookie1': 'value1'})
    assert isinstance(result, RequestsCookieJar)
    assert len(result) == 1
    assert result.get('cookie1').value == 'value1'

def test_cookiejar_from_dict_with_multiple_cookies():
    result = cookiejar_from_dict({'cookie1': 'value1', 'cookie2': 'value2'})
    assert isinstance(result, RequestsCookieJar)
    assert len(result) == 2
    assert result.get('cookie1').value == 'value1'
    assert result.get('cookie2').value == 'value2'

def test_cookiejar_from_dict_with_overwrite_true():
    jar = RequestsCookieJar()
    jar.set_cookie(create_cookie('cookie1', 'old_value'))
    result = cookiejar_from_dict({'cookie1': 'new_value'}, jar, overwrite=True)
    assert len(result) == 1
    assert result.get('cookie1').value == 'new_value'

def test_cookiejar_from_dict_with_overwrite_false():
    jar = RequestsCookieJar()
    jar.set_cookie(create_cookie('cookie1', 'old_value'))
    result = cookiejar_from_dict({'cookie1': 'new_value'}, jar, overwrite=False)
    assert len(result) == 1
    assert result.get('cookie1').value == 'old_value'

def test_cookiejar_from_dict_with_none_cookiejar():
    result = cookiejar_from_dict({'cookie1': 'value1'}, None)
    assert isinstance(result, RequestsCookieJar)
    assert len(result) == 1
    assert result.get('cookie1').value == 'value1'

def test_cookiejar_from_dict_with_none_cookiejar_and_overwrite():
    jar = RequestsCookieJar()
    jar.set_cookie(create_cookie('cookie1', 'old_value'))
    result = cookiejar_from_dict({'cookie1': 'new_value'}, None, overwrite=True)
    assert len(result) == 1
    assert result.get('cookie1').value == 'new_value'
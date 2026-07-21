import pytest
from requests.cookies import cookiejar_from_dict
from http.cookies import SimpleCookie

def test_cookiejar_from_dict_empty_dict():
    cookiejar = cookiejar_from_dict({}, None, False)
    assert len(cookiejar) == 0

def test_cookiejar_from_dict_with_none_cookiejar():
    cookie_dict = {'session_id': 'abc123'}
    cookiejar = cookiejar_from_dict(cookie_dict, None, False)
    assert len(cookiejar) == 1
    assert cookiejar.get('session_id').value == 'abc123'

def test_cookiejar_from_dict_with_existing_cookiejar():
    cookie_dict = {'session_id': 'abc123'}
    existing_cookiejar = SimpleCookie()
    existing_cookiejar['session_id'] = 'xyz789'
    cookiejar = cookiejar_from_dict(cookie_dict, existing_cookiejar, False)
    assert len(cookiejar) == 1
    assert cookiejar.get('session_id').value == 'abc123'

def test_cookiejar_from_dict_with_overwrite():
    cookie_dict = {'session_id': 'abc123'}
    existing_cookiejar = SimpleCookie()
    existing_cookiejar['session_id'] = 'xyz789'
    cookiejar = cookiejar_from_dict(cookie_dict, existing_cookiejar, True)
    assert len(cookiejar) == 1
    assert cookiejar.get('session_id').value == 'abc123'

def test_cookiejar_from_dict_with_invalid_cookie_dict():
    with pytest.raises(TypeError):
        cookiejar_from_dict(None, None, False)

def test_cookiejar_from_dict_with_non_dict_cookie_dict():
    with pytest.raises(TypeError):
        cookiejar_from_dict([], None, False)

def test_cookiejar_from_dict_with_empty_string_key():
    cookie_dict = {'': 'empty_key'}
    cookiejar = cookiejar_from_dict(cookie_dict, None, False)
    assert len(cookiejar) == 1
    assert cookiejar.get('').value == 'empty_key'
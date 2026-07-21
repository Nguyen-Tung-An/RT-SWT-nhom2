import pytest
from requests.cookies import cookiejar_from_dict
from http.cookies import SimpleCookie

def test_cookiejar_from_dict_with_none_cookie_dict():
    result = cookiejar_from_dict(None)
    assert len(result) == 0

def test_cookiejar_from_dict_with_empty_cookie_dict():
    result = cookiejar_from_dict({})
    assert len(result) == 0

def test_cookiejar_from_dict_with_single_cookie():
    result = cookiejar_from_dict({'name': 'value'})
    assert len(result) == 1
    assert result.get('name').value == 'value'

def test_cookiejar_from_dict_with_multiple_cookies():
    result = cookiejar_from_dict({'name1': 'value1', 'name2': 'value2'})
    assert len(result) == 2
    assert result.get('name1').value == 'value1'
    assert result.get('name2').value == 'value2'

def test_cookiejar_from_dict_with_overwrite_true():
    result = cookiejar_from_dict({'name': 'value1'})
    result = cookiejar_from_dict({'name': 'value2'}, cookiejar=result, overwrite=True)
    assert len(result) == 1
    assert result.get('name').value == 'value2'

def test_cookiejar_from_dict_with_overwrite_false():
    result = cookiejar_from_dict({'name': 'value1'})
    result = cookiejar_from_dict({'name': 'value2'}, cookiejar=result, overwrite=False)
    assert len(result) == 1
    assert result.get('name').value == 'value1'

def test_cookiejar_from_dict_with_existing_cookies():
    result = cookiejar_from_dict({'name1': 'value1'})
    result = cookiejar_from_dict({'name1': 'value2', 'name2': 'value2'}, cookiejar=result, overwrite=True)
    assert len(result) == 2
    assert result.get('name1').value == 'value2'
    assert result.get('name2').value == 'value2'
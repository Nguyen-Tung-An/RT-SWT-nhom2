import pytest
from requests.sessions import merge_setting

def test_merge_setting_both_none():
    assert merge_setting(None, None) is None

def test_merge_setting_request_none():
    assert merge_setting(None, {'key': 'value'}) == {'key': 'value'}

def test_merge_setting_session_none():
    assert merge_setting({'key': 'value'}, None) == {'key': 'value'}

def test_merge_setting_both_empty():
    assert merge_setting({}, {}) == {}

def test_merge_setting_request_overrides_session():
    request_setting = {'key': 'request_value'}
    session_setting = {'key': 'session_value'}
    assert merge_setting(request_setting, session_setting) == {'key': 'request_value'}

def test_merge_setting_session_overrides_request():
    request_setting = {'key': None}
    session_setting = {'key': 'session_value'}
    assert merge_setting(request_setting, session_setting) == {'key': 'session_value'}

def test_merge_setting_both_non_dict():
    request_setting = 'not_a_dict'
    session_setting = 'also_not_a_dict'
    assert merge_setting(request_setting, session_setting) == 'not_a_dict'

def test_merge_setting_both_dicts():
    request_setting = {'key1': 'value1', 'key2': None}
    session_setting = {'key2': 'session_value2', 'key3': 'session_value3'}
    expected = {'key1': 'value1', 'key2': 'session_value2', 'key3': 'session_value3'}
    assert merge_setting(request_setting, session_setting) == expected

def test_merge_setting_remove_none_keys():
    request_setting = {'key1': None}
    session_setting = {'key1': 'session_value1', 'key2': None}
    expected = {'key1': 'session_value1'}
    assert merge_setting(request_setting, session_setting) == expected
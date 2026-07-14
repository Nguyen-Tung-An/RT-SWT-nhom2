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
    request_setting = {'key': 'request_value'}
    session_setting = {'key': None}
    assert merge_setting(request_setting, session_setting) == {}

def test_merge_setting_both_non_dict():
    assert merge_setting('not_a_dict', {'key': 'value'}) == 'not_a_dict'
    assert merge_setting({'key': 'value'}, 'not_a_dict') == {'key': 'value'}

def test_merge_setting_merge_dicts():
    request_setting = {'key1': 'request_value1', 'key2': 'request_value2'}
    session_setting = {'key2': 'session_value2', 'key3': 'session_value3'}
    expected = {'key1': 'request_value1', 'key2': 'request_value2', 'key3': 'session_value3'}
    assert merge_setting(request_setting, session_setting) == expected

def test_merge_setting_remove_none_keys():
    request_setting = {'key1': None, 'key2': 'value2'}
    session_setting = {'key1': 'value1', 'key3': None}
    expected = {'key2': 'value2', 'key1': 'value1'}
    assert merge_setting(request_setting, session_setting) == expected
import pytest
from requests.sessions import merge_setting
from collections import OrderedDict

def to_key_val_list(d):
    return list(d.items())

class TestMergeSetting:
    def test_both_none(self):
        assert merge_setting(None, None) is None

    def test_request_none(self):
        session_setting = {'key1': 'value1'}
        assert merge_setting(None, session_setting) == session_setting

    def test_session_none(self):
        request_setting = {'key1': 'value1'}
        assert merge_setting(request_setting, None) == request_setting

    def test_both_empty_dicts(self):
        assert merge_setting({}, {}) == {}

    def test_request_empty_dict(self):
        session_setting = {'key1': 'value1'}
        assert merge_setting({}, session_setting) == session_setting

    def test_session_empty_dict(self):
        request_setting = {'key1': 'value1'}
        assert merge_setting(request_setting, {}) == request_setting

    def test_merge_dicts(self):
        request_setting = {'key1': 'value1', 'key2': None}
        session_setting = {'key2': 'value2', 'key3': 'value3'}
        expected = {'key1': 'value1', 'key3': 'value3'}
        assert merge_setting(request_setting, session_setting) == expected

    def test_merge_with_none_values(self):
        request_setting = {'key1': None, 'key2': 'value2'}
        session_setting = {'key1': 'value1', 'key2': None}
        expected = {'key2': 'value2', 'key1': 'value1'}
        assert merge_setting(request_setting, session_setting) == expected

    def test_non_dict_request_setting(self):
        session_setting = {'key1': 'value1'}
        assert merge_setting('not_a_dict', session_setting) == 'not_a_dict'

    def test_non_dict_session_setting(self):
        request_setting = {'key1': 'value1'}
        assert merge_setting(request_setting, 'not_a_dict') == request_setting

    def test_merge_with_ordered_dict(self):
        request_setting = OrderedDict([('key1', 'value1'), ('key2', None)])
        session_setting = OrderedDict([('key2', 'value2'), ('key3', 'value3')])
        expected = OrderedDict([('key1', 'value1'), ('key3', 'value3')])
        assert merge_setting(request_setting, session_setting, dict_class=OrderedDict) == expected
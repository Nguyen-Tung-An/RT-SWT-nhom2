import pytest
from requests.sessions import merge_setting

class TestMergeSetting:

    def test_both_none(self):
        assert merge_setting(None, None, dict_class=dict) is None

    def test_request_none(self):
        assert merge_setting(None, {'key': 'value'}, dict_class=dict) == {'key': 'value'}

    def test_session_none(self):
        assert merge_setting({'key': 'value'}, None, dict_class=dict) == {'key': 'value'}

    def test_both_non_dict(self):
        assert merge_setting('string', 'another_string', dict_class=dict) == 'string'
        assert merge_setting(42, 100, dict_class=dict) == 42

    def test_merge_dicts(self):
        request_setting = {'key1': 'value1', 'key2': None}
        session_setting = {'key2': 'session_value2', 'key3': 'session_value3'}
        expected = {'key1': 'value1', 'key3': 'session_value3'}
        assert merge_setting(request_setting, session_setting, dict_class=dict) == expected

    def test_merge_with_none_values(self):
        request_setting = {'key1': 'value1', 'key2': None}
        session_setting = {'key2': None, 'key3': 'session_value3'}
        expected = {'key1': 'value1', 'key3': 'session_value3'}
        assert merge_setting(request_setting, session_setting, dict_class=dict) == expected

    def test_merge_with_empty_dicts(self):
        request_setting = {}
        session_setting = {}
        assert merge_setting(request_setting, session_setting, dict_class=dict) == {}

    def test_merge_with_ordered_dict(self):
        from collections import OrderedDict
        request_setting = OrderedDict([('key1', 'value1')])
        session_setting = OrderedDict([('key2', 'value2')])
        expected = OrderedDict([('key1', 'value1'), ('key2', 'value2')])
        assert merge_setting(request_setting, session_setting, dict_class=OrderedDict) == expected
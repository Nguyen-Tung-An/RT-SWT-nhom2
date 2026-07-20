import pytest
from requests.sessions import merge_setting

class TestMergeSetting:
    def test_both_none(self):
        assert merge_setting(None, None, dict) is None

    def test_request_none(self):
        assert merge_setting(None, {'key': 'value'}, dict) == {'key': 'value'}

    def test_session_none(self):
        assert merge_setting({'key': 'value'}, None, dict) == {'key': 'value'}

    def test_both_empty_dicts(self):
        assert merge_setting({}, {}, dict) == {}

    def test_request_empty_dict(self):
        assert merge_setting({}, {'key': 'value'}, dict) == {'key': 'value'}

    def test_session_empty_dict(self):
        assert merge_setting({'key': 'value'}, {}, dict) == {'key': 'value'}

    def test_merge_two_dicts(self):
        request_setting = {'key1': 'value1', 'key2': 'value2'}
        session_setting = {'key2': None, 'key3': 'value3'}
        expected = {'key1': 'value1', 'key3': 'value3'}
        assert merge_setting(request_setting, session_setting, dict) == expected

    def test_merge_with_none_values(self):
        request_setting = {'key1': 'value1', 'key2': None}
        session_setting = {'key2': 'value2', 'key3': None}
        expected = {'key1': 'value1', 'key2': 'value2'}
        assert merge_setting(request_setting, session_setting, dict) == expected

    def test_non_dict_request_setting(self):
        assert merge_setting('not_a_dict', {'key': 'value'}, dict) == 'not_a_dict'

    def test_non_dict_session_setting(self):
        assert merge_setting({'key': 'value'}, 'not_a_dict', dict) == {'key': 'value'}

    def test_custom_dict_class(self):
        class CustomDict(dict):
            pass

        request_setting = {'key1': 'value1'}
        session_setting = {'key2': 'value2'}
        expected = CustomDict({'key1': 'value1', 'key2': 'value2'})
        assert merge_setting(request_setting, session_setting, CustomDict) == expected
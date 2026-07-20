import pytest
import flask
from flask.json.tag import TaggedJSONSerializer

class TestTaggedJSONSerializer:

    def setup_method(self):
        self.serializer = TaggedJSONSerializer()

    def test_untag_scan_with_empty_dict(self):
        app = flask.Flask('test_app')
        with app.test_request_context('/'):
            result = self.serializer._untag_scan({})
            assert result == {}

    def test_untag_scan_with_non_empty_dict(self):
        app = flask.Flask('test_app')
        with app.test_request_context('/'):
            input_value = {'key1': 'value1', 'key2': 'value2'}
            result = self.serializer._untag_scan(input_value)
            assert result == {'key1': 'value1', 'key2': 'value2'}

    def test_untag_scan_with_nested_dict(self):
        app = flask.Flask('test_app')
        with app.test_request_context('/'):
            input_value = {'key1': {'subkey1': 'subvalue1'}, 'key2': 'value2'}
            result = self.serializer._untag_scan(input_value)
            assert result == {'key1': {'subkey1': 'subvalue1'}, 'key2': 'value2'}

    def test_untag_scan_with_empty_list(self):
        app = flask.Flask('test_app')
        with app.test_request_context('/'):
            result = self.serializer._untag_scan([])
            assert result == []

    def test_untag_scan_with_non_empty_list(self):
        app = flask.Flask('test_app')
        with app.test_request_context('/'):
            input_value = ['value1', 'value2']
            result = self.serializer._untag_scan(input_value)
            assert result == ['value1', 'value2']

    def test_untag_scan_with_nested_list(self):
        app = flask.Flask('test_app')
        with app.test_request_context('/'):
            input_value = [{'key1': 'value1'}, {'key2': 'value2'}]
            result = self.serializer._untag_scan(input_value)
            assert result == [{'key1': 'value1'}, {'key2': 'value2'}]

    def test_untag_scan_with_mixed_dict_and_list(self):
        app = flask.Flask('test_app')
        with app.test_request_context('/'):
            input_value = {'key1': ['value1', 'value2'], 'key2': {'subkey': 'subvalue'}}
            result = self.serializer._untag_scan(input_value)
            assert result == {'key1': ['value1', 'value2'], 'key2': {'subkey': 'subvalue'}}
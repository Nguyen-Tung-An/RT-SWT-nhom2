import pytest
from flask.json.tag import TaggedJSONSerializer

class TestTaggedJSONSerializer:
    def setup_method(self):
        self.serializer = TaggedJSONSerializer()

    def test_untag_scan_with_empty_dict(self):
        result = self.serializer._untag_scan({})
        assert result == {}

    def test_untag_scan_with_non_empty_dict(self):
        input_value = {'key1': 'value1', 'key2': {'key3': 'value3'}}
        expected_output = {'key1': 'value1', 'key2': {'key3': 'value3'}}  # Assuming untag does not change values
        result = self.serializer._untag_scan(input_value)
        assert result == expected_output

    def test_untag_scan_with_empty_list(self):
        result = self.serializer._untag_scan([])
        assert result == []

    def test_untag_scan_with_non_empty_list(self):
        input_value = ['value1', {'key2': 'value2'}, ['value3']]
        expected_output = ['value1', {'key2': 'value2'}, ['value3']]  # Assuming untag does not change values
        result = self.serializer._untag_scan(input_value)
        assert result == expected_output

    def test_untag_scan_with_mixed_types(self):
        input_value = {'key1': 'value1', 'key2': ['value2', {'key3': 'value3'}]}
        expected_output = {'key1': 'value1', 'key2': ['value2', {'key3': 'value3'}]}  # Assuming untag does not change values
        result = self.serializer._untag_scan(input_value)
        assert result == expected_output

    def test_untag_scan_with_non_dict_non_list(self):
        input_value = 'string_value'
        result = self.serializer._untag_scan(input_value)
        assert result == 'string_value'  # Assuming untag does not change non-collection types

    def test_untag_scan_with_none(self):
        result = self.serializer._untag_scan(None)
        assert result is None  # Assuming untag does not change None
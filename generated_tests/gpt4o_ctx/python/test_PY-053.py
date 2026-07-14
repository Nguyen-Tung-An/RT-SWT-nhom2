import pytest
from flask.json.tag import TaggedJSONSerializer

@pytest.fixture
def serializer():
    return TaggedJSONSerializer()

def test_untag_scan_dict(serializer):
    input_value = {'key1': 'value1', 'key2': {'key3': 'value3'}}
    expected_output = {'key1': 'value1', 'key2': {'key3': 'value3'}}  # Adjust based on actual untag behavior
    assert serializer._untag_scan(input_value) == expected_output

def test_untag_scan_list(serializer):
    input_value = ['value1', {'key2': 'value2'}, 'value3']
    expected_output = ['value1', {'key2': 'value2'}, 'value3']  # Adjust based on actual untag behavior
    assert serializer._untag_scan(input_value) == expected_output

def test_untag_scan_empty_dict(serializer):
    input_value = {}
    expected_output = {}
    assert serializer._untag_scan(input_value) == expected_output

def test_untag_scan_empty_list(serializer):
    input_value = []
    expected_output = []
    assert serializer._untag_scan(input_value) == expected_output

def test_untag_scan_non_iterable(serializer):
    input_value = 'non_iterable'
    expected_output = 'non_iterable'
    assert serializer._untag_scan(input_value) == expected_output
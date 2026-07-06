import pytest
from flask.json.tag import _untag_scan

class MockClass:
    def untag(self, value):
        return value

    def _untag_scan(self, value):
        if isinstance(value, dict):
            value = {k: self._untag_scan(v) for k, v in value.items()}
            value = self.untag(value)
        elif isinstance(value, list):
            value = [self._untag_scan(item) for item in value]
        return value

@pytest.fixture
def mock_instance():
    return MockClass()

def test_untag_scan_dict(mock_instance):
    input_value = {'key1': 'value1', 'key2': 'value2'}
    expected_output = {'key1': 'value1', 'key2': 'value2'}
    assert mock_instance._untag_scan(input_value) == expected_output

def test_untag_scan_nested_dict(mock_instance):
    input_value = {'key1': {'subkey1': 'subvalue1'}, 'key2': 'value2'}
    expected_output = {'key1': {'subkey1': 'subvalue1'}, 'key2': 'value2'}
    assert mock_instance._untag_scan(input_value) == expected_output

def test_untag_scan_list(mock_instance):
    input_value = ['value1', 'value2', 'value3']
    expected_output = ['value1', 'value2', 'value3']
    assert mock_instance._untag_scan(input_value) == expected_output

def test_untag_scan_nested_list(mock_instance):
    input_value = [{'key1': 'value1'}, {'key2': 'value2'}]
    expected_output = [{'key1': 'value1'}, {'key2': 'value2'}]
    assert mock_instance._untag_scan(input_value) == expected_output

def test_untag_scan_empty_dict(mock_instance):
    input_value = {}
    expected_output = {}
    assert mock_instance._untag_scan(input_value) == expected_output

def test_untag_scan_empty_list(mock_instance):
    input_value = []
    expected_output = []
    assert mock_instance._untag_scan(input_value) == expected_output
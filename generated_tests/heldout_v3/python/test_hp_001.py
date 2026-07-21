import pytest
from requests.utils import _validate_header_part

class TestValidateHeaderPart:

    def test_valid_header_part(self):
        header = {'Content-Type': 'application/json'}
        header_part = 'Content-Type'
        header_validator_index = 0
        result = _validate_header_part(header, header_part, header_validator_index)
        assert result is None  # Assuming valid input returns None

    def test_invalid_header_part(self):
        header = {'Content-Type': 'application/json'}
        header_part = 'Invalid-Header'
        header_validator_index = 0
        with pytest.raises(KeyError):
            _validate_header_part(header, header_part, header_validator_index)

    def test_empty_header(self):
        header = {}
        header_part = 'Content-Type'
        header_validator_index = 0
        with pytest.raises(KeyError):
            _validate_header_part(header, header_part, header_validator_index)

    def test_none_header(self):
        header = None
        header_part = 'Content-Type'
        header_validator_index = 0
        with pytest.raises(TypeError):
            _validate_header_part(header, header_part, header_validator_index)

    def test_header_part_with_special_characters(self):
        header = {'X-Custom-Header!': 'value'}
        header_part = 'X-Custom-Header!'
        header_validator_index = 0
        result = _validate_header_part(header, header_part, header_validator_index)
        assert result is None  # Assuming valid input returns None

    def test_header_part_with_numeric_key(self):
        header = {123: 'value'}
        header_part = 123
        header_validator_index = 0
        result = _validate_header_part(header, header_part, header_validator_index)
        assert result is None  # Assuming valid input returns None

    def test_header_part_with_empty_string(self):
        header = {'': 'value'}
        header_part = ''
        header_validator_index = 0
        result = _validate_header_part(header, header_part, header_validator_index)
        assert result is None  # Assuming valid input returns None
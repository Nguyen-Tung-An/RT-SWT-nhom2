import pytest
from requests.utils import _validate_header_part
from requests.exceptions import InvalidHeader
import re

# Mock validators for testing
_HEADER_VALIDATORS_STR = [re.compile(r'^[\w-]+$'), re.compile(r'^[\w-]+$')]
_HEADER_VALIDATORS_BYTE = [re.compile(rb'^[\w-]+$'), re.compile(rb'^[\w-]+$')]

def test_validate_header_part_str_valid():
    _validate_header_part(('Header-Name', 'Header-Value'), 'Valid-Header', 0)

def test_validate_header_part_str_invalid():
    with pytest.raises(InvalidHeader, match="Invalid leading whitespace, reserved character"):
        _validate_header_part(('Header-Name', 'Header-Value'), 'Invalid Header', 0)

def test_validate_header_part_bytes_valid():
    _validate_header_part((b'Header-Name', b'Header-Value'), b'Valid-Header', 0)

def test_validate_header_part_bytes_invalid():
    with pytest.raises(InvalidHeader, match="Invalid leading whitespace, reserved character"):
        _validate_header_part((b'Header-Name', b'Header-Value'), b'Invalid Header', 0)

def test_validate_header_part_invalid_type():
    with pytest.raises(InvalidHeader, match="must be of type str or bytes"):
        _validate_header_part(('Header-Name', 'Header-Value'), 123, 0)

def test_validate_header_part_str_value_valid():
    _validate_header_part(('Header-Name', 'Header-Value'), 'Valid-Value', 1)

def test_validate_header_part_str_value_invalid():
    with pytest.raises(InvalidHeader, match="Invalid leading whitespace, reserved character"):
        _validate_header_part(('Header-Name', 'Header-Value'), 'Invalid Value', 1)

def test_validate_header_part_bytes_value_valid():
    _validate_header_part((b'Header-Name', b'Header-Value'), b'Valid-Value', 1)

def test_validate_header_part_bytes_value_invalid():
    with pytest.raises(InvalidHeader, match="Invalid leading whitespace, reserved character"):
        _validate_header_part((b'Header-Name', b'Header-Value'), b'Invalid Value', 1)
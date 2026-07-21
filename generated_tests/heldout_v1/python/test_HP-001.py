import pytest
from requests.utils import _validate_header_part
from requests.exceptions import InvalidHeader
import re

_HEADER_VALIDATORS_STR = [re.compile(r'^[!#$%&\'*+.^_`|~0-9a-zA-Z-]+$')]
_HEADER_VALIDATORS_BYTE = [re.compile(rb'^[!#$%&\'*+.^_`|~0-9a-zA-Z-]+$')]

def test_validate_header_part_str_valid():
    _validate_header_part(('Header-Name', 'Header-Value'), 'Valid-Header', 0)

def test_validate_header_part_str_invalid():
    with pytest.raises(InvalidHeader):
        _validate_header_part(('Header-Name', 'Header-Value'), 'Invalid Header', 0)

def test_validate_header_part_bytes_valid():
    _validate_header_part(('Header-Name', 'Header-Value'), b'Valid-Header', 0)

def test_validate_header_part_bytes_invalid():
    with pytest.raises(InvalidHeader):
        _validate_header_part(('Header-Name', 'Header-Value'), b'Invalid Header', 0)

def test_validate_header_part_invalid_type():
    with pytest.raises(InvalidHeader):
        _validate_header_part(('Header-Name', 'Header-Value'), 123, 0)

def test_validate_header_part_invalid_type_bytes():
    with pytest.raises(InvalidHeader):
        _validate_header_part(('Header-Name', 'Header-Value'), 123.45, 0)
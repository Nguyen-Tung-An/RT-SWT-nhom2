import pytest
from requests.utils import is_valid_cidr

def test_valid_cidr():
    assert is_valid_cidr("192.168.1.0/24") is True

def test_valid_cidr_with_min_mask():
    assert is_valid_cidr("10.0.0.1/1") is True

def test_valid_cidr_with_max_mask():
    assert is_valid_cidr("172.16.0.0/32") is True

def test_invalid_cidr_no_slash():
    assert is_valid_cidr("192.168.1.1") is False

def test_invalid_cidr_multiple_slashes():
    assert is_valid_cidr("192.168.1.1/24/25") is False

def test_invalid_cidr_non_integer_mask():
    assert is_valid_cidr("192.168.1.1/abc") is False

def test_invalid_cidr_mask_too_low():
    assert is_valid_cidr("192.168.1.1/0") is False

def test_invalid_cidr_mask_too_high():
    assert is_valid_cidr("192.168.1.1/33") is False

def test_invalid_cidr_invalid_ip():
    assert is_valid_cidr("999.999.999.999/24") is False

def test_invalid_cidr_empty_string():
    assert is_valid_cidr("") is False
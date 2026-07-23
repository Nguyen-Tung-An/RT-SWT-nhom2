import pytest
from requests.utils import is_valid_cidr

class TestIsValidCidr:
    def test_valid_cidr(self):
        assert is_valid_cidr("192.168.1.0/24") is True

    def test_valid_cidr_boundary_min(self):
        assert is_valid_cidr("10.0.0.1/1") is True

    def test_valid_cidr_boundary_max(self):
        assert is_valid_cidr("172.16.0.0/32") is True

    def test_invalid_cidr_no_slash(self):
        assert is_valid_cidr("192.168.1.0") is False

    def test_invalid_cidr_multiple_slashes(self):
        assert is_valid_cidr("192.168.1.0/24/16") is False

    def test_invalid_cidr_non_integer_mask(self):
        assert is_valid_cidr("192.168.1.0/abc") is False

    def test_invalid_cidr_mask_too_low(self):
        assert is_valid_cidr("192.168.1.0/0") is False

    def test_invalid_cidr_mask_too_high(self):
        assert is_valid_cidr("192.168.1.0/33") is False

    def test_invalid_cidr_invalid_ip(self):
        assert is_valid_cidr("999.999.999.999/24") is False

    def test_invalid_cidr_empty_string(self):
        assert is_valid_cidr("") is False

    def test_invalid_cidr_invalid_format(self):
        assert is_valid_cidr("256.256.256.256/24") is False
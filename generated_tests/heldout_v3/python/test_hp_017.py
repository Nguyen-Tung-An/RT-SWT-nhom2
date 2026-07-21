import pytest
from requests.utils import is_valid_cidr

class TestIsValidCIDR:
    def test_valid_cidr(self):
        assert is_valid_cidr("192.168.1.0/24") is True

    def test_valid_cidr_with_different_prefix(self):
        assert is_valid_cidr("10.0.0.0/8") is True

    def test_valid_cidr_with_max_prefix(self):
        assert is_valid_cidr("255.255.255.255/32") is True

    def test_invalid_cidr_no_prefix(self):
        assert is_valid_cidr("192.168.1.1") is False

    def test_invalid_cidr_invalid_ip(self):
        assert is_valid_cidr("999.999.999.999/24") is False

    def test_invalid_cidr_invalid_prefix(self):
        assert is_valid_cidr("192.168.1.0/33") is False

    def test_invalid_cidr_empty_string(self):
        assert is_valid_cidr("") is False

    def test_invalid_cidr_non_numeric(self):
        assert is_valid_cidr("abc.def.ghi.jkl/24") is False

    def test_invalid_cidr_special_characters(self):
        assert is_valid_cidr("192.168.1.0/24!") is False

    def test_valid_cidr_ipv6(self):
        assert is_valid_cidr("2001:0db8:85a3:0000:0000:8a2e:0370:7334/64") is True

    def test_invalid_cidr_ipv6(self):
        assert is_valid_cidr("2001:0db8:85a3:0000:0000:8a2e:0370:7334/129") is False
import pytest
from requests import check_compatibility

def test_check_compatibility_valid_versions():
    assert check_compatibility("1.26.0", "4.0.0", "2.0.0") is True

def test_check_compatibility_invalid_urllib3_version():
    assert check_compatibility("invalid_version", "4.0.0", "2.0.0") is False

def test_check_compatibility_invalid_chardet_version():
    assert check_compatibility("1.26.0", "invalid_version", "2.0.0") is False

def test_check_compatibility_invalid_charset_normalizer_version():
    assert check_compatibility("1.26.0", "4.0.0", "invalid_version") is False

def test_check_compatibility_edge_case_empty_versions():
    assert check_compatibility("", "", "") is False

def test_check_compatibility_edge_case_none_versions():
    assert check_compatibility(None, None, None) is False

def test_check_compatibility_edge_case_mixed_valid_invalid():
    assert check_compatibility("1.26.0", "invalid_version", "2.0.0") is False
    assert check_compatibility("invalid_version", "4.0.0", "2.0.0") is False
    assert check_compatibility("1.26.0", "4.0.0", "invalid_version") is False
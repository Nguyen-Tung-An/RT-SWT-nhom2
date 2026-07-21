import pytest
from requests import check_compatibility

def test_compatibility_valid_urllib3_chardet():
    check_compatibility("1.21.1", "3.0.2", None)

def test_compatibility_valid_urllib3_charset_normalizer():
    check_compatibility("1.21.1", None, "2.0.0")

def test_compatibility_invalid_urllib3_version():
    with pytest.raises(AssertionError):
        check_compatibility("dev", "3.0.2", None)

def test_compatibility_invalid_chardet_version_too_low():
    with pytest.raises(AssertionError):
        check_compatibility("1.21.1", "3.0.1", None)

def test_compatibility_invalid_chardet_version_too_high():
    with pytest.raises(AssertionError):
        check_compatibility("1.21.1", "8.0.0", None)

def test_compatibility_invalid_charset_normalizer_version_too_low():
    with pytest.raises(AssertionError):
        check_compatibility("1.21.1", None, "1.9.9")

def test_compatibility_invalid_charset_normalizer_version_too_high():
    with pytest.raises(AssertionError):
        check_compatibility("1.21.1", None, "4.0.0")

def test_compatibility_missing_both_dependencies():
    with pytest.warns(Warning):
        check_compatibility("1.21.1", None, None)

def test_compatibility_valid_urllib3_with_minor_version():
    check_compatibility("1.21", "3.0.2", None)

def test_compatibility_valid_urllib3_with_patch_version():
    check_compatibility("1.21.0", "3.0.2", None)
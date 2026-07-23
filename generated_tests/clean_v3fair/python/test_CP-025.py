import pytest
from requests import check_compatibility

def test_check_compatibility_valid_urllib3():
    check_compatibility("1.21.1", "3.0.2", None)

def test_check_compatibility_valid_urllib3_with_charset_normalizer():
    check_compatibility("1.21.1", None, "2.0.0")

def test_check_compatibility_valid_urllib3_with_chardet():
    check_compatibility("1.21.1", "3.0.2", None)

def test_check_compatibility_invalid_urllib3_version():
    with pytest.raises(AssertionError):
        check_compatibility("0.0.0", "3.0.2", None)

def test_check_compatibility_invalid_chardet_version():
    with pytest.raises(AssertionError):
        check_compatibility("1.21.1", "2.0.0", None)

def test_check_compatibility_invalid_charset_normalizer_version():
    with pytest.raises(AssertionError):
        check_compatibility("1.21.1", None, "1.0.0")

def test_check_compatibility_no_charset_detection():
    with pytest.warns(UserWarning):
        check_compatibility("1.21.1", None, None)

def test_check_compatibility_dev_version():
    with pytest.raises(AssertionError):
        check_compatibility("dev", "3.0.2", None)

def test_check_compatibility_urllib3_minor_version():
    check_compatibility("1.21.0", "3.0.2", None)

def test_check_compatibility_urllib3_patch_version():
    check_compatibility("1.21.1.1", "3.0.2", None)
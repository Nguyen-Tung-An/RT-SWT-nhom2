import pytest
from requests import check_compatibility
import warnings

def test_compatibility_valid_urllib3_chardet():
    check_compatibility("1.21.1", "3.0.2", None)

def test_compatibility_valid_urllib3_charset_normalizer():
    check_compatibility("1.21.1", None, "2.0.0")

def test_compatibility_invalid_urllib3_version():
    with pytest.raises(AssertionError):
        check_compatibility("dev", "3.0.2", None)

def test_compatibility_urllib3_too_low_minor():
    with pytest.raises(AssertionError):
        check_compatibility("1.20.0", "3.0.2", None)

def test_compatibility_urllib3_too_low_major():
    with pytest.raises(AssertionError):
        check_compatibility("0.9.0", "3.0.2", None)

def test_compatibility_chardet_too_low():
    with pytest.raises(AssertionError):
        check_compatibility("1.21.1", "3.0.1", None)

def test_compatibility_chardet_too_high():
    with pytest.raises(AssertionError):
        check_compatibility("1.21.1", "8.0.0", None)

def test_compatibility_charset_normalizer_too_low():
    with pytest.raises(AssertionError):
        check_compatibility("1.21.1", None, "1.9.9")

def test_compatibility_charset_normalizer_too_high():
    with pytest.raises(AssertionError):
        check_compatibility("1.21.1", None, "4.0.0")

def test_compatibility_no_charset_detection_warning():
    with pytest.warns(Warning) as record:
        check_compatibility("1.21.1", None, None)
    assert len(record) == 1
    assert "Unable to find acceptable character detection dependency" in str(record[0].message)
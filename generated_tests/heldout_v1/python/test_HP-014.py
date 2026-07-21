import pytest
from requests.__init__ import check_compatibility

def test_check_compatibility_urllib3_valid():
    check_compatibility("1.21.1", "3.0.2", None)

def test_check_compatibility_urllib3_invalid_major():
    with pytest.raises(AssertionError):
        check_compatibility("0.21.1", "3.0.2", None)

def test_check_compatibility_urllib3_invalid_minor():
    with pytest.raises(AssertionError):
        check_compatibility("1.20.0", "3.0.2", None)

def test_check_compatibility_chardet_valid():
    check_compatibility("1.21.1", "3.0.2", None)

def test_check_compatibility_chardet_invalid():
    with pytest.raises(AssertionError):
        check_compatibility("1.21.1", "2.0.0", None)

def test_check_compatibility_charset_normalizer_valid():
    check_compatibility("1.21.1", None, "2.0.0")

def test_check_compatibility_charset_normalizer_invalid():
    with pytest.raises(AssertionError):
        check_compatibility("1.21.1", None, "4.0.0")

def test_check_compatibility_no_dependencies_warning(mocker):
    mocker.patch("warnings.warn")
    check_compatibility("1.21.1", None, None)
    warnings.warn.assert_called_once()
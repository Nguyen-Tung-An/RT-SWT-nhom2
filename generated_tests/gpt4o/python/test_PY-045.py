import pytest
from requests.utils import proxy_bypass_registry

def test_proxy_bypass_registry_no_import():
    # Simulate the absence of winreg by mocking
    with pytest.raises(ImportError):
        proxy_bypass_registry("example.com")

def test_proxy_bypass_registry_no_key():
    # Mock winreg to raise OSError
    import winreg
    from unittest.mock import patch

    with patch('winreg.OpenKey', side_effect=OSError):
        assert proxy_bypass_registry("example.com") is False

def test_proxy_bypass_registry_value_error():
    # Mock winreg to raise ValueError
    import winreg
    from unittest.mock import patch

    with patch('winreg.OpenKey', return_value=None), \
         patch('winreg.QueryValueEx', side_effect=ValueError):
        assert proxy_bypass_registry("example.com") is False

def test_proxy_bypass_registry_proxy_disabled():
    # Mock winreg to return ProxyEnable as 0
    import winreg
    from unittest.mock import patch

    with patch('winreg.OpenKey', return_value=None), \
         patch('winreg.QueryValueEx', side_effect=[(0, None), ("", None)]):
        assert proxy_bypass_registry("example.com") is False

def test_proxy_bypass_registry_no_override():
    # Mock winreg to return ProxyEnable as 1 and ProxyOverride as empty
    import winreg
    from unittest.mock import patch

    with patch('winreg.OpenKey', return_value=None), \
         patch('winreg.QueryValueEx', side_effect=[(1, None), ("", None)]):
        assert proxy_bypass_registry("example.com") is False

def test_proxy_bypass_registry_local_match():
    # Mock winreg to return ProxyEnable as 1 and ProxyOverride containing <local>
    import winreg
    from unittest.mock import patch

    with patch('winreg.OpenKey', return_value=None), \
         patch('winreg.QueryValueEx', side_effect=[(1, None), ("<local>;example.com", None)]):
        assert proxy_bypass_registry("localhost") is True

def test_proxy_bypass_registry_pattern_match():
    # Mock winreg to return ProxyEnable as 1 and ProxyOverride with a pattern
    import winreg
    from unittest.mock import patch

    with patch('winreg.OpenKey', return_value=None), \
         patch('winreg.QueryValueEx', side_effect=[(1, None), ("*.example.com;*.test.com", None)]):
        assert proxy_bypass_registry("sub.example.com") is True
        assert proxy_bypass_registry("sub.test.com") is True
        assert proxy_bypass_registry("example.org") is False
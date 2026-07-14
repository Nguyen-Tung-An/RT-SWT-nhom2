import pytest
from requests.utils import proxy_bypass_registry

def test_proxy_bypass_registry_no_winreg_import():
    # Simulate the absence of winreg by mocking the import
    with pytest.raises(ImportError):
        proxy_bypass_registry("example.com")

def test_proxy_bypass_registry_no_proxy_enable():
    # Mocking winreg to simulate no ProxyEnable
    import winreg
    from unittest.mock import patch

    with patch('winreg.OpenKey') as mock_open_key:
        mock_open_key.return_value = None
        with patch('winreg.QueryValueEx') as mock_query_value:
            mock_query_value.side_effect = [(0, None)]
            assert not proxy_bypass_registry("example.com")

def test_proxy_bypass_registry_no_proxy_override():
    # Mocking winreg to simulate no ProxyOverride
    import winreg
    from unittest.mock import patch

    with patch('winreg.OpenKey') as mock_open_key:
        mock_open_key.return_value = None
        with patch('winreg.QueryValueEx') as mock_query_value:
            mock_query_value.side_effect = [(1, None), (None, None)]
            assert not proxy_bypass_registry("example.com")

def test_proxy_bypass_registry_proxy_disabled():
    # Mocking winreg to simulate ProxyEnable is 0
    import winreg
    from unittest.mock import patch

    with patch('winreg.OpenKey') as mock_open_key:
        mock_open_key.return_value = None
        with patch('winreg.QueryValueEx') as mock_query_value:
            mock_query_value.side_effect = [(0, None), ("<local>", None)]
            assert not proxy_bypass_registry("example.com")

def test_proxy_bypass_registry_empty_proxy_override():
    # Mocking winreg to simulate empty ProxyOverride
    import winreg
    from unittest.mock import patch

    with patch('winreg.OpenKey') as mock_open_key:
        mock_open_key.return_value = None
        with patch('winreg.QueryValueEx') as mock_query_value:
            mock_query_value.side_effect = [(1, None), ("", None)]
            assert not proxy_bypass_registry("example.com")

def test_proxy_bypass_registry_localhost():
    # Mocking winreg to simulate valid ProxyOverride with <local>
    import winreg
    from unittest.mock import patch

    with patch('winreg.OpenKey') as mock_open_key:
        mock_open_key.return_value = None
        with patch('winreg.QueryValueEx') as mock_query_value:
            mock_query_value.side_effect = [(1, None), ("<local>", None)]
            assert proxy_bypass_registry("localhost")

def test_proxy_bypass_registry_matching_pattern():
    # Mocking winreg to simulate valid ProxyOverride with a matching pattern
    import winreg
    from unittest.mock import patch

    with patch('winreg.OpenKey') as mock_open_key:
        mock_open_key.return_value = None
        with patch('winreg.QueryValueEx') as mock_query_value:
            mock_query_value.side_effect = [(1, None), ("*.example.com", None)]
            assert proxy_bypass_registry("test.example.com")

def test_proxy_bypass_registry_non_matching_pattern():
    # Mocking winreg to simulate valid ProxyOverride with a non-matching pattern
    import winreg
    from unittest.mock import patch

    with patch('winreg.OpenKey') as mock_open_key:
        mock_open_key.return_value = None
        with patch('winreg.QueryValueEx') as mock_query_value:
            mock_query_value.side_effect = [(1, None), ("*.example.com", None)]
            assert not proxy_bypass_registry("test.com")
import pytest
from requests.utils import should_bypass_proxies

def test_proxy_bypass_registry_no_winreg_import():
    # Simulate the absence of winreg by mocking the import
    with pytest.raises(ImportError):
        should_bypass_proxies("example.com", None)

def test_proxy_bypass_registry_no_proxy_enable():
    from unittest.mock import patch

    with patch('winreg.OpenKey') as mock_open_key:
        mock_open_key.return_value = None
        with patch('winreg.QueryValueEx') as mock_query_value:
            mock_query_value.side_effect = [(0, None)]
            assert not should_bypass_proxies("example.com", None)

def test_proxy_bypass_registry_no_proxy_override():
    from unittest.mock import patch

    with patch('winreg.OpenKey') as mock_open_key:
        mock_open_key.return_value = None
        with patch('winreg.QueryValueEx') as mock_query_value:
            mock_query_value.side_effect = [(1, None), (None, None)]
            assert not should_bypass_proxies("example.com", None)

def test_proxy_bypass_registry_proxy_disabled():
    from unittest.mock import patch

    with patch('winreg.OpenKey') as mock_open_key:
        mock_open_key.return_value = None
        with patch('winreg.QueryValueEx') as mock_query_value:
            mock_query_value.side_effect = [(0, None), ("<local>", None)]
            assert not should_bypass_proxies("example.com", None)

def test_proxy_bypass_registry_empty_proxy_override():
    from unittest.mock import patch

    with patch('winreg.OpenKey') as mock_open_key:
        mock_open_key.return_value = None
        with patch('winreg.QueryValueEx') as mock_query_value:
            mock_query_value.side_effect = [(1, None), ("", None)]
            assert not should_bypass_proxies("example.com", None)

def test_proxy_bypass_registry_localhost():
    from unittest.mock import patch

    with patch('winreg.OpenKey') as mock_open_key:
        mock_open_key.return_value = None
        with patch('winreg.QueryValueEx') as mock_query_value:
            mock_query_value.side_effect = [(1, None), ("<local>", None)]
            assert should_bypass_proxies("localhost", None)

def test_proxy_bypass_registry_matching_pattern():
    from unittest.mock import patch

    with patch('winreg.OpenKey') as mock_open_key:
        mock_open_key.return_value = None
        with patch('winreg.QueryValueEx') as mock_query_value:
            mock_query_value.side_effect = [(1, None), ("*.example.com", None)]
            assert should_bypass_proxies("test.example.com", None)

def test_proxy_bypass_registry_non_matching_pattern():
    from unittest.mock import patch

    with patch('winreg.OpenKey') as mock_open_key:
        mock_open_key.return_value = None
        with patch('winreg.QueryValueEx') as mock_query_value:
            mock_query_value.side_effect = [(1, None), ("*.example.com", None)]
            assert not should_bypass_proxies("test.com", None)
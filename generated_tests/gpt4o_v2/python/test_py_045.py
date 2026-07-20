import pytest
from unittest.mock import patch, MagicMock
from requests.utils import proxy_bypass_registry

class TestProxyBypassRegistry:

    @patch('winreg.OpenKey')
    @patch('winreg.QueryValueEx')
    def test_proxy_bypass_enabled_with_local(self, mock_query_value_ex, mock_open_key):
        mock_open_key.return_value = MagicMock()
        mock_query_value_ex.side_effect = [
            (1, ),  # ProxyEnable as REG_DWORD
            ("<local>;*.example.com;*.test.com", )  # ProxyOverride
        ]
        assert proxy_bypass_registry("localhost") is True

    @patch('winreg.OpenKey')
    @patch('winreg.QueryValueEx')
    def test_proxy_bypass_enabled_with_wildcard(self, mock_query_value_ex, mock_open_key):
        mock_open_key.return_value = MagicMock()
        mock_query_value_ex.side_effect = [
            (1, ),  # ProxyEnable as REG_DWORD
            ("*.example.com;*.test.com", )  # ProxyOverride
        ]
        assert proxy_bypass_registry("sub.example.com") is True

    @patch('winreg.OpenKey')
    @patch('winreg.QueryValueEx')
    def test_proxy_bypass_disabled(self, mock_query_value_ex, mock_open_key):
        mock_open_key.return_value = MagicMock()
        mock_query_value_ex.side_effect = [
            (0, ),  # ProxyEnable as REG_DWORD
            ("<local>;*.example.com", )  # ProxyOverride
        ]
        assert proxy_bypass_registry("localhost") is False

    @patch('winreg.OpenKey')
    @patch('winreg.QueryValueEx')
    def test_proxy_bypass_no_proxy_override(self, mock_query_value_ex, mock_open_key):
        mock_open_key.return_value = MagicMock()
        mock_query_value_ex.side_effect = [
            (1, ),  # ProxyEnable as REG_DWORD
            ("", )  # ProxyOverride
        ]
        assert proxy_bypass_registry("localhost") is False

    @patch('winreg.OpenKey')
    @patch('winreg.QueryValueEx')
    def test_proxy_bypass_invalid_registry_access(self, mock_query_value_ex, mock_open_key):
        mock_open_key.side_effect = OSError("Registry access error")
        assert proxy_bypass_registry("localhost") is False

    @patch('winreg.OpenKey')
    @patch('winreg.QueryValueEx')
    def test_proxy_bypass_invalid_value(self, mock_query_value_ex, mock_open_key):
        mock_open_key.return_value = MagicMock()
        mock_query_value_ex.side_effect = [
            (1, ),  # ProxyEnable as REG_DWORD
            ("<local>;*.example.com", )  # ProxyOverride
        ]
        assert proxy_bypass_registry("invalid_host") is False
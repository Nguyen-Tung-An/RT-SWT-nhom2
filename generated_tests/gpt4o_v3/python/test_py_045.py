import pytest
from requests.utils import proxy_bypass_registry

class TestProxyBypassRegistry:
    
    def test_proxy_bypass_with_local_host(self, monkeypatch):
        monkeypatch.setattr("winreg.OpenKey", lambda *args: None)
        monkeypatch.setattr("winreg.QueryValueEx", lambda *args: (1, "<local>;example.com"))
        assert proxy_bypass_registry("localhost") is True

    def test_proxy_bypass_with_matching_pattern(self, monkeypatch):
        monkeypatch.setattr("winreg.OpenKey", lambda *args: None)
        monkeypatch.setattr("winreg.QueryValueEx", lambda *args: (1, "*.example.com;*.test.com"))
        assert proxy_bypass_registry("sub.example.com") is True

    def test_proxy_bypass_with_non_matching_pattern(self, monkeypatch):
        monkeypatch.setattr("winreg.OpenKey", lambda *args: None)
        monkeypatch.setattr("winreg.QueryValueEx", lambda *args: (1, "*.example.com;*.test.com"))
        assert proxy_bypass_registry("anotherdomain.com") is False

    def test_proxy_bypass_with_empty_proxy_override(self, monkeypatch):
        monkeypatch.setattr("winreg.OpenKey", lambda *args: None)
        monkeypatch.setattr("winreg.QueryValueEx", lambda *args: (1, ""))
        assert proxy_bypass_registry("localhost") is False

    def test_proxy_bypass_with_disabled_proxy(self, monkeypatch):
        monkeypatch.setattr("winreg.OpenKey", lambda *args: None)
        monkeypatch.setattr("winreg.QueryValueEx", lambda *args: (0, "<local>;example.com"))
        assert proxy_bypass_registry("localhost") is False

    def test_proxy_bypass_with_import_error(self, monkeypatch):
        monkeypatch.setattr("winreg", None)
        assert proxy_bypass_registry("localhost") is False

    def test_proxy_bypass_with_os_error(self, monkeypatch):
        monkeypatch.setattr("winreg.OpenKey", lambda *args: (_ for _ in ()).throw(OSError))
        assert proxy_bypass_registry("localhost") is False

    def test_proxy_bypass_with_value_error(self, monkeypatch):
        monkeypatch.setattr("winreg.OpenKey", lambda *args: None)
        monkeypatch.setattr("winreg.QueryValueEx", lambda *args: (_ for _ in ()).throw(ValueError))
        assert proxy_bypass_registry("localhost") is False
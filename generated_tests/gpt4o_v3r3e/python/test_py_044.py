import pytest
from requests.sessions import Session

class TestMergeEnvironmentSettings:
    def setup_method(self):
        self.session = Session()
        self.session.trust_env = True

    def test_merge_with_no_proxies(self):
        result = self.session.merge_environment_settings("http://example.com", None, None, None, None)
        assert result["proxies"] == {}
        assert result["stream"] is False
        assert result["verify"] is None
        assert result["cert"] is None

    def test_merge_with_empty_proxies(self):
        result = self.session.merge_environment_settings("http://example.com", {}, None, None, None)
        assert result["proxies"] == {}
        assert result["stream"] is False
        assert result["verify"] is None
        assert result["cert"] is None

    def test_merge_with_proxies(self):
        proxies = {"http": "http://proxy.com", "https": "https://proxy.com"}
        result = self.session.merge_environment_settings("http://example.com", proxies, None, None, None)
        assert result["proxies"] == proxies
        assert result["stream"] is False
        assert result["verify"] is None
        assert result["cert"] is None

    def test_merge_with_stream(self):
        result = self.session.merge_environment_settings("http://example.com", None, True, None, None)
        assert result["proxies"] == {}
        assert result["stream"] is True
        assert result["verify"] is None
        assert result["cert"] is None

    def test_merge_with_verify(self):
        result = self.session.merge_environment_settings("http://example.com", None, None, True, None)
        assert result["proxies"] == {}
        assert result["stream"] is False
        assert result["verify"] is True
        assert result["cert"] is None

    def test_merge_with_cert(self):
        result = self.session.merge_environment_settings("http://example.com", None, None, None, "path/to/cert")
        assert result["proxies"] == {}
        assert result["stream"] is False
        assert result["verify"] is None
        assert result["cert"] == "path/to/cert"

    def test_merge_with_environment_variables(self, monkeypatch):
        monkeypatch.setenv("REQUESTS_CA_BUNDLE", "env_cert_path")
        result = self.session.merge_environment_settings("http://example.com", None, None, None, None)
        assert result["proxies"] == {}
        assert result["stream"] is False
        assert result["verify"] == "env_cert_path"
        assert result["cert"] is None

    def test_merge_with_no_proxy(self):
        proxies = {"no_proxy": "example.com"}
        result = self.session.merge_environment_settings("http://example.com", proxies, None, None, None)
        assert result["proxies"] == {}
        assert result["stream"] is False
        assert result["verify"] is None
        assert result["cert"] is None
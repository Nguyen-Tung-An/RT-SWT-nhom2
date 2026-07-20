import os
import pytest
from requests.sessions import Session

class TestMergeEnvironmentSettings:
    def setup_method(self):
        self.session = Session()
        self.session.trust_env = True
        self.session.proxies = {}
        self.session.stream = False
        self.session.verify = True
        self.session.cert = None

    def test_merge_with_no_proxies(self):
        result = self.session.merge_environment_settings("http://example.com", None, None, None, None)
        assert result == {"proxies": {}, "stream": False, "verify": True, "cert": None}

    def test_merge_with_empty_proxies(self):
        result = self.session.merge_environment_settings("http://example.com", {}, None, None, None)
        assert result == {"proxies": {}, "stream": False, "verify": True, "cert": None}

    def test_merge_with_proxies(self):
        proxies = {"http": "http://proxy.com", "https": "https://proxy.com"}
        result = self.session.merge_environment_settings("http://example.com", proxies, None, None, None)
        assert result["proxies"] == {"http": "http://proxy.com", "https": "https://proxy.com"}

    def test_merge_with_stream(self):
        result = self.session.merge_environment_settings("http://example.com", None, True, None, None)
        assert result["stream"] is True

    def test_merge_with_verify_true(self):
        result = self.session.merge_environment_settings("http://example.com", None, None, True, None)
        assert result["verify"] is True

    def test_merge_with_verify_none(self):
        os.environ["REQUESTS_CA_BUNDLE"] = "path/to/cert"
        result = self.session.merge_environment_settings("http://example.com", None, None, None, None)
        assert result["verify"] == "path/to/cert"
        del os.environ["REQUESTS_CA_BUNDLE"]

    def test_merge_with_cert(self):
        result = self.session.merge_environment_settings("http://example.com", None, None, None, "path/to/cert")
        assert result["cert"] == "path/to/cert"

    def test_merge_with_no_proxy_env(self):
        os.environ["no_proxy"] = "example.com"
        result = self.session.merge_environment_settings("http://example.com", None, None, None, None)
        assert "no_proxy" not in result["proxies"]
        del os.environ["no_proxy"]

    def test_merge_with_invalid_url(self):
        with pytest.raises(ValueError):
            self.session.merge_environment_settings("", None, None, None, None)
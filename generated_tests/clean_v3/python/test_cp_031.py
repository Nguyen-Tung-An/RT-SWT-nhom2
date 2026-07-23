import pytest
from requests.utils import prepend_scheme_if_needed

class TestPrependSchemeIfNeeded:
    
    def test_no_scheme_no_netloc(self):
        url = "example.com/path"
        new_scheme = "http"
        result = prepend_scheme_if_needed(url, new_scheme)
        assert result == "http://example.com/path"

    def test_no_scheme_with_netloc(self):
        url = "http://example.com/path"
        new_scheme = "https"
        result = prepend_scheme_if_needed(url, new_scheme)
        assert result == "http://example.com/path"

    def test_with_scheme(self):
        url = "ftp://example.com/path"
        new_scheme = "http"
        result = prepend_scheme_if_needed(url, new_scheme)
        assert result == "ftp://example.com/path"

    def test_no_scheme_no_netloc_with_auth(self):
        url = "user:pass@example.com/path"
        new_scheme = "http"
        result = prepend_scheme_if_needed(url, new_scheme)
        assert result == "http://user:pass@example.com/path"

    def test_no_scheme_with_auth_and_netloc(self):
        url = "user:pass@"
        new_scheme = "http"
        result = prepend_scheme_if_needed(url, new_scheme)
        assert result == "http://user:pass@"

    def test_empty_url(self):
        url = ""
        new_scheme = "http"
        result = prepend_scheme_if_needed(url, new_scheme)
        assert result == "http://"

    def test_only_path(self):
        url = "/path"
        new_scheme = "http"
        result = prepend_scheme_if_needed(url, new_scheme)
        assert result == "http:///path"

    def test_only_query(self):
        url = "?query=1"
        new_scheme = "http"
        result = prepend_scheme_if_needed(url, new_scheme)
        assert result == "http://?query=1"

    def test_only_fragment(self):
        url = "#fragment"
        new_scheme = "http"
        result = prepend_scheme_if_needed(url, new_scheme)
        assert result == "http://#fragment"
import pytest
from requests.utils import prepend_scheme_if_needed

def test_prepend_scheme_if_needed_no_scheme():
    assert prepend_scheme_if_needed("example.com", "http") == "http://example.com"

def test_prepend_scheme_if_needed_with_scheme():
    assert prepend_scheme_if_needed("https://example.com", "http") == "https://example.com"

def test_prepend_scheme_if_needed_empty_url():
    assert prepend_scheme_if_needed("", "http") == "http://"

def test_prepend_scheme_if_needed_no_netloc():
    assert prepend_scheme_if_needed("path/to/resource", "http") == "http://path/to/resource"

def test_prepend_scheme_if_needed_with_auth():
    assert prepend_scheme_if_needed("user:pass@example.com", "http") == "http://user:pass@example.com"

def test_prepend_scheme_if_needed_with_auth_no_netloc():
    assert prepend_scheme_if_needed("user:pass@path/to/resource", "http") == "http://user:pass@path/to/resource"
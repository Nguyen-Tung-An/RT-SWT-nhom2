import pytest
from requests.utils import unquote_unreserved

def test_unquote_unreserved_valid():
    assert unquote_unreserved("hello%20world") == "hello world"
    assert unquote_unreserved("test%2Fpath") == "test/path"
    assert unquote_unreserved("100%25") == "100%"

def test_unquote_unreserved_no_escape():
    assert unquote_unreserved("just-a-string") == "just-a-string"

def test_unquote_unreserved_invalid_escape():
    with pytest.raises(ValueError):
        unquote_unreserved("invalid%2G")

def test_unquote_unreserved_partial_escape():
    assert unquote_unreserved("part%2Fnotescaped") == "part/notescaped"
    assert unquote_unreserved("escaped%20and%notescaped") == "escaped and%notescaped"

def test_unquote_unreserved_empty_string():
    assert unquote_unreserved("") == ""
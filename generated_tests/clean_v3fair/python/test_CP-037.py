import pytest
from requests.utils import unquote_unreserved

def test_unquote_unreserved_basic():
    assert unquote_unreserved("hello%20world") == "hello world"

def test_unquote_unreserved_multiple_encodings():
    assert unquote_unreserved("foo%20bar%2Fbaz") == "foo bar/baz"

def test_unquote_unreserved_no_encoding():
    assert unquote_unreserved("just-a-string") == "just-a-string"

def test_unquote_unreserved_invalid_encoding():
    with pytest.raises(ValueError):
        unquote_unreserved("invalid%2g")

def test_unquote_unreserved_reserved_characters():
    assert unquote_unreserved("percent%25") == "percent%"

def test_unquote_unreserved_non_ascii():
    assert unquote_unreserved("cafe%cc%81") == "café"

def test_unquote_unreserved_empty_string():
    assert unquote_unreserved("") == ""

def test_unquote_unreserved_leading_percent():
    assert unquote_unreserved("%20leading") == " leading"

def test_unquote_unreserved_trailing_percent():
    assert unquote_unreserved("trailing%20") == "trailing "

def test_unquote_unreserved_double_percent():
    assert unquote_unreserved("double%%20percent") == "double% percent"
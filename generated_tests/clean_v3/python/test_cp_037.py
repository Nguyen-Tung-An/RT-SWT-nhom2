import pytest
from requests.utils import unquote_unreserved
from requests.exceptions import InvalidURL

def test_unquote_unreserved_valid():
    assert unquote_unreserved("hello%20world") == "hello world"
    assert unquote_unreserved("test%2Fpath") == "test/path"
    assert unquote_unreserved("100%25") == "100%"
    assert unquote_unreserved("abc%2Fdef%3Fghi") == "abc/def?ghi"

def test_unquote_unreserved_unreserved_characters():
    assert unquote_unreserved("hello%21") == "hello!"
    assert unquote_unreserved("space%20here") == "space here"
    assert unquote_unreserved("tilde%7E") == "tilde~"

def test_unquote_unreserved_invalid_escape_sequence():
    with pytest.raises(InvalidURL):
        unquote_unreserved("invalid%2Gsequence")

def test_unquote_unreserved_no_escape():
    assert unquote_unreserved("no%escapes") == "no%escapes"
    assert unquote_unreserved("just-a-string") == "just-a-string"

def test_unquote_unreserved_multiple_percent_encodings():
    assert unquote_unreserved("%20%20%20") == "   "
    assert unquote_unreserved("%2F%2F%2F") == "///"
    assert unquote_unreserved("%%20%%20") == "%20%20"

def test_unquote_unreserved_empty_string():
    assert unquote_unreserved("") == ""
import pytest
from requests.utils import get_encoding_from_headers
from collections import CaseInsensitiveDict

def test_get_encoding_no_content_type():
    headers = CaseInsensitiveDict()
    assert get_encoding_from_headers(headers) is None

def test_get_encoding_with_charset():
    headers = CaseInsensitiveDict({"content-type": "text/html; charset=UTF-8"})
    assert get_encoding_from_headers(headers) == "UTF-8"

def test_get_encoding_text_type():
    headers = CaseInsensitiveDict({"content-type": "text/plain"})
    assert get_encoding_from_headers(headers) == "ISO-8859-1"

def test_get_encoding_json_type():
    headers = CaseInsensitiveDict({"content-type": "application/json"})
    assert get_encoding_from_headers(headers) == "utf-8"

def test_get_encoding_with_single_quotes_charset():
    headers = CaseInsensitiveDict({"content-type": "text/html; charset='UTF-8'"})
    assert get_encoding_from_headers(headers) == "UTF-8"

def test_get_encoding_with_double_quotes_charset():
    headers = CaseInsensitiveDict({"content-type": "text/html; charset=\"UTF-8\""})
    assert get_encoding_from_headers(headers) == "UTF-8"

def test_get_encoding_with_unrelated_content_type():
    headers = CaseInsensitiveDict({"content-type": "application/octet-stream"})
    assert get_encoding_from_headers(headers) is None
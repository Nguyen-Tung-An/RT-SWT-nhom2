import pytest
from requests.utils import get_encoding_from_headers
from requests.structures import CaseInsensitiveDict

def test_get_encoding_no_content_type():
    headers = CaseInsensitiveDict()
    assert get_encoding_from_headers(headers) is None

def test_get_encoding_with_charset():
    headers = CaseInsensitiveDict({"content-type": "text/html; charset=UTF-8"})
    assert get_encoding_from_headers(headers) == "UTF-8"

def test_get_encoding_text():
    headers = CaseInsensitiveDict({"content-type": "text/plain"})
    assert get_encoding_from_headers(headers) == "ISO-8859-1"

def test_get_encoding_json():
    headers = CaseInsensitiveDict({"content-type": "application/json"})
    assert get_encoding_from_headers(headers) == "utf-8"

def test_get_encoding_with_extra_params():
    headers = CaseInsensitiveDict({"content-type": "application/json; charset=ISO-8859-1"})
    assert get_encoding_from_headers(headers) == "ISO-8859-1"

def test_get_encoding_with_single_quotes():
    headers = CaseInsensitiveDict({"content-type": "text/html; charset='UTF-8'"})
    assert get_encoding_from_headers(headers) == "UTF-8"

def test_get_encoding_with_double_quotes():
    headers = CaseInsensitiveDict({"content-type": 'text/html; charset="UTF-8"'})
    assert get_encoding_from_headers(headers) == "UTF-8"
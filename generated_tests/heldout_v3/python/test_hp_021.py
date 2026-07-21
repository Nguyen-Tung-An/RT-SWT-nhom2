import pytest
from requests.utils import get_encoding_from_headers

def test_get_encoding_from_headers_with_utf8():
    headers = {'Content-Type': 'text/html; charset=utf-8'}
    assert get_encoding_from_headers(headers) == 'utf-8'

def test_get_encoding_from_headers_with_iso88591():
    headers = {'Content-Type': 'text/html; charset=iso-8859-1'}
    assert get_encoding_from_headers(headers) == 'iso-8859-1'

def test_get_encoding_from_headers_with_multiple_charsets():
    headers = {'Content-Type': 'text/html; charset=utf-8, iso-8859-1'}
    assert get_encoding_from_headers(headers) == 'utf-8'

def test_get_encoding_from_headers_without_charset():
    headers = {'Content-Type': 'text/html'}
    assert get_encoding_from_headers(headers) is None

def test_get_encoding_from_headers_with_empty_headers():
    headers = {}
    assert get_encoding_from_headers(headers) is None

def test_get_encoding_from_headers_with_invalid_charset():
    headers = {'Content-Type': 'text/html; charset=invalid-charset'}
    assert get_encoding_from_headers(headers) is None

def test_get_encoding_from_headers_with_malformed_header():
    headers = {'Content-Type': 'text/html; charset='}
    assert get_encoding_from_headers(headers) is None

def test_get_encoding_from_headers_with_no_content_type():
    headers = {'Accept-Encoding': 'gzip, deflate'}
    assert get_encoding_from_headers(headers) is None
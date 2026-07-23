import pytest
from requests.models import Response
from requests.utils import get_unicode_from_response

def test_get_unicode_from_response_no_content():
    r = Response()
    r._content = None
    result = get_unicode_from_response(r)
    assert result is None

def test_get_unicode_from_response_with_valid_utf8():
    r = Response()
    r._content = b'Hello, world!'
    r.headers['Content-Type'] = 'text/plain; charset=utf-8'
    result = get_unicode_from_response(r)
    assert result == 'Hello, world!'

def test_get_unicode_from_response_with_invalid_utf8():
    r = Response()
    r._content = b'\x80\x81\x82'
    r.headers['Content-Type'] = 'text/plain; charset=utf-8'
    result = get_unicode_from_response(r)
    assert result == '�' * 3  # Replaced characters

def test_get_unicode_from_response_with_fallback_encoding():
    r = Response()
    r._content = b'\xe9'  # 'é' in bytes
    r.headers['Content-Type'] = 'text/plain; charset=iso-8859-1'
    result = get_unicode_from_response(r)
    assert result == 'é'

def test_get_unicode_from_response_with_no_charset():
    r = Response()
    r._content = b'Hello, world!'
    r.headers['Content-Type'] = 'text/plain'
    result = get_unicode_from_response(r)
    assert result == 'Hello, world!'

def test_get_unicode_from_response_with_type_error():
    r = Response()
    r._content = b'Hello, world!'
    r.headers['Content-Type'] = 'text/plain; charset=invalid-charset'
    result = get_unicode_from_response(r)
    assert result == 'Hello, world!'  # Fallback to utf-8

def test_get_unicode_from_response_with_bytes_return():
    r = Response()
    r._content = b'Hello, world!'
    r.headers['Content-Type'] = 'application/octet-stream'
    result = get_unicode_from_response(r)
    assert result == b'Hello, world!'
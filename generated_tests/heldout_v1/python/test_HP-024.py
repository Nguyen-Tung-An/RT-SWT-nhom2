import pytest
from requests.models import Response
from requests.utils import get_unicode_from_response

def test_get_unicode_from_response_none_content():
    r = Response()
    r._content = None
    assert get_unicode_from_response(r) is None

def test_get_unicode_from_response_valid_encoding():
    r = Response()
    r._content = b'Hello, World!'
    r.headers['Content-Type'] = 'text/plain; charset=utf-8'
    assert get_unicode_from_response(r) == 'Hello, World!'

def test_get_unicode_from_response_invalid_encoding():
    r = Response()
    r._content = b'\x80\x81\x82'
    r.headers['Content-Type'] = 'text/plain; charset=invalid-encoding'
    assert get_unicode_from_response(r) == '�' * 3  # Replaced characters

def test_get_unicode_from_response_fallback_encoding():
    r = Response()
    r._content = b'\x80\x81\x82'
    r.headers['Content-Type'] = 'text/plain'
    assert get_unicode_from_response(r) == '�' * 3  # Replaced characters

def test_get_unicode_from_response_type_error():
    r = Response()
    r._content = b'Hello, World!'
    r.headers['Content-Type'] = 'text/plain; charset=ascii'
    assert get_unicode_from_response(r) == 'Hello, World!'

def test_get_unicode_from_response_no_content_type():
    r = Response()
    r._content = b'Hello, World!'
    del r.headers['Content-Type']
    assert get_unicode_from_response(r) == 'Hello, World!'
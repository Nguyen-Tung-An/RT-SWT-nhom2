import pytest
from requests.models import Response
from requests.utils import get_unicode_from_response

def test_get_unicode_from_response_none_content():
    r = Response()
    r._content = None
    assert get_unicode_from_response(r) is None

def test_get_unicode_from_response_valid_encoding():
    r = Response()
    r._content = b'Hello, world!'
    r.headers['Content-Type'] = 'text/plain; charset=utf-8'
    assert get_unicode_from_response(r) == 'Hello, world!'

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
    r._content = b'\x80\x81\x82'
    r.headers['Content-Type'] = 'text/plain; charset=utf-8'
    # Simulate a TypeError by setting content to a non-bytes type
    r._content = 'not bytes'
    assert get_unicode_from_response(r) == 'not bytes'
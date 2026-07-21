import pytest
from requests.models import Response
from requests.utils import get_unicode_from_response

def test_get_unicode_from_response_no_content():
    r = Response()
    r._content = None
    assert get_unicode_from_response(r) is None

def test_get_unicode_from_response_valid_utf8():
    r = Response()
    r._content = b'Hello, world!'
    r.headers['Content-Type'] = 'text/plain; charset=utf-8'
    assert get_unicode_from_response(r) == 'Hello, world!'

def test_get_unicode_from_response_invalid_utf8():
    r = Response()
    r._content = b'\x80\x81\x82'
    r.headers['Content-Type'] = 'text/plain; charset=utf-8'
    result = get_unicode_from_response(r)
    assert isinstance(result, str)
    assert '�' in result  # Check for replacement character

def test_get_unicode_from_response_fallback_to_utf8():
    r = Response()
    r._content = b'\x80\x81\x82'
    r.headers['Content-Type'] = 'text/plain'
    result = get_unicode_from_response(r)
    assert isinstance(result, str)
    assert '�' in result  # Check for replacement character

def test_get_unicode_from_response_type_error():
    r = Response()
    r._content = b'\x80\x81\x82'
    r.headers['Content-Type'] = 'text/plain; charset=invalid-charset'
    result = get_unicode_from_response(r)
    assert isinstance(result, str)
    assert '�' in result  # Check for replacement character

def test_get_unicode_from_response_no_charset():
    r = Response()
    r._content = b'Hello, world!'
    r.headers['Content-Type'] = 'text/plain'
    assert get_unicode_from_response(r) == 'Hello, world!'
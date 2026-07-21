import pytest
from requests.models import Response
from requests.utils import stream_decode_response_unicode

def test_stream_decode_response_unicode_no_encoding():
    response = Response()
    response.encoding = None
    iterator = [b'Hello, ', b'world!']
    result = list(stream_decode_response_unicode(iterator, response))
    assert result == [b'Hello, ', b'world!']

def test_stream_decode_response_unicode_with_encoding():
    response = Response()
    response.encoding = 'utf-8'
    iterator = [b'Hello, ', b'world!']
    result = list(stream_decode_response_unicode(iterator, response))
    assert result == ['Hello, ', 'world!']

def test_stream_decode_response_unicode_with_partial_chunk():
    response = Response()
    response.encoding = 'utf-8'
    iterator = [b'Hello, ', b'world', b'!']
    result = list(stream_decode_response_unicode(iterator, response))
    assert result == ['Hello, ', 'world', '!']

def test_stream_decode_response_unicode_with_empty_iterator():
    response = Response()
    response.encoding = 'utf-8'
    iterator = []
    result = list(stream_decode_response_unicode(iterator, response))
    assert result == []

def test_stream_decode_response_unicode_with_invalid_bytes():
    response = Response()
    response.encoding = 'utf-8'
    iterator = [b'Hello, ', b'\xff', b'world!']
    result = list(stream_decode_response_unicode(iterator, response))
    assert result == ['Hello, ', '�', 'world!']
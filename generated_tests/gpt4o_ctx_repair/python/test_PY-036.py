import pytest
from requests.models import Response
from requests.exceptions import ChunkedEncodingError, ContentDecodingError, RequestException
from ssl import SSLError

class ProtocolError(Exception):
    pass

def test_iter_content_stream():
    response = Response()
    response.raw = type('Raw', (), {'stream': lambda chunk_size, decode_content: iter([b'chunk1', b'chunk2'])})()
    chunks = list(response.iter_content(chunk_size=5))
    assert chunks == [b'chunk1', b'chunk2']

def test_iter_content_no_stream():
    response = Response()
    response.raw = type('Raw', (), {'read': lambda chunk_size: b'chunk1' if chunk_size > 0 else b''})()
    chunks = list(response.iter_content(chunk_size=5))
    assert chunks == [b'chunk1']

def test_iter_content_empty():
    response = Response()
    response.raw = type('Raw', (), {'read': lambda chunk_size: b''})()
    chunks = list(response.iter_content(chunk_size=5))
    assert chunks == []

def test_iter_content_protocol_error():
    response = Response()
    response.raw = type('Raw', (), {'stream': lambda chunk_size, decode_content: (_ for _ in ()).throw(ProtocolError)})()
    with pytest.raises(ChunkedEncodingError):
        list(response.iter_content(chunk_size=5))

def test_iter_content_decode_error():
    response = Response()
    response.raw = type('Raw', (), {'stream': lambda chunk_size, decode_content: (_ for _ in ()).throw(ContentDecodingError)})()
    with pytest.raises(ContentDecodingError):
        list(response.iter_content(chunk_size=5))

def test_iter_content_read_timeout_error():
    response = Response()
    response.raw = type('Raw', (), {'read': lambda chunk_size: (_ for _ in ()).throw(RequestException)})()
    with pytest.raises(RequestException):
        list(response.iter_content(chunk_size=5))

def test_iter_content_ssl_error():
    response = Response()
    response.raw = type('Raw', (), {'read': lambda chunk_size: (_ for _ in ()).throw(SSLError)})()
    with pytest.raises(SSLError):
        list(response.iter_content(chunk_size=5))
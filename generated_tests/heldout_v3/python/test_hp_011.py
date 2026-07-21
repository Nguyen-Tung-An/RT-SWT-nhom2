import pytest
import codecs
from requests.models import Response
from requests.utils import stream_decode_response_unicode

class TestStreamDecodeResponseUnicode:

    def test_no_encoding(self):
        iterator = [b'Hello, ', b'world!']
        response = Response()
        response.encoding = None
        result = list(stream_decode_response_unicode(iterator, response))
        assert result == [b'Hello, ', b'world!']

    def test_with_encoding(self):
        iterator = [b'Hello, ', b'world!']
        response = Response()
        response.encoding = 'utf-8'
        result = list(stream_decode_response_unicode(iterator, response))
        assert result == ['Hello, ', 'world!']

    def test_partial_utf8(self):
        iterator = [b'Hello, ', b'\xe2\x9c', b'\x94 world!']
        response = Response()
        response.encoding = 'utf-8'
        result = list(stream_decode_response_unicode(iterator, response))
        assert result == ['Hello, ', '✓ world!']

    def test_empty_iterator(self):
        iterator = []
        response = Response()
        response.encoding = 'utf-8'
        result = list(stream_decode_response_unicode(iterator, response))
        assert result == []

    def test_invalid_bytes(self):
        iterator = [b'Hello, ', b'\x80\x81', b'world!']
        response = Response()
        response.encoding = 'utf-8'
        result = list(stream_decode_response_unicode(iterator, response))
        assert result == ['Hello, ', '�world!']

    def test_final_chunk_empty(self):
        iterator = [b'Hello, ', b'world!', b'']
        response = Response()
        response.encoding = 'utf-8'
        result = list(stream_decode_response_unicode(iterator, response))
        assert result == ['Hello, ', 'world!']

    def test_final_chunk_non_empty(self):
        iterator = [b'Hello, ', b'world!', b'\xe2\x9c']
        response = Response()
        response.encoding = 'utf-8'
        result = list(stream_decode_response_unicode(iterator, response))
        assert result == ['Hello, ', 'world!', '✓']
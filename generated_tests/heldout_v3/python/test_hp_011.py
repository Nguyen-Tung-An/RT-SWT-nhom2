import pytest
from requests.utils import stream_decode_response_unicode

class TestStreamDecodeResponseUnicode:
    
    def test_empty_iterator(self):
        result = stream_decode_response_unicode(iter([]), 'utf-8')
        assert result == ''

    def test_single_element_iterator(self):
        result = stream_decode_response_unicode(iter([b'Hello, ']), 'utf-8')
        assert result == 'Hello, '

    def test_multiple_elements_iterator(self):
        result = stream_decode_response_unicode(iter([b'Hello, ', b'world!']), 'utf-8')
        assert result == 'Hello, world!'

    def test_non_utf8_bytes(self):
        with pytest.raises(UnicodeDecodeError):
            stream_decode_response_unicode(iter([b'\x80']), 'utf-8')

    def test_invalid_encoding(self):
        with pytest.raises(LookupError):
            stream_decode_response_unicode(iter([b'Hello, ']), 'invalid-encoding')

    def test_boundary_condition(self):
        result = stream_decode_response_unicode(iter([b'']), 'utf-8')
        assert result == ''

    def test_large_input(self):
        large_input = (b'Hello, ' * 1000)
        result = stream_decode_response_unicode(iter([large_input]), 'utf-8')
        assert result == 'Hello, ' * 1000
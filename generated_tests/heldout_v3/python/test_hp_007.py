import pytest
from requests.models import Response

class TestResponseIterContent:
    def test_iter_content_default_chunk_size(self):
        response = Response()
        response._content = b'This is a test content for iter_content method.'
        result = list(response.iter_content())
        assert result == [b'This is a test content for iter_content method.']

    def test_iter_content_custom_chunk_size(self):
        response = Response()
        response._content = b'This is a test content for iter_content method.'
        result = list(response.iter_content(chunk_size=10))
        assert result == [b'This is a ', b'test conte', b'nt for it', b'er_conten', b't method.']

    def test_iter_content_empty_content(self):
        response = Response()
        response._content = b''
        result = list(response.iter_content())
        assert result == []

    def test_iter_content_decode_unicode(self):
        response = Response()
        response._content = b'This is a test content for iter_content method.'
        result = list(response.iter_content(decode_unicode=True))
        assert result == ['This is a test content for iter_content method.']

    def test_iter_content_with_large_content(self):
        response = Response()
        response._content = b'A' * 1000  # 1000 bytes of 'A'
        result = list(response.iter_content(chunk_size=256))
        assert result == [b'A' * 256] * 3 + [b'A' * 232]

    def test_iter_content_with_non_bytes_content(self):
        response = Response()
        response._content = 'This is a string, not bytes.'
        with pytest.raises(TypeError):
            list(response.iter_content())
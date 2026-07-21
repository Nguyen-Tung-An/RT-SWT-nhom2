import pytest
from requests.models import Response
from requests.exceptions import StreamConsumedError

class TestResponseIterContent:
    def setup_method(self):
        self.response = Response()
        self.response._content = b'This is a test content for iter_content method.'
        self.response._content_consumed = False
        self.response.raw = self.response

    def test_iter_content_default_chunk_size(self):
        chunks = list(self.response.iter_content())
        assert chunks == [b'This is a test content for iter_content method.']

    def test_iter_content_custom_chunk_size(self):
        chunks = list(self.response.iter_content(chunk_size=10))
        assert chunks == [b'This is a ', b'test conte', b'nt for ite', b'r_content ', b'method.']

    def test_iter_content_none_chunk_size(self):
        chunks = list(self.response.iter_content(chunk_size=None))
        assert chunks == [b'This is a test content for iter_content method.']

    def test_iter_content_decode_unicode(self):
        self.response._content = b'This is a test content for iter_content method.'
        chunks = list(self.response.iter_content(decode_unicode=True))
        assert chunks == ['This is a test content for iter_content method.']

    def test_iter_content_stream_consumed_error(self):
        self.response._content_consumed = True
        with pytest.raises(StreamConsumedError):
            list(self.response.iter_content())

    def test_iter_content_invalid_chunk_size_type(self):
        with pytest.raises(TypeError):
            list(self.response.iter_content(chunk_size='invalid'))

    def test_iter_content_empty_content(self):
        self.response._content = b''
        chunks = list(self.response.iter_content())
        assert chunks == []
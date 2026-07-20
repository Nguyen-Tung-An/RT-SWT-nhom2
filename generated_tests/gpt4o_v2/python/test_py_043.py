import pytest
from requests.models import Response

class TestResponseIterLines:
    @pytest.fixture
    def response(self):
        # Mocking a Response object with a specific content
        response = Response()
        response._content = b"line1\nline2\nline3\n"
        response._iter_content = lambda chunk_size, decode_unicode: (response._content[i:i + chunk_size] for i in range(0, len(response._content), chunk_size))
        return response

    def test_iter_lines_default(self, response):
        lines = list(response.iter_lines())
        assert lines == [b'line1', b'line2', b'line3']

    def test_iter_lines_with_chunk_size(self, response):
        lines = list(response.iter_lines(chunk_size=10))
        assert lines == [b'line1', b'line2', b'line3']

    def test_iter_lines_with_delimiter(self, response):
        lines = list(response.iter_lines(delimiter=b'\n'))
        assert lines == [b'line1', b'line2', b'line3']

    def test_iter_lines_with_pending(self, response):
        response._content = b"line1\nline2\nline3\nline4\n"
        lines = list(response.iter_lines(delimiter=b'\n'))
        assert lines == [b'line1', b'line2', b'line3', b'line4']

    def test_iter_lines_with_empty_response(self):
        response = Response()
        response._content = b""
        response._iter_content = lambda chunk_size, decode_unicode: (response._content[i:i + chunk_size] for i in range(0, len(response._content), chunk_size))
        lines = list(response.iter_lines())
        assert lines == []

    def test_iter_lines_with_non_utf8(self):
        response = Response()
        response._content = b"line1\nline2\nline3\n"
        response._iter_content = lambda chunk_size, decode_unicode: (response._content[i:i + chunk_size] for i in range(0, len(response._content), chunk_size))
        lines = list(response.iter_lines(decode_unicode=True))
        assert lines == [b'line1', b'line2', b'line3']

    def test_iter_lines_with_pending_last_line(self):
        response = Response()
        response._content = b"line1\nline2\nline3"
        response._iter_content = lambda chunk_size, decode_unicode: (response._content[i:i + chunk_size] for i in range(0, len(response._content), chunk_size))
        lines = list(response.iter_lines(delimiter=b'\n'))
        assert lines == [b'line1', b'line2', b'line3']

    def test_iter_lines_with_custom_delimiter(self, response):
        response._content = b"line1|line2|line3|"
        response._iter_content = lambda chunk_size, decode_unicode: (response._content[i:i + chunk_size] for i in range(0, len(response._content), chunk_size))
        lines = list(response.iter_lines(delimiter=b'|'))
        assert lines == [b'line1', b'line2', b'line3', b'']
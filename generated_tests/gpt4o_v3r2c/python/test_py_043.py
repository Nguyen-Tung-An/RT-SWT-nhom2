import pytest
from requests.models import Response

class TestResponseIterLines:
    def test_iter_lines_default(self):
        response = Response()
        response._content = b"line1\nline2\nline3\n"
        lines = list(response.iter_lines())
        assert lines == [b'line1', b'line2', b'line3']

    def test_iter_lines_with_chunk_size(self):
        response = Response()
        response._content = b"line1\nline2\nline3\n"
        lines = list(response.iter_lines(chunk_size=6))
        assert lines == [b'line1', b'line2', b'line3']

    def test_iter_lines_with_delimiter(self):
        response = Response()
        response._content = b"line1;line2;line3;"
        lines = list(response.iter_lines(delimiter=b';'))
        assert lines == [b'line1', b'line2', b'line3', b'']

    def test_iter_lines_with_pending(self):
        response = Response()
        response._content = b"line1\nline2\nline3\nline4\n"
        lines = list(response.iter_lines(chunk_size=10))
        assert lines == [b'line1', b'line2', b'line3', b'line4']

    def test_iter_lines_empty_content(self):
        response = Response()
        response._content = b""
        lines = list(response.iter_lines())
        assert lines == []

    def test_iter_lines_with_unicode(self):
        response = Response()
        response._content = b"line1\nline2\n"
        lines = list(response.iter_lines(decode_unicode=True))
        assert lines == ['line1', 'line2']

    def test_iter_lines_with_non_utf8_bytes(self):
        response = Response()
        response._content = b'\xff\xfe\xfd\nline2\n'
        lines = list(response.iter_lines(decode_unicode=True))
        assert lines == ['\ufffd', 'line2']
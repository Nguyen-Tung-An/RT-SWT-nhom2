import pytest
from requests.models import Response

@pytest.fixture
def response():
    return Response()

def test_iter_lines_default(response):
    response._content = b"line1\nline2\nline3\n"
    lines = list(response.iter_lines())
    assert lines == [b'line1', b'line2', b'line3']

def test_iter_lines_with_chunk_size(response):
    response._content = b"line1\nline2\nline3\n"
    lines = list(response.iter_lines(chunk_size=6))
    assert lines == [b'line1', b'line2', b'line3']

def test_iter_lines_with_delimiter(response):
    response._content = b"line1;line2;line3;"
    lines = list(response.iter_lines(delimiter=b';'))
    assert lines == [b'line1', b'line2', b'line3', b'']

def test_iter_lines_with_pending(response):
    response._content = b"line1\nline2\nline3\nline4\n"
    lines = list(response.iter_lines())
    assert lines == [b'line1', b'line2', b'line3', b'line4']

def test_iter_lines_empty(response):
    response._content = b""
    lines = list(response.iter_lines())
    assert lines == []

def test_iter_lines_with_unicode(response):
    response._content = "line1\nline2\nline3\n".encode('utf-8')
    lines = list(response.iter_lines(decode_unicode=True))
    assert lines == ['line1', 'line2', 'line3']
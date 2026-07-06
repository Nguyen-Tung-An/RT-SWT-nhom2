import pytest
from requests.models import Response

@pytest.fixture
def mock_response():
    response = Response()
    response._content = b"line1\nline2\nline3\n"
    response._iter_content = lambda chunk_size, decode_unicode: (response._content[i:i + chunk_size] for i in range(0, len(response._content), chunk_size))
    return response

def test_iter_lines_default(mock_response):
    lines = list(mock_response.iter_lines())
    assert lines == [b'line1', b'line2', b'line3']

def test_iter_lines_with_delimiter(mock_response):
    lines = list(mock_response.iter_lines(delimiter=b'\n'))
    assert lines == [b'line1', b'line2', b'line3']

def test_iter_lines_with_pending(mock_response):
    response = Response()
    response._content = b"line1\nline2\nline3\nline4\n"
    response._iter_content = lambda chunk_size, decode_unicode: (response._content[i:i + chunk_size] for i in range(0, len(response._content), chunk_size))
    lines = list(response.iter_lines(chunk_size=10))
    assert lines == [b'line1', b'line2', b'line3', b'line4']

def test_iter_lines_empty(mock_response):
    response = Response()
    response._content = b""
    response._iter_content = lambda chunk_size, decode_unicode: (response._content[i:i + chunk_size] for i in range(0, len(response._content), chunk_size))
    lines = list(response.iter_lines())
    assert lines == []

def test_iter_lines_with_unicode(mock_response):
    response = Response()
    response._content = b"line1\nline2\n"
    response._iter_content = lambda chunk_size, decode_unicode: (response._content[i:i + chunk_size] for i in range(0, len(response._content), chunk_size))
    lines = list(response.iter_lines(decode_unicode=True))
    assert lines == [b'line1', b'line2']
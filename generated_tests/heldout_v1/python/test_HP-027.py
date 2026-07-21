import pytest
from requests.models import Response

def test_content_not_consumed():
    response = Response()
    response.status_code = 200
    response._content_consumed = False
    response._content = False
    response.raw = b"Hello, World!"
    response.iter_content = lambda chunk_size: [b"Hello, ", b"World!"]
    
    assert response.content == b"Hello, World!"

def test_content_already_consumed():
    response = Response()
    response.status_code = 200
    response._content_consumed = True
    response._content = b"Hello, World!"
    
    with pytest.raises(RuntimeError, match="The content for this response was already consumed"):
        _ = response.content

def test_content_status_code_zero():
    response = Response()
    response.status_code = 0
    response._content_consumed = False
    response.raw = None
    
    assert response.content is None

def test_content_raw_none():
    response = Response()
    response.status_code = 200
    response._content_consumed = False
    response.raw = None
    
    assert response.content is None
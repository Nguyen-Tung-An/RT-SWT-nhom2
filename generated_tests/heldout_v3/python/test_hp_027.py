import pytest
from requests.models import Response

class TestResponseContent:
    def test_content_not_consumed(self):
        response = Response()
        response._content = False
        response.status_code = 200
        response.raw = b"data"
        response._content_consumed = False
        response.iter_content = lambda chunk_size: [b"data"]
        
        result = response.content()
        
        assert result == b"data"
        assert response._content_consumed is True

    def test_content_already_consumed(self):
        response = Response()
        response._content = False
        response.status_code = 200
        response.raw = b"data"
        response._content_consumed = True
        
        with pytest.raises(RuntimeError, match="The content for this response was already consumed"):
            response.content()

    def test_content_status_code_zero(self):
        response = Response()
        response._content = False
        response.status_code = 0
        response.raw = None
        response._content_consumed = False
        
        result = response.content()
        
        assert result is None
        assert response._content_consumed is True

    def test_content_raw_none(self):
        response = Response()
        response._content = False
        response.status_code = 200
        response.raw = None
        response._content_consumed = False
        
        result = response.content()
        
        assert result is None
        assert response._content_consumed is True

    def test_content_empty_iter_content(self):
        response = Response()
        response._content = False
        response.status_code = 200
        response.raw = b"data"
        response._content_consumed = False
        response.iter_content = lambda chunk_size: []
        
        result = response.content()
        
        assert result == b""
        assert response._content_consumed is True
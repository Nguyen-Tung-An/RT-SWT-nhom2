import pytest
from requests.models import Response

class TestResponseContent:
    def test_content_empty(self):
        response = Response()
        response._content = b''  # Simulate an empty response body
        assert response.content == b''

    def test_content_text(self):
        response = Response()
        response._content = b'Test content'
        assert response.content == b'Test content'

    def test_content_binary(self):
        response = Response()
        response._content = b'\x00\x01\x02\x03'  # Simulate binary data
        assert response.content == b'\x00\x01\x02\x03'

    def test_content_large(self):
        response = Response()
        response._content = b'A' * (10**6)  # Simulate a large response body
        assert response.content == b'A' * (10**6)

    def test_content_after_modification(self):
        response = Response()
        response._content = b'Initial content'
        assert response.content == b'Initial content'
        response._content = b'Modified content'
        assert response.content == b'Modified content'
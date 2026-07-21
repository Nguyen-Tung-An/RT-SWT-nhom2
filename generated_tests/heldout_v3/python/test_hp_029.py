import pytest
from requests.models import Response

class TestResponseText:
    def test_text_empty_content(self):
        response = Response()
        response._content = b''  # Simulate empty content
        assert response.text() == ""

    def test_text_with_content_and_encoding(self):
        response = Response()
        response._content = b'Hello, World!'
        response.encoding = 'utf-8'
        assert response.text() == "Hello, World!"

    def test_text_with_content_no_encoding(self):
        response = Response()
        response._content = b'Hello, World!'
        response.encoding = None
        response.apparent_encoding = 'utf-8'
        assert response.text() == "Hello, World!"

    def test_text_with_invalid_encoding(self):
        response = Response()
        response._content = b'Hello, World!'
        response.encoding = 'invalid-encoding'
        response.apparent_encoding = 'utf-8'
        assert response.text() == "Hello, World!"  # Should fallback to utf-8

    def test_text_with_none_content(self):
        response = Response()
        response._content = None  # Simulate None content
        assert response.text() == ""

    def test_text_with_content_and_fallback_encoding(self):
        response = Response()
        response._content = b'\xff\xfeH\x00e\x00l\x00l\x00o\x00'  # UTF-16 encoded content
        response.encoding = None
        response.apparent_encoding = 'utf-16'
        assert response.text() == "Hello"  # Should decode using apparent_encoding
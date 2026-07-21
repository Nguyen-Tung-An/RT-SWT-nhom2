import pytest
from requests.utils import get_unicode_from_response
import requests

def create_response(content, encoding=None):
    response = requests.Response()
    response._content = content.encode('utf-8')
    response.encoding = encoding
    return response

class TestGetUnicodeFromResponse:

    def test_utf8_encoding(self):
        response = create_response("Hello, World!", encoding='utf-8')
        result = get_unicode_from_response(response)
        assert result == "Hello, World!"

    def test_ascii_encoding(self):
        response = create_response("Hello, World!", encoding='ascii')
        result = get_unicode_from_response(response)
        assert result == "Hello, World!"

    def test_invalid_encoding(self):
        response = create_response("Hello, World!", encoding='invalid-encoding')
        result = get_unicode_from_response(response)
        assert result == "Hello, World!"  # Fallback to utf-8

    def test_no_encoding(self):
        response = create_response("Hello, World!")
        result = get_unicode_from_response(response)
        assert result == "Hello, World!"  # Default to utf-8

    def test_empty_content(self):
        response = create_response("", encoding='utf-8')
        result = get_unicode_from_response(response)
        assert result == ""  # Should return empty string

    def test_none_response(self):
        with pytest.raises(TypeError):
            get_unicode_from_response(None)

    def test_binary_content(self):
        response = create_response(b'\x80\x81\x82', encoding='utf-8')
        result = get_unicode_from_response(response)
        assert result == b'\x80\x81\x82'.decode('utf-8', errors='replace')  # Handle binary data
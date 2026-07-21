import pytest
from requests.models import Response

def test_text_empty_content():
    response = Response()
    response._content = b''
    assert response.text == ""

def test_text_with_content_and_encoding():
    response = Response()
    response._content = b'Hello, World!'
    response.encoding = 'utf-8'
    assert response.text == "Hello, World!"

def test_text_with_content_no_encoding():
    response = Response()
    response._content = b'Hello, World!'
    response.encoding = None
    assert response.text == "Hello, World!"

def test_text_with_invalid_encoding():
    response = Response()
    response._content = b'Hello, World!'
    response.encoding = 'invalid-encoding'
    assert response.text == "Hello, World!"  # Should fallback to utf-8

def test_text_with_none_content():
    response = Response()
    response._content = None
    assert response.text == ""

def test_text_with_apparent_encoding():
    response = Response()
    response._content = b'Hello, World!'
    response.encoding = None
    response.apparent_encoding = 'utf-8'
    assert response.text == "Hello, World!"
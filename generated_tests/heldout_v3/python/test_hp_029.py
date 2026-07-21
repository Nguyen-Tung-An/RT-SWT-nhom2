import pytest
from requests.models import Response

class TestResponseText:
    def test_text_empty_response(self):
        response = Response()
        response._content = b''  # Simulate an empty response body
        assert response.text == ''

    def test_text_non_empty_response(self):
        response = Response()
        response._content = b'Hello, World!'  # Simulate a non-empty response body
        assert response.text == 'Hello, World!'

    def test_text_with_unicode(self):
        response = Response()
        response._content = 'こんにちは'.encode('utf-8')  # Simulate a response with unicode
        assert response.text == 'こんにちは'

    def test_text_with_special_characters(self):
        response = Response()
        response._content = b'Hello, \nWorld!\tThis is a test.'  # Simulate special characters
        assert response.text == 'Hello, \nWorld!\tThis is a test.'

    def test_text_with_large_content(self):
        response = Response()
        response._content = b'A' * (10**6)  # Simulate a large response body
        assert response.text == 'A' * (10**6)

    def test_text_with_non_utf8_bytes(self):
        response = Response()
        response._content = b'\x80\x81\x82'  # Simulate non-UTF-8 bytes
        assert response.text == '\ufffd\ufffd\ufffd'  # Expect replacement characters

    def test_text_after_content_type_set(self):
        response = Response()
        response._content = b'Content-Type: text/plain\n\nHello'
        response.headers['Content-Type'] = 'text/plain'
        assert response.text == 'Content-Type: text/plain\n\nHello'
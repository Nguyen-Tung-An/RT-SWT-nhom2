import pytest
from requests.models import Response
import json as complexjson
from requests.exceptions import JSONDecodeError

def test_json_valid_response():
    response = Response()
    response._content = b'{"key": "value"}'
    response.encoding = None
    assert response.json() == {"key": "value"}

def test_json_valid_response_with_encoding():
    response = Response()
    response._content = b'{"key": "value"}'
    response.encoding = 'utf-8'
    assert response.json() == {"key": "value"}

def test_json_invalid_json():
    response = Response()
    response._content = b'{"key": "value"'
    response.encoding = None
    with pytest.raises(JSONDecodeError):
        response.json()

def test_json_empty_content():
    response = Response()
    response._content = b''
    response.encoding = None
    with pytest.raises(JSONDecodeError):
        response.json()

def test_json_no_encoding_and_content():
    response = Response()
    response._content = b'{"key": "value"}'
    response.encoding = ''
    assert response.json() == {"key": "value"}

def test_json_unicode_decode_error():
    response = Response()
    response._content = b'\xff\xfe{"key": "value"}'  # Invalid UTF-8
    response.encoding = None
    with pytest.raises(JSONDecodeError):
        response.json()
import pytest
from requests.models import Response
import json as complexjson
from requests.exceptions import JSONDecodeError

@pytest.fixture
def response_with_valid_json():
    response = Response()
    response._content = b'{"key": "value"}'
    response.encoding = 'utf-8'
    return response

@pytest.fixture
def response_with_invalid_json():
    response = Response()
    response._content = b'invalid json'
    response.encoding = 'utf-8'
    return response

@pytest.fixture
def response_with_no_encoding():
    response = Response()
    response._content = b'{"key": "value"}'
    response.encoding = None
    return response

def test_json_valid(response_with_valid_json):
    assert response_with_valid_json.json() == {"key": "value"}

def test_json_invalid(response_with_invalid_json):
    with pytest.raises(JSONDecodeError):
        response_with_invalid_json.json()

def test_json_no_encoding(response_with_no_encoding):
    assert response_with_no_encoding.json() == {"key": "value"}

def test_json_unicode_decode_error(response_with_invalid_json):
    response_with_invalid_json._content = b'\xff\xfe{"key": "value"}'  # Invalid UTF-16
    with pytest.raises(JSONDecodeError):
        response_with_invalid_json.json()
import pytest
from requests.models import Response
import json

def test_json_valid_dict():
    response = Response()
    response._content = b'{"key": "value"}'
    assert response.json() == {"key": "value"}

def test_json_valid_list():
    response = Response()
    response._content = b'[1, 2, 3]'
    assert response.json() == [1, 2, 3]

def test_json_invalid_json():
    response = Response()
    response._content = b'{"key": "value"'
    with pytest.raises(json.JSONDecodeError):
        response.json()

def test_json_empty_content():
    response = Response()
    response._content = b''
    with pytest.raises(json.JSONDecodeError):
        response.json()

def test_json_no_encoding():
    response = Response()
    response._content = b'{"key": "value"}'
    response.encoding = None
    assert response.json() == {"key": "value"}

def test_json_with_invalid_encoding():
    response = Response()
    response._content = b'\xff\xfe{"key": "value"}'  # Invalid UTF-8
    response.encoding = None
    with pytest.raises(json.JSONDecodeError):
        response.json()

def test_json_with_kwargs():
    response = Response()
    response._content = b'{"key": "value"}'
    assert response.json(object_pairs_hook=dict) == {"key": "value"}
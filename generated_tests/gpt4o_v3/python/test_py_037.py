import pytest
from requests.models import Response
import json as complexjson
from requests.exceptions import JSONDecodeError

class TestResponseJson:
    def test_json_valid_dict(self):
        response = Response()
        response._content = b'{"key": "value"}'
        response.encoding = 'utf-8'
        assert response.json() == {"key": "value"}

    def test_json_valid_list(self):
        response = Response()
        response._content = b'[1, 2, 3]'
        response.encoding = 'utf-8'
        assert response.json() == [1, 2, 3]

    def test_json_invalid_json(self):
        response = Response()
        response._content = b'invalid json'
        response.encoding = 'utf-8'
        with pytest.raises(JSONDecodeError):
            response.json()

    def test_json_no_encoding_with_valid_utf8(self):
        response = Response()
        response._content = b'{"key": "value"}'
        response.encoding = None
        assert response.json() == {"key": "value"}

    def test_json_no_encoding_with_invalid_utf8(self):
        response = Response()
        response._content = b'\xff\xfe\xfd'  # Invalid UTF-8
        response.encoding = None
        with pytest.raises(JSONDecodeError):
            response.json()

    def test_json_empty_content(self):
        response = Response()
        response._content = b''
        response.encoding = 'utf-8'
        with pytest.raises(JSONDecodeError):
            response.json()

    def test_json_content_length_less_than_4(self):
        response = Response()
        response._content = b'{}'  # Length is 2
        response.encoding = None
        assert response.json() == {}

    def test_json_with_kwargs(self):
        response = Response()
        response._content = b'{"key": "value"}'
        response.encoding = 'utf-8'
        assert response.json(object_hook=lambda d: {k: v.upper() for k, v in d.items()}) == {"KEY": "VALUE"}
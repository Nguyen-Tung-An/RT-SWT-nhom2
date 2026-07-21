import pytest
from requests.models import PreparedRequest

class TestPrepareContentLength:
    def test_empty_body(self):
        req = PreparedRequest()
        result = req.prepare_content_length('')
        assert result == 0

    def test_none_body(self):
        req = PreparedRequest()
        result = req.prepare_content_length(None)
        assert result == 0

    def test_string_body(self):
        req = PreparedRequest()
        result = req.prepare_content_length('Hello, World!')
        assert result == 13

    def test_bytes_body(self):
        req = PreparedRequest()
        result = req.prepare_content_length(b'Hello, World!')
        assert result == 13

    def test_large_string_body(self):
        req = PreparedRequest()
        large_body = 'A' * 10000
        result = req.prepare_content_length(large_body)
        assert result == 10000

    def test_large_bytes_body(self):
        req = PreparedRequest()
        large_body = b'A' * 10000
        result = req.prepare_content_length(large_body)
        assert result == 10000

    def test_integer_body(self):
        req = PreparedRequest()
        with pytest.raises(TypeError):
            req.prepare_content_length(123)

    def test_float_body(self):
        req = PreparedRequest()
        with pytest.raises(TypeError):
            req.prepare_content_length(123.45)

    def test_dict_body(self):
        req = PreparedRequest()
        with pytest.raises(TypeError):
            req.prepare_content_length({'key': 'value'})

    def test_list_body(self):
        req = PreparedRequest()
        with pytest.raises(TypeError):
            req.prepare_content_length(['item1', 'item2'])
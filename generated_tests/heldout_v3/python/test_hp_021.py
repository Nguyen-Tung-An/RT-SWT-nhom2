import pytest
from requests.utils import get_encoding_from_headers
from collections import CaseInsensitiveDict

class TestGetEncodingFromHeaders:

    def test_no_content_type(self):
        headers = CaseInsensitiveDict()
        assert get_encoding_from_headers(headers) is None

    def test_content_type_without_charset(self):
        headers = CaseInsensitiveDict({"content-type": "text/html"})
        assert get_encoding_from_headers(headers) == "ISO-8859-1"

    def test_content_type_with_charset(self):
        headers = CaseInsensitiveDict({"content-type": "text/html; charset=UTF-8"})
        assert get_encoding_from_headers(headers) == "UTF-8"

    def test_application_json_without_charset(self):
        headers = CaseInsensitiveDict({"content-type": "application/json"})
        assert get_encoding_from_headers(headers) == "utf-8"

    def test_application_json_with_charset(self):
        headers = CaseInsensitiveDict({"content-type": "application/json; charset=ISO-8859-1"})
        assert get_encoding_from_headers(headers) == "ISO-8859-1"

    def test_content_type_with_extra_parameters(self):
        headers = CaseInsensitiveDict({"content-type": "text/plain; charset='UTF-16'; other_param=value"})
        assert get_encoding_from_headers(headers) == "UTF-16"

    def test_content_type_with_empty_charset(self):
        headers = CaseInsensitiveDict({"content-type": "text/plain; charset="})
        assert get_encoding_from_headers(headers) is None
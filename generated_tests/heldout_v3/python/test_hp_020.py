import pytest
from requests.models import PreparedRequest

class TestPreparedRequest:
    def test_prepare_content_length_with_non_empty_body(self):
        req = PreparedRequest()
        req.method = "POST"
        req.headers = {}
        body = "test body"
        req.prepare_content_length(body)
        assert req.headers["Content-Length"] == "9"

    def test_prepare_content_length_with_empty_body(self):
        req = PreparedRequest()
        req.method = "POST"
        req.headers = {}
        body = ""
        req.prepare_content_length(body)
        assert "Content-Length" not in req.headers

    def test_prepare_content_length_with_none_body_for_post(self):
        req = PreparedRequest()
        req.method = "POST"
        req.headers = {}
        body = None
        req.prepare_content_length(body)
        assert req.headers["Content-Length"] == "0"

    def test_prepare_content_length_with_none_body_for_get(self):
        req = PreparedRequest()
        req.method = "GET"
        req.headers = {}
        body = None
        req.prepare_content_length(body)
        assert "Content-Length" not in req.headers

    def test_prepare_content_length_with_none_body_for_head(self):
        req = PreparedRequest()
        req.method = "HEAD"
        req.headers = {}
        body = None
        req.prepare_content_length(body)
        assert "Content-Length" not in req.headers

    def test_prepare_content_length_with_non_empty_body_for_head(self):
        req = PreparedRequest()
        req.method = "HEAD"
        req.headers = {}
        body = "test body"
        req.prepare_content_length(body)
        assert req.headers["Content-Length"] == "9"
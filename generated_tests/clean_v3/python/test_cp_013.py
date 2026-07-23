import pytest
from requests.models import PreparedRequest

class TestPreparedRequest:
    @pytest.fixture
    def prepared_request(self):
        return PreparedRequest()

    def test_prepare_content_length_with_non_empty_body(self, prepared_request):
        body = "test body"
        prepared_request.prepare_content_length(body)
        assert prepared_request.headers["Content-Length"] == str(len(body))

    def test_prepare_content_length_with_empty_body(self, prepared_request):
        body = ""
        prepared_request.prepare_content_length(body)
        assert "Content-Length" not in prepared_request.headers

    def test_prepare_content_length_with_none_body_and_get_method(self, prepared_request):
        prepared_request.method = "GET"
        prepared_request.prepare_content_length(None)
        assert "Content-Length" not in prepared_request.headers

    def test_prepare_content_length_with_none_body_and_head_method(self, prepared_request):
        prepared_request.method = "HEAD"
        prepared_request.prepare_content_length(None)
        assert "Content-Length" not in prepared_request.headers

    def test_prepare_content_length_with_none_body_and_post_method(self, prepared_request):
        prepared_request.method = "POST"
        prepared_request.prepare_content_length(None)
        assert prepared_request.headers["Content-Length"] == "0"

    def test_prepare_content_length_with_none_body_and_put_method(self, prepared_request):
        prepared_request.method = "PUT"
        prepared_request.prepare_content_length(None)
        assert prepared_request.headers["Content-Length"] == "0"
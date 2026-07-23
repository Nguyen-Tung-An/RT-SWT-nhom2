import pytest
from requests.models import PreparedRequest, Response
from requests.sessions import SessionRedirectMixin
from requests import codes

class TestRebuildMethod:
    def setup_method(self):
        self.mixin = SessionRedirectMixin()
        self.prepared_request = PreparedRequest()

    def test_rebuild_method_see_other(self):
        self.prepared_request.method = "POST"
        response = Response()
        response.status_code = codes.see_other
        self.mixin.rebuild_method(self.prepared_request, response)
        assert self.prepared_request.method == "GET"

    def test_rebuild_method_found(self):
        self.prepared_request.method = "POST"
        response = Response()
        response.status_code = codes.found
        self.mixin.rebuild_method(self.prepared_request, response)
        assert self.prepared_request.method == "GET"

    def test_rebuild_method_moved_post(self):
        self.prepared_request.method = "POST"
        response = Response()
        response.status_code = codes.moved
        self.mixin.rebuild_method(self.prepared_request, response)
        assert self.prepared_request.method == "GET"

    def test_rebuild_method_no_change_head(self):
        self.prepared_request.method = "HEAD"
        response = Response()
        response.status_code = codes.see_other
        self.mixin.rebuild_method(self.prepared_request, response)
        assert self.prepared_request.method == "HEAD"

    def test_rebuild_method_no_change_other(self):
        self.prepared_request.method = "PUT"
        response = Response()
        response.status_code = 200  # OK
        self.mixin.rebuild_method(self.prepared_request, response)
        assert self.prepared_request.method == "PUT"
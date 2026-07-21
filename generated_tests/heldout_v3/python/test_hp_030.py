import pytest
from requests.sessions import SessionRedirectMixin
from requests.models import PreparedRequest, Response

class TestRebuildAuth:
    def setup_method(self):
        self.mixin = SessionRedirectMixin()

    def test_rebuild_auth_with_auth_header_stripped(self):
        prepared_request = PreparedRequest()
        prepared_request.headers = {"Authorization": "Bearer token"}
        prepared_request.url = "http://newhost.com/resource"

        original_request = PreparedRequest()
        original_request.headers = {}
        original_request.url = "http://oldhost.com/resource"
        response = Response()
        response.request = original_request

        self.mixin.should_strip_auth = lambda original_url, url: True
        self.mixin.trust_env = False

        self.mixin.rebuild_auth(prepared_request, response)

        assert "Authorization" not in prepared_request.headers

    def test_rebuild_auth_with_auth_header_not_stripped(self):
        prepared_request = PreparedRequest()
        prepared_request.headers = {"Authorization": "Bearer token"}
        prepared_request.url = "http://newhost.com/resource"

        original_request = PreparedRequest()
        original_request.headers = {}
        original_request.url = "http://newhost.com/resource"
        response = Response()
        response.request = original_request

        self.mixin.should_strip_auth = lambda original_url, url: False
        self.mixin.trust_env = False

        self.mixin.rebuild_auth(prepared_request, response)

        assert prepared_request.headers["Authorization"] == "Bearer token"

    def test_rebuild_auth_with_netrc_auth(self):
        prepared_request = PreparedRequest()
        prepared_request.headers = {}
        prepared_request.url = "http://newhost.com/resource"

        original_request = PreparedRequest()
        original_request.headers = {}
        original_request.url = "http://oldhost.com/resource"
        response = Response()
        response.request = original_request

        self.mixin.should_strip_auth = lambda original_url, url: True
        self.mixin.trust_env = True
        self.mixin.get_netrc_auth = lambda url: ("username", "password")

        self.mixin.rebuild_auth(prepared_request, response)

        assert "Authorization" in prepared_request.headers

    def test_rebuild_auth_without_netrc_auth(self):
        prepared_request = PreparedRequest()
        prepared_request.headers = {}
        prepared_request.url = "http://newhost.com/resource"

        original_request = PreparedRequest()
        original_request.headers = {}
        original_request.url = "http://oldhost.com/resource"
        response = Response()
        response.request = original_request

        self.mixin.should_strip_auth = lambda original_url, url: True
        self.mixin.trust_env = True
        self.mixin.get_netrc_auth = lambda url: None

        self.mixin.rebuild_auth(prepared_request, response)

        assert "Authorization" not in prepared_request.headers
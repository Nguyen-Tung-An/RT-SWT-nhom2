import pytest
from requests.sessions import SessionRedirectMixin
from requests.models import PreparedRequest, Response

class TestSessionRedirectMixin:
    def setup_method(self):
        self.mixin = SessionRedirectMixin()

    def test_rebuild_auth_with_auth_header(self):
        prepared_request = PreparedRequest()
        prepared_request.headers['Authorization'] = 'Bearer token'
        response = Response()
        response.headers['WWW-Authenticate'] = 'Bearer realm="example"'
        
        result = self.mixin.rebuild_auth(prepared_request, response)
        
        assert result.headers['Authorization'] == 'Bearer token'

    def test_rebuild_auth_without_auth_header(self):
        prepared_request = PreparedRequest()
        response = Response()
        response.headers['WWW-Authenticate'] = 'Bearer realm="example"'
        
        result = self.mixin.rebuild_auth(prepared_request, response)
        
        assert 'Authorization' not in result.headers

    def test_rebuild_auth_with_no_www_authenticate(self):
        prepared_request = PreparedRequest()
        prepared_request.headers['Authorization'] = 'Bearer token'
        response = Response()
        
        result = self.mixin.rebuild_auth(prepared_request, response)
        
        assert result.headers['Authorization'] == 'Bearer token'

    def test_rebuild_auth_with_invalid_response(self):
        prepared_request = PreparedRequest()
        response = Response()
        response.status_code = 400  # Bad Request
        
        result = self.mixin.rebuild_auth(prepared_request, response)
        
        assert result is None  # Assuming the method returns None on error
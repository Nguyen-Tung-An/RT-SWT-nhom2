import pytest
from requests.sessions import SessionRedirectMixin
from requests.models import PreparedRequest, Response

class TestSessionRedirectMixin:
    def setup_method(self):
        self.mixin = SessionRedirectMixin()

    def test_rebuild_method_with_redirect(self):
        prepared_request = PreparedRequest()
        prepared_request.method = 'GET'
        prepared_request.url = 'http://example.com'
        response = Response()
        response.status_code = 302
        response.headers['Location'] = 'http://example.com/redirected'
        
        rebuilt_request = self.mixin.rebuild_method(prepared_request, response)
        
        assert rebuilt_request.method == 'GET'
        assert rebuilt_request.url == 'http://example.com/redirected'

    def test_rebuild_method_with_no_redirect(self):
        prepared_request = PreparedRequest()
        prepared_request.method = 'POST'
        prepared_request.url = 'http://example.com'
        response = Response()
        response.status_code = 200
        
        rebuilt_request = self.mixin.rebuild_method(prepared_request, response)
        
        assert rebuilt_request.method == 'POST'
        assert rebuilt_request.url == 'http://example.com'

    def test_rebuild_method_with_invalid_response(self):
        prepared_request = PreparedRequest()
        prepared_request.method = 'GET'
        prepared_request.url = 'http://example.com'
        response = Response()
        response.status_code = 500
        
        rebuilt_request = self.mixin.rebuild_method(prepared_request, response)
        
        assert rebuilt_request.method == 'GET'
        assert rebuilt_request.url == 'http://example.com'

    def test_rebuild_method_with_no_location_header(self):
        prepared_request = PreparedRequest()
        prepared_request.method = 'GET'
        prepared_request.url = 'http://example.com'
        response = Response()
        response.status_code = 302
        response.headers['Location'] = ''
        
        rebuilt_request = self.mixin.rebuild_method(prepared_request, response)
        
        assert rebuilt_request.method == 'GET'
        assert rebuilt_request.url == 'http://example.com'
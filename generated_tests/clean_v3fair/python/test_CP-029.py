import pytest
from requests.sessions import SessionRedirectMixin
from requests.models import PreparedRequest, Response

@pytest.fixture
def session_redirect_mixin():
    return SessionRedirectMixin()

@pytest.fixture
def prepared_request():
    req = PreparedRequest()
    req.url = "http://example.com"
    req.headers = {}
    return req

@pytest.fixture
def response():
    resp = Response()
    resp.request = PreparedRequest()
    resp.request.url = "http://example.com"
    return resp

def test_rebuild_auth_no_auth_header(session_redirect_mixin, prepared_request, response):
    session_redirect_mixin.rebuild_auth(prepared_request, response)
    assert "Authorization" not in prepared_request.headers

def test_rebuild_auth_strip_auth(session_redirect_mixin, prepared_request, response):
    prepared_request.headers["Authorization"] = "Bearer token"
    response.request.url = "http://another-example.com"
    
    def mock_should_strip_auth(original_url, new_url):
        return True
    session_redirect_mixin.should_strip_auth = mock_should_strip_auth
    
    session_redirect_mixin.rebuild_auth(prepared_request, response)
    assert "Authorization" not in prepared_request.headers

def test_rebuild_auth_keep_auth(session_redirect_mixin, prepared_request, response):
    prepared_request.headers["Authorization"] = "Bearer token"
    response.request.url = "http://example.com"
    
    def mock_should_strip_auth(original_url, new_url):
        return False
    session_redirect_mixin.should_strip_auth = mock_should_strip_auth
    
    session_redirect_mixin.rebuild_auth(prepared_request, response)
    assert prepared_request.headers["Authorization"] == "Bearer token"

def test_rebuild_auth_with_netrc_auth(session_redirect_mixin, prepared_request, response):
    prepared_request.headers["Authorization"] = "Bearer token"
    response.request.url = "http://another-example.com"
    
    def mock_should_strip_auth(original_url, new_url):
        return True
    session_redirect_mixin.should_strip_auth = mock_should_strip_auth
    
    def mock_get_netrc_auth(url):
        return ("user", "pass")
    
    session_redirect_mixin.trust_env = True
    session_redirect_mixin.get_netrc_auth = mock_get_netrc_auth
    
    session_redirect_mixin.rebuild_auth(prepared_request, response)
    assert "Authorization" not in prepared_request.headers
    assert prepared_request.headers["Authorization"] == "Basic dXNlcjpwYXNz"  # Assuming basic auth encoding

def test_rebuild_auth_no_netrc_auth(session_redirect_mixin, prepared_request, response):
    prepared_request.headers["Authorization"] = "Bearer token"
    response.request.url = "http://another-example.com"
    
    def mock_should_strip_auth(original_url, new_url):
        return True
    session_redirect_mixin.should_strip_auth = mock_should_strip_auth
    
    session_redirect_mixin.trust_env = False
    
    session_redirect_mixin.rebuild_auth(prepared_request, response)
    assert "Authorization" not in prepared_request.headers
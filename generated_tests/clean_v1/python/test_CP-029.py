import pytest
from requests.sessions import Session, rebuild_auth
from requests.models import PreparedRequest, Response

@pytest.fixture
def session():
    return Session()

@pytest.fixture
def prepared_request():
    req = PreparedRequest()
    req.prepare_url('http://example.com', {})
    req.headers = {}
    return req

@pytest.fixture
def response():
    resp = Response()
    resp.request = PreparedRequest()
    resp.request.prepare_url('http://example.com', {})
    return resp

def test_rebuild_auth_strips_auth_on_redirect(session, prepared_request, response):
    prepared_request.headers['Authorization'] = 'Bearer token'
    response.request.url = 'http://another-example.com'
    prepared_request.url = 'http://another-example.com'
    
    session.rebuild_auth(prepared_request, response)
    
    assert 'Authorization' not in prepared_request.headers

def test_rebuild_auth_keeps_auth_on_same_host(session, prepared_request, response):
    prepared_request.headers['Authorization'] = 'Bearer token'
    response.request.url = 'http://example.com'
    prepared_request.url = 'http://example.com'
    
    session.rebuild_auth(prepared_request, response)
    
    assert prepared_request.headers['Authorization'] == 'Bearer token'

def test_rebuild_auth_with_netrc_auth(session, prepared_request, response, monkeypatch):
    def mock_get_netrc_auth(url):
        return ('username', 'password')

    monkeypatch.setattr('requests.sessions.get_netrc_auth', mock_get_netrc_auth)
    session.trust_env = True
    prepared_request.url = 'http://another-example.com'
    response.request.url = 'http://another-example.com'
    
    session.rebuild_auth(prepared_request, response)
    
    assert 'Authorization' in prepared_request.headers
    assert prepared_request.headers['Authorization'] == 'Basic dXNlcm5hbWU6cGFzc3dvcmQ='  # Base64 of 'username:password'

def test_rebuild_auth_no_auth_in_headers(session, prepared_request, response):
    response.request.url = 'http://another-example.com'
    prepared_request.url = 'http://another-example.com'
    
    session.rebuild_auth(prepared_request, response)
    
    assert 'Authorization' not in prepared_request.headers
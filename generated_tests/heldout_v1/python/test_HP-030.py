import pytest
from requests.sessions import Session, rebuild_auth
from requests.models import PreparedRequest, Response

@pytest.fixture
def session():
    return Session()

@pytest.fixture
def prepared_request():
    req = PreparedRequest()
    req.prepare(method='GET', url='http://example.com')
    return req

@pytest.fixture
def response():
    resp = Response()
    resp.request = PreparedRequest()
    resp.request.prepare(method='GET', url='http://example.com')
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
    
    prepared_request.headers['Authorization'] = 'Bearer token'
    response.request.url = 'http://another-example.com'
    prepared_request.url = 'http://another-example.com'
    
    session.trust_env = True
    session.rebuild_auth(prepared_request, response)
    
    assert 'Authorization' not in prepared_request.headers
    assert prepared_request.auth == ('username', 'password')

def test_rebuild_auth_no_auth_header(session, prepared_request, response):
    response.request.url = 'http://another-example.com'
    prepared_request.url = 'http://another-example.com'
    
    session.rebuild_auth(prepared_request, response)
    
    assert 'Authorization' not in prepared_request.headers
import pytest
from requests.sessions import Session
from requests import Request

def test_prepare_request_with_default_auth():
    session = Session()
    request = Request(method='GET', url='http://example.com')
    prepared_request = session.prepare_request(request)
    assert prepared_request.method == 'GET'
    assert prepared_request.url == 'http://example.com'

def test_prepare_request_with_custom_auth():
    session = Session()
    request = Request(method='GET', url='http://example.com', auth=('user', 'pass'))
    prepared_request = session.prepare_request(request)
    assert prepared_request.auth == ('user', 'pass')

def test_prepare_request_with_cookies():
    session = Session()
    request = Request(method='GET', url='http://example.com', cookies={'session_id': '123'})
    prepared_request = session.prepare_request(request)
    assert 'session_id' in prepared_request.cookies

def test_prepare_request_with_empty_cookies():
    session = Session()
    request = Request(method='GET', url='http://example.com', cookies={})
    prepared_request = session.prepare_request(request)
    assert len(prepared_request.cookies) == 0

def test_prepare_request_with_files():
    session = Session()
    request = Request(method='POST', url='http://example.com', files={'file': ('filename', b'content')})
    prepared_request = session.prepare_request(request)
    assert 'file' in prepared_request.files

def test_prepare_request_with_json_data():
    session = Session()
    request = Request(method='POST', url='http://example.com', json={'key': 'value'})
    prepared_request = session.prepare_request(request)
    assert prepared_request.json == {'key': 'value'}

def test_prepare_request_with_headers():
    session = Session()
    request = Request(method='GET', url='http://example.com', headers={'Authorization': 'Bearer token'})
    prepared_request = session.prepare_request(request)
    assert prepared_request.headers['Authorization'] == 'Bearer token'

def test_prepare_request_with_params():
    session = Session()
    request = Request(method='GET', url='http://example.com', params={'key': 'value'})
    prepared_request = session.prepare_request(request)
    assert prepared_request.path_url == 'http://example.com?key=value'
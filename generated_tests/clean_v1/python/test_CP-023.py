import pytest
from requests.sessions import Session

@pytest.fixture
def session():
    return Session()

def test_request_get(session, requests_mock):
    requests_mock.get('http://test.com', text='response')
    response = session.request('GET', 'http://test.com')
    assert response.text == 'response'

def test_request_post(session, requests_mock):
    requests_mock.post('http://test.com', text='posted')
    response = session.request('POST', 'http://test.com', data={'key': 'value'})
    assert response.text == 'posted'

def test_request_with_params(session, requests_mock):
    requests_mock.get('http://test.com?key=value', text='response with params')
    response = session.request('GET', 'http://test.com', params={'key': 'value'})
    assert response.text == 'response with params'

def test_request_with_headers(session, requests_mock):
    requests_mock.get('http://test.com', text='response with headers')
    response = session.request('GET', 'http://test.com', headers={'Authorization': 'Bearer token'})
    assert response.text == 'response with headers'

def test_request_with_cookies(session, requests_mock):
    requests_mock.get('http://test.com', cookies={'session_id': '123'})
    response = session.request('GET', 'http://test.com', cookies={'session_id': '123'})
    assert response.cookies['session_id'] == '123'

def test_request_with_json(session, requests_mock):
    requests_mock.post('http://test.com', json={'key': 'value'})
    response = session.request('POST', 'http://test.com', json={'key': 'value'})
    assert response.json() == {'key': 'value'}

def test_request_with_timeout(session, requests_mock):
    requests_mock.get('http://test.com', text='response with timeout')
    response = session.request('GET', 'http://test.com', timeout=5)
    assert response.text == 'response with timeout'

def test_request_with_verify(session, requests_mock):
    requests_mock.get('http://test.com', text='response with verify')
    response = session.request('GET', 'http://test.com', verify=True)
    assert response.text == 'response with verify'

def test_request_with_stream(session, requests_mock):
    requests_mock.get('http://test.com', text='response with stream')
    response = session.request('GET', 'http://test.com', stream=True)
    assert response.text == 'response with stream'
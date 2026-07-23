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
    requests_mock.get('http://test.com?key=value', text='response')
    response = session.request('GET', 'http://test.com', params={'key': 'value'})
    assert response.text == 'response'

def test_request_with_headers(session, requests_mock):
    requests_mock.get('http://test.com', text='response')
    response = session.request('GET', 'http://test.com', headers={'Authorization': 'Bearer token'})
    assert response.text == 'response'

def test_request_with_cookies(session, requests_mock):
    requests_mock.get('http://test.com', text='response')
    response = session.request('GET', 'http://test.com', cookies={'session_id': '123'})
    assert response.text == 'response'

def test_request_with_json(session, requests_mock):
    requests_mock.post('http://test.com', text='json response')
    response = session.request('POST', 'http://test.com', json={'key': 'value'})
    assert response.text == 'json response'

def test_request_with_timeout(session, requests_mock):
    requests_mock.get('http://test.com', text='response', status_code=200)
    response = session.request('GET', 'http://test.com', timeout=5)
    assert response.status_code == 200

def test_request_with_redirects(session, requests_mock):
    requests_mock.get('http://test.com', status_code=302, headers={'Location': 'http://test.com/redirect'})
    requests_mock.get('http://test.com/redirect', text='final response')
    response = session.request('GET', 'http://test.com', allow_redirects=True)
    assert response.text == 'final response'

def test_request_with_invalid_url(session):
    with pytest.raises(ValueError):
        session.request('GET', 'invalid-url')

def test_request_with_verify_false(session, requests_mock):
    requests_mock.get('http://test.com', text='response')
    response = session.request('GET', 'http://test.com', verify=False)
    assert response.text == 'response'
import pytest
from requests.sessions import Session

class TestSessionRequest:
    def setup_method(self):
        self.session = Session()

    def test_request_get(self):
        response = self.session.request('GET', 'https://httpbin.org/get')
        assert response.status_code == 200

    def test_request_post_with_data(self):
        response = self.session.request('POST', 'https://httpbin.org/post', data={'key': 'value'})
        assert response.status_code == 200
        assert response.json()['form'] == {'key': 'value'}

    def test_request_post_with_json(self):
        response = self.session.request('POST', 'https://httpbin.org/post', json={'key': 'value'})
        assert response.status_code == 200
        assert response.json()['json'] == {'key': 'value'}

    def test_request_with_headers(self):
        response = self.session.request('GET', 'https://httpbin.org/headers', headers={'User-Agent': 'test'})
        assert response.status_code == 200
        assert response.json()['headers']['User-Agent'] == 'test'

    def test_request_with_cookies(self):
        response = self.session.request('GET', 'https://httpbin.org/cookies', cookies={'session_id': '123'})
        assert response.status_code == 200
        assert response.json()['cookies']['session_id'] == '123'

    def test_request_with_timeout(self):
        with pytest.raises(Exception):
            self.session.request('GET', 'https://httpbin.org/delay/5', timeout=1)

    def test_request_with_invalid_url(self):
        with pytest.raises(Exception):
            self.session.request('GET', 'invalid_url')

    def test_request_with_redirects(self):
        response = self.session.request('GET', 'https://httpbin.org/redirect/1', allow_redirects=True)
        assert response.status_code == 200

    def test_request_with_proxies(self):
        response = self.session.request('GET', 'https://httpbin.org/ip', proxies={'http': 'http://10.10.1.10:3128'})
        assert response.status_code == 200

    def test_request_with_cert(self):
        response = self.session.request('GET', 'https://httpbin.org/get', cert=('path/to/cert.pem', 'path/to/key.pem'))
        assert response.status_code == 200
import pytest
from requests.models import Request

class TestRequestInit:
    def test_init_with_default_values(self):
        req = Request()
        assert req.method is None
        assert req.url is None
        assert req.headers == {}
        assert req.files == []
        assert req.data == []
        assert req.json is None
        assert req.params == {}
        assert req.auth is None
        assert req.cookies is None

    def test_init_with_method_and_url(self):
        req = Request(method='GET', url='http://example.com')
        assert req.method == 'GET'
        assert req.url == 'http://example.com'

    def test_init_with_headers(self):
        headers = {'Content-Type': 'application/json'}
        req = Request(headers=headers)
        assert req.headers == headers

    def test_init_with_files(self):
        files = [('file', ('filename', b'content'))]
        req = Request(files=files)
        assert req.files == files

    def test_init_with_data(self):
        data = {'key': 'value'}
        req = Request(data=data)
        assert req.data == data

    def test_init_with_params(self):
        params = {'param1': 'value1'}
        req = Request(params=params)
        assert req.params == params

    def test_init_with_auth(self):
        auth = ('user', 'pass')
        req = Request(auth=auth)
        assert req.auth == auth

    def test_init_with_cookies(self):
        cookies = {'session_id': 'abc123'}
        req = Request(cookies=cookies)
        assert req.cookies == cookies

    def test_init_with_hooks(self):
        hooks = {'response': lambda r, *args, **kwargs: r}
        req = Request(hooks=hooks)
        assert 'response' in req.hooks

    def test_init_with_json(self):
        json_data = {'key': 'value'}
        req = Request(json=json_data)
        assert req.json == json_data

    def test_init_with_all_params(self):
        req = Request(
            method='POST',
            url='http://example.com',
            headers={'Content-Type': 'application/json'},
            files=[('file', ('filename', b'content'))],
            data={'key': 'value'},
            params={'param1': 'value1'},
            auth=('user', 'pass'),
            cookies={'session_id': 'abc123'},
            hooks={'response': lambda r, *args, **kwargs: r},
            json={'key': 'value'}
        )
        assert req.method == 'POST'
        assert req.url == 'http://example.com'
        assert req.headers['Content-Type'] == 'application/json'
        assert req.files[0] == ('file', ('filename', b'content'))
        assert req.data == {'key': 'value'}
        assert req.params == {'param1': 'value1'}
        assert req.auth == ('user', 'pass')
        assert req.cookies == {'session_id': 'abc123'}
        assert 'response' in req.hooks
        assert req.json == {'key': 'value'}
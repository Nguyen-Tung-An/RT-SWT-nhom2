import pytest
from requests.models import Request

def test_init_with_default_params():
    req = Request()
    assert req.method is None
    assert req.url is None
    assert req.headers == {}
    assert req.files == []
    assert req.data == []
    assert req.params == {}
    assert req.hooks == {}
    assert req.auth is None
    assert req.cookies is None
    assert req.json is None

def test_init_with_method_and_url():
    req = Request(method='GET', url='http://example.com')
    assert req.method == 'GET'
    assert req.url == 'http://example.com'

def test_init_with_headers():
    headers = {'Content-Type': 'application/json'}
    req = Request(headers=headers)
    assert req.headers == headers

def test_init_with_files():
    files = {'file': ('filename.txt', b'content')}
    req = Request(files=files)
    assert req.files == files

def test_init_with_data():
    data = {'key': 'value'}
    req = Request(data=data)
    assert req.data == data

def test_init_with_params():
    params = {'param1': 'value1'}
    req = Request(params=params)
    assert req.params == params

def test_init_with_auth():
    auth = ('user', 'pass')
    req = Request(auth=auth)
    assert req.auth == auth

def test_init_with_cookies():
    cookies = {'session_id': 'abc123'}
    req = Request(cookies=cookies)
    assert req.cookies == cookies

def test_init_with_hooks():
    hooks = {'response': lambda r, *args, **kwargs: r}
    req = Request(hooks=hooks)
    assert 'response' in req.hooks

def test_init_with_json():
    json_data = {'key': 'value'}
    req = Request(json=json_data)
    assert req.json == json_data
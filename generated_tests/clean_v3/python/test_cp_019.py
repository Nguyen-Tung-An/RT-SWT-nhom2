import pytest
from requests.models import PreparedRequest
from requests.auth import HTTPBasicAuth

class TestPrepareAuth:
    def test_prepare_auth_with_none_auth(self):
        req = PreparedRequest()
        req.url = "http://example.com"
        req.prepare_auth(None, req.url)
        assert req.__dict__.get('auth') is None

    def test_prepare_auth_with_empty_url(self):
        req = PreparedRequest()
        req.url = ""
        req.prepare_auth(None, req.url)
        assert req.__dict__.get('auth') is None

    def test_prepare_auth_with_basic_auth_tuple(self):
        req = PreparedRequest()
        req.url = "http://example.com"
        req.prepare_auth(("user", "pass"), req.url)
        assert isinstance(req.__dict__.get('auth'), HTTPBasicAuth)
        assert req.__dict__.get('auth').username == "user"
        assert req.__dict__.get('auth').password == "pass"

    def test_prepare_auth_with_callable_auth(self):
        req = PreparedRequest()
        req.url = "http://example.com"
        def mock_auth(request):
            request.__dict__['auth'] = 'mocked_auth'
            return request
        req.prepare_auth(mock_auth, req.url)
        assert req.__dict__.get('auth') == 'mocked_auth'

    def test_prepare_auth_with_invalid_auth_type(self):
        req = PreparedRequest()
        req.url = "http://example.com"
        with pytest.raises(TypeError):
            req.prepare_auth(123, req.url)
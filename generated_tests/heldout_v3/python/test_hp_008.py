import pytest
from requests.models import Response
from requests.exceptions import HTTPError

class TestResponseRaiseForStatus:
    
    def test_raise_for_status_client_error_bytes(self):
        response = Response()
        response.status_code = 404
        response.reason = b'Not Found'
        response.url = 'http://example.com'
        with pytest.raises(HTTPError) as excinfo:
            response.raise_for_status()
        assert str(excinfo.value) == '404 Client Error: Not Found for url: http://example.com'

    def test_raise_for_status_client_error_str(self):
        response = Response()
        response.status_code = 403
        response.reason = 'Forbidden'
        response.url = 'http://example.com'
        with pytest.raises(HTTPError) as excinfo:
            response.raise_for_status()
        assert str(excinfo.value) == '403 Client Error: Forbidden for url: http://example.com'

    def test_raise_for_status_server_error_bytes(self):
        response = Response()
        response.status_code = 500
        response.reason = b'Internal Server Error'
        response.url = 'http://example.com'
        with pytest.raises(HTTPError) as excinfo:
            response.raise_for_status()
        assert str(excinfo.value) == '500 Server Error: Internal Server Error for url: http://example.com'

    def test_raise_for_status_server_error_str(self):
        response = Response()
        response.status_code = 502
        response.reason = 'Bad Gateway'
        response.url = 'http://example.com'
        with pytest.raises(HTTPError) as excinfo:
            response.raise_for_status()
        assert str(excinfo.value) == '502 Server Error: Bad Gateway for url: http://example.com'

    def test_raise_for_status_no_error(self):
        response = Response()
        response.status_code = 200
        response.reason = 'OK'
        response.url = 'http://example.com'
        response.raise_for_status()  # Should not raise
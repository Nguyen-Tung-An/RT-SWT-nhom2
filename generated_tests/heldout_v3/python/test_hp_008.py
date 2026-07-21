import pytest
from requests.models import Response

class TestResponseRaiseForStatus:
    
    def test_raise_for_status_no_error(self):
        response = Response()
        response.status_code = 200
        # This should not raise an exception
        response.raise_for_status()
    
    def test_raise_for_status_client_error(self):
        response = Response()
        response.status_code = 404
        with pytest.raises(Exception) as excinfo:
            response.raise_for_status()
        assert "Client Error" in str(excinfo.value)

    def test_raise_for_status_server_error(self):
        response = Response()
        response.status_code = 500
        with pytest.raises(Exception) as excinfo:
            response.raise_for_status()
        assert "Server Error" in str(excinfo.value)

    def test_raise_for_status_redirect(self):
        response = Response()
        response.status_code = 300
        with pytest.raises(Exception) as excinfo:
            response.raise_for_status()
        assert "Redirection Error" in str(excinfo.value)

    def test_raise_for_status_no_status_code(self):
        response = Response()
        response.status_code = None
        with pytest.raises(Exception) as excinfo:
            response.raise_for_status()
        assert "Invalid Response" in str(excinfo.value)
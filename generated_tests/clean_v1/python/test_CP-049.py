import pytest
from requests.models import Response
from requests.exceptions import HTTPError

def test_raise_for_status_client_error():
    response = Response()
    response.status_code = 404
    response.reason = b'Not Found'
    response.url = 'http://example.com'
    
    with pytest.raises(HTTPError) as excinfo:
        response.raise_for_status()
    
    assert str(excinfo.value) == '404 Client Error: Not Found for url: http://example.com'

def test_raise_for_status_server_error():
    response = Response()
    response.status_code = 500
    response.reason = b'Internal Server Error'
    response.url = 'http://example.com'
    
    with pytest.raises(HTTPError) as excinfo:
        response.raise_for_status()
    
    assert str(excinfo.value) == '500 Server Error: Internal Server Error for url: http://example.com'

def test_raise_for_status_no_error():
    response = Response()
    response.status_code = 200
    response.reason = b'OK'
    response.url = 'http://example.com'
    
    # Should not raise an error
    response.raise_for_status()

def test_raise_for_status_unicode_error():
    response = Response()
    response.status_code = 400
    response.reason = b'\x80\x81'  # Invalid UTF-8 sequence
    response.url = 'http://example.com'
    
    with pytest.raises(HTTPError) as excinfo:
        response.raise_for_status()
    
    assert str(excinfo.value).startswith('400 Client Error:')
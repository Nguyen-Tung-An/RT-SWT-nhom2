import pytest
from requests.adapters import _urllib3_request_context
from requests.models import PreparedRequest
from urllib3 import PoolManager

def test_urllib3_request_context_no_verify():
    request = PreparedRequest()
    request.url = "http://example.com"
    verify = False
    client_cert = None
    poolmanager = PoolManager()
    
    host_params, pool_kwargs = _urllib3_request_context(request, verify, client_cert, poolmanager)
    
    assert host_params == {"scheme": "http", "host": "example.com", "port": None}
    assert pool_kwargs == {"cert_reqs": "CERT_NONE"}

def test_urllib3_request_context_verify_as_string():
    request = PreparedRequest()
    request.url = "https://example.com:443"
    verify = "/path/to/certs"
    client_cert = None
    poolmanager = PoolManager()
    
    host_params, pool_kwargs = _urllib3_request_context(request, verify, client_cert, poolmanager)
    
    assert host_params == {"scheme": "https", "host": "example.com", "port": 443}
    assert pool_kwargs == {"cert_reqs": "CERT_REQUIRED", "ca_certs": "/path/to/certs"}

def test_urllib3_request_context_verify_as_directory():
    request = PreparedRequest()
    request.url = "https://example.com"
    verify = "/path/to/cert/dir"
    client_cert = None
    poolmanager = PoolManager()
    
    host_params, pool_kwargs = _urllib3_request_context(request, verify, client_cert, poolmanager)
    
    assert host_params == {"scheme": "https", "host": "example.com", "port": None}
    assert pool_kwargs == {"cert_reqs": "CERT_REQUIRED", "ca_certs": "/path/to/cert/dir"}

def test_urllib3_request_context_with_client_cert_tuple():
    request = PreparedRequest()
    request.url = "https://example.com"
    verify = True
    client_cert = ("/path/to/cert.pem", "/path/to/key.pem")
    poolmanager = PoolManager()
    
    host_params, pool_kwargs = _urllib3_request_context(request, verify, client_cert, poolmanager)
    
    assert host_params == {"scheme": "https", "host": "example.com", "port": None}
    assert pool_kwargs == {"cert_reqs": "CERT_REQUIRED", "cert_file": "/path/to/cert.pem", "key_file": "/path/to/key.pem"}

def test_urllib3_request_context_with_client_cert_path():
    request = PreparedRequest()
    request.url = "https://example.com"
    verify = True
    client_cert = "/path/to/cert.pem"
    poolmanager = PoolManager()
    
    host_params, pool_kwargs = _urllib3_request_context(request, verify, client_cert, poolmanager)
    
    assert host_params == {"scheme": "https", "host": "example.com", "port": None}
    assert pool_kwargs == {"cert_reqs": "CERT_REQUIRED", "cert_file": "/path/to/cert.pem"}
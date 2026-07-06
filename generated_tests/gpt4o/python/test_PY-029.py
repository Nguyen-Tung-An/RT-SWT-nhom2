import pytest
from requests.adapters import _urllib3_request_context
from requests.models import PreparedRequest
from urllib3 import PoolManager

def test_urllib3_request_context_no_verify():
    request = PreparedRequest()
    request.url = "https://example.com"
    verify = False
    client_cert = None
    poolmanager = PoolManager()
    
    host_params, pool_kwargs = _urllib3_request_context(request, verify, client_cert, poolmanager)
    
    assert host_params == {"scheme": "https", "host": "example.com", "port": None}
    assert pool_kwargs == {"cert_reqs": "CERT_NONE"}

def test_urllib3_request_context_verify_string():
    request = PreparedRequest()
    request.url = "https://example.com"
    verify = "/path/to/cert"
    client_cert = None
    poolmanager = PoolManager()
    
    host_params, pool_kwargs = _urllib3_request_context(request, verify, client_cert, poolmanager)
    
    assert host_params == {"scheme": "https", "host": "example.com", "port": None}
    assert pool_kwargs == {"cert_reqs": "CERT_REQUIRED", "ca_certs": "/path/to/cert"}

def test_urllib3_request_context_verify_directory():
    request = PreparedRequest()
    request.url = "https://example.com"
    verify = "/path/to/cert/dir"
    client_cert = None
    poolmanager = PoolManager()
    
    host_params, pool_kwargs = _urllib3_request_context(request, verify, client_cert, poolmanager)
    
    assert host_params == {"scheme": "https", "host": "example.com", "port": None}
    assert pool_kwargs == {"cert_reqs": "CERT_REQUIRED", "ca_cert_dir": "/path/to/cert/dir"}

def test_urllib3_request_context_with_client_cert_tuple():
    request = PreparedRequest()
    request.url = "https://example.com"
    verify = True
    client_cert = ("/path/to/certfile", "/path/to/keyfile")
    poolmanager = PoolManager()
    
    host_params, pool_kwargs = _urllib3_request_context(request, verify, client_cert, poolmanager)
    
    assert host_params == {"scheme": "https", "host": "example.com", "port": None}
    assert pool_kwargs == {"cert_reqs": "CERT_REQUIRED", "cert_file": "/path/to/certfile", "key_file": "/path/to/keyfile"}

def test_urllib3_request_context_with_client_cert_string():
    request = PreparedRequest()
    request.url = "https://example.com"
    verify = True
    client_cert = "/path/to/certfile"
    poolmanager = PoolManager()
    
    host_params, pool_kwargs = _urllib3_request_context(request, verify, client_cert, poolmanager)
    
    assert host_params == {"scheme": "https", "host": "example.com", "port": None}
    assert pool_kwargs == {"cert_reqs": "CERT_REQUIRED", "cert_file": "/path/to/certfile"}
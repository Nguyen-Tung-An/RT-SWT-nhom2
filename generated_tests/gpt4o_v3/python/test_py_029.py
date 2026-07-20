import os
import pytest
from requests import PreparedRequest
from requests.adapters import _urllib3_request_context
from urllib3 import PoolManager

class TestUrllib3RequestContext:

    def test_no_verify(self):
        request = PreparedRequest()
        request.url = "https://example.com"
        verify = False
        client_cert = None
        poolmanager = PoolManager()
        
        host_params, pool_kwargs = _urllib3_request_context(request, verify, client_cert, poolmanager)
        
        assert host_params == {"scheme": "https", "host": "example.com", "port": None}
        assert pool_kwargs == {"cert_reqs": "CERT_NONE"}

    def test_verify_as_string(self):
        request = PreparedRequest()
        request.url = "https://example.com"
        verify = "/path/to/certs"
        client_cert = None
        poolmanager = PoolManager()
        
        host_params, pool_kwargs = _urllib3_request_context(request, verify, client_cert, poolmanager)
        
        assert host_params == {"scheme": "https", "host": "example.com", "port": None}
        assert pool_kwargs == {"cert_reqs": "CERT_REQUIRED", "ca_certs": "/path/to/certs"}

    def test_verify_as_directory(self):
        request = PreparedRequest()
        request.url = "https://example.com"
        verify = "/path/to/cert_dir"
        client_cert = None
        poolmanager = PoolManager()
        
        host_params, pool_kwargs = _urllib3_request_context(request, verify, client_cert, poolmanager)
        
        assert host_params == {"scheme": "https", "host": "example.com", "port": None}
        assert pool_kwargs == {"cert_reqs": "CERT_REQUIRED", "ca_cert_dir": "/path/to/cert_dir"}

    def test_client_cert_as_tuple(self):
        request = PreparedRequest()
        request.url = "https://example.com"
        verify = True
        client_cert = ("/path/to/certfile", "/path/to/keyfile")
        poolmanager = PoolManager()
        
        host_params, pool_kwargs = _urllib3_request_context(request, verify, client_cert, poolmanager)
        
        assert host_params == {"scheme": "https", "host": "example.com", "port": None}
        assert pool_kwargs == {"cert_reqs": "CERT_REQUIRED", "cert_file": "/path/to/certfile", "key_file": "/path/to/keyfile"}

    def test_client_cert_as_string(self):
        request = PreparedRequest()
        request.url = "https://example.com"
        verify = True
        client_cert = "/path/to/certfile"
        poolmanager = PoolManager()
        
        host_params, pool_kwargs = _urllib3_request_context(request, verify, client_cert, poolmanager)
        
        assert host_params == {"scheme": "https", "host": "example.com", "port": None}
        assert pool_kwargs == {"cert_reqs": "CERT_REQUIRED", "cert_file": "/path/to/certfile"}

    def test_http_request(self):
        request = PreparedRequest()
        request.url = "http://example.com"
        verify = True
        client_cert = None
        poolmanager = PoolManager()
        
        host_params, pool_kwargs = _urllib3_request_context(request, verify, client_cert, poolmanager)
        
        assert host_params == {"scheme": "http", "host": "example.com", "port": None}
        assert pool_kwargs == {"cert_reqs": "CERT_REQUIRED"}

    def test_request_with_port(self):
        request = PreparedRequest()
        request.url = "https://example.com:8080"
        verify = True
        client_cert = None
        poolmanager = PoolManager()
        
        host_params, pool_kwargs = _urllib3_request_context(request, verify, client_cert, poolmanager)
        
        assert host_params == {"scheme": "https", "host": "example.com", "port": 8080}
        assert pool_kwargs == {"cert_reqs": "CERT_REQUIRED"}
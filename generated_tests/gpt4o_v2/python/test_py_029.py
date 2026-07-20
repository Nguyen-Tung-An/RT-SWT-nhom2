import pytest
from requests.adapters import _urllib3_request_context
from requests.models import PreparedRequest
from urllib3 import PoolManager

class TestUrllib3RequestContext:

    def test_http_request_without_verification(self):
        request = PreparedRequest()
        request.url = "http://example.com"
        verify = False
        client_cert = None
        poolmanager = PoolManager()

        host_params, pool_kwargs = _urllib3_request_context(request, verify, client_cert, poolmanager)

        assert host_params == {"scheme": "http", "host": "example.com", "port": None}
        assert pool_kwargs == {"cert_reqs": "CERT_NONE"}

    def test_https_request_with_ca_cert(self):
        request = PreparedRequest()
        request.url = "https://example.com"
        verify = "/path/to/ca_cert.pem"
        client_cert = None
        poolmanager = PoolManager()

        host_params, pool_kwargs = _urllib3_request_context(request, verify, client_cert, poolmanager)

        assert host_params == {"scheme": "https", "host": "example.com", "port": None}
        assert pool_kwargs == {"cert_reqs": "CERT_REQUIRED", "ca_certs": "/path/to/ca_cert.pem"}

    def test_https_request_with_ca_cert_directory(self):
        request = PreparedRequest()
        request.url = "https://example.com"
        verify = "/path/to/ca_cert_dir"
        client_cert = None
        poolmanager = PoolManager()

        host_params, pool_kwargs = _urllib3_request_context(request, verify, client_cert, poolmanager)

        assert host_params == {"scheme": "https", "host": "example.com", "port": None}
        assert pool_kwargs == {"cert_reqs": "CERT_REQUIRED", "ca_cert_dir": "/path/to/ca_cert_dir"}

    def test_https_request_with_client_cert_tuple(self):
        request = PreparedRequest()
        request.url = "https://example.com"
        verify = True
        client_cert = ("/path/to/cert.pem", "/path/to/key.pem")
        poolmanager = PoolManager()

        host_params, pool_kwargs = _urllib3_request_context(request, verify, client_cert, poolmanager)

        assert host_params == {"scheme": "https", "host": "example.com", "port": None}
        assert pool_kwargs == {"cert_reqs": "CERT_REQUIRED", "cert_file": "/path/to/cert.pem", "key_file": "/path/to/key.pem"}

    def test_https_request_with_client_cert_path(self):
        request = PreparedRequest()
        request.url = "https://example.com"
        verify = True
        client_cert = "/path/to/cert.pem"
        poolmanager = PoolManager()

        host_params, pool_kwargs = _urllib3_request_context(request, verify, client_cert, poolmanager)

        assert host_params == {"scheme": "https", "host": "example.com", "port": None}
        assert pool_kwargs == {"cert_reqs": "CERT_REQUIRED", "cert_file": "/path/to/cert.pem"}

    def test_http_request_with_port(self):
        request = PreparedRequest()
        request.url = "http://example.com:8080"
        verify = True
        client_cert = None
        poolmanager = PoolManager()

        host_params, pool_kwargs = _urllib3_request_context(request, verify, client_cert, poolmanager)

        assert host_params == {"scheme": "http", "host": "example.com", "port": 8080}
        assert pool_kwargs == {"cert_reqs": "CERT_REQUIRED"}

    def test_invalid_verify_string(self):
        request = PreparedRequest()
        request.url = "https://example.com"
        verify = "/invalid/path/to/ca_cert.pem"
        client_cert = None
        poolmanager = PoolManager()

        host_params, pool_kwargs = _urllib3_request_context(request, verify, client_cert, poolmanager)

        assert host_params == {"scheme": "https", "host": "example.com", "port": None}
        assert pool_kwargs == {"cert_reqs": "CERT_REQUIRED", "ca_certs": "/invalid/path/to/ca_cert.pem"}
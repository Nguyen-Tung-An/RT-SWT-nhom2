import pytest
from requests.models import Request

def test_prepare_content_length_with_body():
    req = Request('POST', 'http://example.com')
    req.body = 'test body'
    req.prepare_content_length(req.body)
    assert req.headers["Content-Length"] == '9'

def test_prepare_content_length_with_empty_body():
    req = Request('POST', 'http://example.com')
    req.body = ''
    req.prepare_content_length(req.body)
    assert "Content-Length" in req.headers
    assert req.headers["Content-Length"] == '0'

def test_prepare_content_length_with_none_body():
    req = Request('POST', 'http://example.com')
    req.body = None
    req.prepare_content_length(req.body)
    assert "Content-Length" in req.headers
    assert req.headers["Content-Length"] == '0'

def test_prepare_content_length_with_get_method():
    req = Request('GET', 'http://example.com')
    req.body = None
    req.prepare_content_length(req.body)
    assert "Content-Length" not in req.headers

def test_prepare_content_length_with_head_method():
    req = Request('HEAD', 'http://example.com')
    req.body = None
    req.prepare_content_length(req.body)
    assert "Content-Length" not in req.headers
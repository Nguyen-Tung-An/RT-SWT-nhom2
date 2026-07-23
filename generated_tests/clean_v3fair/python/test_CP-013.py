import pytest
from requests.models import PreparedRequest

def test_prepare_content_length_with_non_empty_body():
    req = PreparedRequest()
    req.method = 'POST'
    req.body = 'test body'
    req.headers = {}
    req.prepare_content_length(req.body)
    assert req.headers["Content-Length"] == "9"

def test_prepare_content_length_with_empty_body():
    req = PreparedRequest()
    req.method = 'POST'
    req.body = ''
    req.headers = {}
    req.prepare_content_length(req.body)
    assert req.headers["Content-Length"] == "0"

def test_prepare_content_length_with_none_body_for_post():
    req = PreparedRequest()
    req.method = 'POST'
    req.body = None
    req.headers = {}
    req.prepare_content_length(req.body)
    assert req.headers["Content-Length"] == "0"

def test_prepare_content_length_with_none_body_for_get():
    req = PreparedRequest()
    req.method = 'GET'
    req.body = None
    req.headers = {}
    req.prepare_content_length(req.body)
    assert "Content-Length" not in req.headers

def test_prepare_content_length_with_none_body_for_head():
    req = PreparedRequest()
    req.method = 'HEAD'
    req.body = None
    req.headers = {}
    req.prepare_content_length(req.body)
    assert "Content-Length" not in req.headers

def test_prepare_content_length_with_non_empty_body_for_head():
    req = PreparedRequest()
    req.method = 'HEAD'
    req.body = 'test body'
    req.headers = {}
    req.prepare_content_length(req.body)
    assert "Content-Length" not in req.headers
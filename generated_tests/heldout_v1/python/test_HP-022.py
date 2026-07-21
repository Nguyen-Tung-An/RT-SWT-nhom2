import pytest
from requests.models import PreparedRequest
from requests import Response
from requests.sessions import Session
from requests import codes

def test_rebuild_method_see_other():
    session = Session()
    prepared_request = PreparedRequest()
    prepared_request.method = "POST"
    response = Response()
    response.status_code = codes.see_other

    session.rebuild_method(prepared_request, response)
    assert prepared_request.method == "GET"

def test_rebuild_method_found():
    session = Session()
    prepared_request = PreparedRequest()
    prepared_request.method = "POST"
    response = Response()
    response.status_code = codes.found

    session.rebuild_method(prepared_request, response)
    assert prepared_request.method == "GET"

def test_rebuild_method_moved_post():
    session = Session()
    prepared_request = PreparedRequest()
    prepared_request.method = "POST"
    response = Response()
    response.status_code = codes.moved

    session.rebuild_method(prepared_request, response)
    assert prepared_request.method == "GET"

def test_rebuild_method_no_change_head():
    session = Session()
    prepared_request = PreparedRequest()
    prepared_request.method = "HEAD"
    response = Response()
    response.status_code = codes.see_other

    session.rebuild_method(prepared_request, response)
    assert prepared_request.method == "HEAD"

def test_rebuild_method_no_change_other():
    session = Session()
    prepared_request = PreparedRequest()
    prepared_request.method = "PUT"
    response = Response()
    response.status_code = 200

    session.rebuild_method(prepared_request, response)
    assert prepared_request.method == "PUT"
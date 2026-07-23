import pytest
from requests.models import PreparedRequest
from requests.sessions import Session
from requests import Response
from http import HTTPStatus

@pytest.fixture
def session():
    return Session()

@pytest.fixture
def prepared_request():
    req = PreparedRequest()
    req.method = "POST"
    return req

@pytest.fixture
def response():
    return Response()

def test_rebuild_method_see_other(session, prepared_request, response):
    prepared_request.method = "POST"
    response.status_code = HTTPStatus.SEE_OTHER
    session.rebuild_method(prepared_request, response)
    assert prepared_request.method == "GET"

def test_rebuild_method_found(session, prepared_request, response):
    prepared_request.method = "POST"
    response.status_code = HTTPStatus.FOUND
    session.rebuild_method(prepared_request, response)
    assert prepared_request.method == "GET"

def test_rebuild_method_moved(session, prepared_request, response):
    prepared_request.method = "POST"
    response.status_code = HTTPStatus.MOVED_PERMANENTLY
    session.rebuild_method(prepared_request, response)
    assert prepared_request.method == "GET"

def test_rebuild_method_no_change_see_other(session, prepared_request, response):
    prepared_request.method = "HEAD"
    response.status_code = HTTPStatus.SEE_OTHER
    session.rebuild_method(prepared_request, response)
    assert prepared_request.method == "HEAD"

def test_rebuild_method_no_change_found(session, prepared_request, response):
    prepared_request.method = "HEAD"
    response.status_code = HTTPStatus.FOUND
    session.rebuild_method(prepared_request, response)
    assert prepared_request.method == "HEAD"

def test_rebuild_method_no_change_moved(session, prepared_request, response):
    prepared_request.method = "GET"
    response.status_code = HTTPStatus.MOVED_PERMANENTLY
    session.rebuild_method(prepared_request, response)
    assert prepared_request.method == "GET"
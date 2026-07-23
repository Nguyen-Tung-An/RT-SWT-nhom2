import pytest
from requests.sessions import SessionRedirectMixin
from requests.models import PreparedRequest, Response
from requests import codes

@pytest.fixture
def session_redirect_mixin():
    return SessionRedirectMixin()

def test_rebuild_method_see_other_with_non_head(session_redirect_mixin):
    prepared_request = PreparedRequest()
    prepared_request.method = "POST"
    response = Response()
    response.status_code = codes.see_other
    session_redirect_mixin.rebuild_method(prepared_request, response)
    assert prepared_request.method == "GET"

def test_rebuild_method_found_with_non_head(session_redirect_mixin):
    prepared_request = PreparedRequest()
    prepared_request.method = "POST"
    response = Response()
    response.status_code = codes.found
    session_redirect_mixin.rebuild_method(prepared_request, response)
    assert prepared_request.method == "GET"

def test_rebuild_method_moved_with_post(session_redirect_mixin):
    prepared_request = PreparedRequest()
    prepared_request.method = "POST"
    response = Response()
    response.status_code = codes.moved
    session_redirect_mixin.rebuild_method(prepared_request, response)
    assert prepared_request.method == "GET"

def test_rebuild_method_moved_with_non_post(session_redirect_mixin):
    prepared_request = PreparedRequest()
    prepared_request.method = "GET"
    response = Response()
    response.status_code = codes.moved
    session_redirect_mixin.rebuild_method(prepared_request, response)
    assert prepared_request.method == "GET"

def test_rebuild_method_head_with_see_other(session_redirect_mixin):
    prepared_request = PreparedRequest()
    prepared_request.method = "HEAD"
    response = Response()
    response.status_code = codes.see_other
    session_redirect_mixin.rebuild_method(prepared_request, response)
    assert prepared_request.method == "HEAD"

def test_rebuild_method_head_with_found(session_redirect_mixin):
    prepared_request = PreparedRequest()
    prepared_request.method = "HEAD"
    response = Response()
    response.status_code = codes.found
    session_redirect_mixin.rebuild_method(prepared_request, response)
    assert prepared_request.method == "HEAD"

def test_rebuild_method_head_with_moved(session_redirect_mixin):
    prepared_request = PreparedRequest()
    prepared_request.method = "HEAD"
    response = Response()
    response.status_code = codes.moved
    session_redirect_mixin.rebuild_method(prepared_request, response)
    assert prepared_request.method == "HEAD"
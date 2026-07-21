import pytest
from requests.models import Response

@pytest.fixture
def mock_response():
    response = Response()
    response._content = b'This is a test response content.'
    response.raw = response
    response._content_consumed = False
    return response

def test_iter_content_default_chunk_size(mock_response):
    chunks = list(mock_response.iter_content())
    assert chunks == [b'This is a test response content.']

def test_iter_content_custom_chunk_size(mock_response):
    chunks = list(mock_response.iter_content(chunk_size=10))
    assert chunks == [b'This is a ', b'test resp', b'onse con', b'tent.']

def test_iter_content_empty_response():
    response = Response()
    response._content = b''
    response.raw = response
    response._content_consumed = False
    chunks = list(response.iter_content())
    assert chunks == []

def test_iter_content_consumed_error(mock_response):
    mock_response._content_consumed = True
    with pytest.raises(StreamConsumedError):
        list(mock_response.iter_content())

def test_iter_content_invalid_chunk_size(mock_response):
    with pytest.raises(TypeError):
        list(mock_response.iter_content(chunk_size='invalid'))

def test_iter_content_decode_unicode(mock_response):
    chunks = list(mock_response.iter_content(decode_unicode=True))
    assert chunks == ['This is a test response content.']
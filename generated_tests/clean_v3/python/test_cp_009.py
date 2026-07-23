import pytest
from requests.hooks import dispatch_hook
from requests.models import Response

def sample_hook(response, **kwargs):
    return response.text + " modified"

def another_hook(response, **kwargs):
    return None

def no_op_hook(response, **kwargs):
    return response

def test_dispatch_hook_with_callable_hook():
    response = Response()
    response._content = b"original"
    hooks = {'key': sample_hook}
    result = dispatch_hook('key', hooks, response)
    assert result.text == "original modified"

def test_dispatch_hook_with_callable_hook_returning_none():
    response = Response()
    response._content = b"original"
    hooks = {'key': another_hook}
    result = dispatch_hook('key', hooks, response)
    assert result.text == "original"

def test_dispatch_hook_with_no_hooks():
    response = Response()
    response._content = b"original"
    result = dispatch_hook('key', None, response)
    assert result.text == "original"

def test_dispatch_hook_with_multiple_hooks():
    response = Response()
    response._content = b"original"
    hooks = {'key': [sample_hook, no_op_hook]}
    result = dispatch_hook('key', hooks, response)
    assert result.text == "original modified"

def test_dispatch_hook_with_non_callable_hook():
    response = Response()
    response._content = b"original"
    hooks = {'key': "not_a_callable"}
    with pytest.raises(TypeError):
        dispatch_hook('key', hooks, response)

def test_dispatch_hook_with_empty_hooks():
    response = Response()
    response._content = b"original"
    hooks = {'key': []}
    result = dispatch_hook('key', hooks, response)
    assert result.text == "original"
import pytest
from requests.hooks import dispatch_hook
from requests.models import Request, Response

def test_dispatch_hook_with_valid_key():
    hooks = {'response': [lambda r, *args, **kwargs: r]}
    request = Request()
    response = Response()
    hook_data = {'key': 'value'}
    
    result = dispatch_hook('response', hooks, hook_data)
    
    assert result == response

def test_dispatch_hook_with_empty_hooks():
    hooks = {}
    request = Request()
    response = Response()
    hook_data = {'key': 'value'}
    
    result = dispatch_hook('response', hooks, hook_data)
    
    assert result == response

def test_dispatch_hook_with_non_callable_hook():
    hooks = {'response': 'not_a_callable'}
    request = Request()
    response = Response()
    hook_data = {'key': 'value'}
    
    with pytest.raises(TypeError):
        dispatch_hook('response', hooks, hook_data)

def test_dispatch_hook_with_multiple_hooks():
    hooks = {
        'response': [
            lambda r, *args, **kwargs: r,
            lambda r, *args, **kwargs: r
        ]
    }
    request = Request()
    response = Response()
    hook_data = {'key': 'value'}
    
    result = dispatch_hook('response', hooks, hook_data)
    
    assert result == response

def test_dispatch_hook_with_invalid_key():
    hooks = {'response': [lambda r, *args, **kwargs: r]}
    request = Request()
    response = Response()
    hook_data = {'key': 'value'}
    
    result = dispatch_hook('invalid_key', hooks, hook_data)
    
    assert result == response
import pytest
from requests.models import PreparedRequest

def test_register_hook_unsupported_event():
    req = PreparedRequest()
    with pytest.raises(ValueError, match='Unsupported event specified'):
        req.register_hook('unsupported_event', lambda: None)

def test_register_hook_single_callable():
    req = PreparedRequest()
    req.hooks = {'response': []}
    req.register_hook('response', lambda: None)
    assert len(req.hooks['response']) == 1

def test_register_hook_multiple_callables():
    req = PreparedRequest()
    req.hooks = {'response': []}
    req.register_hook('response', [lambda: None, lambda: None])
    assert len(req.hooks['response']) == 2

def test_register_hook_iterable_with_non_callable():
    req = PreparedRequest()
    req.hooks = {'response': []}
    req.register_hook('response', [lambda: None, 42])
    assert len(req.hooks['response']) == 1

def test_register_hook_empty_iterable():
    req = PreparedRequest()
    req.hooks = {'response': []}
    req.register_hook('response', [])
    assert len(req.hooks['response']) == 0
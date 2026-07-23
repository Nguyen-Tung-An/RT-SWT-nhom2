import pytest
from requests.hooks import dispatch_hook

def mock_hook(response, **kwargs):
    return response.text + " modified"

def mock_hook_none(response, **kwargs):
    return None

def test_dispatch_hook_with_callable_hook():
    response = type('Response', (object,), {'text': 'original'})()
    hooks = {'key': mock_hook}
    modified_response = dispatch_hook('key', hooks, response)
    assert modified_response.text == 'original modified'

def test_dispatch_hook_with_callable_hook_returning_none():
    response = type('Response', (object,), {'text': 'original'})()
    hooks = {'key': mock_hook_none}
    modified_response = dispatch_hook('key', hooks, response)
    assert modified_response.text == 'original'

def test_dispatch_hook_with_multiple_hooks():
    def hook1(response, **kwargs):
        return response.text + " from hook1"

    def hook2(response, **kwargs):
        return response.text + " from hook2"

    response = type('Response', (object,), {'text': 'original'})()
    hooks = {'key': [hook1, hook2]}
    modified_response = dispatch_hook('key', hooks, response)
    assert modified_response.text == 'original from hook1 from hook2'

def test_dispatch_hook_with_no_hooks():
    response = type('Response', (object,), {'text': 'original'})()
    modified_response = dispatch_hook('key', None, response)
    assert modified_response.text == 'original'

def test_dispatch_hook_with_non_callable_hook():
    response = type('Response', (object,), {'text': 'original'})()
    hooks = {'key': 'not_a_callable'}
    modified_response = dispatch_hook('key', hooks, response)
    assert modified_response.text == 'original'
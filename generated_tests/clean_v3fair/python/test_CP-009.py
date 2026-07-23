import pytest
from requests.hooks import dispatch_hook

def mock_hook(data, **kwargs):
    return data + " modified"

def test_dispatch_hook_with_callable_hook():
    result = dispatch_hook('test_key', {'test_key': mock_hook}, 'original data')
    assert result == 'original data modified'

def test_dispatch_hook_with_multiple_hooks():
    def hook1(data, **kwargs):
        return data + " from hook1"

    def hook2(data, **kwargs):
        return data + " from hook2"

    result = dispatch_hook('test_key', {'test_key': [hook1, hook2]}, 'original data')
    assert result == 'original data from hook1 from hook2'

def test_dispatch_hook_with_none_hooks():
    result = dispatch_hook('test_key', None, 'original data')
    assert result == 'original data'

def test_dispatch_hook_with_non_callable_hook():
    result = dispatch_hook('test_key', {'test_key': 'not_a_callable'}, 'original data')
    assert result == 'original data'

def test_dispatch_hook_with_empty_hooks():
    result = dispatch_hook('test_key', {}, 'original data')
    assert result == 'original data'

def test_dispatch_hook_with_hook_returning_none():
    def hook_returning_none(data, **kwargs):
        return None

    result = dispatch_hook('test_key', {'test_key': hook_returning_none}, 'original data')
    assert result == 'original data'
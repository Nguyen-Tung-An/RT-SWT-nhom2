import pytest
from requests.models import RequestHooksMixin

@pytest.fixture
def request_hooks_mixin():
    return RequestHooksMixin()

def test_register_hook_valid_event_single_hook(request_hooks_mixin):
    request_hooks_mixin.hooks = {'response': []}
    def sample_hook(response):
        return response
    request_hooks_mixin.register_hook('response', sample_hook)
    assert sample_hook in request_hooks_mixin.hooks['response']

def test_register_hook_valid_event_multiple_hooks(request_hooks_mixin):
    request_hooks_mixin.hooks = {'response': []}
    def hook_one(response):
        return response
    def hook_two(response):
        return response
    request_hooks_mixin.register_hook('response', [hook_one, hook_two])
    assert hook_one in request_hooks_mixin.hooks['response']
    assert hook_two in request_hooks_mixin.hooks['response']

def test_register_hook_invalid_event(request_hooks_mixin):
    request_hooks_mixin.hooks = {'response': []}
    with pytest.raises(ValueError, match='Unsupported event specified'):
        request_hooks_mixin.register_hook('invalid_event', lambda x: x)

def test_register_hook_empty_hooks_list(request_hooks_mixin):
    request_hooks_mixin.hooks = {'response': []}
    request_hooks_mixin.register_hook('response', [])
    assert len(request_hooks_mixin.hooks['response']) == 0

def test_register_hook_non_callable_single(request_hooks_mixin):
    request_hooks_mixin.hooks = {'response': []}
    request_hooks_mixin.register_hook('response', 123)
    assert len(request_hooks_mixin.hooks['response']) == 0

def test_register_hook_non_callable_multiple(request_hooks_mixin):
    request_hooks_mixin.hooks = {'response': []}
    request_hooks_mixin.register_hook('response', [123, 'not_a_hook'])
    assert len(request_hooks_mixin.hooks['response']) == 0
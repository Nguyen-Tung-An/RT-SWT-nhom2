import pytest
from requests.models import RequestHooksMixin

class TestRequestHooksMixin:
    def setup_method(self):
        self.mixin = RequestHooksMixin()

    def test_register_hook_valid_event_single_hook(self):
        self.mixin.hooks = {'event1': []}
        self.mixin.register_hook('event1', lambda x: x)
        assert len(self.mixin.hooks['event1']) == 1

    def test_register_hook_valid_event_multiple_hooks(self):
        self.mixin.hooks = {'event1': []}
        self.mixin.register_hook('event1', [lambda x: x, lambda y: y])
        assert len(self.mixin.hooks['event1']) == 2

    def test_register_hook_invalid_event(self):
        self.mixin.hooks = {'event1': []}
        with pytest.raises(ValueError, match='Unsupported event specified'):
            self.mixin.register_hook('invalid_event', lambda x: x)

    def test_register_hook_empty_iterable(self):
        self.mixin.hooks = {'event1': []}
        self.mixin.register_hook('event1', [])
        assert len(self.mixin.hooks['event1']) == 0

    def test_register_hook_non_callable(self):
        self.mixin.hooks = {'event1': []}
        self.mixin.register_hook('event1', 123)
        assert len(self.mixin.hooks['event1']) == 0
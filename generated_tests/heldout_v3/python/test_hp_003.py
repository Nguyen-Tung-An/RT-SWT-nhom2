import pytest
from requests.models import RequestHooksMixin

class TestRequestHooksMixin:
    def setup_method(self):
        self.mixin = RequestHooksMixin()

    def test_register_hook_valid_event(self):
        result = self.mixin.register_hook('response', lambda r, *args, **kwargs: r)
        assert result is not None  # Check that the hook is registered

    def test_register_hook_invalid_event(self):
        with pytest.raises(ValueError):
            self.mixin.register_hook('invalid_event', lambda r, *args, **kwargs: r)

    def test_register_hook_none_event(self):
        with pytest.raises(ValueError):
            self.mixin.register_hook(None, lambda r, *args, **kwargs: r)

    def test_register_hook_empty_event(self):
        with pytest.raises(ValueError):
            self.mixin.register_hook('', lambda r, *args, **kwargs: r)

    def test_register_hook_valid_hook(self):
        result = self.mixin.register_hook('response', lambda r, *args, **kwargs: r)
        assert result is not None  # Check that the hook is registered

    def test_register_hook_invalid_hook(self):
        with pytest.raises(TypeError):
            self.mixin.register_hook('response', None)

    def test_register_hook_multiple_hooks(self):
        hook1 = lambda r, *args, **kwargs: r
        hook2 = lambda r, *args, **kwargs: r
        result1 = self.mixin.register_hook('response', hook1)
        result2 = self.mixin.register_hook('response', hook2)
        assert result1 is not None
        assert result2 is not None
        assert result1 != result2  # Ensure different hooks are registered

    def test_register_hook_same_hook_twice(self):
        hook = lambda r, *args, **kwargs: r
        result1 = self.mixin.register_hook('response', hook)
        result2 = self.mixin.register_hook('response', hook)
        assert result1 is not None
        assert result2 is not None
        assert result1 == result2  # Ensure the same hook returns the same reference
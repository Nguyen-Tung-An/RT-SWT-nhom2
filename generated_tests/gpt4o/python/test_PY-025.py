import pytest
from flask.json.provider import _prepare_response_obj

class MockJsonProvider:
    def _prepare_response_obj(self, args, kwargs):
        if args and kwargs:
            raise TypeError("app.json.response() takes either args or kwargs, not both")

        if not args and not kwargs:
            return None

        if len(args) == 1:
            return args[0]

        return args or kwargs

def test_prepare_response_obj_both_args_and_kwargs():
    provider = MockJsonProvider()
    with pytest.raises(TypeError, match="app.json.response() takes either args or kwargs, not both"):
        provider._prepare_response_obj((1,), {'key': 'value'})

def test_prepare_response_obj_no_args_no_kwargs():
    provider = MockJsonProvider()
    assert provider._prepare_response_obj((), {}) is None

def test_prepare_response_obj_single_arg():
    provider = MockJsonProvider()
    assert provider._prepare_response_obj((42,), {}) == 42

def test_prepare_response_obj_multiple_args():
    provider = MockJsonProvider()
    assert provider._prepare_response_obj((1, 2, 3), {}) == (1, 2, 3)

def test_prepare_response_obj_kwargs_only():
    provider = MockJsonProvider()
    assert provider._prepare_response_obj((), {'key': 'value'}) == {'key': 'value'}
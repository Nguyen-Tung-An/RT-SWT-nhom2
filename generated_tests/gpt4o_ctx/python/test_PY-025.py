import pytest
from flask.json.provider import _prepare_response_obj

class MockJSONProvider:
    def _prepare_response_obj(self, args, kwargs):
        return _prepare_response_obj(self, args, kwargs)

def test_prepare_response_obj_both_args_and_kwargs():
    provider = MockJSONProvider()
    with pytest.raises(TypeError, match="app.json.response() takes either args or kwargs, not both"):
        provider._prepare_response_obj((1,), {'key': 'value'})

def test_prepare_response_obj_no_args_no_kwargs():
    provider = MockJSONProvider()
    assert provider._prepare_response_obj((), {}) is None

def test_prepare_response_obj_single_arg():
    provider = MockJSONProvider()
    assert provider._prepare_response_obj((42,), {}) == 42

def test_prepare_response_obj_multiple_args():
    provider = MockJSONProvider()
    assert provider._prepare_response_obj((1, 2, 3), {}) == (1, 2, 3)

def test_prepare_response_obj_kwargs_only():
    provider = MockJSONProvider()
    assert provider._prepare_response_obj((), {'key': 'value'}) == {'key': 'value'}
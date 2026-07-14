import pytest
from flask.json.provider import JSONProvider

class MockJSONProvider(JSONProvider):
    def response(self, *args, **kwargs):
        return super().response(*args, **kwargs)

def test_prepare_response_obj_both_args_and_kwargs():
    provider = MockJSONProvider(None)
    with pytest.raises(TypeError, match="app.json.response() takes either args or kwargs, not both"):
        provider.response((1,), {'key': 'value'})

def test_prepare_response_obj_no_args_no_kwargs():
    provider = MockJSONProvider(None)
    assert provider.response() is None

def test_prepare_response_obj_single_arg():
    provider = MockJSONProvider(None)
    assert provider.response(42) == 42

def test_prepare_response_obj_multiple_args():
    provider = MockJSONProvider(None)
    assert provider.response(1, 2, 3) == (1, 2, 3)

def test_prepare_response_obj_kwargs_only():
    provider = MockJSONProvider(None)
    assert provider.response(key='value') == {'key': 'value'}
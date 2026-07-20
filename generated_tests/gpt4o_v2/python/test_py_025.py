import pytest
from flask.json.provider import JSONProvider

class TestJSONProvider:

    def setup_method(self):
        self.provider = JSONProvider()

    def test_prepare_response_obj_with_both_args_and_kwargs(self):
        with pytest.raises(TypeError, match="app.json.response() takes either args or kwargs, not both"):
            self.provider._prepare_response_obj((1,), {'key': 'value'})

    def test_prepare_response_obj_with_no_args_and_no_kwargs(self):
        result = self.provider._prepare_response_obj((), {})
        assert result is None

    def test_prepare_response_obj_with_one_arg(self):
        result = self.provider._prepare_response_obj((42,), {})
        assert result == 42

    def test_prepare_response_obj_with_multiple_args(self):
        result = self.provider._prepare_response_obj((1, 2, 3), {})
        assert result == (1, 2, 3)

    def test_prepare_response_obj_with_kwargs_only(self):
        result = self.provider._prepare_response_obj((), {'key': 'value'})
        assert result == {'key': 'value'}

    def test_prepare_response_obj_with_empty_args_and_non_empty_kwargs(self):
        result = self.provider._prepare_response_obj((), {'key': 'value'})
        assert result == {'key': 'value'}

    def test_prepare_response_obj_with_empty_kwargs_and_non_empty_args(self):
        result = self.provider._prepare_response_obj((1, 2), {})
        assert result == (1, 2)
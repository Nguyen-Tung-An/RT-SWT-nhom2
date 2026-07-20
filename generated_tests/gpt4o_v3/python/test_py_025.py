import pytest
from flask import Flask
from flask.json.provider import JSONProvider

class TestJSONProvider:
    @pytest.fixture
    def json_provider(self):
        app = Flask("test_app")
        return JSONProvider(app=app)

    def test_both_args_and_kwargs(self, json_provider):
        with pytest.raises(TypeError, match="app.json.response() takes either args or kwargs, not both"):
            json_provider._prepare_response_obj((1,), {'key': 'value'})

    def test_no_args_no_kwargs(self, json_provider):
        result = json_provider._prepare_response_obj((), {})
        assert result is None

    def test_single_arg(self, json_provider):
        result = json_provider._prepare_response_obj((42,), {})
        assert result == 42

    def test_multiple_args(self, json_provider):
        result = json_provider._prepare_response_obj((1, 2, 3), {})
        assert result == (1, 2, 3)

    def test_kwargs_only(self, json_provider):
        result = json_provider._prepare_response_obj((), {'key': 'value'})
        assert result == {'key': 'value'}
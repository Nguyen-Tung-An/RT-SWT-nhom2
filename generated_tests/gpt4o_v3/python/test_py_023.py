import os
import json
import pytest
import flask
from flask.config import Config

class TestConfigFromPrefixedEnv:
    @pytest.fixture(autouse=True)
    def setup_method(self):
        self.app = flask.Flask('test_app')
        self.config = Config(root_path=str(__import__("tempfile").gettempdir()))

    def test_load_simple_string(self):
        os.environ['FLASK_SIMPLE'] = 'value'
        with self.app.test_request_context('/'):
            self.config.from_prefixed_env('FLASK')
            assert self.config['SIMPLE'] == 'value'

    def test_load_nested_dict(self):
        os.environ['FLASK_NESTED__KEY'] = '{"subkey": "subvalue"}'
        with self.app.test_request_context('/'):
            self.config.from_prefixed_env('FLASK')
            assert self.config['NESTED']['subkey'] == 'subvalue'

    def test_load_invalid_json(self):
        os.environ['FLASK_INVALID_JSON'] = 'not_a_json'
        with self.app.test_request_context('/'):
            self.config.from_prefixed_env('FLASK')
            assert self.config['INVALID_JSON'] == 'not_a_json'

    def test_load_multiple_keys(self):
        os.environ['FLASK_KEY1'] = 'value1'
        os.environ['FLASK_KEY2'] = 'value2'
        with self.app.test_request_context('/'):
            self.config.from_prefixed_env('FLASK')
            assert self.config['KEY1'] == 'value1'
            assert self.config['KEY2'] == 'value2'

    def test_load_nested_dict_with_intermediate_keys(self):
        os.environ['FLASK_NESTED__INTERMEDIATE__KEY'] = 'intermediate_value'
        with self.app.test_request_context('/'):
            self.config.from_prefixed_env('FLASK')
            assert self.config['NESTED']['INTERMEDIATE']['KEY'] == 'intermediate_value'

    def test_load_empty_prefix(self):
        os.environ['FLASK__EMPTY'] = 'empty_value'
        with self.app.test_request_context('/'):
            self.config.from_prefixed_env('FLASK')
            assert self.config['']['EMPTY'] == 'empty_value'

    def test_no_matching_keys(self):
        with self.app.test_request_context('/'):
            result = self.config.from_prefixed_env('FLASK')
            assert result is True
            assert not any(key.startswith('FLASK') for key in self.config)

    def test_load_with_custom_loads_function(self):
        os.environ['FLASK_CUSTOM'] = '42'
        with self.app.test_request_context('/'):
            self.config.from_prefixed_env('FLASK', loads=lambda x: int(x))
            assert self.config['CUSTOM'] == 42
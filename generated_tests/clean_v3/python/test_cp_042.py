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

    def test_load_simple_key(self):
        os.environ['FLASK_SIMPLE_KEY'] = '"simple_value"'
        with self.app.test_request_context('/'):
            result = self.config.from_prefixed_env('FLASK')
            assert result is True
            assert self.config['SIMPLE_KEY'] == 'simple_value'

    def test_load_nested_key(self):
        os.environ['FLASK_NESTED__KEY'] = '"nested_value"'
        with self.app.test_request_context('/'):
            result = self.config.from_prefixed_env('FLASK')
            assert result is True
            assert self.config['NESTED']['KEY'] == 'nested_value'

    def test_load_key_with_invalid_json(self):
        os.environ['FLASK_INVALID_JSON'] = 'not_a_json'
        with self.app.test_request_context('/'):
            result = self.config.from_prefixed_env('FLASK')
            assert result is True
            assert self.config['INVALID_JSON'] == 'not_a_json'

    def test_load_multiple_keys(self):
        os.environ['FLASK_KEY1'] = '"value1"'
        os.environ['FLASK_KEY2'] = '"value2"'
        with self.app.test_request_context('/'):
            result = self.config.from_prefixed_env('FLASK')
            assert result is True
            assert self.config['KEY1'] == 'value1'
            assert self.config['KEY2'] == 'value2'

    def test_load_nested_keys_with_intermediate_dict(self):
        os.environ['FLASK_NESTED__INTERMEDIATE__KEY'] = '"intermediate_value"'
        with self.app.test_request_context('/'):
            result = self.config.from_prefixed_env('FLASK')
            assert result is True
            assert self.config['NESTED']['INTERMEDIATE']['KEY'] == 'intermediate_value'

    def test_no_keys_with_prefix(self):
        os.environ.clear()
        with self.app.test_request_context('/'):
            result = self.config.from_prefixed_env('FLASK')
            assert result is True
            assert len(self.config) == 0

    def test_load_key_with_empty_value(self):
        os.environ['FLASK_EMPTY_KEY'] = '""'
        with self.app.test_request_context('/'):
            result = self.config.from_prefixed_env('FLASK')
            assert result is True
            assert self.config['EMPTY_KEY'] == ''

    def test_load_key_with_special_characters(self):
        os.environ['FLASK_SPECIAL__CHAR__KEY'] = '"value_with_special_chars_!@#$%^&*()"'
        with self.app.test_request_context('/'):
            result = self.config.from_prefixed_env('FLASK')
            assert result is True
            assert self.config['SPECIAL']['CHAR']['KEY'] == 'value_with_special_chars_!@#$%^&*()'
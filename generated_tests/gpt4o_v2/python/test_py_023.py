import os
import pytest
from flask.config import Config

class TestConfigFromPrefixedEnv:
    def setup_method(self):
        self.config = Config()

    def teardown_method(self):
        # Clear environment variables after each test
        for key in list(os.environ.keys()):
            if key.startswith("FLASK_"):
                del os.environ[key]

    def test_load_non_nested_key(self):
        os.environ["FLASK_TEST_KEY"] = '"test_value"'
        result = self.config.from_prefixed_env("FLASK")
        assert result is True
        assert self.config["TEST_KEY"] == "test_value"

    def test_load_nested_key(self):
        os.environ["FLASK_NESTED__KEY"] = '"nested_value"'
        result = self.config.from_prefixed_env("FLASK")
        assert result is True
        assert self.config["NESTED"]["KEY"] == "nested_value"

    def test_load_nested_key_with_intermediate(self):
        os.environ["FLASK_NESTED__INTERMEDIATE__KEY"] = '"intermediate_value"'
        result = self.config.from_prefixed_env("FLASK")
        assert result is True
        assert self.config["NESTED"]["INTERMEDIATE"]["KEY"] == "intermediate_value"

    def test_load_key_with_invalid_json(self):
        os.environ["FLASK_INVALID_JSON_KEY"] = 'invalid_json'
        result = self.config.from_prefixed_env("FLASK")
        assert result is True
        assert self.config["INVALID_JSON_KEY"] == "invalid_json"

    def test_load_multiple_keys(self):
        os.environ["FLASK_KEY1"] = '"value1"'
        os.environ["FLASK_KEY2"] = '"value2"'
        result = self.config.from_prefixed_env("FLASK")
        assert result is True
        assert self.config["KEY1"] == "value1"
        assert self.config["KEY2"] == "value2"

    def test_no_keys_with_prefix(self):
        result = self.config.from_prefixed_env("FLASK")
        assert result is True
        assert len(self.config) == 0

    def test_load_nested_key_with_nonexistent_intermediate(self):
        os.environ["FLASK_NEW_NESTED__KEY"] = '"new_value"'
        result = self.config.from_prefixed_env("FLASK")
        assert result is True
        assert self.config["NEW_NESTED"]["KEY"] == "new_value"
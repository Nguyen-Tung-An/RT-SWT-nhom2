import os
import pytest
from flask.config import Config

@pytest.fixture
def config_with_env(monkeypatch):
    monkeypatch.setenv("FLASK_KEY1", "value1")
    monkeypatch.setenv("FLASK_KEY2", '{"nested": "value2"}')
    monkeypatch.setenv("FLASK_KEY3__SUBKEY", "subvalue3")
    monkeypatch.setenv("FLASK_INVALID_JSON", "not_a_json")
    
    config = Config(root_path="", defaults={})
    return config

def test_from_prefixed_env_non_nested(config_with_env):
    config_with_env.from_prefixed_env("FLASK")
    assert config_with_env["KEY1"] == "value1"
    assert config_with_env["KEY2"] == {"nested": "value2"}

def test_from_prefixed_env_nested(config_with_env):
    config_with_env.from_prefixed_env("FLASK")
    assert config_with_env["KEY3"]["SUBKEY"] == "subvalue3"

def test_from_prefixed_env_invalid_json(config_with_env):
    config_with_env.from_prefixed_env("FLASK")
    assert config_with_env["INVALID_JSON"] == "not_a_json"

def test_from_prefixed_env_no_prefix(config_with_env):
    config_with_env.from_prefixed_env("NON_EXISTENT_PREFIX")
    assert len(config_with_env) == 0
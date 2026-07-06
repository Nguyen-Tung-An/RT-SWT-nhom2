import os
import json
import pytest
from flask.config import Config

@pytest.fixture
def config_instance():
    return Config()

def test_from_prefixed_env_single_key(config_instance, monkeypatch):
    monkeypatch.setenv('FLASK_TEST_KEY', 'test_value')
    config_instance.from_prefixed_env()
    assert config_instance['TEST_KEY'] == 'test_value'

def test_from_prefixed_env_nested_key(config_instance, monkeypatch):
    monkeypatch.setenv('FLASK_NESTED__KEY', '{"sub_key": "sub_value"}')
    config_instance.from_prefixed_env()
    assert config_instance['NESTED']['sub_key'] == 'sub_value'

def test_from_prefixed_env_invalid_json(config_instance, monkeypatch):
    monkeypatch.setenv('FLASK_INVALID_JSON', 'not_a_json')
    config_instance.from_prefixed_env()
    assert config_instance['INVALID_JSON'] == 'not_a_json'

def test_from_prefixed_env_multiple_keys(config_instance, monkeypatch):
    monkeypatch.setenv('FLASK_KEY1', 'value1')
    monkeypatch.setenv('FLASK_KEY2', 'value2')
    config_instance.from_prefixed_env()
    assert config_instance['KEY1'] == 'value1'
    assert config_instance['KEY2'] == 'value2'

def test_from_prefixed_env_ignore_non_prefixed_keys(config_instance, monkeypatch):
    monkeypatch.setenv('NOT_FLASK_KEY', 'should_not_load')
    config_instance.from_prefixed_env()
    assert 'NOT_FLASK_KEY' not in config_instance

def test_from_prefixed_env_empty_prefix(config_instance, monkeypatch):
    monkeypatch.setenv('FLASK__EMPTY', 'empty_value')
    config_instance.from_prefixed_env(prefix='FLASK')
    assert config_instance['EMPTY'] == 'empty_value'
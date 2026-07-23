import os
import json
import pytest
import flask

from flask.config import Config

@pytest.fixture
def app():
    app = flask.Flask('test_app')
    with app.test_request_context('/'):
        yield app

@pytest.fixture
def config(app):
    return Config(root_path=str(__import__("tempfile").gettempdir()))

def test_from_prefixed_env_single_value(config, app):
    os.environ['FLASK_TEST_KEY'] = 'test_value'
    with app.test_request_context('/'):
        config.from_prefixed_env('FLASK')
    assert config['TEST_KEY'] == 'test_value'

def test_from_prefixed_env_nested_value(config, app):
    os.environ['FLASK_NESTED__KEY'] = '{"sub_key": "sub_value"}'
    with app.test_request_context('/'):
        config.from_prefixed_env('FLASK')
    assert config['NESTED']['sub_key'] == 'sub_value'

def test_from_prefixed_env_invalid_json(config, app):
    os.environ['FLASK_INVALID_JSON'] = 'not_a_json'
    with app.test_request_context('/'):
        config.from_prefixed_env('FLASK')
    assert config['INVALID_JSON'] == 'not_a_json'

def test_from_prefixed_env_multiple_keys(config, app):
    os.environ['FLASK_KEY1'] = 'value1'
    os.environ['FLASK_KEY2'] = 'value2'
    with app.test_request_context('/'):
        config.from_prefixed_env('FLASK')
    assert config['KEY1'] == 'value1'
    assert config['KEY2'] == 'value2'

def test_from_prefixed_env_nested_and_flat(config, app):
    os.environ['FLASK_NESTED__KEY'] = '{"sub_key": "sub_value"}'
    os.environ['FLASK_FLAT_KEY'] = 'flat_value'
    with app.test_request_context('/'):
        config.from_prefixed_env('FLASK')
    assert config['NESTED']['sub_key'] == 'sub_value'
    assert config['FLAT_KEY'] == 'flat_value'

def test_from_prefixed_env_no_prefix(config, app):
    os.environ['TEST_KEY'] = 'no_prefix_value'
    with app.test_request_context('/'):
        config.from_prefixed_env('FLASK')
    assert 'TEST_KEY' not in config

def test_from_prefixed_env_empty_prefix(config, app):
    os.environ['FLASK__EMPTY'] = 'empty_value'
    with app.test_request_context('/'):
        config.from_prefixed_env('FLASK')
    assert config['EMPTY'] == 'empty_value'
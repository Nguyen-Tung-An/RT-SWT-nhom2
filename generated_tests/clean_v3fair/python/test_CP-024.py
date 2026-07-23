import os
import errno
import json
import tomllib
import pytest
import flask

from flask.config import Config

@pytest.fixture
def config():
    return Config(root_path=str(__import__("tempfile").gettempdir()))

def test_from_file_json_load_success(config):
    test_file = os.path.join(config.root_path, 'test_config.json')
    with open(test_file, 'w') as f:
        json.dump({'key': 'value'}, f)
    
    with config.app.test_request_context('/'):
        assert config.from_file(test_file, load=json.load) is True
        assert config['key'] == 'value'

def test_from_file_toml_load_success(config):
    test_file = os.path.join(config.root_path, 'test_config.toml')
    with open(test_file, 'wb') as f:
        tomllib.dump({'key': 'value'}, f)
    
    with config.app.test_request_context('/'):
        assert config.from_file(test_file, load=tomllib.load, text=False) is True
        assert config['key'] == 'value'

def test_from_file_file_not_exist_silent(config):
    with config.app.test_request_context('/'):
        assert config.from_file('non_existent_file.json', load=json.load, silent=True) is False

def test_from_file_file_not_exist_no_silent(config):
    with config.app.test_request_context('/'):
        with pytest.raises(OSError) as excinfo:
            config.from_file('non_existent_file.json', load=json.load)
        assert excinfo.value.errno == errno.ENOENT

def test_from_file_directory_instead_of_file(config):
    os.mkdir(os.path.join(config.root_path, 'test_directory'))
    with config.app.test_request_context('/'):
        with pytest.raises(OSError) as excinfo:
            config.from_file('test_directory', load=json.load)
        assert excinfo.value.errno == errno.EISDIR
    os.rmdir(os.path.join(config.root_path, 'test_directory'))

def test_from_file_invalid_json(config):
    test_file = os.path.join(config.root_path, 'invalid_config.json')
    with open(test_file, 'w') as f:
        f.write("invalid json")
    
    with config.app.test_request_context('/'):
        with pytest.raises(OSError) as excinfo:
            config.from_file(test_file, load=json.load)
        assert "Unable to load configuration file" in str(excinfo.value)
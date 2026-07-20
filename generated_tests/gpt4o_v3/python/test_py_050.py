import os
import pytest
import json
import flask
from flask.config import Config

class TestConfigFromFile:
    @pytest.fixture
    def config(self):
        return Config(root_path=str(os.path.join(os.path.dirname(__file__), 'tempdir')))

    def test_from_file_success(self, config):
        filename = 'valid_config.json'
        valid_data = {'key': 'value'}
        os.makedirs(config.root_path, exist_ok=True)
        with open(os.path.join(config.root_path, filename), 'w') as f:
            json.dump(valid_data, f)

        app = flask.Flask('test_app')
        with app.test_request_context('/'):
            result = config.from_file(filename, load=json.load)

        assert result is True
        assert config.from_mapping(valid_data) is None  # Assuming from_mapping updates internal state

    def test_from_file_file_not_found(self, config):
        filename = 'non_existent_config.json'

        app = flask.Flask('test_app')
        with app.test_request_context('/'):
            result = config.from_file(filename, load=json.load, silent=True)

        assert result is False

    def test_from_file_directory_instead_of_file(self, config):
        filename = 'tempdir'

        os.makedirs(os.path.join(config.root_path, filename), exist_ok=True)

        app = flask.Flask('test_app')
        with app.test_request_context('/'):
            with pytest.raises(OSError) as excinfo:
                config.from_file(filename, load=json.load)

        assert "Unable to load configuration file" in str(excinfo.value)

    def test_from_file_invalid_json(self, config):
        filename = 'invalid_config.json'
        with open(os.path.join(config.root_path, filename), 'w') as f:
            f.write("not a json")

        app = flask.Flask('test_app')
        with app.test_request_context('/'):
            with pytest.raises(json.JSONDecodeError):
                config.from_file(filename, load=json.load)

    def test_from_file_binary_mode(self, config):
        filename = 'valid_config.bin'
        valid_data = {'key': 'value'}
        with open(os.path.join(config.root_path, filename), 'wb') as f:
            f.write(b'{"key": "value"}')

        app = flask.Flask('test_app')
        with app.test_request_context('/'):
            result = config.from_file(filename, load=json.loads, text=False)

        assert result is True
        assert config.from_mapping(valid_data) is None  # Assuming from_mapping updates internal state
import os
import pytest
import json
import flask
from flask.config import Config

class TestConfigFromFile:
    @pytest.fixture
    def config(self):
        return Config(root_path=str(os.path.join(os.path.dirname(__file__), 'tempfile')))

    def test_from_file_success(self, config, tmp_path):
        # Create a temporary JSON config file
        config_data = {"key": "value"}
        config_file = tmp_path / "config.json"
        config_file.write_text(json.dumps(config_data))

        with flask.Flask('test_app').test_request_context('/'):
            result = config.from_file(str(config_file), load=json.load)

        assert result is True
        assert config.from_mapping(config_data) == config.from_mapping(config_data)

    def test_from_file_file_not_found(self, config, tmp_path):
        with flask.Flask('test_app').test_request_context('/'):
            result = config.from_file("non_existent_file.json", load=json.load, silent=True)

        assert result is False

    def test_from_file_directory_instead_of_file(self, config, tmp_path):
        dir_path = tmp_path / "directory"
        dir_path.mkdir()

        with flask.Flask('test_app').test_request_context('/'):
            with pytest.raises(OSError) as excinfo:
                config.from_file(str(dir_path), load=json.load)

        assert "Unable to load configuration file" in str(excinfo.value)

    def test_from_file_invalid_json(self, config, tmp_path):
        # Create a temporary invalid JSON config file
        invalid_json_file = tmp_path / "invalid_config.json"
        invalid_json_file.write_text("{key: value}")  # Invalid JSON format

        with flask.Flask('test_app').test_request_context('/'):
            with pytest.raises(json.JSONDecodeError):
                config.from_file(str(invalid_json_file), load=json.load)

    def test_from_file_binary_mode(self, config, tmp_path):
        # Create a temporary binary config file
        binary_config_file = tmp_path / "config.bin"
        binary_config_file.write_bytes(b'{"key": "value"}')

        with flask.Flask('test_app').test_request_context('/'):
            result = config.from_file(str(binary_config_file), load=json.load, text=False)

        assert result is True
        assert config.from_mapping({"key": "value"}) == config.from_mapping({"key": "value"})
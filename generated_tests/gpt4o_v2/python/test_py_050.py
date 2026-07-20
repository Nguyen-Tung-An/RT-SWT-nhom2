import pytest
import os
import json
from flask.config import Config

class TestConfigFromFile:
    def setup_method(self):
        self.config = Config()
        self.config.root_path = os.getcwd()  # Set root_path to current working directory

    def test_from_file_success(self, tmp_path):
        # Create a temporary JSON file
        config_data = {"key": "value"}
        config_file = tmp_path / "config.json"
        config_file.write_text(json.dumps(config_data))

        # Call the method
        result = self.config.from_file("config.json", load=json.load)

        # Assert the return value and the internal state
        assert result is True
        assert self.config.from_mapping(config_data) is None  # Assuming from_mapping updates internal state

    def test_from_file_file_not_found(self, tmp_path):
        # Call the method with a non-existent file
        result = self.config.from_file("non_existent.json", load=json.load, silent=True)

        # Assert the return value
        assert result is False

    def test_from_file_directory_instead_of_file(self, tmp_path):
        # Create a temporary directory
        dir_path = tmp_path / "config_dir"
        dir_path.mkdir()

        # Call the method with a directory path
        with pytest.raises(OSError) as excinfo:
            self.config.from_file("config_dir", load=json.load)

        # Assert the exception message
        assert "Unable to load configuration file" in str(excinfo.value)

    def test_from_file_binary_mode(self, tmp_path):
        # Create a temporary binary file
        config_data = {"key": "value"}
        config_file = tmp_path / "config.bin"
        config_file.write_bytes(json.dumps(config_data).encode('utf-8'))

        # Call the method in binary mode
        result = self.config.from_file("config.bin", load=json.load, text=False)

        # Assert the return value and the internal state
        assert result is True
        assert self.config.from_mapping(config_data) is None  # Assuming from_mapping updates internal state

    def test_from_file_invalid_json(self, tmp_path):
        # Create a temporary invalid JSON file
        config_file = tmp_path / "invalid_config.json"
        config_file.write_text("invalid json")

        # Call the method and assert it raises a JSONDecodeError
        with pytest.raises(json.JSONDecodeError):
            self.config.from_file("invalid_config.json", load=json.load)
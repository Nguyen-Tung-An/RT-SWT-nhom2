import pytest
import os
import json
import tomllib
from flask import Flask

app = Flask(__name__)

def mock_load_json(file):
    return json.load(file)

def mock_load_toml(file):
    return tomllib.load(file)

def test_from_file_json_success(tmp_path):
    config_file = tmp_path / "config.json"
    config_file.write_text('{"key": "value"}')
    assert app.config.from_file(config_file, load=mock_load_json) is True
    assert app.config["key"] == "value"

def test_from_file_toml_success(tmp_path):
    config_file = tmp_path / "config.toml"
    config_file.write_text('key = "value"')
    assert app.config.from_file(config_file, load=mock_load_toml, text=False) is True
    assert app.config["key"] == "value"

def test_from_file_json_file_not_found():
    with pytest.raises(OSError):
        app.config.from_file("non_existent.json", load=mock_load_json)

def test_from_file_json_file_not_found_silent():
    assert app.config.from_file("non_existent.json", load=mock_load_json, silent=True) is False

def test_from_file_directory_instead_of_file():
    with pytest.raises(OSError):
        app.config.from_file(".", load=mock_load_json)

def test_from_file_binary_mode(tmp_path):
    config_file = tmp_path / "config.bin"
    config_file.write_bytes(b'{"key": "value"}')
    assert app.config.from_file(config_file, load=mock_load_json, text=False) is True
    assert app.config["key"] == "value"
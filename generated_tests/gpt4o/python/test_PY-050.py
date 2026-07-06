import pytest
import os
import json
from flask import Flask

@pytest.fixture
def app():
    app = Flask(__name__)
    app.root_path = os.path.dirname(__file__)
    return app

def mock_load(f):
    return json.load(f)

def test_from_file_success(app, tmp_path):
    config_data = {"key": "value"}
    config_file = tmp_path / "config.json"
    with open(config_file, 'w') as f:
        json.dump(config_data, f)

    app.config.from_file(str(config_file), load=mock_load)
    assert app.config["key"] == "value"

def test_from_file_file_not_exist(app):
    with pytest.raises(OSError):
        app.config.from_file("non_existent_file.json", load=mock_load)

def test_from_file_directory_instead_of_file(app, tmp_path):
    dir_path = tmp_path / "directory"
    dir_path.mkdir()

    with pytest.raises(OSError):
        app.config.from_file(str(dir_path), load=mock_load)

def test_from_file_silent_mode(app, tmp_path):
    result = app.config.from_file("non_existent_file.json", load=mock_load, silent=True)
    assert result is False

def test_from_file_binary_mode(app, tmp_path):
    config_data = {"key": "value"}
    config_file = tmp_path / "config.bin"
    with open(config_file, 'wb') as f:
        f.write(json.dumps(config_data).encode())

    app.config.from_file(str(config_file), load=mock_load, text=False)
    assert app.config["key"] == "value"
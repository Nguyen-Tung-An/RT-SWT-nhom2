import pytest
import os
from flask.config import Config

def mock_load(file):
    return {"key": "value"}

def test_from_file_success():
    config = Config(root_path=os.getcwd(), defaults={})
    with open("test_config.json", "w") as f:
        f.write('{"key": "value"}')
    assert config.from_file("test_config.json", load=mock_load) is True
    os.remove("test_config.json")

def test_from_file_file_not_exist():
    config = Config(root_path=os.getcwd(), defaults={})
    assert config.from_file("non_existent_file.json", load=mock_load, silent=True) is False

def test_from_file_directory_instead_of_file():
    config = Config(root_path=os.getcwd(), defaults={})
    os.mkdir("test_directory")
    assert config.from_file("test_directory", load=mock_load, silent=True) is False
    os.rmdir("test_directory")

def test_from_file_load_function_raises_exception():
    config = Config(root_path=os.getcwd(), defaults={})
    with open("test_config_invalid.json", "w") as f:
        f.write('invalid json')
    
    with pytest.raises(Exception):
        config.from_file("test_config_invalid.json", load=mock_load)
    
    os.remove("test_config_invalid.json")
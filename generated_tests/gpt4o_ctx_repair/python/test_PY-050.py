import pytest
import os
from flask.config import Config

def mock_load(file):
    return {"key": "value"}

def test_from_file_success():
    config = Config(root_path=os.getcwd(), defaults={})
    with open("test_config.json", "w") as f:
        f.write('{"key": "value"}')
    assert config.from_file("test_config.json", load=mock_load, silent=False) is True
    os.remove("test_config.json")

def test_from_file_file_not_exist():
    config = Config(root_path=os.getcwd(), defaults={})
    assert config.from_file("non_existent_file.json", load=mock_load, silent=True) is False

def test_from_file_directory_instead_of_file():
    config = Config(root_path=os.getcwd(), defaults={})
    directory_name = "test_directory"
    if not os.path.exists(directory_name):
        os.mkdir(directory_name)
    assert config.from_file(directory_name, load=mock_load, silent=True) is False
    os.rmdir(directory_name)

def test_from_file_load_function_raises_exception():
    config = Config(root_path=os.getcwd(), defaults={})
    with open("test_config_invalid.json", "w") as f:
        f.write('invalid json')
    
    with pytest.raises(Exception):
        config.from_file("test_config_invalid.json", load=lambda x: raise Exception("Load error"), silent=False)
    
    os.remove("test_config_invalid.json")
import os
import pytest
from flask.sansio.scaffold import _find_package_path

def test_find_package_path_valid_module():
    result = _find_package_path("os")
    assert os.path.dirname(os.__file__) == result

def test_find_package_path_valid_package():
    result = _find_package_path("flask")
    assert os.path.dirname(os.path.dirname(os.path.abspath(__file__))) == result

def test_find_package_path_invalid_module():
    result = _find_package_path("non_existent_module")
    assert result == os.getcwd()

def test_find_package_path_main_module():
    result = _find_package_path("__main__")
    assert result == os.getcwd()

def test_find_package_path_namespace_package():
    result = _find_package_path("flask.sansio")
    assert os.path.dirname(os.path.dirname(os.path.abspath(__file__))) == result
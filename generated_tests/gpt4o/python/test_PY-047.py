import os
import pytest
from flask.sansio.scaffold import _find_package_path

def test_find_package_path_valid_module():
    assert _find_package_path("flask") == os.path.dirname(os.path.dirname(__import__("flask").__file__))

def test_find_package_path_valid_submodule():
    assert _find_package_path("flask.sansio") == os.path.dirname(os.path.dirname(__import__("flask.sansio").__file__))

def test_find_package_path_invalid_module():
    assert _find_package_path("non_existent_module") == os.getcwd()

def test_find_package_path_namespace_package():
    # Assuming 'pkg_resources' is a namespace package for testing
    assert _find_package_path("pkg_resources") == os.path.dirname(os.path.dirname(__import__("pkg_resources").__file__))

def test_find_package_path_main_module():
    assert _find_package_path("__main__") == os.getcwd()
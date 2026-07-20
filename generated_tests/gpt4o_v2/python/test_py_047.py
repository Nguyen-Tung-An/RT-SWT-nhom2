import os
import pytest
from flask.sansio.scaffold import _find_package_path

class TestFindPackagePath:
    def test_valid_package(self):
        result = _find_package_path("flask")
        assert os.path.isdir(result)

    def test_valid_submodule(self):
        result = _find_package_path("flask.sansio")
        assert os.path.isdir(result)

    def test_invalid_package(self):
        result = _find_package_path("non_existent_package")
        assert result == os.getcwd()

    def test_main_module(self):
        result = _find_package_path("__main__")
        assert result == os.getcwd()

    def test_namespace_package(self):
        result = _find_package_path("flask.sansio")
        assert os.path.isdir(result)

    def test_valid_module(self):
        result = _find_package_path("json")
        assert os.path.isdir(result)

    def test_empty_string(self):
        result = _find_package_path("")
        assert result == os.getcwd()

    def test_invalid_format(self):
        result = _find_package_path("..invalid..")
        assert result == os.getcwd()
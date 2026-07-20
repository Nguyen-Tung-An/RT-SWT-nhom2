import os
import sys
import pytest
from flask.cli import prepare_import

class TestPrepareImport:
    def test_valid_python_file(self, tmp_path):
        # Create a valid Python file
        file_path = tmp_path / "test_module.py"
        file_path.write_text("# Sample Python file")
        
        result = prepare_import(str(file_path))
        assert result == "test_module"

    def test_valid_init_file(self, tmp_path):
        # Create a directory with __init__.py
        package_path = tmp_path / "test_package"
        package_path.mkdir()
        (package_path / "__init__.py").write_text("# Init file")
        
        file_path = package_path / "test_module.py"
        file_path.write_text("# Sample Python file")
        
        result = prepare_import(str(file_path))
        assert result == "test_package.test_module"

    def test_valid_nested_package(self, tmp_path):
        # Create a nested package structure
        nested_path = tmp_path / "test_package" / "sub_package"
        nested_path.mkdir(parents=True)
        (nested_path / "__init__.py").write_text("# Init file")
        (tmp_path / "test_package" / "__init__.py").write_text("# Init file")
        
        file_path = nested_path / "test_module.py"
        file_path.write_text("# Sample Python file")
        
        result = prepare_import(str(file_path))
        assert result == "test_package.sub_package.test_module"

    def test_non_python_file(self, tmp_path):
        # Create a non-Python file
        file_path = tmp_path / "test_module.txt"
        file_path.write_text("Sample text file")
        
        result = prepare_import(str(file_path))
        assert result == "test_module"

    def test_invalid_path(self):
        # Test with a path that does not exist
        with pytest.raises(FileNotFoundError):
            prepare_import("non_existent_file.py")

    def test_empty_path(self):
        # Test with an empty path
        with pytest.raises(FileNotFoundError):
            prepare_import("")
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
        # Create a directory with an __init__.py file
        dir_path = tmp_path / "test_package"
        dir_path.mkdir()
        init_file = dir_path / "__init__.py"
        init_file.write_text("# Sample init file")
        
        file_path = dir_path / "test_module.py"
        file_path.write_text("# Sample Python file")
        
        result = prepare_import(str(file_path))
        assert result == "test_package.test_module"

    def test_no_extension(self, tmp_path):
        # Create a file without an extension
        file_path = tmp_path / "test_module"
        file_path.write_text("# Sample file without extension")
        
        result = prepare_import(str(file_path))
        assert result == "test_module"

    def test_invalid_path(self):
        # Test with a non-existent path
        with pytest.raises(FileNotFoundError):
            prepare_import("non_existent_file.py")

    def test_directory_as_input(self, tmp_path):
        # Create a directory and test it
        dir_path = tmp_path / "test_directory"
        dir_path.mkdir()
        
        result = prepare_import(str(dir_path))
        assert result == "test_directory"

    def test_empty_path(self):
        # Test with an empty path
        with pytest.raises(FileNotFoundError):
            prepare_import("")
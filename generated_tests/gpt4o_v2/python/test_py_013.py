import os
import sys
import pytest
from flask.cli import prepare_import

class TestPrepareImport:
    def setup_method(self):
        self.original_sys_path = sys.path.copy()
        self.test_dir = os.path.join(os.getcwd(), 'test_dir')
        os.makedirs(self.test_dir, exist_ok=True)

    def teardown_method(self):
        sys.path = self.original_sys_path
        for root, dirs, files in os.walk(self.test_dir, topdown=False):
            for name in files:
                os.remove(os.path.join(root, name))
            for name in dirs:
                os.rmdir(os.path.join(root, name))
        os.rmdir(self.test_dir)

    def test_valid_python_file(self):
        test_file = os.path.join(self.test_dir, 'test_module.py')
        with open(test_file, 'w') as f:
            f.write("print('Hello World')")
        result = prepare_import(test_file)
        assert result == 'test_module'

    def test_valid_init_file(self):
        init_file = os.path.join(self.test_dir, '__init__.py')
        with open(init_file, 'w') as f:
            f.write("print('Init Module')")
        result = prepare_import(self.test_dir)
        assert result == ''

    def test_valid_nested_module(self):
        nested_dir = os.path.join(self.test_dir, 'nested')
        os.makedirs(nested_dir)
        nested_file = os.path.join(nested_dir, 'nested_module.py')
        with open(nested_file, 'w') as f:
            f.write("print('Nested Module')")
        result = prepare_import(nested_file)
        assert result == 'nested.nested_module'

    def test_non_python_file(self):
        non_python_file = os.path.join(self.test_dir, 'test_module.txt')
        with open(non_python_file, 'w') as f:
            f.write("This is a text file.")
        result = prepare_import(non_python_file)
        assert result == 'test_module'

    def test_empty_path(self):
        with pytest.raises(FileNotFoundError):
            prepare_import('')

    def test_non_existent_file(self):
        with pytest.raises(FileNotFoundError):
            prepare_import('non_existent_file.py')

    def test_path_with_no_init(self):
        no_init_dir = os.path.join(self.test_dir, 'no_init')
        os.makedirs(no_init_dir)
        result = prepare_import(no_init_dir)
        assert result == ''
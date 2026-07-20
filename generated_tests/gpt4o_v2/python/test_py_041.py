import os
import pytest
from flask.helpers import get_root_path

class TestGetRootPath:
    def test_existing_module(self):
        """Test with an existing module."""
        result = get_root_path('flask')
        assert os.path.isdir(result)

    def test_existing_package(self):
        """Test with an existing package."""
        result = get_root_path('flask.helpers')
        assert os.path.isdir(result)

    def test_non_existent_module(self):
        """Test with a non-existent module."""
        result = get_root_path('non_existent_module')
        assert result == os.getcwd()

    def test_main_module(self):
        """Test with the main module (interactive session)."""
        result = get_root_path('__main__')
        assert result == os.getcwd()

    def test_namespace_package(self):
        """Test with a namespace package."""
        # Assuming 'pkg_resources' is a namespace package
        result = get_root_path('pkg_resources')
        assert os.path.isdir(result)

    def test_module_without_file(self):
        """Test with a module that has no __file__ attribute."""
        # Create a dummy module without a __file__ attribute
        class DummyModule:
            pass

        import sys
        sys.modules['dummy_module'] = DummyModule()
        result = get_root_path('dummy_module')
        assert result == os.getcwd()
        del sys.modules['dummy_module']  # Clean up
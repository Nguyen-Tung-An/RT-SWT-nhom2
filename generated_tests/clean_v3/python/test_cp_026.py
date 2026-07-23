import os
import pytest
from flask.helpers import get_root_path

class TestGetRootPath:
    def test_valid_module(self):
        assert get_root_path('flask') == os.path.dirname(os.path.abspath(__file__))

    def test_valid_package(self):
        assert get_root_path('flask.helpers') == os.path.dirname(os.path.abspath(__file__))

    def test_invalid_module(self):
        with pytest.raises(ValueError):
            get_root_path('non_existent_module')

    def test_main_module_without_path(self):
        # Simulate the main module without a path
        import sys
        sys.modules['__main__'] = type(sys)('main')
        assert get_root_path('__main__') == os.getcwd()

    def test_namespace_package(self):
        # Create a temporary namespace package
        import pkg_resources
        pkg_resources.declare_namespace('namespace_package')
        assert get_root_path('namespace_package') == os.getcwd()
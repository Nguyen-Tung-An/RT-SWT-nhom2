import os
import pytest
from flask.helpers import get_root_path

def test_get_root_path_existing_module():
    assert get_root_path('flask') == os.path.dirname(os.path.abspath(__file__))

def test_get_root_path_non_existent_module():
    assert get_root_path('non_existent_module') == os.getcwd()

def test_get_root_path_namespace_package():
    # Assuming 'flask' is a namespace package, this should return the current working directory
    assert get_root_path('flask') == os.path.dirname(os.path.abspath(__file__))

def test_get_root_path_main_module():
    assert get_root_path('__main__') == os.getcwd()
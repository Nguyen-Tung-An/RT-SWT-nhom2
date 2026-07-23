import os
import sys
import pathlib
import pytest
from flask.sansio.scaffold import find_package

def test_find_package_installed_system():
    # Assuming 'os' is installed in the system
    result = find_package('os')
    assert result[0] == os.path.abspath(sys.prefix)
    assert pathlib.PurePath(result[1]).is_relative_to(result[0])

def test_find_package_installed_virtualenv():
    # Assuming 'flask' is installed in a virtualenv
    result = find_package('flask')
    assert result[0] is not None
    assert 'site-packages' in result[1]

def test_find_package_not_installed():
    result = find_package('non_existent_package')
    assert result[0] is None
    assert result[1] == os.path.join(os.getcwd(), 'non_existent_package')

def test_find_package_installed_site_packages():
    # Assuming 'numpy' is installed in site-packages
    result = find_package('numpy')
    assert result[0] is not None
    assert 'site-packages' in result[1]

def test_find_package_installed_custom_path():
    # Assuming a package is installed in a custom path
    custom_package = 'custom_package'
    result = find_package(custom_package)
    assert result[0] is not None
    assert result[1] == os.path.join(os.getcwd(), custom_package)
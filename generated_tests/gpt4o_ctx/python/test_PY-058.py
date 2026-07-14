import pytest
from flask.sansio.scaffold import find_package

def test_find_package_installed_system():
    # Assuming 'os' is installed in the system
    result = find_package('os')
    assert result[0] is not None
    assert 'site-packages' in result[1]

def test_find_package_installed_virtualenv():
    # Assuming 'requests' is installed in a virtualenv
    result = find_package('requests')
    assert result[0] is not None
    assert 'site-packages' in result[1]

def test_find_package_not_installed():
    result = find_package('non_existent_package')
    assert result[0] is None
    assert 'non_existent_package' in result[1]

def test_find_package_current_directory():
    # Assuming a package is in the current directory
    result = find_package('current_directory_package')
    assert result[0] is None
    assert 'current_directory_package' in result[1]
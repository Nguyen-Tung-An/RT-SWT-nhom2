import pytest
from flask.sansio.scaffold import find_package

def test_find_package_installed_system():
    result = find_package("flask")
    assert result[0] is not None
    assert "site-packages" in result[1]

def test_find_package_installed_virtualenv():
    result = find_package("some_virtualenv_package")
    assert result[0] is not None
    assert "site-packages" in result[1]

def test_find_package_not_installed():
    result = find_package("non_existent_package")
    assert result[0] is None
    assert "non_existent_package" in result[1]

def test_find_package_relative_path():
    result = find_package("relative_package")
    assert result[0] is None
    assert "relative_package" in result[1]
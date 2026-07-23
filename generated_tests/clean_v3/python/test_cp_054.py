import pytest
import sys
import os
from flask.sansio.scaffold import find_package

class TestFindPackage:
    def test_package_installed_system(self):
        # Assuming 'flask' is installed in the system
        result = find_package('flask')
        assert result[0] == os.path.abspath(sys.prefix)
        assert 'flask' in result[1]

    def test_package_installed_virtualenv(self):
        # Assuming 'requests' is installed in a virtualenv
        result = find_package('requests')
        assert result[0] is not None
        assert 'requests' in result[1]

    def test_package_not_installed(self):
        # Testing a package that is not installed
        result = find_package('non_existent_package')
        assert result[0] is None
        assert 'non_existent_package' in result[1]

    def test_package_installed_site_packages(self):
        # Assuming 'numpy' is installed in site-packages
        result = find_package('numpy')
        assert result[0] is not None
        assert 'numpy' in result[1]

    def test_package_installed_with_special_characters(self):
        # Testing a package with special characters in the name
        result = find_package('flask-sqlalchemy')
        assert result[0] is not None
        assert 'flask-sqlalchemy' in result[1]

    def test_package_installed_with_uppercase(self):
        # Testing a package with uppercase letters
        result = find_package('Flask')
        assert result[0] is not None
        assert 'Flask' in result[1]
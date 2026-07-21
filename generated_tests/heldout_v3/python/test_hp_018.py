import os
import pytest
from requests.utils import set_environ

class TestSetEnviron:
    def test_set_environ_valid(self):
        # Test setting a valid environment variable
        set_environ('TEST_ENV', 'test_value')
        assert os.environ['TEST_ENV'] == 'test_value'

    def test_set_environ_overwrite(self):
        # Test overwriting an existing environment variable
        set_environ('TEST_ENV', 'new_value')
        assert os.environ['TEST_ENV'] == 'new_value'

    def test_set_environ_empty_value(self):
        # Test setting an environment variable to an empty string
        set_environ('TEST_ENV', '')
        assert os.environ['TEST_ENV'] == ''

    def test_set_environ_none_value(self):
        # Test setting an environment variable to None
        with pytest.raises(TypeError):
            set_environ('TEST_ENV', None)

    def test_set_environ_invalid_name(self):
        # Test setting an environment variable with an invalid name
        with pytest.raises(ValueError):
            set_environ('', 'value')

    def test_set_environ_invalid_name_with_space(self):
        # Test setting an environment variable with a name that has spaces
        with pytest.raises(ValueError):
            set_environ('INVALID NAME', 'value')

    def test_set_environ_special_characters(self):
        # Test setting an environment variable with special characters
        set_environ('TEST_ENV_!@#$', 'special_value')
        assert os.environ['TEST_ENV_!@#$'] == 'special_value'
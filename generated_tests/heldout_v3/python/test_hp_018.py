import os
import pytest
from requests.utils import set_environ

class TestSetEnviron:
    
    def test_set_environ_with_value(self):
        env_name = 'TEST_ENV'
        value = 'test_value'
        
        with set_environ(env_name, value):
            assert os.environ[env_name] == value
        
        assert env_name not in os.environ  # Ensure it is removed after context

    def test_set_environ_with_none(self):
        env_name = 'TEST_ENV'
        value = None
        
        with set_environ(env_name, value):
            assert env_name not in os.environ  # Ensure it does nothing
        
        assert env_name not in os.environ  # Ensure it is still not set after context

    def test_set_environ_existing_value(self):
        env_name = 'TEST_ENV'
        original_value = 'original_value'
        new_value = 'new_value'
        
        os.environ[env_name] = original_value
        
        with set_environ(env_name, new_value):
            assert os.environ[env_name] == new_value
        
        assert os.environ[env_name] == original_value  # Ensure original value is restored

    def test_set_environ_existing_value_none(self):
        env_name = 'TEST_ENV'
        original_value = 'original_value'
        
        os.environ[env_name] = original_value
        
        with set_environ(env_name, None):
            assert env_name not in os.environ  # Ensure it does nothing
        
        assert os.environ[env_name] == original_value  # Ensure original value is still there

    def test_set_environ_nonexistent_variable(self):
        env_name = 'NON_EXISTENT_ENV'
        value = 'some_value'
        
        with set_environ(env_name, value):
            assert os.environ[env_name] == value
        
        assert env_name not in os.environ  # Ensure it is removed after context
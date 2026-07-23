import os
import pytest
from requests.utils import set_environ

def test_set_environ_with_value():
    env_name = 'TEST_ENV'
    value = 'test_value'
    
    with set_environ(env_name, value):
        assert os.environ[env_name] == value

    assert env_name not in os.environ

def test_set_environ_with_none():
    env_name = 'TEST_ENV'
    original_value = 'original_value'
    os.environ[env_name] = original_value
    
    with set_environ(env_name, None):
        assert os.environ[env_name] == original_value

    assert os.environ[env_name] == original_value

def test_set_environ_existing_value():
    env_name = 'TEST_ENV'
    original_value = 'original_value'
    new_value = 'new_value'
    os.environ[env_name] = original_value
    
    with set_environ(env_name, new_value):
        assert os.environ[env_name] == new_value

    assert os.environ[env_name] == original_value
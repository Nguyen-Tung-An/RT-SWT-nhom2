import pytest
from flask import Config

@pytest.fixture
def config():
    config = Config('testing')
    config['IMAGE_STORE_TYPE'] = 'fs'
    config['IMAGE_STORE_PATH'] = '/var/app/images'
    config['IMAGE_STORE_BASE_URL'] = 'http://img.website.com'
    return config

def test_get_namespace_trim_and_lowercase(config):
    result = config.get_namespace('IMAGE_STORE_', lowercase=True, trim_namespace=True)
    assert result == {
        'type': 'fs',
        'path': '/var/app/images',
        'base_url': 'http://img.website.com'
    }

def test_get_namespace_no_trim(config):
    result = config.get_namespace('IMAGE_STORE_', lowercase=True, trim_namespace=False)
    assert result == {
        'IMAGE_STORE_TYPE': 'fs',
        'IMAGE_STORE_PATH': '/var/app/images',
        'IMAGE_STORE_BASE_URL': 'http://img.website.com'
    }

def test_get_namespace_no_lowercase(config):
    result = config.get_namespace('IMAGE_STORE_', lowercase=False, trim_namespace=True)
    assert result == {
        'Type': 'fs',
        'Path': '/var/app/images',
        'Base_url': 'http://img.website.com'
    }

def test_get_namespace_empty_namespace(config):
    result = config.get_namespace('', lowercase=True, trim_namespace=True)
    assert result == {
        'image_store_type': 'fs',
        'image_store_path': '/var/app/images',
        'image_store_base_url': 'http://img.website.com'
    }

def test_get_namespace_no_match(config):
    result = config.get_namespace('NON_EXISTENT_', lowercase=True, trim_namespace=True)
    assert result == {}
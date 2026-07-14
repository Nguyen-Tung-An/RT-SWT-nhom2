import pytest
from flask.config import Config

def test_get_namespace_with_trim_and_lowercase():
    config = Config(root_path='', defaults={})
    config['IMAGE_STORE_TYPE'] = 'fs'
    config['IMAGE_STORE_PATH'] = '/var/app/images'
    config['IMAGE_STORE_BASE_URL'] = 'http://img.website.com'
    
    result = config.get_namespace('IMAGE_STORE_', lowercase=True, trim_namespace=True)
    expected = {
        'type': 'fs',
        'path': '/var/app/images',
        'base_url': 'http://img.website.com'
    }
    assert result == expected

def test_get_namespace_with_trim_no_lowercase():
    config = Config(root_path='', defaults={})
    config['IMAGE_STORE_TYPE'] = 'fs'
    config['IMAGE_STORE_PATH'] = '/var/app/images'
    config['IMAGE_STORE_BASE_URL'] = 'http://img.website.com'
    
    result = config.get_namespace('IMAGE_STORE_', lowercase=False, trim_namespace=True)
    expected = {
        'type': 'fs',
        'path': '/var/app/images',
        'base_url': 'http://img.website.com'
    }
    assert result == expected

def test_get_namespace_no_trim_with_lowercase():
    config = Config(root_path='', defaults={})
    config['IMAGE_STORE_TYPE'] = 'fs'
    config['IMAGE_STORE_PATH'] = '/var/app/images'
    config['IMAGE_STORE_BASE_URL'] = 'http://img.website.com'
    
    result = config.get_namespace('IMAGE_STORE_', lowercase=True, trim_namespace=False)
    expected = {
        'IMAGE_STORE_TYPE': 'fs',
        'IMAGE_STORE_PATH': '/var/app/images',
        'IMAGE_STORE_BASE_URL': 'http://img.website.com'
    }
    assert result == expected

def test_get_namespace_no_trim_no_lowercase():
    config = Config(root_path='', defaults={})
    config['IMAGE_STORE_TYPE'] = 'fs'
    config['IMAGE_STORE_PATH'] = '/var/app/images'
    config['IMAGE_STORE_BASE_URL'] = 'http://img.website.com'
    
    result = config.get_namespace('IMAGE_STORE_', lowercase=False, trim_namespace=False)
    expected = {
        'IMAGE_STORE_TYPE': 'fs',
        'IMAGE_STORE_PATH': '/var/app/images',
        'IMAGE_STORE_BASE_URL': 'http://img.website.com'
    }
    assert result == expected

def test_get_namespace_with_non_matching_namespace():
    config = Config(root_path='', defaults={})
    config['OTHER_CONFIG'] = 'value'
    
    result = config.get_namespace('IMAGE_STORE_', lowercase=True, trim_namespace=True)
    expected = {}
    assert result == expected

def test_get_namespace_empty_namespace():
    config = Config(root_path='', defaults={})
    config['KEY1'] = 'value1'
    config['KEY2'] = 'value2'
    
    result = config.get_namespace('', lowercase=True, trim_namespace=True)
    expected = {
        'key1': 'value1',
        'key2': 'value2'
    }
    assert result == expected
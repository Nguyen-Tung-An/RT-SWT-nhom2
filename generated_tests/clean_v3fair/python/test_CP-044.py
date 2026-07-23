import flask
from flask.config import Config

def test_get_namespace_with_trim_and_lowercase():
    app = flask.Flask('test_app')
    with app.test_request_context('/'):
        config = Config(root_path=str(__import__("tempfile").gettempdir()))
        config['IMAGE_STORE_TYPE'] = 'fs'
        config['IMAGE_STORE_PATH'] = '/var/app/images'
        config['IMAGE_STORE_BASE_URL'] = 'http://img.website.com'
        
        result = config.get_namespace('IMAGE_STORE_')
        expected = {
            'type': 'fs',
            'path': '/var/app/images',
            'base_url': 'http://img.website.com'
        }
        assert result == expected

def test_get_namespace_without_trim_and_lowercase():
    app = flask.Flask('test_app')
    with app.test_request_context('/'):
        config = Config(root_path=str(__import__("tempfile").gettempdir()))
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

def test_get_namespace_with_trim_and_no_lowercase():
    app = flask.Flask('test_app')
    with app.test_request_context('/'):
        config = Config(root_path=str(__import__("tempfile").gettempdir()))
        config['IMAGE_STORE_TYPE'] = 'fs'
        config['IMAGE_STORE_PATH'] = '/var/app/images'
        config['IMAGE_STORE_BASE_URL'] = 'http://img.website.com'
        
        result = config.get_namespace('IMAGE_STORE_', lowercase=False, trim_namespace=True)
        expected = {
            'TYPE': 'fs',
            'PATH': '/var/app/images',
            'BASE_URL': 'http://img.website.com'
        }
        assert result == expected

def test_get_namespace_with_no_matching_namespace():
    app = flask.Flask('test_app')
    with app.test_request_context('/'):
        config = Config(root_path=str(__import__("tempfile").gettempdir()))
        config['OTHER_CONFIG'] = 'value'
        
        result = config.get_namespace('IMAGE_STORE_')
        expected = {}
        assert result == expected

def test_get_namespace_with_empty_namespace():
    app = flask.Flask('test_app')
    with app.test_request_context('/'):
        config = Config(root_path=str(__import__("tempfile").gettempdir()))
        config['IMAGE_STORE_TYPE'] = 'fs'
        
        result = config.get_namespace('')
        expected = {
            'IMAGE_STORE_TYPE': 'fs'
        }
        assert result == expected
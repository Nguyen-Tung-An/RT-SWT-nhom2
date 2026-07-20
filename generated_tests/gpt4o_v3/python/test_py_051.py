import pytest
import flask
from flask.config import Config

class TestConfigGetNamespace:
    @pytest.fixture
    def config(self):
        root_path = str(__import__("tempfile").gettempdir())
        return Config(root_path=root_path)

    def test_get_namespace_with_trim_and_lowercase(self, config):
        app = flask.Flask('test_app')
        with app.test_request_context('/'):
            config['IMAGE_STORE_TYPE'] = 'fs'
            config['IMAGE_STORE_PATH'] = '/var/app/images'
            config['IMAGE_STORE_BASE_URL'] = 'http://img.website.com'
            result = config.get_namespace('IMAGE_STORE_', lowercase=True, trim_namespace=True)
            assert result == {
                'type': 'fs',
                'path': '/var/app/images',
                'base_url': 'http://img.website.com'
            }

    def test_get_namespace_without_trim(self, config):
        app = flask.Flask('test_app')
        with app.test_request_context('/'):
            config['IMAGE_STORE_TYPE'] = 'fs'
            config['IMAGE_STORE_PATH'] = '/var/app/images'
            result = config.get_namespace('IMAGE_STORE_', lowercase=True, trim_namespace=False)
            assert result == {
                'IMAGE_STORE_TYPE': 'fs',
                'IMAGE_STORE_PATH': '/var/app/images'
            }

    def test_get_namespace_without_lowercase(self, config):
        app = flask.Flask('test_app')
        with app.test_request_context('/'):
            config['IMAGE_STORE_TYPE'] = 'fs'
            config['IMAGE_STORE_PATH'] = '/var/app/images'
            result = config.get_namespace('IMAGE_STORE_', lowercase=False, trim_namespace=True)
            assert result == {
                'Type': 'fs',
                'Path': '/var/app/images'
            }

    def test_get_namespace_with_no_matching_namespace(self, config):
        app = flask.Flask('test_app')
        with app.test_request_context('/'):
            config['OTHER_STORE_TYPE'] = 'fs'
            result = config.get_namespace('IMAGE_STORE_', lowercase=True, trim_namespace=True)
            assert result == {}

    def test_get_namespace_with_empty_namespace(self, config):
        app = flask.Flask('test_app')
        with app.test_request_context('/'):
            config['KEY1'] = 'value1'
            config['KEY2'] = 'value2'
            result = config.get_namespace('', lowercase=True, trim_namespace=True)
            assert result == {
                'key1': 'value1',
                'key2': 'value2'
            }
import pytest
from flask.config import Config

class TestConfigGetNamespace:
    @pytest.fixture
    def config(self):
        config = Config()
        config['IMAGE_STORE_TYPE'] = 'fs'
        config['IMAGE_STORE_PATH'] = '/var/app/images'
        config['IMAGE_STORE_BASE_URL'] = 'http://img.website.com'
        config['OTHER_CONFIG'] = 'value'
        return config

    def test_get_namespace_with_trim_and_lowercase(self, config):
        result = config.get_namespace('IMAGE_STORE_', lowercase=True, trim_namespace=True)
        assert result == {
            'type': 'fs',
            'path': '/var/app/images',
            'base_url': 'http://img.website.com'
        }

    def test_get_namespace_without_trim_but_with_lowercase(self, config):
        result = config.get_namespace('IMAGE_STORE_', lowercase=True, trim_namespace=False)
        assert result == {
            'IMAGE_STORE_TYPE': 'fs',
            'IMAGE_STORE_PATH': '/var/app/images',
            'IMAGE_STORE_BASE_URL': 'http://img.website.com'
        }

    def test_get_namespace_with_trim_and_without_lowercase(self, config):
        result = config.get_namespace('IMAGE_STORE_', lowercase=False, trim_namespace=True)
        assert result == {
            'Type': 'fs',
            'Path': '/var/app/images',
            'Base_url': 'http://img.website.com'
        }

    def test_get_namespace_without_trim_and_without_lowercase(self, config):
        result = config.get_namespace('IMAGE_STORE_', lowercase=False, trim_namespace=False)
        assert result == {
            'IMAGE_STORE_TYPE': 'fs',
            'IMAGE_STORE_PATH': '/var/app/images',
            'IMAGE_STORE_BASE_URL': 'http://img.website.com'
        }

    def test_get_namespace_with_nonexistent_namespace(self, config):
        result = config.get_namespace('NON_EXISTENT_', lowercase=True, trim_namespace=True)
        assert result == {}

    def test_get_namespace_with_empty_namespace(self, config):
        result = config.get_namespace('', lowercase=True, trim_namespace=True)
        assert result == {
            'image_store_type': 'fs',
            'image_store_path': '/var/app/images',
            'image_store_base_url': 'http://img.website.com',
            'other_config': 'value'
        }
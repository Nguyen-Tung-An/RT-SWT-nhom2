import pytest
from flask import Flask
from flask.sansio.app import App

class TestInjectUrlDefaults:
    @pytest.fixture
    def app(self):
        return Flask(import_name="test_app")

    def test_inject_url_defaults_with_valid_endpoint(self, app):
        app.url_default_functions = {
            'test': [lambda endpoint, values: values.update({'default_key': 'default_value'})]
        }
        with app.test_request_context('/'):
            values = {}
            app.inject_url_defaults('test.endpoint', values)
            assert values == {'default_key': 'default_value'}

    def test_inject_url_defaults_with_no_default_function(self, app):
        app.url_default_functions = {}
        with app.test_request_context('/'):
            values = {}
            app.inject_url_defaults('test.endpoint', values)
            assert values == {}

    def test_inject_url_defaults_with_invalid_endpoint(self, app):
        app.url_default_functions = {
            'test': [lambda endpoint, values: values.update({'default_key': 'default_value'})]
        }
        with app.test_request_context('/'):
            values = {}
            app.inject_url_defaults('invalid.endpoint', values)
            assert values == {}

    def test_inject_url_defaults_with_multiple_functions(self, app):
        app.url_default_functions = {
            'test': [
                lambda endpoint, values: values.update({'key1': 'value1'}),
                lambda endpoint, values: values.update({'key2': 'value2'})
            ]
        }
        with app.test_request_context('/'):
            values = {}
            app.inject_url_defaults('test.endpoint', values)
            assert values == {'key1': 'value1', 'key2': 'value2'}

    def test_inject_url_defaults_with_blueprint(self, app):
        app.url_default_functions = {
            'blueprint': [lambda endpoint, values: values.update({'bp_key': 'bp_value'})]
        }
        with app.test_request_context('/'):
            values = {}
            app.inject_url_defaults('blueprint.endpoint', values)
            assert values == {'bp_key': 'bp_value'}
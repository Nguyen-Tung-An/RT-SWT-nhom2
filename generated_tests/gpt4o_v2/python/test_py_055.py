import pytest
from flask.sansio.app import App

class TestInjectUrlDefaults:
    @pytest.fixture
    def app_instance(self):
        app = App()
        app.url_default_functions = {
            'blueprint1': [lambda endpoint, values: values.update({'default_key': 'default_value'})],
            'blueprint2': [lambda endpoint, values: values.update({'another_key': 'another_value'})]
        }
        return app

    def test_inject_url_defaults_with_valid_blueprint(self, app_instance):
        values = {}
        app_instance.inject_url_defaults('blueprint1.endpoint', values)
        assert values == {'default_key': 'default_value'}

    def test_inject_url_defaults_with_another_valid_blueprint(self, app_instance):
        values = {}
        app_instance.inject_url_defaults('blueprint2.endpoint', values)
        assert values == {'another_key': 'another_value'}

    def test_inject_url_defaults_with_no_blueprint(self, app_instance):
        values = {}
        app_instance.inject_url_defaults('no_blueprint.endpoint', values)
        assert values == {}

    def test_inject_url_defaults_with_empty_values(self, app_instance):
        values = {}
        app_instance.inject_url_defaults('blueprint1.endpoint', values)
        assert values == {'default_key': 'default_value'}

    def test_inject_url_defaults_with_multiple_blueprints(self, app_instance):
        values = {}
        app_instance.url_default_functions['blueprint1'].append(
            lambda endpoint, values: values.update({'extra_key': 'extra_value'})
        )
        app_instance.inject_url_defaults('blueprint1.endpoint', values)
        assert values == {'default_key': 'default_value', 'extra_key': 'extra_value'}

    def test_inject_url_defaults_with_invalid_blueprint(self, app_instance):
        values = {}
        app_instance.inject_url_defaults('invalid_blueprint.endpoint', values)
        assert values == {}
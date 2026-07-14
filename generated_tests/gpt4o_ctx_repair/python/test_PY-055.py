import pytest
from flask.sansio.app import App

@pytest.fixture
def app():
    return App(import_name='test', static_url_path='', static_folder='', static_host='', host_matching=False, subdomain_matching=False, template_folder='', instance_path=None, instance_relative_config=False, root_path='')

def test_inject_url_defaults_with_no_blueprint(app):
    app.url_default_functions = {}
    values = {}
    app.inject_url_defaults('simple_endpoint', values)
    assert values == {}

def test_inject_url_defaults_with_empty_blueprint(app):
    app.url_default_functions = {'': [lambda endpoint, values: values.update({'default': 'value'})]}
    values = {}
    app.inject_url_defaults('simple_endpoint', values)
    assert values == {'default': 'value'}

def test_inject_url_defaults_with_blueprint(app):
    app.url_default_functions = {
        'blueprint_name': [lambda endpoint, values: values.update({'bp_default': 'bp_value'})]
    }
    values = {}
    app.inject_url_defaults('blueprint_name.simple_endpoint', values)
    assert values == {'bp_default': 'bp_value'}

def test_inject_url_defaults_with_multiple_functions(app):
    app.url_default_functions = {
        'blueprint_name': [
            lambda endpoint, values: values.update({'bp_default': 'bp_value'}),
            lambda endpoint, values: values.update({'another_default': 'another_value'})
        ]
    }
    values = {}
    app.inject_url_defaults('blueprint_name.simple_endpoint', values)
    assert values == {'bp_default': 'bp_value', 'another_default': 'another_value'}
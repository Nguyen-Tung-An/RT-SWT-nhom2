import pytest
from flask.app import Flask

@pytest.fixture
def app():
    app = Flask('test_app')
    with app.test_request_context('/'):
        yield app

def test_inject_url_defaults_with_no_blueprint(app):
    app.url_default_functions['test_endpoint'] = [lambda endpoint, values: values.update({'key': 'value'})]
    values = {}
    app.inject_url_defaults('test_endpoint', values)
    assert values == {'key': 'value'}

def test_inject_url_defaults_with_blueprint(app):
    app.url_default_functions['blueprint.endpoint'] = [lambda endpoint, values: values.update({'bp_key': 'bp_value'})]
    values = {}
    app.inject_url_defaults('blueprint.endpoint', values)
    assert values == {'bp_key': 'bp_value'}

def test_inject_url_defaults_with_multiple_functions(app):
    app.url_default_functions['test_endpoint'] = [
        lambda endpoint, values: values.update({'key1': 'value1'}),
        lambda endpoint, values: values.update({'key2': 'value2'})
    ]
    values = {}
    app.inject_url_defaults('test_endpoint', values)
    assert values == {'key1': 'value1', 'key2': 'value2'}

def test_inject_url_defaults_with_no_matching_function(app):
    values = {}
    app.inject_url_defaults('nonexistent.endpoint', values)
    assert values == {}

def test_inject_url_defaults_with_empty_values(app):
    app.url_default_functions['empty.endpoint'] = [lambda endpoint, values: values.update({'empty_key': 'empty_value'})]
    values = {}
    app.inject_url_defaults('empty.endpoint', values)
    assert values == {'empty_key': 'empty_value'}
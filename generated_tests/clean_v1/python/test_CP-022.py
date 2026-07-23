import pytest
from flask.sansio.app import App

@pytest.fixture
def app():
    return App()

def test_inject_url_defaults_with_no_blueprint(app):
    app.url_default_functions = {}
    values = {}
    app.inject_url_defaults("simple_endpoint", values)
    assert values == {}

def test_inject_url_defaults_with_empty_functions(app):
    app.url_default_functions = {"simple_endpoint": []}
    values = {}
    app.inject_url_defaults("simple_endpoint", values)
    assert values == {}

def test_inject_url_defaults_with_single_function(app):
    def default_func(endpoint, values):
        values['default'] = 'value'

    app.url_default_functions = {"simple_endpoint": [default_func]}
    values = {}
    app.inject_url_defaults("simple_endpoint", values)
    assert values == {'default': 'value'}

def test_inject_url_defaults_with_blueprint(app):
    def default_func(endpoint, values):
        values['blueprint_default'] = 'blueprint_value'

    app.url_default_functions = {"blueprint.endpoint": [default_func]}
    values = {}
    app.inject_url_defaults("blueprint.endpoint", values)
    assert values == {'blueprint_default': 'blueprint_value'}

def test_inject_url_defaults_with_multiple_functions(app):
    def default_func1(endpoint, values):
        values['default1'] = 'value1'

    def default_func2(endpoint, values):
        values['default2'] = 'value2'

    app.url_default_functions = {"multi.endpoint": [default_func1, default_func2]}
    values = {}
    app.inject_url_defaults("multi.endpoint", values)
    assert values == {'default1': 'value1', 'default2': 'value2'}
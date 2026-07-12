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
    def mock_function(endpoint, values):
        values['key'] = 'value'

    app.url_default_functions = {"simple_endpoint": [mock_function]}
    values = {}
    app.inject_url_defaults("simple_endpoint", values)
    assert values == {'key': 'value'}

def test_inject_url_defaults_with_blueprint(app):
    def mock_function(endpoint, values):
        values['blueprint_key'] = 'blueprint_value'

    app.url_default_functions = {"blueprint.endpoint": [mock_function]}
    values = {}
    app.inject_url_defaults("blueprint.endpoint", values)
    assert values == {'blueprint_key': 'blueprint_value'}

def test_inject_url_defaults_with_multiple_functions(app):
    def mock_function_one(endpoint, values):
        values['key_one'] = 'value_one'

    def mock_function_two(endpoint, values):
        values['key_two'] = 'value_two'

    app.url_default_functions = {"multi.endpoint": [mock_function_one, mock_function_two]}
    values = {}
    app.inject_url_defaults("multi.endpoint", values)
    assert values == {'key_one': 'value_one', 'key_two': 'value_two'}
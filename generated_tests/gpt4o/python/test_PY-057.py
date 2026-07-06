import pytest
from flask.sansio.blueprints import Blueprint

@pytest.fixture
def blueprint():
    return Blueprint('test_blueprint', __name__, url_prefix='/test')

def test_add_url_rule_with_rule(blueprint):
    blueprint.add_url_rule('example', view_func=lambda: "Hello")
    assert 'test_blueprint.test_blueprint.example' in blueprint.app.url_map._rules_by_endpoint

def test_add_url_rule_with_empty_rule(blueprint):
    blueprint.add_url_rule('', view_func=lambda: "Hello")
    assert '/test' in blueprint.app.url_map._rules

def test_add_url_rule_with_none_endpoint(blueprint):
    blueprint.add_url_rule('example', endpoint=None, view_func=lambda: "Hello")
    assert 'test_blueprint.test_blueprint.example' in blueprint.app.url_map._rules_by_endpoint

def test_add_url_rule_with_subdomain(blueprint):
    blueprint.add_url_rule('example', subdomain='test', view_func=lambda: "Hello")
    assert 'test_blueprint.test_blueprint.example' in blueprint.app.url_map._rules_by_endpoint

def test_add_url_rule_with_defaults(blueprint):
    blueprint.add_url_rule('example', defaults={'key': 'value'}, view_func=lambda: "Hello")
    assert 'test_blueprint.test_blueprint.example' in blueprint.app.url_map._rules_by_endpoint
    assert blueprint.url_defaults['key'] == 'value'
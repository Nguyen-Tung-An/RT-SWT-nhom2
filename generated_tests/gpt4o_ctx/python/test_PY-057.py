import pytest
from flask.sansio.blueprints import Blueprint

@pytest.fixture
def blueprint():
    return Blueprint('test_blueprint', __name__)

def test_add_url_rule_with_valid_rule(blueprint):
    def dummy_view():
        return "Hello, World!"
    
    blueprint.add_url_rule('/test', endpoint='test_view', view_func=dummy_view)
    assert '/test' in blueprint.app.url_map._rules_by_endpoint['test_blueprint.test_view']

def test_add_url_rule_with_empty_rule(blueprint):
    def dummy_view():
        return "Hello, World!"
    
    blueprint.add_url_rule('', endpoint='test_view', view_func=dummy_view)
    assert '/test_blueprint' in blueprint.app.url_map._rules_by_endpoint['test_blueprint.test_view']

def test_add_url_rule_with_prefix(blueprint):
    blueprint.url_prefix = '/api'
    def dummy_view():
        return "Hello, World!"
    
    blueprint.add_url_rule('/test', endpoint='test_view', view_func=dummy_view)
    assert '/api/test' in blueprint.app.url_map._rules_by_endpoint['test_blueprint.test_view']

def test_add_url_rule_with_subdomain(blueprint):
    blueprint.subdomain = 'test'
    def dummy_view():
        return "Hello, World!"
    
    blueprint.add_url_rule('/test', endpoint='test_view', view_func=dummy_view, subdomain='test')
    assert '/test' in blueprint.app.url_map._rules_by_endpoint['test_blueprint.test_view']

def test_add_url_rule_with_defaults(blueprint):
    blueprint.url_defaults = {'key': 'value'}
    def dummy_view():
        return "Hello, World!"
    
    blueprint.add_url_rule('/test', endpoint='test_view', view_func=dummy_view, defaults={'key': 'new_value'})
    assert blueprint.app.url_map._rules_by_endpoint['test_blueprint.test_view'][0].defaults['key'] == 'new_value'
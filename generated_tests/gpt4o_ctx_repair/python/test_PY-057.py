import pytest
from flask import Flask
from flask.sansio.blueprints import Blueprint

@pytest.fixture
def app():
    app = Flask(__name__)
    return app

@pytest.fixture
def blueprint(app):
    return Blueprint('test_blueprint', __name__)

def test_add_url_rule_with_valid_rule(blueprint, app):
    def dummy_view():
        return "Hello, World!"
    
    blueprint.add_url_rule('/test', endpoint='test_view', view_func=dummy_view)
    blueprint.register(app)
    assert '/test' in [rule.rule for rule in app.url_map.iter_rules() if rule.endpoint == 'test_blueprint.test_view']

def test_add_url_rule_with_empty_rule(blueprint, app):
    def dummy_view():
        return "Hello, World!"
    
    blueprint.add_url_rule('', endpoint='test_view', view_func=dummy_view)
    blueprint.register(app)
    assert '/test_blueprint' in [rule.rule for rule in app.url_map.iter_rules() if rule.endpoint == 'test_blueprint.test_view']

def test_add_url_rule_with_prefix(blueprint, app):
    blueprint.url_prefix = '/api'
    def dummy_view():
        return "Hello, World!"
    
    blueprint.add_url_rule('/test', endpoint='test_view', view_func=dummy_view)
    blueprint.register(app)
    assert '/api/test' in [rule.rule for rule in app.url_map.iter_rules() if rule.endpoint == 'test_blueprint.test_view']

def test_add_url_rule_with_subdomain(blueprint, app):
    blueprint.subdomain = 'test'
    def dummy_view():
        return "Hello, World!"
    
    blueprint.add_url_rule('/test', endpoint='test_view', view_func=dummy_view, subdomain='test')
    blueprint.register(app)
    assert '/test' in [rule.rule for rule in app.url_map.iter_rules() if rule.endpoint == 'test_blueprint.test_view']

def test_add_url_rule_with_defaults(blueprint, app):
    blueprint.url_defaults = {'key': 'value'}
    def dummy_view():
        return "Hello, World!"
    
    blueprint.add_url_rule('/test', endpoint='test_view', view_func=dummy_view, defaults={'key': 'new_value'})
    blueprint.register(app)
    assert app.url_map._rules_by_endpoint['test_blueprint.test_view'][0].defaults['key'] == 'new_value'
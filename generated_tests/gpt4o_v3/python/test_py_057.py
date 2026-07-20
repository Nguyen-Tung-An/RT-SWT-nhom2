import pytest
import flask
from flask.sansio.blueprints import BlueprintSetupState
from flask import Blueprint

@pytest.fixture
def setup_blueprint():
    app = flask.Flask('test_app')
    blueprint = Blueprint('test_blueprint', __name__)
    app.register_blueprint(blueprint)
    with app.app_context():
        yield BlueprintSetupState(blueprint, app, {}, False)

def test_add_url_rule_with_valid_rule(setup_blueprint):
    with setup_blueprint.app.test_request_context('/'):
        setup_blueprint.add_url_rule('/test', endpoint='test_endpoint', view_func=lambda: 'test')
        assert setup_blueprint.app.url_map._rules[-1].rule == '/test'
        assert setup_blueprint.app.url_map._rules[-1].endpoint == 'test_blueprint.test_endpoint'

def test_add_url_rule_with_prefix(setup_blueprint):
    setup_blueprint.url_prefix = '/api'
    with setup_blueprint.app.test_request_context('/'):
        setup_blueprint.add_url_rule('resource', endpoint='resource_endpoint', view_func=lambda: 'resource')
        assert setup_blueprint.app.url_map._rules[-1].rule == '/api/resource'
        assert setup_blueprint.app.url_map._rules[-1].endpoint == 'test_blueprint.resource_endpoint'

def test_add_url_rule_with_no_rule(setup_blueprint):
    with setup_blueprint.app.test_request_context('/'):
        setup_blueprint.add_url_rule('', endpoint='empty_endpoint', view_func=lambda: 'empty')
        assert setup_blueprint.app.url_map._rules[-1].rule == setup_blueprint.url_prefix
        assert setup_blueprint.app.url_map._rules[-1].endpoint == 'test_blueprint.empty_endpoint'

def test_add_url_rule_with_subdomain(setup_blueprint):
    setup_blueprint.subdomain = 'api'
    with setup_blueprint.app.test_request_context('/'):
        setup_blueprint.add_url_rule('/test', endpoint='test_endpoint', view_func=lambda: 'test', subdomain='api')
        assert setup_blueprint.app.url_map._rules[-1].subdomain == 'api'

def test_add_url_rule_with_defaults(setup_blueprint):
    with setup_blueprint.app.test_request_context('/'):
        setup_blueprint.add_url_rule('/test', endpoint='test_endpoint', view_func=lambda: 'test', defaults={'key': 'value'})
        assert setup_blueprint.app.url_map._rules[-1].defaults == {'key': 'value'}
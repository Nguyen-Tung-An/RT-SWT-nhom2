import pytest
from flask import Flask
from flask.sansio.blueprints import Blueprint

class TestBlueprintAddUrlRule:
    @pytest.fixture
    def blueprint(self):
        return Blueprint(name="test", import_name="test_app")

    def test_add_url_rule_valid(self, blueprint):
        app = Flask('test_app')
        with app.test_request_context('/'):
            blueprint.add_url_rule('/test', 'test_endpoint', lambda: 'test')
            assert '/test' in app.url_map._rules_by_endpoint['test_endpoint']

    def test_add_url_rule_with_dot_in_endpoint(self, blueprint):
        app = Flask('test_app')
        with app.test_request_context('/'):
            with pytest.raises(ValueError, match="'endpoint' may not contain a dot '.' character."):
                blueprint.add_url_rule('/test', 'test.endpoint', lambda: 'test')

    def test_add_url_rule_with_dot_in_view_func(self, blueprint):
        app = Flask('test_app')
        with app.test_request_context('/'):
            with pytest.raises(ValueError, match="'view_func' name may not contain a dot '.' character."):
                blueprint.add_url_rule('/test', 'test_endpoint', lambda: 'test', provide_automatic_options=None, view_func=lambda: 'test.view')

    def test_add_url_rule_without_view_func(self, blueprint):
        app = Flask('test_app')
        with app.test_request_context('/'):
            blueprint.add_url_rule('/test_no_func', 'test_no_func_endpoint')
            assert '/test_no_func' in app.url_map._rules_by_endpoint['test_no_func_endpoint']

    def test_add_url_rule_with_provide_automatic_options(self, blueprint):
        app = Flask('test_app')
        with app.test_request_context('/'):
            blueprint.add_url_rule('/test_auto', 'test_auto_endpoint', lambda: 'test', provide_automatic_options=True)
            assert '/test_auto' in app.url_map._rules_by_endpoint['test_auto_endpoint']
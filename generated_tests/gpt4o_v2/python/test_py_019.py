import pytest
from flask.sansio.blueprints import Blueprint

class TestBlueprintAddUrlRule:
    def setup_method(self):
        self.blueprint = Blueprint("test_blueprint")

    def test_add_url_rule_valid(self):
        self.blueprint.add_url_rule("/test", "test_endpoint", lambda: "test")
        assert len(self.blueprint.url_rules) == 1
        assert self.blueprint.url_rules[0].rule == "/test"
        assert self.blueprint.url_rules[0].endpoint == "test_endpoint"

    def test_add_url_rule_with_automatic_options(self):
        self.blueprint.add_url_rule("/test_auto", "test_auto_endpoint", lambda: "test_auto", provide_automatic_options=True)
        assert len(self.blueprint.url_rules) == 1
        assert self.blueprint.url_rules[0].provide_automatic_options is True

    def test_add_url_rule_invalid_endpoint_dot(self):
        with pytest.raises(ValueError, match="'endpoint' may not contain a dot '.' character."):
            self.blueprint.add_url_rule("/test", "test.endpoint", lambda: "test")

    def test_add_url_rule_invalid_view_func_dot(self):
        with pytest.raises(ValueError, match="'view_func' name may not contain a dot '.' character."):
            self.blueprint.add_url_rule("/test", "test_endpoint", lambda: "test.view")

    def test_add_url_rule_no_view_func(self):
        self.blueprint.add_url_rule("/test_no_func", "test_no_func_endpoint")
        assert len(self.blueprint.url_rules) == 1
        assert self.blueprint.url_rules[0].view_func is None

    def test_add_url_rule_multiple_rules(self):
        self.blueprint.add_url_rule("/test1", "test1_endpoint", lambda: "test1")
        self.blueprint.add_url_rule("/test2", "test2_endpoint", lambda: "test2")
        assert len(self.blueprint.url_rules) == 2
        assert self.blueprint.url_rules[0].rule == "/test1"
        assert self.blueprint.url_rules[1].rule == "/test2"
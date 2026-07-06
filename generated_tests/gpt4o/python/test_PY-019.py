import pytest
from flask.sansio.blueprints import Blueprint

@pytest.fixture
def blueprint():
    return Blueprint("test_blueprint", __name__)

def test_add_url_rule_valid(blueprint):
    blueprint.add_url_rule("/test", "test_endpoint", lambda: "test")

def test_add_url_rule_invalid_endpoint(blueprint):
    with pytest.raises(ValueError, match="'endpoint' may not contain a dot '.' character."):
        blueprint.add_url_rule("/test", "test.endpoint")

def test_add_url_rule_invalid_view_func(blueprint):
    with pytest.raises(ValueError, match="'view_func' name may not contain a dot '.' character."):
        blueprint.add_url_rule("/test", view_func=lambda: "test", endpoint="test.endpoint")

def test_add_url_rule_with_automatic_options(blueprint):
    blueprint.add_url_rule("/test", "test_endpoint", lambda: "test", provide_automatic_options=True)

def test_add_url_rule_without_view_func(blueprint):
    blueprint.add_url_rule("/test", "test_endpoint")
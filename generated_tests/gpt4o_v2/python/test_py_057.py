import pytest
from flask.sansio.blueprints import BlueprintSetupState
from flask import Flask

class TestAddUrlRule:
    @pytest.fixture
    def setup_blueprint(self):
        app = Flask(__name__)
        blueprint = BlueprintSetupState("test_blueprint", __name__)
        blueprint.url_prefix = "/api"
        blueprint.app = app
        yield blueprint

    def test_add_url_rule_with_valid_rule(self, setup_blueprint):
        setup_blueprint.add_url_rule("users", "user_list", lambda: "User List")
        with setup_blueprint.app.test_client() as client:
            response = client.get("/api/users")
            assert response.data.decode() == "User List"

    def test_add_url_rule_with_empty_rule(self, setup_blueprint):
        setup_blueprint.add_url_rule("", "root", lambda: "Root")
        with setup_blueprint.app.test_client() as client:
            response = client.get("/api/")
            assert response.data.decode() == "Root"

    def test_add_url_rule_with_none_endpoint(self, setup_blueprint):
        setup_blueprint.add_url_rule("items", None, lambda: "Items List")
        with setup_blueprint.app.test_client() as client:
            response = client.get("/api/items")
            assert response.data.decode() == "Items List"

    def test_add_url_rule_with_subdomain_option(self, setup_blueprint):
        setup_blueprint.add_url_rule("products", "product_list", lambda: "Product List", subdomain="shop")
        with setup_blueprint.app.test_client() as client:
            response = client.get("/api/products", headers={"Host": "shop.localhost"})
            assert response.data.decode() == "Product List"

    def test_add_url_rule_with_defaults(self, setup_blueprint):
        setup_blueprint.url_defaults = {"lang": "en"}
        setup_blueprint.add_url_rule("articles", "article_list", lambda: "Article List", defaults={"lang": "fr"})
        with setup_blueprint.app.test_client() as client:
            response = client.get("/api/articles")
            assert response.data.decode() == "Article List"

    def test_add_url_rule_with_conflicting_rule(self, setup_blueprint):
        setup_blueprint.add_url_rule("conflict", "conflict", lambda: "First Conflict")
        setup_blueprint.add_url_rule("conflict", "conflict", lambda: "Second Conflict")
        with setup_blueprint.app.test_client() as client:
            response = client.get("/api/conflict")
            assert response.data.decode() == "Second Conflict"
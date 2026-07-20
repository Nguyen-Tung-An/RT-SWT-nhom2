import pytest
from flask import Flask
from flask.sansio.blueprints import Blueprint

class TestBlueprintMergeFuncs:
    @pytest.fixture
    def app(self):
        return Flask(__name__)

    @pytest.fixture
    def blueprint(self):
        bp = Blueprint("test_blueprint", __name__)
        bp.error_handler_spec = {
            None: {
                404: {Exception: lambda e: "Not Found"},
                500: {Exception: lambda e: "Internal Server Error"},
            }
        }
        bp.view_functions = {
            "test_view": lambda: "Hello, World!"
        }
        bp.before_request_funcs = {}
        bp.after_request_funcs = {}
        bp.teardown_request_funcs = {}
        bp.url_default_functions = {}
        bp.url_value_preprocessors = {}
        bp.template_context_processors = {}
        return bp

    def test_merge_error_handlers(self, app, blueprint):
        blueprint._merge_blueprint_funcs(app, "test_blueprint")
        assert app.error_handler_spec["test_blueprint.None"][404][Exception]("error") == "Not Found"
        assert app.error_handler_spec["test_blueprint.None"][500][Exception]("error") == "Internal Server Error"

    def test_merge_view_functions(self, app, blueprint):
        blueprint._merge_blueprint_funcs(app, "test_blueprint")
        assert app.view_functions["test_view"]() == "Hello, World!"

    def test_merge_before_request_funcs(self, app, blueprint):
        blueprint.before_request_funcs = {None: [lambda: "Before Request"]}
        blueprint._merge_blueprint_funcs(app, "test_blueprint")
        assert len(app.before_request_funcs[None]) == 1
        assert app.before_request_funcs[None][0]() == "Before Request"

    def test_merge_after_request_funcs(self, app, blueprint):
        blueprint.after_request_funcs = {None: [lambda response: response + " After"]}
        blueprint._merge_blueprint_funcs(app, "test_blueprint")
        assert len(app.after_request_funcs[None]) == 1
        response = "Response"
        assert app.after_request_funcs[None][0](response) == "Response After"

    def test_merge_teardown_request_funcs(self, app, blueprint):
        blueprint.teardown_request_funcs = {None: [lambda response: response + " Teardown"]}
        blueprint._merge_blueprint_funcs(app, "test_blueprint")
        assert len(app.teardown_request_funcs[None]) == 1
        response = "Response"
        assert app.teardown_request_funcs[None][0](response) == "Response Teardown"

    def test_merge_url_default_functions(self, app, blueprint):
        blueprint.url_default_functions = {None: [lambda: "Default URL"]}
        blueprint._merge_blueprint_funcs(app, "test_blueprint")
        assert len(app.url_default_functions[None]) == 1
        assert app.url_default_functions[None][0]() == "Default URL"

    def test_merge_url_value_preprocessors(self, app, blueprint):
        blueprint.url_value_preprocessors = {None: [lambda value: value + " Preprocessed"]}
        blueprint._merge_blueprint_funcs(app, "test_blueprint")
        assert len(app.url_value_preprocessors[None]) == 1
        assert app.url_value_preprocessors[None][0]("Value") == "Value Preprocessed"

    def test_merge_template_context_processors(self, app, blueprint):
        blueprint.template_context_processors = {None: [lambda: {"key": "value"}]}
        blueprint._merge_blueprint_funcs(app, "test_blueprint")
        assert len(app.template_context_processors[None]) == 1
        assert app.template_context_processors[None][0]() == {"key": "value"}
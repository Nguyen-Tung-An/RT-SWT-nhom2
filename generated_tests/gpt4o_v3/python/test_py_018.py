import pytest
from flask import Flask
from flask.sansio.blueprints import Blueprint

class TestMergeBlueprintFuncs:
    @pytest.fixture
    def app(self):
        return Flask('test_app')

    @pytest.fixture
    def blueprint(self):
        return Blueprint(name="test", import_name="test_app")

    def test_merge_error_handler_spec(self, app, blueprint):
        blueprint.error_handler_spec = {
            None: {404: {Exception: lambda: "Not Found"}},
            'test.error': {500: {Exception: lambda: "Internal Server Error"}}
        }
        with app.test_request_context('/'):
            blueprint._merge_blueprint_funcs(app, "test")
            assert app.error_handler_spec['test.error'] == {
                500: {Exception: lambda: "Internal Server Error"}
            }
            assert app.error_handler_spec['test'] == {
                404: {Exception: lambda: "Not Found"}
            }

    def test_merge_view_functions(self, app, blueprint):
        blueprint.view_functions = {
            'test_view': lambda: "Hello, World!"
        }
        with app.test_request_context('/'):
            blueprint._merge_blueprint_funcs(app, "test")
            assert app.view_functions['test_view']() == "Hello, World!"

    def test_merge_before_request_funcs(self, app, blueprint):
        blueprint.before_request_funcs = {
            None: [lambda: "Before Request"],
        }
        with app.test_request_context('/'):
            blueprint._merge_blueprint_funcs(app, "test")
            assert len(app.before_request_funcs[None]) == 1
            assert app.before_request_funcs[None][0]() == "Before Request"

    def test_merge_after_request_funcs(self, app, blueprint):
        blueprint.after_request_funcs = {
            None: [lambda response: response],
        }
        with app.test_request_context('/'):
            blueprint._merge_blueprint_funcs(app, "test")
            assert len(app.after_request_funcs[None]) == 1

    def test_merge_teardown_request_funcs(self, app, blueprint):
        blueprint.teardown_request_funcs = {
            None: [lambda response: response],
        }
        with app.test_request_context('/'):
            blueprint._merge_blueprint_funcs(app, "test")
            assert len(app.teardown_request_funcs[None]) == 1

    def test_merge_url_default_functions(self, app, blueprint):
        blueprint.url_default_functions = {
            None: [lambda: "Default URL"],
        }
        with app.test_request_context('/'):
            blueprint._merge_blueprint_funcs(app, "test")
            assert len(app.url_default_functions[None]) == 1
            assert app.url_default_functions[None][0]() == "Default URL"

    def test_merge_url_value_preprocessors(self, app, blueprint):
        blueprint.url_value_preprocessors = {
            None: [lambda value: value],
        }
        with app.test_request_context('/'):
            blueprint._merge_blueprint_funcs(app, "test")
            assert len(app.url_value_preprocessors[None]) == 1

    def test_merge_template_context_processors(self, app, blueprint):
        blueprint.template_context_processors = {
            None: [lambda: {"key": "value"}],
        }
        with app.test_request_context('/'):
            blueprint._merge_blueprint_funcs(app, "test")
            assert len(app.template_context_processors[None]) == 1
            assert app.template_context_processors[None][0]() == {"key": "value"}
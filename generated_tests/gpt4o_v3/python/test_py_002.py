import pytest
from flask import Flask, g, session

class TestFlaskUpdateTemplateContext:
    @pytest.fixture
    def app(self):
        return Flask(import_name="test_app")

    def test_update_template_context_with_request_context(self, app):
        with app.test_request_context('/'):
            ctx = app.app_context()
            ctx.push()
            context = {}
            app.update_template_context(ctx, context)
            assert 'request' in context
            assert 'session' in context
            assert 'config' in context
            assert 'g' in context

    def test_update_template_context_without_request_context(self, app):
        context = {}
        with pytest.raises(RuntimeError, match='Working outside of application context'):
            app.update_template_context(app.app_context(), context)

    def test_update_template_context_with_custom_processors(self, app):
        @app.context_processor
        def custom_processor():
            return {'custom_var': 'value'}

        with app.test_request_context('/'):
            ctx = app.app_context()
            ctx.push()
            context = {}
            app.update_template_context(ctx, context)
            assert context['custom_var'] == 'value'

    def test_update_template_context_with_existing_keys(self, app):
        @app.context_processor
        def another_processor():
            return {'existing_key': 'original_value'}

        with app.test_request_context('/'):
            ctx = app.app_context()
            ctx.push()
            context = {'existing_key': 'new_value'}
            app.update_template_context(ctx, context)
            assert context['existing_key'] == 'original_value'
import pytest
from flask import Flask, g
from flask import request
from flask import session

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
        ctx = app.app_context()
        ctx.push()
        context = {}
        app.update_template_context(ctx, context)
        assert 'request' not in context
        assert 'session' not in context
        assert 'config' not in context
        assert 'g' not in context

    def test_update_template_context_with_empty_context_processors(self, app):
        with app.test_request_context('/'):
            ctx = app.app_context()
            ctx.push()
            context = {}
            app.template_context_processors = {}
            app.update_template_context(ctx, context)
            assert context == {}

    def test_update_template_context_with_custom_processor(self, app):
        def custom_processor():
            return {'custom_var': 'value'}

        app.template_context_processors = {None: [custom_processor]}
        with app.test_request_context('/'):
            ctx = app.app_context()
            ctx.push()
            context = {}
            app.update_template_context(ctx, context)
            assert context['custom_var'] == 'value'

    def test_update_template_context_with_overriding_values(self, app):
        def custom_processor():
            return {'request': 'new_request_value'}

        app.template_context_processors = {None: [custom_processor]}
        with app.test_request_context('/'):
            ctx = app.app_context()
            ctx.push()
            context = {'request': 'old_request_value'}
            app.update_template_context(ctx, context)
            assert context['request'] == 'new_request_value'
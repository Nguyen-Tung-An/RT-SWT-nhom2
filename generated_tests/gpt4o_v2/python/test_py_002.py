import pytest
from flask import Flask, g
from flask.ctx import AppContext

class TestFlaskUpdateTemplateContext:
    @pytest.fixture
    def app(self):
        app = Flask(__name__)
        app.template_context_processors = {
            None: [lambda: {'key1': 'value1'}],
            'blueprint1': [lambda: {'key2': 'value2'}],
        }
        return app

    @pytest.fixture
    def app_context(self, app):
        ctx = app.app_context()
        ctx.push()
        yield ctx
        ctx.pop()

    def test_update_template_context_with_request(self, app, app_context):
        ctx = app_context
        ctx.has_request = True
        context = {}
        app.update_template_context(ctx, context)
        assert context['key1'] == 'value1'
        assert context['key2'] == 'value2'

    def test_update_template_context_without_request(self, app, app_context):
        ctx = app_context
        ctx.has_request = False
        context = {}
        app.update_template_context(ctx, context)
        assert 'key1' not in context
        assert 'key2' not in context

    def test_update_template_context_with_existing_keys(self, app, app_context):
        ctx = app_context
        ctx.has_request = True
        context = {'key1': 'original_value1'}
        app.update_template_context(ctx, context)
        assert context['key1'] == 'original_value1'  # Should not override
        assert context['key2'] == 'value2'

    def test_update_template_context_empty_context(self, app, app_context):
        ctx = app_context
        ctx.has_request = True
        context = {}
        app.update_template_context(ctx, context)
        assert context == {'key1': 'value1', 'key2': 'value2'}

    def test_update_template_context_no_processors(self, app, app_context):
        ctx = app_context
        ctx.has_request = True
        app.template_context_processors = {None: []}
        context = {}
        app.update_template_context(ctx, context)
        assert context == {}
import pytest
from flask import Flask, g
from flask.app import AppContext, update_template_context

@pytest.fixture
def app():
    app = Flask(__name__)
    app.template_context_processors = {
        None: [lambda: {'var1': 'value1'}],
        'blueprint1': [lambda: {'var2': 'value2'}]
    }
    return app

def test_update_template_context_with_request_context(app):
    with app.app_context():
        ctx = AppContext(app)
        ctx.push()
        ctx.has_request = True
        ctx.request = type('Request', (object,), {'blueprints': ['blueprint1']})()
        
        context = {}
        update_template_context(app, ctx, context)
        
        assert context['var1'] == 'value1'
        assert context['var2'] == 'value2'
        ctx.pop()

def test_update_template_context_without_request_context(app):
    with app.app_context():
        ctx = AppContext(app)
        ctx.push()
        ctx.has_request = False
        
        context = {}
        update_template_context(app, ctx, context)
        
        assert 'var1' not in context
        assert 'var2' not in context
        ctx.pop()

def test_update_template_context_with_existing_keys(app):
    with app.app_context():
        ctx = AppContext(app)
        ctx.push()
        ctx.has_request = True
        ctx.request = type('Request', (object,), {'blueprints': ['blueprint1']})()
        
        context = {'var1': 'existing_value'}
        update_template_context(app, ctx, context)
        
        assert context['var1'] == 'existing_value'
        assert context['var2'] == 'value2'
        ctx.pop()
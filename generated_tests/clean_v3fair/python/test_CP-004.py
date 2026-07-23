import pytest
from flask import Flask, g
from flask.ctx import AppContext

@pytest.fixture
def app():
    app = Flask('test_app')
    with app.app_context():
        yield app

def test_update_template_context_with_request_context(app):
    ctx = AppContext(app)
    ctx.push()
    context = {}
    app.update_template_context(ctx, context)
    assert 'request' in context
    assert 'session' in context
    assert 'config' in context
    assert 'g' in context
    ctx.pop()

def test_update_template_context_without_request_context(app):
    ctx = AppContext(app)
    context = {}
    app.update_template_context(ctx, context)
    assert 'request' not in context
    assert 'session' not in context
    assert 'config' not in context
    assert 'g' not in context

def test_update_template_context_with_blueprints(app):
    @app.route('/test')
    def test_view():
        return 'test'

    with app.test_request_context('/test'):
        context = {}
        app.update_template_context(app.app_context(), context)
        assert 'request' in context
        assert 'session' in context
        assert 'config' in context
        assert 'g' in context

def test_update_template_context_with_custom_processor(app):
    @app.context_processor
    def custom_processor():
        return {'custom_var': 'value'}

    with app.app_context():
        context = {}
        app.update_template_context(app.app_context(), context)
        assert context['custom_var'] == 'value'
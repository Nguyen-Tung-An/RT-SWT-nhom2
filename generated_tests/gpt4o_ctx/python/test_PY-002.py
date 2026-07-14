import pytest
from flask.app import Flask, AppContext

@pytest.fixture
def app():
    app = Flask(__name__)
    app.template_context_processors['test'] = [lambda: {'key': 'value'}]
    return app

def test_update_template_context_with_request_context(app):
    with app.app_context():
        ctx = AppContext(app)
        ctx.push()
        context = {}
        app.update_template_context(ctx, context)
        assert 'key' in context
        assert context['key'] == 'value'
        ctx.pop()

def test_update_template_context_without_request_context(app):
    context = {}
    app.update_template_context(AppContext(app), context)
    assert context == {}

def test_update_template_context_with_multiple_processors(app):
    with app.app_context():
        ctx = AppContext(app)
        ctx.push()
        app.template_context_processors['test'] = [
            lambda: {'key1': 'value1'},
            lambda: {'key2': 'value2'}
        ]
        context = {}
        app.update_template_context(ctx, context)
        assert 'key1' in context
        assert context['key1'] == 'value1'
        assert 'key2' in context
        assert context['key2'] == 'value2'
        ctx.pop()
import pytest
from flask import Flask, g
from flask.app import update_template_context

@pytest.fixture
def app():
    app = Flask(__name__)
    app.template_context_processors = {
        None: [lambda: {'key1': 'value1'}],
        'blueprint1': [lambda: {'key2': 'value2'}]
    }
    return app

@pytest.fixture
def ctx(app):
    class MockContext:
        def __init__(self, has_request, blueprints):
            self.has_request = has_request
            self.request = type('Request', (object,), {'blueprints': blueprints})

    return MockContext(True, ['blueprint1'])

def test_update_template_context_with_request(app, ctx):
    context = {}
    update_template_context(app, ctx, context)
    assert context['key1'] == 'value1'
    assert context['key2'] == 'value2'

def test_update_template_context_without_request(app):
    context = {}
    ctx = type('MockContext', (object,), {'has_request': False})
    update_template_context(app, ctx, context)
    assert context == {}

def test_update_template_context_with_existing_keys(app, ctx):
    context = {'key1': 'existing_value'}
    update_template_context(app, ctx, context)
    assert context['key1'] == 'existing_value'
    assert context['key2'] == 'value2'
import pytest
from flask import Flask

@pytest.fixture
def app():
    app = Flask(__name__)
    app.template_context_processors['test'] = [lambda: {'key': 'value'}]
    return app

def test_update_template_context_with_request_context(app):
    with app.app_context():
        context = {}
        app.update_template_context(context)
        assert 'key' in context
        assert context['key'] == 'value'

def test_update_template_context_without_request_context(app):
    context = {}
    app.update_template_context(context)
    assert context == {}

def test_update_template_context_with_multiple_processors(app):
    with app.app_context():
        app.template_context_processors['test'] = [
            lambda: {'key1': 'value1'},
            lambda: {'key2': 'value2'}
        ]
        context = {}
        app.update_template_context(context)
        assert 'key1' in context
        assert context['key1'] == 'value1'
        assert 'key2' in context
        assert context['key2'] == 'value2'
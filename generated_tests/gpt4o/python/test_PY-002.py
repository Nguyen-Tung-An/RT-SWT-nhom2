import pytest
from flask.app import update_template_context
from unittest.mock import Mock

def test_update_template_context_with_request():
    ctx = Mock()
    ctx.has_request = True
    ctx.request.blueprints = ['blueprint1', 'blueprint2']
    
    context = {}
    template_context_processors = {
        'blueprint1': [Mock(return_value={'key1': 'value1'})],
        'blueprint2': [Mock(return_value={'key2': 'value2'})]
    }
    
    app = Mock()
    app.template_context_processors = template_context_processors
    
    update_template_context(app, ctx, context)
    
    assert context == {'key1': 'value1', 'key2': 'value2'}

def test_update_template_context_without_request():
    ctx = Mock()
    ctx.has_request = False
    
    context = {}
    template_context_processors = {
        None: [Mock(return_value={'key': 'value'})]
    }
    
    app = Mock()
    app.template_context_processors = template_context_processors
    
    update_template_context(app, ctx, context)
    
    assert context == {'key': 'value'}

def test_update_template_context_with_no_processors():
    ctx = Mock()
    ctx.has_request = True
    ctx.request.blueprints = ['blueprint1']
    
    context = {}
    template_context_processors = {
        'blueprint1': []
    }
    
    app = Mock()
    app.template_context_processors = template_context_processors
    
    update_template_context(app, ctx, context)
    
    assert context == {}
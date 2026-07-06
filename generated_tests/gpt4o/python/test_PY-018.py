import pytest
from flask import Flask, Blueprint
from flask.sansio.blueprints import _merge_blueprint_funcs

@pytest.fixture
def app():
    app = Flask(__name__)
    return app

@pytest.fixture
def blueprint():
    bp = Blueprint('test_blueprint', __name__)
    return bp

def test_merge_blueprint_funcs_no_error_handlers(app, blueprint):
    blueprint.error_handler_spec = {}
    blueprint.view_functions = {'test_view': lambda: 'test'}
    
    _merge_blueprint_funcs(blueprint, app, 'test_blueprint')
    
    assert 'test_blueprint.test_view' in app.view_functions
    assert app.error_handler_spec == {}

def test_merge_blueprint_funcs_with_error_handlers(app, blueprint):
    blueprint.error_handler_spec = {
        None: {404: {Exception: lambda e: 'not found'}}
    }
    blueprint.view_functions = {'test_view': lambda: 'test'}
    
    _merge_blueprint_funcs(blueprint, app, 'test_blueprint')
    
    assert 'test_blueprint.test_view' in app.view_functions
    assert 'test_blueprint' in app.error_handler_spec
    assert 404 in app.error_handler_spec['test_blueprint']
    assert Exception in app.error_handler_spec['test_blueprint'][404]

def test_merge_blueprint_funcs_with_before_request_funcs(app, blueprint):
    blueprint.before_request_funcs = {None: [lambda: 'before']}
    app.before_request_funcs = {None: []}
    
    _merge_blueprint_funcs(blueprint, app, 'test_blueprint')
    
    assert len(app.before_request_funcs[None]) == 1

def test_merge_blueprint_funcs_with_after_request_funcs(app, blueprint):
    blueprint.after_request_funcs = {None: [lambda response: response]}
    app.after_request_funcs = {None: []}
    
    _merge_blueprint_funcs(blueprint, app, 'test_blueprint')
    
    assert len(app.after_request_funcs[None]) == 1

def test_merge_blueprint_funcs_with_teardown_request_funcs(app, blueprint):
    blueprint.teardown_request_funcs = {None: [lambda exc: None]}
    app.teardown_request_funcs = {None: []}
    
    _merge_blueprint_funcs(blueprint, app, 'test_blueprint')
    
    assert len(app.teardown_request_funcs[None]) == 1

def test_merge_blueprint_funcs_with_url_default_functions(app, blueprint):
    blueprint.url_default_functions = {None: [lambda: 'default']}
    app.url_default_functions = {None: []}
    
    _merge_blueprint_funcs(blueprint, app, 'test_blueprint')
    
    assert len(app.url_default_functions[None]) == 1

def test_merge_blueprint_funcs_with_url_value_preprocessors(app, blueprint):
    blueprint.url_value_preprocessors = {None: [lambda value: value]}
    app.url_value_preprocessors = {None: []}
    
    _merge_blueprint_funcs(blueprint, app, 'test_blueprint')
    
    assert len(app.url_value_preprocessors[None]) == 1

def test_merge_blueprint_funcs_with_template_context_processors(app, blueprint):
    blueprint.template_context_processors = {None: [lambda: {'key': 'value'}]}
    app.template_context_processors = {None: []}
    
    _merge_blueprint_funcs(blueprint, app, 'test_blueprint')
    
    assert len(app.template_context_processors[None]) == 1
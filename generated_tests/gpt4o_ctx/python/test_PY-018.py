import pytest
from flask.sansio.blueprints import Blueprint

@pytest.fixture
def setup_blueprint():
    app = type('App', (), {'error_handler_spec': {}, 'view_functions': {}, 'before_request_funcs': defaultdict(list), 'after_request_funcs': defaultdict(list), 'teardown_request_funcs': defaultdict(list), 'url_default_functions': defaultdict(list), 'url_value_preprocessors': defaultdict(list), 'template_context_processors': defaultdict(list)})()
    blueprint = Blueprint('test_blueprint', __name__)
    return app, blueprint

def test_merge_blueprint_funcs_no_error_handlers(setup_blueprint):
    app, blueprint = setup_blueprint
    blueprint.error_handler_spec = {}
    blueprint.view_functions = {'test_view': lambda: 'test'}
    
    blueprint._merge_blueprint_funcs(app, 'test_blueprint')
    
    assert 'test_blueprint.test_view' in app.view_functions

def test_merge_blueprint_funcs_with_error_handlers(setup_blueprint):
    app, blueprint = setup_blueprint
    blueprint.error_handler_spec = {404: {Exception: lambda: 'not found'}}
    blueprint.view_functions = {'test_view': lambda: 'test'}
    
    blueprint._merge_blueprint_funcs(app, 'test_blueprint')
    
    assert 'test_blueprint.404' in app.error_handler_spec
    assert isinstance(app.error_handler_spec['test_blueprint.404'], dict)

def test_merge_blueprint_funcs_with_before_request_funcs(setup_blueprint):
    app, blueprint = setup_blueprint
    blueprint.before_request_funcs['test'] = [lambda: 'before']
    
    blueprint._merge_blueprint_funcs(app, 'test_blueprint')
    
    assert 'test_blueprint.test' in app.before_request_funcs

def test_merge_blueprint_funcs_with_after_request_funcs(setup_blueprint):
    app, blueprint = setup_blueprint
    blueprint.after_request_funcs['test'] = [lambda: 'after']
    
    blueprint._merge_blueprint_funcs(app, 'test_blueprint')
    
    assert 'test_blueprint.test' in app.after_request_funcs

def test_merge_blueprint_funcs_with_teardown_request_funcs(setup_blueprint):
    app, blueprint = setup_blueprint
    blueprint.teardown_request_funcs['test'] = [lambda: 'teardown']
    
    blueprint._merge_blueprint_funcs(app, 'test_blueprint')
    
    assert 'test_blueprint.test' in app.teardown_request_funcs

def test_merge_blueprint_funcs_with_url_default_functions(setup_blueprint):
    app, blueprint = setup_blueprint
    blueprint.url_default_functions['test'] = [lambda: 'default']
    
    blueprint._merge_blueprint_funcs(app, 'test_blueprint')
    
    assert 'test_blueprint.test' in app.url_default_functions

def test_merge_blueprint_funcs_with_url_value_preprocessors(setup_blueprint):
    app, blueprint = setup_blueprint
    blueprint.url_value_preprocessors['test'] = [lambda: 'preprocess']
    
    blueprint._merge_blueprint_funcs(app, 'test_blueprint')
    
    assert 'test_blueprint.test' in app.url_value_preprocessors

def test_merge_blueprint_funcs_with_template_context_processors(setup_blueprint):
    app, blueprint = setup_blueprint
    blueprint.template_context_processors['test'] = [lambda: 'context']
    
    blueprint._merge_blueprint_funcs(app, 'test_blueprint')
    
    assert 'test_blueprint.test' in app.template_context_processors
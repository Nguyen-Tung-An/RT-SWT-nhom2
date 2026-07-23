import pytest
from flask import Flask
from flask.templating import DispatchingJinjaLoader

class MockLoader:
    def list_templates(self):
        return ['template1.html', 'template2.html']

class MockBlueprint:
    def __init__(self, jinja_loader):
        self.jinja_loader = jinja_loader

def test_list_templates_with_app_loader():
    app = Flask('test_app')
    app.jinja_loader = MockLoader()
    loader = DispatchingJinjaLoader(app=app)
    
    with app.test_request_context('/'):
        templates = loader.list_templates()
        assert templates == ['template1.html', 'template2.html']

def test_list_templates_with_blueprint_loader():
    app = Flask('test_app')
    app.jinja_loader = None
    blueprint = MockBlueprint(MockLoader())
    app.register_blueprint(blueprint)
    
    loader = DispatchingJinjaLoader(app=app)
    
    with app.test_request_context('/'):
        templates = loader.list_templates()
        assert templates == ['template1.html', 'template2.html']

def test_list_templates_with_no_loaders():
    app = Flask('test_app')
    app.jinja_loader = None
    blueprint = MockBlueprint(None)
    app.register_blueprint(blueprint)
    
    loader = DispatchingJinjaLoader(app=app)
    
    with app.test_request_context('/'):
        templates = loader.list_templates()
        assert templates == []
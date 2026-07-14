import pytest
from flask import Flask
from jinja2 import BaseLoader, TemplateNotFound
from flask.templating import DispatchingJinjaLoader

class MockLoader(BaseLoader):
    def __init__(self, source):
        self.source = source

    def get_source(self, environment, template):
        if self.source is None:
            raise TemplateNotFound(template)
        return self.source, None, None

class MockEnvironment:
    def __init__(self, app):
        self.app = app

class MockApp:
    pass

@pytest.fixture
def setup_environment():
    app = MockApp()
    environment = MockEnvironment(app)
    return app, environment

def test_get_source_explained_success(setup_environment):
    app, environment = setup_environment
    loader = MockLoader("template content")
    template = "test_template"
    result = loader.get_source(environment, template)
    assert result == ("template content", None, None)

def test_get_source_explained_template_not_found(setup_environment):
    app, environment = setup_environment
    loader = MockLoader(None)
    template = "non_existent_template"
    with pytest.raises(TemplateNotFound):
        loader.get_source(environment, template)

def test_get_source_explained_multiple_loaders(setup_environment):
    app, environment = setup_environment
    loader1 = MockLoader(None)
    loader2 = MockLoader("template content")
    loaders = [loader1, loader2]
    
    def iter_loaders(template):
        for loader in loaders:
            yield (None, loader)

    # Mock the _iter_loaders method
    original_iter_loaders = DispatchingJinjaLoader.get_source
    DispatchingJinjaLoader.get_source = iter_loaders

    template = "test_template"
    result = loader1.get_source(environment, template)
    assert result == ("template content", None, None)

    # Restore the original method
    DispatchingJinjaLoader.get_source = original_iter_loaders
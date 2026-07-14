import pytest
from flask.templating import _get_source_explained
from flask import Flask
from jinja2 import BaseLoader, TemplateNotFound

class MockLoader(BaseLoader):
    def __init__(self, source):
        self.source = source

    def get_source(self, environment, template):
        if self.source is None:
            raise TemplateNotFound(template)
        return self.source, None, None

class MockEnvironment:
    pass

class MockApp:
    pass

@pytest.fixture
def setup_environment():
    app = MockApp()
    environment = MockEnvironment()
    return app, environment

def test_get_source_explained_success(setup_environment):
    app, environment = setup_environment
    loader = MockLoader("template content")
    template = "test_template"
    result = _get_source_explained(loader, environment, template)
    assert result == ("template content", None, None)

def test_get_source_explained_template_not_found(setup_environment):
    app, environment = setup_environment
    loader = MockLoader(None)
    template = "non_existent_template"
    with pytest.raises(TemplateNotFound):
        _get_source_explained(loader, environment, template)

def test_get_source_explained_multiple_loaders(setup_environment):
    app, environment = setup_environment
    loader1 = MockLoader(None)
    loader2 = MockLoader("template content")
    loaders = [loader1, loader2]
    
    def iter_loaders(template):
        for loader in loaders:
            yield (None, loader)

    # Mock the _iter_loaders method
    original_iter_loaders = _get_source_explained._iter_loaders
    _get_source_explained._iter_loaders = iter_loaders

    template = "test_template"
    result = _get_source_explained(loader1, environment, template)
    assert result == ("template content", None, None)

    # Restore the original method
    _get_source_explained._iter_loaders = original_iter_loaders
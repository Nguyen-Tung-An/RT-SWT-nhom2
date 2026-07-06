import pytest
from flask.templating import _get_source_explained
from flask import Flask
from jinja2 import BaseLoader, TemplateNotFound

class MockLoader(BaseLoader):
    def __init__(self, source: str, should_raise: bool = False):
        self.source = source
        self.should_raise = should_raise

    def get_source(self, environment, template):
        if self.should_raise:
            raise TemplateNotFound(template)
        return self.source, None, lambda: False

class MockEnvironment:
    def __init__(self, loaders):
        self.loaders = loaders

    def _iter_loaders(self, template):
        for loader in self.loaders:
            yield (None, loader)

@pytest.fixture
def app():
    return Flask(__name__)

def test_get_source_explained_success(app):
    loaders = [MockLoader("template content")]
    env = MockEnvironment(loaders)
    result = _get_source_explained(app.jinja_env, "template_name")
    assert result == ("template content", None, lambda: False)

def test_get_source_explained_multiple_loaders_success(app):
    loaders = [MockLoader("first loader content"), MockLoader("second loader content")]
    env = MockEnvironment(loaders)
    result = _get_source_explained(app.jinja_env, "template_name")
    assert result == ("first loader content", None, lambda: False)

def test_get_source_explained_template_not_found(app):
    loaders = [MockLoader("first loader content"), MockLoader("second loader content", should_raise=True)]
    env = MockEnvironment(loaders)
    with pytest.raises(TemplateNotFound):
        _get_source_explained(app.jinja_env, "template_name")

def test_get_source_explained_all_loaders_fail(app):
    loaders = [MockLoader("first loader content", should_raise=True), MockLoader("second loader content", should_raise=True)]
    env = MockEnvironment(loaders)
    with pytest.raises(TemplateNotFound):
        _get_source_explained(app.jinja_env, "template_name")
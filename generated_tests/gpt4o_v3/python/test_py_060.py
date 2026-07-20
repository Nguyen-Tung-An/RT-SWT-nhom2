import pytest
from flask import Flask
from flask.templating import DispatchingJinjaLoader
from jinja2 import TemplateNotFound

class TestDispatchingJinjaLoader:
    @pytest.fixture
    def app(self):
        return Flask('test_app')

    @pytest.fixture
    def loader(self, app):
        return DispatchingJinjaLoader(app=app)

    def test_get_source_explained_valid_template(self, loader, app):
        with app.test_request_context('/'):
            result = loader._get_source_explained(app.jinja_env, 'valid_template.html')
            assert isinstance(result, tuple)
            assert len(result) == 3
            assert result[0] == 'source of valid_template.html'  # Assuming this is the expected source

    def test_get_source_explained_template_not_found(self, loader, app):
        with app.test_request_context('/'):
            with pytest.raises(TemplateNotFound):
                loader._get_source_explained(app.jinja_env, 'non_existent_template.html')

    def test_get_source_explained_multiple_loaders(self, loader, app):
        # Assuming we have a way to add multiple loaders to the environment
        app.jinja_env.loader = [loader]  # This is a simplification for the test
        with app.test_request_context('/'):
            result = loader._get_source_explained(app.jinja_env, 'another_valid_template.html')
            assert isinstance(result, tuple)
            assert len(result) == 3
            assert result[0] == 'source of another_valid_template.html'  # Assuming this is the expected source

    def test_get_source_explained_empty_template_name(self, loader, app):
        with app.test_request_context('/'):
            with pytest.raises(TemplateNotFound):
                loader._get_source_explained(app.jinja_env, '')
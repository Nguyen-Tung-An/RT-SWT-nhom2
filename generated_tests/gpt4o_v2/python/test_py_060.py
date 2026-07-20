import pytest
from flask.templating import DispatchingJinjaLoader
from jinja2 import TemplateNotFound, Environment

class TestDispatchingJinjaLoader:
    def setup_method(self):
        self.loader = DispatchingJinjaLoader()
        self.environment = Environment()

    def test_get_source_explained_success(self):
        template_name = "existing_template.html"
        # Assuming the loader is set up to find this template
        result = self.loader._get_source_explained(self.environment, template_name)
        assert isinstance(result, tuple)
        assert len(result) == 3
        assert result[0] == "expected_source"  # Replace with actual expected source

    def test_get_source_explained_template_not_found(self):
        template_name = "non_existing_template.html"
        with pytest.raises(TemplateNotFound):
            self.loader._get_source_explained(self.environment, template_name)

    def test_get_source_explained_multiple_loaders(self):
        template_name = "template_with_multiple_loaders.html"
        # Assuming the loader is set up to find this template with multiple loaders
        result = self.loader._get_source_explained(self.environment, template_name)
        assert isinstance(result, tuple)
        assert len(result) == 3
        assert result[0] == "expected_source_from_multiple_loaders"  # Replace with actual expected source

    def test_get_source_explained_no_valid_loaders(self):
        template_name = "template_with_no_valid_loaders.html"
        with pytest.raises(TemplateNotFound):
            self.loader._get_source_explained(self.environment, template_name)

    def test_get_source_explained_empty_template_name(self):
        template_name = ""
        with pytest.raises(TemplateNotFound):
            self.loader._get_source_explained(self.environment, template_name)
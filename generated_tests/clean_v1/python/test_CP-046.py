import pytest
from flask import Flask
from flask.templating import _render_template

class TestTemplateLoader:
    def setup_method(self):
        self.app = Flask(__name__)
        self.app.jinja_loader = None  # Test case where no loader is set

    def test_list_templates_no_loader(self):
        assert self.app.jinja_loader is None
        templates = self.app.jinja_loader.list_templates() if self.app.jinja_loader else []
        assert templates == []

    def test_list_templates_with_loader(self):
        class MockLoader:
            def list_templates(self):
                return ['template1.html', 'template2.html']

        self.app.jinja_loader = MockLoader()
        templates = self.app.jinja_loader.list_templates()
        assert templates == ['template1.html', 'template2.html']

    def test_list_templates_with_blueprint_loader(self):
        class MockLoader:
            def list_templates(self):
                return ['blueprint_template.html']

        blueprint = Flask('blueprint')
        blueprint.jinja_loader = MockLoader()
        self.app.register_blueprint(blueprint)

        templates = self.app.jinja_loader.list_templates() if self.app.jinja_loader else []
        assert templates == []

        # Now we need to iterate over blueprints
        result = set()
        for blueprint in self.app.iter_blueprints():
            loader = blueprint.jinja_loader
            if loader is not None:
                result.update(loader.list_templates())

        assert 'blueprint_template.html' in result
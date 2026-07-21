import pytest
from flask import Flask
from flask.templating import _render_template

class TestTemplateLoader:
    def setup_method(self):
        self.app = Flask(__name__)
        self.app.jinja_loader = None  # Test case with no loader

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
        for bp in self.app.iter_blueprints():
            templates.extend(bp.jinja_loader.list_templates())
        assert 'blueprint_template.html' in templates
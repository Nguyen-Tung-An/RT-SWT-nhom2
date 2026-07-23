import pytest
from flask import Flask
from flask.templating import DispatchingJinjaLoader

class TestDispatchingJinjaLoader:
    @pytest.fixture
    def app(self):
        app = Flask('test_app')
        return app

    @pytest.fixture
    def loader(self, app):
        return DispatchingJinjaLoader(app=app)

    def test_list_templates_no_loader(self, loader, app):
        app.jinja_loader = None
        with app.test_request_context('/'):
            result = loader.list_templates()
            assert result == []

    def test_list_templates_with_app_loader(self, loader, app):
        class MockLoader:
            def list_templates(self):
                return ['template1.html', 'template2.html']

        app.jinja_loader = MockLoader()
        with app.test_request_context('/'):
            result = loader.list_templates()
            assert sorted(result) == sorted(['template1.html', 'template2.html'])

    def test_list_templates_with_blueprint_loader(self, loader, app):
        class MockLoader:
            def list_templates(self):
                return ['blueprint_template1.html']

        blueprint = Flask('blueprint')
        blueprint.jinja_loader = MockLoader()
        app.register_blueprint(blueprint)

        with app.test_request_context('/'):
            result = loader.list_templates()
            assert sorted(result) == sorted(['blueprint_template1.html'])

    def test_list_templates_with_multiple_loaders(self, loader, app):
        class MockLoader1:
            def list_templates(self):
                return ['template1.html']

        class MockLoader2:
            def list_templates(self):
                return ['template2.html']

        app.jinja_loader = MockLoader1()
        blueprint = Flask('blueprint')
        blueprint.jinja_loader = MockLoader2()
        app.register_blueprint(blueprint)

        with app.test_request_context('/'):
            result = loader.list_templates()
            assert sorted(result) == sorted(['template1.html', 'template2.html'])
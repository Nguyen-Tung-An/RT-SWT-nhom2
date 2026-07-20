import pytest
from flask.cli import FlaskGroup
from flask import Flask
from click import Context
from unittest.mock import MagicMock

class TestFlaskGroupGetCommand:
    @pytest.fixture
    def app(self):
        app = Flask(__name__)
        return app

    @pytest.fixture
    def flask_group(self, app):
        return FlaskGroup(app)

    def test_get_command_existing_command(self, flask_group):
        ctx = MagicMock(spec=Context)
        ctx.ensure_object.return_value.load_app.return_value = app
        command_name = 'runserver'
        
        # Assuming 'runserver' is a valid command in the Flask app
        command = flask_group.get_command(ctx, command_name)
        assert command is not None
        assert command.name == command_name

    def test_get_command_non_existing_command(self, flask_group):
        ctx = MagicMock(spec=Context)
        ctx.ensure_object.return_value.load_app.return_value = app
        command_name = 'non_existing_command'
        
        command = flask_group.get_command(ctx, command_name)
        assert command is None

    def test_get_command_no_app_exception(self, flask_group):
        ctx = MagicMock(spec=Context)
        ctx.ensure_object.return_value.load_app.side_effect = NoAppException("No application found.")
        
        command_name = 'runserver'
        command = flask_group.get_command(ctx, command_name)
        
        assert command is None
        ctx.ensure_object.return_value.load_app.assert_called_once()

    def test_get_command_with_app_context(self, flask_group, app):
        ctx = MagicMock(spec=Context)
        ctx.ensure_object.return_value.load_app.return_value = app
        
        command_name = 'runserver'
        command = flask_group.get_command(ctx, command_name)
        
        assert command is not None
        ctx.with_resource.assert_called_once()
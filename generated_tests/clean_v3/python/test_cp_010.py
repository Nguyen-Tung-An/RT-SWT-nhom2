import pytest
from flask import Flask, current_app
from flask.cli import FlaskGroup
import click
from click.exceptions import NoAppException

class TestFlaskGroupGetCommand:
    @pytest.fixture
    def flask_group(self):
        return FlaskGroup()

    @pytest.fixture
    def app(self):
        app = Flask('test_app')
        return app

    def test_get_command_existing_command(self, flask_group, app):
        @app.cli.command(name='test_command')
        def test_command():
            return "Test Command Executed"

        with app.test_request_context('/'):
            ctx = click.Context(flask_group)
            command = flask_group.get_command(ctx, 'test_command')
            assert command is not None
            assert command.name == 'test_command'

    def test_get_command_non_existing_command(self, flask_group, app):
        with app.test_request_context('/'):
            ctx = click.Context(flask_group)
            command = flask_group.get_command(ctx, 'non_existing_command')
            assert command is None

    def test_get_command_no_app_exception(self, flask_group):
        ctx = click.Context(flask_group)
        with pytest.raises(NoAppException):
            flask_group.get_command(ctx, 'test_command')

    def test_get_command_with_error_message(self, flask_group, app, capsys):
        with app.test_request_context('/'):
            ctx = click.Context(flask_group)
            flask_group.get_command(ctx, 'non_existing_command')
            captured = capsys.readouterr()
            assert "Error:" in captured.err
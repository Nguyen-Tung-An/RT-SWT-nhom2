import pytest
from flask import Flask, current_app
from flask.cli import FlaskGroup
import click

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
            assert command.invoke() == "Test Command Executed"

    def test_get_command_non_existing_command(self, flask_group, app):
        with app.test_request_context('/'):
            ctx = click.Context(flask_group)
            command = flask_group.get_command(ctx, 'non_existing_command')
            assert command is None

    def test_get_command_no_app_exception(self, flask_group):
        ctx = click.Context(flask_group)
        with pytest.raises(click.exceptions.NoAppException):
            flask_group.get_command(ctx, 'test_command')

    def test_get_command_with_app_context(self, flask_group, app):
        @app.cli.command(name='another_command')
        def another_command():
            return "Another Command Executed"

        with app.test_request_context('/'):
            ctx = click.Context(flask_group)
            command = flask_group.get_command(ctx, 'another_command')
            assert command is not None
            assert command.invoke() == "Another Command Executed"
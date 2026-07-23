import pytest
from flask import Flask, current_app
from flask.cli import FlaskGroup
from click import Context
from click.testing import CliRunner
from unittest.mock import MagicMock, patch

@pytest.fixture
def app():
    app = Flask('test_app')
    return app

@pytest.fixture
def flask_group(app):
    return FlaskGroup(app)

def test_get_command_existing_command(flask_group):
    runner = CliRunner()
    with runner.isolated_filesystem():
        result = flask_group.get_command(Context(flask_group), 'run')
        assert result is not None  # Assuming 'run' is a valid command

def test_get_command_non_existing_command(flask_group):
    runner = CliRunner()
    with runner.isolated_filesystem():
        result = flask_group.get_command(Context(flask_group), 'non_existing_command')
        assert result is None

def test_get_command_no_app_exception(flask_group):
    ctx = MagicMock(spec=Context)
    ctx.ensure_object.return_value.load_app.side_effect = NoAppException("No application found.")
    
    with patch('click.secho') as mock_secho:
        result = flask_group.get_command(ctx, 'run')
        mock_secho.assert_called_once_with("Error: No application found.\n", err=True, fg="red")
        assert result is None

def test_get_command_with_app_context(flask_group, app):
    ctx = MagicMock(spec=Context)
    ctx.ensure_object.return_value.load_app.return_value = app
    
    with app.app_context():
        result = flask_group.get_command(ctx, 'run')
        assert result is not None  # Assuming 'run' is a valid command

def test_get_command_with_different_app_context(flask_group, app):
    ctx = MagicMock(spec=Context)
    ctx.ensure_object.return_value.load_app.return_value = app
    
    with app.app_context():
        current_app._get_current_object = MagicMock(return_value=Flask('another_app'))
        result = flask_group.get_command(ctx, 'run')
        assert result is not None  # Assuming 'run' is a valid command
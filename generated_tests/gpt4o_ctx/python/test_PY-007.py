import pytest
from flask.cli import FlaskGroup
from unittest.mock import MagicMock, patch
import click

@pytest.fixture
def flask_group():
    return FlaskGroup(add_default_commands=False, create_app=lambda: None, add_version_option=False, load_dotenv=False, set_debug_flag=False)

def test_get_command_existing_command(flask_group):
    ctx = MagicMock()
    ctx.ensure_object.return_value = MagicMock(load_app=lambda: None)
    flask_group.get_command = MagicMock(return_value='existing_command')

    command = flask_group.get_command(ctx, 'existing_command')
    assert command == 'existing_command'

def test_get_command_no_app_exception(flask_group):
    ctx = MagicMock()
    ctx.ensure_object.return_value = MagicMock(load_app=lambda: None)
    flask_group.get_command = MagicMock(return_value=None)

    with patch('flask.cli.NoAppException', side_effect=NoAppException("No app found")):
        with patch('click.secho') as mock_secho:
            command = flask_group.get_command(ctx, 'non_existing_command')
            assert command is None
            mock_secho.assert_called_once_with("Error: No app found\n", err=True, fg="red")

def test_get_command_app_context(flask_group):
    ctx = MagicMock()
    app_mock = MagicMock()
    app_mock.cli.get_command.return_value = 'app_command'
    ctx.ensure_object.return_value = MagicMock(load_app=lambda: app_mock)

    command = flask_group.get_command(ctx, 'app_command')
    assert command == 'app_command'
    ctx.with_resource.assert_called_once_with(app_mock.app_context())
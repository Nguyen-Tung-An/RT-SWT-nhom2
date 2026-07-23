import pytest
from flask.cli import get_command
from unittest.mock import MagicMock, patch
import click

@pytest.fixture
def mock_context():
    return MagicMock(spec=click.Context)

@pytest.fixture
def mock_script_info():
    return MagicMock()

@pytest.fixture
def mock_app():
    return MagicMock()

def test_get_command_existing_command(mock_context):
    mock_context.ensure_object.return_value = MagicMock()
    mock_context.ensure_object.return_value.load_app.return_value = mock_app
    mock_app.cli.get_command.return_value = MagicMock()

    command = get_command(mock_context, 'existing_command')
    assert command is not None
    mock_app.cli.get_command.assert_called_once_with(mock_context, 'existing_command')

def test_get_command_no_app_exception(mock_context):
    mock_context.ensure_object.return_value = MagicMock()
    mock_context.ensure_object.return_value.load_app.side_effect = NoAppException("No app found")

    command = get_command(mock_context, 'non_existing_command')
    assert command is None
    click.secho.assert_called_once_with("Error: No app found\n", err=True, fg="red")

def test_get_command_no_command_found(mock_context):
    mock_context.ensure_object.return_value = MagicMock()
    mock_context.ensure_object.return_value.load_app.return_value = mock_app
    mock_app.cli.get_command.return_value = None

    command = get_command(mock_context, 'non_existing_command')
    assert command is None
    mock_app.cli.get_command.assert_called_once_with(mock_context, 'non_existing_command')

def test_get_command_with_active_context(mock_context):
    mock_context.ensure_object.return_value = MagicMock()
    mock_context.ensure_object.return_value.load_app.return_value = mock_app
    mock_app.cli.get_command.return_value = MagicMock()
    current_app._get_current_object.return_value = mock_app

    command = get_command(mock_context, 'existing_command')
    assert command is not None
    mock_app.cli.get_command.assert_called_once_with(mock_context, 'existing_command')
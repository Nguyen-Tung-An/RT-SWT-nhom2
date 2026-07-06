import pytest
from flask.cli import ScriptInfo, NoAppException, get_command
from unittest.mock import MagicMock

@pytest.fixture
def mock_context():
    ctx = MagicMock(spec=click.Context)
    ctx.ensure_object.return_value = MagicMock(spec=ScriptInfo)
    return ctx

def test_get_command_existing_command(mock_context):
    mock_context.ensure_object().load_app.return_value.cli.get_command.return_value = MagicMock()
    command = get_command(mock_context, 'existing_command')
    assert command is not None

def test_get_command_non_existing_command(mock_context):
    mock_context.ensure_object().load_app.return_value.cli.get_command.return_value = None
    command = get_command(mock_context, 'non_existing_command')
    assert command is None

def test_get_command_no_app_exception(mock_context):
    mock_context.ensure_object().load_app.side_effect = NoAppException("No application found")
    with pytest.raises(SystemExit):
        command = get_command(mock_context, 'any_command')
    mock_context.ensure_object().load_app.assert_called_once()

def test_get_command_app_context(mock_context):
    mock_app = MagicMock()
    mock_context.ensure_object().load_app.return_value = mock_app
    mock_app.cli.get_command.return_value = MagicMock()
    
    command = get_command(mock_context, 'command_with_app_context')
    assert command is not None
    mock_context.with_resource.assert_called_once_with(mock_app.app_context())
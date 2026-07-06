import pytest
from flask.cli import _env_file_callback
import click

class MockContext:
    def __init__(self, load_dotenv_defaults=False):
        self.obj = type('obj', (object,), {'load_dotenv_defaults': load_dotenv_defaults})

@pytest.fixture
def mock_context():
    return MockContext()

def test_env_file_callback_with_value(mock_context):
    result = _env_file_callback(mock_context, click.Option(param_decls=['--env-file']), 'test.env')
    assert result == 'test.env'

def test_env_file_callback_without_value(mock_context):
    result = _env_file_callback(mock_context, click.Option(param_decls=['--env-file']), None)
    assert result is None

def test_env_file_callback_with_load_defaults(mock_context):
    mock_context = MockContext(load_dotenv_defaults=True)
    result = _env_file_callback(mock_context, click.Option(param_decls=['--env-file']), None)
    assert result is None

def test_env_file_callback_import_error(mock_context):
    with pytest.raises(click.BadParameter, match="python-dotenv must be installed to load an env file."):
        _env_file_callback(mock_context, click.Option(param_decls=['--env-file']), 'test.env')
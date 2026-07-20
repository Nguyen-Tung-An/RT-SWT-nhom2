import pytest
import click
from flask.cli import _env_file_callback
from unittest.mock import MagicMock

@pytest.fixture
def ctx():
    return click.Context(MagicMock(), obj=MagicMock(load_dotenv_defaults=False))

def test_env_file_callback_with_value(ctx):
    result = _env_file_callback(ctx, MagicMock(), "test.env")
    assert result == "test.env"

def test_env_file_callback_with_none_value(ctx):
    result = _env_file_callback(ctx, MagicMock(), None)
    assert result is None

def test_env_file_callback_with_load_defaults(ctx):
    ctx.obj.load_dotenv_defaults = True
    result = _env_file_callback(ctx, MagicMock(), None)
    assert result is None

def test_env_file_callback_import_error(ctx):
    with pytest.raises(click.BadParameter, match="python-dotenv must be installed to load an env file."):
        _env_file_callback(ctx, MagicMock(), "test.env")

def test_env_file_callback_no_value_with_load_defaults(ctx):
    ctx.obj.load_dotenv_defaults = True
    result = _env_file_callback(ctx, MagicMock(), None)
    assert result is None
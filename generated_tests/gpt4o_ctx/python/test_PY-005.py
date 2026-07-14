import pytest
from flask.cli import _env_file_callback
import click

def test_env_file_callback_with_value():
    ctx = click.Context(click.Command("test"))
    param = click.Option(["--env-file"], type=str)
    value = "test.env"
    assert _env_file_callback(ctx, param, value) == value

def test_env_file_callback_without_value():
    ctx = click.Context(click.Command("test"))
    param = click.Option(["--env-file"], type=str)
    value = None
    assert _env_file_callback(ctx, param, value) is None

def test_env_file_callback_with_load_dotenv_defaults():
    ctx = click.Context(click.Command("test"), obj={"load_dotenv_defaults": True})
    param = click.Option(["--env-file"], type=str)
    value = None
    assert _env_file_callback(ctx, param, value) is None

def test_env_file_callback_import_error():
    ctx = click.Context(click.Command("test"))
    param = click.Option(["--env-file"], type=str)
    
    with pytest.raises(click.BadParameter, match="python-dotenv must be installed to load an env file."):
        _env_file_callback(ctx, param, "test.env")
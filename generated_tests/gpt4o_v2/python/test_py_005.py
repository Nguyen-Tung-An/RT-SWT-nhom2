import pytest
from unittest.mock import MagicMock
from flask.cli import _env_file_callback
import click

class TestEnvFileCallback:
    @pytest.fixture
    def ctx(self):
        return MagicMock(spec=click.Context)

    @pytest.fixture
    def param(self):
        return MagicMock(spec=click.Option)

    def test_env_file_callback_with_value(self, ctx, param):
        ctx.obj = MagicMock(load_dotenv_defaults=False)
        result = _env_file_callback(ctx, param, "test.env")
        assert result == "test.env"

    def test_env_file_callback_with_none_value(self, ctx, param):
        ctx.obj = MagicMock(load_dotenv_defaults=True)
        result = _env_file_callback(ctx, param, None)
        assert result is None

    def test_env_file_callback_with_value_and_load_defaults(self, ctx, param):
        ctx.obj = MagicMock(load_dotenv_defaults=True)
        result = _env_file_callback(ctx, param, "test.env")
        assert result == "test.env"

    def test_env_file_callback_import_error_with_value(self, ctx, param):
        ctx.obj = MagicMock(load_dotenv_defaults=False)
        with pytest.raises(click.BadParameter, match="python-dotenv must be installed to load an env file."):
            _env_file_callback(ctx, param, "test.env")

    def test_env_file_callback_import_error_without_value(self, ctx, param):
        ctx.obj = MagicMock(load_dotenv_defaults=False)
        result = _env_file_callback(ctx, param, None)
        assert result is None
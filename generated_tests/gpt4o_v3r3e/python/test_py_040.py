import pytest
import click
from flask.cli import _validate_key

class TestValidateKey:
    @pytest.fixture
    def ctx(self, app_ctx):
        return click.Context(click.Command("test"))

    def test_valid_key_with_cert(self, ctx):
        ctx.params["cert"] = "valid_cert"
        result = _validate_key(ctx, click.Option(["--key"]), "valid_key")
        assert result == "valid_key"
        assert ctx.params["cert"] == ("valid_cert", "valid_key")

    def test_valid_key_with_adhoc_cert(self, ctx):
        ctx.params["cert"] = "adhoc"
        with pytest.raises(click.BadParameter) as excinfo:
            _validate_key(ctx, click.Option(["--key"]), "valid_key")
        assert str(excinfo.value) == 'When "--cert" is "adhoc", "--key" is not used.'

    def test_valid_key_with_ssl_context(self, ctx):
        import ssl
        ctx.params["cert"] = ssl.create_default_context()
        with pytest.raises(click.BadParameter) as excinfo:
            _validate_key(ctx, click.Option(["--key"]), "valid_key")
        assert str(excinfo.value) == 'When "--cert" is an SSLContext object, "--key" is not used.'

    def test_missing_cert(self, ctx):
        ctx.params["cert"] = None
        with pytest.raises(click.BadParameter) as excinfo:
            _validate_key(ctx, click.Option(["--key"]), "valid_key")
        assert str(excinfo.value) == '"--cert" must also be specified.'

    def test_key_required_when_cert_provided(self, ctx):
        ctx.params["cert"] = "valid_cert"
        with pytest.raises(click.BadParameter) as excinfo:
            _validate_key(ctx, click.Option(["--key"]), None)
        assert str(excinfo.value) == 'Required when using "--cert".'
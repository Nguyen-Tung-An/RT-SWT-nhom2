import pytest
import click
from flask.cli import _validate_key

@pytest.fixture
def ctx():
    return click.Context(click.Command("test"))

def test_validate_key_adhoc(ctx):
    ctx.params["cert"] = "adhoc"
    with pytest.raises(click.BadParameter, match='When "--cert" is "adhoc", "--key" is not used.'):
        _validate_key(ctx, click.Parameter(name="key"), "my_key")

def test_validate_key_ssl_context(ctx):
    class MockSSLContext:
        pass

    ctx.params["cert"] = MockSSLContext()
    with pytest.raises(click.BadParameter, match='When "--cert" is an SSLContext object, "--key" is not used.'):
        _validate_key(ctx, click.Parameter(name="key"), "my_key")

def test_validate_key_no_cert(ctx):
    ctx.params["cert"] = None
    with pytest.raises(click.BadParameter, match='"--cert" must also be specified.'):
        _validate_key(ctx, click.Parameter(name="key"), "my_key")

def test_validate_key_required_when_cert(ctx):
    ctx.params["cert"] = "my_cert"
    with pytest.raises(click.BadParameter, match='Required when using "--cert".'):
        _validate_key(ctx, click.Parameter(name="key"), None)

def test_validate_key_success(ctx):
    ctx.params["cert"] = "my_cert"
    result = _validate_key(ctx, click.Parameter(name="key"), "my_key")
    assert result == "my_key"
    assert ctx.params["cert"] == ("my_cert", "my_key")
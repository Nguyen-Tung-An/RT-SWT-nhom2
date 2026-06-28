import pytest
import click
from flask.cli import _validate_key

def test_validate_key_adhoc_cert():
    ctx = click.Context(click.Command("test"))
    ctx.params = {"cert": "adhoc"}
    with pytest.raises(click.BadParameter, match='When "--cert" is "adhoc", "--key" is not used.'):
        _validate_key(ctx, click.Parameter(name="key"), "some_key")

def test_validate_key_ssl_context():
    class MockSSLContext:
        pass

    ctx = click.Context(click.Command("test"))
    ctx.params = {"cert": MockSSLContext()}
    with pytest.raises(click.BadParameter, match='When "--cert" is an SSLContext object, "--key" is not used.'):
        _validate_key(ctx, click.Parameter(name="key"), "some_key")

def test_validate_key_no_cert():
    ctx = click.Context(click.Command("test"))
    ctx.params = {"cert": None}
    with pytest.raises(click.BadParameter, match='"--cert" must also be specified.'):
        _validate_key(ctx, click.Parameter(name="key"), "some_key")

def test_validate_key_required_key():
    ctx = click.Context(click.Command("test"))
    ctx.params = {"cert": "some_cert"}
    with pytest.raises(click.BadParameter, match='Required when using "--cert".'):
        _validate_key(ctx, click.Parameter(name="key"), None)

def test_validate_key_success():
    ctx = click.Context(click.Command("test"))
    ctx.params = {"cert": "some_cert"}
    result = _validate_key(ctx, click.Parameter(name="key"), "some_key")
    assert result == "some_key"
    assert ctx.params["cert"] == ("some_cert", "some_key")
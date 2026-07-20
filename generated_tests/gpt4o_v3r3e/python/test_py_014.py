import pytest
import flask
import click
import ssl
from flask.cli import CertParamType

class TestCertParamType:
    def setup_method(self):
        self.cert_param_type = CertParamType()

    def test_convert_valid_ssl_context(self):
        app = flask.Flask('test_app')
        with app.test_request_context('/'):
            value = 'path/to/valid/cert'
            param = click.Option(['--cert'], type=click.STRING)
            ctx = click.Context(click.Command('test'))
            result = self.cert_param_type.convert(value, param, ctx)
            assert isinstance(result, ssl.SSLContext)

    def test_convert_invalid_cert_path(self):
        app = flask.Flask('test_app')
        with app.test_request_context('/'):
            value = 'invalid/cert/path'
            param = click.Option(['--cert'], type=click.STRING)
            ctx = click.Context(click.Command('test'))
            with pytest.raises(click.BadParameter):
                self.cert_param_type.convert(value, param, ctx)

    def test_convert_adhoc_cert(self):
        app = flask.Flask('test_app')
        with app.test_request_context('/'):
            value = 'adhoc'
            param = click.Option(['--cert'], type=click.STRING)
            ctx = click.Context(click.Command('test'))
            result = self.cert_param_type.convert(value, param, ctx)
            assert result == 'adhoc'

    def test_convert_missing_ssl_import(self, monkeypatch):
        monkeypatch.setattr('ssl', None)
        app = flask.Flask('test_app')
        with app.test_request_context('/'):
            value = 'path/to/valid/cert'
            param = click.Option(['--cert'], type=click.STRING)
            ctx = click.Context(click.Command('test'))
            with pytest.raises(click.BadParameter, match='Using "--cert" requires Python to be compiled with SSL support.'):
                self.cert_param_type.convert(value, param, ctx)

    def test_convert_missing_cryptography_import(self, monkeypatch):
        app = flask.Flask('test_app')
        with app.test_request_context('/'):
            value = 'adhoc'
            param = click.Option(['--cert'], type=click.STRING)
            ctx = click.Context(click.Command('test'))
            monkeypatch.setattr('cryptography', None)
            with pytest.raises(click.BadParameter, match='Using ad-hoc certificates requires the cryptography library.'):
                self.cert_param_type.convert(value, param, ctx)
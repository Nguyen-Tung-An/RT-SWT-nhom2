import click
import pytest
from flask import Flask
from flask.cli import FlaskGroup

@pytest.fixture
def flask_group():
    return FlaskGroup()

@pytest.fixture
def app():
    app = Flask('test_app')
    return app

def test_parse_args_no_args(flask_group, app):
    with app.test_request_context('/'):
        result = flask_group.parse_args(click.Context(flask_group), [])
        assert result == []

def test_parse_args_help_option(flask_group, app):
    with app.test_request_context('/'):
        result = flask_group.parse_args(click.Context(flask_group), ['--help'])
        assert result == ['--help']

def test_parse_args_with_env_file(flask_group, app):
    with app.test_request_context('/'):
        result = flask_group.parse_args(click.Context(flask_group), ['--env-file', 'test.env'])
        assert result == ['--env-file', 'test.env']

def test_parse_args_with_app_option(flask_group, app):
    with app.test_request_context('/'):
        result = flask_group.parse_args(click.Context(flask_group), ['--app', 'myapp'])
        assert result == ['--app', 'myapp']

def test_parse_args_with_multiple_args(flask_group, app):
    with app.test_request_context('/'):
        result = flask_group.parse_args(click.Context(flask_group), ['arg1', 'arg2'])
        assert result == ['arg1', 'arg2']
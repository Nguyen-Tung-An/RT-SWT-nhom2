import pytest
import click
from flask import Flask
from flask.cli import FlaskGroup

class TestFlaskGroupParseArgs:
    @pytest.fixture
    def flask_group(self):
        return FlaskGroup()

    @pytest.fixture
    def app(self):
        app = Flask('test_app')
        return app

    def test_parse_args_no_args_help(self, flask_group, app):
        with app.test_request_context('/'):
            result = flask_group.parse_args(click.Context(flask_group), [])
            assert result is not None  # Check that the result is not None
            assert isinstance(result, list)  # Ensure the result is a list

    def test_parse_args_single_help_option(self, flask_group, app):
        with app.test_request_context('/'):
            result = flask_group.parse_args(click.Context(flask_group), ['--help'])
            assert result is not None
            assert isinstance(result, list)

    def test_parse_args_with_arguments(self, flask_group, app):
        with app.test_request_context('/'):
            result = flask_group.parse_args(click.Context(flask_group), ['arg1', 'arg2'])
            assert result is not None
            assert 'arg1' in result
            assert 'arg2' in result

    def test_parse_args_empty_args_no_help(self, flask_group, app):
        flask_group.no_args_is_help = False  # Set to False to test this branch
        with app.test_request_context('/'):
            result = flask_group.parse_args(click.Context(flask_group), [])
            assert result is not None
            assert isinstance(result, list)
            assert len(result) == 0  # Expecting an empty list

    def test_parse_args_invalid_option(self, flask_group, app):
        with app.test_request_context('/'):
            with pytest.raises(SystemExit):  # Expecting a SystemExit for invalid option
                flask_group.parse_args(click.Context(flask_group), ['--invalid-option'])
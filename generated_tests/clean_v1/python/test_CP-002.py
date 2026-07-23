import pytest
from flask.cli import parse_args
from unittest.mock import MagicMock

class MockContext:
    def __init__(self):
        self.no_args_is_help = True

    def get_help_option_names(self, ctx):
        return ['--help']

def test_parse_args_no_args_help():
    ctx = MockContext()
    args = []
    assert parse_args(ctx, args) == []

def test_parse_args_single_help_option():
    ctx = MockContext()
    args = ['--help']
    assert parse_args(ctx, args) == []

def test_parse_args_with_env_file_option():
    ctx = MockContext()
    args = ['--env-file', 'test.env']
    assert parse_args(ctx, args) == ['--env-file', 'test.env']

def test_parse_args_with_app_option():
    ctx = MockContext()
    args = ['--app', 'myapp']
    assert parse_args(ctx, args) == ['--app', 'myapp']

def test_parse_args_with_multiple_args():
    ctx = MockContext()
    args = ['--env-file', 'test.env', '--app', 'myapp']
    assert parse_args(ctx, args) == ['--env-file', 'test.env', '--app', 'myapp']
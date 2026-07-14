import pytest
from flask.cli import FlaskGroup
from click import Context

class MockContext:
    def __init__(self):
        self.allow_interspersed_args = True  # Added attribute
        self.command = None

def test_parse_args_no_args_is_help():
    group = FlaskGroup(no_args_is_help=True)
    ctx = MockContext()
    args = []
    assert group.parse_args(ctx, args) == []

def test_parse_args_single_help_option():
    group = FlaskGroup(no_args_is_help=False)
    ctx = MockContext()
    args = ['--help']
    assert group.parse_args(ctx, args) == []

def test_parse_args_multiple_args():
    group = FlaskGroup(no_args_is_help=False)
    ctx = MockContext()
    args = ['command1', 'command2']
    assert group.parse_args(ctx, args) == ['command1', 'command2']

def test_parse_args_with_env_file_option():
    group = FlaskGroup(no_args_is_help=False)
    ctx = MockContext()
    args = ['--env-file', 'test.env']
    assert group.parse_args(ctx, args) == ['--env-file', 'test.env']

def test_parse_args_with_app_option():
    group = FlaskGroup(no_args_is_help=False)
    ctx = MockContext()
    args = ['--app', 'myapp']
    assert group.parse_args(ctx, args) == ['--app', 'myapp']
import pytest
from flask.cli import parse_args
from unittest.mock import MagicMock

class MockContext:
    def __init__(self):
        self.help_option_names = ['--help']

    def get_help_option_names(self):
        return self.help_option_names

def test_parse_args_no_args_is_help():
    ctx = MockContext()
    mock_self = MagicMock()
    mock_self.no_args_is_help = True
    mock_self.get_help_option_names = ctx.get_help_option_names
    args = []
    
    result = parse_args(mock_self, ctx, args)
    
    assert result == []

def test_parse_args_single_help_arg():
    ctx = MockContext()
    mock_self = MagicMock()
    mock_self.no_args_is_help = False
    mock_self.get_help_option_names = ctx.get_help_option_names
    args = ['--help']
    
    result = parse_args(mock_self, ctx, args)
    
    assert result == []

def test_parse_args_with_other_args():
    ctx = MockContext()
    mock_self = MagicMock()
    mock_self.no_args_is_help = False
    mock_self.get_help_option_names = ctx.get_help_option_names
    args = ['arg1', 'arg2']
    
    result = parse_args(mock_self, ctx, args)
    
    assert result == ['arg1', 'arg2']
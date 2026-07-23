import pytest
from requests.utils import unquote_header_value

def test_unquote_header_value_both_quotes():
    assert unquote_header_value('"C:\\foo\\bar.txt"') == 'C:\\foo\\bar.txt'

def test_unquote_header_value_both_quotes_with_escaped_quotes():
    assert unquote_header_value('"C:\\foo\\"bar.txt"') == 'C:\\foo\\"bar.txt'

def test_unquote_header_value_both_quotes_with_unc_path():
    assert unquote_header_value('"\\\\server\\share\\file.txt"', is_filename=True) == '\\\\server\\share\\file.txt'

def test_unquote_header_value_both_quotes_not_filename():
    assert unquote_header_value('"\\\\server\\share\\file.txt"', is_filename=False) == 'server\\share\\file.txt'

def test_unquote_header_value_no_quotes():
    assert unquote_header_value('C:\\foo\\bar.txt') == 'C:\\foo\\bar.txt'

def test_unquote_header_value_empty_string():
    assert unquote_header_value('') == ''

def test_unquote_header_value_none():
    assert unquote_header_value(None) == None
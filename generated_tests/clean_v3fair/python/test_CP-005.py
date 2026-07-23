import pytest
from requests.utils import unquote_header_value

def test_unquote_header_value_double_quotes():
    assert unquote_header_value('"Hello, World!"') == 'Hello, World!'

def test_unquote_header_value_double_quotes_with_backslashes():
    assert unquote_header_value('"C:\\foo\\bar.txt"') == 'C:\\foo\\bar.txt'

def test_unquote_header_value_double_quotes_with_unc_path():
    assert unquote_header_value('"\\\\server\\share\\file.txt"', is_filename=True) == '\\\\server\\share\\file.txt'

def test_unquote_header_value_single_quotes():
    assert unquote_header_value("'Hello, World!'") == "'Hello, World!'"

def test_unquote_header_value_no_quotes():
    assert unquote_header_value('Hello, World!') == 'Hello, World!'

def test_unquote_header_value_empty_string():
    assert unquote_header_value('') == ''

def test_unquote_header_value_none():
    assert unquote_header_value(None) == None

def test_unquote_header_value_filename_with_double_quotes():
    assert unquote_header_value('"C:\\Program Files\\app.exe"', is_filename=True) == 'C:\\Program Files\\app.exe'

def test_unquote_header_value_filename_without_double_quotes():
    assert unquote_header_value('C:\\Program Files\\app.exe', is_filename=True) == 'C:\\Program Files\\app.exe'
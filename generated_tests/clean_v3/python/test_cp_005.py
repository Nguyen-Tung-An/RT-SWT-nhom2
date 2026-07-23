import pytest
from requests.utils import unquote_header_value

class TestUnquoteHeaderValue:
    def test_unquoted_value(self):
        assert unquote_header_value('"Hello, World!"', False) == 'Hello, World!'

    def test_unquoted_value_with_escaped_quotes(self):
        assert unquote_header_value('"Hello, \\"World!\\""', False) == 'Hello, "World!"'

    def test_unquoted_value_with_double_backslashes(self):
        assert unquote_header_value('"C:\\\\path\\\\to\\\\file"', False) == 'C:\\path\\to\\file'

    def test_unquoted_value_with_unc_path(self):
        assert unquote_header_value('"\\\\server\\share\\file"', True) == '\\server\\share\\file'

    def test_unquoted_value_without_quotes(self):
        assert unquote_header_value('Hello, World!', False) == 'Hello, World!'

    def test_unquoted_value_empty_string(self):
        assert unquote_header_value('', False) == ''

    def test_unquoted_value_none(self):
        assert unquote_header_value(None, False) is None

    def test_unquoted_value_with_only_quotes(self):
        assert unquote_header_value('""', False) == ''

    def test_unquoted_value_with_only_backslashes(self):
        assert unquote_header_value('"\\\\\\"', False) == '\\\\'

    def test_unquoted_value_with_mixed_content(self):
        assert unquote_header_value('"C:\\\\Program Files\\\\"', False) == 'C:\\Program Files\\'
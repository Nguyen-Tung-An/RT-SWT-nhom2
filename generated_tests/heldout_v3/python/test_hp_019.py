import pytest
from requests.utils import parse_header_links

class TestParseHeaderLinks:

    def test_single_link(self):
        value = '<http://example.com>; rel="next"'
        result = parse_header_links(value)
        expected = [('http://example.com', {'rel': 'next'})]
        assert result == expected

    def test_multiple_links(self):
        value = '<http://example.com>; rel="next", <http://example.org>; rel="prev"'
        result = parse_header_links(value)
        expected = [
            ('http://example.com', {'rel': 'next'}),
            ('http://example.org', {'rel': 'prev'})
        ]
        assert result == expected

    def test_no_links(self):
        value = ''
        result = parse_header_links(value)
        assert result == []

    def test_invalid_link_format(self):
        value = '<http://example.com>; rel="next", invalid-link'
        with pytest.raises(ValueError):
            parse_header_links(value)

    def test_link_with_multiple_params(self):
        value = '<http://example.com>; rel="next"; title="Example"'
        result = parse_header_links(value)
        expected = [('http://example.com', {'rel': 'next', 'title': 'Example'})]
        assert result == expected

    def test_link_with_no_params(self):
        value = '<http://example.com>'
        result = parse_header_links(value)
        expected = [('http://example.com', {})]
        assert result == expected

    def test_link_with_empty_params(self):
        value = '<http://example.com>; rel=""'
        result = parse_header_links(value)
        expected = [('http://example.com', {'rel': ''})]
        assert result == expected

    def test_link_with_special_characters(self):
        value = '<http://example.com>; rel="next"; title="Example & Test"'
        result = parse_header_links(value)
        expected = [('http://example.com', {'rel': 'next', 'title': 'Example & Test'})]
        assert result == expected
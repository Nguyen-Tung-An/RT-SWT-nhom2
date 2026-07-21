import pytest
from requests.utils import parse_header_links

class TestParseHeaderLinks:

    def test_empty_string(self):
        result = parse_header_links("")
        assert result == []

    def test_single_link_without_params(self):
        result = parse_header_links("<http://example.com>")
        assert result == [{"url": "http://example.com"}]

    def test_single_link_with_params(self):
        result = parse_header_links("<http://example.com>; rel=next; type=\"text/html\"")
        assert result == [{"url": "http://example.com", "rel": "next", "type": "text/html"}]

    def test_multiple_links(self):
        result = parse_header_links("<http://example.com>; rel=next, <http://example.org>; rel=prev")
        assert result == [
            {"url": "http://example.com", "rel": "next"},
            {"url": "http://example.org", "rel": "prev"}
        ]

    def test_links_with_extra_spaces(self):
        result = parse_header_links(" <http://example.com> ; rel = next , <http://example.org> ; rel = prev ")
        assert result == [
            {"url": "http://example.com", "rel": "next"},
            {"url": "http://example.org", "rel": "prev"}
        ]

    def test_invalid_link_format(self):
        result = parse_header_links("<http://example.com>; rel=next; invalid_param")
        assert result == [{"url": "http://example.com", "rel": "next"}]

    def test_no_url(self):
        result = parse_header_links("rel=next")
        assert result == [{"url": "", "rel": "next"}]

    def test_multiple_params(self):
        result = parse_header_links("<http://example.com>; rel=next; type=\"text/html\"; title=\"Example\"")
        assert result == [{"url": "http://example.com", "rel": "next", "type": "text/html", "title": "Example"}]

    def test_special_characters_in_url(self):
        result = parse_header_links("<http://example.com/?query=1&other=2>; rel=next")
        assert result == [{"url": "http://example.com/?query=1&other=2", "rel": "next"}]
import pytest
from requests.utils import parse_header_links

def test_parse_header_links_empty():
    assert parse_header_links("") == []

def test_parse_header_links_single_link():
    result = parse_header_links('<http://example.com>; rel="self"')
    assert result == [{'url': 'http://example.com', 'rel': 'self'}]

def test_parse_header_links_multiple_links():
    result = parse_header_links('<http://example.com>; rel="self", <http://example.org>; rel="next"')
    assert result == [
        {'url': 'http://example.com', 'rel': 'self'},
        {'url': 'http://example.org', 'rel': 'next'}
    ]

def test_parse_header_links_with_additional_params():
    result = parse_header_links('<http://example.com>; rel="self"; type="text/html"')
    assert result == [{'url': 'http://example.com', 'rel': 'self', 'type': 'text/html'}]

def test_parse_header_links_invalid_format():
    result = parse_header_links('<http://example.com>; rel="self"; invalid_param')
    assert result == [{'url': 'http://example.com', 'rel': 'self'}]

def test_parse_header_links_no_url():
    result = parse_header_links('rel="self"')
    assert result == [{'url': '', 'rel': 'self'}]

def test_parse_header_links_with_extra_spaces():
    result = parse_header_links('  <http://example.com>  ;  rel="self"  ')
    assert result == [{'url': 'http://example.com', 'rel': 'self'}]
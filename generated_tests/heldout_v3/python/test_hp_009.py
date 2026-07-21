import pytest
from requests.utils import guess_filename

def test_guess_filename_with_valid_url():
    url = "http://example.com/file.txt"
    assert guess_filename(url) == "file.txt"

def test_guess_filename_with_valid_url_no_extension():
    url = "http://example.com/file"
    assert guess_filename(url) == "file"

def test_guess_filename_with_valid_url_with_query():
    url = "http://example.com/file.txt?query=1"
    assert guess_filename(url) == "file.txt"

def test_guess_filename_with_valid_url_with_fragment():
    url = "http://example.com/file.txt#section"
    assert guess_filename(url) == "file.txt"

def test_guess_filename_with_invalid_url():
    url = "not_a_url"
    assert guess_filename(url) is None

def test_guess_filename_with_empty_string():
    url = ""
    assert guess_filename(url) is None

def test_guess_filename_with_none():
    url = None
    assert guess_filename(url) is None

def test_guess_filename_with_path():
    url = "/path/to/file.txt"
    assert guess_filename(url) == "file.txt"

def test_guess_filename_with_path_no_extension():
    url = "/path/to/file"
    assert guess_filename(url) == "file"

def test_guess_filename_with_local_file():
    url = "file:///path/to/file.txt"
    assert guess_filename(url) == "file.txt"
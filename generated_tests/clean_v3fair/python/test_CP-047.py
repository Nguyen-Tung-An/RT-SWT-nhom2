import os
import pytest
from requests.utils import guess_filename

class MockObject:
    def __init__(self, name):
        self.name = name

def test_guess_filename_with_valid_string_name():
    obj = MockObject("example.txt")
    assert guess_filename(obj) == "example.txt"

def test_guess_filename_with_valid_bytes_name():
    obj = MockObject(b"example.txt")
    assert guess_filename(obj) == "example.txt"

def test_guess_filename_with_name_in_angle_brackets():
    obj = MockObject("<example.txt>")
    assert guess_filename(obj) is None

def test_guess_filename_with_empty_name():
    obj = MockObject("")
    assert guess_filename(obj) is None

def test_guess_filename_with_none_name():
    obj = MockObject(None)
    assert guess_filename(obj) is None

def test_guess_filename_with_invalid_type_name():
    obj = MockObject(123)
    assert guess_filename(obj) is None

def test_guess_filename_with_name_as_bytes_not_starting_with_angle_brackets():
    obj = MockObject(b"valid_file.txt")
    assert guess_filename(obj) == "valid_file.txt"
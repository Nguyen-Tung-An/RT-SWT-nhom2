import os
import pytest
from requests.utils import guess_filename

class MockObject:
    def __init__(self, name):
        self.name = name

def test_guess_filename_valid_string():
    obj = MockObject("example.txt")
    assert guess_filename(obj) == "example.txt"

def test_guess_filename_valid_bytes():
    obj = MockObject(b"example.txt")
    assert guess_filename(obj) == "example.txt"

def test_guess_filename_invalid_name_start():
    obj = MockObject("<example.txt>")
    assert guess_filename(obj) is None

def test_guess_filename_invalid_name_end():
    obj = MockObject("example.txt>")
    assert guess_filename(obj) is None

def test_guess_filename_no_name():
    obj = MockObject(None)
    assert guess_filename(obj) is None

def test_guess_filename_empty_string():
    obj = MockObject("")
    assert guess_filename(obj) is None

def test_guess_filename_invalid_type():
    obj = MockObject(123)
    assert guess_filename(obj) is None
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

def test_guess_filename_name_starts_with_angle_bracket():
    obj = MockObject("<example.txt>")
    assert guess_filename(obj) is None

def test_guess_filename_name_ends_with_angle_bracket():
    obj = MockObject("example.txt>")
    assert guess_filename(obj) is None

def test_guess_filename_name_is_none():
    obj = MockObject(None)
    assert guess_filename(obj) is None

def test_guess_filename_name_is_not_string_or_bytes():
    class NonStringObject:
        pass
    obj = NonStringObject()
    assert guess_filename(obj) is None
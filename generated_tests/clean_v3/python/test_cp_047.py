import os
import pytest
from requests.utils import guess_filename

class TestGuessFilename:
    def test_guess_filename_with_valid_string(self):
        class ValidObject:
            name = "example.txt"
        
        result = guess_filename(ValidObject())
        assert result == "example.txt"

    def test_guess_filename_with_valid_bytes(self):
        class ValidObject:
            name = b"example.txt"
        
        result = guess_filename(ValidObject())
        assert result == "example.txt"

    def test_guess_filename_with_name_starting_with_angle_bracket(self):
        class InvalidObject:
            name = "<example.txt>"
        
        result = guess_filename(InvalidObject())
        assert result is None

    def test_guess_filename_with_name_ending_with_angle_bracket(self):
        class InvalidObject:
            name = "example.txt>"
        
        result = guess_filename(InvalidObject())
        assert result is None

    def test_guess_filename_with_none_name(self):
        class NoneNameObject:
            name = None
        
        result = guess_filename(NoneNameObject())
        assert result is None

    def test_guess_filename_with_non_string_name(self):
        class NonStringObject:
            name = 12345
        
        result = guess_filename(NonStringObject())
        assert result is None

    def test_guess_filename_with_empty_string(self):
        class EmptyStringObject:
            name = ""
        
        result = guess_filename(EmptyStringObject())
        assert result is None

    def test_guess_filename_with_empty_bytes(self):
        class EmptyBytesObject:
            name = b""
        
        result = guess_filename(EmptyBytesObject())
        assert result is None
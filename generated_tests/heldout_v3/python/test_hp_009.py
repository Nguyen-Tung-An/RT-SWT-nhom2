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

    def test_guess_filename_with_invalid_string(self):
        class InvalidObject:
            name = "<example.txt>"
        
        result = guess_filename(InvalidObject())
        assert result is None

    def test_guess_filename_with_invalid_bytes(self):
        class InvalidObject:
            name = b"<example.txt>"
        
        result = guess_filename(InvalidObject())
        assert result is None

    def test_guess_filename_with_no_name_attribute(self):
        class NoNameObject:
            pass
        
        result = guess_filename(NoNameObject())
        assert result is None

    def test_guess_filename_with_name_as_none(self):
        class NoneNameObject:
            name = None
        
        result = guess_filename(NoneNameObject())
        assert result is None

    def test_guess_filename_with_empty_string(self):
        class EmptyStringObject:
            name = ""
        
        result = guess_filename(EmptyStringObject())
        assert result == ""

    def test_guess_filename_with_empty_bytes(self):
        class EmptyBytesObject:
            name = b""
        
        result = guess_filename(EmptyBytesObject())
        assert result == ""
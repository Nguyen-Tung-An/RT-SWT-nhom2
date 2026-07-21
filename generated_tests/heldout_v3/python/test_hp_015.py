import pytest
from requests.status_codes import _init

def test_init_with_codes():
    global codes
    codes = type('Codes', (), {})()  # Create a simple object to hold attributes
    global _codes
    _codes = {
        200: ["OK"],
        404: ["Not Found"],
        500: ["Internal Server Error"]
    }
    
    _init()
    
    assert hasattr(codes, "OK")
    assert hasattr(codes, "NOT FOUND")
    assert hasattr(codes, "INTERNAL SERVER ERROR")
    assert codes.OK == 200
    assert codes["NOT FOUND"] == 404
    assert codes["INTERNAL SERVER ERROR"] == 500

def test_init_with_empty_codes():
    global codes
    codes = type('Codes', (), {})()
    global _codes
    _codes = {}
    
    _init()
    
    assert not hasattr(codes, "ANY_STATUS")

def test_init_with_codes_starting_with_slash():
    global codes
    codes = type('Codes', (), {})()
    global _codes
    _codes = {
        200: ["/OK"],
        404: ["/Not Found"]
    }
    
    _init()
    
    assert hasattr(codes, "/OK")
    assert not hasattr(codes, "OK")
    assert hasattr(codes, "/NOT FOUND")
    assert not hasattr(codes, "NOT FOUND")

def test_init_with_none_docstring():
    global codes
    codes = type('Codes', (), {})()
    global _codes
    _codes = {
        200: ["OK"]
    }
    global __doc__
    __doc__ = None
    
    _init()
    
    assert __doc__ is None
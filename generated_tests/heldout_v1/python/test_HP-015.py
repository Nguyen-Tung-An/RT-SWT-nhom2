import pytest
from requests.status_codes import _init

def test_init_sets_attributes():
    _init()
    assert hasattr(codes, 'OK')
    assert hasattr(codes, 'NOT_FOUND')
    assert hasattr(codes, 'INTERNAL_SERVER_ERROR')

def test_init_sets_code_values():
    _init()
    assert codes.OK == 200
    assert codes.NOT_FOUND == 404
    assert codes.INTERNAL_SERVER_ERROR == 500

def test_init_sets_uppercase_attributes():
    _init()
    assert hasattr(codes, 'OK')
    assert hasattr(codes, 'NOT_FOUND')
    assert hasattr(codes, 'INTERNAL_SERVER_ERROR')

def test_init_docstring():
    _init()
    assert __doc__ is not None
    assert '200: ``OK``' in __doc__
    assert '404: ``NOT FOUND``' in __doc__
    assert '500: ``INTERNAL SERVER ERROR``' in __doc__
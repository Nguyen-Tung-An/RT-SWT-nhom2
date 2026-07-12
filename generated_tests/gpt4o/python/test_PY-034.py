import pytest
from flask.debughelpers import _dump_loader_info

class MockLoader:
    def __init__(self, **kwargs):
        self.__dict__.update(kwargs)

def test_dump_loader_info_with_string_attributes():
    loader = MockLoader(name="test_loader", version="1.0")
    result = list(_dump_loader_info(loader))
    assert result == [
        "class: flask.debughelpers.MockLoader",
        "name: 'test_loader'",
        "version: '1.0'"
    ]

def test_dump_loader_info_with_numeric_attributes():
    loader = MockLoader(count=5, active=True)
    result = list(_dump_loader_info(loader))
    assert result == [
        "class: flask.debughelpers.MockLoader",
        "active: True",
        "count: 5"
    ]

def test_dump_loader_info_with_list_attributes():
    loader = MockLoader(items=["item1", "item2"])
    result = list(_dump_loader_info(loader))
    assert result == [
        "class: flask.debughelpers.MockLoader",
        "items:",
        "  - item1",
        "  - item2"
    ]

def test_dump_loader_info_with_mixed_attributes():
    loader = MockLoader(name="mixed_loader", values=[1, 2, 3], invalid_attr={})
    result = list(_dump_loader_info(loader))
    assert result == [
        "class: flask.debughelpers.MockLoader",
        "name: 'mixed_loader'",
        "values:",
        "  - 1",
        "  - 2",
        "  - 3"
    ]

def test_dump_loader_info_with_private_attributes():
    loader = MockLoader(_private="hidden", public="visible")
    result = list(_dump_loader_info(loader))
    assert result == [
        "class: flask.debughelpers.MockLoader",
        "public: 'visible'"
    ]

def test_dump_loader_info_with_empty_loader():
    loader = MockLoader()
    result = list(_dump_loader_info(loader))
    assert result == [
        "class: flask.debughelpers.MockLoader"
    ]
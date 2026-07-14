import pytest
from flask.debughelpers import _dump_loader_info

class MockLoader:
    def __init__(self, name, items):
        self.name = name
        self.items = items

    def __getattr__(self, item):
        return self.items.get(item, None)

def test_dump_loader_info_with_string_attributes():
    loader = MockLoader("TestLoader", {"attr1": "value1", "attr2": "value2"})
    result = list(_dump_loader_info(loader))
    assert result == [
        "class: flask.debughelpers.MockLoader",
        "attr1: 'value1'",
        "attr2: 'value2'"
    ]

def test_dump_loader_info_with_numeric_attributes():
    loader = MockLoader("TestLoader", {"attr1": 42, "attr2": 3.14})
    result = list(_dump_loader_info(loader))
    assert result == [
        "class: flask.debughelpers.MockLoader",
        "attr1: 42",
        "attr2: 3.14"
    ]

def test_dump_loader_info_with_boolean_attributes():
    loader = MockLoader("TestLoader", {"attr1": True, "attr2": False})
    result = list(_dump_loader_info(loader))
    assert result == [
        "class: flask.debughelpers.MockLoader",
        "attr1: True",
        "attr2: False"
    ]

def test_dump_loader_info_with_list_attributes():
    loader = MockLoader("TestLoader", {"attr1": ["item1", "item2"], "attr2": "value2"})
    result = list(_dump_loader_info(loader))
    assert result == [
        "class: flask.debughelpers.MockLoader",
        "attr2: 'value2'",
        "attr1:",
        "  - item1",
        "  - item2"
    ]

def test_dump_loader_info_with_mixed_attributes():
    loader = MockLoader("TestLoader", {"attr1": ["item1", 2], "attr2": "value2"})
    result = list(_dump_loader_info(loader))
    assert result == [
        "class: flask.debughelpers.MockLoader",
        "attr2: 'value2'"
    ]

def test_dump_loader_info_with_private_attributes():
    loader = MockLoader("TestLoader", {"_private_attr": "hidden", "public_attr": "visible"})
    result = list(_dump_loader_info(loader))
    assert result == [
        "class: flask.debughelpers.MockLoader",
        "public_attr: 'visible'"
    ]
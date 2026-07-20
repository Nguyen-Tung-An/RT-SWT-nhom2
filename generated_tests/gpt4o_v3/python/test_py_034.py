import pytest
from flask.debughelpers import _dump_loader_info

class TestDumpLoaderInfo:
    class TestLoader:
        def __init__(self, name, items):
            self.name = name
            self.items = items

    def test_empty_loader(self):
        loader = self.TestLoader(name="", items={})
        result = list(_dump_loader_info(loader))
        assert result == ["class: __main__.TestLoader"]

    def test_loader_with_string(self):
        loader = self.TestLoader(name="test_loader", items={"key1": "value1"})
        result = list(_dump_loader_info(loader))
        assert result == [
            "class: __main__.TestLoader",
            "key1: 'value1'",
        ]

    def test_loader_with_int(self):
        loader = self.TestLoader(name="test_loader", items={"key1": 42})
        result = list(_dump_loader_info(loader))
        assert result == [
            "class: __main__.TestLoader",
            "key1: 42",
        ]

    def test_loader_with_float(self):
        loader = self.TestLoader(name="test_loader", items={"key1": 3.14})
        result = list(_dump_loader_info(loader))
        assert result == [
            "class: __main__.TestLoader",
            "key1: 3.14",
        ]

    def test_loader_with_bool(self):
        loader = self.TestLoader(name="test_loader", items={"key1": True})
        result = list(_dump_loader_info(loader))
        assert result == [
            "class: __main__.TestLoader",
            "key1: True",
        ]

    def test_loader_with_list_of_strings(self):
        loader = self.TestLoader(name="test_loader", items={"key1": ["item1", "item2"]})
        result = list(_dump_loader_info(loader))
        assert result == [
            "class: __main__.TestLoader",
            "key1:",
            "  - item1",
            "  - item2",
        ]

    def test_loader_with_list_of_non_strings(self):
        loader = self.TestLoader(name="test_loader", items={"key1": ["item1", 2]})
        result = list(_dump_loader_info(loader))
        assert result == [
            "class: __main__.TestLoader",
        ]

    def test_loader_with_tuple_of_strings(self):
        loader = self.TestLoader(name="test_loader", items={"key1": ("item1", "item2")})
        result = list(_dump_loader_info(loader))
        assert result == [
            "class: __main__.TestLoader",
            "key1:",
            "  - item1",
            "  - item2",
        ]

    def test_loader_with_tuple_of_non_strings(self):
        loader = self.TestLoader(name="test_loader", items={"key1": ("item1", 2)})
        result = list(_dump_loader_info(loader))
        assert result == [
            "class: __main__.TestLoader",
        ]

    def test_loader_with_private_key(self):
        loader = self.TestLoader(name="test_loader", items={"_private_key": "private_value"})
        result = list(_dump_loader_info(loader))
        assert result == [
            "class: __main__.TestLoader",
        ]
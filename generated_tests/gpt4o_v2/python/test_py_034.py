import pytest
from flask.debughelpers import _dump_loader_info

class TestDumpLoaderInfo:
    class DummyLoader:
        def __init__(self, name, items):
            self.name = name
            self.items = items
            self._private_attr = "hidden"

    def test_empty_loader(self):
        loader = self.DummyLoader(name="", items=[])
        result = list(_dump_loader_info(loader))
        assert result == [
            "class: __main__.TestDumpLoaderInfo.DummyLoader",
            "name: ''",
            "items:"
        ]

    def test_loader_with_strings(self):
        loader = self.DummyLoader(name="test_loader", items=["item1", "item2"])
        result = list(_dump_loader_info(loader))
        assert result == [
            "class: __main__.TestDumpLoaderInfo.DummyLoader",
            "name: 'test_loader'",
            "items:",
            "  - item1",
            "  - item2"
        ]

    def test_loader_with_non_string_items(self):
        loader = self.DummyLoader(name="test_loader", items=["item1", 2])
        result = list(_dump_loader_info(loader))
        assert result == [
            "class: __main__.TestDumpLoaderInfo.DummyLoader",
            "name: 'test_loader'"
        ]

    def test_loader_with_various_types(self):
        loader = self.DummyLoader(name="test_loader", items=["item1", "item2"])
        loader.count = 5
        loader.active = True
        loader.data = None
        result = list(_dump_loader_info(loader))
        assert result == [
            "class: __main__.TestDumpLoaderInfo.DummyLoader",
            "name: 'test_loader'",
            "count: 5",
            "active: True"
        ]

    def test_loader_with_private_attributes(self):
        loader = self.DummyLoader(name="test_loader", items=["item1", "item2"])
        loader._hidden = "secret"
        result = list(_dump_loader_info(loader))
        assert result == [
            "class: __main__.TestDumpLoaderInfo.DummyLoader",
            "name: 'test_loader'",
            "items:",
            "  - item1",
            "  - item2"
        ]
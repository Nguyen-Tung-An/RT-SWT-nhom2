import pytest
from flask.json.tag import register
from flask.json.tag import JSONTag

class MockSerializer:
    def __init__(self):
        self.tags = {}
        self.order = []

class MockTag(JSONTag):
    def __init__(self, serializer):
        super().__init__(serializer)
        self.key = "mock_tag"

def test_register_new_tag():
    serializer = MockSerializer()
    register(serializer, MockTag)
    assert "mock_tag" in serializer.tags
    assert serializer.order[-1] == serializer.tags["mock_tag"]

def test_register_existing_tag_without_force():
    serializer = MockSerializer()
    register(serializer, MockTag)
    with pytest.raises(KeyError, match="Tag 'mock_tag' is already registered."):
        register(serializer, MockTag)

def test_register_existing_tag_with_force():
    serializer = MockSerializer()
    register(serializer, MockTag)
    register(serializer, MockTag, force=True)
    assert "mock_tag" in serializer.tags
    assert serializer.order[-1] == serializer.tags["mock_tag"]

def test_register_tag_with_index():
    serializer = MockSerializer()
    register(serializer, MockTag)
    register(serializer, MockTag, index=0)
    assert serializer.order[0] == serializer.tags["mock_tag"]
    assert serializer.order[1] == serializer.tags["mock_tag"]

def test_register_tag_with_none_index():
    serializer = MockSerializer()
    register(serializer, MockTag, index=None)
    assert serializer.order[-1] == serializer.tags["mock_tag"]
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
    tag_class = MockTag
    register(serializer, tag_class)
    assert "mock_tag" in serializer.tags

def test_register_existing_tag_without_force():
    serializer = MockSerializer()
    tag_class = MockTag
    register(serializer, tag_class)
    
    with pytest.raises(KeyError, match="Tag 'mock_tag' is already registered."):
        register(serializer, tag_class)

def test_register_existing_tag_with_force():
    serializer = MockSerializer()
    tag_class = MockTag
    register(serializer, tag_class)
    
    # Register again with force
    register(serializer, tag_class, force=True)
    assert "mock_tag" in serializer.tags

def test_register_tag_with_index():
    serializer = MockSerializer()
    tag_class = MockTag
    register(serializer, tag_class)
    
    # Register another tag with a different key
    class AnotherMockTag(MockTag):
        def __init__(self, serializer):
            super().__init__(serializer)
            self.key = "another_mock_tag"

    register(serializer, AnotherMockTag, index=0)
    assert serializer.order[0].key == "another_mock_tag"
    assert serializer.order[1].key == "mock_tag"

def test_register_tag_with_none_index():
    serializer = MockSerializer()
    tag_class = MockTag
    register(serializer, tag_class)
    
    # Register another tag with None index
    class AnotherMockTag(MockTag):
        def __init__(self, serializer):
            super().__init__(serializer)
            self.key = "another_mock_tag"

    register(serializer, AnotherMockTag, index=None)
    assert serializer.order[-1].key == "another_mock_tag"
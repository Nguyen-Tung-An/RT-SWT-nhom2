import pytest
from flask.json.tag import TaggedJSONSerializer
from flask.json.tag import JSONTag

class TestTaggedJSONSerializer:
    class DummyTag(JSONTag):
        def __init__(self, serializer):
            super().__init__(serializer)
            self.key = "dummy"

    class AnotherDummyTag(JSONTag):
        def __init__(self, serializer):
            super().__init__(serializer)
            self.key = "another_dummy"

    @pytest.fixture
    def serializer(self):
        return TaggedJSONSerializer()

    def test_register_new_tag(self, serializer):
        serializer.register(self.DummyTag)
        assert "dummy" in serializer.tags
        assert len(serializer.order) == 1

    def test_register_existing_tag_without_force(self, serializer):
        serializer.register(self.DummyTag)
        with pytest.raises(KeyError, match="Tag 'dummy' is already registered."):
            serializer.register(self.DummyTag)

    def test_register_existing_tag_with_force(self, serializer):
        serializer.register(self.DummyTag)
        serializer.register(self.DummyTag, force=True)
        assert len(serializer.order) == 1

    def test_register_tag_with_index(self, serializer):
        serializer.register(self.DummyTag)
        serializer.register(self.AnotherDummyTag, index=0)
        assert serializer.order[0].key == "another_dummy"
        assert serializer.order[1].key == "dummy"

    def test_register_tag_with_none_index(self, serializer):
        serializer.register(self.DummyTag)
        serializer.register(self.AnotherDummyTag, index=None)
        assert serializer.order[-1].key == "another_dummy"

    def test_register_tag_with_negative_index(self, serializer):
        serializer.register(self.DummyTag)
        serializer.register(self.AnotherDummyTag, index=-1)
        assert serializer.order[-1].key == "another_dummy"

    def test_register_tag_with_out_of_bounds_index(self, serializer):
        serializer.register(self.DummyTag)
        with pytest.raises(IndexError):
            serializer.register(self.AnotherDummyTag, index=2)
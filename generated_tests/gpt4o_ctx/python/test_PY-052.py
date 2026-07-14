import pytest
from flask.json.tag import TaggedJSONSerializer
from flask.json.tag import JSONTag

class TestTag:
    class DummyTag(JSONTag):
        key = "dummy"

    class AnotherTag(JSONTag):
        key = "another"

def test_register_new_tag():
    serializer = TaggedJSONSerializer()
    serializer.register(TestTag.DummyTag)
    assert "dummy" in serializer.tags

def test_register_existing_tag_without_force():
    serializer = TaggedJSONSerializer()
    serializer.register(TestTag.DummyTag)
    with pytest.raises(KeyError):
        serializer.register(TestTag.DummyTag)

def test_register_existing_tag_with_force():
    serializer = TaggedJSONSerializer()
    serializer.register(TestTag.DummyTag)
    serializer.register(TestTag.DummyTag, force=True)
    assert "dummy" in serializer.tags

def test_register_tag_with_index():
    serializer = TaggedJSONSerializer()
    serializer.register(TestTag.DummyTag)
    serializer.register(TestTag.AnotherTag, index=0)
    assert serializer.order[0].key == "another"
    assert serializer.order[1].key == "dummy"

def test_register_tag_with_none_index():
    serializer = TaggedJSONSerializer()
    serializer.register(TestTag.DummyTag)
    serializer.register(TestTag.AnotherTag, index=None)
    assert serializer.order[-1].key == "another"
import pytest
import flask
from flask.json.tag import TaggedJSONSerializer

class CustomTag:
    def __init__(self, serializer):
        self.key = 'custom_tag'
        
class AnotherTag:
    def __init__(self, serializer):
        self.key = 'another_tag'

def test_register_new_tag():
    serializer = TaggedJSONSerializer()
    app = flask.Flask('test_app')
    with app.test_request_context('/'):
        serializer.register(CustomTag)
        assert 'custom_tag' in serializer.tags
        assert len(serializer.order) == 1

def test_register_existing_tag_without_force():
    serializer = TaggedJSONSerializer()
    app = flask.Flask('test_app')
    with app.test_request_context('/'):
        serializer.register(CustomTag)
        with pytest.raises(KeyError, match="Tag 'custom_tag' is already registered."):
            serializer.register(CustomTag)

def test_register_existing_tag_with_force():
    serializer = TaggedJSONSerializer()
    app = flask.Flask('test_app')
    with app.test_request_context('/'):
        serializer.register(CustomTag)
        serializer.register(CustomTag, force=True)
        assert len(serializer.order) == 1  # Should still be one tag

def test_register_tag_with_index():
    serializer = TaggedJSONSerializer()
    app = flask.Flask('test_app')
    with app.test_request_context('/'):
        serializer.register(CustomTag)
        serializer.register(AnotherTag, index=0)
        assert len(serializer.order) == 2
        assert serializer.order[0].key == 'another_tag'
        assert serializer.order[1].key == 'custom_tag'

def test_register_tag_with_none_index():
    serializer = TaggedJSONSerializer()
    app = flask.Flask('test_app')
    with app.test_request_context('/'):
        serializer.register(CustomTag)
        serializer.register(AnotherTag, index=None)
        assert len(serializer.order) == 2
        assert serializer.order[1].key == 'another_tag'  # Should be appended
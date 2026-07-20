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
    app = flask.Flask('test_app')
    with app.test_request_context('/'):
        serializer = TaggedJSONSerializer()
        serializer.register(CustomTag)
        assert 'custom_tag' in serializer.tags
        assert serializer.order[-1] == serializer.tags['custom_tag']

def test_register_existing_tag_without_force():
    app = flask.Flask('test_app')
    with app.test_request_context('/'):
        serializer = TaggedJSONSerializer()
        serializer.register(CustomTag)
        with pytest.raises(KeyError, match="Tag 'custom_tag' is already registered."):
            serializer.register(CustomTag)

def test_register_existing_tag_with_force():
    app = flask.Flask('test_app')
    with app.test_request_context('/'):
        serializer = TaggedJSONSerializer()
        serializer.register(CustomTag)
        serializer.register(CustomTag, force=True)
        assert serializer.order.count(serializer.tags['custom_tag']) == 1

def test_register_tag_with_index():
    app = flask.Flask('test_app')
    with app.test_request_context('/'):
        serializer = TaggedJSONSerializer()
        serializer.register(CustomTag)
        serializer.register(AnotherTag, index=0)
        assert serializer.order[0] == serializer.tags['another_tag']
        assert serializer.order[1] == serializer.tags['custom_tag']

def test_register_tag_with_invalid_index():
    app = flask.Flask('test_app')
    with app.test_request_context('/'):
        serializer = TaggedJSONSerializer()
        serializer.register(CustomTag)
        with pytest.raises(IndexError):
            serializer.register(AnotherTag, index=5)
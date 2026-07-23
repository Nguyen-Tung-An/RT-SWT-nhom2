import pytest
import flask
from flask.json.tag import TaggedJSONSerializer
from flask.json.tag import JSONTag

class TestTag(JSONTag):
    key = 'test_tag'

def test_register_new_tag():
    serializer = TaggedJSONSerializer()
    app = flask.Flask('test_app')
    with app.test_request_context('/'):
        serializer.register(TestTag)
        assert 'test_tag' in serializer.tags

def test_register_existing_tag_without_force():
    serializer = TaggedJSONSerializer()
    app = flask.Flask('test_app')
    with app.test_request_context('/'):
        serializer.register(TestTag)
        with pytest.raises(KeyError):
            serializer.register(TestTag)

def test_register_existing_tag_with_force():
    serializer = TaggedJSONSerializer()
    app = flask.Flask('test_app')
    with app.test_request_context('/'):
        serializer.register(TestTag)
        serializer.register(TestTag, force=True)
        assert serializer.tags['test_tag'] is not None

def test_register_tag_with_index():
    serializer = TaggedJSONSerializer()
    app = flask.Flask('test_app')
    with app.test_request_context('/'):
        serializer.register(TestTag)
        serializer.register(TestTag, index=0)
        assert serializer.order[0].key == 'test_tag'

def test_register_tag_with_none_index():
    serializer = TaggedJSONSerializer()
    app = flask.Flask('test_app')
    with app.test_request_context('/'):
        serializer.register(TestTag)
        serializer.register(TestTag, index=None)
        assert serializer.order[-1].key == 'test_tag'
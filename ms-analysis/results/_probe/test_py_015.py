import pytest
from flask import Flask, session
from flask.helpers import get_flashed_messages

app = Flask(__name__)
app.secret_key = 'test_secret'

@pytest.fixture
def client():
    with app.test_client() as client:
        yield client

def test_get_flashed_messages_no_flashes(client):
    messages = get_flashed_messages()
    assert messages == []

def test_get_flashed_messages_with_categories(client):
    with client.session_transaction() as sess:
        sess['_flashes'] = [('info', 'Message 1'), ('warning', 'Message 2')]
    messages = get_flashed_messages(with_categories=True)
    assert messages == [('info', 'Message 1'), ('warning', 'Message 2')]

def test_get_flashed_messages_without_categories(client):
    with client.session_transaction() as sess:
        sess['_flashes'] = [('info', 'Message 1'), ('warning', 'Message 2')]
    messages = get_flashed_messages(with_categories=False)
    assert messages == ['Message 1', 'Message 2']

def test_get_flashed_messages_with_category_filter(client):
    with client.session_transaction() as sess:
        sess['_flashes'] = [('info', 'Message 1'), ('warning', 'Message 2')]
    messages = get_flashed_messages(with_categories=True, category_filter=['info'])
    assert messages == [('info', 'Message 1')]

def test_get_flashed_messages_with_empty_category_filter(client):
    with client.session_transaction() as sess:
        sess['_flashes'] = [('info', 'Message 1'), ('warning', 'Message 2')]
    messages = get_flashed_messages(with_categories=True, category_filter=[])
    assert messages == []

def test_get_flashed_messages_with_nonexistent_category(client):
    with client.session_transaction() as sess:
        sess['_flashes'] = [('info', 'Message 1'), ('warning', 'Message 2')]
    messages = get_flashed_messages(with_categories=True, category_filter=['error'])
    assert messages == []

def test_get_flashed_messages_after_flashing(client):
    with client.session_transaction() as sess:
        sess['_flashes'] = [('info', 'Message 1')]
    messages = get_flashed_messages()
    assert messages == [('info', 'Message 1')]
    messages_after = get_flashed_messages()
    assert messages_after == []
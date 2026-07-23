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
    with client:
        messages = get_flashed_messages()
        assert messages == []

def test_get_flashed_messages_with_categories(client):
    with client:
        session['_flashes'] = [('info', 'This is an info message')]
        messages = get_flashed_messages(with_categories=True)
        assert messages == [('info', 'This is an info message')]

def test_get_flashed_messages_without_categories(client):
    with client:
        session['_flashes'] = [('info', 'This is an info message')]
        messages = get_flashed_messages(with_categories=False)
        assert messages == ['This is an info message']

def test_get_flashed_messages_with_category_filter(client):
    with client:
        session['_flashes'] = [
            ('info', 'This is an info message'),
            ('warning', 'This is a warning message')
        ]
        messages = get_flashed_messages(with_categories=True, category_filter=['info'])
        assert messages == [('info', 'This is an info message')]

def test_get_flashed_messages_with_empty_category_filter(client):
    with client:
        session['_flashes'] = [
            ('info', 'This is an info message'),
            ('warning', 'This is a warning message')
        ]
        messages = get_flashed_messages(with_categories=True, category_filter=[])
        assert messages == []

def test_get_flashed_messages_multiple_categories(client):
    with client:
        session['_flashes'] = [
            ('info', 'Info message 1'),
            ('info', 'Info message 2'),
            ('error', 'Error message 1')
        ]
        messages = get_flashed_messages(with_categories=True, category_filter=['info'])
        assert messages == [('info', 'Info message 1'), ('info', 'Info message 2')]
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

def test_get_flashed_messages_with_flashes(client):
    with client:
        session['_flashes'] = [('info', 'Test message 1'), ('warning', 'Test message 2')]
        messages = get_flashed_messages()
        assert messages == ['Test message 1', 'Test message 2']

def test_get_flashed_messages_with_categories(client):
    with client:
        session['_flashes'] = [('info', 'Test message 1'), ('warning', 'Test message 2')]
        messages = get_flashed_messages(with_categories=True)
        assert messages == [('info', 'Test message 1'), ('warning', 'Test message 2')]

def test_get_flashed_messages_with_category_filter(client):
    with client:
        session['_flashes'] = [('info', 'Test message 1'), ('warning', 'Test message 2')]
        messages = get_flashed_messages(category_filter=['info'])
        assert messages == [('info', 'Test message 1')]

def test_get_flashed_messages_with_category_filter_no_match(client):
    with client:
        session['_flashes'] = [('info', 'Test message 1'), ('warning', 'Test message 2')]
        messages = get_flashed_messages(category_filter=['error'])
        assert messages == []

def test_get_flashed_messages_with_categories_and_filter(client):
    with client:
        session['_flashes'] = [('info', 'Test message 1'), ('warning', 'Test message 2')]
        messages = get_flashed_messages(with_categories=True, category_filter=['info'])
        assert messages == [('info', 'Test message 1')]
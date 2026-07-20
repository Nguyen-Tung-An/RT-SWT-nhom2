import pytest
from flask import Flask, session
from flask.helpers import get_flashed_messages

app = Flask(__name__)
app.secret_key = 'test_secret'

@pytest.fixture
def client():
    with app.test_client() as client:
        yield client

def set_flashes(messages):
    with app.app_context():
        session['_flashes'] = messages

class TestGetFlashedMessages:

    def test_no_flashes(self, client):
        with app.app_context():
            assert get_flashed_messages() == []

    def test_flashes_without_categories(self, client):
        set_flashes([('info', 'Message 1'), ('warning', 'Message 2')])
        with app.app_context():
            assert get_flashed_messages() == ['Message 1', 'Message 2']

    def test_flashes_with_categories(self, client):
        set_flashes([('info', 'Message 1'), ('warning', 'Message 2')])
        with app.app_context():
            assert get_flashed_messages(with_categories=True) == [('info', 'Message 1'), ('warning', 'Message 2')]

    def test_flashes_with_category_filter(self, client):
        set_flashes([('info', 'Message 1'), ('warning', 'Message 2')])
        with app.app_context():
            assert get_flashed_messages(category_filter=['info']) == [('info', 'Message 1')]
            assert get_flashed_messages(category_filter=['warning']) == [('warning', 'Message 2')]
            assert get_flashed_messages(category_filter=['error']) == []

    def test_flashes_with_categories_and_filter(self, client):
        set_flashes([('info', 'Message 1'), ('warning', 'Message 2')])
        with app.app_context():
            assert get_flashed_messages(with_categories=True, category_filter=['info']) == [('info', 'Message 1')]
            assert get_flashed_messages(with_categories=True, category_filter=['warning']) == [('warning', 'Message 2')]
            assert get_flashed_messages(with_categories=True, category_filter=['error']) == []

    def test_flashes_empty_category_filter(self, client):
        set_flashes([('info', 'Message 1'), ('warning', 'Message 2')])
        with app.app_context():
            assert get_flashed_messages(category_filter=[]) == []
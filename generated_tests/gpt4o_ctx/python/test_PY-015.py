import pytest
from flask.helpers import get_flashed_messages

# Mocking the session and app_ctx for testing
class MockAppContext:
    def __init__(self):
        self._flashes = None

class MockSession:
    def __init__(self):
        self.data = {}

    def pop(self, key):
        return self.data.pop(key, None)

# Test cases for get_flashed_messages
@pytest.fixture
def mock_app_context(monkeypatch):
    app_ctx = MockAppContext()
    monkeypatch.setattr('flask.helpers.app_ctx', app_ctx)
    return app_ctx

@pytest.fixture
def mock_session(monkeypatch):
    session = MockSession()
    monkeypatch.setattr('flask.helpers.session', session)
    return session

def test_get_flashed_messages_no_flashes(mock_app_context, mock_session):
    assert get_flashed_messages() == []

def test_get_flashed_messages_with_flashes(mock_app_context, mock_session):
    mock_app_context._flashes = [('info', 'Message 1'), ('warning', 'Message 2')]
    assert get_flashed_messages() == ['Message 1', 'Message 2']

def test_get_flashed_messages_with_categories(mock_app_context, mock_session):
    mock_app_context._flashes = [('info', 'Message 1'), ('warning', 'Message 2')]
    assert get_flashed_messages(with_categories=True) == [('info', 'Message 1'), ('warning', 'Message 2')]

def test_get_flashed_messages_with_category_filter(mock_app_context, mock_session):
    mock_app_context._flashes = [('info', 'Message 1'), ('warning', 'Message 2')]
    assert get_flashed_messages(category_filter=['info']) == [('info', 'Message 1')]

def test_get_flashed_messages_with_categories_and_filter(mock_app_context, mock_session):
    mock_app_context._flashes = [('info', 'Message 1'), ('warning', 'Message 2')]
    assert get_flashed_messages(with_categories=True, category_filter=['info']) == [('info', 'Message 1')]
import pytest
from flask.sansio.app import _find_error_handler

class MockApp:
    def __init__(self):
        self.error_handler_spec = {
            None: {200: {}, 404: {}},
            'blueprint1': {200: {}, 404: {ValueError: lambda e: "ValueError handler"}},
            'blueprint2': {404: {KeyError: lambda e: "KeyError handler"}},
        }

    def _get_exc_class_and_code(self, exc_type):
        if exc_type == ValueError:
            return (ValueError, 404)
        elif exc_type == KeyError:
            return (KeyError, 404)
        return (Exception, None)

def test_find_error_handler_value_error():
    app = MockApp()
    handler = _find_error_handler(app, ValueError("An error occurred"), ['blueprint1', 'blueprint2'])
    assert handler is not None
    assert handler(ValueError("An error occurred")) == "ValueError handler"

def test_find_error_handler_key_error():
    app = MockApp()
    handler = _find_error_handler(app, KeyError("An error occurred"), ['blueprint1', 'blueprint2'])
    assert handler is not None
    assert handler(KeyError("An error occurred")) == "KeyError handler"

def test_find_error_handler_no_handler():
    app = MockApp()
    handler = _find_error_handler(app, Exception("An error occurred"), ['blueprint1', 'blueprint2'])
    assert handler is None

def test_find_error_handler_with_none_code():
    app = MockApp()
    handler = _find_error_handler(app, Exception("An error occurred"), [None])
    assert handler is None
import pytest
from flask.sansio.app import App

class MockApp(App):
    def __init__(self):
        super().__init__(import_name='mock', static_url_path=None, static_folder=None,
                         static_host=None, host_matching=False, subdomain_matching=False,
                         template_folder=None, instance_path=None, instance_relative_config=False,
                         root_path=None)
        self.error_handler_spec = {
            None: {404: {}, 500: {}},
            'blueprint1': {404: {ValueError: lambda: "ValueError handler"}, 500: {}},
            'blueprint2': {404: {}, 500: {TypeError: lambda: "TypeError handler"}},
        }

    def _get_exc_class_and_code(self, exc_type):
        if exc_type == ValueError:
            return (ValueError, 404)
        elif exc_type == TypeError:
            return (TypeError, 500)
        return (Exception, None)

def test_find_error_handler_value_error():
    app = MockApp()
    handler = app._find_error_handler(ValueError("Not found"), ['blueprint1', 'blueprint2'])
    assert handler() == "ValueError handler"

def test_find_error_handler_type_error():
    app = MockApp()
    handler = app._find_error_handler(TypeError("Server error"), ['blueprint1', 'blueprint2'])
    assert handler() == "TypeError handler"

def test_find_error_handler_no_handler():
    app = MockApp()
    handler = app._find_error_handler(Exception("Unknown error"), ['blueprint1', 'blueprint2'])
    assert handler is None

def test_find_error_handler_no_blueprints():
    app = MockApp()
    handler = app._find_error_handler(ValueError("Not found"), [])
    assert handler is None

def test_find_error_handler_with_none_code():
    app = MockApp()
    handler = app._find_error_handler(Exception("Unknown error"), ['blueprint1'])
    assert handler is None
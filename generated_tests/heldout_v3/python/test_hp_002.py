import pytest
import flask
from flask.wrappers import Request

class TestLoadFormData:
    def setup_method(self):
        self.app = flask.Flask('test_app')
        self.environ = {
            "REQUEST_METHOD": "GET",
            "PATH_INFO": "/",
            "SERVER_NAME": "localhost",
            "SERVER_PORT": "80",
            "wsgi.url_scheme": "http"
        }
        self.request = Request(environ=self.environ)

    def test_load_form_data_no_files(self):
        with self.app.test_request_context('/'):
            self.request._load_form_data()
            # Assert that no form data is loaded (observable state)
            assert not self.request.form

    def test_load_form_data_with_files(self):
        with self.app.test_request_context('/'):
            self.request.files = {'file': 'test_file'}
            self.request._load_form_data()
            # Assert that files are present
            assert 'file' in self.request.files

    def test_load_form_data_debug_mode(self):
        self.app.debug = True
        with self.app.test_request_context('/'):
            self.request.mimetype = "application/json"
            self.request.files = {}
            with pytest.raises(Exception, match="KeyError"):
                self.request._load_form_data()

    def test_load_form_data_multipart(self):
        with self.app.test_request_context('/'):
            self.request.mimetype = "multipart/form-data"
            self.request.files = {}
            self.request._load_form_data()
            # Assert that no error is raised and form data is still empty
            assert not self.request.form
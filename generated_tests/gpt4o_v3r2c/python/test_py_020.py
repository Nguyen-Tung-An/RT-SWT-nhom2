import pytest
from flask.sansio.scaffold import Scaffold
from werkzeug.exceptions import HTTPException, NotFound, BadRequest
from flask import Flask

class TestGetExcClassAndCode:
    @pytest.fixture
    def scaffold(self):
        return Scaffold(import_name="test_app")

    def test_valid_http_exception(self, scaffold):
        app = Flask('test_app')
        with app.test_request_context('/'):
            exc_class, code = scaffold._get_exc_class_and_code(NotFound)
            assert exc_class == NotFound
            assert code == 404

    def test_valid_http_code(self, scaffold):
        app = Flask('test_app')
        with app.test_request_context('/'):
            exc_class, code = scaffold._get_exc_class_and_code(400)
            assert exc_class == BadRequest
            assert code == 400

    def test_invalid_http_code(self, scaffold):
        app = Flask('test_app')
        with app.test_request_context('/'):
            with pytest.raises(ValueError, match="'999' is not a recognized HTTP error code"):
                scaffold._get_exc_class_and_code(999)

    def test_instance_instead_of_class(self, scaffold):
        app = Flask('test_app')
        with app.test_request_context('/'):
            with pytest.raises(TypeError, match="NotFound() is an instance, not a class"):
                scaffold._get_exc_class_and_code(NotFound())

    def test_non_exception_class(self, scaffold):
        app = Flask('test_app')
        with app.test_request_context('/'):
            with pytest.raises(ValueError, match="'str' is not a subclass of Exception"):
                scaffold._get_exc_class_and_code("string")
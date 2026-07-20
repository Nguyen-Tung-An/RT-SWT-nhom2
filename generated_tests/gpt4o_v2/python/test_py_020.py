import pytest
from flask.sansio.scaffold import Scaffold
from werkzeug.exceptions import HTTPException, NotFound, BadRequest

class TestGetExcClassAndCode:

    def test_valid_http_exception(self):
        exc_class, code = Scaffold._get_exc_class_and_code(NotFound)
        assert exc_class == NotFound
        assert code == 404

    def test_valid_http_exception_with_code(self):
        class CustomHTTPException(HTTPException):
            code = 418
        exc_class, code = Scaffold._get_exc_class_and_code(CustomHTTPException)
        assert exc_class == CustomHTTPException
        assert code == 418

    def test_valid_exception_class(self):
        class CustomException(Exception):
            pass
        exc_class, code = Scaffold._get_exc_class_and_code(CustomException)
        assert exc_class == CustomException
        assert code is None

    def test_invalid_http_code(self):
        with pytest.raises(ValueError, match="'999' is not a recognized HTTP error code. Use a subclass of HTTPException with that code instead."):
            Scaffold._get_exc_class_and_code(999)

    def test_instance_of_exception(self):
        with pytest.raises(TypeError, match="TypeError('TypeError() is an instance, not a class. Handlers can only be registered for Exception classes or HTTP error codes.')"):
            Scaffold._get_exc_class_and_code(TypeError())

    def test_not_subclass_of_exception(self):
        with pytest.raises(ValueError, match="'str' is not a subclass of Exception. Handlers can only be registered for Exception classes or HTTP error codes."):
            Scaffold._get_exc_class_and_code(str)

    def test_invalid_type(self):
        with pytest.raises(TypeError):
            Scaffold._get_exc_class_and_code(None)
import pytest
from werkzeug.exceptions import HTTPException, NotFound, BadRequest
from flask.sansio.scaffold import Scaffold

def test_get_exc_class_and_code_with_http_exception():
    exc_class, code = Scaffold.errorhandler(NotFound)
    assert exc_class == NotFound
    assert code == 404

def test_get_exc_class_and_code_with_http_exception_code():
    exc_class, code = Scaffold.errorhandler(400)
    assert exc_class == BadRequest
    assert code == 400

def test_get_exc_class_and_code_with_non_http_exception():
    class CustomException(Exception):
        pass

    exc_class, code = Scaffold.errorhandler(CustomException)
    assert exc_class == CustomException
    assert code is None

def test_get_exc_class_and_code_with_invalid_http_code():
    with pytest.raises(ValueError, match="'999' is not a recognized HTTP error code"):
        Scaffold.errorhandler(999)

def test_get_exc_class_and_code_with_instance_instead_of_class():
    with pytest.raises(TypeError, match="'<class 'ValueError'>' is an instance, not a class"):
        Scaffold.errorhandler(ValueError())

def test_get_exc_class_and_code_with_non_exception_class():
    with pytest.raises(ValueError, match="'str' is not a subclass of Exception"):
        Scaffold.errorhandler(str)
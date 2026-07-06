import pytest
from flask.sansio.scaffold import _get_exc_class_and_code
from werkzeug.exceptions import HTTPException, NotFound, BadRequest

def test_get_exc_class_and_code_with_http_exception():
    exc_class, code = _get_exc_class_and_code(NotFound)
    assert exc_class == NotFound
    assert code == 404

def test_get_exc_class_and_code_with_non_http_exception():
    class CustomException(Exception):
        pass

    exc_class, code = _get_exc_class_and_code(CustomException)
    assert exc_class == CustomException
    assert code is None

def test_get_exc_class_and_code_with_http_status_code():
    exc_class, code = _get_exc_class_and_code(400)
    assert exc_class == BadRequest
    assert code == 400

def test_get_exc_class_and_code_with_invalid_http_status_code():
    with pytest.raises(ValueError, match="'999' is not a recognized HTTP error code"):
        _get_exc_class_and_code(999)

def test_get_exc_class_and_code_with_instance_of_exception():
    with pytest.raises(TypeError, match="'<class 'Exception'>' is an instance, not a class"):
        _get_exc_class_and_code(Exception())

def test_get_exc_class_and_code_with_non_exception_class():
    with pytest.raises(ValueError, match="'str' is not a subclass of Exception"):
        _get_exc_class_and_code(str)
import pytest
from flask.cli import locate_app, NoAppException

def test_locate_app_import_error():
    with pytest.raises(NoAppException, match="Could not import 'non_existent_module'"):
        locate_app('non_existent_module', None)

def test_locate_app_import_error_with_traceback():
    with pytest.raises(NoAppException) as exc_info:
        locate_app('non_existent_module', None, raise_if_not_found=True)
    assert "While importing 'non_existent_module', an ImportError was raised" in str(exc_info.value)

def test_locate_app_no_app_name():
    # Assuming 'flask' module is available and has a best app
    app = locate_app('flask', None)
    assert app is not None  # Replace with actual check for the best app

def test_locate_app_with_app_name():
    # Assuming 'flask' module has an app named 'app'
    app = locate_app('flask', 'app')
    assert app is not None  # Replace with actual check for the specific app

def test_locate_app_with_non_existent_app_name():
    app = locate_app('flask', 'non_existent_app', raise_if_not_found=False)
    assert app is None
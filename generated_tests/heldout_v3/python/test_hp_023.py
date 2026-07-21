import pytest
from http.cookies import Morsel
from requests.cookies import morsel_to_cookie
import time
import calendar

def create_morsel(key, value, max_age=None, expires=None, comment=None, domain=None, path=None, httponly=False, secure=False, version=None):
    morsel = Morsel()
    morsel.set(key, value)
    if max_age is not None:
        morsel["max-age"] = max_age
    if expires is not None:
        morsel["expires"] = expires
    if comment is not None:
        morsel["comment"] = comment
    if domain is not None:
        morsel["domain"] = domain
    if path is not None:
        morsel["path"] = path
    morsel["httponly"] = httponly
    morsel["secure"] = secure
    if version is not None:
        morsel["version"] = version
    return morsel

def test_morsel_to_cookie_with_max_age():
    morsel = create_morsel("test_cookie", "test_value", max_age="3600")
    cookie = morsel_to_cookie(morsel)
    assert cookie.name == "test_cookie"
    assert cookie.value == "test_value"
    assert cookie.expires == int(time.time() + 3600)

def test_morsel_to_cookie_with_expires():
    expires_time = calendar.timegm(time.strptime("Wed, 21 Oct 2015 07:28:00 GMT", "%a, %d %b %Y %H:%M:%S GMT"))
    morsel = create_morsel("test_cookie", "test_value", expires="Wed, 21 Oct 2015 07:28:00 GMT")
    cookie = morsel_to_cookie(morsel)
    assert cookie.name == "test_cookie"
    assert cookie.value == "test_value"
    assert cookie.expires == expires_time

def test_morsel_to_cookie_with_invalid_max_age():
    morsel = create_morsel("test_cookie", "test_value", max_age="invalid")
    with pytest.raises(TypeError, match="max-age: invalid must be integer"):
        morsel_to_cookie(morsel)

def test_morsel_to_cookie_with_no_max_age_or_expires():
    morsel = create_morsel("test_cookie", "test_value")
    cookie = morsel_to_cookie(morsel)
    assert cookie.name == "test_cookie"
    assert cookie.value == "test_value"
    assert cookie.expires is None

def test_morsel_to_cookie_with_comment():
    morsel = create_morsel("test_cookie", "test_value", comment="This is a test cookie")
    cookie = morsel_to_cookie(morsel)
    assert cookie.comment == "This is a test cookie"
    assert cookie.comment_url is True

def test_morsel_to_cookie_with_secure_and_httponly():
    morsel = create_morsel("test_cookie", "test_value", secure=True, httponly=True)
    cookie = morsel_to_cookie(morsel)
    assert cookie.secure is True
    assert cookie.rest["HttpOnly"] is True

def test_morsel_to_cookie_with_version():
    morsel = create_morsel("test_cookie", "test_value", version="1")
    cookie = morsel_to_cookie(morsel)
    assert cookie.version == 1
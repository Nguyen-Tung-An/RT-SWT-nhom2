import pytest
from requests.cookies import morsel_to_cookie
from http.cookies import Morsel

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
    morsel = create_morsel("test_cookie", "value", max_age="3600")
    cookie = morsel_to_cookie(morsel)
    assert cookie.name == "test_cookie"
    assert cookie.value == "value"
    assert cookie.expires is not None

def test_morsel_to_cookie_with_expires():
    morsel = create_morsel("test_cookie", "value", expires="Wed, 21 Oct 2025 07:28:00 GMT")
    cookie = morsel_to_cookie(morsel)
    assert cookie.name == "test_cookie"
    assert cookie.value == "value"
    assert cookie.expires is not None

def test_morsel_to_cookie_with_comment():
    morsel = create_morsel("test_cookie", "value", comment="This is a test cookie")
    cookie = morsel_to_cookie(morsel)
    assert cookie.comment == "This is a test cookie"
    assert cookie.comment_url is True

def test_morsel_to_cookie_with_domain():
    morsel = create_morsel("test_cookie", "value", domain="example.com")
    cookie = morsel_to_cookie(morsel)
    assert cookie.domain == "example.com"

def test_morsel_to_cookie_with_path():
    morsel = create_morsel("test_cookie", "value", path="/")
    cookie = morsel_to_cookie(morsel)
    assert cookie.path == "/"

def test_morsel_to_cookie_with_httponly():
    morsel = create_morsel("test_cookie", "value", httponly=True)
    cookie = morsel_to_cookie(morsel)
    assert cookie.rest["HttpOnly"] is True

def test_morsel_to_cookie_with_secure():
    morsel = create_morsel("test_cookie", "value", secure=True)
    cookie = morsel_to_cookie(morsel)
    assert cookie.secure is True

def test_morsel_to_cookie_with_version():
    morsel = create_morsel("test_cookie", "value", version="1")
    cookie = morsel_to_cookie(morsel)
    assert cookie.version == 1

def test_morsel_to_cookie_invalid_max_age():
    morsel = create_morsel("test_cookie", "value", max_age="invalid")
    with pytest.raises(TypeError):
        morsel_to_cookie(morsel)

def test_morsel_to_cookie_invalid_expires():
    morsel = create_morsel("test_cookie", "value", expires="invalid date")
    with pytest.raises(ValueError):
        morsel_to_cookie(morsel)
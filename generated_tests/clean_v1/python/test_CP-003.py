import pytest
from requests.cookies import morsel_to_cookie
from http.cookies import Morsel

def test_morsel_to_cookie_with_max_age():
    morsel = Morsel()
    morsel.set("name", "value")
    morsel["max-age"] = "3600"
    morsel["comment"] = "Test comment"
    morsel["domain"] = "example.com"
    morsel["path"] = "/"
    morsel["httponly"] = "True"
    morsel["secure"] = "False"
    morsel["expires"] = ""
    cookie = morsel_to_cookie(morsel)
    assert cookie.name == "name"
    assert cookie.value == "value"
    assert cookie.expires is not None

def test_morsel_to_cookie_with_expires():
    morsel = Morsel()
    morsel.set("name", "value")
    morsel["max-age"] = ""
    morsel["expires"] = "Wed, 21 Oct 2025 07:28:00 GMT"
    morsel["comment"] = "Test comment"
    morsel["domain"] = "example.com"
    morsel["path"] = "/"
    morsel["httponly"] = "False"
    morsel["secure"] = "True"
    cookie = morsel_to_cookie(morsel)
    assert cookie.name == "name"
    assert cookie.value == "value"
    assert cookie.expires is not None

def test_morsel_to_cookie_with_invalid_max_age():
    morsel = Morsel()
    morsel.set("name", "value")
    morsel["max-age"] = "invalid"
    with pytest.raises(TypeError):
        morsel_to_cookie(morsel)

def test_morsel_to_cookie_without_expires_or_max_age():
    morsel = Morsel()
    morsel.set("name", "value")
    morsel["max-age"] = ""
    morsel["expires"] = ""
    morsel["comment"] = ""
    morsel["domain"] = "example.com"
    morsel["path"] = "/"
    morsel["httponly"] = "False"
    morsel["secure"] = "False"
    cookie = morsel_to_cookie(morsel)
    assert cookie.name == "name"
    assert cookie.value == "value"
    assert cookie.expires is None
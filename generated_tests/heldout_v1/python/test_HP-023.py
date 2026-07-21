import pytest
from requests.cookies import morsel_to_cookie
from http.cookies import Morsel

def test_morsel_to_cookie_with_max_age():
    morsel = Morsel()
    morsel.set("name", "value", "value")
    morsel["max-age"] = "3600"
    morsel["comment"] = "Test comment"
    morsel["domain"] = "example.com"
    morsel["path"] = "/"
    morsel["httponly"] = "True"
    morsel["secure"] = "True"
    morsel["version"] = "1"
    
    cookie = morsel_to_cookie(morsel)
    assert cookie.name == "name"
    assert cookie.value == "value"
    assert cookie.domain == "example.com"
    assert cookie.path == "/"
    assert cookie.comment == "Test comment"
    assert cookie.expires is not None

def test_morsel_to_cookie_with_expires():
    morsel = Morsel()
    morsel.set("name", "value", "value")
    morsel["expires"] = "Wed, 21 Oct 2025 07:28:00 GMT"
    morsel["comment"] = "Test comment"
    morsel["domain"] = "example.com"
    morsel["path"] = "/"
    morsel["httponly"] = "False"
    morsel["secure"] = "False"
    
    cookie = morsel_to_cookie(morsel)
    assert cookie.name == "name"
    assert cookie.value == "value"
    assert cookie.domain == "example.com"
    assert cookie.path == "/"
    assert cookie.comment == "Test comment"
    assert cookie.expires is not None

def test_morsel_to_cookie_with_invalid_max_age():
    morsel = Morsel()
    morsel.set("name", "value", "value")
    morsel["max-age"] = "invalid"
    
    with pytest.raises(TypeError):
        morsel_to_cookie(morsel)

def test_morsel_to_cookie_without_max_age_or_expires():
    morsel = Morsel()
    morsel.set("name", "value", "value")
    morsel["comment"] = "Test comment"
    morsel["domain"] = "example.com"
    morsel["path"] = "/"
    morsel["httponly"] = "False"
    morsel["secure"] = "False"
    
    cookie = morsel_to_cookie(morsel)
    assert cookie.name == "name"
    assert cookie.value == "value"
    assert cookie.domain == "example.com"
    assert cookie.path == "/"
    assert cookie.comment == "Test comment"
    assert cookie.expires is None
import pytest
from requests.cookies import morsel_to_cookie
from http.cookies import Morsel

def test_morsel_to_cookie_valid():
    morsel = Morsel()
    morsel.set('name', 'value', 'value')
    cookie = morsel_to_cookie(morsel)
    assert cookie.name == 'name'
    assert cookie.value == 'value'

def test_morsel_to_cookie_with_path():
    morsel = Morsel()
    morsel.set('name', 'value', 'value')
    morsel['path'] = '/test'
    cookie = morsel_to_cookie(morsel)
    assert cookie.path == '/test'

def test_morsel_to_cookie_with_domain():
    morsel = Morsel()
    morsel.set('name', 'value', 'value')
    morsel['domain'] = 'example.com'
    cookie = morsel_to_cookie(morsel)
    assert cookie.domain == 'example.com'

def test_morsel_to_cookie_with_expires():
    morsel = Morsel()
    morsel.set('name', 'value', 'value')
    morsel['expires'] = 'Wed, 21 Oct 2025 07:28:00 GMT'
    cookie = morsel_to_cookie(morsel)
    assert cookie.expires == 'Wed, 21 Oct 2025 07:28:00 GMT'

def test_morsel_to_cookie_with_secure():
    morsel = Morsel()
    morsel.set('name', 'value', 'value')
    morsel['secure'] = True
    cookie = morsel_to_cookie(morsel)
    assert cookie.secure is True

def test_morsel_to_cookie_with_httponly():
    morsel = Morsel()
    morsel.set('name', 'value', 'value')
    morsel['httponly'] = True
    cookie = morsel_to_cookie(morsel)
    assert cookie.has_nonstandard_attr('httponly') is True

def test_morsel_to_cookie_empty_name():
    morsel = Morsel()
    morsel.set('', 'value', 'value')
    with pytest.raises(ValueError):
        morsel_to_cookie(morsel)

def test_morsel_to_cookie_empty_value():
    morsel = Morsel()
    morsel.set('name', '', 'value')
    cookie = morsel_to_cookie(morsel)
    assert cookie.value == ''

def test_morsel_to_cookie_invalid_expires():
    morsel = Morsel()
    morsel.set('name', 'value', 'value')
    morsel['expires'] = 'invalid_date'
    with pytest.raises(ValueError):
        morsel_to_cookie(morsel)
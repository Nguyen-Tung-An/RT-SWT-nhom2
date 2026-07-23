import pytest
from requests.cookies import RequestsCookieJar, remove_cookie_by_name

@pytest.fixture
def cookie_jar():
    jar = RequestsCookieJar()
    jar.set('test_cookie', 'value', domain='example.com', path='/')
    jar.set('another_cookie', 'value', domain='example.com', path='/')
    jar.set('test_cookie', 'value', domain='example.org', path='/')
    return jar

def test_remove_cookie_by_name_single_domain(cookie_jar):
    remove_cookie_by_name(cookie_jar, 'test_cookie', domain='example.com')
    assert 'test_cookie' not in cookie_jar

def test_remove_cookie_by_name_multiple_domains(cookie_jar):
    remove_cookie_by_name(cookie_jar, 'test_cookie', domain='example.org')
    assert 'test_cookie' in cookie_jar  # Should still exist in example.com
    assert 'test_cookie' not in cookie_jar  # Should be removed from example.org

def test_remove_cookie_by_name_with_path(cookie_jar):
    remove_cookie_by_name(cookie_jar, 'test_cookie', domain='example.com', path='/')
    assert 'test_cookie' not in cookie_jar

def test_remove_cookie_by_name_no_match(cookie_jar):
    remove_cookie_by_name(cookie_jar, 'non_existent_cookie')
    assert len(cookie_jar) == 3  # No cookies should be removed

def test_remove_cookie_by_name_with_path_no_match(cookie_jar):
    remove_cookie_by_name(cookie_jar, 'test_cookie', domain='example.com', path='/nonexistent')
    assert 'test_cookie' in cookie_jar  # Should still exist

def test_remove_cookie_by_name_with_none_domain_and_path(cookie_jar):
    remove_cookie_by_name(cookie_jar, 'test_cookie')
    assert 'test_cookie' not in cookie_jar  # Should remove all instances of test_cookie
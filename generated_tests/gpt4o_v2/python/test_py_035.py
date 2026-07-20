import pytest
from requests.cookies import remove_cookie_by_name
from requests.cookies import RequestsCookieJar

class TestRemoveCookieByName:
    def setup_method(self):
        self.cookiejar = RequestsCookieJar()
        self.cookiejar.set('test_cookie', 'value1', domain='example.com', path='/')
        self.cookiejar.set('test_cookie', 'value2', domain='example.com', path='/path')
        self.cookiejar.set('other_cookie', 'value3', domain='example.com', path='/')

    def test_remove_cookie_by_name_no_domain_no_path(self):
        remove_cookie_by_name(self.cookiejar, 'test_cookie')
        assert 'test_cookie' not in self.cookiejar

    def test_remove_cookie_by_name_with_domain(self):
        remove_cookie_by_name(self.cookiejar, 'test_cookie', domain='example.com')
        assert 'test_cookie' not in self.cookiejar

    def test_remove_cookie_by_name_with_path(self):
        remove_cookie_by_name(self.cookiejar, 'test_cookie', path='/path')
        assert 'test_cookie' in self.cookiejar
        assert self.cookiejar.get('test_cookie', path='/path') == 'value2'

    def test_remove_cookie_by_name_with_domain_and_path(self):
        remove_cookie_by_name(self.cookiejar, 'test_cookie', domain='example.com', path='/path')
        assert 'test_cookie' not in self.cookiejar

    def test_remove_non_existent_cookie(self):
        remove_cookie_by_name(self.cookiejar, 'non_existent_cookie')
        assert len(self.cookiejar) == 3  # No cookies should be removed

    def test_remove_cookie_with_different_domain(self):
        remove_cookie_by_name(self.cookiejar, 'test_cookie', domain='another.com')
        assert len(self.cookiejar) == 3  # No cookies should be removed

    def test_remove_cookie_with_different_path(self):
        remove_cookie_by_name(self.cookiejar, 'test_cookie', path='/another_path')
        assert len(self.cookiejar) == 3  # No cookies should be removed
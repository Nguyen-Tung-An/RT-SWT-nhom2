import pytest
from requests.cookies import RequestsCookieJar, remove_cookie_by_name

class TestRemoveCookieByName:
    def setup_method(self):
        self.cookiejar = RequestsCookieJar()
        self.cookiejar.set('test_cookie', 'value1', domain='example.com', path='/')
        self.cookiejar.set('test_cookie2', 'value2', domain='example.com', path='/subpath')
        self.cookiejar.set('another_cookie', 'value3', domain='example.com', path='/')

    def test_remove_cookie_exact_match(self):
        remove_cookie_by_name(self.cookiejar, 'test_cookie', domain='example.com', path='/')
        assert 'test_cookie' not in self.cookiejar

    def test_remove_cookie_different_domain(self):
        remove_cookie_by_name(self.cookiejar, 'test_cookie', domain='another.com', path='/')
        assert 'test_cookie' in self.cookiejar

    def test_remove_cookie_different_path(self):
        remove_cookie_by_name(self.cookiejar, 'test_cookie', domain='example.com', path='/differentpath')
        assert 'test_cookie' in self.cookiejar

    def test_remove_cookie_no_match(self):
        remove_cookie_by_name(self.cookiejar, 'non_existent_cookie', domain='example.com', path='/')
        assert len(self.cookiejar) == 3

    def test_remove_cookie_with_path(self):
        remove_cookie_by_name(self.cookiejar, 'test_cookie2', domain='example.com', path='/subpath')
        assert 'test_cookie2' not in self.cookiejar

    def test_remove_cookie_with_none_domain(self):
        remove_cookie_by_name(self.cookiejar, 'test_cookie', domain=None, path='/')
        assert 'test_cookie' not in self.cookiejar

    def test_remove_cookie_with_none_path(self):
        remove_cookie_by_name(self.cookiejar, 'test_cookie2', domain='example.com', path=None)
        assert 'test_cookie2' not in self.cookiejar
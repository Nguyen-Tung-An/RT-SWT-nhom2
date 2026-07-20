import pytest
from requests.cookies import RequestsCookieJar, remove_cookie_by_name

class TestRemoveCookieByName:
    def setup_method(self):
        self.cookiejar = RequestsCookieJar()
        self.cookiejar.set('test_cookie', 'value1', domain='example.com', path='/')
        self.cookiejar.set('test_cookie2', 'value2', domain='example.com', path='/')
        self.cookiejar.set('test_cookie', 'value3', domain='example.org', path='/')

    def test_remove_cookie_by_name_no_domain_no_path(self):
        remove_cookie_by_name(self.cookiejar, 'test_cookie')
        assert 'test_cookie' not in self.cookiejar

    def test_remove_cookie_by_name_with_domain(self):
        remove_cookie_by_name(self.cookiejar, 'test_cookie', domain='example.com')
        assert 'test_cookie' not in self.cookiejar
        assert 'test_cookie2' in self.cookiejar

    def test_remove_cookie_by_name_with_path(self):
        remove_cookie_by_name(self.cookiejar, 'test_cookie', path='/')
        assert 'test_cookie' not in self.cookiejar

    def test_remove_cookie_by_name_with_domain_and_path(self):
        remove_cookie_by_name(self.cookiejar, 'test_cookie', domain='example.com', path='/')
        assert 'test_cookie' not in self.cookiejar
        assert 'test_cookie2' in self.cookiejar

    def test_remove_cookie_by_name_non_existent(self):
        remove_cookie_by_name(self.cookiejar, 'non_existent_cookie')
        assert len(self.cookiejar) == 3  # No cookies should be removed

    def test_remove_cookie_by_name_with_different_domain(self):
        remove_cookie_by_name(self.cookiejar, 'test_cookie', domain='example.com', path='/nonexistent')
        assert 'test_cookie' in self.cookiejar  # Should not remove since path doesn't match

    def test_remove_cookie_by_name_with_different_path(self):
        remove_cookie_by_name(self.cookiejar, 'test_cookie', domain='example.org', path='/nonexistent')
        assert 'test_cookie' in self.cookiejar  # Should not remove since path doesn't match
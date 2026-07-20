import pytest
from requests.cookies import RequestsCookieJar
from requests.cookies import CookieConflictError

class TestFindNoDuplicates:
    def setup_method(self):
        self.jar = RequestsCookieJar()

    def test_single_cookie(self):
        self.jar.set_cookie(self.jar._create_cookie("test_cookie", "value1", domain="example.com", path="/"))
        result = self.jar._find_no_duplicates("test_cookie", "example.com", "/")
        assert result == "value1"

    def test_no_cookie_found(self):
        with pytest.raises(KeyError, match="name='nonexistent', domain=None, path=None"):
            self.jar._find_no_duplicates("nonexistent")

    def test_multiple_cookies_same_name(self):
        self.jar.set_cookie(self.jar._create_cookie("test_cookie", "value1", domain="example.com", path="/"))
        self.jar.set_cookie(self.jar._create_cookie("test_cookie", "value2", domain="example.com", path="/"))
        with pytest.raises(CookieConflictError, match="There are multiple cookies with name, 'test_cookie'"):
            self.jar._find_no_duplicates("test_cookie", "example.com", "/")

    def test_multiple_cookies_different_domain(self):
        self.jar.set_cookie(self.jar._create_cookie("test_cookie", "value1", domain="example.com", path="/"))
        self.jar.set_cookie(self.jar._create_cookie("test_cookie", "value2", domain="another.com", path="/"))
        result = self.jar._find_no_duplicates("test_cookie", "example.com", "/")
        assert result == "value1"

    def test_multiple_cookies_different_path(self):
        self.jar.set_cookie(self.jar._create_cookie("test_cookie", "value1", domain="example.com", path="/path1"))
        self.jar.set_cookie(self.jar._create_cookie("test_cookie", "value2", domain="example.com", path="/path2"))
        result = self.jar._find_no_duplicates("test_cookie", "example.com", "/path1")
        assert result == "value1"

    def test_no_domain_path(self):
        self.jar.set_cookie(self.jar._create_cookie("test_cookie", "value1", domain="example.com", path="/"))
        self.jar.set_cookie(self.jar._create_cookie("test_cookie", "value2", domain="example.com", path="/"))
        result = self.jar._find_no_duplicates("test_cookie")
        assert result == "value1"
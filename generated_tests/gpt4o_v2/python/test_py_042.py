import pytest
from requests.cookies import RequestsCookieJar, CookieConflictError

class TestFindNoDuplicates:
    def setup_method(self):
        self.jar = RequestsCookieJar()

    def test_single_cookie(self):
        self.jar.set_cookie(self.jar.make_cookie("test", "value1"))
        result = self.jar._find_no_duplicates("test")
        assert result == "value1"

    def test_single_cookie_with_domain(self):
        self.jar.set_cookie(self.jar.make_cookie("test", "value1", domain="example.com"))
        result = self.jar._find_no_duplicates("test", domain="example.com")
        assert result == "value1"

    def test_single_cookie_with_path(self):
        self.jar.set_cookie(self.jar.make_cookie("test", "value1", path="/path"))
        result = self.jar._find_no_duplicates("test", path="/path")
        assert result == "value1"

    def test_multiple_cookies_conflict(self):
        self.jar.set_cookie(self.jar.make_cookie("test", "value1"))
        self.jar.set_cookie(self.jar.make_cookie("test", "value2"))
        with pytest.raises(CookieConflictError):
            self.jar._find_no_duplicates("test")

    def test_no_cookie_found(self):
        with pytest.raises(KeyError):
            self.jar._find_no_duplicates("nonexistent")

    def test_no_cookie_found_with_domain(self):
        with pytest.raises(KeyError):
            self.jar._find_no_duplicates("nonexistent", domain="example.com")

    def test_no_cookie_found_with_path(self):
        with pytest.raises(KeyError):
            self.jar._find_no_duplicates("nonexistent", path="/path")

    def test_single_cookie_with_different_domain(self):
        self.jar.set_cookie(self.jar.make_cookie("test", "value1", domain="example.com"))
        result = self.jar._find_no_duplicates("test", domain="example.org")
        assert result is None  # Should not raise, but return None
import pytest
from requests.help import info

def test_info_returns_dict():
    result = info()
    assert isinstance(result, dict)

def test_info_contains_platform_info():
    result = info()
    assert "platform" in result
    assert isinstance(result["platform"], dict)
    assert "system" in result["platform"]
    assert "release" in result["platform"]

def test_info_contains_implementation_info():
    result = info()
    assert "implementation" in result

def test_info_contains_system_ssl_info():
    result = info()
    assert "system_ssl" in result
    assert isinstance(result["system_ssl"], dict)
    assert "version" in result["system_ssl"]

def test_info_contains_pyopenssl_info():
    result = info()
    assert "pyOpenSSL" in result
    assert isinstance(result["pyOpenSSL"], dict)
    assert "version" in result["pyOpenSSL"]
    assert "openssl_version" in result["pyOpenSSL"]

def test_info_contains_urllib3_info():
    result = info()
    assert "urllib3" in result
    assert isinstance(result["urllib3"], dict)
    assert "version" in result["urllib3"]

def test_info_contains_charset_normalizer_info():
    result = info()
    assert "charset_normalizer" in result
    assert isinstance(result["charset_normalizer"], dict)
    assert "version" in result["charset_normalizer"]

def test_info_contains_chardet_info():
    result = info()
    assert "chardet" in result
    assert isinstance(result["chardet"], dict)
    assert "version" in result["chardet"]

def test_info_contains_cryptography_info():
    result = info()
    assert "cryptography" in result
    assert isinstance(result["cryptography"], dict)
    assert "version" in result["cryptography"]

def test_info_contains_idna_info():
    result = info()
    assert "idna" in result
    assert isinstance(result["idna"], dict)
    assert "version" in result["idna"]

def test_info_contains_requests_info():
    result = info()
    assert "requests" in result
    assert isinstance(result["requests"], dict)
    assert "version" in result["requests"]
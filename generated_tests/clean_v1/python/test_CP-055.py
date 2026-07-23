import pytest
from requests.help import info

def test_info_structure():
    result = info()
    assert isinstance(result, dict)

def test_info_platform():
    result = info()
    assert "platform" in result
    assert isinstance(result["platform"], dict)
    assert "system" in result["platform"]
    assert "release" in result["platform"]

def test_info_implementation():
    result = info()
    assert "implementation" in result
    assert isinstance(result["implementation"], dict)

def test_info_system_ssl():
    result = info()
    assert "system_ssl" in result
    assert isinstance(result["system_ssl"], dict)
    assert "version" in result["system_ssl"]

def test_info_using_pyopenssl():
    result = info()
    assert "using_pyopenssl" in result
    assert isinstance(result["using_pyopenssl"], bool)

def test_info_using_charset_normalizer():
    result = info()
    assert "using_charset_normalizer" in result
    assert isinstance(result["using_charset_normalizer"], bool)

def test_info_pyOpenSSL():
    result = info()
    assert "pyOpenSSL" in result
    assert isinstance(result["pyOpenSSL"], dict)
    assert "version" in result["pyOpenSSL"]
    assert "openssl_version" in result["pyOpenSSL"]

def test_info_urllib3():
    result = info()
    assert "urllib3" in result
    assert isinstance(result["urllib3"], dict)
    assert "version" in result["urllib3"]

def test_info_chardet():
    result = info()
    assert "chardet" in result
    assert isinstance(result["chardet"], dict)
    assert "version" in result["chardet"]

def test_info_charset_normalizer():
    result = info()
    assert "charset_normalizer" in result
    assert isinstance(result["charset_normalizer"], dict)
    assert "version" in result["charset_normalizer"]

def test_info_cryptography():
    result = info()
    assert "cryptography" in result
    assert isinstance(result["cryptography"], dict)
    assert "version" in result["cryptography"]

def test_info_idna():
    result = info()
    assert "idna" in result
    assert isinstance(result["idna"], dict)
    assert "version" in result["idna"]

def test_info_requests():
    result = info()
    assert "requests" in result
    assert isinstance(result["requests"], dict)
    assert "version" in result["requests"]
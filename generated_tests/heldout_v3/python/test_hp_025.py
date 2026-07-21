import pytest
from requests.help import info

def test_info_return_type():
    result = info()
    assert isinstance(result, dict)

def test_info_platform_info():
    result = info()
    assert "platform" in result
    assert isinstance(result["platform"], dict)
    assert "system" in result["platform"]
    assert "release" in result["platform"]

def test_info_implementation_info():
    result = info()
    assert "implementation" in result
    assert isinstance(result["implementation"], dict)

def test_info_ssl_info():
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

def test_info_pyopenssl_info():
    result = info()
    assert "pyOpenSSL" in result
    assert isinstance(result["pyOpenSSL"], dict)

def test_info_urllib3_info():
    result = info()
    assert "urllib3" in result
    assert isinstance(result["urllib3"], dict)
    assert "version" in result["urllib3"]

def test_info_chardet_info():
    result = info()
    assert "chardet" in result
    assert isinstance(result["chardet"], dict)

def test_info_charset_normalizer_info():
    result = info()
    assert "charset_normalizer" in result
    assert isinstance(result["charset_normalizer"], dict)

def test_info_cryptography_info():
    result = info()
    assert "cryptography" in result
    assert isinstance(result["cryptography"], dict)

def test_info_idna_info():
    result = info()
    assert "idna" in result
    assert isinstance(result["idna"], dict)

def test_info_requests_info():
    result = info()
    assert "requests" in result
    assert isinstance(result["requests"], dict)
    assert "version" in result["requests"]
import pytest
import requests
from requests.exceptions import ChunkedEncodingError, ContentDecodingError, RequestsSSLError
from urllib3.exceptions import ProtocolError, DecodeError
from socket import timeout as ReadTimeoutError
import ssl

class TestResponseIterContentGenerate:
    def test_generate_with_stream(self, mocker):
        # Mocking the raw stream to simulate a successful chunked response
        mock_response = requests.Response()
        mock_response.raw = mocker.Mock()
        mock_response.raw.stream = mocker.Mock(return_value=[b'chunk1', b'chunk2', b'chunk3'])
        
        # Call iter_content with a chunk size
        result = list(mock_response.iter_content(chunk_size=2))
        
        assert result == [b'chunk1', b'chunk2', b'chunk3']
        assert mock_response._content_consumed is True

    def test_generate_with_protocol_error(self, mocker):
        # Mocking the raw stream to raise ProtocolError
        mock_response = requests.Response()
        mock_response.raw = mocker.Mock()
        mock_response.raw.stream = mocker.Mock(side_effect=ProtocolError("Protocol error"))
        
        with pytest.raises(ChunkedEncodingError):
            list(mock_response.iter_content(chunk_size=2))

    def test_generate_with_decode_error(self, mocker):
        # Mocking the raw stream to raise DecodeError
        mock_response = requests.Response()
        mock_response.raw = mocker.Mock()
        mock_response.raw.stream = mocker.Mock(side_effect=DecodeError("Decode error"))
        
        with pytest.raises(ContentDecodingError):
            list(mock_response.iter_content(chunk_size=2))

    def test_generate_with_read_timeout_error(self, mocker):
        # Mocking the raw stream to raise ReadTimeoutError
        mock_response = requests.Response()
        mock_response.raw = mocker.Mock()
        mock_response.raw.stream = mocker.Mock(side_effect=ReadTimeoutError("Read timeout"))
        
        with pytest.raises(requests.ConnectionError):
            list(mock_response.iter_content(chunk_size=2))

    def test_generate_with_ssl_error(self, mocker):
        # Mocking the raw stream to raise SSLError
        mock_response = requests.Response()
        mock_response.raw = mocker.Mock()
        mock_response.raw.stream = mocker.Mock(side_effect=ssl.SSLError("SSL error"))
        
        with pytest.raises(RequestsSSLError):
            list(mock_response.iter_content(chunk_size=2))

    def test_generate_with_standard_file_like_object(self, mocker):
        # Mocking a standard file-like object
        class MockFile:
            def __init__(self, content):
                self.content = content
                self.index = 0

            def read(self, chunk_size):
                if self.index < len(self.content):
                    chunk = self.content[self.index:self.index + chunk_size]
                    self.index += chunk_size
                    return chunk
                return b''

        mock_response = requests.Response()
        mock_response.raw = MockFile(b'HelloWorld')
        
        result = list(mock_response.iter_content(chunk_size=5))
        
        assert result == [b'Hello', b'World']
        assert mock_response._content_consumed is True
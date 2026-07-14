package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class HttpConnectionTest {

    @Test
    void testImplWritePost_MultipartPost_WithInputStream() throws IOException {
        HttpConnection.Request req = mock(HttpConnection.Request.class);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));

        Collection<HttpConnection.KeyVal> data = new ArrayList<>();
        HttpConnection.KeyVal keyVal = mock(HttpConnection.KeyVal.class);
        when(keyVal.key()).thenReturn("file");
        when(keyVal.value()).thenReturn("test.txt");
        when(keyVal.inputStream()).thenReturn(mock(InputStream.class));
        when(keyVal.contentType()).thenReturn("text/plain");
        data.add(keyVal);

        when(req.data()).thenReturn(data);
        when(req.mimeBoundary()).thenReturn("boundary");

        HttpConnection.Response.implWritePost(req, writer, outputStream);

        // Verify that the output stream was written to
        assertEquals("Content-Disposition: form-data; name=\"file\"; filename=\"test.txt\"\r\nContent-Type: text/plain\r\n\r\n", outputStream.toString());
    }

    @Test
    void testImplWritePost_SingleBodyString() throws IOException {
        HttpConnection.Request req = mock(HttpConnection.Request.class);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));

        when(req.body()).thenReturn("test body");

        HttpConnection.Response.implWritePost(req, writer, outputStream);

        // Verify that the output stream contains the body
        assertEquals("test body", outputStream.toString());
    }

    @Test
    void testImplWritePost_SingleBodyInputStream() throws IOException {
        HttpConnection.Request req = mock(HttpConnection.Request.class);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
        InputStream inputStream = mock(InputStream.class);

        when(req.body()).thenReturn(inputStream);

        HttpConnection.Response.implWritePost(req, writer, outputStream);

        // Verify that the input stream was processed
        verify(inputStream, times(1)).read(any(byte[].class), anyInt(), anyInt());
    }

    @Test
    void testImplWritePost_RegularFormData() throws IOException {
        HttpConnection.Request req = mock(HttpConnection.Request.class);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));

        Collection<HttpConnection.KeyVal> data = new ArrayList<>();
        HttpConnection.KeyVal keyVal1 = mock(HttpConnection.KeyVal.class);
        when(keyVal1.key()).thenReturn("key1");
        when(keyVal1.value()).thenReturn("value1");
        data.add(keyVal1);

        HttpConnection.KeyVal keyVal2 = mock(HttpConnection.KeyVal.class);
        when(keyVal2.key()).thenReturn("key2");
        when(keyVal2.value()).thenReturn("value2");
        data.add(keyVal2);

        when(req.data()).thenReturn(data);
        when(req.postDataCharset()).thenReturn("UTF-8");

        HttpConnection.Response.implWritePost(req, writer, outputStream);

        // Verify that the output stream contains the encoded form data
        assertEquals("key1=value1&key2=value2", outputStream.toString());
    }

    @Test
    void testImplWritePost_ThrowsIllegalStateException() {
        HttpConnection.Request req = mock(HttpConnection.Request.class);
        BufferedWriter writer = mock(BufferedWriter.class);
        OutputStream outputStream = mock(OutputStream.class);

        when(req.body()).thenReturn(new Object()); // Invalid body type

        assertThrows(IllegalStateException.class, () -> {
            HttpConnection.Response.implWritePost(req, writer, outputStream);
        });
    }
}
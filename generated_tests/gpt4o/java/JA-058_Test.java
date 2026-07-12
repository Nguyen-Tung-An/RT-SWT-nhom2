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

public class HttpConnectionTest {

    @Test
    void testImplWritePost_MultipartWithInputStream() throws IOException {
        HttpConnection.Request req = Mockito.mock(HttpConnection.Request.class);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new ByteArrayOutputStream()));
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        Collection<Connection.KeyVal> data = new ArrayList<>();
        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(keyVal.key()).thenReturn("file");
        Mockito.when(keyVal.value()).thenReturn("test.txt");
        Mockito.when(keyVal.inputStream()).thenReturn(Mockito.mock(InputStream.class));
        Mockito.when(keyVal.contentType()).thenReturn("text/plain");
        data.add(keyVal);

        Mockito.when(req.data()).thenReturn(data);
        Mockito.when(req.mimeBoundary).thenReturn("boundary");

        HttpConnection.implWritePost(req, writer, outputStream);

        // Add assertions to verify the output
        String expectedOutput = "--boundary\r\n" +
                "Content-Disposition: form-data; name=\"file\"; filename=\"test.txt\"\r\n" +
                "Content-Type: text/plain\r\n\r\n" +
                // Here we would need to verify the content of the InputStream
                "\r\n--boundary--";
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    void testImplWritePost_SingleBodyString() throws IOException {
        HttpConnection.Request req = Mockito.mock(HttpConnection.Request.class);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new ByteArrayOutputStream()));
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        Mockito.when(req.body()).thenReturn("test body");

        HttpConnection.implWritePost(req, writer, outputStream);

        // Add assertions to verify the output
        assertEquals("test body", outputStream.toString());
    }

    @Test
    void testImplWritePost_RegularFormData() throws IOException {
        HttpConnection.Request req = Mockito.mock(HttpConnection.Request.class);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new ByteArrayOutputStream()));
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        Collection<Connection.KeyVal> data = new ArrayList<>();
        data.add(Connection.KeyVal.create("key1", "value1"));
        data.add(Connection.KeyVal.create("key2", "value2"));

        Mockito.when(req.data()).thenReturn(data);
        Mockito.when(req.postDataCharset()).thenReturn("UTF-8");

        HttpConnection.implWritePost(req, writer, outputStream);

        // Add assertions to verify the output
        String expectedOutput = "key1=value1&key2=value2";
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    void testImplWritePost_ThrowsIllegalStateException() {
        HttpConnection.Request req = Mockito.mock(HttpConnection.Request.class);
        Mockito.when(req.body()).thenReturn(new Object()); // Invalid body type

        Exception exception = assertThrows(IllegalStateException.class, () -> {
            HttpConnection.implWritePost(req, null, null);
        });

        assertEquals("Unexpected body type", exception.getMessage());
    }
}
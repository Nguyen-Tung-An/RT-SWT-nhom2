package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class HttpConnectionResponseTest {

    @Test
    void testImplWritePostMultipart() throws Exception {
        HttpConnection.Request req = new HttpConnection.Request();
        req.mimeBoundary = "boundary";
        req.data = new ArrayList<>();
        req.data.add(HttpConnection.KeyVal.create("key1", "value1"));
        req.data.add(HttpConnection.KeyVal.create("key2", "value2").inputStream(new InputStream() {
            @Override
            public int read() {
                return -1; // Simulate end of stream
            }
        }));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8));

        Method m = HttpConnection.Response.class.getDeclaredMethod("implWritePost", HttpConnection.Request.class, BufferedWriter.class, OutputStream.class);
        m.setAccessible(true);
        m.invoke(null, req, writer, outputStream);

        String result = outputStream.toString(StandardCharsets.UTF_8);
        String expected = "--boundary\r\n" +
                "Content-Disposition: form-data; name=\"key1\"\r\n\r\n" +
                "value1\r\n" +
                "--boundary\r\n" +
                "Content-Disposition: form-data; name=\"key2\"; filename=\"value2\"\r\n" +
                "Content-Type: application/octet-stream\r\n\r\n" +
                "--boundary--";
        assertEquals(expected, result);
    }

    @Test
    void testImplWritePostSingleBodyString() throws Exception {
        HttpConnection.Request req = new HttpConnection.Request();
        req.body = "This is a test body";

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8));

        Method m = HttpConnection.Response.class.getDeclaredMethod("implWritePost", HttpConnection.Request.class, BufferedWriter.class, OutputStream.class);
        m.setAccessible(true);
        m.invoke(null, req, writer, outputStream);

        String result = outputStream.toString(StandardCharsets.UTF_8);
        assertEquals("This is a test body", result);
    }

    @Test
    void testImplWritePostSingleBodyInputStream() throws Exception {
        HttpConnection.Request req = new HttpConnection.Request();
        req.body = new InputStream() {
            private final byte[] data = "InputStream body".getBytes(StandardCharsets.UTF_8);
            private int index = 0;

            @Override
            public int read() {
                return index < data.length ? data[index++] : -1;
            }
        };

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8));

        Method m = HttpConnection.Response.class.getDeclaredMethod("implWritePost", HttpConnection.Request.class, BufferedWriter.class, OutputStream.class);
        m.setAccessible(true);
        m.invoke(null, req, writer, outputStream);

        String result = outputStream.toString(StandardCharsets.UTF_8);
        assertEquals("InputStream body", result);
    }

    @Test
    void testImplWritePostIllegalStateException() throws Exception {
        HttpConnection.Request req = new HttpConnection.Request();
        req.body = new Object(); // Invalid body type

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8));

        Method m = HttpConnection.Response.class.getDeclaredMethod("implWritePost", HttpConnection.Request.class, BufferedWriter.class, OutputStream.class);
        m.setAccessible(true);
        assertThrows(IllegalStateException.class, () -> {
            try {
                m.invoke(null, req, writer, outputStream);
            } catch (java.lang.reflect.InvocationTargetException e) {
                throw e.getCause();
            }
        });
    }
}
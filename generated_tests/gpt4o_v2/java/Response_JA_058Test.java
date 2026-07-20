import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.HttpConnection.Response;
import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HttpConnectionResponseTest {

    @Test
    void testImplWritePostMultipart() throws IOException {
        HttpConnection.Request req = new HttpConnection.Request();
        req.mimeBoundary = "boundary123";
        req.data = new ArrayList<>();
        req.data.add(HttpConnection.KeyVal.create("file", "test.txt").inputStream(new InputStream() {
            @Override
            public int read() {
                return -1; // Simulate end of stream
            }
        }).contentType("text/plain"));
        
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));

        Response.implWritePost(req, writer, outputStream);
        writer.flush();

        String expectedOutput = "--boundary123\r\n" +
                "Content-Disposition: form-data; name=\"file\"; filename=\"test.txt\"\r\n" +
                "Content-Type: text/plain\r\n\r\n" +
                "\r\n" +
                "--boundary123--";
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    void testImplWritePostSingleBodyString() throws IOException {
        HttpConnection.Request req = new HttpConnection.Request();
        req.body = "This is a test body";

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));

        Response.implWritePost(req, writer, outputStream);
        writer.flush();

        assertEquals("This is a test body", outputStream.toString());
    }

    @Test
    void testImplWritePostSingleBodyInputStream() throws IOException {
        HttpConnection.Request req = new HttpConnection.Request();
        req.body = new InputStream() {
            private final String data = "InputStream data";
            private int index = 0;

            @Override
            public int read() {
                return index < data.length() ? data.charAt(index++) : -1;
            }
        };

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));

        Response.implWritePost(req, writer, outputStream);
        writer.flush();

        assertEquals("InputStream data", outputStream.toString());
    }

    @Test
    void testImplWritePostFormUrlEncoded() throws IOException {
        HttpConnection.Request req = new HttpConnection.Request();
        req.data = new ArrayList<>();
        req.data.add(HttpConnection.KeyVal.create("key1", "value1"));
        req.data.add(HttpConnection.KeyVal.create("key2", "value2"));
        req.postDataCharset = "UTF-8";

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));

        Response.implWritePost(req, writer, outputStream);
        writer.flush();

        assertEquals("key1=value1&key2=value2", outputStream.toString());
    }

    @Test
    void testImplWritePostThrowsIllegalStateException() {
        HttpConnection.Request req = new HttpConnection.Request();
        req.body = new Object(); // Invalid body type

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));

        Exception exception = null;
        try {
            Response.implWritePost(req, writer, outputStream);
        } catch (IllegalStateException e) {
            exception = e;
        }

        assertEquals(IllegalStateException.class, exception.getClass());
    }
}
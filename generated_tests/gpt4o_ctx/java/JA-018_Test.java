package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.channels.SeekableByteChannel;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.channels.Channels;
import java.util.zip.GZIPInputStream;

import static org.junit.jupiter.api.Assertions.*;

public class DataUtilTest {

    @Test
    void testOpenStream_NormalFile() throws IOException {
        Path path = Files.createTempFile("testfile", ".txt");
        Files.write(path, "Test content".getBytes());
        ControllableInputStream stream = DataUtil.openStream(path);
        assertNotNull(stream);
        assertEquals("Test content", new String(stream.readAllBytes()));
        Files.delete(path);
    }

    @Test
    void testOpenStream_GzipFile() throws IOException {
        Path path = Files.createTempFile("testfile", ".gz");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (GZIPInputStream gzipOutputStream = new GZIPInputStream(new ByteArrayInputStream("Test content".getBytes()))) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = gzipOutputStream.read(buffer)) != -1) {
                byteArrayOutputStream.write(buffer, 0, len);
            }
        }
        Files.write(path, byteArrayOutputStream.toByteArray());
        ControllableInputStream stream = DataUtil.openStream(path);
        assertNotNull(stream);
        assertEquals("Test content", new String(stream.readAllBytes()));
        Files.delete(path);
    }

    @Test
    void testOpenStream_InvalidGzipFile() {
        Path path = Paths.get("invalid.gz");
        assertThrows(IOException.class, () -> {
            DataUtil.openStream(path);
        });
    }

    @Test
    void testOpenStream_NonExistentFile() {
        Path path = Paths.get("nonexistent.txt");
        assertThrows(IOException.class, () -> {
            DataUtil.openStream(path);
        });
    }
}
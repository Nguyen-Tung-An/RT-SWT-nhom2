package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.channels.Channels;
import java.util.zip.GZIPOutputStream;

import static org.junit.jupiter.api.Assertions.*;

public class DataUtilTest {

    @Test
    void testOpenStream_NormalFile() throws IOException {
        Path path = Files.createTempFile("testfile", ".txt");
        Files.write(path, "Test content".getBytes(StandardCharsets.UTF_8));
        InputStream stream = DataUtil.load(path, StandardCharsets.UTF_8.name(), null);
        assertNotNull(stream);
        assertEquals("Test content", new String(stream.readAllBytes(), StandardCharsets.UTF_8));
        Files.delete(path);
    }

    @Test
    void testOpenStream_GzipFile() throws IOException {
        Path path = Files.createTempFile("testfile", ".gz");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (GZIPOutputStream gzipOutputStream = new GZIPOutputStream(byteArrayOutputStream)) {
            gzipOutputStream.write("Test content".getBytes(StandardCharsets.UTF_8));
        }
        Files.write(path, byteArrayOutputStream.toByteArray());
        InputStream stream = DataUtil.load(path, StandardCharsets.UTF_8.name(), null);
        assertNotNull(stream);
        assertEquals("Test content", new String(stream.readAllBytes(), StandardCharsets.UTF_8));
        Files.delete(path);
    }

    @Test
    void testOpenStream_InvalidGzipFile() {
        Path path = Paths.get("invalid.gz");
        assertThrows(IOException.class, () -> {
            DataUtil.load(path, StandardCharsets.UTF_8.name(), null);
        });
    }

    @Test
    void testOpenStream_NonExistentFile() {
        Path path = Paths.get("nonexistent.txt");
        assertThrows(IOException.class, () -> {
            DataUtil.load(path, StandardCharsets.UTF_8.name(), null);
        });
    }
}
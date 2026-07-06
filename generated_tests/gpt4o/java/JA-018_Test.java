package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DataUtilTest {

    @Test
    void testOpenStream_WithGzipFile() throws IOException {
        Path path = Paths.get("src/test/resources/testfile.gz");
        assertNotNull(DataUtil.openStream(path));
    }

    @Test
    void testOpenStream_WithZFile() throws IOException {
        Path path = Paths.get("src/test/resources/testfile.z");
        assertNotNull(DataUtil.openStream(path));
    }

    @Test
    void testOpenStream_WithRegularFile() throws IOException {
        Path path = Paths.get("src/test/resources/testfile.txt");
        assertNotNull(DataUtil.openStream(path));
    }

    @Test
    void testOpenStream_WithInvalidFile() {
        Path path = Paths.get("src/test/resources/invalidfile.txt");
        assertThrows(IOException.class, () -> DataUtil.openStream(path));
    }

    @Test
    void testOpenStream_WithCorruptedGzipFile() {
        Path path = Paths.get("src/test/resources/corruptedfile.gz");
        assertThrows(IOException.class, () -> DataUtil.openStream(path));
    }
}
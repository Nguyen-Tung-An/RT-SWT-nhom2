package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.GZIPInputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DataUtilTest {

    @Test
    void testOpenStreamValidFile() throws Exception {
        Path path = Paths.get("src/test/resources/testfile.txt");
        java.lang.reflect.Method m = DataUtil.class.getDeclaredMethod("openStream", Path.class);
        m.setAccessible(true);
        ControllableInputStream result = (ControllableInputStream) m.invoke(null, path);
        assertEquals("Expected content", new String(result.readAllBytes()));
    }

    @Test
    void testOpenStreamGzipFile() throws Exception {
        Path path = Paths.get("src/test/resources/testfile.gz");
        java.lang.reflect.Method m = DataUtil.class.getDeclaredMethod("openStream", Path.class);
        m.setAccessible(true);
        ControllableInputStream result = (ControllableInputStream) m.invoke(null, path);
        assertEquals("Expected content", new String(result.readAllBytes()));
    }

    @Test
    void testOpenStreamFileNotFound() throws Exception {
        Path path = Paths.get("src/test/resources/nonexistentfile.txt");
        java.lang.reflect.Method m = DataUtil.class.getDeclaredMethod("openStream", Path.class);
        m.setAccessible(true);
        assertThrows(IOException.class, () -> {
            try {
                m.invoke(null, path);
            } catch (java.lang.reflect.InvocationTargetException e) {
                throw e.getCause();
            }
        });
    }

    @Test
    void testOpenStreamInvalidGzip() throws Exception {
        Path path = Paths.get("src/test/resources/invalidfile.gz");
        java.lang.reflect.Method m = DataUtil.class.getDeclaredMethod("openStream", Path.class);
        m.setAccessible(true);
        assertThrows(IOException.class, () -> {
            try {
                m.invoke(null, path);
            } catch (java.lang.reflect.InvocationTargetException e) {
                throw e.getCause();
            }
        });
    }
}
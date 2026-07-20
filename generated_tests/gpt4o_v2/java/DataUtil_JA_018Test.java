import org.jsoup.helper.DataUtil;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.channels.SeekableByteChannel;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

import static org.junit.jupiter.api.Assertions.*;

class DataUtilTest {

    @Test
    void testOpenStreamWithValidPath() throws IOException {
        Path path = Files.createTempFile("testFile", ".txt");
        Files.writeString(path, "Test content");
        
        try (ControllableInputStream stream = DataUtil.openStream(path)) {
            assertNotNull(stream);
            assertEquals("Test content", new String(stream.readAllBytes()));
        } finally {
            Files.deleteIfExists(path);
        }
    }

    @Test
    void testOpenStreamWithGzipFile() throws IOException {
        Path path = Files.createTempFile("testFile", ".gz");
        try (GZIPInputStream gzipStream = new GZIPInputStream(Files.newInputStream(path))) {
            gzipStream.write("Test content".getBytes());
        }

        try (ControllableInputStream stream = DataUtil.openStream(path)) {
            assertNotNull(stream);
            assertEquals("Test content", new String(stream.readAllBytes()));
        } finally {
            Files.deleteIfExists(path);
        }
    }

    @Test
    void testOpenStreamWithInvalidPath() {
        Path path = Paths.get("invalid/path/to/file.txt");
        assertThrows(IOException.class, () -> DataUtil.openStream(path));
    }

    @Test
    void testOpenStreamWithGzipCorruptedFile() throws IOException {
        Path path = Files.createTempFile("testFile", ".gz");
        Files.write(path, new byte[]{0x00}); // Write corrupted gzip data

        assertThrows(IOException.class, () -> DataUtil.openStream(path));
        Files.deleteIfExists(path);
    }
}
package org.jsoup.examples;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ListLinksTest {

    @Test
    void testMain_ValidUrl() throws IOException {
        // Redirecting output to capture printed statements
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalOut = System.out;
        System.setOut(printStream);

        String[] args = {"https://example.com"};
        ListLinks.main(args);

        System.setOut(originalOut);
        String output = outputStream.toString();

        // Check if output contains expected strings
        assertTrue(output.contains("Fetching https://example.com..."));
        assertTrue(output.contains("Media: ("));
        assertTrue(output.contains("Imports: ("));
        assertTrue(output.contains("Links: ("));

        // Additional assertions can be added based on expected content
    }

    @Test
    void testMain_NoArguments() {
        String[] args = {};
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ListLinks.main(args);
        });
        assertTrue(exception.getMessage().contains("usage: supply url to fetch"));
    }

    @Test
    void testMain_MultipleArguments() {
        String[] args = {"https://example.com", "extraArg"};
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ListLinks.main(args);
        });
        assertTrue(exception.getMessage().contains("usage: supply url to fetch"));
    }
}
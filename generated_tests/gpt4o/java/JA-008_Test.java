package org.jsoup.examples;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HtmlToPlainTextTest {

    @Test
    void testMain_WithUrlOnly() throws IOException {
        // Redirecting output to capture it
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalOut = System.out;
        System.setOut(printStream);

        String[] args = {"http://example.com"};
        HtmlToPlainText.main(args);

        System.out.flush();
        System.setOut(originalOut);

        String output = outputStream.toString();
        // Validate the output contains expected plain text (this is a placeholder)
        assertEquals("Expected plain text output", output.trim());
    }

    @Test
    void testMain_WithUrlAndSelector() throws IOException {
        // Redirecting output to capture it
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalOut = System.out;
        System.setOut(printStream);

        String[] args = {"http://example.com", "p"};
        HtmlToPlainText.main(args);

        System.out.flush();
        System.setOut(originalOut);

        String output = outputStream.toString();
        // Validate the output contains expected plain text for the selector (this is a placeholder)
        assertEquals("Expected plain text output for selector", output.trim());
    }

    @Test
    void testMain_WithInvalidArgs() {
        String[] args = {"http://example.com", "p", "extraArg"};
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            HtmlToPlainText.main(args);
        });
        assertEquals("usage: java -jar jsoup-examples.jar url [selector]", exception.getMessage());
    }
}
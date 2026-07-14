package org.jsoup.examples;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HtmlToPlainTextTest {

    @Test
    void testMain_WithUrlOnly() throws IOException {
        // Redirecting output to capture it
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalOut = System.out;
        System.setOut(printStream);

        // Call main with a valid URL
        String[] args = {"http://example.com"};
        HtmlToPlainText.main(args);

        // Restore original output
        System.setOut(originalOut);

        // Check if output contains expected content
        String output = outputStream.toString();
        assertTrue(output.contains("Example Domain")); // Assuming the page contains this text
    }

    @Test
    void testMain_WithUrlAndSelector() throws IOException {
        // Redirecting output to capture it
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalOut = System.out;
        System.setOut(printStream);

        // Call main with a valid URL and a selector
        String[] args = {"http://example.com", "h1"};
        HtmlToPlainText.main(args);

        // Restore original output
        System.setOut(originalOut);

        // Check if output contains expected content
        String output = outputStream.toString();
        assertTrue(output.contains("Example Domain")); // Assuming the h1 contains this text
    }

    @Test
    void testMain_WithInvalidArgs() {
        // Redirecting output to capture it
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalOut = System.out;
        System.setOut(printStream);

        // Call main with invalid arguments
        String[] args = {"http://example.com", "extraArg"};
        try {
            HtmlToPlainText.main(args);
        } catch (IOException e) {
            // Expected exception
        }

        // Restore original output
        System.setOut(originalOut);

        // Check if output contains usage message
        String output = outputStream.toString();
        assertTrue(output.contains("usage: java -jar jsoup-examples.jar url [selector]"));
    }
}
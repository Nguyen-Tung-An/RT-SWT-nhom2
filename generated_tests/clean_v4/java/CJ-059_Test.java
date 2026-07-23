package org.jsoup.examples;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ListLinksTest {

    @Test
    public void testMainWithValidUrl() throws IOException {
        String[] args = {"http://example.com"};
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        ListLinks.main(args);

        String output = outputStream.toString();
        assertTrue(output.contains("Fetching http://example.com..."));
        assertTrue(output.contains("Links: ("));
    }

    @Test
    public void testMainWithNoArguments() {
        String[] args = {};
        Exception exception = null;

        try {
            ListLinks.main(args);
        } catch (IOException e) {
            exception = e;
        }

        assertTrue(exception instanceof IOException);
        assertTrue(exception.getMessage().contains("usage: supply url to fetch"));
    }

    @Test
    public void testMainWithMultipleArguments() {
        String[] args = {"http://example.com", "extraArg"};
        Exception exception = null;

        try {
            ListLinks.main(args);
        } catch (IOException e) {
            exception = e;
        }

        assertTrue(exception instanceof IOException);
        assertTrue(exception.getMessage().contains("usage: supply url to fetch"));
    }

    @Test
    public void testMainWithInvalidUrl() {
        String[] args = {"invalid-url"};
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Exception exception = null;
        try {
            ListLinks.main(args);
        } catch (IOException e) {
            exception = e;
        }

        String output = outputStream.toString();
        assertTrue(exception instanceof IOException);
        assertTrue(output.contains("Fetching invalid-url..."));
    }
}
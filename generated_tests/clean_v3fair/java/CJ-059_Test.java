package org.jsoup.examples;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ListLinksTest {

    @Test
    void testMain_ValidUrl() throws IOException {
        String[] args = {"http://example.com"};
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        
        ListLinks.main(args);
        
        String output = outputStream.toString();
        assertTrue(output.contains("Fetching http://example.com..."));
    }

    @Test
    void testMain_NoArguments() {
        String[] args = {};
        Exception exception = null;
        try {
            ListLinks.main(args);
        } catch (Exception e) {
            exception = e;
        }
        assertTrue(exception instanceof IllegalArgumentException);
        assertTrue(exception.getMessage().contains("usage: supply url to fetch"));
    }

    @Test
    void testMain_MultipleArguments() {
        String[] args = {"http://example.com", "extraArg"};
        Exception exception = null;
        try {
            ListLinks.main(args);
        } catch (Exception e) {
            exception = e;
        }
        assertTrue(exception instanceof IllegalArgumentException);
        assertTrue(exception.getMessage().contains("usage: supply url to fetch"));
    }
}
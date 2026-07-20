import org.jsoup.examples.HtmlToPlainText;
import org.jsoup.Jsoup;
import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class HtmlToPlainTextTest {

    @Test
    public void testMainWithOneArgument() throws IOException {
        String[] args = {"http://example.com"};
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        HtmlToPlainText.main(args);
        
        String output = outContent.toString();
        assertTrue(output.contains("Example Domain")); // Check for known content in the output
    }

    @Test
    public void testMainWithTwoArguments() throws IOException {
        String[] args = {"http://example.com", "h1"};
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        HtmlToPlainText.main(args);
        
        String output = outContent.toString();
        assertTrue(output.contains("Example Domain")); // Check for known content in the output
    }

    @Test
    public void testMainWithInvalidUrl() {
        String[] args = {"invalid-url"};
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        try {
            HtmlToPlainText.main(args);
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("invalid URL")); // Check for expected exception message
        }
    }

    @Test
    public void testMainWithNoArguments() {
        String[] args = {};
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        try {
            HtmlToPlainText.main(args);
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("usage: java -jar jsoup-examples.jar url [selector]")); // Check for expected exception message
        }
    }

    @Test
    public void testMainWithMoreThanTwoArguments() {
        String[] args = {"http://example.com", "h1", "extraArg"};
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        try {
            HtmlToPlainText.main(args);
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("usage: java -jar jsoup-examples.jar url [selector]")); // Check for expected exception message
        }
    }
}
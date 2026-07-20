import org.jsoup.examples.HtmlToPlainText;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HtmlToPlainTextTest {

    @Test
    public void testMainWithOneArgument() throws IOException {
        // Redirecting System.out to capture output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        String[] args = {"http://example.com"};
        HtmlToPlainText.main(args);

        String expectedOutput = "Example Domain\n\nThis domain is for use in illustrative examples in documents.\nYou may use this domain in literature without prior coordination or asking for permission.\n"; // Adjust based on actual output
        assertEquals(expectedOutput.trim(), outContent.toString().trim());

        // Reset the output
        System.setOut(System.out);
    }

    @Test
    public void testMainWithTwoArguments() throws IOException {
        // Redirecting System.out to capture output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        String[] args = {"http://example.com", "h1"};
        HtmlToPlainText.main(args);

        String expectedOutput = "Example Domain\n"; // Adjust based on actual output
        assertEquals(expectedOutput.trim(), outContent.toString().trim());

        // Reset the output
        System.setOut(System.out);
    }

    @Test
    public void testMainWithInvalidArgumentCount() {
        String[] args = {"http://example.com", "h1", "extraArg"};
        Exception exception = org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> {
            HtmlToPlainText.main(args);
        });
        assertEquals("usage: java -jar jsoup-examples.jar url [selector]", exception.getMessage());
    }

    @Test
    public void testMainWithNoArguments() {
        String[] args = {};
        Exception exception = org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> {
            HtmlToPlainText.main(args);
        });
        assertEquals("usage: java -jar jsoup-examples.jar url [selector]", exception.getMessage());
    }
}
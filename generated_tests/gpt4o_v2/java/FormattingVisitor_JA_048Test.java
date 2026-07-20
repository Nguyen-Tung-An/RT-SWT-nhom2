import org.jsoup.examples.HtmlToPlainText;
import org.jsoup.examples.HtmlToPlainText.FormattingVisitor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FormattingVisitorTest {
    private FormattingVisitor visitor;

    @BeforeEach
    void setUp() {
        visitor = new HtmlToPlainText.FormattingVisitor();
    }

    @Test
    void testAppend_NewlineAtStart() {
        visitor.append("\nHello");
        assertEquals(5, visitor.getWidth());
    }

    @Test
    void testAppend_SingleSpace() {
        visitor.append(" ");
        assertEquals(0, visitor.getWidth());
    }

    @Test
    void testAppend_ConsecutiveSpaces() {
        visitor.append(" ");
        visitor.append(" ");
        assertEquals(0, visitor.getWidth());
    }

    @Test
    void testAppend_WrapText() {
        visitor.append("This is a long text that should wrap.");
        assertEquals(37, visitor.getWidth());
    }

    @Test
    void testAppend_FitsWithoutWrap() {
        visitor.append("Short text.");
        assertEquals(11, visitor.getWidth());
    }

    @Test
    void testAppend_WrapWithNewline() {
        visitor.append("This is a long text that should wrap.");
        visitor.append(" And this is another long text.");
        assertEquals(43, visitor.getWidth());
    }

    @Test
    void testAppend_EmptyString() {
        visitor.append("");
        assertEquals(0, visitor.getWidth());
    }

    @Test
    void testAppend_SingleWord() {
        visitor.append("Word");
        assertEquals(4, visitor.getWidth());
    }
}
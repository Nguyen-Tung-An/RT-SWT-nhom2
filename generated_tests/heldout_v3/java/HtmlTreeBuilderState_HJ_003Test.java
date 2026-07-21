import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.HtmlTreeBuilderState;
import org.jsoup.parser.Token;
import org.jsoup.nodes.DocumentType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HtmlTreeBuilderStateTest {

    @Test
    void testProcessWhitespaceToken() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        HtmlTreeBuilderState state = new HtmlTreeBuilderState();
        Token whitespaceToken = Token.createCharacter("\u0020"); // whitespace
        boolean result = state.process(whitespaceToken, tb);
        assertTrue(result);
    }

    @Test
    void testProcessCommentToken() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        HtmlTreeBuilderState state = new HtmlTreeBuilderState();
        Token commentToken = Token.createComment("This is a comment");
        boolean result = state.process(commentToken, tb);
        assertTrue(result);
        assertEquals(1, tb.getDocument().childNodeSize()); // Check if comment node is inserted
    }

    @Test
    void testProcessDoctypeToken() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        HtmlTreeBuilderState state = new HtmlTreeBuilderState();
        Token doctypeToken = Token.createDoctype("html", "", "");
        boolean result = state.process(doctypeToken, tb);
        assertTrue(result);
        assertTrue(tb.getDocument().childNodeSize() > 0); // Check if doctype node is inserted
        assertTrue(tb.getDocument().quirksMode() == Document.QuirksMode.noQuirks); // Check quirks mode
    }

    @Test
    void testProcessUnknownToken() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        HtmlTreeBuilderState state = new HtmlTreeBuilderState();
        Token unknownToken = Token.createCharacter("Some text");
        boolean result = state.process(unknownToken, tb);
        assertTrue(result);
        assertEquals(1, tb.getDocument().childNodeSize()); // Check if text node is inserted
    }

    @Test
    void testProcessDoctypeWithQuirks() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        HtmlTreeBuilderState state = new HtmlTreeBuilderState();
        Token doctypeToken = Token.createDoctype("html", "", ""); // Force quirks
        doctypeToken.setForceQuirks(true);
        boolean result = state.process(doctypeToken, tb);
        assertTrue(result);
        assertTrue(tb.getDocument().quirksMode() == Document.QuirksMode.quirks); // Check quirks mode
    }
}
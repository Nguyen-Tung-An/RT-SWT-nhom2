import org.jsoup.parser.HtmlTreeBuilderState;
import org.jsoup.parser.Token;
import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HtmlTreeBuilderStateTest {

    @Test
    void testProcessWithStartTag() {
        HtmlTreeBuilderState state = new HtmlTreeBuilderState();
        Token token = new Token.StartTag("div");
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        state.process(token, builder);
        assertTrue(builder.isInState("div"));
    }

    @Test
    void testProcessWithEndTag() {
        HtmlTreeBuilderState state = new HtmlTreeBuilderState();
        Token token = new Token.EndTag("div");
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        state.process(token, builder);
        assertFalse(builder.isInState("div"));
    }

    @Test
    void testProcessWithComment() {
        HtmlTreeBuilderState state = new HtmlTreeBuilderState();
        Token token = new Token.Comment("This is a comment");
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        state.process(token, builder);
        assertTrue(builder.hasComment("This is a comment"));
    }

    @Test
    void testProcessWithDoctype() {
        HtmlTreeBuilderState state = new HtmlTreeBuilderState();
        Token token = new Token.Doctype("html");
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        state.process(token, builder);
        assertTrue(builder.isInDoctype("html"));
    }

    @Test
    void testProcessWithMalformedToken() {
        HtmlTreeBuilderState state = new HtmlTreeBuilderState();
        Token token = new Token.StartTag("malformed<");
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        assertThrows(IllegalArgumentException.class, () -> {
            state.process(token, builder);
        });
    }
}
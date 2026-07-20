import org.apache.commons.csv.Lexer;
import org.apache.commons.csv.Token;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LexerTest {
    private Lexer lexer;
    private Token token;

    @BeforeEach
    void setUp() {
        lexer = new Lexer(new StringReader("test, data\nnext line"));
        token = new Token();
    }

    @Test
    void testParseSimpleToken_EOF() throws IOException {
        lexer.parseSimpleToken(token, -1); // Simulate EOF
        assertEquals(Token.Type.EOF, token.type);
        assertEquals(true, token.isReady);
    }

    @Test
    void testParseSimpleToken_EORECORD() throws IOException {
        lexer.parseSimpleToken(token, '\n'); // Simulate end of record
        assertEquals(Token.Type.EORECORD, token.type);
    }

    @Test
    void testParseSimpleToken_Delimiter() throws IOException {
        lexer.parseSimpleToken(token, ','); // Simulate delimiter
        assertEquals(Token.Type.TOKEN, token.type);
    }

    @Test
    void testParseSimpleToken_EscapeCharacter() throws IOException {
        lexer.parseSimpleToken(token, '\\'); // Simulate escape character
        lexer.parseSimpleToken(token, 'n'); // Simulate next character after escape
        assertEquals("n", token.content.toString());
    }

    @Test
    void testParseSimpleToken_RegularCharacter() throws IOException {
        lexer.parseSimpleToken(token, 'a'); // Simulate regular character
        assertEquals("a", token.content.toString());
    }

    @Test
    void testParseSimpleToken_TrimTrailingSpaces() throws IOException {
        lexer.ignoreSurroundingSpaces = true;
        lexer.parseSimpleToken(token, ' '); // Simulate space
        lexer.parseSimpleToken(token, 'a'); // Simulate character after space
        lexer.parseSimpleToken(token, ' '); // Simulate trailing space
        assertEquals("a", token.content.toString());
    }
}
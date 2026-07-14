package org.apache.commons.csv;

import org.junit.jupiter.api.Test;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class LexerTest {

    @Test
    void testParseSimpleToken_EndOfRecord() throws IOException {
        Token token = new Token();
        Lexer lexer = new Lexer(CSVFormat.DEFAULT, new ExtendedBufferedReader(new StringReader("line1\n")));
        lexer.parseSimpleToken(token, '\n');
        assertEquals(Token.Type.EORECORD, token.type);
    }

    @Test
    void testParseSimpleToken_EndOfFile() throws IOException {
        Token token = new Token();
        Lexer lexer = new Lexer(CSVFormat.DEFAULT, new ExtendedBufferedReader(new StringReader("")));
        lexer.parseSimpleToken(token, -1); // -1 represents EOF
        assertEquals(Token.Type.EOF, token.type);
        assertTrue(token.isReady);
    }

    @Test
    void testParseSimpleToken_Delimiter() throws IOException {
        Token token = new Token();
        Lexer lexer = new Lexer(CSVFormat.DEFAULT, new ExtendedBufferedReader(new StringReader(",")));
        lexer.parseSimpleToken(token, ',');
        assertEquals(Token.Type.TOKEN, token.type);
    }

    @Test
    void testParseSimpleToken_EscapeCharacter() throws IOException {
        Token token = new Token();
        Lexer lexer = new Lexer(CSVFormat.DEFAULT, new ExtendedBufferedReader(new StringReader("\\n")));
        lexer.parseSimpleToken(token, '\\');
        assertEquals(Token.Type.TOKEN, token.type);
        // Additional assertions can be made to check the content of the token
    }

    @Test
    void testParseSimpleToken_NormalCharacter() throws IOException {
        Token token = new Token();
        Lexer lexer = new Lexer(CSVFormat.DEFAULT, new ExtendedBufferedReader(new StringReader("a")));
        lexer.parseSimpleToken(token, 'a');
        assertEquals(Token.Type.TOKEN, token.type);
        assertEquals("a", token.content.toString());
    }
}
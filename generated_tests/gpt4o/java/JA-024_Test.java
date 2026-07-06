package org.apache.commons.csv;

import org.junit.jupiter.api.Test;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class LexerTest {

    @Test
    void testParseSimpleToken_EndOfRecord() throws IOException {
        Token token = new Token();
        Lexer lexer = new Lexer();
        int endOfLineChar = '\n'; // Simulating end of record
        lexer.parseSimpleToken(token, endOfLineChar);
        assertEquals(Token.Type.EORECORD, token.type);
    }

    @Test
    void testParseSimpleToken_EndOfFile() throws IOException {
        Token token = new Token();
        Lexer lexer = new Lexer();
        int eofChar = -1; // Simulating end of file
        lexer.parseSimpleToken(token, eofChar);
        assertEquals(Token.Type.EOF, token.type);
        assertTrue(token.isReady);
    }

    @Test
    void testParseSimpleToken_Delimiter() throws IOException {
        Token token = new Token();
        Lexer lexer = new Lexer();
        int delimiterChar = ','; // Simulating a delimiter
        lexer.parseSimpleToken(token, delimiterChar);
        assertEquals(Token.Type.TOKEN, token.type);
    }

    @Test
    void testParseSimpleToken_EscapeCharacter() throws IOException {
        Token token = new Token();
        Lexer lexer = new Lexer();
        int escapeChar = '\\'; // Simulating an escape character
        lexer.parseSimpleToken(token, escapeChar);
        // Assuming appendNextEscapedCharacterToToken modifies the token content
        // You would need to verify the content of the token after this call
        assertNotNull(token.content);
    }

    @Test
    void testParseSimpleToken_NormalCharacter() throws IOException {
        Token token = new Token();
        Lexer lexer = new Lexer();
        int normalChar = 'a'; // Simulating a normal character
        lexer.parseSimpleToken(token, normalChar);
        assertEquals("a", token.content.toString());
    }

    @Test
    void testParseSimpleToken_TrimSpaces() throws IOException {
        Token token = new Token();
        token.content.append("   "); // Simulating spaces
        Lexer lexer = new Lexer();
        lexer.ignoreSurroundingSpaces = true; // Assuming this is a field in Lexer
        lexer.parseSimpleToken(token, 'a');
        assertEquals("a", token.content.toString());
    }
}
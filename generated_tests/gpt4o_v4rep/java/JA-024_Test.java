package org.apache.commons.csv;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LexerTest {

    @Test
    void testParseSimpleTokenEndOfRecord() throws Exception {
        Lexer instance = new Lexer(CSVFormat.DEFAULT, new ExtendedBufferedReader());
        Field ignoreSurroundingSpacesField = Lexer.class.getDeclaredField("ignoreSurroundingSpaces");
        ignoreSurroundingSpacesField.setAccessible(true);
        ignoreSurroundingSpacesField.set(instance, false);

        Token token = new Token();
        Method m = Lexer.class.getDeclaredMethod("parseSimpleToken", Token.class, int.class);
        m.setAccessible(true);

        Object result = m.invoke(instance, token, '\n');
        assertEquals(Token.Type.EORECORD, ((Token) result).type);
    }

    @Test
    void testParseSimpleTokenEndOfFile() throws Exception {
        Lexer instance = new Lexer(CSVFormat.DEFAULT, new ExtendedBufferedReader());
        Field ignoreSurroundingSpacesField = Lexer.class.getDeclaredField("ignoreSurroundingSpaces");
        ignoreSurroundingSpacesField.setAccessible(true);
        ignoreSurroundingSpacesField.set(instance, false);

        Token token = new Token();
        Method m = Lexer.class.getDeclaredMethod("parseSimpleToken", Token.class, int.class);
        m.setAccessible(true);

        Object result = m.invoke(instance, token, -1); // Simulate EOF
        assertEquals(Token.Type.EOF, ((Token) result).type);
        assertEquals(true, token.isReady);
    }

    @Test
    void testParseSimpleTokenDelimiter() throws Exception {
        Lexer instance = new Lexer(CSVFormat.DEFAULT, new ExtendedBufferedReader());
        Field ignoreSurroundingSpacesField = Lexer.class.getDeclaredField("ignoreSurroundingSpaces");
        ignoreSurroundingSpacesField.setAccessible(true);
        ignoreSurroundingSpacesField.set(instance, false);

        Token token = new Token();
        Method m = Lexer.class.getDeclaredMethod("parseSimpleToken", Token.class, int.class);
        m.setAccessible(true);

        Object result = m.invoke(instance, token, ','); // Simulate delimiter
        assertEquals(Token.Type.TOKEN, ((Token) result).type);
    }

    @Test
    void testParseSimpleTokenEscapeCharacter() throws Exception {
        Lexer instance = new Lexer(CSVFormat.DEFAULT, new ExtendedBufferedReader());
        Field ignoreSurroundingSpacesField = Lexer.class.getDeclaredField("ignoreSurroundingSpaces");
        ignoreSurroundingSpacesField.setAccessible(true);
        ignoreSurroundingSpacesField.set(instance, false);

        Token token = new Token();
        Method m = Lexer.class.getDeclaredMethod("parseSimpleToken", Token.class, int.class);
        m.setAccessible(true);

        // Simulate escape character
        Object result = m.invoke(instance, token, '\\');
        assertEquals(Token.Type.TOKEN, ((Token) result).type);
        // Further assertions can be added to check the content of the token
    }

    @Test
    void testParseSimpleTokenWithSurroundingSpaces() throws Exception {
        Lexer instance = new Lexer(CSVFormat.DEFAULT, new ExtendedBufferedReader());
        Field ignoreSurroundingSpacesField = Lexer.class.getDeclaredField("ignoreSurroundingSpaces");
        ignoreSurroundingSpacesField.setAccessible(true);
        ignoreSurroundingSpacesField.set(instance, true);

        Token token = new Token();
        Method m = Lexer.class.getDeclaredMethod("parseSimpleToken", Token.class, int.class);
        m.setAccessible(true);

        Object result = m.invoke(instance, token, 'a'); // Simulate normal character
        assertEquals(Token.Type.TOKEN, ((Token) result).type);
        // Further assertions can be added to check the content of the token after trimming
    }

    @Test
    void testParseSimpleTokenThrowsIOException() throws Exception {
        Lexer instance = new Lexer(CSVFormat.DEFAULT, new ExtendedBufferedReader());
        Field ignoreSurroundingSpacesField = Lexer.class.getDeclaredField("ignoreSurroundingSpaces");
        ignoreSurroundingSpacesField.setAccessible(true);
        ignoreSurroundingSpacesField.set(instance, false);

        Token token = new Token();
        Method m = Lexer.class.getDeclaredMethod("parseSimpleToken", Token.class, int.class);
        m.setAccessible(true);

        assertThrows(IOException.class, () -> {
            m.invoke(instance, token, -2); // Simulate an invalid read
        });
    }
}
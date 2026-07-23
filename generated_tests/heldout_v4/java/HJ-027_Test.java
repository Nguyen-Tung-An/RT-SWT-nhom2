package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TokeniserStateTest {

    @Test
    void testReadWithDash() {
        Tokeniser tokeniser = new Tokeniser();
        CharacterReader reader = new CharacterReader("-".toCharArray());
        TokeniserState state = new TokeniserState();
        
        state.read(tokeniser, reader);
        
        assertEquals('-', tokeniser.getLastEmitted());
        assertEquals(TokeniserState.ScriptDataDoubleEscapedDash, tokeniser.getCurrentTransition());
    }

    @Test
    void testReadWithLessThanSign() {
        Tokeniser tokeniser = new Tokeniser();
        CharacterReader reader = new CharacterReader("<".toCharArray());
        TokeniserState state = new TokeniserState();
        
        state.read(tokeniser, reader);
        
        assertEquals('<', tokeniser.getLastEmitted());
        assertEquals(TokeniserState.ScriptDataDoubleEscapedLessthanSign, tokeniser.getCurrentTransition());
    }

    @Test
    void testReadWithNullChar() {
        Tokeniser tokeniser = new Tokeniser();
        CharacterReader reader = new CharacterReader(new char[]{Tokeniser.nullChar});
        TokeniserState state = new TokeniserState();
        
        state.read(tokeniser, reader);
        
        assertTrue(tokeniser.hasError());
        assertEquals(Tokeniser.replacementChar, tokeniser.getLastEmitted());
    }

    @Test
    void testReadWithEOF() {
        Tokeniser tokeniser = new Tokeniser();
        CharacterReader reader = new CharacterReader(new char[]{Tokeniser.eof});
        TokeniserState state = new TokeniserState();
        
        state.read(tokeniser, reader);
        
        assertTrue(tokeniser.hasEofError());
        assertEquals(TokeniserState.Data, tokeniser.getCurrentTransition());
    }

    @Test
    void testReadWithDefaultCase() {
        Tokeniser tokeniser = new Tokeniser();
        CharacterReader reader = new CharacterReader("Hello".toCharArray());
        TokeniserState state = new TokeniserState();
        
        state.read(tokeniser, reader);
        
        assertEquals("Hello", tokeniser.getLastEmitted());
    }
}
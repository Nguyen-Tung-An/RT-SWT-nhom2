package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TokeniserStateTest {

    @Test
    void testReadWhitespace() {
        Tokeniser tokeniser = new Tokeniser();
        CharacterReader reader = new CharacterReader(" ");
        TokeniserState state = new TokeniserState();
        state.read(tokeniser, reader);
        assertEquals(TokeniserState.BeforeDoctypePublicIdentifier, tokeniser.getCurrentState());
    }

    @Test
    void testReadDoubleQuote() {
        Tokeniser tokeniser = new Tokeniser();
        CharacterReader reader = new CharacterReader("\"");
        TokeniserState state = new TokeniserState();
        state.read(tokeniser, reader);
        assertEquals(TokeniserState.DoctypePublicIdentifier_doubleQuoted, tokeniser.getCurrentState());
        assertTrue(tokeniser.hasError());
    }

    @Test
    void testReadSingleQuote() {
        Tokeniser tokeniser = new Tokeniser();
        CharacterReader reader = new CharacterReader("'");
        TokeniserState state = new TokeniserState();
        state.read(tokeniser, reader);
        assertEquals(TokeniserState.DoctypePublicIdentifier_singleQuoted, tokeniser.getCurrentState());
        assertTrue(tokeniser.hasError());
    }

    @Test
    void testReadGreaterThan() {
        Tokeniser tokeniser = new Tokeniser();
        CharacterReader reader = new CharacterReader(">");
        TokeniserState state = new TokeniserState();
        state.read(tokeniser, reader);
        assertEquals(TokeniserState.Data, tokeniser.getCurrentState());
        assertTrue(tokeniser.hasError());
        assertTrue(tokeniser.doctypePending.forceQuirks);
    }

    @Test
    void testReadEOF() {
        Tokeniser tokeniser = new Tokeniser();
        CharacterReader reader = new CharacterReader(CharacterReader.EOF);
        TokeniserState state = new TokeniserState();
        state.read(tokeniser, reader);
        assertEquals(TokeniserState.Data, tokeniser.getCurrentState());
        assertTrue(tokeniser.hasError());
        assertTrue(tokeniser.doctypePending.forceQuirks);
    }

    @Test
    void testReadBogusCharacter() {
        Tokeniser tokeniser = new Tokeniser();
        CharacterReader reader = new CharacterReader("x");
        TokeniserState state = new TokeniserState();
        state.read(tokeniser, reader);
        assertEquals(TokeniserState.BogusDoctype, tokeniser.getCurrentState());
        assertTrue(tokeniser.hasError());
        assertTrue(tokeniser.doctypePending.forceQuirks);
    }
}
package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class TokeniserStateTest {

    @Test
    void testRead_TabCharacter() {
        Tokeniser tokeniser = mock(Tokeniser.class);
        CharacterReader reader = mock(CharacterReader.class);
        when(reader.consume()).thenReturn('\t');
        
        TokeniserState state = new TokeniserState();
        state.read(tokeniser, reader);
        
        verify(tokeniser).transition(TokeniserState.BeforeDoctypePublicIdentifier);
    }

    @Test
    void testRead_NewLineCharacter() {
        Tokeniser tokeniser = mock(Tokeniser.class);
        CharacterReader reader = mock(CharacterReader.class);
        when(reader.consume()).thenReturn('\n');
        
        TokeniserState state = new TokeniserState();
        state.read(tokeniser, reader);
        
        verify(tokeniser).transition(TokeniserState.BeforeDoctypePublicIdentifier);
    }

    @Test
    void testRead_CarriageReturnCharacter() {
        Tokeniser tokeniser = mock(Tokeniser.class);
        CharacterReader reader = mock(CharacterReader.class);
        when(reader.consume()).thenReturn('\r');
        
        TokeniserState state = new TokeniserState();
        state.read(tokeniser, reader);
        
        verify(tokeniser).transition(TokeniserState.BeforeDoctypePublicIdentifier);
    }

    @Test
    void testRead_FormFeedCharacter() {
        Tokeniser tokeniser = mock(Tokeniser.class);
        CharacterReader reader = mock(CharacterReader.class);
        when(reader.consume()).thenReturn('\f');
        
        TokeniserState state = new TokeniserState();
        state.read(tokeniser, reader);
        
        verify(tokeniser).transition(TokeniserState.BeforeDoctypePublicIdentifier);
    }

    @Test
    void testRead_SpaceCharacter() {
        Tokeniser tokeniser = mock(Tokeniser.class);
        CharacterReader reader = mock(CharacterReader.class);
        when(reader.consume()).thenReturn(' ');
        
        TokeniserState state = new TokeniserState();
        state.read(tokeniser, reader);
        
        verify(tokeniser).transition(TokeniserState.BeforeDoctypePublicIdentifier);
    }

    @Test
    void testRead_DoubleQuoteCharacter() {
        Tokeniser tokeniser = mock(Tokeniser.class);
        CharacterReader reader = mock(CharacterReader.class);
        when(reader.consume()).thenReturn('"');
        
        TokeniserState state = new TokeniserState();
        state.read(tokeniser, reader);
        
        verify(tokeniser).error(state);
        verify(tokeniser).transition(TokeniserState.DoctypePublicIdentifier_doubleQuoted);
    }

    @Test
    void testRead_SingleQuoteCharacter() {
        Tokeniser tokeniser = mock(Tokeniser.class);
        CharacterReader reader = mock(CharacterReader.class);
        when(reader.consume()).thenReturn('\'');
        
        TokeniserState state = new TokeniserState();
        state.read(tokeniser, reader);
        
        verify(tokeniser).error(state);
        verify(tokeniser).transition(TokeniserState.DoctypePublicIdentifier_singleQuoted);
    }

    @Test
    void testRead_GreaterThanCharacter() {
        Tokeniser tokeniser = mock(Tokeniser.class);
        CharacterReader reader = mock(CharacterReader.class);
        when(reader.consume()).thenReturn('>');
        
        TokeniserState state = new TokeniserState();
        state.read(tokeniser, reader);
        
        verify(tokeniser).error(state);
        verify(tokeniser).doctypePending.forceQuirks = true;
        verify(tokeniser).emitDoctypePending();
        verify(tokeniser).transition(TokeniserState.Data);
    }

    @Test
    void testRead_EndOfFile() {
        Tokeniser tokeniser = mock(Tokeniser.class);
        CharacterReader reader = mock(CharacterReader.class);
        when(reader.consume()).thenReturn(Tokeniser.eof);
        
        TokeniserState state = new TokeniserState();
        state.read(tokeniser, reader);
        
        verify(tokeniser).eofError(state);
        verify(tokeniser).doctypePending.forceQuirks = true;
        verify(tokeniser).emitDoctypePending();
        verify(tokeniser).transition(TokeniserState.Data);
    }

    @Test
    void testRead_DefaultCase() {
        Tokeniser tokeniser = mock(Tokeniser.class);
        CharacterReader reader = mock(CharacterReader.class);
        when(reader.consume()).thenReturn('a');
        
        TokeniserState state = new TokeniserState();
        state.read(tokeniser, reader);
        
        verify(tokeniser).error(state);
        verify(tokeniser).doctypePending.forceQuirks = true;
        verify(tokeniser).transition(TokeniserState.BogusDoctype);
    }
}
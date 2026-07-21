package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class TokeniserStateTest {

    @Test
    void testRead_WithDash() {
        Tokeniser tokeniser = mock(Tokeniser.class);
        CharacterReader reader = mock(CharacterReader.class);
        TokeniserState state = new TokeniserState();

        when(reader.current()).thenReturn('-');
        state.read(tokeniser, reader);

        verify(tokeniser).emit('-');
        verify(tokeniser).advanceTransition(TokeniserState.ScriptDataDoubleEscapedDash);
    }

    @Test
    void testRead_WithLessThanSign() {
        Tokeniser tokeniser = mock(Tokeniser.class);
        CharacterReader reader = mock(CharacterReader.class);
        TokeniserState state = new TokeniserState();

        when(reader.current()).thenReturn('<');
        state.read(tokeniser, reader);

        verify(tokeniser).emit('<');
        verify(tokeniser).advanceTransition(TokeniserState.ScriptDataDoubleEscapedLessthanSign);
    }

    @Test
    void testRead_WithNullChar() {
        Tokeniser tokeniser = mock(Tokeniser.class);
        CharacterReader reader = mock(CharacterReader.class);
        TokeniserState state = new TokeniserState();

        when(reader.current()).thenReturn(TokeniserState.nullChar);
        state.read(tokeniser, reader);

        verify(tokeniser).error(state);
        verify(reader).advance();
        verify(tokeniser).emit(TokeniserState.replacementChar);
    }

    @Test
    void testRead_WithEOF() {
        Tokeniser tokeniser = mock(Tokeniser.class);
        CharacterReader reader = mock(CharacterReader.class);
        TokeniserState state = new TokeniserState();

        when(reader.current()).thenReturn(TokeniserState.eof);
        state.read(tokeniser, reader);

        verify(tokeniser).eofError(state);
        verify(tokeniser).transition(TokeniserState.Data);
    }

    @Test
    void testRead_WithDefaultCase() {
        Tokeniser tokeniser = mock(Tokeniser.class);
        CharacterReader reader = mock(CharacterReader.class);
        TokeniserState state = new TokeniserState();

        when(reader.current()).thenReturn('a');
        when(reader.consumeToAny('-', '<', TokeniserState.nullChar)).thenReturn("data");
        state.read(tokeniser, reader);

        verify(tokeniser).emit("data");
    }
}
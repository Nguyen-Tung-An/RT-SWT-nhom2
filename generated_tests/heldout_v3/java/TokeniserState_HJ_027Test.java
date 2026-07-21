import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TokeniserStateTest {

    @Test
    void testReadWithDash() {
        Tokeniser tokeniser = new Tokeniser();
        CharacterReader reader = new CharacterReader("-abc");
        TokeniserState state = new TokeniserState();
        state.read(tokeniser, reader);
        assertEquals('-', tokeniser.getLastEmittedChar());
    }

    @Test
    void testReadWithLessThan() {
        Tokeniser tokeniser = new Tokeniser();
        CharacterReader reader = new CharacterReader("<abc");
        TokeniserState state = new TokeniserState();
        state.read(tokeniser, reader);
        assertEquals('<', tokeniser.getLastEmittedChar());
    }

    @Test
    void testReadWithNullChar() {
        Tokeniser tokeniser = new Tokeniser();
        CharacterReader reader = new CharacterReader("\0abc");
        TokeniserState state = new TokeniserState();
        state.read(tokeniser, reader);
        assertEquals('\uFFFD', tokeniser.getLastEmittedChar()); // Assuming replacementChar is '\uFFFD'
    }

    @Test
    void testReadWithEOF() {
        Tokeniser tokeniser = new Tokeniser();
        CharacterReader reader = new CharacterReader("");
        TokeniserState state = new TokeniserState();
        state.read(tokeniser, reader);
        assertEquals(TokeniserState.Data, tokeniser.getCurrentState()); // Assuming Data is the expected state after EOF
    }

    @Test
    void testReadWithDefaultCase() {
        Tokeniser tokeniser = new Tokeniser();
        CharacterReader reader = new CharacterReader("abc-def<ghi");
        TokeniserState state = new TokeniserState();
        state.read(tokeniser, reader);
        assertEquals("abc", tokeniser.getLastEmittedData()); // Assuming consumeToAny emits "abc"
    }
}
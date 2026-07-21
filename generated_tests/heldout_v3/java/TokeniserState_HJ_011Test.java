import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TokeniserStateTest {
    private TokeniserState tokeniserState;
    private Tokeniser tokeniser;
    private CharacterReader characterReader;

    @BeforeEach
    void setUp() {
        tokeniserState = new TokeniserState();
        tokeniser = new Tokeniser();
    }

    @Test
    void testReadWhitespace() {
        characterReader = new CharacterReader(" ");
        tokeniserState.read(tokeniser, characterReader);
        assertEquals(TokeniserState.BeforeDoctypePublicIdentifier, tokeniser.getCurrentState());
    }

    @Test
    void testReadDoubleQuote() {
        characterReader = new CharacterReader("\"");
        tokeniserState.read(tokeniser, characterReader);
        assertEquals(TokeniserState.DoctypePublicIdentifier_doubleQuoted, tokeniser.getCurrentState());
        assertEquals("", tokeniser.getPublicId());
    }

    @Test
    void testReadSingleQuote() {
        characterReader = new CharacterReader("'");
        tokeniserState.read(tokeniser, characterReader);
        assertEquals(TokeniserState.DoctypePublicIdentifier_singleQuoted, tokeniser.getCurrentState());
        assertEquals("", tokeniser.getPublicId());
    }

    @Test
    void testReadGreaterThan() {
        characterReader = new CharacterReader(">");
        tokeniserState.read(tokeniser, characterReader);
        assertEquals(TokeniserState.Data, tokeniser.getCurrentState());
        assertEquals(true, tokeniser.doctypePending.forceQuirks);
    }

    @Test
    void testReadEOF() {
        characterReader = new CharacterReader(CharacterReader.EOF);
        tokeniserState.read(tokeniser, characterReader);
        assertEquals(TokeniserState.Data, tokeniser.getCurrentState());
        assertEquals(true, tokeniser.doctypePending.forceQuirks);
    }

    @Test
    void testReadInvalidCharacter() {
        characterReader = new CharacterReader("x");
        tokeniserState.read(tokeniser, characterReader);
        assertEquals(TokeniserState.BogusDoctype, tokeniser.getCurrentState());
        assertEquals(true, tokeniser.doctypePending.forceQuirks);
    }
}
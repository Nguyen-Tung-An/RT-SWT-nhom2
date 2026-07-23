import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.PatternOptionBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatternOptionBuilderTest {

    @Test
    void testParsePatternWithSingleOption() {
        Options options = PatternOptionBuilder.parsePattern("a");
        assertEquals(1, options.getOptions().size());
        Option option = options.getOption("a");
        assertFalse(option.hasArg());
        assertFalse(option.isRequired());
        assertNull(option.getType());
    }

    @Test
    void testParsePatternWithRequiredOption() {
        Options options = PatternOptionBuilder.parsePattern("!b");
        assertEquals(1, options.getOptions().size());
        Option option = options.getOption("b");
        assertFalse(option.hasArg());
        assertTrue(option.isRequired());
        assertNull(option.getType());
    }

    @Test
    void testParsePatternWithOptionAndArgument() {
        Options options = PatternOptionBuilder.parsePattern("c:");
        assertEquals(1, options.getOptions().size());
        Option option = options.getOption("c");
        assertTrue(option.hasArg());
        assertFalse(option.isRequired());
        assertNull(option.getType());
    }

    @Test
    void testParsePatternWithMultipleOptions() {
        Options options = PatternOptionBuilder.parsePattern("a!b:c:");
        assertEquals(3, options.getOptions().size());

        Option optionA = options.getOption("a");
        assertFalse(optionA.hasArg());
        assertTrue(optionA.isRequired());

        Option optionB = options.getOption("b");
        assertFalse(optionB.hasArg());
        assertFalse(optionB.isRequired());

        Option optionC = options.getOption("c");
        assertTrue(optionC.hasArg());
        assertFalse(optionC.isRequired());
    }

    @Test
    void testParsePatternWithInvalidCharacter() {
        Options options = PatternOptionBuilder.parsePattern("d@");
        assertEquals(1, options.getOptions().size());
        Option option = options.getOption("d");
        assertTrue(option.hasArg());
        assertFalse(option.isRequired());
        assertNull(option.getType());
    }

    @Test
    void testParsePatternWithEmptyString() {
        Options options = PatternOptionBuilder.parsePattern("");
        assertEquals(0, options.getOptions().size());
    }
}
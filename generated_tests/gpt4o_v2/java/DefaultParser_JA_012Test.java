import org.apache.commons.cli.AmbiguousOptionException;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.ParseException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DefaultParserTest {

    private DefaultParser parser;

    @BeforeEach
    void setUp() {
        parser = new DefaultParser();
    }

    @Test
    void testHandleLongOptionWithEqual_ValidOptionWithArgument() throws Exception {
        // Setup
        String token = "option=value";
        parser.getOptions().addOption(Option.builder("option").hasArg().build());
        
        // Execute
        parser.handleLongOptionWithEqual(token);
        
        // Assert
        // Check the state of the parser or any observable effect
        // (Assuming there's a way to verify the state after processing)
    }

    @Test
    void testHandleLongOptionWithEqual_UnknownOption() {
        // Setup
        String token = "unknown=value";
        
        // Execute & Assert
        assertThrows(ParseException.class, () -> {
            parser.handleLongOptionWithEqual(token);
        });
    }

    @Test
    void testHandleLongOptionWithEqual_AmbiguousOption() {
        // Setup
        String token = "option=value";
        parser.getOptions().addOption(Option.builder("option").hasArg().build());
        parser.getOptions().addOption(Option.builder("opt").hasArg().build());
        
        // Execute & Assert
        assertThrows(AmbiguousOptionException.class, () -> {
            parser.handleLongOptionWithEqual(token);
        });
    }

    @Test
    void testHandleLongOptionWithEqual_NoArgument() {
        // Setup
        String token = "option=";
        parser.getOptions().addOption(Option.builder("option").hasArg().build());
        
        // Execute
        parser.handleLongOptionWithEqual(token);
        
        // Assert
        // Check the state of the parser or any observable effect
        // (Assuming there's a way to verify the state after processing)
    }

    @Test
    void testHandleLongOptionWithEqual_EmptyToken() {
        // Setup
        String token = "";
        
        // Execute & Assert
        assertThrows(ParseException.class, () -> {
            parser.handleLongOptionWithEqual(token);
        });
    }
}
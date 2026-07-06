package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NonOptionActionTest {

    private final NonOptionAction nonOptionAction = new NonOptionAction();

    @Test
    void testIsShortOption_NullToken() {
        assertFalse(nonOptionAction.isShortOption(null));
    }

    @Test
    void testIsShortOption_EmptyToken() {
        assertFalse(nonOptionAction.isShortOption(""));
    }

    @Test
    void testIsShortOption_SingleDash() {
        assertFalse(nonOptionAction.isShortOption("-"));
    }

    @Test
    void testIsShortOption_ValidShortOption() {
        // Assuming options.hasShortOption("S") returns true
        assertTrue(nonOptionAction.isShortOption("-S"));
    }

    @Test
    void testIsShortOption_ValidShortOptionWithValue() {
        // Assuming options.hasShortOption("S") returns true
        assertTrue(nonOptionAction.isShortOption("-S=value"));
    }

    @Test
    void testIsShortOption_ConcatenatedShortOptions() {
        // Assuming options.hasShortOption("S") returns true
        assertTrue(nonOptionAction.isShortOption("-SV"));
    }

    @Test
    void testIsShortOption_ConcatenatedShortOptionsWithValues() {
        // Assuming options.hasShortOption("S") returns true
        assertTrue(nonOptionAction.isShortOption("-SV1=V2"));
    }

    @Test
    void testIsShortOption_InvalidShortOption() {
        // Assuming options.hasShortOption("X") returns false
        assertFalse(nonOptionAction.isShortOption("-X"));
    }

    @Test
    void testIsShortOption_EmptyAfterDash() {
        assertFalse(nonOptionAction.isShortOption("-"));
    }
}
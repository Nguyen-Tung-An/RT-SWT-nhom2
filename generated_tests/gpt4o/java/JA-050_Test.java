package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OptionComparatorTest {

    private final OptionComparator optionComparator = new OptionComparator();

    @Test
    void testEquals_BothNull() {
        assertTrue(optionComparator.equals(null, null));
    }

    @Test
    void testEquals_FirstNull() {
        assertFalse(optionComparator.equals(null, "test"));
    }

    @Test
    void testEquals_SecondNull() {
        assertFalse(optionComparator.equals("test", null));
    }

    @Test
    void testEquals_SameString() {
        assertTrue(optionComparator.equals("test", "test"));
    }

    @Test
    void testEquals_DifferentString() {
        assertFalse(optionComparator.equals("test", "TEST"));
    }

    @Test
    void testEquals_DifferentLength() {
        assertFalse(optionComparator.equals("test", "test1"));
    }

    @Test
    void testEquals_CharSequenceDifferent() {
        assertFalse(optionComparator.equals(new StringBuilder("test"), new StringBuilder("test1")));
    }

    @Test
    void testEquals_CharSequenceSame() {
        assertTrue(optionComparator.equals(new StringBuilder("test"), new StringBuilder("test")));
    }
}
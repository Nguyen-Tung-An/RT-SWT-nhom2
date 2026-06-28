package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DefaultParserTest {
    @Test
    void testToBooleanObject_ValueIsNull_TrueValueIsNull() {
        assertEquals(Boolean.TRUE, DefaultParser.toBooleanObject(null, null, 0, 1));
    }

    @Test
    void testToBooleanObject_ValueIsNull_FalseValueIsNull() {
        assertEquals(Boolean.FALSE, DefaultParser.toBooleanObject(null, 0, null, 1));
    }

    @Test
    void testToBooleanObject_ValueIsNull_NullValueIsNull() {
        assertNull(DefaultParser.toBooleanObject(null, 0, 1, null));
    }

    @Test
    void testToBooleanObject_ValueEqualsTrueValue() {
        assertEquals(Boolean.TRUE, DefaultParser.toBooleanObject(1, 1, 0, 2));
    }

    @Test
    void testToBooleanObject_ValueEqualsFalseValue() {
        assertEquals(Boolean.FALSE, DefaultParser.toBooleanObject(0, 1, 0, 2));
    }

    @Test
    void testToBooleanObject_ValueEqualsNullValue() {
        assertNull(DefaultParser.toBooleanObject(2, 1, 0, 2));
    }

    @Test
    void testToBooleanObject_ValueDoesNotMatchAnySpecifiedValue() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            DefaultParser.toBooleanObject(3, 1, 0, 2);
        });
        assertEquals("The Integer did not match any specified value", exception.getMessage());
    }
}
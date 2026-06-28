package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DefaultParserTest {
    
    @Test
    void testInsert_NullArray() {
        assertNull(DefaultParser.insert(0, null, (short) 1, (short) 2));
    }

    @Test
    void testInsert_EmptyValues() {
        short[] array = {1, 2, 3};
        short[] result = DefaultParser.insert(1, array);
        assertArrayEquals(array, result);
    }

    @Test
    void testInsert_ValidInsertion() {
        short[] array = {1, 2, 3};
        short[] result = DefaultParser.insert(1, array, (short) 4, (short) 5);
        assertArrayEquals(new short[]{1, 4, 5, 2, 3}, result);
    }

    @Test
    void testInsert_IndexOutOfBounds_Negative() {
        short[] array = {1, 2, 3};
        assertThrows(IndexOutOfBoundsException.class, () -> {
            DefaultParser.insert(-1, array, (short) 4);
        });
    }

    @Test
    void testInsert_IndexOutOfBounds_TooHigh() {
        short[] array = {1, 2, 3};
        assertThrows(IndexOutOfBoundsException.class, () -> {
            DefaultParser.insert(4, array, (short) 4);
        });
    }

    @Test
    void testInsert_InsertionAtStart() {
        short[] array = {1, 2, 3};
        short[] result = DefaultParser.insert(0, array, (short) 4);
        assertArrayEquals(new short[]{4, 1, 2, 3}, result);
    }

    @Test
    void testInsert_InsertionAtEnd() {
        short[] array = {1, 2, 3};
        short[] result = DefaultParser.insert(3, array, (short) 4);
        assertArrayEquals(new short[]{1, 2, 3, 4}, result);
    }
}
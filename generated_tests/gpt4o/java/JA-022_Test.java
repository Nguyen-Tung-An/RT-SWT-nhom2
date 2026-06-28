package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DefaultParserTest {
    
    @Test
    void testIndexOf_EmptyArray() {
        assertEquals(DefaultParser.INDEX_NOT_FOUND, DefaultParser.indexOf(new Object[]{}, new Object(), 0));
    }

    @Test
    void testIndexOf_NullObjectToFind() {
        Object[] array = {1, 2, null, 4};
        assertEquals(2, DefaultParser.indexOf(array, null, 0));
    }

    @Test
    void testIndexOf_ObjectFound() {
        Object[] array = {1, 2, 3, 4};
        assertEquals(2, DefaultParser.indexOf(array, 3, 0));
    }

    @Test
    void testIndexOf_ObjectNotFound() {
        Object[] array = {1, 2, 3, 4};
        assertEquals(DefaultParser.INDEX_NOT_FOUND, DefaultParser.indexOf(array, 5, 0));
    }

    @Test
    void testIndexOf_StartIndexOutOfBounds() {
        Object[] array = {1, 2, 3, 4};
        assertEquals(DefaultParser.INDEX_NOT_FOUND, DefaultParser.indexOf(array, 1, 5));
    }

    @Test
    void testIndexOf_NegativeStartIndex() {
        Object[] array = {1, 2, 3, 4};
        assertEquals(0, DefaultParser.indexOf(array, 1, -1));
    }
}
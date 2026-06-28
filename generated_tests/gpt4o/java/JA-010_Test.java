package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CommandLineTest {
    private static final int INDEX_NOT_FOUND = -1;

    @Test
    void testIndexOf_NaNValue() {
        double[] array = {1.0, 2.0, Double.NaN, 4.0};
        assertEquals(2, CommandLine.indexOf(array, Double.NaN, 0));
    }

    @Test
    void testIndexOf_EmptyArray() {
        double[] array = {};
        assertEquals(INDEX_NOT_FOUND, CommandLine.indexOf(array, 1.0, 0));
    }

    @Test
    void testIndexOf_ValueFound() {
        double[] array = {1.0, 2.0, 3.0, 4.0};
        assertEquals(2, CommandLine.indexOf(array, 3.0, 0));
    }

    @Test
    void testIndexOf_ValueNotFound() {
        double[] array = {1.0, 2.0, 3.0, 4.0};
        assertEquals(INDEX_NOT_FOUND, CommandLine.indexOf(array, 5.0, 0));
    }

    @Test
    void testIndexOf_StartIndex() {
        double[] array = {1.0, 2.0, 3.0, 4.0};
        assertEquals(3, CommandLine.indexOf(array, 4.0, 2));
    }

    @Test
    void testIndexOf_StartIndexOutOfBounds() {
        double[] array = {1.0, 2.0, 3.0, 4.0};
        assertEquals(INDEX_NOT_FOUND, CommandLine.indexOf(array, 1.0, 5));
    }
}
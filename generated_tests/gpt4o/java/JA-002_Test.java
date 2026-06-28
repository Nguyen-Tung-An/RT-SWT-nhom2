package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CommandLineTest {
    @Test
    void testConcat_EmptyArrays() {
        boolean[] result = CommandLine.concat(new boolean[0], new boolean[0]);
        assertArrayEquals(new boolean[0], result);
    }

    @Test
    void testConcat_SingleNonEmptyArray() {
        boolean[] result = CommandLine.concat(new boolean[]{true, false});
        assertArrayEquals(new boolean[]{true, false}, result);
    }

    @Test
    void testConcat_MultipleArrays() {
        boolean[] result = CommandLine.concat(new boolean[]{true}, new boolean[]{false, true}, new boolean[]{});
        assertArrayEquals(new boolean[]{true, false, true}, result);
    }

    @Test
    void testConcat_NullArray() {
        boolean[] result = CommandLine.concat(new boolean[]{true}, null, new boolean[]{false});
        assertArrayEquals(new boolean[]{true, false}, result);
    }

    @Test
    void testConcat_AllNullArrays() {
        boolean[] result = CommandLine.concat(null, null);
        assertArrayEquals(new boolean[0], result);
    }
}
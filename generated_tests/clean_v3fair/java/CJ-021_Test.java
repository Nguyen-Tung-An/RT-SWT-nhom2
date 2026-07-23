package org.apache.commons.collections4.bloomfilter;

import org.junit.jupiter.api.Test;

import java.util.function.LongPredicate;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayCountingBloomFilterTest {

    @Test
    void testProcessBitMaps_ConsumerReturnsTrue_AllBlocks() {
        ArrayCountingBloomFilter filter = new ArrayCountingBloomFilter(10);
        filter.cells = new long[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}; // All cells set
        LongPredicate consumer = value -> true; // Always returns true
        assertTrue(filter.processBitMaps(consumer));
    }

    @Test
    void testProcessBitMaps_ConsumerReturnsFalse_FirstBlock() {
        ArrayCountingBloomFilter filter = new ArrayCountingBloomFilter(10);
        filter.cells = new long[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}; // All cells set
        LongPredicate consumer = value -> false; // Always returns false
        assertFalse(filter.processBitMaps(consumer));
    }

    @Test
    void testProcessBitMaps_ConsumerReturnsFalse_FinalBlock() {
        ArrayCountingBloomFilter filter = new ArrayCountingBloomFilter(10);
        filter.cells = new long[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 0}; // Last cell not set
        LongPredicate consumer = value -> value == 0; // Returns false for non-zero values
        assertFalse(filter.processBitMaps(consumer));
    }

    @Test
    void testProcessBitMaps_NullConsumer() {
        ArrayCountingBloomFilter filter = new ArrayCountingBloomFilter(10);
        filter.cells = new long[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}; // All cells set
        assertThrows(NullPointerException.class, () -> filter.processBitMaps(null));
    }

    @Test
    void testProcessBitMaps_EmptyCells() {
        ArrayCountingBloomFilter filter = new ArrayCountingBloomFilter(10);
        filter.cells = new long[0]; // No cells
        LongPredicate consumer = value -> true; // Always returns true
        assertTrue(filter.processBitMaps(consumer));
    }
}
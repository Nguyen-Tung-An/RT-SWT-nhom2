package org.apache.commons.collections4.bloomfilter;

import org.junit.jupiter.api.Test;
import java.util.function.LongPredicate;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayCountingBloomFilterTest {

    @Test
    void testProcessBitMaps_ConsumerReturnsTrue_AllBlocksProcessed() {
        ArrayCountingBloomFilter filter = new ArrayCountingBloomFilter(10);
        filter.cells = new long[]{1, 0, 1, 0, 1, 0, 1, 0, 1, 0}; // Example cells
        LongPredicate consumer = value -> true; // Always returns true

        assertTrue(filter.processBitMaps(consumer));
    }

    @Test
    void testProcessBitMaps_ConsumerReturnsFalse_FirstBlockProcessed() {
        ArrayCountingBloomFilter filter = new ArrayCountingBloomFilter(10);
        filter.cells = new long[]{1, 0, 1, 0, 1, 0, 1, 0, 1, 0}; // Example cells
        LongPredicate consumer = value -> false; // Returns false immediately

        assertFalse(filter.processBitMaps(consumer));
    }

    @Test
    void testProcessBitMaps_ConsumerReturnsFalse_FinalBlockProcessed() {
        ArrayCountingBloomFilter filter = new ArrayCountingBloomFilter(10);
        filter.cells = new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 1}; // Example cells
        LongPredicate consumer = value -> {
            if (value == 0) return true; // Process all zeros
            return false; // Returns false for non-zero
        };

        assertFalse(filter.processBitMaps(consumer));
    }

    @Test
    void testProcessBitMaps_NullConsumer() {
        ArrayCountingBloomFilter filter = new ArrayCountingBloomFilter(10);
        filter.cells = new long[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}; // Example cells

        assertThrows(NullPointerException.class, () -> {
            filter.processBitMaps(null);
        });
    }
}
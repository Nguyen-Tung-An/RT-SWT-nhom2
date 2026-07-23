package org.apache.commons.collections4.bloomfilter;

import org.junit.jupiter.api.Test;

import java.util.function.LongPredicate;

import static org.junit.jupiter.api.Assertions.*;

class ArrayCountingBloomFilterTest {

    @Test
    void testProcessBitMapsWithAllZeros() {
        ArrayCountingBloomFilter instance = new ArrayCountingBloomFilter(new Shape(1));
        instance.cells = new long[]{0, 0, 0, 0}; // Assuming cells is accessible for testing
        boolean result = instance.processBitMaps(value -> value == 0);
        assertTrue(result);
    }

    @Test
    void testProcessBitMapsWithSomeOnes() {
        ArrayCountingBloomFilter instance = new ArrayCountingBloomFilter(new Shape(1));
        instance.cells = new long[]{1, 0, 0, 0}; // Assuming cells is accessible for testing
        boolean result = instance.processBitMaps(value -> value == 1);
        assertTrue(result);
    }

    @Test
    void testProcessBitMapsWithConsumerReturningFalse() {
        ArrayCountingBloomFilter instance = new ArrayCountingBloomFilter(new Shape(1));
        instance.cells = new long[]{1, 0, 0, 0}; // Assuming cells is accessible for testing
        boolean result = instance.processBitMaps(value -> false);
        assertFalse(result);
    }

    @Test
    void testProcessBitMapsWithFinalBlock() {
        ArrayCountingBloomFilter instance = new ArrayCountingBloomFilter(new Shape(1));
        instance.cells = new long[]{1, 1, 0, 0}; // Assuming cells is accessible for testing
        boolean result = instance.processBitMaps(value -> value == 3);
        assertTrue(result);
    }

    @Test
    void testProcessBitMapsWithNullConsumer() {
        ArrayCountingBloomFilter instance = new ArrayCountingBloomFilter(new Shape(1));
        instance.cells = new long[]{1, 0, 0, 0}; // Assuming cells is accessible for testing
        assertThrows(NullPointerException.class, () -> instance.processBitMaps(null));
    }
}
package org.jfree.data.statistics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HistogramBinTest {

    @Test
    void testEquals_NullObject() {
        HistogramBin bin = new HistogramBin(0, 1, 5);
        assertFalse(bin.equals(null));
    }

    @Test
    void testEquals_SameInstance() {
        HistogramBin bin = new HistogramBin(0, 1, 5);
        assertTrue(bin.equals(bin));
    }

    @Test
    void testEquals_DifferentClass() {
        HistogramBin bin = new HistogramBin(0, 1, 5);
        String notABin = "Not a HistogramBin";
        assertFalse(bin.equals(notABin));
    }

    @Test
    void testEquals_EqualBins() {
        HistogramBin bin1 = new HistogramBin(0, 1, 5);
        HistogramBin bin2 = new HistogramBin(0, 1, 5);
        assertTrue(bin1.equals(bin2));
    }

    @Test
    void testEquals_DifferentStartBoundary() {
        HistogramBin bin1 = new HistogramBin(0, 1, 5);
        HistogramBin bin2 = new HistogramBin(1, 1, 5);
        assertFalse(bin1.equals(bin2));
    }

    @Test
    void testEquals_DifferentEndBoundary() {
        HistogramBin bin1 = new HistogramBin(0, 1, 5);
        HistogramBin bin2 = new HistogramBin(0, 2, 5);
        assertFalse(bin1.equals(bin2));
    }

    @Test
    void testEquals_DifferentCount() {
        HistogramBin bin1 = new HistogramBin(0, 1, 5);
        HistogramBin bin2 = new HistogramBin(0, 1, 10);
        assertFalse(bin1.equals(bin2));
    }
}
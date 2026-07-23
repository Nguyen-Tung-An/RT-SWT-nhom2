package org.apache.commons.math4.legacy.linear;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.apache.commons.math4.legacy.linear.BiDiagonalTransformer;
import org.apache.commons.math4.legacy.linear.RealMatrix;

public class BiDiagonalTransformerTest {

    @Test
    void testGetB_CacheIsNull() {
        BiDiagonalTransformer transformer = new BiDiagonalTransformer(new double[]{1, 2}, new double[]{3});
        RealMatrix result = transformer.getB();
        assertNotNull(result);
        assertEquals(2, result.getRowDimension());
        assertEquals(2, result.getColumnDimension());
        assertEquals(1, result.getEntry(0, 0);
        assertEquals(2, result.getEntry(1, 1);
        assertEquals(3, result.getEntry(1, 0);
    }

    @Test
    void testGetB_CacheIsNotNull() {
        BiDiagonalTransformer transformer = new BiDiagonalTransformer(new double[]{1, 2}, new double[]{3});
        transformer.getB(); // First call to cache the result
        RealMatrix result = transformer.getB(); // Second call to check cache
        assertNotNull(result);
        assertEquals(2, result.getRowDimension());
        assertEquals(2, result.getColumnDimension());
        assertEquals(1, result.getEntry(0, 0));
        assertEquals(2, result.getEntry(1, 1));
        assertEquals(3, result.getEntry(1, 0));
    }

    @Test
    void testGetB_EmptyMainAndSecondary() {
        BiDiagonalTransformer transformer = new BiDiagonalTransformer(new double[]{}, new double[]{});
        RealMatrix result = transformer.getB();
        assertNotNull(result);
        assertEquals(0, result.getRowDimension());
        assertEquals(0, result.getColumnDimension());
    }

    @Test
    void testGetB_SingleElementMain() {
        BiDiagonalTransformer transformer = new BiDiagonalTransformer(new double[]{5}, new double[]{});
        RealMatrix result = transformer.getB();
        assertNotNull(result);
        assertEquals(1, result.getRowDimension());
        assertEquals(1, result.getColumnDimension());
        assertEquals(5, result.getEntry(0, 0));
    }

    @Test
    void testGetB_MultipleElements() {
        BiDiagonalTransformer transformer = new BiDiagonalTransformer(new double[]{1, 2, 3}, new double[]{4, 5});
        RealMatrix result = transformer.getB();
        assertNotNull(result);
        assertEquals(3, result.getRowDimension());
        assertEquals(3, result.getColumnDimension());
        assertEquals(1, result.getEntry(0, 0));
        assertEquals(2, result.getEntry(1, 1));
        assertEquals(3, result.getEntry(2, 2));
        assertEquals(4, result.getEntry(1, 0));
        assertEquals(5, result.getEntry(2, 1));
    }
}
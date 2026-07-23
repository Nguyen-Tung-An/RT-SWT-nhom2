package org.apache.commons.math4.legacy.linear;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BiDiagonalTransformerTest {

    @Test
    void testGetB_CachedBNotNull() {
        BiDiagonalTransformer transformer = new BiDiagonalTransformer(new double[]{1, 2}, new double[]{3});
        transformer.getB(); // First call to cache the result
        RealMatrix cachedB = transformer.getB(); // Second call should return cached value
        assertNotNull(cachedB);
    }

    @Test
    void testGetB_MatrixWithMoreColumns() {
        BiDiagonalTransformer transformer = new BiDiagonalTransformer(new double[]{1, 2, 3}, new double[]{4, 5});
        RealMatrix bMatrix = transformer.getB();
        assertEquals(3, bMatrix.getRowDimension());
        assertEquals(3, bMatrix.getColumnDimension());
        assertEquals(1, bMatrix.getEntry(0, 0));
        assertEquals(4, bMatrix.getEntry(0, 1));
        assertEquals(2, bMatrix.getEntry(1, 1));
        assertEquals(5, bMatrix.getEntry(1, 2));
        assertEquals(3, bMatrix.getEntry(2, 2));
    }

    @Test
    void testGetB_MatrixWithMoreRows() {
        BiDiagonalTransformer transformer = new BiDiagonalTransformer(new double[]{1, 2}, new double[]{3, 4});
        RealMatrix bMatrix = transformer.getB();
        assertEquals(2, bMatrix.getRowDimension());
        assertEquals(2, bMatrix.getColumnDimension());
        assertEquals(1, bMatrix.getEntry(0, 0));
        assertEquals(3, bMatrix.getEntry(0, 1));
        assertEquals(2, bMatrix.getEntry(1, 0));
        assertEquals(4, bMatrix.getEntry(1, 1));
    }

    @Test
    void testGetB_EmptyMainAndSecondary() {
        BiDiagonalTransformer transformer = new BiDiagonalTransformer(new double[]{}, new double[]{});
        RealMatrix bMatrix = transformer.getB();
        assertEquals(0, bMatrix.getRowDimension());
        assertEquals(0, bMatrix.getColumnDimension());
    }
}
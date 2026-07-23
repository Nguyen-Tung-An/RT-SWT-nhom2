package org.apache.commons.math4.legacy.linear;

import org.apache.commons.math4.legacy.linear.BiDiagonalTransformer;
import org.apache.commons.math4.legacy.linear.RealMatrix;
import org.apache.commons.math4.legacy.linear.MatrixUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BiDiagonalTransformerTest {

    @Test
    void testGetBWithSquareMatrix() {
        double[][] data = {{1, 0}, {0, 2}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        BiDiagonalTransformer transformer = new BiDiagonalTransformer(matrix);
        RealMatrix result = transformer.getB();
        double[][] expected = {{1, 0}, {0, 2}};
        assertArrayEquals(expected, result.getData());
    }

    @Test
    void testGetBWithRectangularMatrix() {
        double[][] data = {{1, 2, 3}, {0, 4, 5}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        BiDiagonalTransformer transformer = new BiDiagonalTransformer(matrix);
        RealMatrix result = transformer.getB();
        double[][] expected = {{1, 2, 0}, {0, 4, 5}};
        assertArrayEquals(expected, result.getData());
    }

    @Test
    void testGetBWithEmptyMatrix() {
        double[][] data = {};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        BiDiagonalTransformer transformer = new BiDiagonalTransformer(matrix);
        RealMatrix result = transformer.getB();
        double[][] expected = {};
        assertArrayEquals(expected, result.getData());
    }

    @Test
    void testGetBWithSingleElementMatrix() {
        double[][] data = {{42}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        BiDiagonalTransformer transformer = new BiDiagonalTransformer(matrix);
        RealMatrix result = transformer.getB();
        double[][] expected = {{42}};
        assertArrayEquals(expected, result.getData());
    }
}
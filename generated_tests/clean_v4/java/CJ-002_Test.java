package org.apache.commons.math4.legacy.linear;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BlockRealMatrixTest {

    @Test
    void testTransposeWithEmptyMatrix() {
        BlockRealMatrix matrix = new BlockRealMatrix(0, 0);
        BlockRealMatrix transposed = matrix.transpose();
        assertArrayEquals(new double[0][0], transposed.getData());
    }

    @Test
    void testTransposeWithSingleElementMatrix() {
        BlockRealMatrix matrix = new BlockRealMatrix(new double[][]{{1}});
        BlockRealMatrix transposed = matrix.transpose();
        assertArrayEquals(new double[][]{{1}}, transposed.getData());
    }

    @Test
    void testTransposeWithRowMatrix() {
        BlockRealMatrix matrix = new BlockRealMatrix(new double[][]{{1, 2, 3}});
        BlockRealMatrix transposed = matrix.transpose();
        assertArrayEquals(new double[][]{{1}, {2}, {3}}, transposed.getData());
    }

    @Test
    void testTransposeWithColumnMatrix() {
        BlockRealMatrix matrix = new BlockRealMatrix(new double[][]{{1}, {2}, {3}});
        BlockRealMatrix transposed = matrix.transpose();
        assertArrayEquals(new double[][]{{1, 2, 3}}, transposed.getData());
    }

    @Test
    void testTransposeWithSquareMatrix() {
        BlockRealMatrix matrix = new BlockRealMatrix(new double[][]{{1, 2}, {3, 4}});
        BlockRealMatrix transposed = matrix.transpose();
        assertArrayEquals(new double[][]{{1, 3}, {2, 4}}, transposed.getData());
    }

    @Test
    void testTransposeWithNonSquareMatrix() {
        BlockRealMatrix matrix = new BlockRealMatrix(new double[][]{{1, 2, 3}, {4, 5, 6}});
        BlockRealMatrix transposed = matrix.transpose();
        assertArrayEquals(new double[][]{{1, 4}, {2, 5}, {3, 6}}, transposed.getData());
    }
}
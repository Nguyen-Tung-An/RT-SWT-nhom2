import org.apache.commons.math4.legacy.linear.MatrixUtils;
import org.apache.commons.math4.legacy.linear.RealMatrix;
import org.apache.commons.math4.legacy.linear.Array2DRowRealMatrix;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatrixUtilsTest {

    @Test
    void testCheckSubMatrixIndexValid() {
        RealMatrix matrix = new Array2DRowRealMatrix(new double[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });
        MatrixUtils.checkSubMatrixIndex(matrix, 0, 2); // Valid indices
    }

    @Test
    void testCheckSubMatrixIndexRowOutOfBounds() {
        RealMatrix matrix = new Array2DRowRealMatrix(new double[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });
        Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            MatrixUtils.checkSubMatrixIndex(matrix, 3, 2); // Row index out of bounds
        });
        assertEquals("Row index out of bounds: 3", exception.getMessage());
    }

    @Test
    void testCheckSubMatrixIndexColumnOutOfBounds() {
        RealMatrix matrix = new Array2DRowRealMatrix(new double[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });
        Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            MatrixUtils.checkSubMatrixIndex(matrix, 1, 3); // Column index out of bounds
        });
        assertEquals("Column index out of bounds: 3", exception.getMessage());
    }

    @Test
    void testCheckSubMatrixIndexNegativeRow() {
        RealMatrix matrix = new Array2DRowRealMatrix(new double[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });
        Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            MatrixUtils.checkSubMatrixIndex(matrix, -1, 2); // Negative row index
        });
        assertEquals("Row index out of bounds: -1", exception.getMessage());
    }

    @Test
    void testCheckSubMatrixIndexNegativeColumn() {
        RealMatrix matrix = new Array2DRowRealMatrix(new double[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });
        Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            MatrixUtils.checkSubMatrixIndex(matrix, 1, -1); // Negative column index
        });
        assertEquals("Column index out of bounds: -1", exception.getMessage());
    }
}
import org.apache.commons.math4.legacy.linear.MatrixUtils;
import org.apache.commons.math4.legacy.linear.AnyMatrix;
import org.apache.commons.math4.legacy.exception.NoDataException;
import org.apache.commons.math4.legacy.exception.NullArgumentException;
import org.apache.commons.math4.legacy.exception.OutOfRangeException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixUtilsTest {

    @Test
    void testCheckSubMatrixIndex_NullSelectedRows() {
        AnyMatrix matrix = new AnyMatrix(3, 3); // Assuming AnyMatrix constructor takes rows and columns
        assertThrows(NullArgumentException.class, () -> {
            MatrixUtils.checkSubMatrixIndex(matrix, null, new int[]{0, 1});
        });
    }

    @Test
    void testCheckSubMatrixIndex_NullSelectedColumns() {
        AnyMatrix matrix = new AnyMatrix(3, 3);
        assertThrows(NullArgumentException.class, () -> {
            MatrixUtils.checkSubMatrixIndex(matrix, new int[]{0, 1}, null);
        });
    }

    @Test
    void testCheckSubMatrixIndex_EmptySelectedRows() {
        AnyMatrix matrix = new AnyMatrix(3, 3);
        assertThrows(NoDataException.class, () -> {
            MatrixUtils.checkSubMatrixIndex(matrix, new int[]{}, new int[]{0, 1});
        });
    }

    @Test
    void testCheckSubMatrixIndex_EmptySelectedColumns() {
        AnyMatrix matrix = new AnyMatrix(3, 3);
        assertThrows(NoDataException.class, () -> {
            MatrixUtils.checkSubMatrixIndex(matrix, new int[]{0, 1}, new int[]{});
        });
    }

    @Test
    void testCheckSubMatrixIndex_ValidIndices() {
        AnyMatrix matrix = new AnyMatrix(3, 3);
        assertDoesNotThrow(() -> {
            MatrixUtils.checkSubMatrixIndex(matrix, new int[]{0, 1}, new int[]{0, 1});
        });
    }

    @Test
    void testCheckSubMatrixIndex_InvalidRowIndex() {
        AnyMatrix matrix = new AnyMatrix(3, 3);
        assertThrows(OutOfRangeException.class, () -> {
            MatrixUtils.checkSubMatrixIndex(matrix, new int[]{-1}, new int[]{0});
        });
    }

    @Test
    void testCheckSubMatrixIndex_InvalidColumnIndex() {
        AnyMatrix matrix = new AnyMatrix(3, 3);
        assertThrows(OutOfRangeException.class, () -> {
            MatrixUtils.checkSubMatrixIndex(matrix, new int[]{0}, new int[]{3});
        });
    }
}
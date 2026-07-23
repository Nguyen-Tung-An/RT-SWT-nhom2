import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.jfree.chart.internal.ArrayUtils;

public class ArrayUtilsTest {

    @Test
    public void testEqualBothNull() {
        float[][] array1 = null;
        float[][] array2 = null;
        assertTrue(ArrayUtils.equal(array1, array2));
    }

    @Test
    public void testEqualFirstNull() {
        float[][] array1 = null;
        float[][] array2 = new float[][]{{1.0f, 2.0f}, {3.0f, 4.0f}};
        assertFalse(ArrayUtils.equal(array1, array2));
    }

    @Test
    public void testEqualSecondNull() {
        float[][] array1 = new float[][]{{1.0f, 2.0f}, {3.0f, 4.0f}};
        float[][] array2 = null;
        assertFalse(ArrayUtils.equal(array1, array2));
    }

    @Test
    public void testEqualDifferentLengths() {
        float[][] array1 = new float[][]{{1.0f, 2.0f}};
        float[][] array2 = new float[][]{{1.0f, 2.0f}, {3.0f, 4.0f}};
        assertFalse(ArrayUtils.equal(array1, array2));
    }

    @Test
    public void testEqualDifferentContents() {
        float[][] array1 = new float[][]{{1.0f, 2.0f}, {3.0f, 4.0f}};
        float[][] array2 = new float[][]{{1.0f, 2.0f}, {5.0f, 6.0f}};
        assertFalse(ArrayUtils.equal(array1, array2));
    }

    @Test
    public void testEqualSameContents() {
        float[][] array1 = new float[][]{{1.0f, 2.0f}, {3.0f, 4.0f}};
        float[][] array2 = new float[][]{{1.0f, 2.0f}, {3.0f, 4.0f}};
        assertTrue(ArrayUtils.equal(array1, array2));
    }

    @Test
    public void testEqualEmptyArrays() {
        float[][] array1 = new float[0][0];
        float[][] array2 = new float[0][0];
        assertTrue(ArrayUtils.equal(array1, array2));
    }

    @Test
    public void testEqualEmptyAndNonEmptyArray() {
        float[][] array1 = new float[0][0];
        float[][] array2 = new float[][]{{1.0f, 2.0f}};
        assertFalse(ArrayUtils.equal(array1, array2));
    }
}
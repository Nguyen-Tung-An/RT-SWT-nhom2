import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_047_Regression6 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3001");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 0L, (java.lang.Comparable) (-1L), (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3002");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) 'a', (java.lang.Comparable) 1.0d, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3003");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) (byte) 0, (java.lang.Comparable) 1.0f, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3004");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, 0.0d, (java.lang.Comparable) (short) -1, (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3005");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, (double) (-1.0f), (java.lang.Comparable) 'a', (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3006");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, (double) (short) 10, (java.lang.Comparable) 1L, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3007");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (double) (byte) -1, (java.lang.Comparable) ' ', (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3008");
        java.lang.Comparable comparable0 = null;
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) (short) 1, comparable2, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3009");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, (double) 100L, (java.lang.Comparable) 10, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3010");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, (double) 'a', (java.lang.Comparable) 1.0f, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3011");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) (-1), (java.lang.Comparable) (short) -1, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3012");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) (-1), (java.lang.Comparable) (byte) 100, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3013");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, (double) (short) 100, (java.lang.Comparable) "hi!", (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3014");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, (double) 1, (java.lang.Comparable) (byte) 1, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3015");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, (double) (short) 1, (java.lang.Comparable) 100L, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3016");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) '4', (java.lang.Comparable) 10.0f, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3017");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (double) (-1L), (java.lang.Comparable) (-1L), (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3018");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, 1.0d, comparable2, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3019");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) 1L, (java.lang.Comparable) 'a', (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3020");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) 10L, (java.lang.Comparable) 10, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3021");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (-1.0d), (java.lang.Comparable) (-1L), (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3022");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, 100.0d, (java.lang.Comparable) (short) 0, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3023");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) (byte) 100, (java.lang.Comparable) (-1.0f), (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3024");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (double) '4', (java.lang.Comparable) (short) 100, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3025");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) (short) 0, (java.lang.Comparable) 0, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3026");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) 0.0f, (java.lang.Comparable) (-1.0f), 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3027");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) (byte) -1, (java.lang.Comparable) 10.0f, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3028");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) '#', (java.lang.Comparable) 1L, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3029");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) 'a', (java.lang.Comparable) (-1.0d), (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3030");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, (double) 100.0f, (java.lang.Comparable) '#', (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3031");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) (byte) -1, (java.lang.Comparable) 0, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3032");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) 0, comparable2, (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3033");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', 0.0d, (java.lang.Comparable) false, (double) (byte) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3034");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) (short) 1, (java.lang.Comparable) 100L, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3035");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) (short) 10, (java.lang.Comparable) (short) 0, (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3036");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) (short) 100, (java.lang.Comparable) (short) -1, (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3037");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, 0.0d, (java.lang.Comparable) 10.0d, (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3038");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, 100.0d, (java.lang.Comparable) (-1.0d), (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3039");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) 1L, comparable2, (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3040");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, (double) 1, (java.lang.Comparable) 100, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3041");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) 1.0f, (java.lang.Comparable) 0.0d, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3042");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) 1, (java.lang.Comparable) 10L, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3043");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) 1, (java.lang.Comparable) 100.0d, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3044");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) ' ', (java.lang.Comparable) (byte) 0, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3045");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, 1.0d, (java.lang.Comparable) '#', (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3046");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) (byte) 0, (java.lang.Comparable) (-1.0f), (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3047");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (double) 1.0f, (java.lang.Comparable) 10, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3048");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) 0, (java.lang.Comparable) 100, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3049");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, 10.0d, (java.lang.Comparable) 100.0f, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3050");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) 1.0f, (java.lang.Comparable) 1.0f, (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3051");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) 100, (java.lang.Comparable) (short) 10, (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3052");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) (short) 0, (java.lang.Comparable) 10.0d, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3053");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (double) (byte) -1, (java.lang.Comparable) (byte) 100, (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3054");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) (byte) 10, (java.lang.Comparable) (byte) -1, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3055");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) (short) -1, (java.lang.Comparable) 10, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3056");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (double) (byte) -1, (java.lang.Comparable) (byte) 100, (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3057");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) 0.0f, (java.lang.Comparable) (-1), (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3058");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (double) 10.0f, (java.lang.Comparable) (short) 100, (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3059");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) ' ', (java.lang.Comparable) (byte) 10, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3060");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (double) (-1), (java.lang.Comparable) 100.0d, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3061");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (double) 0, (java.lang.Comparable) 10.0f, 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3062");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) (-1L), (java.lang.Comparable) 100, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3063");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) 100L, (java.lang.Comparable) (-1.0d), (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3064");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) (-1.0f), (java.lang.Comparable) 1.0d, (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3065");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, 10.0d, comparable2, (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3066");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 0, (java.lang.Comparable) (byte) 0, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3067");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) (byte) 100, (java.lang.Comparable) 0.0f, (double) (byte) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3068");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) (short) -1, (java.lang.Comparable) (short) 1, (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3069");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, 10.0d, (java.lang.Comparable) 10.0d, (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3070");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, (double) (short) 10, (java.lang.Comparable) (short) -1, (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3071");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) (short) 100, (java.lang.Comparable) false, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3072");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (double) ' ', (java.lang.Comparable) (short) 10, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3073");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, (double) '#', (java.lang.Comparable) (short) 100, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3074");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (double) 'a', (java.lang.Comparable) false, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3075");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) (short) 100, (java.lang.Comparable) (-1.0d), (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3076");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) (short) -1, (java.lang.Comparable) "", (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3077");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, 0.0d, (java.lang.Comparable) (short) 0, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3078");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, 100.0d, (java.lang.Comparable) (byte) 0, (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3079");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) (short) 1, (java.lang.Comparable) 100L, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3080");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) (byte) 10, (java.lang.Comparable) (byte) -1, (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3081");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, (double) 1L, (java.lang.Comparable) 1.0d, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3082");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) 100.0f, (java.lang.Comparable) 'a', (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3083");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) 1L, (java.lang.Comparable) (short) 10, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3084");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) (byte) 100, (java.lang.Comparable) 100.0f, (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3085");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, 0.0d, (java.lang.Comparable) 0L, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3086");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) '#', (java.lang.Comparable) ' ', 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3087");
        java.lang.Comparable comparable0 = null;
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 'a', comparable2, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3088");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), 0.0d, (java.lang.Comparable) (byte) 100, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3089");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) (short) -1, (java.lang.Comparable) 100L, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3090");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, 10.0d, (java.lang.Comparable) 100.0d, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3091");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) 0.0f, (java.lang.Comparable) '4', (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3092");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) (-1.0f), (java.lang.Comparable) 1.0f, (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3093");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) (byte) 1, (java.lang.Comparable) (-1L), 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3094");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, 100.0d, (java.lang.Comparable) ' ', (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3095");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (double) (byte) 100, (java.lang.Comparable) "hi!", (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3096");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) 100.0f, (java.lang.Comparable) true, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3097");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, (double) (byte) 0, (java.lang.Comparable) 0L, 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3098");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) (byte) -1, (java.lang.Comparable) 0, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3099");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) (-1), (java.lang.Comparable) (byte) 100, (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3100");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, (double) 'a', (java.lang.Comparable) (-1.0d), (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3101");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (double) (-1), (java.lang.Comparable) '#', 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3102");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (double) 10, (java.lang.Comparable) 10L, 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3103");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1), (double) (byte) -1, (java.lang.Comparable) (-1), (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3104");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, (double) (byte) 100, (java.lang.Comparable) 10, (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3105");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) 1.0f, (java.lang.Comparable) 100, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3106");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) 0, (java.lang.Comparable) 10.0d, (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3107");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) (short) 1, (java.lang.Comparable) 0, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3108");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1), (double) (short) 10, (java.lang.Comparable) "", (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3109");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, (double) (-1.0f), (java.lang.Comparable) "", (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3110");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (double) (byte) 1, (java.lang.Comparable) 100, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3111");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, (double) '#', (java.lang.Comparable) 0, (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3112");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, 0.0d, (java.lang.Comparable) (short) -1, (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3113");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) 100.0f, (java.lang.Comparable) 0.0f, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression6.test3114");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) (-1L), (java.lang.Comparable) 100, (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}


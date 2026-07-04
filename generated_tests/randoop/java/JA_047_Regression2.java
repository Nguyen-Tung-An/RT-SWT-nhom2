import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_047_Regression2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1001");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, (double) 100.0f, (java.lang.Comparable) 1.0f, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1002");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, (double) 0, (java.lang.Comparable) (-1.0d), 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1003");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', 0.0d, (java.lang.Comparable) 10.0d, (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1004");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, 100.0d, (java.lang.Comparable) ' ', (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1005");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, (double) (short) 10, (java.lang.Comparable) 0L, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1006");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, (double) (-1), (java.lang.Comparable) '#', (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1007");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (double) '#', (java.lang.Comparable) 1.0d, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1008");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) 'a', (java.lang.Comparable) 100, (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1009");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, 10.0d, (java.lang.Comparable) (-1.0f), (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1010");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) 10, (java.lang.Comparable) (-1), 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1011");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, (double) (-1L), (java.lang.Comparable) "", (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1012");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, 0.0d, (java.lang.Comparable) (-1), 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1013");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, (double) 0L, (java.lang.Comparable) (-1.0d), (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1014");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, (-1.0d), (java.lang.Comparable) (short) 100, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1015");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) ' ', (java.lang.Comparable) '4', (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1016");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) 100, (java.lang.Comparable) (-1.0f), (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1017");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (double) 1, (java.lang.Comparable) (-1L), (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1018");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) (short) -1, (java.lang.Comparable) 100L, 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1019");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) ' ', (java.lang.Comparable) 0, (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1020");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) (short) 10, (java.lang.Comparable) '4', (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1021");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0d, (double) (byte) 100, (java.lang.Comparable) (short) -1, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1022");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) (-1.0f), (java.lang.Comparable) (-1), (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1023");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, (double) 100L, (java.lang.Comparable) 100L, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1024");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (double) (byte) 0, (java.lang.Comparable) 10L, (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1025");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, (double) 100L, (java.lang.Comparable) (short) 0, (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1026");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (double) ' ', (java.lang.Comparable) (short) 0, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1027");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, (double) (byte) 0, (java.lang.Comparable) 1L, (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1028");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) '4', (java.lang.Comparable) '#', (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1029");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, (double) '#', (java.lang.Comparable) (short) 1, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1030");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) 0L, (java.lang.Comparable) (byte) 10, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1031");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, (double) (short) 0, (java.lang.Comparable) (short) 100, 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1032");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 100, (java.lang.Comparable) 1.0f, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1033");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) ' ', (java.lang.Comparable) 1L, (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1034");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) (-1.0f), (java.lang.Comparable) 0, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1035");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, (double) 1, (java.lang.Comparable) 1.0f, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1036");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 'a', (java.lang.Comparable) (short) -1, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1037");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1), (double) 'a', (java.lang.Comparable) false, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1038");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, 10.0d, (java.lang.Comparable) (-1L), (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1039");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) 10.0f, (java.lang.Comparable) (byte) 10, 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1040");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, 10.0d, (java.lang.Comparable) true, (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1041");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (double) 1, (java.lang.Comparable) (byte) 1, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1042");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) 0L, (java.lang.Comparable) (short) 100, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1043");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (double) 10L, (java.lang.Comparable) (byte) 100, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1044");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) (short) 0, (java.lang.Comparable) '#', 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1045");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', 0.0d, (java.lang.Comparable) (-1L), (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1046");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) (short) 10, (java.lang.Comparable) 'a', (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1047");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) (short) -1, (java.lang.Comparable) 0L, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1048");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) (byte) 1, (java.lang.Comparable) (-1.0d), (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1049");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) (short) 10, (java.lang.Comparable) 100.0f, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1050");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) (-1.0f), (java.lang.Comparable) 1, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1051");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, (double) '4', (java.lang.Comparable) (byte) 100, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1052");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) (-1L), (java.lang.Comparable) 100.0d, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1053");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, (double) (-1), (java.lang.Comparable) (byte) 100, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1054");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", 0.0d, (java.lang.Comparable) (byte) 100, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1055");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) (byte) 0, (java.lang.Comparable) 1.0d, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1056");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, 0.0d, (java.lang.Comparable) 1, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1057");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0d, 1.0d, (java.lang.Comparable) (-1.0f), (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1058");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", 10.0d, (java.lang.Comparable) (short) 100, (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1059");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) 10L, (java.lang.Comparable) (byte) 10, (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1060");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) 0.0f, (java.lang.Comparable) 100.0d, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1061");
        java.lang.Comparable comparable0 = null;
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 100L, comparable2, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1062");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) ' ', (java.lang.Comparable) 'a', (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1063");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, 100.0d, (java.lang.Comparable) (short) 1, (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1064");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (double) '4', (java.lang.Comparable) true, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1065");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (double) (-1), (java.lang.Comparable) 0L, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1066");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, 100.0d, (java.lang.Comparable) "", (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1067");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, (double) 10.0f, (java.lang.Comparable) (-1.0d), (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1068");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, (double) (short) 10, (java.lang.Comparable) (short) 0, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1069");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, (double) '#', (java.lang.Comparable) '4', (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1070");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, (double) 'a', (java.lang.Comparable) (-1L), 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1071");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) 100.0f, (java.lang.Comparable) true, 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1072");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (double) (short) 10, (java.lang.Comparable) 1.0f, 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1073");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 100, (java.lang.Comparable) 10L, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1074");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) '#', (java.lang.Comparable) "", (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1075");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, (double) (byte) 0, (java.lang.Comparable) 0, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1076");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, (double) 'a', (java.lang.Comparable) (byte) 10, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1077");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) (byte) 1, (java.lang.Comparable) (short) 10, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1078");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, (double) 1L, (java.lang.Comparable) 0, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1079");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1), (double) (short) 100, (java.lang.Comparable) (byte) 100, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1080");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, 10.0d, (java.lang.Comparable) 1.0d, (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1081");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) (short) -1, (java.lang.Comparable) 'a', (double) (byte) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1082");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) (-1L), (java.lang.Comparable) 10, (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1083");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (double) 0L, (java.lang.Comparable) (-1.0f), (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1084");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1), (double) (byte) 100, (java.lang.Comparable) "", (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1085");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', 100.0d, (java.lang.Comparable) 'a', 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1086");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) '#', (java.lang.Comparable) (short) 10, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1087");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, (double) (-1L), (java.lang.Comparable) (byte) 1, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1088");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) 100, (java.lang.Comparable) (short) -1, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1089");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', 0.0d, (java.lang.Comparable) (short) -1, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1090");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0d, (double) 0, (java.lang.Comparable) "hi!", (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1091");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, 1.0d, (java.lang.Comparable) 1L, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1092");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (double) (byte) -1, (java.lang.Comparable) (short) -1, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1093");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, (double) 10L, (java.lang.Comparable) "hi!", (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1094");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) (-1L), (java.lang.Comparable) "", (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1095");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) (short) -1, (java.lang.Comparable) 1.0d, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1096");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) (short) 1, (java.lang.Comparable) (byte) -1, 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1097");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) '4', (java.lang.Comparable) true, (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1098");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) (byte) 0, (java.lang.Comparable) 1.0f, (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1099");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) 10.0f, (java.lang.Comparable) (-1.0d), (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1100");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, 10.0d, (java.lang.Comparable) (byte) -1, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1101");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) (byte) 0, (java.lang.Comparable) 0.0d, (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1102");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, (double) 1, (java.lang.Comparable) "hi!", (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1103");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, 100.0d, (java.lang.Comparable) (-1), (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1104");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) (short) 1, (java.lang.Comparable) (-1.0f), 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1105");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (double) 1, (java.lang.Comparable) ' ', (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1106");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, (double) (byte) -1, (java.lang.Comparable) (byte) -1, (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1107");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) 100, (java.lang.Comparable) 1L, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1108");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, (double) '4', (java.lang.Comparable) "", (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1109");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (double) (byte) 1, (java.lang.Comparable) "", (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1110");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) (short) 10, (java.lang.Comparable) (byte) 100, (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1111");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) (-1L), (java.lang.Comparable) (short) 0, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1112");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, 0.0d, (java.lang.Comparable) (-1), (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1113");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) (byte) 0, (java.lang.Comparable) 100.0d, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1114");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (double) 100.0f, (java.lang.Comparable) ' ', (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1115");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1), (double) ' ', (java.lang.Comparable) (byte) 0, (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1116");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, (double) 100, (java.lang.Comparable) (byte) 0, (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1117");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, 0.0d, (java.lang.Comparable) (short) 100, (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1118");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) (short) 100, (java.lang.Comparable) true, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1119");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) (-1), (java.lang.Comparable) (-1L), (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1120");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", 1.0d, (java.lang.Comparable) (byte) 1, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1121");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) (short) 10, (java.lang.Comparable) 'a', (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1122");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) 100L, (java.lang.Comparable) 100L, (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1123");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (double) (-1L), (java.lang.Comparable) 0, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1124");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) 10.0f, (java.lang.Comparable) (-1.0f), 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1125");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) (-1.0f), (java.lang.Comparable) (short) -1, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1126");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (-1.0d), (java.lang.Comparable) false, (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1127");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (double) (short) 10, (java.lang.Comparable) 10, (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1128");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (double) 100.0f, (java.lang.Comparable) 1.0f, (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1129");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), 0.0d, (java.lang.Comparable) (short) -1, (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1130");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, (double) 10L, (java.lang.Comparable) 10L, (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1131");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) (short) 1, (java.lang.Comparable) (byte) 10, (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1132");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), 1.0d, (java.lang.Comparable) 0, (double) (byte) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1133");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) (-1.0f), (java.lang.Comparable) (-1.0d), (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1134");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) 0.0f, (java.lang.Comparable) (short) -1, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1135");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1), (double) 'a', comparable2, (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1136");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) (byte) 0, (java.lang.Comparable) (short) 100, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1137");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) (short) 0, (java.lang.Comparable) ' ', (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1138");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (double) 0L, (java.lang.Comparable) (short) 10, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1139");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) '4', (java.lang.Comparable) (byte) 10, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1140");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (double) '4', (java.lang.Comparable) 0, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1141");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 100.0f, (java.lang.Comparable) 0.0d, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1142");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, (double) (-1.0f), (java.lang.Comparable) '4', 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1143");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, (double) 1.0f, (java.lang.Comparable) 10L, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1144");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, (double) '#', (java.lang.Comparable) (-1.0f), (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1145");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, (double) 10L, (java.lang.Comparable) 0L, (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1146");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, (double) (-1), (java.lang.Comparable) 100L, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1147");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) (byte) 0, (java.lang.Comparable) (byte) 1, (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1148");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) 0, (java.lang.Comparable) 1.0f, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1149");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, 100.0d, (java.lang.Comparable) (byte) 0, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1150");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, 10.0d, (java.lang.Comparable) 100.0f, 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1151");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) 'a', comparable2, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1152");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, (double) 1, (java.lang.Comparable) 100.0f, (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1153");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) (byte) 10, (java.lang.Comparable) (byte) 10, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1154");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) 'a', (java.lang.Comparable) 'a', 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1155");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (double) (short) -1, (java.lang.Comparable) 100.0f, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1156");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (double) ' ', (java.lang.Comparable) "hi!", (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1157");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (double) 0L, comparable2, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1158");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) 0, (java.lang.Comparable) true, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1159");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) '4', (java.lang.Comparable) 1, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1160");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, 0.0d, (java.lang.Comparable) 100, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1161");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) 100.0f, (java.lang.Comparable) 10.0f, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1162");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1), 1.0d, (java.lang.Comparable) (-1L), (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1163");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) (byte) 0, (java.lang.Comparable) (short) 10, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1164");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) (byte) 1, (java.lang.Comparable) (short) 100, (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1165");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0d, 0.0d, (java.lang.Comparable) "", (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1166");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, 1.0d, (java.lang.Comparable) 'a', (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1167");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (double) 0L, (java.lang.Comparable) 0.0f, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1168");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, 10.0d, (java.lang.Comparable) '#', (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1169");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) (byte) 1, (java.lang.Comparable) (byte) 1, (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1170");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, 10.0d, (java.lang.Comparable) 100.0d, (double) (byte) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1171");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (double) (short) -1, (java.lang.Comparable) (-1L), 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1172");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) 0.0f, comparable2, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1173");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) 1, (java.lang.Comparable) 100, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1174");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, 0.0d, (java.lang.Comparable) (short) 100, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1175");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (double) 0, (java.lang.Comparable) (-1.0f), (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1176");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1), (double) 1L, (java.lang.Comparable) (short) -1, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1177");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, (double) (-1), (java.lang.Comparable) (-1), (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1178");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) 'a', (java.lang.Comparable) 100.0f, (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1179");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (double) 10.0f, (java.lang.Comparable) 0, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1180");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, 10.0d, (java.lang.Comparable) (-1L), 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1181");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) (short) 10, (java.lang.Comparable) (byte) -1, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1182");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, (double) (short) 0, (java.lang.Comparable) (-1.0d), (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1183");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, (double) (byte) 100, (java.lang.Comparable) 100L, (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1184");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (double) 1L, (java.lang.Comparable) (short) -1, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1185");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) 100L, (java.lang.Comparable) 10.0f, (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1186");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) (byte) 10, (java.lang.Comparable) 0.0f, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1187");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) (short) 100, (java.lang.Comparable) (short) -1, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1188");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, 0.0d, comparable2, 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1189");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) '4', (java.lang.Comparable) (byte) 1, (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1190");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, 0.0d, (java.lang.Comparable) (short) 0, (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1191");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, (double) '4', (java.lang.Comparable) (short) -1, 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1192");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, (double) (-1L), (java.lang.Comparable) (byte) 10, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1193");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) (-1), (java.lang.Comparable) ' ', (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1194");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, (double) (byte) 100, (java.lang.Comparable) ' ', 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1195");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) 1.0f, (java.lang.Comparable) 'a', (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1196");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, 10.0d, (java.lang.Comparable) '4', (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1197");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (double) 0, (java.lang.Comparable) 100.0d, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1198");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) (short) 10, (java.lang.Comparable) (short) -1, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1199");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) (byte) 100, (java.lang.Comparable) 1L, (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1200");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) (short) -1, (java.lang.Comparable) 1.0d, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1201");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) 100.0f, (java.lang.Comparable) (byte) -1, (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1202");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, (double) (short) 0, (java.lang.Comparable) 100.0d, (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1203");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, 0.0d, (java.lang.Comparable) (short) 10, (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1204");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, 1.0d, (java.lang.Comparable) '4', (double) (byte) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1205");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) 'a', (java.lang.Comparable) (byte) -1, (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1206");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, 0.0d, (java.lang.Comparable) (short) -1, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1207");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) (short) 0, (java.lang.Comparable) 0.0f, (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1208");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (double) (byte) 0, (java.lang.Comparable) "", 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1209");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) 0.0f, (java.lang.Comparable) 100.0d, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1210");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, (double) (byte) 100, (java.lang.Comparable) (-1.0d), (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1211");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, 1.0d, (java.lang.Comparable) (byte) 0, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1212");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (double) 10.0f, (java.lang.Comparable) false, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1213");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, (double) 10.0f, (java.lang.Comparable) (-1), (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1214");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 'a', (java.lang.Comparable) (short) -1, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1215");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (double) '#', (java.lang.Comparable) (byte) -1, (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1216");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) 1L, (java.lang.Comparable) (byte) 100, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1217");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) 100.0f, (java.lang.Comparable) 10, (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1218");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (double) (-1L), (java.lang.Comparable) 0.0d, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1219");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (double) (byte) 1, (java.lang.Comparable) 0, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1220");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, 10.0d, (java.lang.Comparable) 10L, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1221");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (double) '#', (java.lang.Comparable) ' ', (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1222");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) 100L, (java.lang.Comparable) (byte) -1, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1223");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) '4', (java.lang.Comparable) 100.0d, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1224");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) (byte) 1, (java.lang.Comparable) (short) -1, (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1225");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (double) 'a', (java.lang.Comparable) 1.0d, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1226");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) 0.0f, (java.lang.Comparable) '4', (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1227");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) (byte) -1, (java.lang.Comparable) 0L, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1228");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) 100, (java.lang.Comparable) "", (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1229");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, (double) 1, (java.lang.Comparable) false, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1230");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) 0L, (java.lang.Comparable) (short) 100, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1231");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, (double) (-1L), (java.lang.Comparable) (byte) 0, (double) (byte) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1232");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, 100.0d, (java.lang.Comparable) 1, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1233");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) 0.0f, (java.lang.Comparable) (short) 10, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1234");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) 100L, (java.lang.Comparable) (byte) 100, (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1235");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, (double) ' ', (java.lang.Comparable) (byte) 10, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1236");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, 0.0d, (java.lang.Comparable) 10, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1237");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, (double) '4', (java.lang.Comparable) 1.0d, (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1238");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) (short) 0, (java.lang.Comparable) '4', (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1239");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) 10, (java.lang.Comparable) (-1.0d), 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1240");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) '4', (java.lang.Comparable) (short) 10, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1241");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (double) '#', (java.lang.Comparable) (byte) -1, (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1242");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) 1.0f, (java.lang.Comparable) 10.0d, (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1243");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) 100L, (java.lang.Comparable) 10L, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1244");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, 0.0d, (java.lang.Comparable) 100, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1245");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, (double) (byte) 10, (java.lang.Comparable) (short) 100, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1246");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) (-1L), (java.lang.Comparable) 100.0d, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1247");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, (double) (byte) 100, (java.lang.Comparable) 1, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1248");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), 10.0d, (java.lang.Comparable) 100L, (double) (byte) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1249");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, (double) (byte) -1, (java.lang.Comparable) 100.0d, (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1250");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', 100.0d, (java.lang.Comparable) 'a', (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1251");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 1, (java.lang.Comparable) 1, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1252");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) (short) 100, (java.lang.Comparable) 10.0f, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1253");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', 0.0d, comparable2, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1254");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, 1.0d, (java.lang.Comparable) (byte) 0, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1255");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (double) 100.0f, (java.lang.Comparable) 0L, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1256");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, (double) 1, (java.lang.Comparable) (short) 0, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1257");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, (double) 1L, (java.lang.Comparable) 10.0f, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1258");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) (byte) 0, (java.lang.Comparable) true, (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1259");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, 100.0d, (java.lang.Comparable) '#', (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1260");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) ' ', (java.lang.Comparable) '#', 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1261");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) (byte) 10, (java.lang.Comparable) 1, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1262");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) (short) 1, comparable2, (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1263");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) (short) -1, (java.lang.Comparable) 100, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1264");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (-1.0d), (java.lang.Comparable) 100.0d, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1265");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, (double) 10, (java.lang.Comparable) 0.0d, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1266");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) 'a', (java.lang.Comparable) (-1), 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1267");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) (short) 100, (java.lang.Comparable) 100L, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1268");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (double) 0.0f, (java.lang.Comparable) 'a', (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1269");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) (byte) 1, (java.lang.Comparable) 10L, 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1270");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (double) 1.0f, (java.lang.Comparable) "hi!", (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1271");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), 0.0d, (java.lang.Comparable) (byte) 10, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1272");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) 10L, (java.lang.Comparable) 'a', (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1273");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, (double) '#', (java.lang.Comparable) 1.0f, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1274");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (double) 1, (java.lang.Comparable) (-1L), (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1275");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) 10L, (java.lang.Comparable) (short) -1, (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1276");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) 10.0f, (java.lang.Comparable) 10, (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1277");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) 100L, (java.lang.Comparable) 100L, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1278");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, (double) (byte) 0, (java.lang.Comparable) 1L, (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1279");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0d, 1.0d, (java.lang.Comparable) 0.0d, (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1280");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, 100.0d, (java.lang.Comparable) (-1.0d), (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1281");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 1, (java.lang.Comparable) "", 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1282");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) 0.0f, (java.lang.Comparable) (short) 100, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1283");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) (short) -1, (java.lang.Comparable) 100.0f, (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1284");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) 1L, (java.lang.Comparable) (-1), (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1285");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) 1L, (java.lang.Comparable) 100.0f, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1286");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (double) (-1), (java.lang.Comparable) 1, (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1287");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) (-1), (java.lang.Comparable) 10.0f, (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1288");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) 10L, (java.lang.Comparable) 100, 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1289");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, (double) 0L, (java.lang.Comparable) ' ', (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1290");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) '#', (java.lang.Comparable) (byte) 0, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1291");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) (-1L), comparable2, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1292");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, 1.0d, (java.lang.Comparable) 1, (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1293");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) 100, (java.lang.Comparable) (-1.0d), (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1294");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (double) (byte) 10, (java.lang.Comparable) 0, (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1295");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, (double) 10L, (java.lang.Comparable) 1, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1296");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, (double) (short) 100, (java.lang.Comparable) ' ', 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1297");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) (byte) 0, (java.lang.Comparable) 10L, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1298");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) (short) 10, (java.lang.Comparable) (-1L), 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1299");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) (-1.0f), (java.lang.Comparable) (-1.0d), (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1300");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, (double) 0.0f, (java.lang.Comparable) "", (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1301");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) 'a', (java.lang.Comparable) 10.0d, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1302");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) 1.0f, (java.lang.Comparable) 1.0d, (double) (byte) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1303");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) 10.0f, (java.lang.Comparable) '#', (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1304");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (double) 10, (java.lang.Comparable) "", (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1305");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) (short) 10, (java.lang.Comparable) 100L, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1306");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (-1.0d), (java.lang.Comparable) (byte) -1, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1307");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) '#', (java.lang.Comparable) (byte) 10, (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1308");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, (-1.0d), (java.lang.Comparable) 0.0f, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1309");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (-1.0d), (java.lang.Comparable) 0, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1310");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1), (double) 0L, (java.lang.Comparable) "hi!", (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1311");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (-1.0d), (java.lang.Comparable) 100, (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1312");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) 10, (java.lang.Comparable) (short) -1, 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1313");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1), (double) (byte) 1, (java.lang.Comparable) 0L, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1314");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, 0.0d, (java.lang.Comparable) (-1), (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1315");
        java.lang.Comparable comparable0 = null;
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 0L, comparable2, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1316");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) (short) 1, (java.lang.Comparable) false, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1317");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, (double) (byte) 1, (java.lang.Comparable) "hi!", (double) (byte) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1318");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, (-1.0d), (java.lang.Comparable) (short) 100, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1319");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (double) (byte) 0, (java.lang.Comparable) 0.0d, (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1320");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) (-1L), (java.lang.Comparable) 100.0f, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1321");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) 0L, (java.lang.Comparable) 10, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1322");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) 1L, (java.lang.Comparable) 10, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1323");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) 100, comparable2, (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1324");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, (double) 0.0f, (java.lang.Comparable) "hi!", (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1325");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, (double) 0, (java.lang.Comparable) 0.0f, (double) (byte) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1326");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, (double) '4', (java.lang.Comparable) 10, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1327");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 'a', (java.lang.Comparable) (byte) 1, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1328");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (double) (short) 0, (java.lang.Comparable) 0L, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1329");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) (byte) -1, (java.lang.Comparable) '#', (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1330");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, (double) '#', (java.lang.Comparable) (byte) 0, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1331");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) (short) -1, (java.lang.Comparable) '#', 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1332");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) 100.0f, (java.lang.Comparable) (byte) 1, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1333");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) (byte) 1, (java.lang.Comparable) 100.0f, (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1334");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, (double) 10.0f, (java.lang.Comparable) 1, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1335");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) (byte) 1, (java.lang.Comparable) 0L, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1336");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) 1.0f, (java.lang.Comparable) (-1.0f), (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1337");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) (short) 10, (java.lang.Comparable) "hi!", (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1338");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) 10L, (java.lang.Comparable) "hi!", (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1339");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (-1.0d), comparable2, (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1340");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) 1.0f, (java.lang.Comparable) 100.0f, (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1341");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, 10.0d, (java.lang.Comparable) (-1L), (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1342");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (double) 10L, (java.lang.Comparable) 0, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1343");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, (double) (short) 100, (java.lang.Comparable) (byte) 10, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1344");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (double) 1L, (java.lang.Comparable) 10, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1345");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, 100.0d, (java.lang.Comparable) (byte) 1, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1346");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) 100L, (java.lang.Comparable) (-1.0f), (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1347");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), 1.0d, (java.lang.Comparable) 0L, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1348");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) 1L, (java.lang.Comparable) ' ', (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1349");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) 0, (java.lang.Comparable) 100, (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1350");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) (short) -1, (java.lang.Comparable) (short) -1, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1351");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (-1.0d), (java.lang.Comparable) 'a', (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1352");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, (double) 1.0f, (java.lang.Comparable) 1L, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1353");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', 0.0d, (java.lang.Comparable) (short) 10, 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1354");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (double) 10L, (java.lang.Comparable) (short) -1, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1355");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (-1.0d), (java.lang.Comparable) 10, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1356");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) (-1), (java.lang.Comparable) (byte) 1, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1357");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, (double) (-1.0f), (java.lang.Comparable) (byte) -1, 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1358");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', 100.0d, (java.lang.Comparable) (short) 1, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1359");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1), (double) (-1), (java.lang.Comparable) (short) 0, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1360");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, 100.0d, (java.lang.Comparable) 10.0d, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1361");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, (double) '4', (java.lang.Comparable) "hi!", 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1362");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, (-1.0d), (java.lang.Comparable) (short) -1, 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1363");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, (double) (byte) 100, (java.lang.Comparable) 10, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1364");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, 0.0d, (java.lang.Comparable) (short) 0, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1365");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) '#', (java.lang.Comparable) (byte) 10, (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1366");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, (double) (short) 0, (java.lang.Comparable) 100.0d, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1367");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) ' ', (java.lang.Comparable) 10, (double) (byte) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1368");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) (short) -1, (java.lang.Comparable) '4', (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1369");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) (byte) 1, (java.lang.Comparable) (byte) 10, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1370");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) (-1.0f), (java.lang.Comparable) (short) 0, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1371");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (double) 100, (java.lang.Comparable) 1L, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1372");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) (short) -1, (java.lang.Comparable) '4', (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1373");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) '4', (java.lang.Comparable) 0, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1374");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (-1.0d), (java.lang.Comparable) (byte) 0, (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1375");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) (-1L), (java.lang.Comparable) 0.0f, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1376");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, (double) (-1.0f), (java.lang.Comparable) 10L, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1377");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (double) (byte) 10, (java.lang.Comparable) 100, (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1378");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) 10L, (java.lang.Comparable) 0L, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1379");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (double) 100L, (java.lang.Comparable) (-1.0f), (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1380");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) (byte) 100, (java.lang.Comparable) 100.0f, (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1381");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (double) '4', (java.lang.Comparable) (byte) -1, (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1382");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 10.0f, (java.lang.Comparable) 1L, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1383");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) (byte) 1, (java.lang.Comparable) false, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1384");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, (double) (byte) 1, (java.lang.Comparable) (-1.0f), (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1385");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) (short) -1, (java.lang.Comparable) "", (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1386");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (double) 100.0f, (java.lang.Comparable) (-1.0d), (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1387");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (double) (byte) 1, (java.lang.Comparable) (byte) 100, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1388");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, (double) 0.0f, (java.lang.Comparable) 0.0d, (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1389");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) 10.0f, (java.lang.Comparable) 10.0d, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1390");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, 10.0d, (java.lang.Comparable) '4', (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1391");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) '#', (java.lang.Comparable) 0.0d, (double) (byte) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1392");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) '4', (java.lang.Comparable) (short) -1, 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1393");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) (-1.0f), (java.lang.Comparable) (byte) -1, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1394");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) (short) -1, (java.lang.Comparable) ' ', (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1395");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, (double) (byte) 10, (java.lang.Comparable) (byte) 1, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1396");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) (byte) 1, (java.lang.Comparable) (byte) 100, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1397");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) (byte) 1, (java.lang.Comparable) 10.0d, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1398");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, (double) (-1.0f), (java.lang.Comparable) 10.0f, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1399");
        java.lang.Comparable comparable0 = null;
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, 10.0d, comparable2, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1400");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) (short) 10, (java.lang.Comparable) 1.0f, (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1401");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) '4', (java.lang.Comparable) 'a', (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1402");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, 100.0d, (java.lang.Comparable) 0.0d, 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1403");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, (double) 100.0f, comparable2, (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1404");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, 0.0d, (java.lang.Comparable) (-1.0f), (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1405");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) (short) -1, (java.lang.Comparable) (short) -1, (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1406");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, (double) (byte) 0, (java.lang.Comparable) 'a', 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1407");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0d, (double) (short) -1, (java.lang.Comparable) 10L, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1408");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) 1, (java.lang.Comparable) 100, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1409");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, (double) (-1), (java.lang.Comparable) (short) 10, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1410");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, 10.0d, comparable2, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1411");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (double) (byte) -1, (java.lang.Comparable) 0.0f, (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1412");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) 'a', (java.lang.Comparable) false, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1413");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, (double) '4', (java.lang.Comparable) 'a', (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1414");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (double) (byte) 1, (java.lang.Comparable) 0.0f, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1415");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) (short) -1, (java.lang.Comparable) 'a', (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1416");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, (double) (byte) 0, (java.lang.Comparable) 100L, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1417");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1), (double) 1, (java.lang.Comparable) (short) -1, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1418");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) 10.0f, (java.lang.Comparable) "", (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1419");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) 100L, (java.lang.Comparable) 'a', 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1420");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) 100L, (java.lang.Comparable) false, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1421");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (-1.0d), (java.lang.Comparable) 10L, (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1422");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (double) (-1.0f), (java.lang.Comparable) (byte) 100, (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1423");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, (double) '4', (java.lang.Comparable) (short) 10, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1424");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (double) 10.0f, comparable2, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1425");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) 10, (java.lang.Comparable) 100, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1426");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) (short) 10, (java.lang.Comparable) (-1.0f), (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1427");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, (double) 100, (java.lang.Comparable) 10.0d, (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1428");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, (double) (-1.0f), (java.lang.Comparable) false, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1429");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, (double) (short) -1, (java.lang.Comparable) 100.0f, (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1430");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, (double) 1L, (java.lang.Comparable) "hi!", (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1431");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (double) 0L, (java.lang.Comparable) ' ', (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1432");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) (short) 0, (java.lang.Comparable) (short) 10, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1433");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, (double) (byte) 100, (java.lang.Comparable) 100L, (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1434");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, (double) (-1), (java.lang.Comparable) 1.0d, (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1435");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, (double) (short) 0, (java.lang.Comparable) 1L, (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1436");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, 1.0d, (java.lang.Comparable) '#', (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1437");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) (short) 100, (java.lang.Comparable) (byte) 100, (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1438");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, (double) 10, (java.lang.Comparable) '#', (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1439");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (double) ' ', (java.lang.Comparable) 1.0f, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1440");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, (double) (-1L), (java.lang.Comparable) '4', (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1441");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, 100.0d, (java.lang.Comparable) (short) 10, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1442");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) 100.0f, (java.lang.Comparable) (byte) 0, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1443");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) (byte) 100, (java.lang.Comparable) false, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1444");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) 0, (java.lang.Comparable) (-1.0f), 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1445");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) (byte) -1, (java.lang.Comparable) (short) 100, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1446");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 'a', (java.lang.Comparable) '#', (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1447");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, (double) 0.0f, (java.lang.Comparable) 1.0f, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1448");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) 100L, (java.lang.Comparable) '#', (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1449");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, (double) (-1L), (java.lang.Comparable) 0, (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1450");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) (short) -1, (java.lang.Comparable) 10, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1451");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, 100.0d, (java.lang.Comparable) (byte) 1, (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1452");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) (short) 100, (java.lang.Comparable) (byte) 100, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1453");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, (double) (short) 10, (java.lang.Comparable) (byte) 1, (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1454");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (double) '#', (java.lang.Comparable) 10, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1455");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', 10.0d, (java.lang.Comparable) 0.0d, (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1456");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, (double) (-1.0f), (java.lang.Comparable) 10L, (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1457");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (double) (byte) 0, (java.lang.Comparable) (-1.0d), (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1458");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (double) (byte) 1, (java.lang.Comparable) 'a', 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1459");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, (double) 100, (java.lang.Comparable) (-1.0d), (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1460");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) (short) -1, (java.lang.Comparable) 100.0d, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1461");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) 0.0f, (java.lang.Comparable) '4', 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1462");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, (double) (byte) 10, (java.lang.Comparable) true, (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1463");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) (byte) 0, (java.lang.Comparable) 0, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1464");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) (-1.0f), (java.lang.Comparable) 1.0d, (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1465");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) (byte) 1, (java.lang.Comparable) (-1.0f), (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1466");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, (double) 0.0f, (java.lang.Comparable) 0.0d, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1467");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, 0.0d, (java.lang.Comparable) '#', 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1468");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, (double) (short) 100, (java.lang.Comparable) 10.0f, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1469");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) 0, (java.lang.Comparable) (byte) -1, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1470");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) '#', (java.lang.Comparable) (byte) 1, (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1471");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) (short) 1, (java.lang.Comparable) 1.0f, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1472");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0d, (double) 'a', (java.lang.Comparable) false, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1473");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, 0.0d, (java.lang.Comparable) (short) 1, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1474");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, (double) (-1L), (java.lang.Comparable) "hi!", (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1475");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', 10.0d, (java.lang.Comparable) 1.0d, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1476");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, (double) 1L, (java.lang.Comparable) (byte) 1, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1477");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1), (double) 0, (java.lang.Comparable) ' ', (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1478");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (double) (byte) 100, (java.lang.Comparable) (short) 10, (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1479");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) 100, (java.lang.Comparable) "", (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1480");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0d, (double) 0.0f, (java.lang.Comparable) (byte) -1, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1481");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, 1.0d, (java.lang.Comparable) (byte) 1, (double) (byte) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1482");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (double) 0.0f, (java.lang.Comparable) 1.0f, (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1483");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) '#', (java.lang.Comparable) (short) 10, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1484");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, 0.0d, (java.lang.Comparable) 1, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1485");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (double) (short) 100, (java.lang.Comparable) 10.0f, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1486");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) 0.0f, (java.lang.Comparable) 0L, (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1487");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, 100.0d, (java.lang.Comparable) 0.0d, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1488");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, (double) 10L, (java.lang.Comparable) (-1L), (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1489");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) (byte) -1, (java.lang.Comparable) 100.0d, (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1490");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', 0.0d, (java.lang.Comparable) (-1.0d), 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1491");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) (byte) 10, (java.lang.Comparable) true, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1492");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, 0.0d, (java.lang.Comparable) (short) 1, (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1493");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) 100, (java.lang.Comparable) 1.0d, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1494");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) '4', (java.lang.Comparable) 100L, (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1495");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) 'a', (java.lang.Comparable) (-1), (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1496");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (-1.0d), (java.lang.Comparable) 100.0f, 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1497");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) 100, (java.lang.Comparable) '4', (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1498");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) (byte) 1, (java.lang.Comparable) (short) 0, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1499");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, 0.0d, (java.lang.Comparable) 1.0f, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression2.test1500");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) (byte) 10, (java.lang.Comparable) (byte) 1, (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}


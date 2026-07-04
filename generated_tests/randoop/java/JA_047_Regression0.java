import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_047_Regression0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0001");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) (short) -1, (java.lang.Comparable) ' ', (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0002");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) (short) 10, (java.lang.Comparable) 10L, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0003");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0004");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (double) 10L, (java.lang.Comparable) (short) 10, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0005");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (double) ' ', (java.lang.Comparable) 0, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0006");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, (double) 100.0f, (java.lang.Comparable) 1L, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0007");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) (short) 10, (java.lang.Comparable) 10L, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0008");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) '#', (java.lang.Comparable) 10, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0009");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) 10, (java.lang.Comparable) 100, (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0010");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, 100.0d, (java.lang.Comparable) true, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0011");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) (byte) -1, (java.lang.Comparable) 100L, 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0012");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, 1.0d, (java.lang.Comparable) (byte) 0, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0013");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (double) (short) 0, (java.lang.Comparable) (byte) -1, (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0014");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, (double) (byte) 10, (java.lang.Comparable) 100L, (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0015");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, (double) (byte) -1, (java.lang.Comparable) ' ', 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0016");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (double) (byte) 10, (java.lang.Comparable) true, (double) (byte) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0017");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) (short) -1, (java.lang.Comparable) 1.0d, (double) (byte) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0018");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) (short) 10, (java.lang.Comparable) 100, 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0019");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, 100.0d, (java.lang.Comparable) (-1), (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0020");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, 1.0d, (java.lang.Comparable) '4', (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0021");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) (short) 1, (java.lang.Comparable) false, (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0022");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (double) 10, (java.lang.Comparable) (short) 100, (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0023");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, (double) (short) 10, (java.lang.Comparable) (-1L), (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0024");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, 1.0d, (java.lang.Comparable) "hi!", (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0025");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) 100, (java.lang.Comparable) (short) -1, (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0026");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, 1.0d, (java.lang.Comparable) 10L, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0027");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), 0.0d, (java.lang.Comparable) 10.0d, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0028");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) (byte) 1, (java.lang.Comparable) false, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0029");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, (double) 1, (java.lang.Comparable) (-1.0f), (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0030");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, 0.0d, (java.lang.Comparable) 0, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0031");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) (-1), (java.lang.Comparable) (byte) -1, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0032");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, (double) (byte) -1, (java.lang.Comparable) 100.0f, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0033");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (double) ' ', (java.lang.Comparable) "hi!", (double) (byte) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0034");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) 0, (java.lang.Comparable) (-1.0d), 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0035");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0d, (double) 'a', (java.lang.Comparable) (short) 100, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0036");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) 0L, (java.lang.Comparable) ' ', (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0037");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, 10.0d, (java.lang.Comparable) (short) 1, (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0038");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", 0.0d, (java.lang.Comparable) '4', (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0039");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) (byte) 0, (java.lang.Comparable) 'a', (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0040");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) (short) 10, (java.lang.Comparable) 10.0d, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0041");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) ' ', (java.lang.Comparable) 10, 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0042");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) 1, (java.lang.Comparable) true, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0043");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) 0.0f, (java.lang.Comparable) 1L, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0044");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (-1.0d), (java.lang.Comparable) (-1), (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0045");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) 100, (java.lang.Comparable) 100.0d, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0046");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) (short) 1, (java.lang.Comparable) (short) 1, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0047");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, 0.0d, (java.lang.Comparable) "", (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0048");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) (short) 100, (java.lang.Comparable) (short) 10, (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0049");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) 0, (java.lang.Comparable) false, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0050");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) 100, (java.lang.Comparable) 0, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0051");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) (byte) 0, (java.lang.Comparable) (-1.0f), (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0052");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) (short) 10, (java.lang.Comparable) '#', (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0053");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, (double) 1.0f, (java.lang.Comparable) 10, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0054");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) 100.0f, (java.lang.Comparable) (byte) 10, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0055");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, (double) 1L, (java.lang.Comparable) (byte) 100, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0056");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) (-1L), (java.lang.Comparable) 100, (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0057");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (double) (short) 0, (java.lang.Comparable) 100.0d, (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0058");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, (double) 1.0f, (java.lang.Comparable) 1.0f, (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0059");
        java.lang.Comparable comparable0 = null;
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 100L, comparable2, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0060");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, (double) (short) -1, (java.lang.Comparable) 1L, (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0061");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) (-1), (java.lang.Comparable) 1.0f, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0062");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, (double) ' ', (java.lang.Comparable) (byte) 0, (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0063");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) (short) -1, (java.lang.Comparable) "hi!", (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0064");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', 0.0d, (java.lang.Comparable) (-1.0f), 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0065");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) 0, (java.lang.Comparable) (byte) -1, (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0066");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) ' ', (java.lang.Comparable) (-1.0f), (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0067");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, (double) (byte) -1, (java.lang.Comparable) 100, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0068");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (double) 100, (java.lang.Comparable) 100.0f, (double) (byte) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0069");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, (double) ' ', (java.lang.Comparable) 0L, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0070");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, 0.0d, (java.lang.Comparable) 1L, (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0071");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) (-1.0f), (java.lang.Comparable) 100L, (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0072");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, (double) '#', (java.lang.Comparable) 'a', 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0073");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (double) 10, (java.lang.Comparable) (byte) 100, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0074");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, (double) (short) 10, (java.lang.Comparable) 0.0f, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0075");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (double) 100.0f, (java.lang.Comparable) false, (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0076");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', 1.0d, (java.lang.Comparable) (short) 10, (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0077");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) (byte) 10, (java.lang.Comparable) (-1L), 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0078");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (double) ' ', (java.lang.Comparable) 1L, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0079");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) (byte) 1, (java.lang.Comparable) 0, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0080");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), 0.0d, (java.lang.Comparable) ' ', (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0081");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, 1.0d, (java.lang.Comparable) (short) 1, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0082");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (double) 100.0f, (java.lang.Comparable) (short) -1, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0083");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) (-1L), (java.lang.Comparable) (byte) 10, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0084");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) (short) -1, (java.lang.Comparable) (-1.0f), 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0085");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (-1.0d), (java.lang.Comparable) 0.0f, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0086");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) 100, (java.lang.Comparable) (byte) 10, 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0087");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (-1.0d), (java.lang.Comparable) 'a', (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0088");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) (byte) 1, (java.lang.Comparable) 10.0f, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0089");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (double) 1L, (java.lang.Comparable) 100, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0090");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) '4', (java.lang.Comparable) ' ', (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0091");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, (double) ' ', (java.lang.Comparable) (byte) 1, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0092");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, 1.0d, (java.lang.Comparable) '#', (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0093");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', 0.0d, (java.lang.Comparable) 10.0f, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0094");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (double) 0L, (java.lang.Comparable) '#', (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0095");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (double) 100, (java.lang.Comparable) (short) 1, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0096");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, 100.0d, (java.lang.Comparable) 10.0d, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0097");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, 0.0d, (java.lang.Comparable) (-1), 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0098");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) 1L, (java.lang.Comparable) 10.0d, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0099");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (double) (byte) -1, (java.lang.Comparable) (short) 0, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0100");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, (double) (-1), (java.lang.Comparable) 1L, (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0101");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', 0.0d, (java.lang.Comparable) "hi!", (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0102");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) (byte) 0, (java.lang.Comparable) (byte) 100, (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0103");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) ' ', (java.lang.Comparable) 1L, (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0104");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (double) 10, (java.lang.Comparable) '#', (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0105");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) (-1L), (java.lang.Comparable) (short) -1, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0106");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, 10.0d, (java.lang.Comparable) 10.0d, (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0107");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (double) 1.0f, (java.lang.Comparable) 1, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0108");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) (byte) 10, (java.lang.Comparable) 0.0f, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0109");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) (byte) 1, (java.lang.Comparable) "", (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0110");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, (double) (byte) 0, (java.lang.Comparable) (short) 100, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0111");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) '4', (java.lang.Comparable) 100.0f, 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0112");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) (byte) 100, (java.lang.Comparable) (-1), 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0113");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, (-1.0d), (java.lang.Comparable) ' ', (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0114");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (double) '#', (java.lang.Comparable) 10.0d, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0115");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 1L, (java.lang.Comparable) 1.0d, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0116");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (double) 100.0f, (java.lang.Comparable) 1L, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0117");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) ' ', (java.lang.Comparable) (byte) 100, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0118");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) (-1), (java.lang.Comparable) "hi!", (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0119");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1), (double) (-1.0f), (java.lang.Comparable) (short) 1, (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0120");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, 0.0d, (java.lang.Comparable) (short) 10, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0121");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), 0.0d, comparable2, (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0122");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) '#', (java.lang.Comparable) (byte) 1, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0123");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) (short) 0, (java.lang.Comparable) true, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0124");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, (double) 100, (java.lang.Comparable) 0L, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0125");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, (double) (short) 0, (java.lang.Comparable) (byte) 100, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0126");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, (double) (byte) 10, (java.lang.Comparable) (short) 1, (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0127");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) (byte) 100, (java.lang.Comparable) (short) 10, (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0128");
        java.lang.Comparable comparable0 = null;
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 1, comparable2, 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0129");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) 10L, (java.lang.Comparable) 1.0f, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0130");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (double) (byte) -1, (java.lang.Comparable) (byte) 100, (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0131");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) (short) -1, (java.lang.Comparable) 0.0f, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0132");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) (byte) 100, comparable2, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0133");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, (double) 0.0f, (java.lang.Comparable) 1.0f, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0134");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) 100L, (java.lang.Comparable) (byte) 10, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0135");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (double) 100L, (java.lang.Comparable) 0L, (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0136");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (double) 'a', (java.lang.Comparable) (byte) 100, 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0137");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, 0.0d, (java.lang.Comparable) 1, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0138");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (double) (short) 100, (java.lang.Comparable) true, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0139");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (double) ' ', comparable2, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0140");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) 0.0f, (java.lang.Comparable) (byte) -1, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0141");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) (-1), (java.lang.Comparable) 1L, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0142");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) 10L, (java.lang.Comparable) (short) 10, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0143");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) (byte) 0, (java.lang.Comparable) 0, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0144");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) 10.0f, (java.lang.Comparable) 1.0f, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0145");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) (short) 10, (java.lang.Comparable) (short) 0, (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0146");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) (byte) 10, (java.lang.Comparable) ' ', (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0147");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) 10, (java.lang.Comparable) (-1.0d), 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0148");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) '#', (java.lang.Comparable) false, (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0149");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0d, (double) 0.0f, (java.lang.Comparable) 10L, (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0150");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, 0.0d, (java.lang.Comparable) (short) 100, (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0151");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) (-1L), (java.lang.Comparable) 100, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0152");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, 0.0d, (java.lang.Comparable) 100.0f, (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0153");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, 100.0d, (java.lang.Comparable) 10L, (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0154");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (double) 10L, (java.lang.Comparable) 0.0f, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0155");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) (short) -1, comparable2, (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0156");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) 100L, (java.lang.Comparable) true, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0157");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) 100.0f, (java.lang.Comparable) false, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0158");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, (double) (byte) 100, (java.lang.Comparable) ' ', (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0159");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, (double) (-1L), (java.lang.Comparable) (byte) -1, (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0160");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) (short) 100, (java.lang.Comparable) ' ', (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0161");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) (-1.0f), (java.lang.Comparable) (short) 100, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0162");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", 0.0d, (java.lang.Comparable) (short) 0, 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0163");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, 10.0d, (java.lang.Comparable) '4', 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0164");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, (double) '#', (java.lang.Comparable) 0.0d, (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0165");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) (short) 1, (java.lang.Comparable) 1.0d, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0166");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) (short) 10, (java.lang.Comparable) '#', (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0167");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) 1.0f, (java.lang.Comparable) 10L, (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0168");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) (short) 100, (java.lang.Comparable) 'a', 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0169");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) (-1), (java.lang.Comparable) "", (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0170");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) (byte) 1, comparable2, (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0171");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, 0.0d, (java.lang.Comparable) 1, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0172");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) 1L, (java.lang.Comparable) (byte) 1, 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0173");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, (double) (byte) 100, (java.lang.Comparable) false, (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0174");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (double) (byte) 10, (java.lang.Comparable) 100L, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0175");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, (double) 1.0f, (java.lang.Comparable) 0.0d, 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0176");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, (double) (byte) 0, (java.lang.Comparable) "", (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0177");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) 10.0f, (java.lang.Comparable) (short) -1, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0178");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, 0.0d, (java.lang.Comparable) (-1.0f), (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0179");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (double) 0L, (java.lang.Comparable) 100.0d, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0180");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0d, (double) 1L, (java.lang.Comparable) (-1L), (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0181");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) 'a', (java.lang.Comparable) 0.0f, (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0182");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 1.0f, (java.lang.Comparable) 1.0f, (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0183");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) (byte) 100, (java.lang.Comparable) 1.0d, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0184");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) (-1L), (java.lang.Comparable) (-1), (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0185");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) (byte) 10, (java.lang.Comparable) 1.0f, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0186");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, (double) 1, (java.lang.Comparable) (short) 1, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0187");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) 100L, (java.lang.Comparable) (-1L), (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0188");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) (byte) 100, (java.lang.Comparable) 0.0f, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0189");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, 1.0d, (java.lang.Comparable) "hi!", (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0190");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, (double) 0, (java.lang.Comparable) (-1.0f), (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0191");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) (-1.0f), (java.lang.Comparable) 0.0f, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0192");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, (double) (byte) 100, (java.lang.Comparable) 0, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0193");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, 0.0d, (java.lang.Comparable) 100L, (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0194");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) (byte) 10, (java.lang.Comparable) (byte) 0, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0195");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, (double) 1.0f, (java.lang.Comparable) 0, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0196");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) 100L, (java.lang.Comparable) 100, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0197");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) (short) 1, (java.lang.Comparable) "", (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0198");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, (double) (short) -1, (java.lang.Comparable) 0, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0199");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, (double) 0.0f, (java.lang.Comparable) 1L, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0200");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) (byte) 1, (java.lang.Comparable) (short) 1, (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0201");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, (double) 1.0f, (java.lang.Comparable) (byte) 1, 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0202");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 0L, (java.lang.Comparable) (short) 1, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0203");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (double) 1, (java.lang.Comparable) 10L, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0204");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (double) 10.0f, (java.lang.Comparable) 1.0d, 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0205");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (double) (short) -1, (java.lang.Comparable) 10.0f, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0206");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (double) (short) 100, (java.lang.Comparable) 10.0d, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0207");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (double) 0L, (java.lang.Comparable) (short) 0, (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0208");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, (double) (byte) 1, (java.lang.Comparable) (short) -1, (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0209");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (double) (-1.0f), (java.lang.Comparable) '#', 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0210");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (-1.0d), (java.lang.Comparable) 100, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0211");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), 100.0d, (java.lang.Comparable) 10, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0212");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, (double) 10L, (java.lang.Comparable) 0.0f, (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0213");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, (double) '4', comparable2, (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0214");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (double) (byte) 0, (java.lang.Comparable) 100, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0215");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, 1.0d, (java.lang.Comparable) (short) -1, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0216");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, (double) (byte) 100, (java.lang.Comparable) (byte) 0, 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0217");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (double) (short) 1, (java.lang.Comparable) 10.0f, (double) (byte) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0218");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 10.0f, (java.lang.Comparable) "hi!", (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0219");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) 10.0f, (java.lang.Comparable) (byte) 100, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0220");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, (double) 1.0f, (java.lang.Comparable) (-1L), (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0221");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) 10L, (java.lang.Comparable) (-1), (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0222");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) 10.0f, (java.lang.Comparable) (byte) 10, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0223");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (double) 1L, (java.lang.Comparable) 100, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0224");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) 100, (java.lang.Comparable) 10, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0225");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, (double) (short) 10, (java.lang.Comparable) 1L, (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0226");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (double) (short) -1, (java.lang.Comparable) "", 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0227");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, 0.0d, (java.lang.Comparable) 0.0f, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0228");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0d, 100.0d, (java.lang.Comparable) (-1.0d), (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0229");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (double) (-1L), comparable2, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0230");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) 'a', (java.lang.Comparable) (byte) 10, (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0231");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) (byte) 10, (java.lang.Comparable) 0.0d, (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0232");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) (byte) 10, (java.lang.Comparable) 1.0d, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0233");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, (double) 100.0f, (java.lang.Comparable) (byte) 10, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0234");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) 10.0f, comparable2, 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0235");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, (-1.0d), (java.lang.Comparable) 1L, (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0236");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, (double) 10.0f, (java.lang.Comparable) 1.0f, (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0237");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) 100L, (java.lang.Comparable) (byte) 100, (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0238");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) 10.0f, (java.lang.Comparable) 100.0f, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0239");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) 'a', (java.lang.Comparable) 100L, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0240");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, 1.0d, (java.lang.Comparable) "", (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0241");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) 0L, (java.lang.Comparable) 1.0d, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0242");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) (short) 100, (java.lang.Comparable) (short) 0, (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0243");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (double) (short) 100, comparable2, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0244");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (double) ' ', (java.lang.Comparable) 100, (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0245");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) (byte) -1, (java.lang.Comparable) 100.0f, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0246");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) (byte) 100, (java.lang.Comparable) 0, (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0247");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) 'a', (java.lang.Comparable) 1.0d, (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0248");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) 1.0f, (java.lang.Comparable) (short) -1, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0249");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0d, (double) (short) 100, (java.lang.Comparable) (short) 100, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0250");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, 0.0d, (java.lang.Comparable) (-1.0d), (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0251");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, 10.0d, (java.lang.Comparable) (short) 10, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0252");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) 'a', (java.lang.Comparable) true, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0253");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, 10.0d, (java.lang.Comparable) 100.0d, (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0254");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, (double) 1L, (java.lang.Comparable) 0.0f, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0255");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, 0.0d, (java.lang.Comparable) 100.0f, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0256");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) 0L, (java.lang.Comparable) '#', (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0257");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (double) 10L, (java.lang.Comparable) 'a', (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0258");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) (short) 0, (java.lang.Comparable) (-1.0f), (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0259");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, 0.0d, (java.lang.Comparable) (short) -1, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0260");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) 0, (java.lang.Comparable) (short) 10, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0261");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (double) (-1), (java.lang.Comparable) (byte) 0, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0262");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (-1.0d), (java.lang.Comparable) 'a', (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0263");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) (-1.0f), (java.lang.Comparable) 1, (double) (byte) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0264");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) 1, (java.lang.Comparable) (-1.0d), (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0265");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (double) '#', (java.lang.Comparable) 10L, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0266");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) (byte) 1, (java.lang.Comparable) (-1L), (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0267");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, (double) 0L, (java.lang.Comparable) (byte) 10, (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0268");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) 10, (java.lang.Comparable) 1L, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0269");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, (double) 0.0f, (java.lang.Comparable) 1.0f, (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0270");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, (double) (short) 0, (java.lang.Comparable) 1L, (double) (byte) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0271");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) 100, (java.lang.Comparable) 10.0d, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0272");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) 10.0f, (java.lang.Comparable) 0.0f, (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0273");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) 0, (java.lang.Comparable) 100L, (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0274");
        java.lang.Comparable comparable0 = null;
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, 10.0d, comparable2, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0275");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1), 10.0d, (java.lang.Comparable) (byte) 100, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0276");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) '#', comparable2, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0277");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', 0.0d, (java.lang.Comparable) '4', 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0278");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) (short) 10, (java.lang.Comparable) 1L, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0279");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) 100, (java.lang.Comparable) (-1), (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0280");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) (short) 10, (java.lang.Comparable) 1, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0281");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) 100, (java.lang.Comparable) (byte) 100, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0282");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) (short) 0, (java.lang.Comparable) 'a', 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0283");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, 0.0d, (java.lang.Comparable) (byte) 10, (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0284");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, 0.0d, (java.lang.Comparable) (short) 10, (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0285");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) 'a', (java.lang.Comparable) (byte) 1, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0286");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) 0L, (java.lang.Comparable) 1.0f, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0287");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) (short) 1, (java.lang.Comparable) 0L, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0288");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, (double) 1.0f, (java.lang.Comparable) 0, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0289");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) (-1), (java.lang.Comparable) (byte) 0, (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0290");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) (byte) 0, (java.lang.Comparable) (byte) 100, (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0291");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, (double) 100, (java.lang.Comparable) '4', (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0292");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, (double) 1L, (java.lang.Comparable) false, 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0293");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) 100L, (java.lang.Comparable) '#', (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0294");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, 100.0d, (java.lang.Comparable) "", 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0295");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (double) 1L, (java.lang.Comparable) 1.0d, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0296");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, (double) 0, (java.lang.Comparable) 10.0f, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0297");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, (double) 1L, (java.lang.Comparable) 100.0d, (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0298");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) (short) 1, (java.lang.Comparable) 100, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0299");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) 1.0f, (java.lang.Comparable) 10.0f, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0300");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) (byte) 1, (java.lang.Comparable) 10, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0301");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) (-1), comparable2, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0302");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (double) (short) 1, (java.lang.Comparable) 10L, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0303");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (double) (byte) 0, (java.lang.Comparable) (byte) 10, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0304");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, (double) 0, (java.lang.Comparable) 0.0d, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0305");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, (double) (short) 100, (java.lang.Comparable) (-1.0f), (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0306");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) (short) 10, (java.lang.Comparable) 0, (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0307");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) (short) 10, (java.lang.Comparable) 0L, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0308");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) (-1L), (java.lang.Comparable) (short) 100, 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0309");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0d, (double) (byte) 1, (java.lang.Comparable) (-1.0d), (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0310");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) (byte) 100, (java.lang.Comparable) 100L, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0311");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, 10.0d, (java.lang.Comparable) 100.0f, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0312");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (double) (short) 1, (java.lang.Comparable) 1.0d, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0313");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (double) 10L, (java.lang.Comparable) 1, (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0314");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (double) (byte) -1, (java.lang.Comparable) (-1), (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0315");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, (double) 100, (java.lang.Comparable) false, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0316");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (double) 10, (java.lang.Comparable) 1.0d, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0317");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 0, (java.lang.Comparable) (byte) 100, (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0318");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (double) (-1), (java.lang.Comparable) ' ', (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0319");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (double) (byte) 100, (java.lang.Comparable) (short) -1, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0320");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0d, (double) (-1L), (java.lang.Comparable) 1L, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0321");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) (byte) -1, (java.lang.Comparable) 0L, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0322");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) 0.0f, (java.lang.Comparable) (-1.0f), (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0323");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, 100.0d, (java.lang.Comparable) 100, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0324");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, (double) 0L, (java.lang.Comparable) (byte) 100, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0325");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) 1L, (java.lang.Comparable) 100.0f, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0326");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, 100.0d, (java.lang.Comparable) ' ', (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0327");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, (double) (byte) 0, (java.lang.Comparable) 10L, (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0328");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) (byte) 10, (java.lang.Comparable) 0.0f, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0329");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) 10.0f, (java.lang.Comparable) 0, (double) (byte) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0330");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) (short) 0, (java.lang.Comparable) 1.0d, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0331");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, (double) (byte) -1, (java.lang.Comparable) "", (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0332");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) 10.0f, (java.lang.Comparable) (short) 1, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0333");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) 10L, (java.lang.Comparable) 10L, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0334");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) (-1.0f), (java.lang.Comparable) (byte) 0, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0335");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) 'a', (java.lang.Comparable) (short) 100, (double) (byte) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0336");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), 1.0d, (java.lang.Comparable) (byte) 1, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0337");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, (double) (short) 10, comparable2, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0338");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, (double) (byte) 100, (java.lang.Comparable) (-1.0f), (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0339");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) (byte) -1, (java.lang.Comparable) 'a', (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0340");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, (double) 0.0f, (java.lang.Comparable) "", 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0341");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) 0, (java.lang.Comparable) (short) 10, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0342");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (double) (short) -1, (java.lang.Comparable) 100.0f, (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0343");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (-1.0d), (java.lang.Comparable) (byte) -1, (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0344");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) 0, (java.lang.Comparable) 10.0d, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0345");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, 1.0d, (java.lang.Comparable) "hi!", (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0346");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, (double) 10.0f, (java.lang.Comparable) (short) 10, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0347");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, (double) 10, (java.lang.Comparable) 100.0d, (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0348");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) (byte) 100, (java.lang.Comparable) (-1L), (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0349");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) 100L, (java.lang.Comparable) (byte) 100, 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0350");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) 0L, (java.lang.Comparable) ' ', (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0351");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) (short) 0, (java.lang.Comparable) (short) 1, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0352");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) 100L, (java.lang.Comparable) (short) 10, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0353");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (double) 0.0f, (java.lang.Comparable) ' ', (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0354");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) (byte) 1, (java.lang.Comparable) ' ', (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0355");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0d, (double) (-1.0f), (java.lang.Comparable) 100.0d, (double) (byte) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0356");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, (double) (-1.0f), (java.lang.Comparable) (short) 100, (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0357");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 100.0f, (java.lang.Comparable) '4', (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0358");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) 100.0f, (java.lang.Comparable) (short) 1, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0359");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, 1.0d, (java.lang.Comparable) (short) 1, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0360");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) 100.0f, (java.lang.Comparable) (byte) 1, (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0361");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, (double) (short) 0, (java.lang.Comparable) 100L, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0362");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) (byte) 1, (java.lang.Comparable) 100L, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0363");
        java.lang.Comparable comparable0 = null;
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, 10.0d, comparable2, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0364");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) (short) 1, (java.lang.Comparable) 100.0f, (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0365");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) (byte) 10, (java.lang.Comparable) (short) 100, 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0366");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) (short) 1, (java.lang.Comparable) 100L, (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0367");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, (double) 100, (java.lang.Comparable) (byte) -1, (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0368");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) 1, (java.lang.Comparable) 0.0f, (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0369");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) 0L, (java.lang.Comparable) "hi!", (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0370");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, 1.0d, (java.lang.Comparable) 1L, (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0371");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, (double) (byte) -1, (java.lang.Comparable) 100, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0372");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, (double) 1L, (java.lang.Comparable) (byte) 1, (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0373");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 100, (java.lang.Comparable) 1, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0374");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) (-1.0f), (java.lang.Comparable) "hi!", 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0375");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) (byte) 1, (java.lang.Comparable) (short) -1, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0376");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (double) (-1), (java.lang.Comparable) (byte) 1, (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0377");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) 10, (java.lang.Comparable) (-1), (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0378");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) (short) -1, (java.lang.Comparable) (short) 1, (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0379");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, 0.0d, (java.lang.Comparable) "hi!", (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0380");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, 10.0d, (java.lang.Comparable) 10.0f, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0381");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (double) (-1), (java.lang.Comparable) (-1.0d), (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0382");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) (short) 1, (java.lang.Comparable) (byte) 0, (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0383");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, (double) (short) 100, (java.lang.Comparable) 100, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0384");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, 10.0d, (java.lang.Comparable) false, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0385");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', 100.0d, (java.lang.Comparable) 0.0d, (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0386");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) '4', (java.lang.Comparable) (-1.0f), (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0387");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) 1.0f, (java.lang.Comparable) (short) -1, (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0388");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) (-1L), (java.lang.Comparable) 1.0d, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0389");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) '4', (java.lang.Comparable) 1.0d, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0390");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (double) 10.0f, (java.lang.Comparable) (short) 1, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0391");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, (double) 100.0f, (java.lang.Comparable) (short) -1, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0392");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) 1.0f, (java.lang.Comparable) true, (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0393");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) 10L, comparable2, (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0394");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) 100L, (java.lang.Comparable) 100, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0395");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (double) 0, (java.lang.Comparable) 0L, 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0396");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, (double) 1.0f, (java.lang.Comparable) false, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0397");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) 0, (java.lang.Comparable) 0.0d, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0398");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) 1, (java.lang.Comparable) (byte) -1, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0399");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, (double) (byte) 10, (java.lang.Comparable) (byte) 1, (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0400");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) (-1L), (java.lang.Comparable) 0.0f, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0401");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (double) '4', (java.lang.Comparable) 10.0d, (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0402");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0d, (double) (-1), (java.lang.Comparable) 100.0d, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0403");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) 'a', (java.lang.Comparable) "", 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0404");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, 100.0d, (java.lang.Comparable) 1L, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0405");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, (double) (byte) -1, (java.lang.Comparable) 1L, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0406");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (-1.0d), (java.lang.Comparable) 1, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0407");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (double) 100, (java.lang.Comparable) 10.0f, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0408");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) (-1), (java.lang.Comparable) (short) 100, (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0409");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, 10.0d, (java.lang.Comparable) (short) 1, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0410");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, 100.0d, (java.lang.Comparable) 'a', (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0411");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) ' ', (java.lang.Comparable) 0, (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0412");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), 0.0d, (java.lang.Comparable) 1L, (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0413");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, (double) 0.0f, (java.lang.Comparable) (short) 100, 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0414");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, (double) 100.0f, (java.lang.Comparable) (short) 0, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0415");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) 0L, (java.lang.Comparable) 0.0d, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0416");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, 0.0d, (java.lang.Comparable) 10.0d, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0417");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, (double) 10.0f, (java.lang.Comparable) 10L, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0418");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (double) (short) 0, (java.lang.Comparable) true, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0419");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) 0L, (java.lang.Comparable) 'a', 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0420");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) (-1), (java.lang.Comparable) ' ', (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0421");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", 0.0d, (java.lang.Comparable) '#', (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0422");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', 100.0d, (java.lang.Comparable) (short) 100, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0423");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, (double) 10L, (java.lang.Comparable) (-1.0f), (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0424");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) ' ', (java.lang.Comparable) '#', (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0425");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) 1L, (java.lang.Comparable) (-1.0f), (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0426");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1), 10.0d, (java.lang.Comparable) '4', (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0427");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (double) '#', (java.lang.Comparable) (byte) 1, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0428");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) 1.0f, (java.lang.Comparable) '4', 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0429");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) 10L, (java.lang.Comparable) 0.0d, (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0430");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) 100.0f, (java.lang.Comparable) 1.0f, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0431");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', 0.0d, (java.lang.Comparable) 10, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0432");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) 1L, (java.lang.Comparable) 'a', (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0433");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) '#', (java.lang.Comparable) (byte) 10, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0434");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) (short) -1, (java.lang.Comparable) 100.0d, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0435");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) (short) 0, (java.lang.Comparable) true, (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0436");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) (byte) 10, (java.lang.Comparable) 100L, (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0437");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) 'a', (java.lang.Comparable) 10, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0438");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1), 10.0d, (java.lang.Comparable) 0.0f, (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0439");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) (byte) -1, (java.lang.Comparable) (short) -1, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0440");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (double) 10, (java.lang.Comparable) (short) 100, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0441");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) (short) 1, (java.lang.Comparable) (byte) 10, (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0442");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) (short) 10, (java.lang.Comparable) 0.0f, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0443");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) (short) -1, (java.lang.Comparable) (-1L), (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0444");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) 10.0f, (java.lang.Comparable) 1, (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0445");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0d, (double) (short) 10, (java.lang.Comparable) "hi!", 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0446");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) 100.0f, (java.lang.Comparable) 10.0f, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0447");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) (byte) 0, (java.lang.Comparable) 1.0f, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0448");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (-1.0d), (java.lang.Comparable) false, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0449");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) (short) 1, (java.lang.Comparable) (short) 10, (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0450");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) (-1), (java.lang.Comparable) (short) 1, (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0451");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) '#', (java.lang.Comparable) 1L, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0452");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) 10.0f, (java.lang.Comparable) '4', (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0453");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) (byte) 0, (java.lang.Comparable) (-1.0f), (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0454");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1), (double) 1L, (java.lang.Comparable) "", (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0455");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (double) (short) 0, (java.lang.Comparable) (-1.0f), (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0456");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) (-1.0f), (java.lang.Comparable) (byte) 0, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0457");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) 1.0f, (java.lang.Comparable) 0.0d, (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0458");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1), (double) '4', (java.lang.Comparable) 100.0d, (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0459");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) (byte) 0, (java.lang.Comparable) 10L, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0460");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (double) (byte) 0, (java.lang.Comparable) '4', 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0461");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, (double) (-1), (java.lang.Comparable) (-1.0d), (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0462");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (double) (byte) 0, (java.lang.Comparable) (-1L), (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0463");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, (double) (short) 1, (java.lang.Comparable) "hi!", (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0464");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1), (double) (byte) -1, (java.lang.Comparable) true, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0465");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, (double) (byte) 10, (java.lang.Comparable) 0L, (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0466");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (double) (-1L), (java.lang.Comparable) (byte) 1, (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0467");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, (double) 0L, (java.lang.Comparable) (byte) 1, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0468");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1), (double) 0, (java.lang.Comparable) 100.0d, 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0469");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) 0.0f, (java.lang.Comparable) ' ', (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0470");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, 1.0d, (java.lang.Comparable) 100L, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0471");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) (short) 100, (java.lang.Comparable) (short) 1, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0472");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) '#', (java.lang.Comparable) (-1L), (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0473");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, (-1.0d), (java.lang.Comparable) (-1.0d), (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0474");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1), 0.0d, (java.lang.Comparable) 1.0d, (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0475");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (double) 0, (java.lang.Comparable) (-1.0d), (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0476");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 10.0f, (java.lang.Comparable) (-1.0f), (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0477");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", 0.0d, (java.lang.Comparable) (byte) 1, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0478");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, (double) (byte) -1, (java.lang.Comparable) 0.0f, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0479");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) 100, (java.lang.Comparable) (short) 100, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0480");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) 100L, (java.lang.Comparable) (-1.0f), (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0481");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, (double) 10, comparable2, 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0482");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) 100, (java.lang.Comparable) 1.0f, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0483");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) ' ', (java.lang.Comparable) 0.0f, (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0484");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), 10.0d, (java.lang.Comparable) ' ', (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0485");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) (byte) -1, (java.lang.Comparable) 100L, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0486");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', 0.0d, (java.lang.Comparable) 'a', (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0487");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, (double) 'a', (java.lang.Comparable) 0.0f, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0488");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) 'a', (java.lang.Comparable) (byte) 10, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0489");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (double) 100, comparable2, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0490");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) (short) -1, (java.lang.Comparable) '#', (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0491");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) '#', (java.lang.Comparable) '#', (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0492");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, (double) (-1), (java.lang.Comparable) 10, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0493");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (double) 10.0f, (java.lang.Comparable) 1L, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0494");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, (double) 10, (java.lang.Comparable) (byte) -1, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0495");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (double) 10L, (java.lang.Comparable) (byte) 0, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0496");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, (double) 0, (java.lang.Comparable) (short) 100, (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0497");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) (short) 1, (java.lang.Comparable) 10.0d, (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0498");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0d, 10.0d, (java.lang.Comparable) 100.0f, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0499");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) (-1.0f), (java.lang.Comparable) ' ', (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression0.test0500");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) (byte) 100, (java.lang.Comparable) false, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}


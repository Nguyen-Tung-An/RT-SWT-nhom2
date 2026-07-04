import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_047_Regression5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2501");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) (byte) 0, (java.lang.Comparable) "hi!", (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2502");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', 1.0d, (java.lang.Comparable) false, (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2503");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, (double) 0.0f, comparable2, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2504");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) 100.0f, (java.lang.Comparable) (-1.0d), (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2505");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) 'a', (java.lang.Comparable) "hi!", (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2506");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, (double) 0L, (java.lang.Comparable) 'a', (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2507");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) 0, (java.lang.Comparable) 1.0d, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2508");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), 0.0d, (java.lang.Comparable) (-1.0f), (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2509");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (-1.0d), (java.lang.Comparable) 1.0d, (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2510");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (double) 10.0f, (java.lang.Comparable) 0, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2511");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', 0.0d, (java.lang.Comparable) 100.0d, (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2512");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) 100.0f, (java.lang.Comparable) 100L, (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2513");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0d, (double) 1, (java.lang.Comparable) (short) 100, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2514");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, 100.0d, (java.lang.Comparable) (byte) 0, 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2515");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, (double) (-1.0f), (java.lang.Comparable) (short) 0, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2516");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (double) (byte) -1, (java.lang.Comparable) 0.0f, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2517");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) (byte) 100, (java.lang.Comparable) 100, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2518");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (double) 1.0f, (java.lang.Comparable) (byte) 10, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2519");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, (double) (byte) 100, (java.lang.Comparable) 0.0f, (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2520");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (double) (-1.0f), (java.lang.Comparable) (short) 0, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2521");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), 0.0d, comparable2, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2522");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) 10L, (java.lang.Comparable) false, (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2523");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) (byte) 0, (java.lang.Comparable) 10, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2524");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, (double) (short) 100, (java.lang.Comparable) (short) 0, (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2525");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, (double) (-1), (java.lang.Comparable) 100.0d, (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2526");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) (byte) 100, (java.lang.Comparable) true, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2527");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) 0, (java.lang.Comparable) 10L, (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2528");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 1, (java.lang.Comparable) '#', (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2529");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (double) (short) 0, (java.lang.Comparable) (-1), (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2530");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, 1.0d, (java.lang.Comparable) (short) -1, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2531");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) (short) 10, (java.lang.Comparable) 1L, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2532");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) (short) 10, (java.lang.Comparable) (short) 1, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2533");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1), (double) 'a', (java.lang.Comparable) 100.0d, (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2534");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), 0.0d, (java.lang.Comparable) 1.0f, (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2535");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, 1.0d, (java.lang.Comparable) (-1.0d), (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2536");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, 1.0d, (java.lang.Comparable) ' ', (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2537");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) ' ', (java.lang.Comparable) 0, (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2538");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) (short) 1, (java.lang.Comparable) 0, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2539");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) (short) 10, (java.lang.Comparable) 0.0d, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2540");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (-1.0d), (java.lang.Comparable) 0.0f, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2541");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0d, (double) (-1.0f), comparable2, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2542");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 0, (java.lang.Comparable) 1.0d, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2543");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (double) '4', (java.lang.Comparable) (short) 1, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2544");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), 0.0d, (java.lang.Comparable) "", (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2545");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0d, (double) 10L, (java.lang.Comparable) false, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2546");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) (byte) 0, (java.lang.Comparable) 1L, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2547");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) 0.0f, (java.lang.Comparable) 10, (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2548");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) '#', (java.lang.Comparable) 100.0d, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2549");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, (double) 0, (java.lang.Comparable) (byte) 10, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2550");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (double) (byte) -1, (java.lang.Comparable) '4', (double) (byte) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2551");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) 'a', comparable2, (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2552");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (double) (-1), (java.lang.Comparable) (byte) 0, (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2553");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, (double) 'a', (java.lang.Comparable) (short) 100, (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2554");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (-1.0d), (java.lang.Comparable) (-1L), (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2555");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (double) (byte) -1, (java.lang.Comparable) (short) -1, (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2556");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) 0, (java.lang.Comparable) "hi!", 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2557");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', 100.0d, (java.lang.Comparable) 0L, (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2558");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) (short) 1, (java.lang.Comparable) (byte) -1, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2559");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 0.0f, (java.lang.Comparable) 0.0d, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2560");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, 1.0d, comparable2, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2561");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) '#', (java.lang.Comparable) (byte) 100, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2562");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, (double) (short) 1, (java.lang.Comparable) 10.0d, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2563");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) (short) -1, (java.lang.Comparable) 100, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2564");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) 0L, (java.lang.Comparable) 10.0d, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2565");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, (double) 100L, (java.lang.Comparable) (byte) -1, (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2566");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (double) 100, (java.lang.Comparable) (byte) 100, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2567");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) (-1), (java.lang.Comparable) (-1L), (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2568");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) '4', (java.lang.Comparable) true, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2569");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, 10.0d, (java.lang.Comparable) (byte) 0, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2570");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) 10L, (java.lang.Comparable) 10L, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2571");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (double) ' ', (java.lang.Comparable) '4', (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2572");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (double) (short) 100, (java.lang.Comparable) 10, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2573");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) (byte) 10, (java.lang.Comparable) 10.0d, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2574");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, 0.0d, (java.lang.Comparable) 1L, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2575");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (double) 100.0f, (java.lang.Comparable) "", (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2576");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, (double) 1.0f, (java.lang.Comparable) 0.0f, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2577");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) 100L, (java.lang.Comparable) (byte) 0, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2578");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) (byte) 10, (java.lang.Comparable) 0.0f, (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2579");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) (-1L), (java.lang.Comparable) true, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2580");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (double) 100L, (java.lang.Comparable) (byte) 1, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2581");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) (-1), (java.lang.Comparable) 1, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2582");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, 0.0d, (java.lang.Comparable) (short) -1, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2583");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, 0.0d, (java.lang.Comparable) (-1L), 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2584");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, (double) 10L, (java.lang.Comparable) (short) 0, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2585");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (double) 0, (java.lang.Comparable) (short) 100, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2586");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, 100.0d, (java.lang.Comparable) 0.0f, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2587");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, (double) (byte) 100, (java.lang.Comparable) (short) 1, (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2588");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, (double) 10.0f, (java.lang.Comparable) false, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2589");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) 1L, (java.lang.Comparable) (byte) 10, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2590");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (double) (byte) 0, (java.lang.Comparable) (short) 0, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2591");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, (double) (byte) 10, (java.lang.Comparable) (short) -1, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2592");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (double) (short) 10, (java.lang.Comparable) (short) 10, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2593");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) ' ', comparable2, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2594");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0d, (double) 100L, (java.lang.Comparable) 1, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2595");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), 0.0d, (java.lang.Comparable) 0, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2596");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) 10L, (java.lang.Comparable) 1.0f, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2597");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (double) (short) 100, (java.lang.Comparable) (byte) 1, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2598");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) 0.0f, (java.lang.Comparable) 100.0f, (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2599");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) (byte) 1, (java.lang.Comparable) 10L, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2600");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) 100L, (java.lang.Comparable) (byte) 10, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2601");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), 0.0d, (java.lang.Comparable) 1, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2602");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) 1L, (java.lang.Comparable) "", (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2603");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, (double) 100, (java.lang.Comparable) ' ', 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2604");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", 10.0d, (java.lang.Comparable) 0, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2605");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) (byte) 1, (java.lang.Comparable) 1.0f, (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2606");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, (double) 1.0f, (java.lang.Comparable) '4', (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2607");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) 10L, (java.lang.Comparable) ' ', 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2608");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, (double) (-1), (java.lang.Comparable) (short) 0, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2609");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) ' ', (java.lang.Comparable) (byte) 10, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2610");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1), (-1.0d), (java.lang.Comparable) 100, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2611");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) 1, (java.lang.Comparable) "hi!", 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2612");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, (double) (byte) 1, (java.lang.Comparable) (short) -1, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2613");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, (double) 0, (java.lang.Comparable) 100.0f, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2614");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) 100, (java.lang.Comparable) 100.0f, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2615");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, (double) (byte) 0, (java.lang.Comparable) 10.0d, (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2616");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) 0, (java.lang.Comparable) 1.0f, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2617");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1), 0.0d, comparable2, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2618");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) 0.0f, (java.lang.Comparable) 0.0f, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2619");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, (double) 1L, (java.lang.Comparable) 0.0f, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2620");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, (double) (byte) 1, (java.lang.Comparable) (short) 0, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2621");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) (short) 100, (java.lang.Comparable) true, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2622");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (double) 100.0f, (java.lang.Comparable) 100.0f, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2623");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, 100.0d, (java.lang.Comparable) 10L, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2624");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) (byte) -1, (java.lang.Comparable) (short) 0, (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2625");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (-1.0d), (java.lang.Comparable) (short) 100, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2626");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) (-1), comparable2, (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2627");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (double) 10.0f, (java.lang.Comparable) 10, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2628");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (double) (short) -1, (java.lang.Comparable) 10L, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2629");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) (-1), (java.lang.Comparable) (-1), (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2630");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, (double) 1.0f, (java.lang.Comparable) 10.0f, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2631");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (double) (short) 10, (java.lang.Comparable) (byte) 10, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2632");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, (double) (-1.0f), (java.lang.Comparable) false, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2633");
        java.lang.Comparable comparable0 = null;
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (-1.0d), comparable2, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2634");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) (short) 100, (java.lang.Comparable) "hi!", 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2635");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, (double) (byte) -1, comparable2, (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2636");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', 100.0d, (java.lang.Comparable) (short) 1, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2637");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) (byte) -1, (java.lang.Comparable) (-1.0d), (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2638");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, (double) (short) 1, (java.lang.Comparable) 1L, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2639");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (double) 1, (java.lang.Comparable) (byte) 10, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2640");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, 0.0d, (java.lang.Comparable) (-1.0d), (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2641");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (-1.0d), (java.lang.Comparable) "hi!", (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2642");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) (-1), (java.lang.Comparable) (byte) 1, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2643");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) 1L, (java.lang.Comparable) (-1.0d), (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2644");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) (byte) 0, (java.lang.Comparable) 1, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2645");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) 10, (java.lang.Comparable) 10, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2646");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) (byte) -1, (java.lang.Comparable) 'a', (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2647");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, 100.0d, (java.lang.Comparable) (byte) 10, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2648");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, (double) (short) 100, (java.lang.Comparable) (-1.0d), 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2649");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) (short) 100, (java.lang.Comparable) 1L, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2650");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, (-1.0d), (java.lang.Comparable) 1.0f, (double) (byte) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2651");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) (short) 10, (java.lang.Comparable) (byte) 1, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2652");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 0, (java.lang.Comparable) 100.0d, (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2653");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, (double) 1.0f, (java.lang.Comparable) (-1), (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2654");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, (double) 0.0f, (java.lang.Comparable) '#', (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2655");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, (double) 'a', (java.lang.Comparable) 100.0d, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2656");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (double) 10L, (java.lang.Comparable) (byte) 10, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2657");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, (double) 'a', (java.lang.Comparable) '#', (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2658");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) 100.0f, (java.lang.Comparable) 10, (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2659");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 1.0f, (java.lang.Comparable) 0.0f, (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2660");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, 100.0d, (java.lang.Comparable) 10.0d, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2661");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) (short) 100, (java.lang.Comparable) false, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2662");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, 0.0d, (java.lang.Comparable) 0, (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2663");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, (double) (-1.0f), (java.lang.Comparable) (byte) 100, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2664");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) 'a', (java.lang.Comparable) '4', (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2665");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, (double) (-1L), (java.lang.Comparable) 0.0f, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2666");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (-1.0d), (java.lang.Comparable) 0, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2667");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, (double) (short) 100, (java.lang.Comparable) (short) 10, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2668");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (double) 0.0f, (java.lang.Comparable) 100.0d, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2669");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) (-1.0f), (java.lang.Comparable) 0.0d, (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2670");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) (short) 10, (java.lang.Comparable) 100.0d, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2671");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, (double) (byte) 10, (java.lang.Comparable) (short) 0, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2672");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) (short) 1, (java.lang.Comparable) "", (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2673");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (-1.0d), (java.lang.Comparable) '4', (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2674");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) (short) 100, (java.lang.Comparable) false, (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2675");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) ' ', (java.lang.Comparable) (short) 10, (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2676");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 10, (java.lang.Comparable) 10L, (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2677");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) 0, (java.lang.Comparable) "", (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2678");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, (double) 100.0f, (java.lang.Comparable) 0, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2679");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) (byte) -1, (java.lang.Comparable) 0L, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2680");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) 100.0f, (java.lang.Comparable) 100L, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2681");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, 0.0d, (java.lang.Comparable) (-1L), (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2682");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) 0, (java.lang.Comparable) '#', (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2683");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, (double) (short) 1, (java.lang.Comparable) "hi!", (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2684");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) 100, (java.lang.Comparable) ' ', (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2685");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) ' ', (java.lang.Comparable) (byte) 100, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2686");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', 1.0d, (java.lang.Comparable) (short) 10, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2687");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, 0.0d, (java.lang.Comparable) 10, (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2688");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) 0, (java.lang.Comparable) 0.0f, (double) (byte) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2689");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (double) (byte) -1, (java.lang.Comparable) 100L, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2690");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, (double) 10L, (java.lang.Comparable) (-1.0d), (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2691");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) (short) -1, (java.lang.Comparable) 1.0d, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2692");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) (byte) 10, (java.lang.Comparable) 1L, (double) (byte) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2693");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) 0.0f, (java.lang.Comparable) false, (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2694");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 100, (java.lang.Comparable) 100.0d, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2695");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0d, 10.0d, (java.lang.Comparable) (byte) 0, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2696");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) 0L, (java.lang.Comparable) (-1.0f), (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2697");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, (double) 'a', (java.lang.Comparable) (byte) 0, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2698");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0d, 10.0d, (java.lang.Comparable) (byte) 0, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2699");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) (byte) 100, (java.lang.Comparable) 0.0d, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2700");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, (double) 10L, (java.lang.Comparable) "", (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2701");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0d, (double) '#', (java.lang.Comparable) 0.0d, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2702");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (double) (short) 100, (java.lang.Comparable) 1.0f, 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2703");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, (double) 1.0f, (java.lang.Comparable) (-1.0d), (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2704");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) 'a', comparable2, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2705");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) 100, (java.lang.Comparable) '4', (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2706");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) 1, (java.lang.Comparable) 0L, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2707");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (double) 100.0f, (java.lang.Comparable) (-1L), (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2708");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) 100, (java.lang.Comparable) (-1), (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2709");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) 0L, (java.lang.Comparable) 10.0d, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2710");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, 100.0d, (java.lang.Comparable) ' ', (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2711");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, (double) 'a', (java.lang.Comparable) "hi!", 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2712");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) (-1.0f), (java.lang.Comparable) "hi!", (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2713");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) 0.0f, (java.lang.Comparable) "hi!", (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2714");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) (-1L), (java.lang.Comparable) 'a', (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2715");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) (byte) 0, (java.lang.Comparable) 100, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2716");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) (byte) -1, (java.lang.Comparable) (byte) 100, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2717");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) '4', (java.lang.Comparable) 0.0d, (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2718");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) 10L, (java.lang.Comparable) (-1L), 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2719");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) 1, (java.lang.Comparable) 0, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2720");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) (byte) 100, (java.lang.Comparable) (byte) 10, (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2721");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) 0, (java.lang.Comparable) 0.0f, (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2722");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) 100.0f, (java.lang.Comparable) (-1.0f), (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2723");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) 100, (java.lang.Comparable) 100.0d, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2724");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, 0.0d, (java.lang.Comparable) (byte) 1, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2725");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (double) 10.0f, (java.lang.Comparable) 1, (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2726");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (-1.0d), (java.lang.Comparable) (-1), (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2727");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) (short) 1, (java.lang.Comparable) true, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2728");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (double) 100, comparable2, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2729");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), 0.0d, (java.lang.Comparable) "", 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2730");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) 1.0f, (java.lang.Comparable) '4', (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2731");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0d, (double) 10, (java.lang.Comparable) 0L, (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2732");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (double) (short) 100, (java.lang.Comparable) (-1), (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2733");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, 100.0d, (java.lang.Comparable) (byte) 100, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2734");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) '4', (java.lang.Comparable) 100.0f, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2735");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, 1.0d, (java.lang.Comparable) (byte) 10, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2736");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, (double) 0.0f, (java.lang.Comparable) (short) 100, (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2737");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) (byte) 100, (java.lang.Comparable) (-1.0f), (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2738");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), 0.0d, comparable2, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2739");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, (double) 100, comparable2, (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2740");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) 0.0f, (java.lang.Comparable) 1.0d, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2741");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (double) (byte) 10, (java.lang.Comparable) (byte) 0, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2742");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, 10.0d, (java.lang.Comparable) "hi!", (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2743");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) (short) 0, (java.lang.Comparable) 10.0f, (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2744");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) (short) 100, (java.lang.Comparable) 10, (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2745");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) (-1L), (java.lang.Comparable) 1.0f, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2746");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) 1, (java.lang.Comparable) 'a', (double) (byte) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2747");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, (double) (byte) -1, (java.lang.Comparable) 1, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2748");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) 1L, (java.lang.Comparable) (short) 100, (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2749");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, (double) 100.0f, (java.lang.Comparable) 1L, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2750");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) (short) 100, (java.lang.Comparable) (short) 10, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2751");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, (double) (byte) 100, (java.lang.Comparable) 1, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2752");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) 10.0f, (java.lang.Comparable) 10, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2753");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) 0.0f, (java.lang.Comparable) 0L, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2754");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) 10, (java.lang.Comparable) (short) 10, (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2755");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, (double) (byte) 10, (java.lang.Comparable) 1.0d, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2756");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 100L, (java.lang.Comparable) 10, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2757");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) 0, (java.lang.Comparable) (byte) 1, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2758");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, (double) (-1), (java.lang.Comparable) (byte) 0, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2759");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) 0L, comparable2, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2760");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) (-1), (java.lang.Comparable) (byte) 1, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2761");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) 0.0f, (java.lang.Comparable) (-1L), (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2762");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) (byte) 10, (java.lang.Comparable) 100.0d, (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2763");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) 1.0f, (java.lang.Comparable) (-1), 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2764");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, (double) 0, (java.lang.Comparable) "", (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2765");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) 0, (java.lang.Comparable) 10.0d, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2766");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) 10L, (java.lang.Comparable) 1, 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2767");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (double) 100.0f, (java.lang.Comparable) false, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2768");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (-1.0d), (java.lang.Comparable) (short) 0, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2769");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) (short) 100, (java.lang.Comparable) 100.0f, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2770");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, 100.0d, (java.lang.Comparable) 10.0f, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2771");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, (double) 1L, (java.lang.Comparable) 100, (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2772");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, 0.0d, (java.lang.Comparable) 10L, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2773");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 100, (java.lang.Comparable) (byte) 0, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2774");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (double) (byte) 10, (java.lang.Comparable) (byte) 1, (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2775");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, 100.0d, (java.lang.Comparable) 100.0f, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2776");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) (short) 10, (java.lang.Comparable) (-1.0d), (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2777");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) 0, (java.lang.Comparable) (short) -1, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2778");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, (double) 'a', (java.lang.Comparable) (-1.0d), (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2779");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) (short) 0, (java.lang.Comparable) (short) 100, (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2780");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, (double) 'a', (java.lang.Comparable) (-1), (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2781");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) (short) 1, (java.lang.Comparable) (-1.0d), (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2782");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) (-1L), (java.lang.Comparable) 100.0f, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2783");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (double) 'a', (java.lang.Comparable) (short) 1, (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2784");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) (-1), (java.lang.Comparable) 100, (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2785");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (double) 1L, (java.lang.Comparable) (short) 1, (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2786");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) (short) 100, (java.lang.Comparable) (byte) 1, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2787");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, 100.0d, (java.lang.Comparable) (byte) -1, (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2788");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (double) (short) 100, comparable2, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2789");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) (short) 100, (java.lang.Comparable) 100.0d, 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2790");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) 1, (java.lang.Comparable) (byte) -1, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2791");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, 1.0d, (java.lang.Comparable) 100.0f, 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2792");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, (double) 0L, (java.lang.Comparable) 10.0f, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2793");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (double) 1, (java.lang.Comparable) '#', (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2794");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) 100L, (java.lang.Comparable) '#', (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2795");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (double) (short) 1, (java.lang.Comparable) 100, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2796");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, 0.0d, (java.lang.Comparable) 0.0d, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2797");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) '#', (java.lang.Comparable) 1, (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2798");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (double) (byte) 100, (java.lang.Comparable) (short) 1, (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2799");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) 100L, (java.lang.Comparable) 0, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2800");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, (double) 1.0f, (java.lang.Comparable) 1.0d, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2801");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) 0.0f, (java.lang.Comparable) 0.0f, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2802");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) 100, (java.lang.Comparable) (short) 1, (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2803");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (double) 0, (java.lang.Comparable) 1.0f, (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2804");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) (short) 1, (java.lang.Comparable) (short) -1, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2805");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (double) 0L, (java.lang.Comparable) '#', (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2806");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) 10, (java.lang.Comparable) (short) 100, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2807");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) (-1.0f), (java.lang.Comparable) 0.0d, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2808");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, (double) 100L, (java.lang.Comparable) "hi!", 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2809");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0d, (double) 100, (java.lang.Comparable) 0, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2810");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, 1.0d, (java.lang.Comparable) "", (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2811");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (-1.0d), (java.lang.Comparable) (byte) 100, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2812");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) ' ', (java.lang.Comparable) (-1.0f), (double) (byte) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2813");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) (short) -1, (java.lang.Comparable) 100L, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2814");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) 0L, (java.lang.Comparable) 100L, (double) (byte) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2815");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) (byte) 0, (java.lang.Comparable) '4', (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2816");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) ' ', comparable2, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2817");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) 100, (java.lang.Comparable) true, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2818");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (double) 0.0f, (java.lang.Comparable) 100.0f, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2819");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) ' ', (java.lang.Comparable) true, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2820");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) (short) 10, (java.lang.Comparable) (short) 100, 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2821");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, (double) (byte) 0, (java.lang.Comparable) 100.0d, (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2822");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (double) 'a', (java.lang.Comparable) 100.0d, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2823");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) (-1L), (java.lang.Comparable) false, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2824");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), 0.0d, (java.lang.Comparable) "", (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2825");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, (double) 10.0f, (java.lang.Comparable) 1.0f, (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2826");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (double) (-1.0f), (java.lang.Comparable) (byte) 0, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2827");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) (-1.0f), comparable2, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2828");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) 1.0f, (java.lang.Comparable) '4', (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2829");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, (double) (-1L), (java.lang.Comparable) (short) 1, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2830");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) (short) 10, (java.lang.Comparable) 10, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2831");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, (double) 0.0f, (java.lang.Comparable) 'a', (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2832");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) (-1L), (java.lang.Comparable) (byte) -1, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2833");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, 0.0d, (java.lang.Comparable) (byte) 10, (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2834");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, 0.0d, (java.lang.Comparable) (-1L), (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2835");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, (double) (-1.0f), (java.lang.Comparable) 1.0f, (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2836");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) 1, (java.lang.Comparable) 100, 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2837");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, 0.0d, (java.lang.Comparable) '#', (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2838");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (double) 0L, (java.lang.Comparable) ' ', (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2839");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (double) (byte) 1, (java.lang.Comparable) 0L, (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2840");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, 0.0d, (java.lang.Comparable) 0.0f, (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2841");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, (double) 1.0f, (java.lang.Comparable) '4', (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2842");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) (byte) 0, comparable2, (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2843");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) 1.0f, (java.lang.Comparable) 10, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2844");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, (double) (short) -1, (java.lang.Comparable) (byte) 1, (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2845");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, (double) (byte) 100, comparable2, (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2846");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) (short) 100, (java.lang.Comparable) 1.0f, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2847");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) '#', (java.lang.Comparable) 10L, 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2848");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) 'a', (java.lang.Comparable) (byte) 1, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2849");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) 10, (java.lang.Comparable) 0, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2850");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) 10L, (java.lang.Comparable) (byte) 1, 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2851");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (double) (-1.0f), (java.lang.Comparable) (short) 100, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2852");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (double) (byte) 10, (java.lang.Comparable) '4', (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2853");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (double) 10.0f, (java.lang.Comparable) 100.0d, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2854");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) 100.0f, (java.lang.Comparable) (byte) 10, 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2855");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (-1.0d), (java.lang.Comparable) 0, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2856");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), 0.0d, (java.lang.Comparable) "", (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2857");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0d, 0.0d, (java.lang.Comparable) (byte) 0, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2858");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, 0.0d, (java.lang.Comparable) (short) 1, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2859");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) (byte) 1, (java.lang.Comparable) (-1L), (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2860");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) (short) 0, (java.lang.Comparable) 10, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2861");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, (-1.0d), (java.lang.Comparable) (byte) -1, (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2862");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) (-1), (java.lang.Comparable) 0.0f, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2863");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, 10.0d, (java.lang.Comparable) false, (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2864");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, (double) (-1), (java.lang.Comparable) '#', (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2865");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) (byte) 0, (java.lang.Comparable) '#', (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2866");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (double) (-1L), (java.lang.Comparable) 1L, (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2867");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) 10, (java.lang.Comparable) (byte) -1, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2868");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) (byte) 0, (java.lang.Comparable) "hi!", (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2869");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, (double) '4', (java.lang.Comparable) 10, (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2870");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, (double) 100L, (java.lang.Comparable) 100.0d, (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2871");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) 10L, (java.lang.Comparable) (-1L), (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2872");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, 1.0d, (java.lang.Comparable) "hi!", (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2873");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, (double) 0, (java.lang.Comparable) 'a', (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2874");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, (double) '4', (java.lang.Comparable) '#', (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2875");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) 1L, (java.lang.Comparable) (byte) 0, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2876");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, (double) 'a', (java.lang.Comparable) 'a', (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2877");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, 100.0d, (java.lang.Comparable) (short) 0, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2878");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) (short) 10, (java.lang.Comparable) 100, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2879");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (double) (short) 1, (java.lang.Comparable) "", (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2880");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, (double) (short) 1, (java.lang.Comparable) (short) 0, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2881");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) (byte) 0, (java.lang.Comparable) (short) 1, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2882");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", 0.0d, (java.lang.Comparable) (byte) 0, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2883");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) (short) 100, (java.lang.Comparable) 10.0f, (double) (byte) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2884");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, 100.0d, (java.lang.Comparable) (byte) 100, (double) (byte) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2885");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, (double) 100.0f, (java.lang.Comparable) (short) 100, (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2886");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (-1.0d), (java.lang.Comparable) (-1), (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2887");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (double) 10L, comparable2, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2888");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) 0, (java.lang.Comparable) (-1), (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2889");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, (double) (byte) 1, (java.lang.Comparable) 0.0f, (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2890");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, 1.0d, (java.lang.Comparable) (-1.0f), (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2891");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, (double) (short) 1, (java.lang.Comparable) (byte) 1, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2892");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) (-1), (java.lang.Comparable) (-1L), (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2893");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) 0L, (java.lang.Comparable) ' ', (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2894");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, 100.0d, (java.lang.Comparable) 0.0f, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2895");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, (double) (short) -1, (java.lang.Comparable) false, (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2896");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) 1, (java.lang.Comparable) 10.0d, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2897");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) (byte) 10, (java.lang.Comparable) (short) 0, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2898");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) (-1L), (java.lang.Comparable) '#', (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2899");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, 0.0d, (java.lang.Comparable) 10L, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2900");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, 0.0d, (java.lang.Comparable) 10, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2901");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) (byte) 1, (java.lang.Comparable) 0.0f, (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2902");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, (double) ' ', (java.lang.Comparable) ' ', (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2903");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) (short) 100, (java.lang.Comparable) 0.0d, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2904");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) 'a', comparable2, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2905");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) 100, (java.lang.Comparable) 1, (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2906");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) 100.0f, (java.lang.Comparable) ' ', (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2907");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, (double) 10, (java.lang.Comparable) 1, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2908");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) (short) -1, (java.lang.Comparable) (-1L), (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2909");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, 100.0d, (java.lang.Comparable) 100, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2910");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (-1.0d), (java.lang.Comparable) (-1L), (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2911");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) (byte) 1, (java.lang.Comparable) 'a', (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2912");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (double) 100.0f, (java.lang.Comparable) '#', (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2913");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) 'a', (java.lang.Comparable) ' ', (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2914");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (double) (short) 0, (java.lang.Comparable) (byte) 1, (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2915");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, (double) (byte) 1, (java.lang.Comparable) 100, (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2916");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 10.0f, (java.lang.Comparable) 1.0f, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2917");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) 1L, (java.lang.Comparable) 10.0d, (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2918");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) 0, (java.lang.Comparable) (short) 0, (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2919");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, (double) 'a', (java.lang.Comparable) 'a', (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2920");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) (byte) 10, (java.lang.Comparable) 0.0d, (double) (byte) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2921");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, (double) 1L, (java.lang.Comparable) '4', 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2922");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) 10.0f, (java.lang.Comparable) '#', (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2923");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) (-1), (java.lang.Comparable) '#', 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2924");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (double) (short) 100, (java.lang.Comparable) 0, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2925");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, 10.0d, (java.lang.Comparable) '#', (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2926");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) 0L, (java.lang.Comparable) (byte) -1, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2927");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) '#', (java.lang.Comparable) 1.0d, (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2928");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) 100.0f, (java.lang.Comparable) 100.0d, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2929");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) 0L, (java.lang.Comparable) 0.0d, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2930");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) (short) 1, (java.lang.Comparable) (short) 1, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2931");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 10.0f, (java.lang.Comparable) 100.0d, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2932");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) (short) 10, (java.lang.Comparable) (byte) 100, (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2933");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, 1.0d, (java.lang.Comparable) (byte) 0, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2934");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) (byte) -1, (java.lang.Comparable) 1.0d, (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2935");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) 1, (java.lang.Comparable) 1, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2936");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (double) '#', (java.lang.Comparable) 100, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2937");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', 0.0d, (java.lang.Comparable) (short) 10, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2938");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) (byte) -1, (java.lang.Comparable) 1.0d, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2939");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) (short) 10, (java.lang.Comparable) 10, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2940");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (double) (-1L), (java.lang.Comparable) 100.0f, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2941");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) (byte) 10, (java.lang.Comparable) 0, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2942");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, (double) 100, (java.lang.Comparable) '#', (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2943");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) 'a', (java.lang.Comparable) 10.0f, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2944");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) 100.0f, (java.lang.Comparable) 10L, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2945");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) '4', (java.lang.Comparable) '4', (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2946");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, (double) (short) -1, (java.lang.Comparable) 1L, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2947");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) 1L, (java.lang.Comparable) true, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2948");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', 0.0d, (java.lang.Comparable) 0.0d, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2949");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) (short) 100, (java.lang.Comparable) (-1L), 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2950");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) 100, (java.lang.Comparable) (short) 100, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2951");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, (double) (-1L), (java.lang.Comparable) 100.0f, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2952");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, (double) ' ', (java.lang.Comparable) 1, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2953");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) 0L, (java.lang.Comparable) 1.0f, (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2954");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) (short) -1, (java.lang.Comparable) 1, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2955");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) 100L, (java.lang.Comparable) (short) -1, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2956");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (double) (-1L), (java.lang.Comparable) (-1), (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2957");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, (double) (short) -1, (java.lang.Comparable) 100.0d, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2958");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, (double) 0L, (java.lang.Comparable) 10.0f, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2959");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) (byte) 0, (java.lang.Comparable) 0L, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2960");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, (double) 1, (java.lang.Comparable) 10.0f, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2961");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, (double) (-1.0f), (java.lang.Comparable) false, (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2962");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) 10.0f, (java.lang.Comparable) '4', (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2963");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (double) 1, (java.lang.Comparable) '4', (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2964");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) 10, (java.lang.Comparable) (-1L), (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2965");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) 0L, comparable2, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2966");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (double) (byte) 0, (java.lang.Comparable) (byte) 1, (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2967");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, 10.0d, (java.lang.Comparable) "hi!", (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2968");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, (double) 'a', (java.lang.Comparable) (short) 100, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2969");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, (double) 100L, (java.lang.Comparable) (-1), (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2970");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) 1.0f, (java.lang.Comparable) 100.0f, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2971");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (double) (-1L), (java.lang.Comparable) (-1L), 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2972");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (double) (short) 1, (java.lang.Comparable) 10L, (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2973");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (double) (byte) 10, (java.lang.Comparable) (-1), (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2974");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) 1L, (java.lang.Comparable) (-1L), 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2975");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) 10.0f, (java.lang.Comparable) (short) 0, (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2976");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, 1.0d, (java.lang.Comparable) 1L, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2977");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, (double) ' ', (java.lang.Comparable) 1.0f, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2978");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0d, (double) 10.0f, (java.lang.Comparable) (short) 0, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2979");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, (-1.0d), (java.lang.Comparable) (short) 1, (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2980");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1), (double) (byte) -1, (java.lang.Comparable) (byte) 1, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2981");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, (double) 'a', (java.lang.Comparable) '#', (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2982");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) 100L, (java.lang.Comparable) ' ', (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2983");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) 0L, (java.lang.Comparable) 0.0f, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2984");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, 0.0d, (java.lang.Comparable) (byte) 10, 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2985");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) '#', (java.lang.Comparable) 100L, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2986");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (double) 10L, (java.lang.Comparable) 100.0d, 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2987");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, (double) (short) 10, (java.lang.Comparable) 0.0f, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2988");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) (byte) 1, (java.lang.Comparable) 10.0f, (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2989");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) (short) -1, (java.lang.Comparable) 100L, (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2990");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) ' ', (java.lang.Comparable) 0.0f, (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2991");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, 10.0d, comparable2, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2992");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1), (double) 0, comparable2, 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2993");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0d, (double) 1L, (java.lang.Comparable) 10, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2994");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, 0.0d, (java.lang.Comparable) (byte) 10, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2995");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, (double) (short) 10, (java.lang.Comparable) (byte) 10, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2996");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) 10.0f, (java.lang.Comparable) 10L, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2997");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) (byte) 1, (java.lang.Comparable) 1, (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2998");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (double) (short) 1, (java.lang.Comparable) (short) 1, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test2999");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (double) 10, (java.lang.Comparable) 1L, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression5.test3000");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) (-1.0f), (java.lang.Comparable) 1, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}


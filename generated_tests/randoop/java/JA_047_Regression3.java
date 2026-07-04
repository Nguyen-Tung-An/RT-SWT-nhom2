import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_047_Regression3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1501");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) 10.0f, (java.lang.Comparable) (byte) 100, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1502");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, 0.0d, (java.lang.Comparable) 0.0f, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1503");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1), (double) (short) 1, (java.lang.Comparable) '#', (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1504");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) (byte) 0, (java.lang.Comparable) 1, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1505");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (double) (byte) 0, (java.lang.Comparable) "hi!", (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1506");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) (-1L), (java.lang.Comparable) (short) -1, (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1507");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, (double) (short) 0, (java.lang.Comparable) 10L, (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1508");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) (short) 10, (java.lang.Comparable) true, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1509");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, 1.0d, (java.lang.Comparable) 10.0d, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1510");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (-1.0d), (java.lang.Comparable) "", (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1511");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, 10.0d, (java.lang.Comparable) true, (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1512");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, (double) (byte) -1, (java.lang.Comparable) (-1.0f), (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1513");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) (short) 10, (java.lang.Comparable) (short) 1, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1514");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (double) 0, (java.lang.Comparable) 0.0d, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1515");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (double) (short) 10, (java.lang.Comparable) (-1.0d), (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1516");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, (double) 10, comparable2, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1517");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (double) (short) 100, (java.lang.Comparable) 0, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1518");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, (double) 1.0f, (java.lang.Comparable) 10, (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1519");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, 0.0d, (java.lang.Comparable) (-1L), (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1520");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) 100.0f, (java.lang.Comparable) '4', (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1521");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', 0.0d, (java.lang.Comparable) (short) 10, (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1522");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, 1.0d, (java.lang.Comparable) ' ', (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1523");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) (byte) 10, (java.lang.Comparable) 100.0d, 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1524");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', 1.0d, (java.lang.Comparable) (short) 0, (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1525");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, (double) (short) 1, (java.lang.Comparable) 10, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1526");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) '#', (java.lang.Comparable) (short) 0, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1527");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) ' ', (java.lang.Comparable) 0.0f, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1528");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, (double) 10, (java.lang.Comparable) (short) -1, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1529");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, (double) 100L, (java.lang.Comparable) (-1.0f), 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1530");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) 1L, (java.lang.Comparable) "", (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1531");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), 1.0d, (java.lang.Comparable) (-1L), 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1532");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) (-1.0f), (java.lang.Comparable) (short) 100, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1533");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) (short) 100, (java.lang.Comparable) '4', (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1534");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, 1.0d, (java.lang.Comparable) (short) 1, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1535");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, 1.0d, (java.lang.Comparable) (byte) 10, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1536");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) (byte) -1, (java.lang.Comparable) 100, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1537");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) (byte) 0, (java.lang.Comparable) "hi!", (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1538");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) (byte) 100, (java.lang.Comparable) ' ', (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1539");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (double) (short) 0, (java.lang.Comparable) false, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1540");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1), (double) '#', (java.lang.Comparable) (-1.0d), 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1541");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, (double) (short) -1, (java.lang.Comparable) '#', (double) (byte) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1542");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, (double) (short) 10, (java.lang.Comparable) 1.0f, (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1543");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, (double) 10L, (java.lang.Comparable) (-1.0f), (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1544");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, 1.0d, (java.lang.Comparable) 10.0f, (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1545");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) ' ', (java.lang.Comparable) 0.0d, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1546");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, (double) (byte) -1, (java.lang.Comparable) 0L, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1547");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) (byte) 0, (java.lang.Comparable) 1, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1548");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) (-1), (java.lang.Comparable) (byte) 100, (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1549");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1), 100.0d, (java.lang.Comparable) (-1.0d), (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1550");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) 100, (java.lang.Comparable) (short) 0, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1551");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) 0.0f, (java.lang.Comparable) true, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1552");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) (short) -1, (java.lang.Comparable) false, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1553");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) ' ', (java.lang.Comparable) true, (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1554");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) (byte) 1, (java.lang.Comparable) (short) 0, (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1555");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 100L, (java.lang.Comparable) (byte) -1, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1556");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, 0.0d, (java.lang.Comparable) (-1.0d), (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1557");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) (byte) -1, (java.lang.Comparable) false, (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1558");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) 10.0f, (java.lang.Comparable) false, (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1559");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, (-1.0d), (java.lang.Comparable) true, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1560");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, (double) 1.0f, (java.lang.Comparable) 100L, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1561");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) (byte) 10, (java.lang.Comparable) 'a', (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1562");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 100L, (java.lang.Comparable) (-1.0d), (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1563");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) ' ', (java.lang.Comparable) 0L, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1564");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) (short) 1, (java.lang.Comparable) false, (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1565");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, 0.0d, (java.lang.Comparable) 1, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1566");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", 0.0d, (java.lang.Comparable) '4', (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1567");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) 10.0f, (java.lang.Comparable) true, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1568");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) (short) 10, (java.lang.Comparable) 0.0f, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1569");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, (double) 10.0f, (java.lang.Comparable) 1, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1570");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, 0.0d, (java.lang.Comparable) 0.0d, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1571");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, (double) (byte) -1, (java.lang.Comparable) "", (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1572");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) 100, (java.lang.Comparable) true, (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1573");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, 10.0d, (java.lang.Comparable) 0L, (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1574");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, (double) 0.0f, (java.lang.Comparable) 1L, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1575");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) 10, (java.lang.Comparable) 100L, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1576");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (-1.0d), (java.lang.Comparable) (-1.0d), (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1577");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (double) (byte) 0, comparable2, (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1578");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', 1.0d, (java.lang.Comparable) 1L, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1579");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (double) 1.0f, (java.lang.Comparable) 1L, (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1580");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, 1.0d, (java.lang.Comparable) (short) -1, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1581");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (double) (byte) 0, (java.lang.Comparable) 100, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1582");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) (short) 100, (java.lang.Comparable) (byte) -1, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1583");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, (double) (short) 100, (java.lang.Comparable) (short) 10, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1584");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) 1L, (java.lang.Comparable) (byte) -1, (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1585");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (-1.0d), (java.lang.Comparable) (-1), 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1586");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, 0.0d, (java.lang.Comparable) 10L, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1587");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0d, (double) (-1.0f), (java.lang.Comparable) (short) 0, (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1588");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) 0, (java.lang.Comparable) (short) 10, (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1589");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, 100.0d, (java.lang.Comparable) 1.0d, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1590");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, 0.0d, (java.lang.Comparable) 'a', (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1591");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, (double) (short) -1, (java.lang.Comparable) (-1.0d), (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1592");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, (double) (short) -1, (java.lang.Comparable) 100.0f, (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1593");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (double) 100.0f, (java.lang.Comparable) 0, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1594");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (double) 1.0f, (java.lang.Comparable) (short) 100, (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1595");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), 10.0d, (java.lang.Comparable) 100.0f, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1596");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (double) 0L, (java.lang.Comparable) 1.0d, 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1597");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) 100, (java.lang.Comparable) (short) 0, (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1598");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) (short) 0, (java.lang.Comparable) "", 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1599");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) (byte) 1, (java.lang.Comparable) (-1L), (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1600");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0d, (double) 0, (java.lang.Comparable) 1L, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1601");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) 100.0f, (java.lang.Comparable) 10L, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1602");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1), 1.0d, (java.lang.Comparable) false, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1603");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) 100, (java.lang.Comparable) 0.0f, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1604");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (double) (-1), (java.lang.Comparable) 0, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1605");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, 0.0d, (java.lang.Comparable) (-1), (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1606");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) 0L, (java.lang.Comparable) (-1L), (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1607");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 100L, (java.lang.Comparable) 1L, (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1608");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (double) (short) 100, (java.lang.Comparable) (byte) 0, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1609");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, 100.0d, (java.lang.Comparable) (byte) 1, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1610");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, (double) 1L, (java.lang.Comparable) 1, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1611");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), 10.0d, (java.lang.Comparable) 1, (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1612");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) (byte) -1, (java.lang.Comparable) (byte) 100, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1613");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, (double) (byte) 10, (java.lang.Comparable) (-1.0f), (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1614");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, (double) (-1), (java.lang.Comparable) (short) 1, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1615");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) 100.0f, (java.lang.Comparable) 100L, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1616");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, 100.0d, comparable2, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1617");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, 0.0d, (java.lang.Comparable) 'a', 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1618");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) '#', (java.lang.Comparable) '#', (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1619");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (double) (byte) 1, (java.lang.Comparable) (byte) 0, (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1620");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) 'a', (java.lang.Comparable) (short) 0, (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1621");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) (-1L), (java.lang.Comparable) 1L, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1622");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, (double) 100, (java.lang.Comparable) "", 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1623");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (double) 10.0f, (java.lang.Comparable) 'a', (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1624");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) 10, (java.lang.Comparable) '4', 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1625");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, (double) 100L, (java.lang.Comparable) 10.0f, (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1626");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) (short) 0, (java.lang.Comparable) false, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1627");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, 1.0d, (java.lang.Comparable) 0, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1628");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, (double) '#', (java.lang.Comparable) (-1L), (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1629");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, 0.0d, (java.lang.Comparable) (-1.0f), (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1630");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) 100, comparable2, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1631");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) ' ', (java.lang.Comparable) (-1L), (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1632");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (double) '#', (java.lang.Comparable) (short) 0, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1633");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) (byte) 10, (java.lang.Comparable) (-1.0f), (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1634");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, (double) (short) 100, (java.lang.Comparable) 100L, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1635");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, (double) 10.0f, (java.lang.Comparable) (-1.0f), (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1636");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, (double) (-1.0f), (java.lang.Comparable) 100L, (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1637");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, (double) (short) 10, (java.lang.Comparable) (short) 0, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1638");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (double) 0, (java.lang.Comparable) (-1.0f), (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1639");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, (double) (byte) 1, (java.lang.Comparable) (short) -1, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1640");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) 1.0f, (java.lang.Comparable) 10L, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1641");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, (double) 1L, (java.lang.Comparable) true, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1642");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) (short) 0, comparable2, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1643");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, (double) 100.0f, (java.lang.Comparable) '#', (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1644");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) (byte) -1, (java.lang.Comparable) 1.0f, (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1645");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) (short) -1, (java.lang.Comparable) 10.0d, (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1646");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) (short) 1, (java.lang.Comparable) "", (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1647");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) 1, (java.lang.Comparable) false, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1648");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, 0.0d, (java.lang.Comparable) (-1), (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1649");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) (short) 10, (java.lang.Comparable) 'a', (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1650");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) (-1L), (java.lang.Comparable) "hi!", (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1651");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, 0.0d, (java.lang.Comparable) 10.0d, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1652");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) 1, (java.lang.Comparable) 'a', (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1653");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) (byte) 100, (java.lang.Comparable) (short) 100, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1654");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, 10.0d, (java.lang.Comparable) (-1), (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1655");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (double) 0L, (java.lang.Comparable) 0, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1656");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) (byte) 0, (java.lang.Comparable) (byte) 10, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1657");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, 100.0d, (java.lang.Comparable) 10.0f, (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1658");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1), (double) (short) 100, (java.lang.Comparable) "", (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1659");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, (double) 0, (java.lang.Comparable) 1, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1660");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) 10L, (java.lang.Comparable) (short) -1, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1661");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, (double) 0, (java.lang.Comparable) 10L, (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1662");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, 100.0d, (java.lang.Comparable) 100.0f, (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1663");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, (double) 10, (java.lang.Comparable) (short) 0, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1664");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) (byte) -1, (java.lang.Comparable) ' ', (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1665");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) (short) -1, (java.lang.Comparable) 0L, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1666");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) (short) 0, (java.lang.Comparable) 0.0d, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1667");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0d, 0.0d, (java.lang.Comparable) (byte) 100, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1668");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, 1.0d, (java.lang.Comparable) (byte) 100, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1669");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) 0L, (java.lang.Comparable) (-1L), (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1670");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, (double) 100, (java.lang.Comparable) "hi!", (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1671");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, 0.0d, (java.lang.Comparable) ' ', (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1672");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) (-1), (java.lang.Comparable) 100, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1673");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) (byte) 0, (java.lang.Comparable) "", (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1674");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (double) 0, (java.lang.Comparable) 'a', (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1675");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, (double) 100, (java.lang.Comparable) false, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1676");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) 10L, (java.lang.Comparable) (short) 1, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1677");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, 0.0d, (java.lang.Comparable) (-1.0f), (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1678");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) (-1L), (java.lang.Comparable) (short) -1, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1679");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, (double) 100.0f, (java.lang.Comparable) '#', (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1680");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, (double) (short) 1, (java.lang.Comparable) true, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1681");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', 0.0d, (java.lang.Comparable) (-1), (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1682");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) (byte) -1, (java.lang.Comparable) (byte) 0, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1683");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (-1.0d), (java.lang.Comparable) 0, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1684");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 0L, (java.lang.Comparable) (short) -1, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1685");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, (double) (-1.0f), (java.lang.Comparable) (byte) -1, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1686");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, 1.0d, (java.lang.Comparable) 1L, (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1687");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', 0.0d, (java.lang.Comparable) 100L, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1688");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (double) (-1.0f), (java.lang.Comparable) (byte) 1, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1689");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0d, (double) 10, (java.lang.Comparable) 1, (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1690");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) (short) -1, (java.lang.Comparable) 10L, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1691");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (double) (short) 100, (java.lang.Comparable) (byte) -1, 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1692");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (double) '#', (java.lang.Comparable) 10, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1693");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, 10.0d, comparable2, (double) (byte) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1694");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) 0, (java.lang.Comparable) "hi!", (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1695");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, (-1.0d), (java.lang.Comparable) '#', (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1696");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) 1, (java.lang.Comparable) true, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1697");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) '#', (java.lang.Comparable) false, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1698");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, (double) 1L, (java.lang.Comparable) (-1.0f), (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1699");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) 1, (java.lang.Comparable) 1.0d, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1700");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (double) 100L, (java.lang.Comparable) (-1.0f), 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1701");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) (short) 10, (java.lang.Comparable) (byte) 1, (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1702");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) 'a', (java.lang.Comparable) '4', 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1703");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) 0L, (java.lang.Comparable) 1.0f, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1704");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) '4', (java.lang.Comparable) 1.0f, (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1705");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) (short) 0, (java.lang.Comparable) 100.0f, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1706");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (double) 1L, (java.lang.Comparable) (byte) 0, 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1707");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) 100.0f, comparable2, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1708");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, (double) ' ', (java.lang.Comparable) 100.0d, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1709");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1), (double) 0L, (java.lang.Comparable) true, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1710");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) 0.0f, (java.lang.Comparable) 10.0f, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1711");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (double) 1L, (java.lang.Comparable) (short) 100, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1712");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, 10.0d, (java.lang.Comparable) 1.0f, (double) (byte) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1713");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, (double) (-1L), (java.lang.Comparable) (short) 1, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1714");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) (-1), (java.lang.Comparable) 100.0d, (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1715");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, (double) (byte) 1, (java.lang.Comparable) "", (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1716");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, (double) (byte) 100, (java.lang.Comparable) "", (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1717");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (double) (byte) 0, (java.lang.Comparable) 1L, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1718");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, 100.0d, (java.lang.Comparable) (byte) -1, (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1719");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) (byte) 10, (java.lang.Comparable) 0.0f, 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1720");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (double) 0.0f, (java.lang.Comparable) 'a', (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1721");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, 0.0d, (java.lang.Comparable) 1, (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1722");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) (byte) -1, (java.lang.Comparable) 1.0f, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1723");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) 1, (java.lang.Comparable) 0L, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1724");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, (double) 10L, (java.lang.Comparable) 'a', (double) (byte) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1725");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) ' ', (java.lang.Comparable) 0.0d, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1726");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) 10L, (java.lang.Comparable) (short) 1, (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1727");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) (short) 0, (java.lang.Comparable) 0, (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1728");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) 1.0f, (java.lang.Comparable) (short) 1, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1729");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) (short) -1, (java.lang.Comparable) (byte) -1, 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1730");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, 0.0d, (java.lang.Comparable) 100.0f, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1731");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 1, (java.lang.Comparable) (byte) 10, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1732");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) (short) 0, (java.lang.Comparable) 0.0d, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1733");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) (-1.0f), (java.lang.Comparable) 1L, (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1734");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) (byte) -1, (java.lang.Comparable) 100L, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1735");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, 1.0d, (java.lang.Comparable) (short) 0, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1736");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) (short) 1, (java.lang.Comparable) 100.0d, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1737");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, 1.0d, (java.lang.Comparable) 10.0f, (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1738");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, (double) ' ', (java.lang.Comparable) (short) 1, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1739");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (double) 0L, (java.lang.Comparable) (-1L), (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1740");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, (double) 10L, (java.lang.Comparable) (byte) 10, 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1741");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, (double) (byte) -1, (java.lang.Comparable) 0.0f, (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1742");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (double) (short) 1, (java.lang.Comparable) (-1), (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1743");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, 10.0d, (java.lang.Comparable) (short) -1, (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1744");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (-1.0d), (java.lang.Comparable) 1.0f, (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1745");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) (short) 1, (java.lang.Comparable) (short) 1, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1746");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) (-1), comparable2, (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1747");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, 100.0d, (java.lang.Comparable) (short) 100, (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1748");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, (double) (-1), comparable2, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1749");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) (byte) 10, (java.lang.Comparable) 1L, 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1750");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) (byte) 1, (java.lang.Comparable) 10.0d, (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1751");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) (-1L), (java.lang.Comparable) false, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1752");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), (double) 10, (java.lang.Comparable) ' ', (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1753");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) (byte) 10, comparable2, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1754");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, 100.0d, (java.lang.Comparable) (-1.0f), (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1755");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) (byte) 100, (java.lang.Comparable) 100.0d, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1756");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 10.0f, (java.lang.Comparable) 1.0d, (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1757");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) 'a', (java.lang.Comparable) 0.0f, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1758");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) (byte) 100, comparable2, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1759");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) (byte) 1, (java.lang.Comparable) false, (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1760");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) (short) 100, (java.lang.Comparable) "hi!", (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1761");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (double) 10.0f, (java.lang.Comparable) (short) 10, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1762");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (double) (byte) 0, comparable2, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1763");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) 10.0f, (java.lang.Comparable) 0.0f, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1764");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) '#', (java.lang.Comparable) true, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1765");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) (byte) 0, (java.lang.Comparable) 0, (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1766");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) 10, (java.lang.Comparable) 1.0f, (double) (byte) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1767");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, (double) (byte) -1, (java.lang.Comparable) 'a', 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1768");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, (double) (short) 1, (java.lang.Comparable) (byte) 100, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1769");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, (double) 0L, (java.lang.Comparable) 1.0f, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1770");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, (double) (short) 100, (java.lang.Comparable) 10.0f, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1771");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, (double) 100, (java.lang.Comparable) 1, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1772");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) 10.0f, (java.lang.Comparable) 100, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1773");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 1L, (java.lang.Comparable) 100L, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1774");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) 0.0f, comparable2, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1775");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, 0.0d, (java.lang.Comparable) 0L, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1776");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, (double) 'a', (java.lang.Comparable) 1.0d, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1777");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 100.0f, (java.lang.Comparable) (byte) 0, (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1778");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, 0.0d, (java.lang.Comparable) (short) 100, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1779");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) 0, (java.lang.Comparable) (-1L), (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1780");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) (-1), (java.lang.Comparable) (byte) 10, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1781");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) '#', (java.lang.Comparable) "", (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1782");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, (double) (short) 0, (java.lang.Comparable) (byte) -1, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1783");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) (short) 0, (java.lang.Comparable) 10.0d, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1784");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, (double) (short) 0, (java.lang.Comparable) 1L, (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1785");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, 100.0d, (java.lang.Comparable) 1, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1786");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) (byte) 0, (java.lang.Comparable) 100L, (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1787");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 1, (java.lang.Comparable) ' ', (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1788");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, (double) '4', (java.lang.Comparable) 1L, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1789");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) (-1.0f), (java.lang.Comparable) 'a', (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1790");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, 100.0d, (java.lang.Comparable) (short) 0, (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1791");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 1, (java.lang.Comparable) true, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1792");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0d), 0.0d, (java.lang.Comparable) (byte) 0, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1793");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (double) (short) 10, (java.lang.Comparable) 'a', (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1794");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, 0.0d, (java.lang.Comparable) 1L, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1795");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0d, (double) (short) 100, (java.lang.Comparable) (byte) -1, (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1796");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, (double) (byte) 10, (java.lang.Comparable) (short) -1, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1797");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) 0L, (java.lang.Comparable) 0, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1798");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, (double) 10L, (java.lang.Comparable) (short) 10, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1799");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) (byte) 0, (java.lang.Comparable) (-1L), (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1800");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 10, (java.lang.Comparable) 100.0d, (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1801");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', 10.0d, (java.lang.Comparable) 100, (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1802");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, 1.0d, (java.lang.Comparable) '4', 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1803");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, (double) 10L, (java.lang.Comparable) (byte) 1, 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1804");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (double) (short) 0, comparable2, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1805");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, 100.0d, comparable2, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1806");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, (double) 'a', (java.lang.Comparable) 0, (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1807");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (-1.0d), (java.lang.Comparable) (byte) 1, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1808");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 1L, (java.lang.Comparable) 1.0f, (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1809");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) (byte) 1, (java.lang.Comparable) (-1.0d), (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1810");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) 1.0f, (java.lang.Comparable) (short) 10, (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1811");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, (double) (byte) -1, (java.lang.Comparable) (-1), (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1812");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) '#', (java.lang.Comparable) 0, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1813");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, (double) '#', (java.lang.Comparable) (-1.0d), (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1814");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, (double) 100, (java.lang.Comparable) '#', (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1815");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) 0L, (java.lang.Comparable) 10, 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1816");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, (double) (-1), (java.lang.Comparable) (-1.0f), (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1817");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, (double) (short) -1, comparable2, (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1818");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, (double) 10.0f, (java.lang.Comparable) (byte) 0, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1819");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1), (double) 0L, (java.lang.Comparable) 1.0f, (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1820");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, 0.0d, (java.lang.Comparable) 10, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1821");
        java.lang.Comparable comparable0 = null;
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) (byte) 1, comparable2, (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1822");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, (double) (short) -1, comparable2, (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1823");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, (double) 0L, (java.lang.Comparable) (short) 10, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1824");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, 1.0d, (java.lang.Comparable) 1.0f, (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1825");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) 1, (java.lang.Comparable) (byte) 100, (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1826");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, (double) 100L, (java.lang.Comparable) 0.0f, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1827");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) 100, (java.lang.Comparable) true, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1828");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) (-1.0f), (java.lang.Comparable) 1L, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1829");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', 0.0d, (java.lang.Comparable) 100, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1830");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1), (double) (-1.0f), (java.lang.Comparable) 1.0f, (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1831");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, (double) (short) 10, (java.lang.Comparable) 10.0f, 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1832");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) 100L, (java.lang.Comparable) (short) 1, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1833");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 0L, (java.lang.Comparable) 100.0d, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1834");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) 1, (java.lang.Comparable) 0, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1835");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (double) 100, (java.lang.Comparable) (short) 10, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1836");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) 100, (java.lang.Comparable) (byte) 100, (double) (byte) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1837");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (double) (byte) -1, (java.lang.Comparable) 100.0d, (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1838");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) 0.0f, (java.lang.Comparable) "", (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1839");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, 1.0d, (java.lang.Comparable) (-1.0f), (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1840");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) 0.0f, (java.lang.Comparable) 10.0d, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1841");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (double) (short) -1, (java.lang.Comparable) (short) 0, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1842");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) (byte) 10, (java.lang.Comparable) 1.0f, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1843");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) (byte) 10, (java.lang.Comparable) (byte) -1, (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1844");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) 1, (java.lang.Comparable) (short) 100, (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1845");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, (double) 1L, (java.lang.Comparable) (short) 100, (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1846");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, 100.0d, (java.lang.Comparable) (short) 0, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1847");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, (double) (short) 10, (java.lang.Comparable) 100L, (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1848");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) (short) 100, (java.lang.Comparable) "hi!", (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1849");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', 0.0d, (java.lang.Comparable) 10.0d, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1850");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, (double) (-1.0f), (java.lang.Comparable) (byte) 10, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1851");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) 10, (java.lang.Comparable) 100L, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1852");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) 1.0f, comparable2, (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1853");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) 100L, (java.lang.Comparable) 0.0d, (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1854");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) ' ', (java.lang.Comparable) (short) 1, 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1855");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, 100.0d, (java.lang.Comparable) 0, (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1856");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, (double) 100.0f, (java.lang.Comparable) 1L, (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1857");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) 100L, (java.lang.Comparable) 100.0d, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1858");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) (-1), (java.lang.Comparable) (byte) -1, (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1859");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 0.0f, (java.lang.Comparable) 100.0f, (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1860");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (double) 10, (java.lang.Comparable) "", (double) (byte) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1861");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) (byte) 10, (java.lang.Comparable) 1.0d, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1862");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) 100.0f, (java.lang.Comparable) (-1.0f), (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1863");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (double) ' ', (java.lang.Comparable) 1L, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1864");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1), (double) 0L, (java.lang.Comparable) 100.0d, 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1865");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) 0L, (java.lang.Comparable) '#', (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1866");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, 1.0d, (java.lang.Comparable) (-1L), 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1867");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) (short) 1, (java.lang.Comparable) 100.0d, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1868");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, (-1.0d), (java.lang.Comparable) (short) 100, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1869");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, (double) (short) 1, (java.lang.Comparable) (-1.0f), (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1870");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 1, (java.lang.Comparable) 'a', (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1871");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (double) 10.0f, (java.lang.Comparable) (byte) 100, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1872");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) (-1), (java.lang.Comparable) (-1L), (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1873");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, 10.0d, (java.lang.Comparable) 0.0f, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1874");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) '4', (java.lang.Comparable) (-1), 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1875");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, 10.0d, (java.lang.Comparable) 10.0d, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1876");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) 100L, (java.lang.Comparable) ' ', (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1877");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, 0.0d, (java.lang.Comparable) 0L, 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1878");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (double) '#', (java.lang.Comparable) ' ', (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1879");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, (double) (-1L), (java.lang.Comparable) true, (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1880");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) (byte) 10, (java.lang.Comparable) "hi!", (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1881");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) (short) 100, (java.lang.Comparable) 1.0f, (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1882");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (double) (byte) 10, (java.lang.Comparable) 0L, (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1883");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, (double) 100.0f, (java.lang.Comparable) (short) 100, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1884");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (double) (byte) 100, (java.lang.Comparable) 1L, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1885");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) '#', (java.lang.Comparable) 0.0f, (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1886");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0f, (double) 1, (java.lang.Comparable) true, (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1887");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) 0, (java.lang.Comparable) 1, (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1888");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, (double) (short) -1, (java.lang.Comparable) (-1), (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1889");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) 0.0f, (java.lang.Comparable) 10L, 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1890");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, 100.0d, (java.lang.Comparable) 1.0f, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1891");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 100, (double) (-1L), comparable2, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1892");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, (double) 100, (java.lang.Comparable) 100, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1893");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) (short) 10, (java.lang.Comparable) (short) 100, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1894");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) (short) 100, (java.lang.Comparable) 100, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1895");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) (byte) 100, (java.lang.Comparable) "", 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1896");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, (double) (short) 100, (java.lang.Comparable) true, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1897");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", 0.0d, (java.lang.Comparable) 0L, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1898");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (double) 0, comparable2, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1899");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, (double) (-1), (java.lang.Comparable) (short) 100, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1900");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) 'a', (java.lang.Comparable) (short) -1, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1901");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) 10.0f, (java.lang.Comparable) 10, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1902");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) (-1L), (java.lang.Comparable) "hi!", (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1903");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (double) (short) 10, (java.lang.Comparable) 100.0f, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1904");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) 'a', (java.lang.Comparable) (-1L), 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1905");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (double) (short) 10, (java.lang.Comparable) 0.0d, (double) (-1), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1906");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, (double) 1, (java.lang.Comparable) (byte) 0, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1907");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (double) 10.0f, (java.lang.Comparable) (byte) 10, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1908");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) (-1L), (java.lang.Comparable) 10, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1909");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) (short) -1, (java.lang.Comparable) 100.0d, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1910");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, (double) 0.0f, (java.lang.Comparable) 10.0d, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1911");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100, 0.0d, (java.lang.Comparable) 100.0d, (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1912");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, 10.0d, (java.lang.Comparable) (short) 1, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1913");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, 0.0d, (java.lang.Comparable) 100, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1914");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0d, 1.0d, comparable2, (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1915");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) (-1.0f), (java.lang.Comparable) (-1), (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1916");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, (double) 0.0f, (java.lang.Comparable) 'a', (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1917");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) (-1L), (java.lang.Comparable) "", 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1918");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 1, (double) 10L, (java.lang.Comparable) 1.0d, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1919");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, (double) (-1L), (java.lang.Comparable) (short) 0, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1920");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, (double) (-1), (java.lang.Comparable) 0, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1921");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (double) 1L, (java.lang.Comparable) 100L, (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1922");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, (double) 100, (java.lang.Comparable) 0, 10.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1923");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, (double) '4', (java.lang.Comparable) 100, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1924");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) (-1.0f), (java.lang.Comparable) 1L, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1925");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1.0f), (double) 0L, (java.lang.Comparable) 0.0d, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1926");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, 0.0d, comparable2, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1927");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, 10.0d, (java.lang.Comparable) 0L, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1928");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 'a', (double) (short) 0, (java.lang.Comparable) 0.0d, 1.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1929");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (-1.0d), (java.lang.Comparable) (-1L), (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1930");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, (double) (byte) 100, (java.lang.Comparable) (byte) 1, (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1931");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0d, 0.0d, (java.lang.Comparable) (byte) -1, (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1932");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (double) 1L, (java.lang.Comparable) ' ', (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1933");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, 1.0d, (java.lang.Comparable) 0L, (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1934");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (double) 100, (java.lang.Comparable) 10.0d, (double) (-1L), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1935");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) (short) 100, (java.lang.Comparable) 1.0f, (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1936");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) (byte) 100, (java.lang.Comparable) (-1), (double) (byte) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1937");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) false, (-1.0d), (java.lang.Comparable) "", (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1938");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) 'a', (java.lang.Comparable) 100.0f, (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1939");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) 0.0f, (java.lang.Comparable) 100L, (double) 10L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1940");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (double) (byte) 1, (java.lang.Comparable) 0.0f, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1941");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '4', (double) (-1L), (java.lang.Comparable) '#', (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1942");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (double) (byte) 100, (java.lang.Comparable) false, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1943");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', 100.0d, (java.lang.Comparable) (byte) 100, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1944");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) (-1.0f), (java.lang.Comparable) 0, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1945");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) (byte) 1, (java.lang.Comparable) (short) 1, (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1946");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (double) (byte) -1, (java.lang.Comparable) false, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1947");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 1.0f, (java.lang.Comparable) "", (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1948");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) (short) -1, (java.lang.Comparable) true, (double) 10.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1949");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) 10L, comparable2, (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1950");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, 0.0d, (java.lang.Comparable) 0L, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1951");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) 'a', (java.lang.Comparable) 0.0f, (-1.0d), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1952");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, (double) 100, (java.lang.Comparable) 0, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1953");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (double) (byte) 100, (java.lang.Comparable) 100.0f, (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1954");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, (double) 10, (java.lang.Comparable) 0L, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1955");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', (double) 1.0f, (java.lang.Comparable) 0.0f, (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1956");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 0, 0.0d, (java.lang.Comparable) (short) 0, (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1957");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0f, (double) (-1), (java.lang.Comparable) 1.0f, (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1958");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) -1, (double) (byte) 10, (java.lang.Comparable) 1.0f, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1959");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (-1.0d), (java.lang.Comparable) (short) 10, (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1960");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1, (double) 1L, (java.lang.Comparable) 0.0f, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1961");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, (double) (-1L), (java.lang.Comparable) 10, (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1962");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100.0d, (double) '#', (java.lang.Comparable) (-1), (double) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1963");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1), (double) 10.0f, (java.lang.Comparable) (short) 1, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1964");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) (short) -1, (java.lang.Comparable) (byte) 0, (double) 'a', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1965");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1L), (double) (-1L), (java.lang.Comparable) (byte) 10, (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1966");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, 10.0d, (java.lang.Comparable) 1.0f, (double) (-1.0f), paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1967");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, (double) ' ', (java.lang.Comparable) 100L, (double) (short) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1968");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 0, (double) 1L, (java.lang.Comparable) ' ', (double) 0L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1969");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) '#', (double) 10.0f, comparable2, (double) 1L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1970");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 10, (double) ' ', (java.lang.Comparable) (byte) 0, (double) 100, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1971");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) 1L, (java.lang.Comparable) (byte) 0, (double) '#', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1972");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) ' ', (java.lang.Comparable) (-1.0f), (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1973");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1.0d, 10.0d, (java.lang.Comparable) (short) 10, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1974");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, 100.0d, (java.lang.Comparable) 1.0f, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1975");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0, (double) 0.0f, (java.lang.Comparable) (-1), (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1976");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) ' ', 1.0d, (java.lang.Comparable) '#', (double) (short) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1977");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, (double) 10, (java.lang.Comparable) 1, (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1978");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (double) (byte) 100, (java.lang.Comparable) "", (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1979");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, (double) 100L, (java.lang.Comparable) "hi!", (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1980");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10L, (double) (byte) -1, (java.lang.Comparable) (short) 100, (double) (byte) -1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1981");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) 'a', (java.lang.Comparable) ' ', 100.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1982");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 100L, (double) 1, (java.lang.Comparable) "", (double) 1.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1983");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "hi!", (double) (byte) 0, (java.lang.Comparable) (byte) 10, (double) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1984");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0f, (double) 100, (java.lang.Comparable) 1.0d, 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1985");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) (byte) 1, (java.lang.Comparable) 0, (double) 0.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1986");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 1L, (double) (byte) 1, (java.lang.Comparable) (byte) -1, (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1987");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10, 0.0d, (java.lang.Comparable) 10.0d, (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1988");
        java.lang.Comparable comparable2 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 100, 100.0d, comparable2, (double) 100.0f, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category2' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1989");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) true, 0.0d, (java.lang.Comparable) (short) -1, (double) (byte) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1990");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (short) 10, (double) '#', (java.lang.Comparable) '4', (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1991");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0f, (double) 1.0f, (java.lang.Comparable) '4', 0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1992");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0d, (double) 10L, (java.lang.Comparable) (short) -1, (double) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1993");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0L, 100.0d, (java.lang.Comparable) (-1L), (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1994");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (-1), (double) 100, (java.lang.Comparable) 1L, (double) 100L, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1995");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 0.0d, (double) 0L, (java.lang.Comparable) (-1), (double) (byte) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1996");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) -1, (double) (byte) -1, (java.lang.Comparable) 100, (double) (short) 0, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1997");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) "", (double) 0, (java.lang.Comparable) (-1), (double) '4', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1998");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) (byte) 1, (double) 10.0f, (java.lang.Comparable) (short) 1, (double) ' ', paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test1999");
        java.lang.Comparable comparable0 = null;
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation(comparable0, (double) 1.0f, (java.lang.Comparable) (-1), (double) (short) 1, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category1' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_047_Regression3.test2000");
        java.awt.Paint paint4 = null;
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation6 = new org.jfree.chart.annotations.CategoryLineAnnotation((java.lang.Comparable) 10.0d, (double) 10.0f, (java.lang.Comparable) 0L, (double) (short) 10, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}


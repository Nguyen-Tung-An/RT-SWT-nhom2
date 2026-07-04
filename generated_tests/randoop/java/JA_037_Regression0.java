import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_037_Regression0 {

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_037_Regression0.test01");
        java.awt.Image image0 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_IMAGE;
        org.junit.Assert.assertNull(image0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_037_Regression0.test02");
        java.awt.Font font0 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        java.lang.Class<?> wildcardClass1 = font0.getClass();
        org.junit.Assert.assertNotNull(font0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_037_Regression0.test03");
        float float0 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_IMAGE_ALPHA;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.5f + "'", float0 == 0.5f);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_037_Regression0.test04");
        java.awt.Font font1 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        org.jfree.chart.plot.Plot plot2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", font1, plot2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'plot' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_037_Regression0.test05");
        java.awt.Font font1 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        org.jfree.chart.plot.Plot plot2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("", font1, plot2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'plot' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_037_Regression0.test06");
        org.jfree.chart.plot.Plot plot0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart1 = new org.jfree.chart.JFreeChart(plot0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'plot' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_037_Regression0.test07");
        org.jfree.chart.api.RectangleAlignment rectangleAlignment0 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_IMAGE_ALIGNMENT;
        java.lang.Class<?> wildcardClass1 = rectangleAlignment0.getClass();
        org.junit.Assert.assertTrue("'" + rectangleAlignment0 + "' != '" + org.jfree.chart.api.RectangleAlignment.FILL + "'", rectangleAlignment0.equals(org.jfree.chart.api.RectangleAlignment.FILL));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_037_Regression0.test08");
        java.awt.Font font1 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        org.jfree.chart.plot.Plot plot2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("", font1, plot2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'plot' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_037_Regression0.test09");
        java.awt.Font font1 = null;
        org.jfree.chart.plot.Plot plot2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("", font1, plot2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'plot' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_037_Regression0.test10");
        org.jfree.chart.plot.Plot plot1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart2 = new org.jfree.chart.JFreeChart("hi!", plot1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'plot' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_037_Regression0.test11");
        java.awt.Paint paint0 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_PAINT;
        java.lang.Class<?> wildcardClass1 = paint0.getClass();
        org.junit.Assert.assertNotNull(paint0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_037_Regression0.test12");
        org.jfree.chart.plot.Plot plot1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart2 = new org.jfree.chart.JFreeChart("", plot1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'plot' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_037_Regression0.test13");
        java.awt.Font font1 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        org.jfree.chart.plot.Plot plot2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", font1, plot2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'plot' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_037_Regression0.test14");
        java.awt.RenderingHints.Key key0 = org.jfree.chart.JFreeChart.KEY_SUPPRESS_SHADOW_GENERATION;
        java.lang.Class<?> wildcardClass1 = key0.getClass();
        org.junit.Assert.assertNotNull(key0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_037_Regression0.test15");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_037_Regression0.test16");
        java.awt.Font font1 = null;
        org.jfree.chart.plot.Plot plot2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("", font1, plot2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'plot' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_037_Regression0.test17");
        java.awt.Font font1 = null;
        org.jfree.chart.plot.Plot plot2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", font1, plot2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'plot' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_037_Regression0.test18");
        java.awt.Font font1 = null;
        org.jfree.chart.plot.Plot plot2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", font1, plot2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'plot' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}


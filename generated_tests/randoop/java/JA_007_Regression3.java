import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_007_Regression3 {

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
            System.out.format("%n%s%n", "JA_007_Regression3.test1501");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) (byte) -1, true, false, true, locale7, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression3.test1502");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart4 = org.jfree.chart.ChartFactory.createGanttChart("hi!", "hi!", "hi!", intervalCategoryDataset3);
        java.lang.Class<?> wildcardClass5 = jFreeChart4.getClass();
        org.junit.Assert.assertNotNull(jFreeChart4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression3.test1503");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) (short) 1, false, false, true, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression3.test1504");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createWaterfallChart("hi!", "hi!", "hi!", categoryDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression3.test1505");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("", "", false, "hi!", intervalXYDataset4, plotOrientation5, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression3.test1506");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("", "", "hi!", windDataset3, true, false, false);
        java.lang.Class<?> wildcardClass8 = jFreeChart7.getClass();
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression3.test1507");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, 0, true, false, false, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression3.test1508");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) 'a', true, false, true, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression3.test1509");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, 1, true, false, true, locale7, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression3.test1510");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart4 = org.jfree.chart.ChartFactory.createStackedBarChart("", "hi!", "", categoryDataset3);
        java.lang.Class<?> wildcardClass5 = jFreeChart4.getClass();
        org.junit.Assert.assertNotNull(jFreeChart4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression3.test1511");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createAreaChart("", "hi!", "hi!", categoryDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression3.test1512");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createTimeSeriesChart("hi!", "hi!", "hi!", xYDataset3, false, true, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression3.test1513");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createWaterfallChart("", "hi!", "", categoryDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression3.test1514");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createTimeSeriesChart("hi!", "hi!", "", xYDataset3, false, false, false);
        java.lang.Class<?> wildcardClass8 = jFreeChart7.getClass();
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression3.test1515");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("hi!", "hi!", "hi!", intervalCategoryDataset3, false, true, false);
        java.lang.Class<?> wildcardClass8 = jFreeChart7.getClass();
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression3.test1516");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("", "hi!", false, "hi!", intervalXYDataset4, plotOrientation5, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression3.test1517");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) (short) 1, true, false, true, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression3.test1518");
        org.jfree.data.statistics.BoxAndWhiskerCategoryDataset boxAndWhiskerCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("", "", "", boxAndWhiskerCategoryDataset3, true);
        java.lang.Class<?> wildcardClass6 = jFreeChart5.getClass();
        org.junit.Assert.assertNotNull(jFreeChart5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression3.test1519");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, 10, true, true, true, locale7, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression3.test1520");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("", "hi!", "", xYDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression3.test1521");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) (byte) 1, false, true, true, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression3.test1522");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) (byte) 1, true, true, true, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression3.test1523");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, 1, true, true, false, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression3.test1524");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, 100, false, true, true, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression3.test1525");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYLineChart("hi!", "hi!", "", xYDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression3.test1526");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) (short) 10, false, true, false, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression3.test1527");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("", "", "hi!", intervalCategoryDataset3, true, true, true);
        java.lang.Class<?> wildcardClass8 = jFreeChart7.getClass();
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression3.test1528");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) (short) -1, false, true, false, locale7, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression3.test1529");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createRingChart("hi!", pieDataset1, false, true, true);
        java.lang.Class<?> wildcardClass6 = jFreeChart5.getClass();
        org.junit.Assert.assertNotNull(jFreeChart5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression3.test1530");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) 'a', false, false, false, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression3.test1531");
        org.jfree.data.xy.XYZDataset xYZDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBubbleChart("hi!", "hi!", "hi!", xYZDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression3.test1532");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) '4', true, true, true, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression3.test1533");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) ' ', false, false, false, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression3.test1534");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("", "hi!", false, "", intervalXYDataset4, plotOrientation5, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression3.test1535");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) (byte) 10, true, true, false, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression3.test1536");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("hi!", "hi!", "hi!", intervalCategoryDataset3, true, true, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression3.test1537");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedAreaChart("hi!", "hi!", "hi!", categoryDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression3.test1538");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart4 = org.jfree.chart.ChartFactory.createBarChart("hi!", "hi!", "hi!", categoryDataset3);
        java.lang.Class<?> wildcardClass5 = jFreeChart4.getClass();
        org.junit.Assert.assertNotNull(jFreeChart4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression3.test1539");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart("hi!", "", "hi!", categoryDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression3.test1540");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedAreaChart("", "", "", categoryDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}


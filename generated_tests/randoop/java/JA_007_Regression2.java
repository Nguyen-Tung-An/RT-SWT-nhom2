import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_007_Regression2 {

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
            System.out.format("%n%s%n", "JA_007_Regression2.test1001");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYLineChart("hi!", "hi!", "", xYDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1002");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("", "", "hi!", xYDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1003");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (-1), true, false, false, locale7, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1004");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createHistogram("", "hi!", "", intervalXYDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1005");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart("", "", "", categoryDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1006");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) ' ', false, true, false, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1007");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) (short) -1, false, false, false, locale7, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1008");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart("", "", "hi!", categoryDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1009");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createHistogram("hi!", "hi!", "", intervalXYDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1010");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart4 = org.jfree.chart.ChartFactory.createAreaChart("", "", "hi!", categoryDataset3);
        java.lang.Class<?> wildcardClass5 = jFreeChart4.getClass();
        org.junit.Assert.assertNotNull(jFreeChart4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1011");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createWaterfallChart("hi!", "", "hi!", categoryDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1012");
        org.jfree.data.xy.TableXYDataset tableXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedXYAreaChart("", "", "hi!", tableXYDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1013");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedAreaChart("hi!", "", "hi!", categoryDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1014");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) (byte) 10, false, true, false, locale7, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1015");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart("hi!", "", "hi!", categoryDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1016");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createWaterfallChart("hi!", "", "hi!", categoryDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1017");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("hi!", "", "hi!", xYDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1018");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createCandlestickChart("hi!", "hi!", "hi!", oHLCDataset3, false);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1019");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createHistogram("", "hi!", "hi!", intervalXYDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1020");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) (byte) 10, false, false, false, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1021");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) (byte) -1, true, false, false, locale7, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1022");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("", "hi!", "", windDataset3, false, true, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1023");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createWaterfallChart("hi!", "hi!", "", categoryDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1024");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createWaterfallChart("", "", "hi!", categoryDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1025");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYLineChart("", "hi!", "hi!", xYDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1026");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (-1), true, true, true, locale7, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1027");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart("hi!", "", "hi!", categoryDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1028");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepAreaChart("hi!", "", "hi!", xYDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1029");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepChart("hi!", "", "hi!", xYDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1030");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("hi!", "", "", intervalCategoryDataset3, false, false, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1031");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart("", "hi!", "hi!", categoryDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1032");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createWaterfallChart("", "", "", categoryDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1033");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) (short) 100, true, false, true, locale7, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1034");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("hi!", "hi!", "", windDataset3, true, true, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1035");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("hi!", "", false, "", intervalXYDataset4, plotOrientation5, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1036");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createHistogram("", "hi!", "hi!", intervalXYDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1037");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart("", "hi!", "", categoryDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1038");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("", "", "hi!", xYDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1039");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) (short) -1, true, true, false, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1040");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYLineChart("hi!", "", "hi!", xYDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1041");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) 'a', true, true, false, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1042");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createRingChart("hi!", pieDataset1, false, false, true);
        java.lang.Class<?> wildcardClass6 = jFreeChart5.getClass();
        org.junit.Assert.assertNotNull(jFreeChart5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1043");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createAreaChart("hi!", "", "", categoryDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1044");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) (byte) -1, false, false, true, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1045");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) (byte) 0, true, false, true, locale7, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1046");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) ' ', false, false, true, locale7, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1047");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createHistogram("hi!", "hi!", "hi!", intervalXYDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1048");
        org.jfree.data.xy.XYZDataset xYZDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBubbleChart("hi!", "hi!", "", xYZDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1049");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("hi!", "", "", windDataset3, false, true, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1050");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) (byte) 100, true, false, true, locale7, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1051");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createWaterfallChart("", "", "hi!", categoryDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1052");
        org.jfree.data.xy.XYZDataset xYZDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBubbleChart("", "hi!", "hi!", xYZDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1053");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("", "", true, "hi!", intervalXYDataset4, plotOrientation5, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1054");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createAreaChart("", "hi!", "hi!", categoryDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1055");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("hi!", "hi!", false, "", intervalXYDataset4, plotOrientation5, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1056");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedAreaChart("", "hi!", "", categoryDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1057");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("hi!", "hi!", "hi!", windDataset3, true, false, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1058");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) (short) 10, false, false, false, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1059");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createAreaChart("", "hi!", "", categoryDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1060");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createWaterfallChart("hi!", "hi!", "hi!", categoryDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1061");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createTimeSeriesChart("", "hi!", "hi!", xYDataset3, false, false, false);
        java.lang.Class<?> wildcardClass8 = jFreeChart7.getClass();
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1062");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("", "", "", intervalCategoryDataset3, true, true, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1063");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepAreaChart("", "hi!", "hi!", xYDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1064");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) (short) -1, false, false, false, locale7, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1065");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("hi!", "", "hi!", windDataset3, false, false, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1066");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, 0, true, false, true, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1067");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedAreaChart("hi!", "hi!", "hi!", categoryDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1068");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart("", "hi!", "", categoryDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1069");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) (short) -1, true, false, true, locale7, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1070");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) (short) 1, false, true, false, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1071");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("hi!", "hi!", true, "hi!", intervalXYDataset4, plotOrientation5, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1072");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepAreaChart("hi!", "hi!", "hi!", xYDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1073");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("", "", "", xYDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1074");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart("", "hi!", "hi!", categoryDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1075");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, 100, false, false, false, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1076");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createTimeSeriesChart("", "hi!", "", xYDataset3, true, true, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1077");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createHistogram("hi!", "hi!", "hi!", intervalXYDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1078");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart("hi!", "hi!", "", categoryDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1079");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart4 = org.jfree.chart.ChartFactory.createLineChart("hi!", "", "", categoryDataset3);
        java.lang.Class<?> wildcardClass5 = jFreeChart4.getClass();
        org.junit.Assert.assertNotNull(jFreeChart4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1080");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart("hi!", "", "", categoryDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1081");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepAreaChart("hi!", "hi!", "hi!", xYDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1082");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("hi!", "", "hi!", intervalCategoryDataset3, false, true, false);
        java.lang.Class<?> wildcardClass8 = jFreeChart7.getClass();
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1083");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("", "hi!", "hi!", windDataset3, true, true, true);
        java.lang.Class<?> wildcardClass8 = jFreeChart7.getClass();
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1084");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("", "", "hi!", windDataset3, false, true, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1085");
        org.jfree.data.xy.TableXYDataset tableXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedXYAreaChart("", "hi!", "hi!", tableXYDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1086");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart("", "hi!", "", categoryDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1087");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) (short) 100, true, false, true, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1088");
        org.jfree.data.xy.XYZDataset xYZDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBubbleChart("hi!", "hi!", "", xYZDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1089");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createCandlestickChart("hi!", "", "hi!", oHLCDataset3, true);
        java.lang.Class<?> wildcardClass6 = jFreeChart5.getClass();
        org.junit.Assert.assertNotNull(jFreeChart5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1090");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart("hi!", "hi!", "", categoryDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1091");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) '#', true, false, true, locale7, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1092");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) (byte) 0, false, false, false, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1093");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) '#', false, true, true, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1094");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("hi!", "", "", windDataset3, false, false, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1095");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepChart("hi!", "hi!", "hi!", xYDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1096");
        org.jfree.data.xy.TableXYDataset tableXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedXYAreaChart("hi!", "", "", tableXYDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1097");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) (short) -1, true, true, true, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1098");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("", "hi!", "hi!", xYDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1099");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createHistogram("", "", "", intervalXYDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1100");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("", "hi!", "hi!", windDataset3, false, false, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1101");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYLineChart("hi!", "", "", xYDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1102");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart4 = org.jfree.chart.ChartFactory.createTimeSeriesChart("hi!", "hi!", "hi!", xYDataset3);
        java.lang.Class<?> wildcardClass5 = jFreeChart4.getClass();
        org.junit.Assert.assertNotNull(jFreeChart4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1103");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("", "", false, "hi!", intervalXYDataset4, plotOrientation5, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1104");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("", "", "", intervalCategoryDataset3, true, false, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1105");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createRingChart("", pieDataset1, true, false, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1106");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) (short) 0, true, false, false, locale7, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1107");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYLineChart("", "", "", xYDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1108");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) (short) 0, true, false, true, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1109");
        org.jfree.data.xy.XYZDataset xYZDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBubbleChart("", "", "hi!", xYZDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1110");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("", "hi!", true, "hi!", intervalXYDataset4, plotOrientation5, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1111");
        org.jfree.data.xy.TableXYDataset tableXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedXYAreaChart("", "hi!", "hi!", tableXYDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1112");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, 10, true, false, true, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1113");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (-1), true, false, true, locale7, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1114");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("", "hi!", false, "hi!", intervalXYDataset4, plotOrientation5, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1115");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("hi!", "hi!", "", xYDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1116");
        org.jfree.data.statistics.BoxAndWhiskerCategoryDataset boxAndWhiskerCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("", "", "hi!", boxAndWhiskerCategoryDataset3, true);
        java.lang.Class<?> wildcardClass6 = jFreeChart5.getClass();
        org.junit.Assert.assertNotNull(jFreeChart5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1117");
        org.jfree.data.xy.TableXYDataset tableXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedXYAreaChart("", "hi!", "hi!", tableXYDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1118");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, 1, false, true, false, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1119");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) (short) 100, true, true, false, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1120");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepAreaChart("", "", "", xYDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1121");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepAreaChart("", "", "", xYDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1122");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, 10, false, true, false, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1123");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart("hi!", "hi!", "", categoryDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1124");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("", "hi!", "hi!", xYDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1125");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createWaterfallChart("", "", "hi!", categoryDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1126");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createAreaChart("hi!", "hi!", "", categoryDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1127");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("hi!", "", "", intervalCategoryDataset3, true, false, true);
        java.lang.Class<?> wildcardClass8 = jFreeChart7.getClass();
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1128");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, 100, false, false, false, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1129");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (-1), false, false, false, locale7, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1130");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createAreaChart("", "", "hi!", categoryDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1131");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("hi!", "hi!", "", xYDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1132");
        org.jfree.chart.ChartTheme chartTheme0 = org.jfree.chart.ChartFactory.getChartTheme();
        org.jfree.chart.ChartFactory.setChartTheme(chartTheme0);
        java.lang.Class<?> wildcardClass2 = chartTheme0.getClass();
        org.junit.Assert.assertNotNull(chartTheme0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1133");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createTimeSeriesChart("hi!", "hi!", "hi!", xYDataset3, false, false, false);
        java.lang.Class<?> wildcardClass8 = jFreeChart7.getClass();
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1134");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart("", "", "", categoryDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1135");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createTimeSeriesChart("hi!", "hi!", "", xYDataset3, true, true, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1136");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) ' ', false, true, false, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1137");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, 10, true, false, true, locale7, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1138");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("hi!", "hi!", "hi!", xYDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1139");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepAreaChart("hi!", "hi!", "hi!", xYDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1140");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepChart("", "", "", xYDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1141");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, 0, true, false, true, locale7, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1142");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepAreaChart("hi!", "", "hi!", xYDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1143");
        org.jfree.data.xy.XYZDataset xYZDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBubbleChart("", "hi!", "", xYZDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1144");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("hi!", "", "hi!", intervalCategoryDataset3, true, true, true);
        java.lang.Class<?> wildcardClass8 = jFreeChart7.getClass();
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1145");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("hi!", "hi!", false, "hi!", intervalXYDataset4, plotOrientation5, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1146");
        org.jfree.data.xy.TableXYDataset tableXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedXYAreaChart("", "", "", tableXYDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1147");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("", "", "hi!", windDataset3, true, false, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1148");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepChart("", "hi!", "hi!", xYDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1149");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) '4', true, false, false, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1150");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createAreaChart("", "", "", categoryDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1151");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepChart("", "hi!", "hi!", xYDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1152");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart("", "hi!", "hi!", categoryDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1153");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("hi!", "", true, "", intervalXYDataset4, plotOrientation5, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1154");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (-1), false, false, true, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1155");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createWaterfallChart("", "", "", categoryDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1156");
        org.jfree.data.xy.XYZDataset xYZDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBubbleChart("hi!", "", "hi!", xYZDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1157");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("hi!", "", "hi!", intervalCategoryDataset3, true, false, false);
        java.lang.Class<?> wildcardClass8 = jFreeChart7.getClass();
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1158");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) (short) 10, false, true, true, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1159");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createXYBarChart("", "hi!", false, "hi!", intervalXYDataset4);
        java.lang.Class<?> wildcardClass6 = jFreeChart5.getClass();
        org.junit.Assert.assertNotNull(jFreeChart5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1160");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, 100, true, false, false, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1161");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("hi!", "hi!", "", xYDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1162");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("", "hi!", true, "", intervalXYDataset4, plotOrientation5, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1163");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, 100, false, false, true, locale7, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1164");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createTimeSeriesChart("hi!", "", "", xYDataset3, true, false, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1165");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart("", "hi!", "hi!", categoryDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1166");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart("", "", "", categoryDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1167");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart("hi!", "", "", categoryDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1168");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("", "hi!", "", windDataset3, false, false, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1169");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createHistogram("", "", "", intervalXYDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1170");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart("hi!", "hi!", "hi!", categoryDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1171");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("hi!", "", false, "", intervalXYDataset4, plotOrientation5, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1172");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepAreaChart("hi!", "", "hi!", xYDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1173");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) 'a', true, true, true, locale7, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1174");
        org.jfree.data.xy.XYZDataset xYZDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBubbleChart("hi!", "", "hi!", xYZDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1175");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) ' ', true, false, true, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1176");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) (short) 100, false, false, true, locale7, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1177");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("hi!", "", "hi!", xYDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1178");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) (short) 0, false, true, true, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1179");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createWaterfallChart("", "hi!", "", categoryDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1180");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createTimeSeriesChart("", "hi!", "", xYDataset3, true, false, false);
        java.lang.Class<?> wildcardClass8 = jFreeChart7.getClass();
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1181");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("", "hi!", "hi!", xYDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1182");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, 0, false, true, true, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1183");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepChart("hi!", "hi!", "", xYDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1184");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart("", "", "hi!", categoryDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1185");
        org.jfree.data.general.WaferMapDataset waferMapDataset1 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createWaferMapChart("", waferMapDataset1, plotOrientation2, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1186");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepAreaChart("hi!", "", "", xYDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1187");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("", "hi!", "", windDataset3, true, true, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1188");
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.api.TableOrder tableOrder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createMultiplePieChart("hi!", categoryDataset1, tableOrder2, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1189");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createTimeSeriesChart("", "hi!", "hi!", xYDataset3, true, true, false);
        java.lang.Class<?> wildcardClass8 = jFreeChart7.getClass();
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1190");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart("hi!", "hi!", "", categoryDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1191");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) ' ', true, true, true, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1192");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createHistogram("hi!", "", "hi!", intervalXYDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1193");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) (byte) -1, true, false, false, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1194");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createAreaChart("hi!", "hi!", "hi!", categoryDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1195");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("hi!", "hi!", "hi!", xYDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1196");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepChart("", "hi!", "hi!", xYDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1197");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("hi!", "", false, "", intervalXYDataset4, plotOrientation5, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1198");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart("", "hi!", "", categoryDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1199");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) (short) 10, false, false, true, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1200");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) '#', false, true, false, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1201");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createWaterfallChart("hi!", "", "hi!", categoryDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1202");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) ' ', false, false, false, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1203");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) (byte) -1, false, false, false, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1204");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("hi!", "", "hi!", intervalCategoryDataset3, true, false, true);
        java.lang.Class<?> wildcardClass8 = jFreeChart7.getClass();
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1205");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("", "", "", xYDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1206");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart4 = org.jfree.chart.ChartFactory.createBarChart("", "", "hi!", categoryDataset3);
        java.lang.Class<?> wildcardClass5 = jFreeChart4.getClass();
        org.junit.Assert.assertNotNull(jFreeChart4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1207");
        org.jfree.data.xy.TableXYDataset tableXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedXYAreaChart("hi!", "", "", tableXYDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1208");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createRingChart("hi!", pieDataset1, false, true, false);
        java.lang.Class<?> wildcardClass6 = jFreeChart5.getClass();
        org.junit.Assert.assertNotNull(jFreeChart5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1209");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) '#', false, true, false, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1210");
        org.jfree.data.xy.TableXYDataset tableXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedXYAreaChart("", "", "hi!", tableXYDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1211");
        org.jfree.data.xy.XYZDataset xYZDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBubbleChart("", "", "hi!", xYZDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1212");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart4 = org.jfree.chart.ChartFactory.createTimeSeriesChart("", "", "hi!", xYDataset3);
        java.lang.Class<?> wildcardClass5 = jFreeChart4.getClass();
        org.junit.Assert.assertNotNull(jFreeChart4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1213");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepChart("", "hi!", "hi!", xYDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1214");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart("", "", "", categoryDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1215");
        org.jfree.data.xy.XYZDataset xYZDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBubbleChart("", "hi!", "hi!", xYZDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1216");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) (short) 1, true, false, true, locale7, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1217");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYLineChart("", "", "", xYDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1218");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, 0, true, true, true, locale7, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1219");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart("hi!", "", "hi!", categoryDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1220");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("hi!", "", "", xYDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1221");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart("", "", "", categoryDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1222");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, 0, true, false, false, locale7, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1223");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedAreaChart("hi!", "", "", categoryDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1224");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepAreaChart("hi!", "", "", xYDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1225");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createAreaChart("", "hi!", "", categoryDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1226");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) (byte) -1, false, true, false, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1227");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) '#', true, false, false, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1228");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) '#', false, true, false, locale7, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1229");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart("hi!", "", "", categoryDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1230");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("", "hi!", "hi!", intervalCategoryDataset3, true, true, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1231");
        org.jfree.data.xy.XYZDataset xYZDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBubbleChart("hi!", "hi!", "hi!", xYZDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1232");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createHistogram("hi!", "", "", intervalXYDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1233");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createTimeSeriesChart("", "hi!", "hi!", xYDataset3, false, false, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1234");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedAreaChart("", "hi!", "", categoryDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1235");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) (byte) -1, false, false, false, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1236");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) (byte) 1, false, false, true, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1237");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("hi!", "", "hi!", windDataset3, false, false, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1238");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createAreaChart("hi!", "hi!", "hi!", categoryDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1239");
        org.jfree.data.xy.XYZDataset xYZDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBubbleChart("", "", "", xYZDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1240");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedAreaChart("hi!", "hi!", "", categoryDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1241");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createTimeSeriesChart("hi!", "hi!", "", xYDataset3, true, true, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1242");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("", "", false, "", intervalXYDataset4, plotOrientation5, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1243");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart("", "", "", categoryDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1244");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedAreaChart("hi!", "hi!", "hi!", categoryDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1245");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) ' ', true, true, true, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1246");
        org.jfree.data.xy.XYZDataset xYZDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBubbleChart("", "hi!", "", xYZDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1247");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (-1), false, true, true, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1248");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createTimeSeriesChart("", "", "", xYDataset3, false, true, true);
        java.lang.Class<?> wildcardClass8 = jFreeChart7.getClass();
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1249");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("hi!", "", false, "hi!", intervalXYDataset4, plotOrientation5, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1250");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("", "", "", xYDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1251");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepChart("", "hi!", "", xYDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1252");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createTimeSeriesChart("", "", "", xYDataset3, false, false, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1253");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, 1, true, true, true, locale7, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1254");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) (byte) 100, false, false, true, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1255");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) (short) -1, false, true, true, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1256");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart("", "", "hi!", categoryDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1257");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart("", "hi!", "hi!", categoryDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1258");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYLineChart("hi!", "hi!", "hi!", xYDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1259");
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("hi!", "", "", boxAndWhiskerXYDataset3, false);
        java.lang.Class<?> wildcardClass6 = jFreeChart5.getClass();
        org.junit.Assert.assertNotNull(jFreeChart5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1260");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (-1), false, true, true, locale7, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1261");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("hi!", "", "hi!", windDataset3, false, true, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1262");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("", "", "hi!", intervalCategoryDataset3, false, false, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1263");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart("hi!", "hi!", "", categoryDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1264");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) (short) 1, true, true, false, locale7, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1265");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYLineChart("hi!", "", "hi!", xYDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1266");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createAreaChart("", "", "hi!", categoryDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1267");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) (short) 10, false, false, true, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1268");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("hi!", "hi!", true, "", intervalXYDataset4, plotOrientation5, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1269");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart("hi!", "hi!", "hi!", categoryDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1270");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) ' ', true, true, true, locale7, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1271");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) (byte) 10, false, false, true, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1272");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("hi!", "hi!", true, "hi!", intervalXYDataset4, plotOrientation5, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1273");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, 1, true, false, true, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1274");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYLineChart("", "hi!", "", xYDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1275");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) (short) 1, false, true, true, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1276");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) (byte) 10, true, true, true, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1277");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (-1), true, true, false, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1278");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart("", "", "hi!", categoryDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1279");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createAreaChart("", "hi!", "", categoryDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1280");
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("", "hi!", "", boxAndWhiskerXYDataset3, false);
        java.lang.Class<?> wildcardClass6 = jFreeChart5.getClass();
        org.junit.Assert.assertNotNull(jFreeChart5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1281");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("", "", "", xYDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1282");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYLineChart("hi!", "hi!", "hi!", xYDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1283");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart("", "hi!", "", categoryDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1284");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPieChart("", pieDataset1, false, true, false);
        java.lang.Class<?> wildcardClass6 = jFreeChart5.getClass();
        org.junit.Assert.assertNotNull(jFreeChart5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1285");
        org.jfree.data.xy.TableXYDataset tableXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedXYAreaChart("", "", "hi!", tableXYDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1286");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createXYBarChart("", "hi!", false, "", intervalXYDataset4);
        java.lang.Class<?> wildcardClass6 = jFreeChart5.getClass();
        org.junit.Assert.assertNotNull(jFreeChart5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1287");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createWaterfallChart("", "", "", categoryDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1288");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) (short) -1, true, true, true, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1289");
        org.jfree.data.xy.TableXYDataset tableXYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart4 = org.jfree.chart.ChartFactory.createStackedXYAreaChart("hi!", "", "", tableXYDataset3);
        java.lang.Class<?> wildcardClass5 = jFreeChart4.getClass();
        org.junit.Assert.assertNotNull(jFreeChart4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1290");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart("hi!", "", "", categoryDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1291");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) (short) 100, false, false, true, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1292");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createWaterfallChart("hi!", "hi!", "hi!", categoryDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1293");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepAreaChart("hi!", "hi!", "hi!", xYDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1294");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createWaterfallChart("", "hi!", "hi!", categoryDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1295");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createHistogram("", "", "", intervalXYDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1296");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, 0, false, false, true, locale7, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1297");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("", "", "", windDataset3, true, false, false);
        java.lang.Class<?> wildcardClass8 = jFreeChart7.getClass();
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1298");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("hi!", "hi!", "hi!", windDataset3, false, true, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1299");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createAreaChart("hi!", "", "", categoryDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1300");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createWaterfallChart("hi!", "", "", categoryDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1301");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) (short) 1, false, false, false, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1302");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, 100, true, true, true, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1303");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, 10, true, false, false, locale7, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1304");
        org.jfree.data.xy.TableXYDataset tableXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedXYAreaChart("hi!", "", "", tableXYDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1305");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (-1), false, false, false, locale7, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1306");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("", "", "", intervalCategoryDataset3, false, false, false);
        java.lang.Class<?> wildcardClass8 = jFreeChart7.getClass();
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1307");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) (byte) 100, false, true, true, locale7, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1308");
        org.jfree.data.xy.XYZDataset xYZDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBubbleChart("", "", "", xYZDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1309");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("", "hi!", true, "", intervalXYDataset4, plotOrientation5, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1310");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepChart("hi!", "", "", xYDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1311");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("", "", "", windDataset3, true, false, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1312");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createHistogram("", "hi!", "", intervalXYDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1313");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createAreaChart("hi!", "hi!", "hi!", categoryDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1314");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("hi!", "", "hi!", intervalCategoryDataset3, true, true, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1315");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createAreaChart("", "", "hi!", categoryDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1316");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createTimeSeriesChart("hi!", "", "hi!", xYDataset3, false, false, true);
        java.lang.Class<?> wildcardClass8 = jFreeChart7.getClass();
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1317");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedAreaChart("", "hi!", "hi!", categoryDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1318");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("hi!", "", "", windDataset3, true, true, false);
        java.lang.Class<?> wildcardClass8 = jFreeChart7.getClass();
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1319");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPieChart("", pieDataset1, false, false, true);
        java.lang.Class<?> wildcardClass6 = jFreeChart5.getClass();
        org.junit.Assert.assertNotNull(jFreeChart5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1320");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart4 = org.jfree.chart.ChartFactory.createScatterPlot("hi!", "hi!", "", xYDataset3);
        java.lang.Class<?> wildcardClass5 = jFreeChart4.getClass();
        org.junit.Assert.assertNotNull(jFreeChart4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1321");
        org.jfree.data.xy.XYZDataset xYZDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBubbleChart("hi!", "", "", xYZDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1322");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, 0, false, true, true, locale7, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1323");
        org.jfree.chart.ChartTheme chartTheme0 = org.jfree.chart.ChartFactory.getChartTheme();
        org.jfree.chart.ChartFactory.setChartTheme(chartTheme0);
        org.jfree.chart.ChartFactory.setChartTheme(chartTheme0);
        org.jfree.chart.ChartFactory.setChartTheme(chartTheme0);
        org.jfree.chart.ChartFactory.setChartTheme(chartTheme0);
        org.jfree.chart.ChartFactory.setChartTheme(chartTheme0);
        org.jfree.chart.ChartFactory.setChartTheme(chartTheme0);
        org.jfree.chart.ChartFactory.setChartTheme(chartTheme0);
        org.jfree.chart.ChartFactory.setChartTheme(chartTheme0);
        org.jfree.chart.ChartFactory.setChartTheme(chartTheme0);
        org.jfree.chart.ChartFactory.setChartTheme(chartTheme0);
        java.lang.Class<?> wildcardClass11 = chartTheme0.getClass();
        org.junit.Assert.assertNotNull(chartTheme0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1324");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYLineChart("", "hi!", "", xYDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1325");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createAreaChart("hi!", "hi!", "hi!", categoryDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1326");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) (short) 1, false, false, false, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1327");
        org.jfree.chart.ChartTheme chartTheme0 = org.jfree.chart.ChartFactory.getChartTheme();
        org.jfree.chart.ChartFactory.setChartTheme(chartTheme0);
        org.jfree.chart.ChartFactory.setChartTheme(chartTheme0);
        org.jfree.chart.ChartFactory.setChartTheme(chartTheme0);
        org.jfree.chart.ChartFactory.setChartTheme(chartTheme0);
        org.jfree.chart.ChartFactory.setChartTheme(chartTheme0);
        org.jfree.chart.ChartFactory.setChartTheme(chartTheme0);
        org.jfree.chart.ChartFactory.setChartTheme(chartTheme0);
        org.jfree.chart.ChartFactory.setChartTheme(chartTheme0);
        org.jfree.chart.ChartFactory.setChartTheme(chartTheme0);
        org.jfree.chart.ChartFactory.setChartTheme(chartTheme0);
        org.jfree.chart.ChartFactory.setChartTheme(chartTheme0);
        java.lang.Class<?> wildcardClass12 = chartTheme0.getClass();
        org.junit.Assert.assertNotNull(chartTheme0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1328");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createAreaChart("hi!", "", "hi!", categoryDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1329");
        org.jfree.data.xy.XYZDataset xYZDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBubbleChart("hi!", "", "", xYZDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1330");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) '4', true, false, true, locale7, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1331");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("", "hi!", "hi!", intervalCategoryDataset3, true, false, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1332");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedAreaChart("hi!", "", "hi!", categoryDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1333");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("hi!", "", "hi!", intervalCategoryDataset3, false, false, false);
        java.lang.Class<?> wildcardClass8 = jFreeChart7.getClass();
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1334");
        org.jfree.data.xy.TableXYDataset tableXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedXYAreaChart("hi!", "hi!", "", tableXYDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1335");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) (byte) 0, true, false, false, locale7, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1336");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("", "hi!", true, "", intervalXYDataset4, plotOrientation5, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1337");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) '#', false, false, false, locale7, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1338");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart("", "hi!", "", categoryDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1339");
        org.jfree.data.xy.TableXYDataset tableXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedXYAreaChart("hi!", "", "hi!", tableXYDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1340");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) (short) 1, true, true, false, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1341");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart("", "hi!", "hi!", categoryDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1342");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYLineChart("", "", "hi!", xYDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1343");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart("hi!", "hi!", "", categoryDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1344");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) (short) 100, true, true, true, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1345");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("hi!", "hi!", false, "", intervalXYDataset4, plotOrientation5, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1346");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepChart("", "hi!", "", xYDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1347");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) (short) 100, false, false, true, locale7, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1348");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) (short) 1, false, true, false, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1349");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepChart("", "hi!", "hi!", xYDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1350");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) (byte) 10, false, true, false, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1351");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart("", "", "", categoryDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1352");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepChart("", "hi!", "", xYDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1353");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createHistogram("", "hi!", "", intervalXYDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1354");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) (short) 0, true, false, true, locale7, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1355");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("", "hi!", "hi!", windDataset3, false, true, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1356");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart("", "hi!", "", categoryDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1357");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYLineChart("", "hi!", "hi!", xYDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1358");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) (byte) 10, false, true, false, locale7, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1359");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("", "", "", xYDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1360");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createWaterfallChart("hi!", "hi!", "hi!", categoryDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1361");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedAreaChart("hi!", "hi!", "hi!", categoryDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1362");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, 100, false, true, false, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1363");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) 'a', false, false, false, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1364");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) (short) 1, true, false, false, locale7, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1365");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart("hi!", "hi!", "hi!", categoryDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1366");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart("", "hi!", "hi!", categoryDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1367");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createTimeSeriesChart("hi!", "", "", xYDataset3, true, true, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1368");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createTimeSeriesChart("hi!", "", "hi!", xYDataset3, true, false, false);
        java.lang.Class<?> wildcardClass8 = jFreeChart7.getClass();
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1369");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (-1), true, true, false, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1370");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepChart("hi!", "hi!", "", xYDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1371");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("", "hi!", "", windDataset3, true, false, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1372");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createTimeSeriesChart("hi!", "hi!", "hi!", xYDataset3, false, true, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1373");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) ' ', true, true, false, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1374");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart("", "hi!", "hi!", categoryDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1375");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) 'a', true, false, true, locale7, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1376");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart("hi!", "hi!", "hi!", categoryDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1377");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) (byte) 1, true, false, false, locale7, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1378");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, 1, true, true, false, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1379");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createHighLowChart("", "", "hi!", oHLCDataset3, false);
        java.lang.Class<?> wildcardClass6 = jFreeChart5.getClass();
        org.junit.Assert.assertNotNull(jFreeChart5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1380");
        org.jfree.data.xy.TableXYDataset tableXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedXYAreaChart("hi!", "hi!", "", tableXYDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1381");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) 'a', false, false, true, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1382");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createWaterfallChart("hi!", "hi!", "hi!", categoryDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1383");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart("", "hi!", "", categoryDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1384");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart("", "", "hi!", categoryDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1385");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepAreaChart("hi!", "", "", xYDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1386");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createTimeSeriesChart("", "", "", xYDataset3, true, true, true);
        java.lang.Class<?> wildcardClass8 = jFreeChart7.getClass();
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1387");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYLineChart("hi!", "", "", xYDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1388");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYLineChart("hi!", "", "hi!", xYDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1389");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createTimeSeriesChart("", "", "hi!", xYDataset3, false, true, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1390");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, 10, true, true, false, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1391");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) (short) 10, true, false, false, locale7, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1392");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createHistogram("hi!", "hi!", "hi!", intervalXYDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1393");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("hi!", "", "", intervalCategoryDataset3, false, true, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1394");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) (short) 1, true, false, true, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1395");
        org.jfree.data.xy.XYDataset xYDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPolarChart("", xYDataset1, false, false, false);
        java.lang.Class<?> wildcardClass6 = jFreeChart5.getClass();
        org.junit.Assert.assertNotNull(jFreeChart5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1396");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("", "", false, "hi!", intervalXYDataset4, plotOrientation5, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1397");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepAreaChart("", "hi!", "", xYDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1398");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYLineChart("", "hi!", "hi!", xYDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1399");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart("", "hi!", "hi!", categoryDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1400");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("", "", "hi!", windDataset3, false, true, false);
        java.lang.Class<?> wildcardClass8 = jFreeChart7.getClass();
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1401");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createHistogram("hi!", "", "hi!", intervalXYDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1402");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createWaterfallChart("hi!", "", "", categoryDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1403");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createCandlestickChart("hi!", "hi!", "hi!", oHLCDataset3, true);
        java.lang.Class<?> wildcardClass6 = jFreeChart5.getClass();
        org.junit.Assert.assertNotNull(jFreeChart5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1404");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, 10, false, false, false, locale7, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1405");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) (byte) 1, true, true, true, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1406");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart4 = org.jfree.chart.ChartFactory.createStackedBarChart("hi!", "", "hi!", categoryDataset3);
        java.lang.Class<?> wildcardClass5 = jFreeChart4.getClass();
        org.junit.Assert.assertNotNull(jFreeChart4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1407");
        org.jfree.data.xy.XYZDataset xYZDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBubbleChart("", "hi!", "hi!", xYZDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1408");
        org.jfree.chart.ChartTheme chartTheme0 = org.jfree.chart.ChartFactory.getChartTheme();
        org.jfree.chart.ChartFactory.setChartTheme(chartTheme0);
        org.jfree.chart.ChartFactory.setChartTheme(chartTheme0);
        org.jfree.chart.ChartFactory.setChartTheme(chartTheme0);
        org.jfree.chart.ChartFactory.setChartTheme(chartTheme0);
        org.jfree.chart.ChartFactory.setChartTheme(chartTheme0);
        org.jfree.chart.ChartFactory.setChartTheme(chartTheme0);
        org.jfree.chart.ChartFactory.setChartTheme(chartTheme0);
        org.jfree.chart.ChartFactory.setChartTheme(chartTheme0);
        org.jfree.chart.ChartFactory.setChartTheme(chartTheme0);
        org.jfree.chart.ChartFactory.setChartTheme(chartTheme0);
        org.jfree.chart.ChartFactory.setChartTheme(chartTheme0);
        org.jfree.chart.ChartFactory.setChartTheme(chartTheme0);
        org.jfree.chart.ChartFactory.setChartTheme(chartTheme0);
        org.jfree.chart.ChartFactory.setChartTheme(chartTheme0);
        org.junit.Assert.assertNotNull(chartTheme0);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1409");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("", "", "hi!", intervalCategoryDataset3, false, false, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1410");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("", "", "", windDataset3, true, true, false);
        java.lang.Class<?> wildcardClass8 = jFreeChart7.getClass();
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1411");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("hi!", "hi!", "", intervalCategoryDataset3, true, false, true);
        java.lang.Class<?> wildcardClass8 = jFreeChart7.getClass();
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1412");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("", "hi!", "hi!", intervalCategoryDataset3, true, true, true);
        java.lang.Class<?> wildcardClass8 = jFreeChart7.getClass();
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1413");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) (short) 1, false, false, false, locale7, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1414");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart("", "", "", categoryDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1415");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYLineChart("hi!", "hi!", "hi!", xYDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1416");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart("hi!", "hi!", "", categoryDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1417");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) (short) 0, true, false, true, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1418");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart4 = org.jfree.chart.ChartFactory.createStackedAreaChart("", "hi!", "hi!", categoryDataset3);
        java.lang.Class<?> wildcardClass5 = jFreeChart4.getClass();
        org.junit.Assert.assertNotNull(jFreeChart4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1419");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYLineChart("", "hi!", "hi!", xYDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1420");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("", "hi!", "", windDataset3, true, true, true);
        java.lang.Class<?> wildcardClass8 = jFreeChart7.getClass();
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1421");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart("hi!", "", "", categoryDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1422");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepChart("hi!", "", "hi!", xYDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1423");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, 1, true, true, false, locale7, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1424");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepAreaChart("hi!", "hi!", "", xYDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1425");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createHistogram("", "hi!", "", intervalXYDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1426");
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("hi!", "hi!", "", boxAndWhiskerXYDataset3, false);
        java.lang.Class<?> wildcardClass6 = jFreeChart5.getClass();
        org.junit.Assert.assertNotNull(jFreeChart5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1427");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) (short) 100, true, false, true, locale7, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1428");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("hi!", "hi!", "", windDataset3, false, false, true);
        java.lang.Class<?> wildcardClass8 = jFreeChart7.getClass();
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1429");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart("hi!", "", "hi!", categoryDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1430");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYLineChart("", "hi!", "hi!", xYDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1431");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("hi!", "hi!", "", xYDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1432");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) (byte) 1, true, false, false, locale7, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1433");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("", "", "hi!", windDataset3, false, false, true);
        java.lang.Class<?> wildcardClass8 = jFreeChart7.getClass();
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1434");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart("", "", "hi!", categoryDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1435");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) '#', false, false, true, locale7, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1436");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("hi!", "hi!", "hi!", xYDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1437");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart("hi!", "hi!", "hi!", categoryDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1438");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) (byte) 10, false, true, true, locale7, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1439");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart("", "hi!", "", categoryDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1440");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createAreaChart("hi!", "", "hi!", categoryDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1441");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, 1, true, false, false, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1442");
        org.jfree.data.xy.XYZDataset xYZDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBubbleChart("hi!", "hi!", "hi!", xYZDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1443");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) '4', true, true, true, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1444");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepAreaChart("hi!", "hi!", "hi!", xYDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1445");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createAreaChart("", "", "", categoryDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1446");
        org.jfree.data.xy.TableXYDataset tableXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedXYAreaChart("", "hi!", "", tableXYDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1447");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("hi!", "hi!", "hi!", xYDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1448");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createHistogram("", "", "hi!", intervalXYDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1449");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createWaterfallChart("hi!", "hi!", "hi!", categoryDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1450");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, 0, false, true, true, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1451");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart4 = org.jfree.chart.ChartFactory.createStackedAreaChart("", "", "", categoryDataset3);
        java.lang.Class<?> wildcardClass5 = jFreeChart4.getClass();
        org.junit.Assert.assertNotNull(jFreeChart4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1452");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("hi!", "hi!", "", windDataset3, false, true, false);
        java.lang.Class<?> wildcardClass8 = jFreeChart7.getClass();
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1453");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) (byte) 10, false, false, true, locale7, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1454");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createXYBarChart("", "", false, "hi!", intervalXYDataset4);
        java.lang.Class<?> wildcardClass6 = jFreeChart5.getClass();
        org.junit.Assert.assertNotNull(jFreeChart5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1455");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createTimeSeriesChart("hi!", "", "", xYDataset3, false, true, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1456");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) (byte) 100, false, true, false, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1457");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepChart("hi!", "hi!", "", xYDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1458");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createWaterfallChart("hi!", "hi!", "", categoryDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1459");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) (short) 0, true, true, false, locale7, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1460");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("hi!", "hi!", false, "hi!", intervalXYDataset4, plotOrientation5, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1461");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("hi!", "", "", windDataset3, true, true, true);
        java.lang.Class<?> wildcardClass8 = jFreeChart7.getClass();
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1462");
        org.jfree.data.xy.TableXYDataset tableXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedXYAreaChart("hi!", "", "hi!", tableXYDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1463");
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("hi!", "", "hi!", boxAndWhiskerXYDataset3, true);
        java.lang.Class<?> wildcardClass6 = jFreeChart5.getClass();
        org.junit.Assert.assertNotNull(jFreeChart5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1464");
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("", "", "", boxAndWhiskerXYDataset3, true);
        java.lang.Class<?> wildcardClass6 = jFreeChart5.getClass();
        org.junit.Assert.assertNotNull(jFreeChart5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1465");
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("", "", "hi!", boxAndWhiskerXYDataset3, false);
        java.lang.Class<?> wildcardClass6 = jFreeChart5.getClass();
        org.junit.Assert.assertNotNull(jFreeChart5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1466");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepChart("", "", "", xYDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1467");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createHighLowChart("hi!", "hi!", "", oHLCDataset3, true);
        java.lang.Class<?> wildcardClass6 = jFreeChart5.getClass();
        org.junit.Assert.assertNotNull(jFreeChart5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1468");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("hi!", "hi!", "", intervalCategoryDataset3, false, false, false);
        java.lang.Class<?> wildcardClass8 = jFreeChart7.getClass();
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1469");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart("hi!", "", "hi!", categoryDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1470");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYLineChart("hi!", "hi!", "hi!", xYDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1471");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) ' ', true, true, false, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1472");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("hi!", "", "hi!", windDataset3, true, false, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1473");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart("hi!", "hi!", "", categoryDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1474");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart("hi!", "hi!", "", categoryDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1475");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("hi!", "hi!", true, "", intervalXYDataset4, plotOrientation5, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1476");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedAreaChart("hi!", "", "", categoryDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1477");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("hi!", "hi!", false, "hi!", intervalXYDataset4, plotOrientation5, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1478");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart4 = org.jfree.chart.ChartFactory.createBarChart("", "", "", categoryDataset3);
        java.lang.Class<?> wildcardClass5 = jFreeChart4.getClass();
        org.junit.Assert.assertNotNull(jFreeChart4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1479");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createWaterfallChart("", "", "", categoryDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1480");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) (short) 0, false, false, true, locale7, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1481");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (int) (byte) 0, false, true, false, locale7, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1482");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart("", "hi!", "", categoryDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1483");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, 1, false, false, false, locale7, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1484");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) (short) -1, false, false, true, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1485");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createTimeSeriesChart("", "hi!", "hi!", xYDataset3, true, false, false);
        java.lang.Class<?> wildcardClass8 = jFreeChart7.getClass();
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1486");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedAreaChart("hi!", "hi!", "", categoryDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1487");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, (int) '4', true, true, false, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1488");
        org.jfree.data.xy.XYDataset xYDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPolarChart("", xYDataset1, true, true, true);
        java.lang.Class<?> wildcardClass6 = jFreeChart5.getClass();
        org.junit.Assert.assertNotNull(jFreeChart5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1489");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, 10, true, true, false, locale7, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1490");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepAreaChart("hi!", "", "", xYDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1491");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createHistogram("hi!", "hi!", "hi!", intervalXYDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1492");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", strPieDataset1, strPieDataset2, 100, false, true, true, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1493");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart("", "hi!", "", categoryDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1494");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createHistogram("", "", "hi!", intervalXYDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1495");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("", "hi!", "hi!", windDataset3, true, false, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1496");
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset1 = null;
        org.jfree.data.general.PieDataset<java.lang.String> strPieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", strPieDataset1, strPieDataset2, (-1), true, false, true, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.general.PieDataset.getKeys()\" because \"dataset\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1497");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepChart("", "", "hi!", xYDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1498");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart("hi!", "", "hi!", categoryDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1499");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("", "hi!", "", intervalCategoryDataset3, false, true, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_007_Regression2.test1500");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createAreaChart("hi!", "hi!", "", categoryDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}


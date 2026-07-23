package org.jfree.chart.renderer;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AbstractRendererRegressionTest0 {

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
            System.out.format("%n%s%n", "AbstractRendererRegressionTest0.test01");
        java.lang.Double double0 = org.jfree.chart.renderer.AbstractRenderer.ZERO;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractRendererRegressionTest0.test02");
        java.awt.Font font0 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        java.lang.Class<?> wildcardClass1 = font0.getClass();
        org.junit.Assert.assertNotNull(font0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractRendererRegressionTest0.test03");
        java.awt.Paint paint0 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        java.lang.Class<?> wildcardClass1 = paint0.getClass();
        org.junit.Assert.assertNotNull(paint0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractRendererRegressionTest0.test04");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractRendererRegressionTest0.test05");
        java.awt.Stroke stroke0 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        java.lang.Class<?> wildcardClass1 = stroke0.getClass();
        org.junit.Assert.assertNotNull(stroke0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractRendererRegressionTest0.test06");
        org.jfree.chart.api.RectangleInsets rectangleInsets0 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_ITEM_LABEL_INSETS;
        java.lang.Class<?> wildcardClass1 = rectangleInsets0.getClass();
        org.junit.Assert.assertNotNull(rectangleInsets0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractRendererRegressionTest0.test07");
        java.awt.Shape shape0 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        java.lang.Class<?> wildcardClass1 = shape0.getClass();
        org.junit.Assert.assertNotNull(shape0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractRendererRegressionTest0.test08");
        java.awt.Stroke stroke0 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.lang.Class<?> wildcardClass1 = stroke0.getClass();
        org.junit.Assert.assertNotNull(stroke0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractRendererRegressionTest0.test09");
        java.awt.Paint paint0 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        java.lang.Class<?> wildcardClass1 = paint0.getClass();
        org.junit.Assert.assertNotNull(paint0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractRendererRegressionTest0.test10");
        java.awt.Paint paint0 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        java.lang.Class<?> wildcardClass1 = paint0.getClass();
        org.junit.Assert.assertNotNull(paint0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}


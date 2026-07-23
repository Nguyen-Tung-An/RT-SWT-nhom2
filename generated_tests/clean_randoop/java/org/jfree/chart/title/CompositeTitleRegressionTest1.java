package org.jfree.chart.title;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CompositeTitleRegressionTest1 {

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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test501");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        double double5 = compositeTitle0.getContentYOffset();
        double double6 = compositeTitle0.getHeight();
        java.lang.String str7 = compositeTitle0.getID();
        boolean boolean8 = compositeTitle0.isVisible();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test502");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        org.jfree.chart.api.VerticalAlignment verticalAlignment5 = compositeTitle0.getVerticalAlignment();
        org.jfree.chart.api.HorizontalAlignment horizontalAlignment6 = compositeTitle0.getHorizontalAlignment();
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.block.Size2D size2D9 = compositeTitle0.arrange(graphics2D7, rectangleConstraint8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'c' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + verticalAlignment5 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment5.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + horizontalAlignment6 + "' != '" + org.jfree.chart.api.HorizontalAlignment.CENTER + "'", horizontalAlignment6.equals(org.jfree.chart.api.HorizontalAlignment.CENTER));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test503");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment3 = compositeTitle0.getVerticalAlignment();
        org.jfree.chart.api.VerticalAlignment verticalAlignment4 = compositeTitle0.getVerticalAlignment();
        java.awt.Paint paint5 = null;
        compositeTitle0.setBackgroundPaint(paint5);
        compositeTitle0.visible = false;
        compositeTitle0.setVisible(false);
        org.jfree.chart.title.CompositeTitle compositeTitle11 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str12 = compositeTitle11.getID();
        org.jfree.chart.block.BlockContainer blockContainer13 = compositeTitle11.getContainer();
        org.jfree.chart.title.CompositeTitle compositeTitle14 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str15 = compositeTitle14.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge16 = compositeTitle14.getPosition();
        compositeTitle11.setPosition(rectangleEdge16);
        compositeTitle0.setPosition(rectangleEdge16);
        java.awt.Paint paint19 = compositeTitle0.getBackgroundPaint();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertTrue("'" + verticalAlignment3 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment3.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + verticalAlignment4 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment4.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(blockContainer13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + rectangleEdge16 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge16.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertNull(paint19);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test504");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment3 = compositeTitle0.getVerticalAlignment();
        org.jfree.chart.api.VerticalAlignment verticalAlignment4 = compositeTitle0.getVerticalAlignment();
        java.awt.Paint paint5 = null;
        compositeTitle0.setBackgroundPaint(paint5);
        compositeTitle0.visible = false;
        compositeTitle0.setVisible(false);
        org.jfree.chart.event.TitleChangeListener titleChangeListener11 = null;
        compositeTitle0.removeChangeListener(titleChangeListener11);
        compositeTitle0.visible = false;
        boolean boolean15 = compositeTitle0.visible;
        org.jfree.chart.api.RectangleInsets rectangleInsets16 = compositeTitle0.getMargin();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertTrue("'" + verticalAlignment3 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment3.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + verticalAlignment4 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment4.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(rectangleInsets16);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test505");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        compositeTitle0.setPadding(0.0d, (double) 1L, (double) 10L, (double) (short) 0);
        compositeTitle0.setPadding((double) 10L, (double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        org.jfree.chart.block.BlockFrame blockFrame13 = compositeTitle0.getFrame();
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.title.CompositeTitle compositeTitle15 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str16 = compositeTitle15.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge17 = compositeTitle15.getPosition();
        boolean boolean18 = compositeTitle15.getNotify();
        java.lang.String str19 = compositeTitle15.getID();
        org.jfree.chart.api.VerticalAlignment verticalAlignment20 = compositeTitle15.getVerticalAlignment();
        org.jfree.chart.block.BlockContainer blockContainer21 = compositeTitle15.getContainer();
        org.jfree.chart.event.TitleChangeListener titleChangeListener22 = null;
        compositeTitle15.addChangeListener(titleChangeListener22);
        compositeTitle15.setBorder((double) 10, 1.0d, 100.0d, (double) 10);
        compositeTitle15.setBorder((double) (short) 0, (double) (-1), (double) (byte) -1, (double) ' ');
        double double34 = compositeTitle15.getContentXOffset();
        boolean boolean35 = compositeTitle15.isVisible();
        java.awt.geom.Rectangle2D rectangle2D36 = compositeTitle15.getBounds();
        // The following exception was thrown during execution in test generation
        try {
            compositeTitle0.draw(graphics2D14, rectangle2D36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics2D.setPaint(java.awt.Paint)\" because \"g2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertNotNull(blockFrame13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + rectangleEdge17 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge17.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + verticalAlignment20 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment20.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNotNull(blockContainer21);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(rectangle2D36);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test506");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        compositeTitle0.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        double double10 = compositeTitle0.getWidth();
        compositeTitle0.setVisible(true);
        boolean boolean13 = compositeTitle0.visible;
        boolean boolean14 = compositeTitle0.isVisible();
        org.jfree.chart.block.BlockFrame blockFrame15 = compositeTitle0.getFrame();
        org.jfree.chart.block.BlockContainer blockContainer16 = compositeTitle0.getContainer();
        double double17 = compositeTitle0.getHeight();
        double double18 = compositeTitle0.getContentYOffset();
        org.jfree.chart.api.VerticalAlignment verticalAlignment19 = compositeTitle0.getVerticalAlignment();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(blockFrame15);
        org.junit.Assert.assertNotNull(blockContainer16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + verticalAlignment19 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment19.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test507");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        boolean boolean1 = compositeTitle0.getNotify();
        java.awt.Paint paint2 = compositeTitle0.getBackgroundPaint();
        org.jfree.chart.event.TitleChangeListener titleChangeListener3 = null;
        compositeTitle0.addChangeListener(titleChangeListener3);
        double double5 = compositeTitle0.getHeight();
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.block.Size2D size2D7 = compositeTitle0.arrange(graphics2D6);
        compositeTitle0.setBorder((double) 10.0f, 1.0d, 2.0d, (double) 1L);
        org.jfree.chart.api.RectangleEdge rectangleEdge13 = null;
        // The following exception was thrown during execution in test generation
        try {
            compositeTitle0.setPosition(rectangleEdge13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'position' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(size2D7);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test508");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        compositeTitle0.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        double double10 = compositeTitle0.getWidth();
        compositeTitle0.setVisible(true);
        boolean boolean13 = compositeTitle0.visible;
        boolean boolean14 = compositeTitle0.isVisible();
        org.jfree.chart.block.BlockFrame blockFrame15 = compositeTitle0.getFrame();
        org.jfree.chart.block.BlockContainer blockContainer16 = compositeTitle0.getContainer();
        double double17 = compositeTitle0.getHeight();
        double double18 = compositeTitle0.getContentXOffset();
        org.jfree.chart.api.VerticalAlignment verticalAlignment19 = compositeTitle0.getVerticalAlignment();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(blockFrame15);
        org.junit.Assert.assertNotNull(blockContainer16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + verticalAlignment19 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment19.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test509");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        org.jfree.chart.api.RectangleInsets rectangleInsets3 = compositeTitle0.getMargin();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertNotNull(rectangleInsets3);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test510");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment3 = compositeTitle0.getVerticalAlignment();
        org.jfree.chart.api.VerticalAlignment verticalAlignment4 = compositeTitle0.getVerticalAlignment();
        org.jfree.chart.event.TitleChangeListener titleChangeListener5 = null;
        compositeTitle0.addChangeListener(titleChangeListener5);
        org.jfree.chart.title.CompositeTitle compositeTitle7 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str8 = compositeTitle7.getID();
        org.jfree.chart.block.BlockContainer blockContainer9 = compositeTitle7.getContainer();
        compositeTitle7.setPadding(0.0d, (double) 1L, (double) 10L, (double) (short) 0);
        compositeTitle7.setPadding((double) 10L, (double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        org.jfree.chart.api.RectangleInsets rectangleInsets20 = compositeTitle7.getMargin();
        org.jfree.chart.event.TitleChangeListener titleChangeListener21 = null;
        compositeTitle7.removeChangeListener(titleChangeListener21);
        org.jfree.chart.api.HorizontalAlignment horizontalAlignment23 = compositeTitle7.getHorizontalAlignment();
        compositeTitle0.setHorizontalAlignment(horizontalAlignment23);
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.block.Size2D size2D26 = compositeTitle0.arrange(graphics2D25);
        compositeTitle0.setBorder((double) (short) 100, (double) (short) 10, (double) (-1.0f), (-1.0d));
        org.jfree.chart.event.TitleChangeListener titleChangeListener32 = null;
        compositeTitle0.removeChangeListener(titleChangeListener32);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertTrue("'" + verticalAlignment3 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment3.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + verticalAlignment4 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment4.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(blockContainer9);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertTrue("'" + horizontalAlignment23 + "' != '" + org.jfree.chart.api.HorizontalAlignment.CENTER + "'", horizontalAlignment23.equals(org.jfree.chart.api.HorizontalAlignment.CENTER));
        org.junit.Assert.assertNotNull(size2D26);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test511");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        compositeTitle0.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        org.jfree.chart.api.HorizontalAlignment horizontalAlignment10 = org.jfree.chart.title.Title.DEFAULT_HORIZONTAL_ALIGNMENT;
        compositeTitle0.setHorizontalAlignment(horizontalAlignment10);
        org.jfree.chart.title.CompositeTitle compositeTitle12 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str13 = compositeTitle12.getID();
        org.jfree.chart.block.BlockContainer blockContainer14 = compositeTitle12.getContainer();
        compositeTitle12.setPadding(0.0d, (double) 1L, (double) 10L, (double) (short) 0);
        compositeTitle12.setPadding((double) 10L, (double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        org.jfree.chart.api.RectangleInsets rectangleInsets25 = compositeTitle12.getMargin();
        compositeTitle0.setMargin(rectangleInsets25);
        org.jfree.chart.title.CompositeTitle compositeTitle27 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str28 = compositeTitle27.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge29 = compositeTitle27.getPosition();
        boolean boolean30 = compositeTitle27.getNotify();
        org.jfree.chart.title.CompositeTitle compositeTitle31 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str32 = compositeTitle31.getID();
        org.jfree.chart.block.BlockContainer blockContainer33 = compositeTitle31.getContainer();
        compositeTitle27.setTitleContainer(blockContainer33);
        org.jfree.chart.block.BlockContainer blockContainer35 = compositeTitle27.getContainer();
        compositeTitle27.setPadding((double) (byte) 100, (double) (short) 0, (double) (short) 0, (double) (byte) 100);
        org.jfree.chart.title.CompositeTitle compositeTitle41 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str42 = compositeTitle41.getID();
        org.jfree.chart.block.BlockContainer blockContainer43 = compositeTitle41.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment44 = compositeTitle41.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle45 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str46 = compositeTitle45.getID();
        org.jfree.chart.block.BlockContainer blockContainer47 = compositeTitle45.getContainer();
        compositeTitle41.setTitleContainer(blockContainer47);
        blockContainer47.setBorder((double) (short) 0, (double) (short) 0, (double) 0L, (-1.0d));
        compositeTitle27.setTitleContainer(blockContainer47);
        org.jfree.chart.title.CompositeTitle compositeTitle55 = new org.jfree.chart.title.CompositeTitle(blockContainer47);
        compositeTitle0.setTitleContainer(blockContainer47);
        double double57 = blockContainer47.getHeight();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + horizontalAlignment10 + "' != '" + org.jfree.chart.api.HorizontalAlignment.CENTER + "'", horizontalAlignment10.equals(org.jfree.chart.api.HorizontalAlignment.CENTER));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(blockContainer14);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + rectangleEdge29 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge29.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(blockContainer33);
        org.junit.Assert.assertNotNull(blockContainer35);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(blockContainer43);
        org.junit.Assert.assertTrue("'" + verticalAlignment44 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment44.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(blockContainer47);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test512");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        boolean boolean1 = compositeTitle0.getNotify();
        org.jfree.chart.title.CompositeTitle compositeTitle2 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str3 = compositeTitle2.getID();
        org.jfree.chart.block.BlockContainer blockContainer4 = compositeTitle2.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment5 = compositeTitle2.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle6 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str7 = compositeTitle6.getID();
        org.jfree.chart.block.BlockContainer blockContainer8 = compositeTitle6.getContainer();
        compositeTitle2.setTitleContainer(blockContainer8);
        org.jfree.chart.title.CompositeTitle compositeTitle10 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str11 = compositeTitle10.getID();
        org.jfree.chart.block.BlockContainer blockContainer12 = compositeTitle10.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment13 = compositeTitle10.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle14 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str15 = compositeTitle14.getID();
        org.jfree.chart.block.BlockContainer blockContainer16 = compositeTitle14.getContainer();
        compositeTitle10.setTitleContainer(blockContainer16);
        compositeTitle2.setTitleContainer(blockContainer16);
        double double19 = blockContainer16.getContentXOffset();
        compositeTitle0.setTitleContainer(blockContainer16);
        org.jfree.chart.title.CompositeTitle compositeTitle21 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str22 = compositeTitle21.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge23 = compositeTitle21.getPosition();
        boolean boolean24 = compositeTitle21.getNotify();
        java.lang.String str25 = compositeTitle21.getID();
        org.jfree.chart.api.VerticalAlignment verticalAlignment26 = compositeTitle21.getVerticalAlignment();
        org.jfree.chart.block.BlockContainer blockContainer27 = compositeTitle21.getContainer();
        org.jfree.chart.title.CompositeTitle compositeTitle28 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str29 = compositeTitle28.getID();
        org.jfree.chart.block.BlockContainer blockContainer30 = compositeTitle28.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment31 = compositeTitle28.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle32 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str33 = compositeTitle32.getID();
        org.jfree.chart.block.BlockContainer blockContainer34 = compositeTitle32.getContainer();
        compositeTitle28.setTitleContainer(blockContainer34);
        compositeTitle21.setTitleContainer(blockContainer34);
        compositeTitle0.setTitleContainer(blockContainer34);
        org.jfree.chart.title.CompositeTitle compositeTitle38 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str39 = compositeTitle38.getID();
        org.jfree.chart.block.BlockContainer blockContainer40 = compositeTitle38.getContainer();
        compositeTitle38.setPadding((double) (byte) 100, (double) '#', (double) 0L, (double) 100);
        org.jfree.chart.event.TitleChangeListener titleChangeListener46 = null;
        compositeTitle38.removeChangeListener(titleChangeListener46);
        org.jfree.chart.title.CompositeTitle compositeTitle48 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str49 = compositeTitle48.getID();
        org.jfree.chart.block.BlockContainer blockContainer50 = compositeTitle48.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment51 = compositeTitle48.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle52 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str53 = compositeTitle52.getID();
        org.jfree.chart.block.BlockContainer blockContainer54 = compositeTitle52.getContainer();
        compositeTitle48.setTitleContainer(blockContainer54);
        org.jfree.chart.title.CompositeTitle compositeTitle56 = new org.jfree.chart.title.CompositeTitle(blockContainer54);
        org.jfree.chart.title.CompositeTitle compositeTitle57 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str58 = compositeTitle57.getID();
        org.jfree.chart.block.BlockContainer blockContainer59 = compositeTitle57.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment60 = compositeTitle57.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle61 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str62 = compositeTitle61.getID();
        org.jfree.chart.block.BlockContainer blockContainer63 = compositeTitle61.getContainer();
        compositeTitle57.setTitleContainer(blockContainer63);
        org.jfree.chart.title.CompositeTitle compositeTitle65 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str66 = compositeTitle65.getID();
        org.jfree.chart.block.BlockContainer blockContainer67 = compositeTitle65.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment68 = compositeTitle65.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle69 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str70 = compositeTitle69.getID();
        org.jfree.chart.block.BlockContainer blockContainer71 = compositeTitle69.getContainer();
        compositeTitle65.setTitleContainer(blockContainer71);
        compositeTitle57.setTitleContainer(blockContainer71);
        compositeTitle56.setTitleContainer(blockContainer71);
        org.jfree.chart.api.RectangleEdge rectangleEdge75 = compositeTitle56.getPosition();
        compositeTitle38.setPosition(rectangleEdge75);
        compositeTitle0.setPosition(rectangleEdge75);
        java.awt.Paint paint78 = compositeTitle0.getBackgroundPaint();
        org.jfree.chart.event.TitleChangeListener titleChangeListener79 = null;
        compositeTitle0.removeChangeListener(titleChangeListener79);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(blockContainer4);
        org.junit.Assert.assertTrue("'" + verticalAlignment5 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment5.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(blockContainer8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(blockContainer12);
        org.junit.Assert.assertTrue("'" + verticalAlignment13 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment13.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(blockContainer16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + rectangleEdge23 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge23.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + verticalAlignment26 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment26.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNotNull(blockContainer27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(blockContainer30);
        org.junit.Assert.assertTrue("'" + verticalAlignment31 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment31.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(blockContainer34);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(blockContainer40);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(blockContainer50);
        org.junit.Assert.assertTrue("'" + verticalAlignment51 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment51.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(blockContainer54);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(blockContainer59);
        org.junit.Assert.assertTrue("'" + verticalAlignment60 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment60.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(blockContainer63);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(blockContainer67);
        org.junit.Assert.assertTrue("'" + verticalAlignment68 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment68.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(blockContainer71);
        org.junit.Assert.assertTrue("'" + rectangleEdge75 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge75.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertNull(paint78);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test513");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment3 = compositeTitle0.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle4 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str5 = compositeTitle4.getID();
        org.jfree.chart.block.BlockContainer blockContainer6 = compositeTitle4.getContainer();
        compositeTitle0.setTitleContainer(blockContainer6);
        org.jfree.chart.title.CompositeTitle compositeTitle8 = new org.jfree.chart.title.CompositeTitle(blockContainer6);
        org.jfree.chart.title.CompositeTitle compositeTitle9 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str10 = compositeTitle9.getID();
        org.jfree.chart.block.BlockContainer blockContainer11 = compositeTitle9.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment12 = compositeTitle9.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle13 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str14 = compositeTitle13.getID();
        org.jfree.chart.block.BlockContainer blockContainer15 = compositeTitle13.getContainer();
        compositeTitle9.setTitleContainer(blockContainer15);
        org.jfree.chart.title.CompositeTitle compositeTitle17 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str18 = compositeTitle17.getID();
        org.jfree.chart.block.BlockContainer blockContainer19 = compositeTitle17.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment20 = compositeTitle17.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle21 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str22 = compositeTitle21.getID();
        org.jfree.chart.block.BlockContainer blockContainer23 = compositeTitle21.getContainer();
        compositeTitle17.setTitleContainer(blockContainer23);
        compositeTitle9.setTitleContainer(blockContainer23);
        compositeTitle8.setTitleContainer(blockContainer23);
        compositeTitle8.setBorder(100.0d, (double) (short) 10, (double) (short) 10, (double) (short) 100);
        org.jfree.chart.api.RectangleInsets rectangleInsets32 = compositeTitle8.getMargin();
        double double33 = compositeTitle8.getHeight();
        double double34 = compositeTitle8.getContentXOffset();
        org.jfree.chart.title.CompositeTitle compositeTitle35 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str36 = compositeTitle35.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge37 = compositeTitle35.getPosition();
        boolean boolean38 = compositeTitle35.getNotify();
        double double39 = compositeTitle35.getWidth();
        compositeTitle35.setID("hi!");
        org.jfree.chart.title.CompositeTitle compositeTitle42 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str43 = compositeTitle42.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge44 = compositeTitle42.getPosition();
        boolean boolean45 = compositeTitle42.getNotify();
        java.lang.String str46 = compositeTitle42.getID();
        compositeTitle42.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        org.jfree.chart.title.CompositeTitle compositeTitle52 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str53 = compositeTitle52.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge54 = compositeTitle52.getPosition();
        boolean boolean55 = compositeTitle52.getNotify();
        java.awt.geom.Rectangle2D rectangle2D56 = compositeTitle52.getBounds();
        compositeTitle42.setBounds(rectangle2D56);
        compositeTitle35.setBounds(rectangle2D56);
        org.jfree.chart.title.CompositeTitle compositeTitle59 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str60 = compositeTitle59.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge61 = compositeTitle59.getPosition();
        boolean boolean62 = compositeTitle59.getNotify();
        java.lang.String str63 = compositeTitle59.getID();
        compositeTitle59.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        double double69 = compositeTitle59.getWidth();
        compositeTitle59.setVisible(true);
        org.jfree.chart.title.CompositeTitle compositeTitle72 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str73 = compositeTitle72.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge74 = compositeTitle72.getPosition();
        boolean boolean75 = compositeTitle72.getNotify();
        java.lang.String str76 = compositeTitle72.getID();
        org.jfree.chart.api.VerticalAlignment verticalAlignment77 = compositeTitle72.getVerticalAlignment();
        compositeTitle72.visible = true;
        org.jfree.chart.api.VerticalAlignment verticalAlignment80 = compositeTitle72.getVerticalAlignment();
        compositeTitle59.setVerticalAlignment(verticalAlignment80);
        compositeTitle35.setVerticalAlignment(verticalAlignment80);
        compositeTitle8.setVerticalAlignment(verticalAlignment80);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertTrue("'" + verticalAlignment3 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment3.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(blockContainer6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(blockContainer11);
        org.junit.Assert.assertTrue("'" + verticalAlignment12 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment12.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(blockContainer15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(blockContainer19);
        org.junit.Assert.assertTrue("'" + verticalAlignment20 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment20.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(blockContainer23);
        org.junit.Assert.assertNotNull(rectangleInsets32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 11.0d + "'", double34 == 11.0d);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + rectangleEdge37 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge37.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + rectangleEdge44 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge44.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + rectangleEdge54 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge54.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(rectangle2D56);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + rectangleEdge61 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge61.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertTrue("'" + rectangleEdge74 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge74.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertTrue("'" + verticalAlignment77 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment77.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + verticalAlignment80 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment80.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test514");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment3 = compositeTitle0.getVerticalAlignment();
        org.jfree.chart.api.VerticalAlignment verticalAlignment4 = compositeTitle0.getVerticalAlignment();
        boolean boolean5 = compositeTitle0.isVisible();
        org.jfree.chart.event.TitleChangeListener titleChangeListener6 = null;
        compositeTitle0.addChangeListener(titleChangeListener6);
        compositeTitle0.setBorder((double) 1, (double) 10.0f, (double) 10.0f, 0.0d);
        org.jfree.chart.title.CompositeTitle compositeTitle13 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str14 = compositeTitle13.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge15 = compositeTitle13.getPosition();
        boolean boolean16 = compositeTitle13.getNotify();
        java.lang.String str17 = compositeTitle13.getID();
        compositeTitle13.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        org.jfree.chart.title.CompositeTitle compositeTitle23 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str24 = compositeTitle23.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge25 = compositeTitle23.getPosition();
        boolean boolean26 = compositeTitle23.getNotify();
        java.awt.geom.Rectangle2D rectangle2D27 = compositeTitle23.getBounds();
        compositeTitle13.setBounds(rectangle2D27);
        org.jfree.chart.block.BlockContainer blockContainer29 = compositeTitle13.getContainer();
        org.jfree.chart.api.RectangleEdge rectangleEdge30 = compositeTitle13.getPosition();
        java.lang.Object obj31 = compositeTitle13.clone();
        org.jfree.chart.api.HorizontalAlignment horizontalAlignment32 = compositeTitle13.getHorizontalAlignment();
        compositeTitle0.setHorizontalAlignment(horizontalAlignment32);
        java.awt.geom.Rectangle2D rectangle2D34 = compositeTitle0.getBounds();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertTrue("'" + verticalAlignment3 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment3.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + verticalAlignment4 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment4.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + rectangleEdge15 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge15.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + rectangleEdge25 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge25.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(rectangle2D27);
        org.junit.Assert.assertNotNull(blockContainer29);
        org.junit.Assert.assertTrue("'" + rectangleEdge30 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge30.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + horizontalAlignment32 + "' != '" + org.jfree.chart.api.HorizontalAlignment.CENTER + "'", horizontalAlignment32.equals(org.jfree.chart.api.HorizontalAlignment.CENTER));
        org.junit.Assert.assertNotNull(rectangle2D34);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test515");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        boolean boolean1 = compositeTitle0.getNotify();
        java.awt.Paint paint2 = compositeTitle0.getBackgroundPaint();
        org.jfree.chart.title.CompositeTitle compositeTitle3 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str4 = compositeTitle3.getID();
        org.jfree.chart.block.BlockContainer blockContainer5 = compositeTitle3.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment6 = compositeTitle3.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle7 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str8 = compositeTitle7.getID();
        org.jfree.chart.block.BlockContainer blockContainer9 = compositeTitle7.getContainer();
        compositeTitle3.setTitleContainer(blockContainer9);
        org.jfree.chart.title.CompositeTitle compositeTitle11 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str12 = compositeTitle11.getID();
        org.jfree.chart.block.BlockContainer blockContainer13 = compositeTitle11.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment14 = compositeTitle11.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle15 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str16 = compositeTitle15.getID();
        org.jfree.chart.block.BlockContainer blockContainer17 = compositeTitle15.getContainer();
        compositeTitle11.setTitleContainer(blockContainer17);
        compositeTitle3.setTitleContainer(blockContainer17);
        double double20 = blockContainer17.getContentXOffset();
        org.jfree.chart.title.CompositeTitle compositeTitle21 = new org.jfree.chart.title.CompositeTitle();
        compositeTitle21.setMargin((double) 1.0f, 0.0d, (double) 10, (double) (byte) 1);
        org.jfree.chart.block.BlockFrame blockFrame27 = compositeTitle21.getFrame();
        blockContainer17.setFrame(blockFrame27);
        double double29 = blockContainer17.getHeight();
        compositeTitle0.setTitleContainer(blockContainer17);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(blockContainer5);
        org.junit.Assert.assertTrue("'" + verticalAlignment6 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment6.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(blockContainer9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(blockContainer13);
        org.junit.Assert.assertTrue("'" + verticalAlignment14 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment14.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(blockContainer17);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(blockFrame27);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test516");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        compositeTitle0.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        org.jfree.chart.title.CompositeTitle compositeTitle10 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str11 = compositeTitle10.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge12 = compositeTitle10.getPosition();
        boolean boolean13 = compositeTitle10.getNotify();
        java.awt.geom.Rectangle2D rectangle2D14 = compositeTitle10.getBounds();
        compositeTitle0.setBounds(rectangle2D14);
        org.jfree.chart.api.HorizontalAlignment horizontalAlignment16 = compositeTitle0.getHorizontalAlignment();
        compositeTitle0.setID("");
        compositeTitle0.setHeight((double) (byte) -1);
        compositeTitle0.setMargin((double) (byte) 1, (double) '#', (-1.0d), (double) (byte) 1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + rectangleEdge12 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge12.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(rectangle2D14);
        org.junit.Assert.assertTrue("'" + horizontalAlignment16 + "' != '" + org.jfree.chart.api.HorizontalAlignment.CENTER + "'", horizontalAlignment16.equals(org.jfree.chart.api.HorizontalAlignment.CENTER));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test517");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment3 = compositeTitle0.getVerticalAlignment();
        org.jfree.chart.api.VerticalAlignment verticalAlignment4 = compositeTitle0.getVerticalAlignment();
        java.awt.Paint paint5 = null;
        compositeTitle0.setBackgroundPaint(paint5);
        compositeTitle0.visible = false;
        compositeTitle0.setVisible(false);
        org.jfree.chart.event.TitleChangeListener titleChangeListener11 = null;
        compositeTitle0.removeChangeListener(titleChangeListener11);
        compositeTitle0.visible = false;
        double double15 = compositeTitle0.getWidth();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertTrue("'" + verticalAlignment3 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment3.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + verticalAlignment4 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment4.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test518");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        compositeTitle0.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        double double10 = compositeTitle0.getWidth();
        compositeTitle0.setVisible(true);
        boolean boolean13 = compositeTitle0.visible;
        compositeTitle0.setMargin((double) (byte) -1, (double) 100.0f, (double) 100.0f, (double) 1.0f);
        org.jfree.chart.api.RectangleInsets rectangleInsets19 = compositeTitle0.getMargin();
        org.jfree.chart.api.RectangleInsets rectangleInsets20 = compositeTitle0.getPadding();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(rectangleInsets20);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test519");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        org.jfree.chart.title.CompositeTitle compositeTitle4 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str5 = compositeTitle4.getID();
        org.jfree.chart.block.BlockContainer blockContainer6 = compositeTitle4.getContainer();
        compositeTitle0.setTitleContainer(blockContainer6);
        org.jfree.chart.block.BlockContainer blockContainer8 = compositeTitle0.getContainer();
        compositeTitle0.setPadding((double) (byte) 100, (double) (short) 0, (double) (short) 0, (double) (byte) 100);
        org.jfree.chart.block.BlockFrame blockFrame14 = compositeTitle0.getFrame();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(blockContainer6);
        org.junit.Assert.assertNotNull(blockContainer8);
        org.junit.Assert.assertNotNull(blockFrame14);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test520");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        compositeTitle0.setPadding((double) (byte) 100, (double) '#', (double) 0L, (double) 100);
        java.awt.Paint paint8 = null;
        compositeTitle0.setBackgroundPaint(paint8);
        compositeTitle0.setID("hi!");
        boolean boolean12 = compositeTitle0.visible;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test521");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        compositeTitle0.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        org.jfree.chart.title.CompositeTitle compositeTitle10 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str11 = compositeTitle10.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge12 = compositeTitle10.getPosition();
        boolean boolean13 = compositeTitle10.getNotify();
        java.awt.geom.Rectangle2D rectangle2D14 = compositeTitle10.getBounds();
        compositeTitle0.setBounds(rectangle2D14);
        org.jfree.chart.api.HorizontalAlignment horizontalAlignment16 = compositeTitle0.getHorizontalAlignment();
        compositeTitle0.setID("");
        double double19 = compositeTitle0.getContentYOffset();
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.title.CompositeTitle compositeTitle21 = new org.jfree.chart.title.CompositeTitle();
        org.jfree.chart.title.CompositeTitle compositeTitle22 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str23 = compositeTitle22.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge24 = compositeTitle22.getPosition();
        boolean boolean25 = compositeTitle22.getNotify();
        java.lang.String str26 = compositeTitle22.getID();
        compositeTitle22.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        double double32 = compositeTitle22.getWidth();
        compositeTitle22.setVisible(true);
        boolean boolean35 = compositeTitle22.visible;
        org.jfree.chart.api.VerticalAlignment verticalAlignment36 = compositeTitle22.getVerticalAlignment();
        compositeTitle21.setVerticalAlignment(verticalAlignment36);
        double double38 = compositeTitle21.getWidth();
        org.jfree.chart.event.TitleChangeListener titleChangeListener39 = null;
        compositeTitle21.removeChangeListener(titleChangeListener39);
        java.awt.Paint paint41 = compositeTitle21.getBackgroundPaint();
        org.jfree.chart.title.CompositeTitle compositeTitle42 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str43 = compositeTitle42.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge44 = compositeTitle42.getPosition();
        boolean boolean45 = compositeTitle42.getNotify();
        java.awt.geom.Rectangle2D rectangle2D46 = compositeTitle42.getBounds();
        compositeTitle21.setBounds(rectangle2D46);
        org.jfree.chart.title.CompositeTitle compositeTitle48 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str49 = compositeTitle48.getID();
        org.jfree.chart.block.BlockContainer blockContainer50 = compositeTitle48.getContainer();
        org.jfree.chart.event.TitleChangeListener titleChangeListener51 = null;
        compositeTitle48.addChangeListener(titleChangeListener51);
        org.jfree.chart.title.CompositeTitle compositeTitle53 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str54 = compositeTitle53.getID();
        org.jfree.chart.block.BlockContainer blockContainer55 = compositeTitle53.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment56 = compositeTitle53.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle57 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str58 = compositeTitle57.getID();
        org.jfree.chart.block.BlockContainer blockContainer59 = compositeTitle57.getContainer();
        compositeTitle53.setTitleContainer(blockContainer59);
        org.jfree.chart.title.CompositeTitle compositeTitle61 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str62 = compositeTitle61.getID();
        org.jfree.chart.block.BlockContainer blockContainer63 = compositeTitle61.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment64 = compositeTitle61.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle65 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str66 = compositeTitle65.getID();
        org.jfree.chart.block.BlockContainer blockContainer67 = compositeTitle65.getContainer();
        compositeTitle61.setTitleContainer(blockContainer67);
        compositeTitle53.setTitleContainer(blockContainer67);
        org.jfree.chart.title.CompositeTitle compositeTitle70 = new org.jfree.chart.title.CompositeTitle(blockContainer67);
        org.jfree.chart.title.CompositeTitle compositeTitle71 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str72 = compositeTitle71.getID();
        org.jfree.chart.block.BlockContainer blockContainer73 = compositeTitle71.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment74 = compositeTitle71.getVerticalAlignment();
        org.jfree.chart.api.RectangleEdge rectangleEdge75 = compositeTitle71.getPosition();
        boolean boolean76 = compositeTitle70.equals((java.lang.Object) rectangleEdge75);
        compositeTitle48.setPosition(rectangleEdge75);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj78 = compositeTitle0.draw(graphics2D20, rectangle2D46, (java.lang.Object) rectangleEdge75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics2D.setPaint(java.awt.Paint)\" because \"g2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + rectangleEdge12 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge12.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(rectangle2D14);
        org.junit.Assert.assertTrue("'" + horizontalAlignment16 + "' != '" + org.jfree.chart.api.HorizontalAlignment.CENTER + "'", horizontalAlignment16.equals(org.jfree.chart.api.HorizontalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + rectangleEdge24 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge24.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + verticalAlignment36 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment36.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNull(paint41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + rectangleEdge44 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge44.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(rectangle2D46);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(blockContainer50);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(blockContainer55);
        org.junit.Assert.assertTrue("'" + verticalAlignment56 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment56.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(blockContainer59);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(blockContainer63);
        org.junit.Assert.assertTrue("'" + verticalAlignment64 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment64.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(blockContainer67);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNotNull(blockContainer73);
        org.junit.Assert.assertTrue("'" + verticalAlignment74 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment74.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + rectangleEdge75 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge75.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test522");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        compositeTitle0.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        double double10 = compositeTitle0.getWidth();
        compositeTitle0.setVisible(true);
        boolean boolean13 = compositeTitle0.visible;
        boolean boolean14 = compositeTitle0.isVisible();
        boolean boolean15 = compositeTitle0.visible;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test523");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment3 = compositeTitle0.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle4 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str5 = compositeTitle4.getID();
        org.jfree.chart.block.BlockContainer blockContainer6 = compositeTitle4.getContainer();
        compositeTitle0.setTitleContainer(blockContainer6);
        org.jfree.chart.title.CompositeTitle compositeTitle8 = new org.jfree.chart.title.CompositeTitle(blockContainer6);
        compositeTitle8.visible = false;
        org.jfree.chart.title.CompositeTitle compositeTitle11 = new org.jfree.chart.title.CompositeTitle();
        boolean boolean12 = compositeTitle11.getNotify();
        java.awt.Paint paint13 = compositeTitle11.getBackgroundPaint();
        org.jfree.chart.event.TitleChangeListener titleChangeListener14 = null;
        compositeTitle11.addChangeListener(titleChangeListener14);
        double double16 = compositeTitle11.getHeight();
        double double17 = compositeTitle11.getWidth();
        org.jfree.chart.title.CompositeTitle compositeTitle18 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str19 = compositeTitle18.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge20 = compositeTitle18.getPosition();
        boolean boolean21 = compositeTitle18.getNotify();
        java.lang.String str22 = compositeTitle18.getID();
        compositeTitle18.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        double double28 = compositeTitle18.getWidth();
        compositeTitle18.setVisible(true);
        boolean boolean31 = compositeTitle18.visible;
        org.jfree.chart.title.CompositeTitle compositeTitle32 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str33 = compositeTitle32.getID();
        org.jfree.chart.block.BlockContainer blockContainer34 = compositeTitle32.getContainer();
        compositeTitle32.setPadding(0.0d, (double) 1L, (double) 10L, (double) (short) 0);
        compositeTitle32.setPadding((double) 10L, (double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        org.jfree.chart.block.BlockFrame blockFrame45 = compositeTitle32.getFrame();
        compositeTitle18.setFrame(blockFrame45);
        org.jfree.chart.block.BlockContainer blockContainer47 = compositeTitle18.getContainer();
        java.awt.geom.Rectangle2D rectangle2D48 = blockContainer47.getBounds();
        compositeTitle11.setTitleContainer(blockContainer47);
        double double50 = blockContainer47.getWidth();
        compositeTitle8.setTitleContainer(blockContainer47);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertTrue("'" + verticalAlignment3 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment3.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(blockContainer6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + rectangleEdge20 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge20.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(blockContainer34);
        org.junit.Assert.assertNotNull(blockFrame45);
        org.junit.Assert.assertNotNull(blockContainer47);
        org.junit.Assert.assertNotNull(rectangle2D48);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test524");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        compositeTitle0.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        double double10 = compositeTitle0.getWidth();
        compositeTitle0.setVisible(true);
        boolean boolean13 = compositeTitle0.visible;
        boolean boolean14 = compositeTitle0.isVisible();
        org.jfree.chart.block.BlockFrame blockFrame15 = compositeTitle0.getFrame();
        org.jfree.chart.block.BlockContainer blockContainer16 = compositeTitle0.getContainer();
        compositeTitle0.setVisible(false);
        org.jfree.chart.title.CompositeTitle compositeTitle19 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str20 = compositeTitle19.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge21 = compositeTitle19.getPosition();
        boolean boolean22 = compositeTitle19.getNotify();
        java.awt.geom.Rectangle2D rectangle2D23 = compositeTitle19.getBounds();
        compositeTitle19.setNotify(false);
        org.jfree.chart.block.BlockFrame blockFrame26 = compositeTitle19.getFrame();
        compositeTitle0.setFrame(blockFrame26);
        org.jfree.chart.api.RectangleInsets rectangleInsets28 = compositeTitle0.getPadding();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(blockFrame15);
        org.junit.Assert.assertNotNull(blockContainer16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + rectangleEdge21 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge21.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(rectangle2D23);
        org.junit.Assert.assertNotNull(blockFrame26);
        org.junit.Assert.assertNotNull(rectangleInsets28);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test525");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        compositeTitle0.setMargin((double) 0L, (double) 100L, (double) 10L, (double) (short) -1);
        org.jfree.chart.event.TitleChangeListener titleChangeListener10 = null;
        compositeTitle0.removeChangeListener(titleChangeListener10);
        compositeTitle0.setNotify(false);
        boolean boolean14 = compositeTitle0.visible;
        org.jfree.chart.api.RectangleInsets rectangleInsets15 = compositeTitle0.getPadding();
        boolean boolean16 = compositeTitle0.visible;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test526");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        org.jfree.chart.api.VerticalAlignment verticalAlignment5 = compositeTitle0.getVerticalAlignment();
        org.jfree.chart.block.BlockContainer blockContainer6 = compositeTitle0.getContainer();
        org.jfree.chart.event.TitleChangeListener titleChangeListener7 = null;
        compositeTitle0.addChangeListener(titleChangeListener7);
        compositeTitle0.setBorder((double) 10, 1.0d, 100.0d, (double) 10);
        compositeTitle0.setBorder((double) (short) 0, (double) (-1), (double) (byte) -1, (double) ' ');
        double double19 = compositeTitle0.getContentXOffset();
        boolean boolean20 = compositeTitle0.isVisible();
        compositeTitle0.visible = true;
        org.jfree.chart.title.CompositeTitle compositeTitle23 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str24 = compositeTitle23.getID();
        org.jfree.chart.block.BlockContainer blockContainer25 = compositeTitle23.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment26 = compositeTitle23.getVerticalAlignment();
        org.jfree.chart.api.RectangleEdge rectangleEdge27 = compositeTitle23.getPosition();
        org.jfree.chart.title.CompositeTitle compositeTitle28 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str29 = compositeTitle28.getID();
        org.jfree.chart.block.BlockContainer blockContainer30 = compositeTitle28.getContainer();
        compositeTitle28.setPadding(0.0d, (double) 1L, (double) 10L, (double) (short) 0);
        compositeTitle28.setPadding((double) 10L, (double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        org.jfree.chart.api.RectangleInsets rectangleInsets41 = compositeTitle28.getMargin();
        org.jfree.chart.event.TitleChangeListener titleChangeListener42 = null;
        compositeTitle28.removeChangeListener(titleChangeListener42);
        org.jfree.chart.api.HorizontalAlignment horizontalAlignment44 = compositeTitle28.getHorizontalAlignment();
        compositeTitle23.setHorizontalAlignment(horizontalAlignment44);
        compositeTitle0.setHorizontalAlignment(horizontalAlignment44);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + verticalAlignment5 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment5.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNotNull(blockContainer6);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(blockContainer25);
        org.junit.Assert.assertTrue("'" + verticalAlignment26 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment26.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + rectangleEdge27 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge27.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(blockContainer30);
        org.junit.Assert.assertNotNull(rectangleInsets41);
        org.junit.Assert.assertTrue("'" + horizontalAlignment44 + "' != '" + org.jfree.chart.api.HorizontalAlignment.CENTER + "'", horizontalAlignment44.equals(org.jfree.chart.api.HorizontalAlignment.CENTER));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test527");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        org.jfree.chart.api.RectangleEdge rectangleEdge1 = compositeTitle0.getPosition();
        org.jfree.chart.title.CompositeTitle compositeTitle2 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str3 = compositeTitle2.getID();
        org.jfree.chart.block.BlockContainer blockContainer4 = compositeTitle2.getContainer();
        compositeTitle2.setPadding(0.0d, (double) 1L, (double) 10L, (double) (short) 0);
        compositeTitle2.setPadding((double) 10L, (double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        org.jfree.chart.api.RectangleInsets rectangleInsets15 = compositeTitle2.getMargin();
        org.jfree.chart.event.TitleChangeListener titleChangeListener16 = null;
        compositeTitle2.removeChangeListener(titleChangeListener16);
        org.jfree.chart.api.HorizontalAlignment horizontalAlignment18 = compositeTitle2.getHorizontalAlignment();
        boolean boolean19 = compositeTitle0.equals((java.lang.Object) horizontalAlignment18);
        org.jfree.chart.api.RectangleInsets rectangleInsets20 = org.jfree.chart.title.Title.DEFAULT_PADDING;
        compositeTitle0.setMargin(rectangleInsets20);
        compositeTitle0.setNotify(true);
        boolean boolean24 = compositeTitle0.isVisible();
        compositeTitle0.setVisible(true);
        org.jfree.chart.event.TitleChangeListener titleChangeListener27 = null;
        compositeTitle0.removeChangeListener(titleChangeListener27);
        org.junit.Assert.assertTrue("'" + rectangleEdge1 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge1.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(blockContainer4);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + horizontalAlignment18 + "' != '" + org.jfree.chart.api.HorizontalAlignment.CENTER + "'", horizontalAlignment18.equals(org.jfree.chart.api.HorizontalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test528");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        compositeTitle0.setMargin((double) 0L, (double) 100L, (double) 10L, (double) (short) -1);
        org.jfree.chart.event.TitleChangeListener titleChangeListener10 = null;
        compositeTitle0.removeChangeListener(titleChangeListener10);
        org.jfree.chart.title.CompositeTitle compositeTitle12 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str13 = compositeTitle12.getID();
        org.jfree.chart.block.BlockContainer blockContainer14 = compositeTitle12.getContainer();
        compositeTitle12.setPadding(0.0d, (double) 1L, (double) 10L, (double) (short) 0);
        compositeTitle12.setPadding((double) 10L, (double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        compositeTitle12.setHeight((double) 10.0f);
        org.jfree.chart.title.CompositeTitle compositeTitle27 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str28 = compositeTitle27.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge29 = compositeTitle27.getPosition();
        boolean boolean30 = compositeTitle27.getNotify();
        java.lang.String str31 = compositeTitle27.getID();
        compositeTitle27.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        org.jfree.chart.title.CompositeTitle compositeTitle37 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str38 = compositeTitle37.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge39 = compositeTitle37.getPosition();
        boolean boolean40 = compositeTitle37.getNotify();
        java.awt.geom.Rectangle2D rectangle2D41 = compositeTitle37.getBounds();
        compositeTitle27.setBounds(rectangle2D41);
        org.jfree.chart.api.RectangleInsets rectangleInsets43 = compositeTitle27.getPadding();
        compositeTitle12.setPadding(rectangleInsets43);
        compositeTitle0.setPadding(rectangleInsets43);
        compositeTitle0.setBorder((double) 0, (double) (short) 10, 32.0d, (double) 10.0f);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(blockContainer14);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + rectangleEdge29 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge29.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + rectangleEdge39 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge39.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(rectangle2D41);
        org.junit.Assert.assertNotNull(rectangleInsets43);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test529");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        compositeTitle0.setPadding(0.0d, (double) 1L, (double) 10L, (double) (short) 0);
        compositeTitle0.setPadding((double) 10L, (double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        org.jfree.chart.api.RectangleInsets rectangleInsets13 = compositeTitle0.getMargin();
        org.jfree.chart.event.TitleChangeListener titleChangeListener14 = null;
        compositeTitle0.removeChangeListener(titleChangeListener14);
        org.jfree.chart.api.HorizontalAlignment horizontalAlignment16 = compositeTitle0.getHorizontalAlignment();
        compositeTitle0.visible = true;
        org.jfree.chart.event.TitleChangeListener titleChangeListener19 = null;
        compositeTitle0.addChangeListener(titleChangeListener19);
        java.awt.geom.Rectangle2D rectangle2D21 = compositeTitle0.getBounds();
        compositeTitle0.setHeight((double) (short) 10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertTrue("'" + horizontalAlignment16 + "' != '" + org.jfree.chart.api.HorizontalAlignment.CENTER + "'", horizontalAlignment16.equals(org.jfree.chart.api.HorizontalAlignment.CENTER));
        org.junit.Assert.assertNotNull(rectangle2D21);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test530");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment3 = compositeTitle0.getVerticalAlignment();
        org.jfree.chart.api.VerticalAlignment verticalAlignment4 = compositeTitle0.getVerticalAlignment();
        java.awt.Paint paint5 = null;
        compositeTitle0.setBackgroundPaint(paint5);
        org.jfree.chart.api.RectangleInsets rectangleInsets7 = compositeTitle0.getMargin();
        org.jfree.chart.event.TitleChangeListener titleChangeListener8 = null;
        compositeTitle0.addChangeListener(titleChangeListener8);
        org.jfree.chart.title.CompositeTitle compositeTitle10 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str11 = compositeTitle10.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge12 = compositeTitle10.getPosition();
        boolean boolean13 = compositeTitle10.getNotify();
        java.lang.String str14 = compositeTitle10.getID();
        compositeTitle10.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        org.jfree.chart.api.HorizontalAlignment horizontalAlignment20 = org.jfree.chart.title.Title.DEFAULT_HORIZONTAL_ALIGNMENT;
        compositeTitle10.setHorizontalAlignment(horizontalAlignment20);
        compositeTitle10.setBorder((double) 10.0f, (double) 0, (double) 10L, (double) 1.0f);
        org.jfree.chart.api.RectangleInsets rectangleInsets27 = compositeTitle10.getMargin();
        compositeTitle0.setMargin(rectangleInsets27);
        org.jfree.chart.api.RectangleInsets rectangleInsets29 = compositeTitle0.getPadding();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertTrue("'" + verticalAlignment3 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment3.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + verticalAlignment4 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment4.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + rectangleEdge12 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge12.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + horizontalAlignment20 + "' != '" + org.jfree.chart.api.HorizontalAlignment.CENTER + "'", horizontalAlignment20.equals(org.jfree.chart.api.HorizontalAlignment.CENTER));
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertNotNull(rectangleInsets29);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test531");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment3 = compositeTitle0.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle4 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str5 = compositeTitle4.getID();
        org.jfree.chart.block.BlockContainer blockContainer6 = compositeTitle4.getContainer();
        compositeTitle0.setTitleContainer(blockContainer6);
        org.jfree.chart.title.CompositeTitle compositeTitle8 = new org.jfree.chart.title.CompositeTitle(blockContainer6);
        org.jfree.chart.title.CompositeTitle compositeTitle9 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str10 = compositeTitle9.getID();
        org.jfree.chart.block.BlockContainer blockContainer11 = compositeTitle9.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment12 = compositeTitle9.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle13 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str14 = compositeTitle13.getID();
        org.jfree.chart.block.BlockContainer blockContainer15 = compositeTitle13.getContainer();
        compositeTitle9.setTitleContainer(blockContainer15);
        org.jfree.chart.title.CompositeTitle compositeTitle17 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str18 = compositeTitle17.getID();
        org.jfree.chart.block.BlockContainer blockContainer19 = compositeTitle17.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment20 = compositeTitle17.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle21 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str22 = compositeTitle21.getID();
        org.jfree.chart.block.BlockContainer blockContainer23 = compositeTitle21.getContainer();
        compositeTitle17.setTitleContainer(blockContainer23);
        compositeTitle9.setTitleContainer(blockContainer23);
        compositeTitle8.setTitleContainer(blockContainer23);
        blockContainer23.setID("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertTrue("'" + verticalAlignment3 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment3.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(blockContainer6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(blockContainer11);
        org.junit.Assert.assertTrue("'" + verticalAlignment12 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment12.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(blockContainer15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(blockContainer19);
        org.junit.Assert.assertTrue("'" + verticalAlignment20 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment20.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(blockContainer23);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test532");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        org.jfree.chart.api.HorizontalAlignment horizontalAlignment5 = compositeTitle0.getHorizontalAlignment();
        boolean boolean6 = compositeTitle0.isVisible();
        java.lang.Object obj7 = compositeTitle0.clone();
        org.jfree.chart.api.RectangleInsets rectangleInsets8 = compositeTitle0.getPadding();
        org.jfree.chart.api.RectangleEdge rectangleEdge9 = compositeTitle0.getPosition();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + horizontalAlignment5 + "' != '" + org.jfree.chart.api.HorizontalAlignment.CENTER + "'", horizontalAlignment5.equals(org.jfree.chart.api.HorizontalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + rectangleEdge9 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge9.equals(org.jfree.chart.api.RectangleEdge.TOP));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test533");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        compositeTitle0.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        double double10 = compositeTitle0.getWidth();
        compositeTitle0.setVisible(true);
        boolean boolean13 = compositeTitle0.visible;
        boolean boolean14 = compositeTitle0.isVisible();
        compositeTitle0.visible = false;
        org.jfree.chart.title.CompositeTitle compositeTitle17 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str18 = compositeTitle17.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge19 = compositeTitle17.getPosition();
        boolean boolean20 = compositeTitle17.getNotify();
        java.lang.String str21 = compositeTitle17.getID();
        compositeTitle17.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        org.jfree.chart.title.CompositeTitle compositeTitle27 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str28 = compositeTitle27.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge29 = compositeTitle27.getPosition();
        boolean boolean30 = compositeTitle27.getNotify();
        java.awt.geom.Rectangle2D rectangle2D31 = compositeTitle27.getBounds();
        compositeTitle17.setBounds(rectangle2D31);
        java.awt.geom.Rectangle2D rectangle2D33 = compositeTitle17.getBounds();
        compositeTitle17.setVisible(true);
        org.jfree.chart.title.CompositeTitle compositeTitle36 = new org.jfree.chart.title.CompositeTitle();
        boolean boolean37 = compositeTitle36.getNotify();
        org.jfree.chart.title.CompositeTitle compositeTitle38 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str39 = compositeTitle38.getID();
        org.jfree.chart.block.BlockContainer blockContainer40 = compositeTitle38.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment41 = compositeTitle38.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle42 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str43 = compositeTitle42.getID();
        org.jfree.chart.block.BlockContainer blockContainer44 = compositeTitle42.getContainer();
        compositeTitle38.setTitleContainer(blockContainer44);
        org.jfree.chart.title.CompositeTitle compositeTitle46 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str47 = compositeTitle46.getID();
        org.jfree.chart.block.BlockContainer blockContainer48 = compositeTitle46.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment49 = compositeTitle46.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle50 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str51 = compositeTitle50.getID();
        org.jfree.chart.block.BlockContainer blockContainer52 = compositeTitle50.getContainer();
        compositeTitle46.setTitleContainer(blockContainer52);
        compositeTitle38.setTitleContainer(blockContainer52);
        double double55 = blockContainer52.getContentXOffset();
        compositeTitle36.setTitleContainer(blockContainer52);
        boolean boolean57 = compositeTitle17.equals((java.lang.Object) compositeTitle36);
        boolean boolean58 = compositeTitle0.equals((java.lang.Object) compositeTitle36);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + rectangleEdge19 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge19.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + rectangleEdge29 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge29.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(rectangle2D31);
        org.junit.Assert.assertNotNull(rectangle2D33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(blockContainer40);
        org.junit.Assert.assertTrue("'" + verticalAlignment41 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment41.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(blockContainer44);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(blockContainer48);
        org.junit.Assert.assertTrue("'" + verticalAlignment49 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment49.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(blockContainer52);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test534");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment3 = compositeTitle0.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle4 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str5 = compositeTitle4.getID();
        org.jfree.chart.block.BlockContainer blockContainer6 = compositeTitle4.getContainer();
        compositeTitle0.setTitleContainer(blockContainer6);
        org.jfree.chart.api.VerticalAlignment verticalAlignment8 = compositeTitle0.getVerticalAlignment();
        org.jfree.chart.api.VerticalAlignment verticalAlignment9 = compositeTitle0.getVerticalAlignment();
        boolean boolean10 = compositeTitle0.getNotify();
        compositeTitle0.setMargin((double) (byte) 1, 0.0d, (double) 10.0f, (double) 10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertTrue("'" + verticalAlignment3 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment3.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(blockContainer6);
        org.junit.Assert.assertTrue("'" + verticalAlignment8 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment8.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + verticalAlignment9 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment9.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test535");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        boolean boolean1 = compositeTitle0.getNotify();
        org.jfree.chart.event.TitleChangeListener titleChangeListener2 = null;
        compositeTitle0.removeChangeListener(titleChangeListener2);
        double double4 = compositeTitle0.getHeight();
        org.jfree.chart.api.RectangleInsets rectangleInsets5 = compositeTitle0.getMargin();
        java.awt.Paint paint6 = null;
        compositeTitle0.setBackgroundPaint(paint6);
        org.jfree.chart.api.RectangleEdge rectangleEdge8 = compositeTitle0.getPosition();
        compositeTitle0.setBorder(1.0d, (double) (byte) 1, 0.0d, (double) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + rectangleEdge8 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge8.equals(org.jfree.chart.api.RectangleEdge.TOP));
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test536");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        compositeTitle0.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        double double10 = compositeTitle0.getWidth();
        compositeTitle0.setVisible(true);
        boolean boolean13 = compositeTitle0.visible;
        org.jfree.chart.title.CompositeTitle compositeTitle14 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str15 = compositeTitle14.getID();
        org.jfree.chart.block.BlockContainer blockContainer16 = compositeTitle14.getContainer();
        compositeTitle14.setPadding(0.0d, (double) 1L, (double) 10L, (double) (short) 0);
        compositeTitle14.setPadding((double) 10L, (double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        org.jfree.chart.block.BlockFrame blockFrame27 = compositeTitle14.getFrame();
        compositeTitle0.setFrame(blockFrame27);
        org.jfree.chart.block.BlockContainer blockContainer29 = compositeTitle0.getContainer();
        org.jfree.chart.block.BlockFrame blockFrame30 = blockContainer29.getFrame();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(blockContainer16);
        org.junit.Assert.assertNotNull(blockFrame27);
        org.junit.Assert.assertNotNull(blockContainer29);
        org.junit.Assert.assertNotNull(blockFrame30);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test537");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        org.jfree.chart.title.CompositeTitle compositeTitle1 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str2 = compositeTitle1.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge3 = compositeTitle1.getPosition();
        boolean boolean4 = compositeTitle1.getNotify();
        java.lang.String str5 = compositeTitle1.getID();
        compositeTitle1.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        double double11 = compositeTitle1.getWidth();
        compositeTitle1.setVisible(true);
        boolean boolean14 = compositeTitle1.visible;
        org.jfree.chart.api.VerticalAlignment verticalAlignment15 = compositeTitle1.getVerticalAlignment();
        compositeTitle0.setVerticalAlignment(verticalAlignment15);
        boolean boolean17 = compositeTitle0.getNotify();
        org.jfree.chart.title.CompositeTitle compositeTitle18 = new org.jfree.chart.title.CompositeTitle();
        org.jfree.chart.api.RectangleEdge rectangleEdge19 = compositeTitle18.getPosition();
        org.jfree.chart.title.CompositeTitle compositeTitle20 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str21 = compositeTitle20.getID();
        org.jfree.chart.block.BlockContainer blockContainer22 = compositeTitle20.getContainer();
        compositeTitle20.setPadding(0.0d, (double) 1L, (double) 10L, (double) (short) 0);
        compositeTitle20.setPadding((double) 10L, (double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        org.jfree.chart.api.RectangleInsets rectangleInsets33 = compositeTitle20.getMargin();
        org.jfree.chart.event.TitleChangeListener titleChangeListener34 = null;
        compositeTitle20.removeChangeListener(titleChangeListener34);
        org.jfree.chart.api.HorizontalAlignment horizontalAlignment36 = compositeTitle20.getHorizontalAlignment();
        boolean boolean37 = compositeTitle18.equals((java.lang.Object) horizontalAlignment36);
        compositeTitle0.setHorizontalAlignment(horizontalAlignment36);
        org.jfree.chart.event.TitleChangeListener titleChangeListener39 = null;
        compositeTitle0.removeChangeListener(titleChangeListener39);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + rectangleEdge3 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge3.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + verticalAlignment15 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment15.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + rectangleEdge19 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge19.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(blockContainer22);
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertTrue("'" + horizontalAlignment36 + "' != '" + org.jfree.chart.api.HorizontalAlignment.CENTER + "'", horizontalAlignment36.equals(org.jfree.chart.api.HorizontalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test538");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        compositeTitle0.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        double double10 = compositeTitle0.getWidth();
        compositeTitle0.setVisible(true);
        boolean boolean13 = compositeTitle0.visible;
        compositeTitle0.setMargin((double) (byte) -1, (double) 100.0f, (double) 100.0f, (double) 1.0f);
        org.jfree.chart.api.HorizontalAlignment horizontalAlignment19 = compositeTitle0.getHorizontalAlignment();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + horizontalAlignment19 + "' != '" + org.jfree.chart.api.HorizontalAlignment.CENTER + "'", horizontalAlignment19.equals(org.jfree.chart.api.HorizontalAlignment.CENTER));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test539");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        boolean boolean1 = compositeTitle0.getNotify();
        org.jfree.chart.event.TitleChangeListener titleChangeListener2 = null;
        compositeTitle0.removeChangeListener(titleChangeListener2);
        double double4 = compositeTitle0.getHeight();
        java.awt.Paint paint5 = null;
        compositeTitle0.setBackgroundPaint(paint5);
        org.jfree.chart.block.BlockFrame blockFrame7 = compositeTitle0.getFrame();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(blockFrame7);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test540");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        org.jfree.chart.title.CompositeTitle compositeTitle3 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str4 = compositeTitle3.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge5 = compositeTitle3.getPosition();
        compositeTitle0.setPosition(rectangleEdge5);
        java.lang.Object obj7 = compositeTitle0.clone();
        boolean boolean8 = compositeTitle0.visible;
        org.jfree.chart.title.CompositeTitle compositeTitle9 = new org.jfree.chart.title.CompositeTitle();
        org.jfree.chart.api.RectangleEdge rectangleEdge10 = compositeTitle9.getPosition();
        org.jfree.chart.title.CompositeTitle compositeTitle11 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str12 = compositeTitle11.getID();
        org.jfree.chart.block.BlockContainer blockContainer13 = compositeTitle11.getContainer();
        compositeTitle11.setPadding(0.0d, (double) 1L, (double) 10L, (double) (short) 0);
        compositeTitle11.setPadding((double) 10L, (double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        org.jfree.chart.api.RectangleInsets rectangleInsets24 = compositeTitle11.getMargin();
        org.jfree.chart.event.TitleChangeListener titleChangeListener25 = null;
        compositeTitle11.removeChangeListener(titleChangeListener25);
        org.jfree.chart.api.HorizontalAlignment horizontalAlignment27 = compositeTitle11.getHorizontalAlignment();
        boolean boolean28 = compositeTitle9.equals((java.lang.Object) horizontalAlignment27);
        compositeTitle9.setVisible(true);
        org.jfree.chart.title.CompositeTitle compositeTitle31 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str32 = compositeTitle31.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge33 = compositeTitle31.getPosition();
        boolean boolean34 = compositeTitle31.getNotify();
        java.lang.String str35 = compositeTitle31.getID();
        compositeTitle31.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        org.jfree.chart.title.CompositeTitle compositeTitle41 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str42 = compositeTitle41.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge43 = compositeTitle41.getPosition();
        boolean boolean44 = compositeTitle41.getNotify();
        java.awt.geom.Rectangle2D rectangle2D45 = compositeTitle41.getBounds();
        compositeTitle31.setBounds(rectangle2D45);
        java.awt.Paint paint47 = compositeTitle31.getBackgroundPaint();
        double double48 = compositeTitle31.getWidth();
        org.jfree.chart.api.VerticalAlignment verticalAlignment49 = compositeTitle31.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle50 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str51 = compositeTitle50.getID();
        org.jfree.chart.block.BlockContainer blockContainer52 = compositeTitle50.getContainer();
        compositeTitle50.setPadding(0.0d, (double) 1L, (double) 10L, (double) (short) 0);
        compositeTitle50.setPadding((double) 10L, (double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        org.jfree.chart.block.BlockFrame blockFrame63 = compositeTitle50.getFrame();
        boolean boolean64 = compositeTitle31.equals((java.lang.Object) compositeTitle50);
        org.jfree.chart.api.RectangleInsets rectangleInsets65 = compositeTitle50.getPadding();
        compositeTitle9.setMargin(rectangleInsets65);
        compositeTitle0.setPadding(rectangleInsets65);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + rectangleEdge5 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge5.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + rectangleEdge10 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge10.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(blockContainer13);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertTrue("'" + horizontalAlignment27 + "' != '" + org.jfree.chart.api.HorizontalAlignment.CENTER + "'", horizontalAlignment27.equals(org.jfree.chart.api.HorizontalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + rectangleEdge33 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge33.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + rectangleEdge43 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge43.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(rectangle2D45);
        org.junit.Assert.assertNull(paint47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + verticalAlignment49 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment49.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(blockContainer52);
        org.junit.Assert.assertNotNull(blockFrame63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(rectangleInsets65);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test541");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment3 = compositeTitle0.getVerticalAlignment();
        org.jfree.chart.api.VerticalAlignment verticalAlignment4 = compositeTitle0.getVerticalAlignment();
        java.awt.Paint paint5 = null;
        compositeTitle0.setBackgroundPaint(paint5);
        org.jfree.chart.api.RectangleInsets rectangleInsets7 = compositeTitle0.getPadding();
        double double8 = compositeTitle0.getHeight();
        java.lang.Object obj9 = compositeTitle0.clone();
        java.lang.String str10 = compositeTitle0.getID();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertTrue("'" + verticalAlignment3 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment3.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + verticalAlignment4 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment4.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test542");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        compositeTitle0.setMargin((double) 1.0f, 0.0d, (double) 10, (double) (byte) 1);
        org.jfree.chart.title.CompositeTitle compositeTitle6 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str7 = compositeTitle6.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge8 = compositeTitle6.getPosition();
        boolean boolean9 = compositeTitle6.getNotify();
        java.lang.String str10 = compositeTitle6.getID();
        compositeTitle6.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        double double16 = compositeTitle6.getWidth();
        compositeTitle6.setVisible(true);
        org.jfree.chart.title.CompositeTitle compositeTitle19 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str20 = compositeTitle19.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge21 = compositeTitle19.getPosition();
        boolean boolean22 = compositeTitle19.getNotify();
        java.lang.String str23 = compositeTitle19.getID();
        org.jfree.chart.api.VerticalAlignment verticalAlignment24 = compositeTitle19.getVerticalAlignment();
        compositeTitle19.visible = true;
        org.jfree.chart.api.VerticalAlignment verticalAlignment27 = compositeTitle19.getVerticalAlignment();
        compositeTitle6.setVerticalAlignment(verticalAlignment27);
        compositeTitle0.setVerticalAlignment(verticalAlignment27);
        boolean boolean30 = compositeTitle0.getNotify();
        boolean boolean31 = compositeTitle0.getNotify();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + rectangleEdge8 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge8.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + rectangleEdge21 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge21.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + verticalAlignment24 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment24.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + verticalAlignment27 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment27.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test543");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        compositeTitle0.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        org.jfree.chart.title.CompositeTitle compositeTitle10 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str11 = compositeTitle10.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge12 = compositeTitle10.getPosition();
        boolean boolean13 = compositeTitle10.getNotify();
        java.awt.geom.Rectangle2D rectangle2D14 = compositeTitle10.getBounds();
        compositeTitle0.setBounds(rectangle2D14);
        org.jfree.chart.block.BlockContainer blockContainer16 = compositeTitle0.getContainer();
        org.jfree.chart.api.RectangleEdge rectangleEdge17 = compositeTitle0.getPosition();
        java.lang.Object obj18 = compositeTitle0.clone();
        compositeTitle0.setVisible(true);
        java.lang.Object obj21 = compositeTitle0.clone();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + rectangleEdge12 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge12.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(rectangle2D14);
        org.junit.Assert.assertNotNull(blockContainer16);
        org.junit.Assert.assertTrue("'" + rectangleEdge17 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge17.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test544");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        double double5 = compositeTitle0.getContentXOffset();
        org.jfree.chart.block.BlockFrame blockFrame6 = compositeTitle0.getFrame();
        org.jfree.chart.title.CompositeTitle compositeTitle7 = new org.jfree.chart.title.CompositeTitle();
        boolean boolean8 = compositeTitle7.getNotify();
        org.jfree.chart.event.TitleChangeListener titleChangeListener9 = null;
        compositeTitle7.removeChangeListener(titleChangeListener9);
        double double11 = compositeTitle7.getHeight();
        org.jfree.chart.api.RectangleInsets rectangleInsets12 = compositeTitle7.getMargin();
        java.awt.Paint paint13 = null;
        compositeTitle7.setBackgroundPaint(paint13);
        compositeTitle7.setHeight((double) 100.0f);
        org.jfree.chart.api.VerticalAlignment verticalAlignment17 = compositeTitle7.getVerticalAlignment();
        compositeTitle0.setVerticalAlignment(verticalAlignment17);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(blockFrame6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertTrue("'" + verticalAlignment17 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment17.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test545");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        double double4 = compositeTitle0.getWidth();
        compositeTitle0.setID("hi!");
        org.jfree.chart.title.CompositeTitle compositeTitle7 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str8 = compositeTitle7.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge9 = compositeTitle7.getPosition();
        boolean boolean10 = compositeTitle7.getNotify();
        java.lang.String str11 = compositeTitle7.getID();
        compositeTitle7.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        org.jfree.chart.title.CompositeTitle compositeTitle17 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str18 = compositeTitle17.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge19 = compositeTitle17.getPosition();
        boolean boolean20 = compositeTitle17.getNotify();
        java.awt.geom.Rectangle2D rectangle2D21 = compositeTitle17.getBounds();
        compositeTitle7.setBounds(rectangle2D21);
        compositeTitle0.setBounds(rectangle2D21);
        org.jfree.chart.event.TitleChangeListener titleChangeListener24 = null;
        compositeTitle0.addChangeListener(titleChangeListener24);
        java.awt.Graphics2D graphics2D26 = null;
        org.jfree.chart.title.CompositeTitle compositeTitle27 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str28 = compositeTitle27.getID();
        org.jfree.chart.block.BlockContainer blockContainer29 = compositeTitle27.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment30 = compositeTitle27.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle31 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str32 = compositeTitle31.getID();
        org.jfree.chart.block.BlockContainer blockContainer33 = compositeTitle31.getContainer();
        compositeTitle27.setTitleContainer(blockContainer33);
        compositeTitle27.setMargin((double) (byte) 10, (double) 10, (double) (short) -1, (double) '#');
        java.awt.geom.Rectangle2D rectangle2D40 = compositeTitle27.getBounds();
        org.jfree.chart.title.CompositeTitle compositeTitle41 = new org.jfree.chart.title.CompositeTitle();
        boolean boolean42 = compositeTitle41.getNotify();
        java.awt.Paint paint43 = compositeTitle41.getBackgroundPaint();
        org.jfree.chart.event.TitleChangeListener titleChangeListener44 = null;
        compositeTitle41.addChangeListener(titleChangeListener44);
        org.jfree.chart.title.CompositeTitle compositeTitle46 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str47 = compositeTitle46.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge48 = compositeTitle46.getPosition();
        boolean boolean49 = compositeTitle46.getNotify();
        java.lang.String str50 = compositeTitle46.getID();
        double double51 = compositeTitle46.getContentXOffset();
        org.jfree.chart.block.BlockContainer blockContainer52 = compositeTitle46.getContainer();
        compositeTitle41.setTitleContainer(blockContainer52);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj54 = compositeTitle0.draw(graphics2D26, rectangle2D40, (java.lang.Object) blockContainer52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics2D.setPaint(java.awt.Paint)\" because \"g2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + rectangleEdge9 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge9.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + rectangleEdge19 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge19.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(rectangle2D21);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(blockContainer29);
        org.junit.Assert.assertTrue("'" + verticalAlignment30 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment30.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(blockContainer33);
        org.junit.Assert.assertNotNull(rectangle2D40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(paint43);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + rectangleEdge48 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge48.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 1.0d + "'", double51 == 1.0d);
        org.junit.Assert.assertNotNull(blockContainer52);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test546");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment3 = compositeTitle0.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle4 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str5 = compositeTitle4.getID();
        org.jfree.chart.block.BlockContainer blockContainer6 = compositeTitle4.getContainer();
        compositeTitle0.setTitleContainer(blockContainer6);
        org.jfree.chart.title.CompositeTitle compositeTitle8 = new org.jfree.chart.title.CompositeTitle(blockContainer6);
        org.jfree.chart.title.CompositeTitle compositeTitle9 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str10 = compositeTitle9.getID();
        org.jfree.chart.block.BlockContainer blockContainer11 = compositeTitle9.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment12 = compositeTitle9.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle13 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str14 = compositeTitle13.getID();
        org.jfree.chart.block.BlockContainer blockContainer15 = compositeTitle13.getContainer();
        compositeTitle9.setTitleContainer(blockContainer15);
        org.jfree.chart.title.CompositeTitle compositeTitle17 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str18 = compositeTitle17.getID();
        org.jfree.chart.block.BlockContainer blockContainer19 = compositeTitle17.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment20 = compositeTitle17.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle21 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str22 = compositeTitle21.getID();
        org.jfree.chart.block.BlockContainer blockContainer23 = compositeTitle21.getContainer();
        compositeTitle17.setTitleContainer(blockContainer23);
        compositeTitle9.setTitleContainer(blockContainer23);
        compositeTitle8.setTitleContainer(blockContainer23);
        compositeTitle8.setBorder(100.0d, (double) (short) 10, (double) (short) 10, (double) (short) 100);
        org.jfree.chart.event.TitleChangeListener titleChangeListener32 = null;
        compositeTitle8.removeChangeListener(titleChangeListener32);
        org.jfree.chart.block.BlockContainer blockContainer34 = compositeTitle8.getContainer();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertTrue("'" + verticalAlignment3 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment3.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(blockContainer6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(blockContainer11);
        org.junit.Assert.assertTrue("'" + verticalAlignment12 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment12.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(blockContainer15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(blockContainer19);
        org.junit.Assert.assertTrue("'" + verticalAlignment20 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment20.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(blockContainer23);
        org.junit.Assert.assertNotNull(blockContainer34);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test547");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment3 = compositeTitle0.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle4 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str5 = compositeTitle4.getID();
        org.jfree.chart.block.BlockContainer blockContainer6 = compositeTitle4.getContainer();
        compositeTitle0.setTitleContainer(blockContainer6);
        org.jfree.chart.title.CompositeTitle compositeTitle8 = new org.jfree.chart.title.CompositeTitle(blockContainer6);
        org.jfree.chart.title.CompositeTitle compositeTitle9 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str10 = compositeTitle9.getID();
        org.jfree.chart.block.BlockContainer blockContainer11 = compositeTitle9.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment12 = compositeTitle9.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle13 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str14 = compositeTitle13.getID();
        org.jfree.chart.block.BlockContainer blockContainer15 = compositeTitle13.getContainer();
        compositeTitle9.setTitleContainer(blockContainer15);
        org.jfree.chart.title.CompositeTitle compositeTitle17 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str18 = compositeTitle17.getID();
        org.jfree.chart.block.BlockContainer blockContainer19 = compositeTitle17.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment20 = compositeTitle17.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle21 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str22 = compositeTitle21.getID();
        org.jfree.chart.block.BlockContainer blockContainer23 = compositeTitle21.getContainer();
        compositeTitle17.setTitleContainer(blockContainer23);
        compositeTitle9.setTitleContainer(blockContainer23);
        compositeTitle8.setTitleContainer(blockContainer23);
        compositeTitle8.setBorder(100.0d, (double) (short) 10, (double) (short) 10, (double) (short) 100);
        org.jfree.chart.api.RectangleInsets rectangleInsets32 = compositeTitle8.getMargin();
        java.awt.Paint paint33 = null;
        compositeTitle8.setBackgroundPaint(paint33);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertTrue("'" + verticalAlignment3 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment3.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(blockContainer6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(blockContainer11);
        org.junit.Assert.assertTrue("'" + verticalAlignment12 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment12.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(blockContainer15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(blockContainer19);
        org.junit.Assert.assertTrue("'" + verticalAlignment20 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment20.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(blockContainer23);
        org.junit.Assert.assertNotNull(rectangleInsets32);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test548");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment3 = compositeTitle0.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle4 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str5 = compositeTitle4.getID();
        org.jfree.chart.block.BlockContainer blockContainer6 = compositeTitle4.getContainer();
        compositeTitle0.setTitleContainer(blockContainer6);
        org.jfree.chart.title.CompositeTitle compositeTitle8 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str9 = compositeTitle8.getID();
        org.jfree.chart.block.BlockContainer blockContainer10 = compositeTitle8.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment11 = compositeTitle8.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle12 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str13 = compositeTitle12.getID();
        org.jfree.chart.block.BlockContainer blockContainer14 = compositeTitle12.getContainer();
        compositeTitle8.setTitleContainer(blockContainer14);
        compositeTitle0.setTitleContainer(blockContainer14);
        compositeTitle0.visible = false;
        org.jfree.chart.event.TitleChangeListener titleChangeListener19 = null;
        compositeTitle0.addChangeListener(titleChangeListener19);
        boolean boolean21 = compositeTitle0.isVisible();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertTrue("'" + verticalAlignment3 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment3.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(blockContainer6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(blockContainer10);
        org.junit.Assert.assertTrue("'" + verticalAlignment11 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment11.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(blockContainer14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test549");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        boolean boolean1 = compositeTitle0.getNotify();
        org.jfree.chart.title.CompositeTitle compositeTitle2 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str3 = compositeTitle2.getID();
        org.jfree.chart.block.BlockContainer blockContainer4 = compositeTitle2.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment5 = compositeTitle2.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle6 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str7 = compositeTitle6.getID();
        org.jfree.chart.block.BlockContainer blockContainer8 = compositeTitle6.getContainer();
        compositeTitle2.setTitleContainer(blockContainer8);
        org.jfree.chart.title.CompositeTitle compositeTitle10 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str11 = compositeTitle10.getID();
        org.jfree.chart.block.BlockContainer blockContainer12 = compositeTitle10.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment13 = compositeTitle10.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle14 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str15 = compositeTitle14.getID();
        org.jfree.chart.block.BlockContainer blockContainer16 = compositeTitle14.getContainer();
        compositeTitle10.setTitleContainer(blockContainer16);
        compositeTitle2.setTitleContainer(blockContainer16);
        double double19 = blockContainer16.getContentXOffset();
        compositeTitle0.setTitleContainer(blockContainer16);
        org.jfree.chart.title.CompositeTitle compositeTitle21 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str22 = compositeTitle21.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge23 = compositeTitle21.getPosition();
        boolean boolean24 = compositeTitle21.getNotify();
        java.lang.String str25 = compositeTitle21.getID();
        org.jfree.chart.api.VerticalAlignment verticalAlignment26 = compositeTitle21.getVerticalAlignment();
        org.jfree.chart.block.BlockContainer blockContainer27 = compositeTitle21.getContainer();
        org.jfree.chart.title.CompositeTitle compositeTitle28 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str29 = compositeTitle28.getID();
        org.jfree.chart.block.BlockContainer blockContainer30 = compositeTitle28.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment31 = compositeTitle28.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle32 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str33 = compositeTitle32.getID();
        org.jfree.chart.block.BlockContainer blockContainer34 = compositeTitle32.getContainer();
        compositeTitle28.setTitleContainer(blockContainer34);
        compositeTitle21.setTitleContainer(blockContainer34);
        compositeTitle0.setTitleContainer(blockContainer34);
        double double38 = compositeTitle0.getContentXOffset();
        boolean boolean39 = compositeTitle0.getNotify();
        double double40 = compositeTitle0.getHeight();
        java.lang.Object obj41 = compositeTitle0.clone();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(blockContainer4);
        org.junit.Assert.assertTrue("'" + verticalAlignment5 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment5.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(blockContainer8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(blockContainer12);
        org.junit.Assert.assertTrue("'" + verticalAlignment13 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment13.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(blockContainer16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + rectangleEdge23 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge23.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + verticalAlignment26 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment26.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNotNull(blockContainer27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(blockContainer30);
        org.junit.Assert.assertTrue("'" + verticalAlignment31 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment31.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(blockContainer34);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0d + "'", double38 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(obj41);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test550");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment3 = compositeTitle0.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle4 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str5 = compositeTitle4.getID();
        org.jfree.chart.block.BlockContainer blockContainer6 = compositeTitle4.getContainer();
        compositeTitle0.setTitleContainer(blockContainer6);
        org.jfree.chart.title.CompositeTitle compositeTitle8 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str9 = compositeTitle8.getID();
        org.jfree.chart.block.BlockContainer blockContainer10 = compositeTitle8.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment11 = compositeTitle8.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle12 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str13 = compositeTitle12.getID();
        org.jfree.chart.block.BlockContainer blockContainer14 = compositeTitle12.getContainer();
        compositeTitle8.setTitleContainer(blockContainer14);
        compositeTitle0.setTitleContainer(blockContainer14);
        org.jfree.chart.title.CompositeTitle compositeTitle17 = new org.jfree.chart.title.CompositeTitle(blockContainer14);
        org.jfree.chart.title.CompositeTitle compositeTitle18 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str19 = compositeTitle18.getID();
        org.jfree.chart.block.BlockContainer blockContainer20 = compositeTitle18.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment21 = compositeTitle18.getVerticalAlignment();
        org.jfree.chart.api.RectangleEdge rectangleEdge22 = compositeTitle18.getPosition();
        boolean boolean23 = compositeTitle17.equals((java.lang.Object) rectangleEdge22);
        org.jfree.chart.event.TitleChangeListener titleChangeListener24 = null;
        compositeTitle17.removeChangeListener(titleChangeListener24);
        org.jfree.chart.api.RectangleInsets rectangleInsets26 = compositeTitle17.getPadding();
        compositeTitle17.visible = true;
        double double29 = compositeTitle17.getWidth();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertTrue("'" + verticalAlignment3 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment3.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(blockContainer6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(blockContainer10);
        org.junit.Assert.assertTrue("'" + verticalAlignment11 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment11.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(blockContainer14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(blockContainer20);
        org.junit.Assert.assertTrue("'" + verticalAlignment21 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment21.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + rectangleEdge22 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge22.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test551");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment3 = compositeTitle0.getVerticalAlignment();
        org.jfree.chart.api.VerticalAlignment verticalAlignment4 = compositeTitle0.getVerticalAlignment();
        java.awt.Paint paint5 = null;
        compositeTitle0.setBackgroundPaint(paint5);
        org.jfree.chart.api.RectangleInsets rectangleInsets7 = compositeTitle0.getPadding();
        java.lang.Object obj8 = compositeTitle0.clone();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertTrue("'" + verticalAlignment3 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment3.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + verticalAlignment4 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment4.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test552");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.awt.geom.Rectangle2D rectangle2D4 = compositeTitle0.getBounds();
        org.jfree.chart.block.BlockFrame blockFrame5 = compositeTitle0.getFrame();
        boolean boolean6 = compositeTitle0.isVisible();
        org.jfree.chart.api.RectangleEdge rectangleEdge7 = compositeTitle0.getPosition();
        org.jfree.chart.title.CompositeTitle compositeTitle8 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str9 = compositeTitle8.getID();
        org.jfree.chart.block.BlockContainer blockContainer10 = compositeTitle8.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment11 = compositeTitle8.getVerticalAlignment();
        org.jfree.chart.api.RectangleInsets rectangleInsets12 = compositeTitle8.getPadding();
        boolean boolean13 = compositeTitle0.equals((java.lang.Object) compositeTitle8);
        java.lang.String str14 = compositeTitle0.getID();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(rectangle2D4);
        org.junit.Assert.assertNotNull(blockFrame5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + rectangleEdge7 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge7.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(blockContainer10);
        org.junit.Assert.assertTrue("'" + verticalAlignment11 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment11.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test553");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment3 = compositeTitle0.getVerticalAlignment();
        org.jfree.chart.api.RectangleEdge rectangleEdge4 = compositeTitle0.getPosition();
        org.jfree.chart.title.CompositeTitle compositeTitle5 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str6 = compositeTitle5.getID();
        org.jfree.chart.block.BlockContainer blockContainer7 = compositeTitle5.getContainer();
        compositeTitle5.setPadding(0.0d, (double) 1L, (double) 10L, (double) (short) 0);
        compositeTitle5.setPadding((double) 10L, (double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        org.jfree.chart.api.RectangleInsets rectangleInsets18 = compositeTitle5.getMargin();
        org.jfree.chart.event.TitleChangeListener titleChangeListener19 = null;
        compositeTitle5.removeChangeListener(titleChangeListener19);
        org.jfree.chart.api.HorizontalAlignment horizontalAlignment21 = compositeTitle5.getHorizontalAlignment();
        compositeTitle0.setHorizontalAlignment(horizontalAlignment21);
        boolean boolean23 = compositeTitle0.getNotify();
        double double24 = compositeTitle0.getHeight();
        compositeTitle0.setPadding((double) ' ', (double) 1, (double) (-1), (double) '4');
        double double30 = compositeTitle0.getContentYOffset();
        java.lang.String str31 = compositeTitle0.getID();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertTrue("'" + verticalAlignment3 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment3.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + rectangleEdge4 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge4.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(blockContainer7);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertTrue("'" + horizontalAlignment21 + "' != '" + org.jfree.chart.api.HorizontalAlignment.CENTER + "'", horizontalAlignment21.equals(org.jfree.chart.api.HorizontalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 32.0d + "'", double30 == 32.0d);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test554");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        compositeTitle0.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        org.jfree.chart.title.CompositeTitle compositeTitle10 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str11 = compositeTitle10.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge12 = compositeTitle10.getPosition();
        boolean boolean13 = compositeTitle10.getNotify();
        java.awt.geom.Rectangle2D rectangle2D14 = compositeTitle10.getBounds();
        compositeTitle0.setBounds(rectangle2D14);
        org.jfree.chart.block.BlockContainer blockContainer16 = compositeTitle0.getContainer();
        org.jfree.chart.api.RectangleEdge rectangleEdge17 = compositeTitle0.getPosition();
        java.lang.Object obj18 = compositeTitle0.clone();
        org.jfree.chart.api.HorizontalAlignment horizontalAlignment19 = compositeTitle0.getHorizontalAlignment();
        double double20 = compositeTitle0.getContentYOffset();
        double double21 = compositeTitle0.getContentXOffset();
        compositeTitle0.setPadding((double) 1, (double) 100, (double) 0.0f, 0.0d);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + rectangleEdge12 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge12.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(rectangle2D14);
        org.junit.Assert.assertNotNull(blockContainer16);
        org.junit.Assert.assertTrue("'" + rectangleEdge17 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge17.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + horizontalAlignment19 + "' != '" + org.jfree.chart.api.HorizontalAlignment.CENTER + "'", horizontalAlignment19.equals(org.jfree.chart.api.HorizontalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test555");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        boolean boolean1 = compositeTitle0.getNotify();
        java.awt.Paint paint2 = compositeTitle0.getBackgroundPaint();
        org.jfree.chart.event.TitleChangeListener titleChangeListener3 = null;
        compositeTitle0.addChangeListener(titleChangeListener3);
        double double5 = compositeTitle0.getHeight();
        double double6 = compositeTitle0.getWidth();
        org.jfree.chart.title.CompositeTitle compositeTitle7 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str8 = compositeTitle7.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge9 = compositeTitle7.getPosition();
        boolean boolean10 = compositeTitle7.getNotify();
        java.lang.String str11 = compositeTitle7.getID();
        compositeTitle7.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        double double17 = compositeTitle7.getWidth();
        compositeTitle7.setVisible(true);
        boolean boolean20 = compositeTitle7.visible;
        org.jfree.chart.title.CompositeTitle compositeTitle21 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str22 = compositeTitle21.getID();
        org.jfree.chart.block.BlockContainer blockContainer23 = compositeTitle21.getContainer();
        compositeTitle21.setPadding(0.0d, (double) 1L, (double) 10L, (double) (short) 0);
        compositeTitle21.setPadding((double) 10L, (double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        org.jfree.chart.block.BlockFrame blockFrame34 = compositeTitle21.getFrame();
        compositeTitle7.setFrame(blockFrame34);
        org.jfree.chart.block.BlockContainer blockContainer36 = compositeTitle7.getContainer();
        java.awt.geom.Rectangle2D rectangle2D37 = blockContainer36.getBounds();
        compositeTitle0.setTitleContainer(blockContainer36);
        blockContainer36.setMargin((double) 1.0f, 100.0d, (double) '#', (double) (byte) 10);
        org.jfree.chart.title.CompositeTitle compositeTitle44 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str45 = compositeTitle44.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge46 = compositeTitle44.getPosition();
        boolean boolean47 = compositeTitle44.getNotify();
        java.lang.String str48 = compositeTitle44.getID();
        org.jfree.chart.api.VerticalAlignment verticalAlignment49 = compositeTitle44.getVerticalAlignment();
        compositeTitle44.visible = true;
        org.jfree.chart.api.VerticalAlignment verticalAlignment52 = compositeTitle44.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle53 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str54 = compositeTitle53.getID();
        org.jfree.chart.block.BlockContainer blockContainer55 = compositeTitle53.getContainer();
        compositeTitle53.setPadding((double) (byte) 100, (double) '#', (double) 0L, (double) 100);
        org.jfree.chart.event.TitleChangeListener titleChangeListener61 = null;
        compositeTitle53.removeChangeListener(titleChangeListener61);
        org.jfree.chart.api.HorizontalAlignment horizontalAlignment63 = compositeTitle53.getHorizontalAlignment();
        org.jfree.chart.api.RectangleInsets rectangleInsets64 = compositeTitle53.getPadding();
        compositeTitle44.setPadding(rectangleInsets64);
        blockContainer36.setMargin(rectangleInsets64);
        org.jfree.chart.title.CompositeTitle compositeTitle67 = new org.jfree.chart.title.CompositeTitle(blockContainer36);
        double double68 = blockContainer36.getContentXOffset();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + rectangleEdge9 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge9.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(blockContainer23);
        org.junit.Assert.assertNotNull(blockFrame34);
        org.junit.Assert.assertNotNull(blockContainer36);
        org.junit.Assert.assertNotNull(rectangle2D37);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + rectangleEdge46 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge46.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + verticalAlignment49 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment49.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + verticalAlignment52 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment52.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(blockContainer55);
        org.junit.Assert.assertTrue("'" + horizontalAlignment63 + "' != '" + org.jfree.chart.api.HorizontalAlignment.CENTER + "'", horizontalAlignment63.equals(org.jfree.chart.api.HorizontalAlignment.CENTER));
        org.junit.Assert.assertNotNull(rectangleInsets64);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 35.0d + "'", double68 == 35.0d);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test556");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        org.jfree.chart.title.CompositeTitle compositeTitle1 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str2 = compositeTitle1.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge3 = compositeTitle1.getPosition();
        boolean boolean4 = compositeTitle1.getNotify();
        java.lang.String str5 = compositeTitle1.getID();
        compositeTitle1.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        double double11 = compositeTitle1.getWidth();
        compositeTitle1.setVisible(true);
        boolean boolean14 = compositeTitle1.visible;
        org.jfree.chart.api.VerticalAlignment verticalAlignment15 = compositeTitle1.getVerticalAlignment();
        compositeTitle0.setVerticalAlignment(verticalAlignment15);
        boolean boolean17 = compositeTitle0.getNotify();
        org.jfree.chart.title.CompositeTitle compositeTitle18 = new org.jfree.chart.title.CompositeTitle();
        org.jfree.chart.api.RectangleEdge rectangleEdge19 = compositeTitle18.getPosition();
        org.jfree.chart.title.CompositeTitle compositeTitle20 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str21 = compositeTitle20.getID();
        org.jfree.chart.block.BlockContainer blockContainer22 = compositeTitle20.getContainer();
        compositeTitle20.setPadding(0.0d, (double) 1L, (double) 10L, (double) (short) 0);
        compositeTitle20.setPadding((double) 10L, (double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        org.jfree.chart.api.RectangleInsets rectangleInsets33 = compositeTitle20.getMargin();
        org.jfree.chart.event.TitleChangeListener titleChangeListener34 = null;
        compositeTitle20.removeChangeListener(titleChangeListener34);
        org.jfree.chart.api.HorizontalAlignment horizontalAlignment36 = compositeTitle20.getHorizontalAlignment();
        boolean boolean37 = compositeTitle18.equals((java.lang.Object) horizontalAlignment36);
        compositeTitle0.setHorizontalAlignment(horizontalAlignment36);
        org.jfree.chart.api.RectangleInsets rectangleInsets39 = compositeTitle0.getMargin();
        org.jfree.chart.title.CompositeTitle compositeTitle40 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str41 = compositeTitle40.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge42 = compositeTitle40.getPosition();
        boolean boolean43 = compositeTitle40.getNotify();
        java.lang.String str44 = compositeTitle40.getID();
        compositeTitle40.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        org.jfree.chart.title.CompositeTitle compositeTitle50 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str51 = compositeTitle50.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge52 = compositeTitle50.getPosition();
        boolean boolean53 = compositeTitle50.getNotify();
        java.awt.geom.Rectangle2D rectangle2D54 = compositeTitle50.getBounds();
        compositeTitle40.setBounds(rectangle2D54);
        org.jfree.chart.api.VerticalAlignment verticalAlignment56 = org.jfree.chart.title.Title.DEFAULT_VERTICAL_ALIGNMENT;
        compositeTitle40.setVerticalAlignment(verticalAlignment56);
        compositeTitle0.setVerticalAlignment(verticalAlignment56);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + rectangleEdge3 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge3.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + verticalAlignment15 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment15.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + rectangleEdge19 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge19.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(blockContainer22);
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertTrue("'" + horizontalAlignment36 + "' != '" + org.jfree.chart.api.HorizontalAlignment.CENTER + "'", horizontalAlignment36.equals(org.jfree.chart.api.HorizontalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(rectangleInsets39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + rectangleEdge42 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge42.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + rectangleEdge52 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge52.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(rectangle2D54);
        org.junit.Assert.assertTrue("'" + verticalAlignment56 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment56.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test557");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment3 = compositeTitle0.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle4 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str5 = compositeTitle4.getID();
        org.jfree.chart.block.BlockContainer blockContainer6 = compositeTitle4.getContainer();
        compositeTitle0.setTitleContainer(blockContainer6);
        org.jfree.chart.api.VerticalAlignment verticalAlignment8 = compositeTitle0.getVerticalAlignment();
        compositeTitle0.setPadding((double) 0, (-1.0d), (double) 'a', 100.0d);
        double double14 = compositeTitle0.getContentYOffset();
        org.jfree.chart.event.TitleChangeListener titleChangeListener15 = null;
        compositeTitle0.addChangeListener(titleChangeListener15);
        double double17 = compositeTitle0.getContentXOffset();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertTrue("'" + verticalAlignment3 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment3.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(blockContainer6);
        org.junit.Assert.assertTrue("'" + verticalAlignment8 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment8.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test558");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        compositeTitle0.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        org.jfree.chart.api.HorizontalAlignment horizontalAlignment10 = org.jfree.chart.title.Title.DEFAULT_HORIZONTAL_ALIGNMENT;
        compositeTitle0.setHorizontalAlignment(horizontalAlignment10);
        compositeTitle0.setBorder((double) 10.0f, (double) 0, (double) 10L, (double) 1.0f);
        org.jfree.chart.api.RectangleInsets rectangleInsets17 = compositeTitle0.getMargin();
        compositeTitle0.setID("hi!");
        org.jfree.chart.title.CompositeTitle compositeTitle20 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str21 = compositeTitle20.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge22 = compositeTitle20.getPosition();
        boolean boolean23 = compositeTitle20.getNotify();
        java.lang.String str24 = compositeTitle20.getID();
        compositeTitle20.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        org.jfree.chart.title.CompositeTitle compositeTitle30 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str31 = compositeTitle30.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge32 = compositeTitle30.getPosition();
        boolean boolean33 = compositeTitle30.getNotify();
        java.awt.geom.Rectangle2D rectangle2D34 = compositeTitle30.getBounds();
        compositeTitle20.setBounds(rectangle2D34);
        org.jfree.chart.block.BlockContainer blockContainer36 = compositeTitle20.getContainer();
        org.jfree.chart.api.RectangleEdge rectangleEdge37 = compositeTitle20.getPosition();
        java.lang.Object obj38 = compositeTitle20.clone();
        org.jfree.chart.api.HorizontalAlignment horizontalAlignment39 = compositeTitle20.getHorizontalAlignment();
        org.jfree.chart.block.BlockContainer blockContainer40 = compositeTitle20.getContainer();
        org.jfree.chart.title.CompositeTitle compositeTitle41 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str42 = compositeTitle41.getID();
        org.jfree.chart.block.BlockContainer blockContainer43 = compositeTitle41.getContainer();
        compositeTitle41.setPadding(0.0d, (double) 1L, (double) 10L, (double) (short) 0);
        org.jfree.chart.api.RectangleInsets rectangleInsets49 = compositeTitle41.getPadding();
        java.lang.Object obj50 = compositeTitle41.clone();
        org.jfree.chart.title.CompositeTitle compositeTitle51 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str52 = compositeTitle51.getID();
        org.jfree.chart.block.BlockContainer blockContainer53 = compositeTitle51.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment54 = compositeTitle51.getVerticalAlignment();
        org.jfree.chart.api.VerticalAlignment verticalAlignment55 = compositeTitle51.getVerticalAlignment();
        java.awt.Paint paint56 = null;
        compositeTitle51.setBackgroundPaint(paint56);
        org.jfree.chart.api.RectangleInsets rectangleInsets58 = compositeTitle51.getPadding();
        double double59 = compositeTitle51.getHeight();
        compositeTitle51.visible = true;
        java.awt.Paint paint62 = null;
        compositeTitle51.setBackgroundPaint(paint62);
        org.jfree.chart.title.CompositeTitle compositeTitle64 = new org.jfree.chart.title.CompositeTitle();
        org.jfree.chart.title.CompositeTitle compositeTitle65 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str66 = compositeTitle65.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge67 = compositeTitle65.getPosition();
        boolean boolean68 = compositeTitle65.getNotify();
        java.lang.String str69 = compositeTitle65.getID();
        compositeTitle65.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        double double75 = compositeTitle65.getWidth();
        compositeTitle65.setVisible(true);
        boolean boolean78 = compositeTitle65.visible;
        org.jfree.chart.api.VerticalAlignment verticalAlignment79 = compositeTitle65.getVerticalAlignment();
        compositeTitle64.setVerticalAlignment(verticalAlignment79);
        double double81 = compositeTitle64.getWidth();
        org.jfree.chart.title.CompositeTitle compositeTitle82 = new org.jfree.chart.title.CompositeTitle();
        boolean boolean83 = compositeTitle82.getNotify();
        org.jfree.chart.event.TitleChangeListener titleChangeListener84 = null;
        compositeTitle82.removeChangeListener(titleChangeListener84);
        double double86 = compositeTitle82.getHeight();
        org.jfree.chart.api.RectangleInsets rectangleInsets87 = compositeTitle82.getMargin();
        compositeTitle64.setPadding(rectangleInsets87);
        compositeTitle51.setMargin(rectangleInsets87);
        compositeTitle41.setPadding(rectangleInsets87);
        compositeTitle20.setPadding(rectangleInsets87);
        compositeTitle0.setPadding(rectangleInsets87);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + horizontalAlignment10 + "' != '" + org.jfree.chart.api.HorizontalAlignment.CENTER + "'", horizontalAlignment10.equals(org.jfree.chart.api.HorizontalAlignment.CENTER));
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + rectangleEdge22 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge22.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + rectangleEdge32 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge32.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(rectangle2D34);
        org.junit.Assert.assertNotNull(blockContainer36);
        org.junit.Assert.assertTrue("'" + rectangleEdge37 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge37.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + horizontalAlignment39 + "' != '" + org.jfree.chart.api.HorizontalAlignment.CENTER + "'", horizontalAlignment39.equals(org.jfree.chart.api.HorizontalAlignment.CENTER));
        org.junit.Assert.assertNotNull(blockContainer40);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(blockContainer43);
        org.junit.Assert.assertNotNull(rectangleInsets49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(blockContainer53);
        org.junit.Assert.assertTrue("'" + verticalAlignment54 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment54.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + verticalAlignment55 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment55.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNotNull(rectangleInsets58);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertTrue("'" + rectangleEdge67 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge67.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + verticalAlignment79 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment79.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.0d + "'", double86 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets87);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test559");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        org.jfree.chart.api.VerticalAlignment verticalAlignment5 = compositeTitle0.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle6 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str7 = compositeTitle6.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge8 = compositeTitle6.getPosition();
        boolean boolean9 = compositeTitle6.getNotify();
        java.awt.geom.Rectangle2D rectangle2D10 = compositeTitle6.getBounds();
        compositeTitle0.setBounds(rectangle2D10);
        org.jfree.chart.event.TitleChangeListener titleChangeListener12 = null;
        compositeTitle0.addChangeListener(titleChangeListener12);
        org.jfree.chart.title.CompositeTitle compositeTitle14 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str15 = compositeTitle14.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge16 = compositeTitle14.getPosition();
        boolean boolean17 = compositeTitle14.getNotify();
        java.lang.String str18 = compositeTitle14.getID();
        compositeTitle14.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        org.jfree.chart.title.CompositeTitle compositeTitle24 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str25 = compositeTitle24.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge26 = compositeTitle24.getPosition();
        boolean boolean27 = compositeTitle24.getNotify();
        java.awt.geom.Rectangle2D rectangle2D28 = compositeTitle24.getBounds();
        compositeTitle14.setBounds(rectangle2D28);
        org.jfree.chart.api.RectangleInsets rectangleInsets30 = compositeTitle14.getMargin();
        compositeTitle0.setMargin(rectangleInsets30);
        org.jfree.chart.title.CompositeTitle compositeTitle32 = new org.jfree.chart.title.CompositeTitle();
        boolean boolean33 = compositeTitle32.getNotify();
        java.awt.Paint paint34 = compositeTitle32.getBackgroundPaint();
        org.jfree.chart.title.CompositeTitle compositeTitle35 = new org.jfree.chart.title.CompositeTitle();
        org.jfree.chart.api.RectangleEdge rectangleEdge36 = compositeTitle35.getPosition();
        org.jfree.chart.title.CompositeTitle compositeTitle37 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str38 = compositeTitle37.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge39 = compositeTitle37.getPosition();
        boolean boolean40 = compositeTitle37.getNotify();
        java.lang.String str41 = compositeTitle37.getID();
        org.jfree.chart.api.HorizontalAlignment horizontalAlignment42 = compositeTitle37.getHorizontalAlignment();
        compositeTitle35.setHorizontalAlignment(horizontalAlignment42);
        compositeTitle32.setHorizontalAlignment(horizontalAlignment42);
        compositeTitle0.setHorizontalAlignment(horizontalAlignment42);
        org.jfree.chart.title.CompositeTitle compositeTitle46 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str47 = compositeTitle46.getID();
        org.jfree.chart.block.BlockContainer blockContainer48 = compositeTitle46.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment49 = compositeTitle46.getVerticalAlignment();
        org.jfree.chart.api.VerticalAlignment verticalAlignment50 = compositeTitle46.getVerticalAlignment();
        java.awt.Paint paint51 = null;
        compositeTitle46.setBackgroundPaint(paint51);
        org.jfree.chart.api.RectangleInsets rectangleInsets53 = compositeTitle46.getPadding();
        double double54 = compositeTitle46.getHeight();
        compositeTitle46.visible = true;
        org.jfree.chart.block.BlockContainer blockContainer57 = compositeTitle46.getContainer();
        org.jfree.chart.api.HorizontalAlignment horizontalAlignment58 = compositeTitle46.getHorizontalAlignment();
        compositeTitle0.setHorizontalAlignment(horizontalAlignment58);
        java.lang.String str60 = compositeTitle0.getID();
        java.awt.geom.Rectangle2D rectangle2D61 = compositeTitle0.getBounds();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + verticalAlignment5 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment5.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + rectangleEdge8 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge8.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(rectangle2D10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + rectangleEdge16 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge16.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + rectangleEdge26 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge26.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(rectangle2D28);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(paint34);
        org.junit.Assert.assertTrue("'" + rectangleEdge36 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge36.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + rectangleEdge39 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge39.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + horizontalAlignment42 + "' != '" + org.jfree.chart.api.HorizontalAlignment.CENTER + "'", horizontalAlignment42.equals(org.jfree.chart.api.HorizontalAlignment.CENTER));
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(blockContainer48);
        org.junit.Assert.assertTrue("'" + verticalAlignment49 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment49.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + verticalAlignment50 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment50.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNotNull(rectangleInsets53);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertNotNull(blockContainer57);
        org.junit.Assert.assertTrue("'" + horizontalAlignment58 + "' != '" + org.jfree.chart.api.HorizontalAlignment.CENTER + "'", horizontalAlignment58.equals(org.jfree.chart.api.HorizontalAlignment.CENTER));
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(rectangle2D61);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test560");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        org.jfree.chart.api.VerticalAlignment verticalAlignment5 = compositeTitle0.getVerticalAlignment();
        org.jfree.chart.block.BlockContainer blockContainer6 = compositeTitle0.getContainer();
        org.jfree.chart.event.TitleChangeListener titleChangeListener7 = null;
        compositeTitle0.addChangeListener(titleChangeListener7);
        org.jfree.chart.title.CompositeTitle compositeTitle9 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str10 = compositeTitle9.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge11 = compositeTitle9.getPosition();
        boolean boolean12 = compositeTitle9.getNotify();
        java.lang.String str13 = compositeTitle9.getID();
        compositeTitle9.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        org.jfree.chart.api.HorizontalAlignment horizontalAlignment19 = org.jfree.chart.title.Title.DEFAULT_HORIZONTAL_ALIGNMENT;
        compositeTitle9.setHorizontalAlignment(horizontalAlignment19);
        compositeTitle0.setHorizontalAlignment(horizontalAlignment19);
        java.awt.geom.Rectangle2D rectangle2D22 = compositeTitle0.getBounds();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + verticalAlignment5 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment5.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNotNull(blockContainer6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + rectangleEdge11 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge11.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + horizontalAlignment19 + "' != '" + org.jfree.chart.api.HorizontalAlignment.CENTER + "'", horizontalAlignment19.equals(org.jfree.chart.api.HorizontalAlignment.CENTER));
        org.junit.Assert.assertNotNull(rectangle2D22);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test561");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        boolean boolean1 = compositeTitle0.getNotify();
        java.awt.Paint paint2 = compositeTitle0.getBackgroundPaint();
        org.jfree.chart.event.TitleChangeListener titleChangeListener3 = null;
        compositeTitle0.addChangeListener(titleChangeListener3);
        org.jfree.chart.title.CompositeTitle compositeTitle5 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str6 = compositeTitle5.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge7 = compositeTitle5.getPosition();
        boolean boolean8 = compositeTitle5.getNotify();
        java.lang.String str9 = compositeTitle5.getID();
        double double10 = compositeTitle5.getContentXOffset();
        org.jfree.chart.block.BlockContainer blockContainer11 = compositeTitle5.getContainer();
        compositeTitle0.setTitleContainer(blockContainer11);
        blockContainer11.setMargin((double) 100.0f, 0.0d, 11.0d, (double) (short) 0);
        blockContainer11.setMargin((-1.0d), (double) (byte) 0, (double) ' ', (double) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + rectangleEdge7 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge7.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(blockContainer11);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test562");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        org.jfree.chart.title.CompositeTitle compositeTitle3 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str4 = compositeTitle3.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge5 = compositeTitle3.getPosition();
        compositeTitle0.setPosition(rectangleEdge5);
        org.jfree.chart.title.CompositeTitle compositeTitle7 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str8 = compositeTitle7.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge9 = compositeTitle7.getPosition();
        boolean boolean10 = compositeTitle7.getNotify();
        java.lang.String str11 = compositeTitle7.getID();
        compositeTitle7.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        double double17 = compositeTitle7.getWidth();
        compositeTitle7.setVisible(true);
        boolean boolean20 = compositeTitle7.visible;
        org.jfree.chart.title.CompositeTitle compositeTitle21 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str22 = compositeTitle21.getID();
        org.jfree.chart.block.BlockContainer blockContainer23 = compositeTitle21.getContainer();
        compositeTitle21.setPadding(0.0d, (double) 1L, (double) 10L, (double) (short) 0);
        compositeTitle21.setPadding((double) 10L, (double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        org.jfree.chart.block.BlockFrame blockFrame34 = compositeTitle21.getFrame();
        compositeTitle7.setFrame(blockFrame34);
        compositeTitle0.setFrame(blockFrame34);
        double double37 = compositeTitle0.getWidth();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + rectangleEdge5 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge5.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + rectangleEdge9 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge9.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(blockContainer23);
        org.junit.Assert.assertNotNull(blockFrame34);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test563");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment3 = compositeTitle0.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle4 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str5 = compositeTitle4.getID();
        org.jfree.chart.block.BlockContainer blockContainer6 = compositeTitle4.getContainer();
        compositeTitle0.setTitleContainer(blockContainer6);
        org.jfree.chart.title.CompositeTitle compositeTitle8 = new org.jfree.chart.title.CompositeTitle(blockContainer6);
        org.jfree.chart.title.CompositeTitle compositeTitle9 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str10 = compositeTitle9.getID();
        org.jfree.chart.block.BlockContainer blockContainer11 = compositeTitle9.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment12 = compositeTitle9.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle13 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str14 = compositeTitle13.getID();
        org.jfree.chart.block.BlockContainer blockContainer15 = compositeTitle13.getContainer();
        compositeTitle9.setTitleContainer(blockContainer15);
        org.jfree.chart.title.CompositeTitle compositeTitle17 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str18 = compositeTitle17.getID();
        org.jfree.chart.block.BlockContainer blockContainer19 = compositeTitle17.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment20 = compositeTitle17.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle21 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str22 = compositeTitle21.getID();
        org.jfree.chart.block.BlockContainer blockContainer23 = compositeTitle21.getContainer();
        compositeTitle17.setTitleContainer(blockContainer23);
        compositeTitle9.setTitleContainer(blockContainer23);
        compositeTitle8.setTitleContainer(blockContainer23);
        compositeTitle8.setBorder(100.0d, (double) (short) 10, (double) (short) 10, (double) (short) 100);
        org.jfree.chart.api.RectangleInsets rectangleInsets32 = compositeTitle8.getMargin();
        double double33 = compositeTitle8.getHeight();
        double double34 = compositeTitle8.getContentXOffset();
        org.jfree.chart.title.CompositeTitle compositeTitle35 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str36 = compositeTitle35.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge37 = compositeTitle35.getPosition();
        boolean boolean38 = compositeTitle35.getNotify();
        java.lang.String str39 = compositeTitle35.getID();
        org.jfree.chart.api.VerticalAlignment verticalAlignment40 = compositeTitle35.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle41 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str42 = compositeTitle41.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge43 = compositeTitle41.getPosition();
        boolean boolean44 = compositeTitle41.getNotify();
        java.awt.geom.Rectangle2D rectangle2D45 = compositeTitle41.getBounds();
        compositeTitle35.setBounds(rectangle2D45);
        compositeTitle8.setBounds(rectangle2D45);
        double double48 = compositeTitle8.getContentYOffset();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertTrue("'" + verticalAlignment3 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment3.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(blockContainer6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(blockContainer11);
        org.junit.Assert.assertTrue("'" + verticalAlignment12 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment12.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(blockContainer15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(blockContainer19);
        org.junit.Assert.assertTrue("'" + verticalAlignment20 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment20.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(blockContainer23);
        org.junit.Assert.assertNotNull(rectangleInsets32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 11.0d + "'", double34 == 11.0d);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + rectangleEdge37 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge37.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + verticalAlignment40 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment40.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + rectangleEdge43 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge43.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(rectangle2D45);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 101.0d + "'", double48 == 101.0d);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test564");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        compositeTitle0.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        org.jfree.chart.title.CompositeTitle compositeTitle10 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str11 = compositeTitle10.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge12 = compositeTitle10.getPosition();
        boolean boolean13 = compositeTitle10.getNotify();
        java.awt.geom.Rectangle2D rectangle2D14 = compositeTitle10.getBounds();
        compositeTitle0.setBounds(rectangle2D14);
        org.jfree.chart.block.BlockContainer blockContainer16 = compositeTitle0.getContainer();
        org.jfree.chart.api.RectangleEdge rectangleEdge17 = compositeTitle0.getPosition();
        compositeTitle0.setNotify(false);
        org.jfree.chart.api.HorizontalAlignment horizontalAlignment20 = compositeTitle0.getHorizontalAlignment();
        compositeTitle0.setNotify(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + rectangleEdge12 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge12.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(rectangle2D14);
        org.junit.Assert.assertNotNull(blockContainer16);
        org.junit.Assert.assertTrue("'" + rectangleEdge17 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge17.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + horizontalAlignment20 + "' != '" + org.jfree.chart.api.HorizontalAlignment.CENTER + "'", horizontalAlignment20.equals(org.jfree.chart.api.HorizontalAlignment.CENTER));
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test565");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment3 = compositeTitle0.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle4 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str5 = compositeTitle4.getID();
        org.jfree.chart.block.BlockContainer blockContainer6 = compositeTitle4.getContainer();
        compositeTitle0.setTitleContainer(blockContainer6);
        org.jfree.chart.title.CompositeTitle compositeTitle8 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str9 = compositeTitle8.getID();
        org.jfree.chart.block.BlockContainer blockContainer10 = compositeTitle8.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment11 = compositeTitle8.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle12 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str13 = compositeTitle12.getID();
        org.jfree.chart.block.BlockContainer blockContainer14 = compositeTitle12.getContainer();
        compositeTitle8.setTitleContainer(blockContainer14);
        compositeTitle0.setTitleContainer(blockContainer14);
        compositeTitle0.setWidth((double) 0.0f);
        compositeTitle0.setNotify(true);
        compositeTitle0.setNotify(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertTrue("'" + verticalAlignment3 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment3.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(blockContainer6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(blockContainer10);
        org.junit.Assert.assertTrue("'" + verticalAlignment11 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment11.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(blockContainer14);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test566");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        org.jfree.chart.event.TitleChangeListener titleChangeListener3 = null;
        compositeTitle0.addChangeListener(titleChangeListener3);
        org.jfree.chart.api.RectangleInsets rectangleInsets5 = compositeTitle0.getMargin();
        java.awt.geom.Rectangle2D rectangle2D6 = compositeTitle0.getBounds();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(rectangle2D6);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test567");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        compositeTitle0.setPadding((double) (byte) 100, (double) '#', (double) 0L, (double) 100);
        org.jfree.chart.event.TitleChangeListener titleChangeListener8 = null;
        compositeTitle0.removeChangeListener(titleChangeListener8);
        org.jfree.chart.api.HorizontalAlignment horizontalAlignment10 = compositeTitle0.getHorizontalAlignment();
        org.jfree.chart.api.RectangleInsets rectangleInsets11 = compositeTitle0.getPadding();
        java.awt.Paint paint12 = null;
        compositeTitle0.setBackgroundPaint(paint12);
        org.jfree.chart.title.CompositeTitle compositeTitle14 = new org.jfree.chart.title.CompositeTitle();
        boolean boolean15 = compositeTitle14.getNotify();
        org.jfree.chart.event.TitleChangeListener titleChangeListener16 = null;
        compositeTitle14.removeChangeListener(titleChangeListener16);
        java.lang.String str18 = compositeTitle14.getID();
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.block.Size2D size2D20 = compositeTitle14.arrange(graphics2D19);
        boolean boolean21 = compositeTitle0.equals((java.lang.Object) graphics2D19);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertTrue("'" + horizontalAlignment10 + "' != '" + org.jfree.chart.api.HorizontalAlignment.CENTER + "'", horizontalAlignment10.equals(org.jfree.chart.api.HorizontalAlignment.CENTER));
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(size2D20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test568");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        org.jfree.chart.api.VerticalAlignment verticalAlignment5 = compositeTitle0.getVerticalAlignment();
        org.jfree.chart.block.BlockContainer blockContainer6 = compositeTitle0.getContainer();
        java.lang.String str7 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge8 = compositeTitle0.getPosition();
        org.jfree.chart.api.VerticalAlignment verticalAlignment9 = compositeTitle0.getVerticalAlignment();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + verticalAlignment5 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment5.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNotNull(blockContainer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + rectangleEdge8 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge8.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + verticalAlignment9 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment9.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test569");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment3 = compositeTitle0.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle4 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str5 = compositeTitle4.getID();
        org.jfree.chart.block.BlockContainer blockContainer6 = compositeTitle4.getContainer();
        compositeTitle0.setTitleContainer(blockContainer6);
        org.jfree.chart.title.CompositeTitle compositeTitle8 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str9 = compositeTitle8.getID();
        org.jfree.chart.block.BlockContainer blockContainer10 = compositeTitle8.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment11 = compositeTitle8.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle12 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str13 = compositeTitle12.getID();
        org.jfree.chart.block.BlockContainer blockContainer14 = compositeTitle12.getContainer();
        compositeTitle8.setTitleContainer(blockContainer14);
        compositeTitle0.setTitleContainer(blockContainer14);
        org.jfree.chart.title.CompositeTitle compositeTitle17 = new org.jfree.chart.title.CompositeTitle(blockContainer14);
        org.jfree.chart.title.CompositeTitle compositeTitle18 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str19 = compositeTitle18.getID();
        org.jfree.chart.block.BlockContainer blockContainer20 = compositeTitle18.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment21 = compositeTitle18.getVerticalAlignment();
        org.jfree.chart.api.RectangleEdge rectangleEdge22 = compositeTitle18.getPosition();
        boolean boolean23 = compositeTitle17.equals((java.lang.Object) rectangleEdge22);
        org.jfree.chart.event.TitleChangeListener titleChangeListener24 = null;
        compositeTitle17.removeChangeListener(titleChangeListener24);
        org.jfree.chart.api.RectangleInsets rectangleInsets26 = compositeTitle17.getPadding();
        org.jfree.chart.block.BlockFrame blockFrame27 = compositeTitle17.getFrame();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertTrue("'" + verticalAlignment3 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment3.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(blockContainer6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(blockContainer10);
        org.junit.Assert.assertTrue("'" + verticalAlignment11 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment11.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(blockContainer14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(blockContainer20);
        org.junit.Assert.assertTrue("'" + verticalAlignment21 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment21.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + rectangleEdge22 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge22.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNotNull(blockFrame27);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test570");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        org.jfree.chart.api.HorizontalAlignment horizontalAlignment5 = compositeTitle0.getHorizontalAlignment();
        boolean boolean6 = compositeTitle0.isVisible();
        boolean boolean7 = compositeTitle0.isVisible();
        double double8 = compositeTitle0.getHeight();
        org.jfree.chart.event.TitleChangeListener titleChangeListener9 = null;
        compositeTitle0.addChangeListener(titleChangeListener9);
        boolean boolean11 = compositeTitle0.visible;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + horizontalAlignment5 + "' != '" + org.jfree.chart.api.HorizontalAlignment.CENTER + "'", horizontalAlignment5.equals(org.jfree.chart.api.HorizontalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test571");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        compositeTitle0.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        double double10 = compositeTitle0.getWidth();
        compositeTitle0.setVisible(true);
        boolean boolean13 = compositeTitle0.visible;
        boolean boolean14 = compositeTitle0.isVisible();
        java.awt.Paint paint15 = compositeTitle0.getBackgroundPaint();
        compositeTitle0.setPadding((double) 1, (double) 1L, (double) 1L, (double) (byte) 0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(paint15);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test572");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        boolean boolean1 = compositeTitle0.getNotify();
        org.jfree.chart.event.TitleChangeListener titleChangeListener2 = null;
        compositeTitle0.removeChangeListener(titleChangeListener2);
        double double4 = compositeTitle0.getHeight();
        org.jfree.chart.api.RectangleInsets rectangleInsets5 = compositeTitle0.getMargin();
        java.awt.Paint paint6 = null;
        compositeTitle0.setBackgroundPaint(paint6);
        org.jfree.chart.api.RectangleEdge rectangleEdge8 = compositeTitle0.getPosition();
        double double9 = compositeTitle0.getContentYOffset();
        compositeTitle0.setID("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + rectangleEdge8 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge8.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test573");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment3 = compositeTitle0.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle4 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str5 = compositeTitle4.getID();
        org.jfree.chart.block.BlockContainer blockContainer6 = compositeTitle4.getContainer();
        compositeTitle0.setTitleContainer(blockContainer6);
        org.jfree.chart.api.VerticalAlignment verticalAlignment8 = compositeTitle0.getVerticalAlignment();
        boolean boolean9 = compositeTitle0.isVisible();
        org.jfree.chart.event.TitleChangeListener titleChangeListener10 = null;
        compositeTitle0.addChangeListener(titleChangeListener10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertTrue("'" + verticalAlignment3 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment3.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(blockContainer6);
        org.junit.Assert.assertTrue("'" + verticalAlignment8 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment8.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test574");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        double double2 = compositeTitle0.getContentXOffset();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test575");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment3 = compositeTitle0.getVerticalAlignment();
        org.jfree.chart.api.RectangleEdge rectangleEdge4 = compositeTitle0.getPosition();
        compositeTitle0.setMargin((double) 0L, (double) 0, (double) 0.0f, (double) (byte) 0);
        java.awt.Paint paint10 = null;
        compositeTitle0.setBackgroundPaint(paint10);
        double double12 = compositeTitle0.getContentXOffset();
        double double13 = compositeTitle0.getWidth();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertTrue("'" + verticalAlignment3 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment3.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + rectangleEdge4 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge4.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test576");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        compositeTitle0.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        org.jfree.chart.title.CompositeTitle compositeTitle10 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str11 = compositeTitle10.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge12 = compositeTitle10.getPosition();
        boolean boolean13 = compositeTitle10.getNotify();
        java.awt.geom.Rectangle2D rectangle2D14 = compositeTitle10.getBounds();
        compositeTitle0.setBounds(rectangle2D14);
        java.awt.geom.Rectangle2D rectangle2D16 = compositeTitle0.getBounds();
        compositeTitle0.setVisible(true);
        org.jfree.chart.title.CompositeTitle compositeTitle19 = new org.jfree.chart.title.CompositeTitle();
        boolean boolean20 = compositeTitle19.getNotify();
        org.jfree.chart.title.CompositeTitle compositeTitle21 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str22 = compositeTitle21.getID();
        org.jfree.chart.block.BlockContainer blockContainer23 = compositeTitle21.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment24 = compositeTitle21.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle25 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str26 = compositeTitle25.getID();
        org.jfree.chart.block.BlockContainer blockContainer27 = compositeTitle25.getContainer();
        compositeTitle21.setTitleContainer(blockContainer27);
        org.jfree.chart.title.CompositeTitle compositeTitle29 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str30 = compositeTitle29.getID();
        org.jfree.chart.block.BlockContainer blockContainer31 = compositeTitle29.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment32 = compositeTitle29.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle33 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str34 = compositeTitle33.getID();
        org.jfree.chart.block.BlockContainer blockContainer35 = compositeTitle33.getContainer();
        compositeTitle29.setTitleContainer(blockContainer35);
        compositeTitle21.setTitleContainer(blockContainer35);
        double double38 = blockContainer35.getContentXOffset();
        compositeTitle19.setTitleContainer(blockContainer35);
        boolean boolean40 = compositeTitle0.equals((java.lang.Object) compositeTitle19);
        double double41 = compositeTitle19.getContentYOffset();
        java.lang.String str42 = compositeTitle19.getID();
        compositeTitle19.setVisible(false);
        org.jfree.chart.title.CompositeTitle compositeTitle45 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str46 = compositeTitle45.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge47 = compositeTitle45.getPosition();
        boolean boolean48 = compositeTitle45.getNotify();
        java.lang.String str49 = compositeTitle45.getID();
        compositeTitle45.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        double double55 = compositeTitle45.getWidth();
        compositeTitle45.setVisible(true);
        boolean boolean58 = compositeTitle45.visible;
        boolean boolean59 = compositeTitle45.isVisible();
        compositeTitle45.visible = false;
        org.jfree.chart.block.BlockContainer blockContainer62 = compositeTitle45.getContainer();
        compositeTitle19.setTitleContainer(blockContainer62);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + rectangleEdge12 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge12.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(rectangle2D14);
        org.junit.Assert.assertNotNull(rectangle2D16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(blockContainer23);
        org.junit.Assert.assertTrue("'" + verticalAlignment24 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment24.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(blockContainer27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(blockContainer31);
        org.junit.Assert.assertTrue("'" + verticalAlignment32 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment32.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(blockContainer35);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + rectangleEdge47 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge47.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(blockContainer62);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test577");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment3 = compositeTitle0.getVerticalAlignment();
        boolean boolean4 = compositeTitle0.isVisible();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertTrue("'" + verticalAlignment3 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment3.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test578");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        compositeTitle0.setVisible(false);
        double double3 = compositeTitle0.getContentYOffset();
        compositeTitle0.setVisible(false);
        org.jfree.chart.title.CompositeTitle compositeTitle6 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str7 = compositeTitle6.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge8 = compositeTitle6.getPosition();
        boolean boolean9 = compositeTitle6.getNotify();
        java.lang.String str10 = compositeTitle6.getID();
        org.jfree.chart.title.CompositeTitle compositeTitle11 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str12 = compositeTitle11.getID();
        org.jfree.chart.block.BlockContainer blockContainer13 = compositeTitle11.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment14 = compositeTitle11.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle15 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str16 = compositeTitle15.getID();
        org.jfree.chart.block.BlockContainer blockContainer17 = compositeTitle15.getContainer();
        compositeTitle11.setTitleContainer(blockContainer17);
        org.jfree.chart.title.CompositeTitle compositeTitle19 = new org.jfree.chart.title.CompositeTitle(blockContainer17);
        org.jfree.chart.title.CompositeTitle compositeTitle20 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str21 = compositeTitle20.getID();
        org.jfree.chart.block.BlockContainer blockContainer22 = compositeTitle20.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment23 = compositeTitle20.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle24 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str25 = compositeTitle24.getID();
        org.jfree.chart.block.BlockContainer blockContainer26 = compositeTitle24.getContainer();
        compositeTitle20.setTitleContainer(blockContainer26);
        org.jfree.chart.title.CompositeTitle compositeTitle28 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str29 = compositeTitle28.getID();
        org.jfree.chart.block.BlockContainer blockContainer30 = compositeTitle28.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment31 = compositeTitle28.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle32 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str33 = compositeTitle32.getID();
        org.jfree.chart.block.BlockContainer blockContainer34 = compositeTitle32.getContainer();
        compositeTitle28.setTitleContainer(blockContainer34);
        compositeTitle20.setTitleContainer(blockContainer34);
        compositeTitle19.setTitleContainer(blockContainer34);
        org.jfree.chart.api.RectangleEdge rectangleEdge38 = compositeTitle19.getPosition();
        compositeTitle6.setPosition(rectangleEdge38);
        compositeTitle0.setPosition(rectangleEdge38);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + rectangleEdge8 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge8.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(blockContainer13);
        org.junit.Assert.assertTrue("'" + verticalAlignment14 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment14.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(blockContainer17);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(blockContainer22);
        org.junit.Assert.assertTrue("'" + verticalAlignment23 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment23.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(blockContainer26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(blockContainer30);
        org.junit.Assert.assertTrue("'" + verticalAlignment31 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment31.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(blockContainer34);
        org.junit.Assert.assertTrue("'" + rectangleEdge38 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge38.equals(org.jfree.chart.api.RectangleEdge.TOP));
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test579");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment3 = compositeTitle0.getVerticalAlignment();
        org.jfree.chart.api.RectangleEdge rectangleEdge4 = compositeTitle0.getPosition();
        org.jfree.chart.title.CompositeTitle compositeTitle5 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str6 = compositeTitle5.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge7 = compositeTitle5.getPosition();
        boolean boolean8 = compositeTitle5.getNotify();
        double double9 = compositeTitle5.getWidth();
        org.jfree.chart.event.TitleChangeListener titleChangeListener10 = null;
        compositeTitle5.removeChangeListener(titleChangeListener10);
        org.jfree.chart.title.CompositeTitle compositeTitle12 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str13 = compositeTitle12.getID();
        org.jfree.chart.block.BlockContainer blockContainer14 = compositeTitle12.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment15 = compositeTitle12.getVerticalAlignment();
        org.jfree.chart.api.VerticalAlignment verticalAlignment16 = compositeTitle12.getVerticalAlignment();
        java.awt.Paint paint17 = null;
        compositeTitle12.setBackgroundPaint(paint17);
        org.jfree.chart.api.RectangleInsets rectangleInsets19 = compositeTitle12.getPadding();
        compositeTitle5.setMargin(rectangleInsets19);
        compositeTitle0.setMargin(rectangleInsets19);
        org.jfree.chart.title.CompositeTitle compositeTitle22 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str23 = compositeTitle22.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge24 = compositeTitle22.getPosition();
        boolean boolean25 = compositeTitle22.getNotify();
        double double26 = compositeTitle22.getWidth();
        org.jfree.chart.event.TitleChangeListener titleChangeListener27 = null;
        compositeTitle22.removeChangeListener(titleChangeListener27);
        org.jfree.chart.title.CompositeTitle compositeTitle29 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str30 = compositeTitle29.getID();
        org.jfree.chart.block.BlockContainer blockContainer31 = compositeTitle29.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment32 = compositeTitle29.getVerticalAlignment();
        org.jfree.chart.api.VerticalAlignment verticalAlignment33 = compositeTitle29.getVerticalAlignment();
        java.awt.Paint paint34 = null;
        compositeTitle29.setBackgroundPaint(paint34);
        org.jfree.chart.api.RectangleInsets rectangleInsets36 = compositeTitle29.getPadding();
        compositeTitle22.setMargin(rectangleInsets36);
        compositeTitle0.setPadding(rectangleInsets36);
        java.lang.Object obj39 = compositeTitle0.clone();
        org.jfree.chart.block.BlockContainer blockContainer40 = compositeTitle0.getContainer();
        java.awt.Paint paint41 = compositeTitle0.getBackgroundPaint();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertTrue("'" + verticalAlignment3 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment3.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + rectangleEdge4 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge4.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + rectangleEdge7 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge7.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(blockContainer14);
        org.junit.Assert.assertTrue("'" + verticalAlignment15 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment15.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + verticalAlignment16 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment16.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + rectangleEdge24 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge24.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(blockContainer31);
        org.junit.Assert.assertTrue("'" + verticalAlignment32 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment32.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + verticalAlignment33 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment33.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNotNull(rectangleInsets36);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(blockContainer40);
        org.junit.Assert.assertNull(paint41);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test580");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.awt.geom.Rectangle2D rectangle2D4 = compositeTitle0.getBounds();
        compositeTitle0.setNotify(false);
        org.jfree.chart.block.BlockFrame blockFrame7 = compositeTitle0.getFrame();
        compositeTitle0.setHeight((double) (short) 0);
        org.jfree.chart.title.CompositeTitle compositeTitle10 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str11 = compositeTitle10.getID();
        org.jfree.chart.block.BlockContainer blockContainer12 = compositeTitle10.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment13 = compositeTitle10.getVerticalAlignment();
        org.jfree.chart.api.RectangleEdge rectangleEdge14 = compositeTitle10.getPosition();
        org.jfree.chart.title.CompositeTitle compositeTitle15 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str16 = compositeTitle15.getID();
        org.jfree.chart.block.BlockContainer blockContainer17 = compositeTitle15.getContainer();
        compositeTitle15.setPadding(0.0d, (double) 1L, (double) 10L, (double) (short) 0);
        compositeTitle15.setPadding((double) 10L, (double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        org.jfree.chart.api.RectangleInsets rectangleInsets28 = compositeTitle15.getMargin();
        org.jfree.chart.event.TitleChangeListener titleChangeListener29 = null;
        compositeTitle15.removeChangeListener(titleChangeListener29);
        org.jfree.chart.api.HorizontalAlignment horizontalAlignment31 = compositeTitle15.getHorizontalAlignment();
        compositeTitle10.setHorizontalAlignment(horizontalAlignment31);
        boolean boolean33 = compositeTitle0.equals((java.lang.Object) horizontalAlignment31);
        java.lang.Class<?> wildcardClass34 = compositeTitle0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(rectangle2D4);
        org.junit.Assert.assertNotNull(blockFrame7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(blockContainer12);
        org.junit.Assert.assertTrue("'" + verticalAlignment13 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment13.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + rectangleEdge14 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge14.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(blockContainer17);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertTrue("'" + horizontalAlignment31 + "' != '" + org.jfree.chart.api.HorizontalAlignment.CENTER + "'", horizontalAlignment31.equals(org.jfree.chart.api.HorizontalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test581");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        compositeTitle0.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        org.jfree.chart.api.HorizontalAlignment horizontalAlignment10 = org.jfree.chart.title.Title.DEFAULT_HORIZONTAL_ALIGNMENT;
        compositeTitle0.setHorizontalAlignment(horizontalAlignment10);
        org.jfree.chart.title.CompositeTitle compositeTitle12 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str13 = compositeTitle12.getID();
        org.jfree.chart.block.BlockContainer blockContainer14 = compositeTitle12.getContainer();
        compositeTitle12.setPadding(0.0d, (double) 1L, (double) 10L, (double) (short) 0);
        compositeTitle12.setPadding((double) 10L, (double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        org.jfree.chart.api.RectangleInsets rectangleInsets25 = compositeTitle12.getMargin();
        compositeTitle0.setMargin(rectangleInsets25);
        org.jfree.chart.title.CompositeTitle compositeTitle27 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str28 = compositeTitle27.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge29 = compositeTitle27.getPosition();
        boolean boolean30 = compositeTitle27.getNotify();
        java.lang.String str31 = compositeTitle27.getID();
        compositeTitle27.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        org.jfree.chart.title.CompositeTitle compositeTitle37 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str38 = compositeTitle37.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge39 = compositeTitle37.getPosition();
        boolean boolean40 = compositeTitle37.getNotify();
        java.awt.geom.Rectangle2D rectangle2D41 = compositeTitle37.getBounds();
        compositeTitle27.setBounds(rectangle2D41);
        org.jfree.chart.block.BlockContainer blockContainer43 = compositeTitle27.getContainer();
        compositeTitle0.setTitleContainer(blockContainer43);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + horizontalAlignment10 + "' != '" + org.jfree.chart.api.HorizontalAlignment.CENTER + "'", horizontalAlignment10.equals(org.jfree.chart.api.HorizontalAlignment.CENTER));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(blockContainer14);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + rectangleEdge29 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge29.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + rectangleEdge39 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge39.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(rectangle2D41);
        org.junit.Assert.assertNotNull(blockContainer43);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test582");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        org.jfree.chart.title.CompositeTitle compositeTitle3 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str4 = compositeTitle3.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge5 = compositeTitle3.getPosition();
        compositeTitle0.setPosition(rectangleEdge5);
        java.lang.Object obj7 = compositeTitle0.clone();
        double double8 = compositeTitle0.getContentYOffset();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + rectangleEdge5 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge5.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test583");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        boolean boolean1 = compositeTitle0.getNotify();
        java.awt.Paint paint2 = compositeTitle0.getBackgroundPaint();
        org.jfree.chart.event.TitleChangeListener titleChangeListener3 = null;
        compositeTitle0.addChangeListener(titleChangeListener3);
        double double5 = compositeTitle0.getHeight();
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.block.Size2D size2D7 = compositeTitle0.arrange(graphics2D6);
        org.jfree.chart.title.CompositeTitle compositeTitle8 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str9 = compositeTitle8.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge10 = compositeTitle8.getPosition();
        boolean boolean11 = compositeTitle8.getNotify();
        java.lang.String str12 = compositeTitle8.getID();
        compositeTitle8.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        double double18 = compositeTitle8.getWidth();
        compositeTitle8.setVisible(true);
        boolean boolean21 = compositeTitle8.visible;
        boolean boolean22 = compositeTitle8.isVisible();
        org.jfree.chart.block.BlockFrame blockFrame23 = compositeTitle8.getFrame();
        org.jfree.chart.block.BlockContainer blockContainer24 = compositeTitle8.getContainer();
        org.jfree.chart.title.CompositeTitle compositeTitle25 = new org.jfree.chart.title.CompositeTitle(blockContainer24);
        org.jfree.chart.title.CompositeTitle compositeTitle26 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str27 = compositeTitle26.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge28 = compositeTitle26.getPosition();
        boolean boolean29 = compositeTitle26.getNotify();
        java.lang.String str30 = compositeTitle26.getID();
        compositeTitle26.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        org.jfree.chart.title.CompositeTitle compositeTitle36 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str37 = compositeTitle36.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge38 = compositeTitle36.getPosition();
        boolean boolean39 = compositeTitle36.getNotify();
        java.awt.geom.Rectangle2D rectangle2D40 = compositeTitle36.getBounds();
        compositeTitle26.setBounds(rectangle2D40);
        org.jfree.chart.api.RectangleInsets rectangleInsets42 = compositeTitle26.getPadding();
        blockContainer24.setPadding(rectangleInsets42);
        compositeTitle0.setMargin(rectangleInsets42);
        java.awt.Graphics2D graphics2D45 = null;
        org.jfree.chart.title.CompositeTitle compositeTitle46 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str47 = compositeTitle46.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge48 = compositeTitle46.getPosition();
        boolean boolean49 = compositeTitle46.getNotify();
        java.lang.String str50 = compositeTitle46.getID();
        compositeTitle46.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        org.jfree.chart.title.CompositeTitle compositeTitle56 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str57 = compositeTitle56.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge58 = compositeTitle56.getPosition();
        boolean boolean59 = compositeTitle56.getNotify();
        java.awt.geom.Rectangle2D rectangle2D60 = compositeTitle56.getBounds();
        compositeTitle46.setBounds(rectangle2D60);
        org.jfree.chart.block.BlockContainer blockContainer62 = compositeTitle46.getContainer();
        org.jfree.chart.api.RectangleEdge rectangleEdge63 = compositeTitle46.getPosition();
        java.awt.geom.Rectangle2D rectangle2D64 = compositeTitle46.getBounds();
        org.jfree.chart.title.CompositeTitle compositeTitle65 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str66 = compositeTitle65.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge67 = compositeTitle65.getPosition();
        boolean boolean68 = compositeTitle65.getNotify();
        java.lang.String str69 = compositeTitle65.getID();
        org.jfree.chart.api.VerticalAlignment verticalAlignment70 = compositeTitle65.getVerticalAlignment();
        org.jfree.chart.api.HorizontalAlignment horizontalAlignment71 = compositeTitle65.getHorizontalAlignment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj72 = compositeTitle0.draw(graphics2D45, rectangle2D64, (java.lang.Object) horizontalAlignment71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics2D.setPaint(java.awt.Paint)\" because \"g2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + rectangleEdge10 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge10.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(blockFrame23);
        org.junit.Assert.assertNotNull(blockContainer24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + rectangleEdge28 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge28.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + rectangleEdge38 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge38.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(rectangle2D40);
        org.junit.Assert.assertNotNull(rectangleInsets42);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + rectangleEdge48 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge48.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + rectangleEdge58 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge58.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(rectangle2D60);
        org.junit.Assert.assertNotNull(blockContainer62);
        org.junit.Assert.assertTrue("'" + rectangleEdge63 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge63.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertNotNull(rectangle2D64);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertTrue("'" + rectangleEdge67 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge67.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertTrue("'" + verticalAlignment70 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment70.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + horizontalAlignment71 + "' != '" + org.jfree.chart.api.HorizontalAlignment.CENTER + "'", horizontalAlignment71.equals(org.jfree.chart.api.HorizontalAlignment.CENTER));
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test584");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        org.jfree.chart.event.TitleChangeListener titleChangeListener3 = null;
        compositeTitle0.addChangeListener(titleChangeListener3);
        org.jfree.chart.api.RectangleInsets rectangleInsets5 = compositeTitle0.getMargin();
        org.jfree.chart.block.BlockFrame blockFrame6 = compositeTitle0.getFrame();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(blockFrame6);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test585");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        org.jfree.chart.title.CompositeTitle compositeTitle1 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str2 = compositeTitle1.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge3 = compositeTitle1.getPosition();
        boolean boolean4 = compositeTitle1.getNotify();
        java.lang.String str5 = compositeTitle1.getID();
        compositeTitle1.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        double double11 = compositeTitle1.getWidth();
        compositeTitle1.setVisible(true);
        boolean boolean14 = compositeTitle1.visible;
        org.jfree.chart.api.VerticalAlignment verticalAlignment15 = compositeTitle1.getVerticalAlignment();
        compositeTitle0.setVerticalAlignment(verticalAlignment15);
        boolean boolean17 = compositeTitle0.isVisible();
        org.jfree.chart.api.VerticalAlignment verticalAlignment18 = compositeTitle0.getVerticalAlignment();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + rectangleEdge3 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge3.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + verticalAlignment15 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment15.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + verticalAlignment18 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment18.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test586");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        compositeTitle0.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        double double10 = compositeTitle0.getWidth();
        compositeTitle0.setVisible(true);
        boolean boolean13 = compositeTitle0.visible;
        boolean boolean14 = compositeTitle0.isVisible();
        org.jfree.chart.block.BlockFrame blockFrame15 = compositeTitle0.getFrame();
        org.jfree.chart.block.BlockContainer blockContainer16 = compositeTitle0.getContainer();
        org.jfree.chart.title.CompositeTitle compositeTitle17 = new org.jfree.chart.title.CompositeTitle(blockContainer16);
        org.jfree.chart.title.CompositeTitle compositeTitle18 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str19 = compositeTitle18.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge20 = compositeTitle18.getPosition();
        boolean boolean21 = compositeTitle18.getNotify();
        java.lang.String str22 = compositeTitle18.getID();
        compositeTitle18.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        org.jfree.chart.title.CompositeTitle compositeTitle28 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str29 = compositeTitle28.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge30 = compositeTitle28.getPosition();
        boolean boolean31 = compositeTitle28.getNotify();
        java.awt.geom.Rectangle2D rectangle2D32 = compositeTitle28.getBounds();
        compositeTitle18.setBounds(rectangle2D32);
        org.jfree.chart.api.RectangleInsets rectangleInsets34 = compositeTitle18.getPadding();
        blockContainer16.setPadding(rectangleInsets34);
        org.jfree.chart.title.CompositeTitle compositeTitle36 = new org.jfree.chart.title.CompositeTitle(blockContainer16);
        compositeTitle36.setBorder((double) 10.0f, 10.0d, 0.0d, (double) '4');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(blockFrame15);
        org.junit.Assert.assertNotNull(blockContainer16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + rectangleEdge20 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge20.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + rectangleEdge30 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge30.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(rectangle2D32);
        org.junit.Assert.assertNotNull(rectangleInsets34);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test587");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        compositeTitle0.setPadding(0.0d, (double) 1L, (double) 10L, (double) (short) 0);
        compositeTitle0.setWidth((double) (short) 0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test588");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        org.jfree.chart.title.CompositeTitle compositeTitle3 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str4 = compositeTitle3.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge5 = compositeTitle3.getPosition();
        compositeTitle0.setPosition(rectangleEdge5);
        org.jfree.chart.title.CompositeTitle compositeTitle7 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str8 = compositeTitle7.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge9 = compositeTitle7.getPosition();
        boolean boolean10 = compositeTitle7.getNotify();
        java.lang.String str11 = compositeTitle7.getID();
        compositeTitle7.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        double double17 = compositeTitle7.getWidth();
        compositeTitle7.setVisible(true);
        boolean boolean20 = compositeTitle7.visible;
        org.jfree.chart.title.CompositeTitle compositeTitle21 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str22 = compositeTitle21.getID();
        org.jfree.chart.block.BlockContainer blockContainer23 = compositeTitle21.getContainer();
        compositeTitle21.setPadding(0.0d, (double) 1L, (double) 10L, (double) (short) 0);
        compositeTitle21.setPadding((double) 10L, (double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        org.jfree.chart.block.BlockFrame blockFrame34 = compositeTitle21.getFrame();
        compositeTitle7.setFrame(blockFrame34);
        compositeTitle0.setFrame(blockFrame34);
        org.jfree.chart.title.CompositeTitle compositeTitle37 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str38 = compositeTitle37.getID();
        org.jfree.chart.block.BlockContainer blockContainer39 = compositeTitle37.getContainer();
        org.jfree.chart.title.CompositeTitle compositeTitle40 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str41 = compositeTitle40.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge42 = compositeTitle40.getPosition();
        compositeTitle37.setPosition(rectangleEdge42);
        org.jfree.chart.title.CompositeTitle compositeTitle44 = new org.jfree.chart.title.CompositeTitle();
        compositeTitle44.setMargin((double) 1.0f, 0.0d, (double) 10, (double) (byte) 1);
        org.jfree.chart.title.CompositeTitle compositeTitle50 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str51 = compositeTitle50.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge52 = compositeTitle50.getPosition();
        boolean boolean53 = compositeTitle50.getNotify();
        java.lang.String str54 = compositeTitle50.getID();
        compositeTitle50.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        double double60 = compositeTitle50.getWidth();
        compositeTitle50.setVisible(true);
        org.jfree.chart.title.CompositeTitle compositeTitle63 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str64 = compositeTitle63.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge65 = compositeTitle63.getPosition();
        boolean boolean66 = compositeTitle63.getNotify();
        java.lang.String str67 = compositeTitle63.getID();
        org.jfree.chart.api.VerticalAlignment verticalAlignment68 = compositeTitle63.getVerticalAlignment();
        compositeTitle63.visible = true;
        org.jfree.chart.api.VerticalAlignment verticalAlignment71 = compositeTitle63.getVerticalAlignment();
        compositeTitle50.setVerticalAlignment(verticalAlignment71);
        compositeTitle44.setVerticalAlignment(verticalAlignment71);
        org.jfree.chart.api.VerticalAlignment verticalAlignment74 = compositeTitle44.getVerticalAlignment();
        compositeTitle37.setVerticalAlignment(verticalAlignment74);
        compositeTitle0.setVerticalAlignment(verticalAlignment74);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + rectangleEdge5 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge5.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + rectangleEdge9 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge9.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(blockContainer23);
        org.junit.Assert.assertNotNull(blockFrame34);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(blockContainer39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + rectangleEdge42 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge42.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + rectangleEdge52 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge52.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertTrue("'" + rectangleEdge65 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge65.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertTrue("'" + verticalAlignment68 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment68.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + verticalAlignment71 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment71.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + verticalAlignment74 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment74.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test589");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        compositeTitle0.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        double double10 = compositeTitle0.getWidth();
        compositeTitle0.setVisible(true);
        boolean boolean13 = compositeTitle0.visible;
        boolean boolean14 = compositeTitle0.isVisible();
        org.jfree.chart.block.BlockFrame blockFrame15 = compositeTitle0.getFrame();
        org.jfree.chart.block.BlockContainer blockContainer16 = compositeTitle0.getContainer();
        org.jfree.chart.title.CompositeTitle compositeTitle17 = new org.jfree.chart.title.CompositeTitle(blockContainer16);
        org.jfree.chart.api.RectangleEdge rectangleEdge18 = compositeTitle17.getPosition();
        compositeTitle17.setHeight(35.0d);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(blockFrame15);
        org.junit.Assert.assertNotNull(blockContainer16);
        org.junit.Assert.assertTrue("'" + rectangleEdge18 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge18.equals(org.jfree.chart.api.RectangleEdge.TOP));
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test590");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        compositeTitle0.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        org.jfree.chart.title.CompositeTitle compositeTitle10 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str11 = compositeTitle10.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge12 = compositeTitle10.getPosition();
        boolean boolean13 = compositeTitle10.getNotify();
        java.awt.geom.Rectangle2D rectangle2D14 = compositeTitle10.getBounds();
        compositeTitle0.setBounds(rectangle2D14);
        org.jfree.chart.event.TitleChangeListener titleChangeListener16 = null;
        compositeTitle0.removeChangeListener(titleChangeListener16);
        org.jfree.chart.api.RectangleInsets rectangleInsets18 = compositeTitle0.getPadding();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + rectangleEdge12 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge12.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(rectangle2D14);
        org.junit.Assert.assertNotNull(rectangleInsets18);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test591");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        org.jfree.chart.api.HorizontalAlignment horizontalAlignment5 = compositeTitle0.getHorizontalAlignment();
        boolean boolean6 = compositeTitle0.isVisible();
        boolean boolean7 = compositeTitle0.isVisible();
        compositeTitle0.setMargin((double) 0L, (double) 'a', (double) 100.0f, (double) (byte) 10);
        compositeTitle0.setBorder(100.0d, 101.0d, 2.0d, (double) '4');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + horizontalAlignment5 + "' != '" + org.jfree.chart.api.HorizontalAlignment.CENTER + "'", horizontalAlignment5.equals(org.jfree.chart.api.HorizontalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test592");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment3 = compositeTitle0.getVerticalAlignment();
        org.jfree.chart.api.RectangleEdge rectangleEdge4 = compositeTitle0.getPosition();
        org.jfree.chart.title.CompositeTitle compositeTitle5 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str6 = compositeTitle5.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge7 = compositeTitle5.getPosition();
        boolean boolean8 = compositeTitle5.getNotify();
        double double9 = compositeTitle5.getWidth();
        org.jfree.chart.event.TitleChangeListener titleChangeListener10 = null;
        compositeTitle5.removeChangeListener(titleChangeListener10);
        org.jfree.chart.title.CompositeTitle compositeTitle12 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str13 = compositeTitle12.getID();
        org.jfree.chart.block.BlockContainer blockContainer14 = compositeTitle12.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment15 = compositeTitle12.getVerticalAlignment();
        org.jfree.chart.api.VerticalAlignment verticalAlignment16 = compositeTitle12.getVerticalAlignment();
        java.awt.Paint paint17 = null;
        compositeTitle12.setBackgroundPaint(paint17);
        org.jfree.chart.api.RectangleInsets rectangleInsets19 = compositeTitle12.getPadding();
        compositeTitle5.setMargin(rectangleInsets19);
        compositeTitle0.setMargin(rectangleInsets19);
        org.jfree.chart.title.CompositeTitle compositeTitle22 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str23 = compositeTitle22.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge24 = compositeTitle22.getPosition();
        boolean boolean25 = compositeTitle22.getNotify();
        double double26 = compositeTitle22.getWidth();
        org.jfree.chart.event.TitleChangeListener titleChangeListener27 = null;
        compositeTitle22.removeChangeListener(titleChangeListener27);
        org.jfree.chart.title.CompositeTitle compositeTitle29 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str30 = compositeTitle29.getID();
        org.jfree.chart.block.BlockContainer blockContainer31 = compositeTitle29.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment32 = compositeTitle29.getVerticalAlignment();
        org.jfree.chart.api.VerticalAlignment verticalAlignment33 = compositeTitle29.getVerticalAlignment();
        java.awt.Paint paint34 = null;
        compositeTitle29.setBackgroundPaint(paint34);
        org.jfree.chart.api.RectangleInsets rectangleInsets36 = compositeTitle29.getPadding();
        compositeTitle22.setMargin(rectangleInsets36);
        compositeTitle0.setPadding(rectangleInsets36);
        org.jfree.chart.block.BlockContainer blockContainer39 = compositeTitle0.getContainer();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertTrue("'" + verticalAlignment3 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment3.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + rectangleEdge4 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge4.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + rectangleEdge7 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge7.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(blockContainer14);
        org.junit.Assert.assertTrue("'" + verticalAlignment15 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment15.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + verticalAlignment16 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment16.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + rectangleEdge24 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge24.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(blockContainer31);
        org.junit.Assert.assertTrue("'" + verticalAlignment32 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment32.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + verticalAlignment33 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment33.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNotNull(rectangleInsets36);
        org.junit.Assert.assertNotNull(blockContainer39);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test593");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment3 = compositeTitle0.getVerticalAlignment();
        org.jfree.chart.api.VerticalAlignment verticalAlignment4 = compositeTitle0.getVerticalAlignment();
        boolean boolean5 = compositeTitle0.isVisible();
        org.jfree.chart.event.TitleChangeListener titleChangeListener6 = null;
        compositeTitle0.addChangeListener(titleChangeListener6);
        compositeTitle0.setBorder((double) 1, (double) 10.0f, (double) 10.0f, 0.0d);
        org.jfree.chart.title.CompositeTitle compositeTitle13 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str14 = compositeTitle13.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge15 = compositeTitle13.getPosition();
        boolean boolean16 = compositeTitle13.getNotify();
        java.lang.String str17 = compositeTitle13.getID();
        compositeTitle13.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        org.jfree.chart.title.CompositeTitle compositeTitle23 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str24 = compositeTitle23.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge25 = compositeTitle23.getPosition();
        boolean boolean26 = compositeTitle23.getNotify();
        java.awt.geom.Rectangle2D rectangle2D27 = compositeTitle23.getBounds();
        compositeTitle13.setBounds(rectangle2D27);
        org.jfree.chart.block.BlockContainer blockContainer29 = compositeTitle13.getContainer();
        org.jfree.chart.api.RectangleEdge rectangleEdge30 = compositeTitle13.getPosition();
        java.lang.Object obj31 = compositeTitle13.clone();
        org.jfree.chart.api.HorizontalAlignment horizontalAlignment32 = compositeTitle13.getHorizontalAlignment();
        compositeTitle0.setHorizontalAlignment(horizontalAlignment32);
        double double34 = compositeTitle0.getHeight();
        org.jfree.chart.block.BlockFrame blockFrame35 = compositeTitle0.getFrame();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertTrue("'" + verticalAlignment3 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment3.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + verticalAlignment4 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment4.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + rectangleEdge15 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge15.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + rectangleEdge25 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge25.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(rectangle2D27);
        org.junit.Assert.assertNotNull(blockContainer29);
        org.junit.Assert.assertTrue("'" + rectangleEdge30 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge30.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + horizontalAlignment32 + "' != '" + org.jfree.chart.api.HorizontalAlignment.CENTER + "'", horizontalAlignment32.equals(org.jfree.chart.api.HorizontalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(blockFrame35);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test594");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment3 = compositeTitle0.getVerticalAlignment();
        org.jfree.chart.api.RectangleEdge rectangleEdge4 = compositeTitle0.getPosition();
        compositeTitle0.setMargin((double) 0L, (double) 0, (double) 0.0f, (double) (byte) 0);
        java.awt.Paint paint10 = compositeTitle0.getBackgroundPaint();
        org.jfree.chart.title.CompositeTitle compositeTitle11 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str12 = compositeTitle11.getID();
        org.jfree.chart.block.BlockContainer blockContainer13 = compositeTitle11.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment14 = compositeTitle11.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle15 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str16 = compositeTitle15.getID();
        org.jfree.chart.block.BlockContainer blockContainer17 = compositeTitle15.getContainer();
        compositeTitle11.setTitleContainer(blockContainer17);
        org.jfree.chart.title.CompositeTitle compositeTitle19 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str20 = compositeTitle19.getID();
        org.jfree.chart.block.BlockContainer blockContainer21 = compositeTitle19.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment22 = compositeTitle19.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle23 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str24 = compositeTitle23.getID();
        org.jfree.chart.block.BlockContainer blockContainer25 = compositeTitle23.getContainer();
        compositeTitle19.setTitleContainer(blockContainer25);
        compositeTitle11.setTitleContainer(blockContainer25);
        double double28 = blockContainer25.getContentYOffset();
        java.awt.geom.Rectangle2D rectangle2D29 = blockContainer25.getBounds();
        compositeTitle0.setBounds(rectangle2D29);
        org.jfree.chart.event.TitleChangeListener titleChangeListener31 = null;
        compositeTitle0.addChangeListener(titleChangeListener31);
        compositeTitle0.setMargin((double) 100.0f, (double) '#', (double) 100.0f, (double) 1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertTrue("'" + verticalAlignment3 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment3.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + rectangleEdge4 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge4.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertNull(paint10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(blockContainer13);
        org.junit.Assert.assertTrue("'" + verticalAlignment14 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment14.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(blockContainer17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(blockContainer21);
        org.junit.Assert.assertTrue("'" + verticalAlignment22 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment22.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(blockContainer25);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(rectangle2D29);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test595");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        compositeTitle0.setPadding(0.0d, (double) 1L, (double) 10L, (double) (short) 0);
        compositeTitle0.setPadding((double) 10L, (double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        org.jfree.chart.api.RectangleInsets rectangleInsets13 = compositeTitle0.getMargin();
        org.jfree.chart.title.CompositeTitle compositeTitle14 = new org.jfree.chart.title.CompositeTitle();
        compositeTitle14.setMargin((double) 1.0f, 0.0d, (double) 10, (double) (byte) 1);
        org.jfree.chart.title.CompositeTitle compositeTitle20 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str21 = compositeTitle20.getID();
        org.jfree.chart.block.BlockContainer blockContainer22 = compositeTitle20.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment23 = compositeTitle20.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle24 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str25 = compositeTitle24.getID();
        org.jfree.chart.block.BlockContainer blockContainer26 = compositeTitle24.getContainer();
        compositeTitle20.setTitleContainer(blockContainer26);
        org.jfree.chart.title.CompositeTitle compositeTitle28 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str29 = compositeTitle28.getID();
        org.jfree.chart.block.BlockContainer blockContainer30 = compositeTitle28.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment31 = compositeTitle28.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle32 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str33 = compositeTitle32.getID();
        org.jfree.chart.block.BlockContainer blockContainer34 = compositeTitle32.getContainer();
        compositeTitle28.setTitleContainer(blockContainer34);
        compositeTitle20.setTitleContainer(blockContainer34);
        org.jfree.chart.title.CompositeTitle compositeTitle37 = new org.jfree.chart.title.CompositeTitle(blockContainer34);
        org.jfree.chart.title.CompositeTitle compositeTitle38 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str39 = compositeTitle38.getID();
        org.jfree.chart.block.BlockContainer blockContainer40 = compositeTitle38.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment41 = compositeTitle38.getVerticalAlignment();
        org.jfree.chart.api.RectangleEdge rectangleEdge42 = compositeTitle38.getPosition();
        boolean boolean43 = compositeTitle37.equals((java.lang.Object) rectangleEdge42);
        compositeTitle14.setPosition(rectangleEdge42);
        java.awt.Paint paint45 = null;
        compositeTitle14.setBackgroundPaint(paint45);
        org.jfree.chart.title.CompositeTitle compositeTitle47 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str48 = compositeTitle47.getID();
        org.jfree.chart.block.BlockContainer blockContainer49 = compositeTitle47.getContainer();
        compositeTitle47.setPadding(0.0d, (double) 1L, (double) 10L, (double) (short) 0);
        compositeTitle47.setPadding((double) 10L, (double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        org.jfree.chart.block.BlockFrame blockFrame60 = compositeTitle47.getFrame();
        compositeTitle14.setFrame(blockFrame60);
        compositeTitle0.setFrame(blockFrame60);
        org.jfree.chart.event.TitleChangeListener titleChangeListener63 = null;
        compositeTitle0.addChangeListener(titleChangeListener63);
        java.awt.Graphics2D graphics2D65 = null;
        org.jfree.chart.title.CompositeTitle compositeTitle66 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str67 = compositeTitle66.getID();
        org.jfree.chart.block.BlockContainer blockContainer68 = compositeTitle66.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment69 = compositeTitle66.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle70 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str71 = compositeTitle70.getID();
        org.jfree.chart.block.BlockContainer blockContainer72 = compositeTitle70.getContainer();
        compositeTitle66.setTitleContainer(blockContainer72);
        org.jfree.chart.title.CompositeTitle compositeTitle74 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str75 = compositeTitle74.getID();
        org.jfree.chart.block.BlockContainer blockContainer76 = compositeTitle74.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment77 = compositeTitle74.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle78 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str79 = compositeTitle78.getID();
        org.jfree.chart.block.BlockContainer blockContainer80 = compositeTitle78.getContainer();
        compositeTitle74.setTitleContainer(blockContainer80);
        compositeTitle66.setTitleContainer(blockContainer80);
        double double83 = blockContainer80.getContentYOffset();
        java.awt.geom.Rectangle2D rectangle2D84 = blockContainer80.getBounds();
        // The following exception was thrown during execution in test generation
        try {
            compositeTitle0.draw(graphics2D65, rectangle2D84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics2D.setPaint(java.awt.Paint)\" because \"g2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(blockContainer22);
        org.junit.Assert.assertTrue("'" + verticalAlignment23 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment23.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(blockContainer26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(blockContainer30);
        org.junit.Assert.assertTrue("'" + verticalAlignment31 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment31.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(blockContainer34);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(blockContainer40);
        org.junit.Assert.assertTrue("'" + verticalAlignment41 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment41.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + rectangleEdge42 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge42.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(blockContainer49);
        org.junit.Assert.assertNotNull(blockFrame60);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(blockContainer68);
        org.junit.Assert.assertTrue("'" + verticalAlignment69 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment69.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(blockContainer72);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNotNull(blockContainer76);
        org.junit.Assert.assertTrue("'" + verticalAlignment77 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment77.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertNotNull(blockContainer80);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
        org.junit.Assert.assertNotNull(rectangle2D84);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test596");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        compositeTitle0.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        org.jfree.chart.title.CompositeTitle compositeTitle10 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str11 = compositeTitle10.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge12 = compositeTitle10.getPosition();
        boolean boolean13 = compositeTitle10.getNotify();
        java.awt.geom.Rectangle2D rectangle2D14 = compositeTitle10.getBounds();
        compositeTitle0.setBounds(rectangle2D14);
        org.jfree.chart.block.BlockContainer blockContainer16 = compositeTitle0.getContainer();
        org.jfree.chart.api.RectangleEdge rectangleEdge17 = compositeTitle0.getPosition();
        java.lang.Object obj18 = compositeTitle0.clone();
        org.jfree.chart.api.HorizontalAlignment horizontalAlignment19 = compositeTitle0.getHorizontalAlignment();
        org.jfree.chart.block.BlockContainer blockContainer20 = compositeTitle0.getContainer();
        compositeTitle0.setPadding(0.0d, (double) (-1L), (double) 1L, (double) 0L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + rectangleEdge12 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge12.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(rectangle2D14);
        org.junit.Assert.assertNotNull(blockContainer16);
        org.junit.Assert.assertTrue("'" + rectangleEdge17 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge17.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + horizontalAlignment19 + "' != '" + org.jfree.chart.api.HorizontalAlignment.CENTER + "'", horizontalAlignment19.equals(org.jfree.chart.api.HorizontalAlignment.CENTER));
        org.junit.Assert.assertNotNull(blockContainer20);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test597");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment3 = compositeTitle0.getVerticalAlignment();
        org.jfree.chart.api.VerticalAlignment verticalAlignment4 = compositeTitle0.getVerticalAlignment();
        boolean boolean5 = compositeTitle0.isVisible();
        org.jfree.chart.title.CompositeTitle compositeTitle6 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str7 = compositeTitle6.getID();
        org.jfree.chart.block.BlockContainer blockContainer8 = compositeTitle6.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment9 = compositeTitle6.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle10 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str11 = compositeTitle10.getID();
        org.jfree.chart.block.BlockContainer blockContainer12 = compositeTitle10.getContainer();
        compositeTitle6.setTitleContainer(blockContainer12);
        org.jfree.chart.title.CompositeTitle compositeTitle14 = new org.jfree.chart.title.CompositeTitle(blockContainer12);
        org.jfree.chart.title.CompositeTitle compositeTitle15 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str16 = compositeTitle15.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge17 = compositeTitle15.getPosition();
        boolean boolean18 = compositeTitle15.getNotify();
        java.lang.String str19 = compositeTitle15.getID();
        compositeTitle15.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        org.jfree.chart.title.CompositeTitle compositeTitle25 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str26 = compositeTitle25.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge27 = compositeTitle25.getPosition();
        boolean boolean28 = compositeTitle25.getNotify();
        java.awt.geom.Rectangle2D rectangle2D29 = compositeTitle25.getBounds();
        compositeTitle15.setBounds(rectangle2D29);
        org.jfree.chart.api.HorizontalAlignment horizontalAlignment31 = compositeTitle15.getHorizontalAlignment();
        compositeTitle14.setHorizontalAlignment(horizontalAlignment31);
        compositeTitle0.setHorizontalAlignment(horizontalAlignment31);
        org.jfree.chart.event.TitleChangeListener titleChangeListener34 = null;
        compositeTitle0.removeChangeListener(titleChangeListener34);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertTrue("'" + verticalAlignment3 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment3.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + verticalAlignment4 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment4.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(blockContainer8);
        org.junit.Assert.assertTrue("'" + verticalAlignment9 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment9.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(blockContainer12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + rectangleEdge17 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge17.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + rectangleEdge27 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge27.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(rectangle2D29);
        org.junit.Assert.assertTrue("'" + horizontalAlignment31 + "' != '" + org.jfree.chart.api.HorizontalAlignment.CENTER + "'", horizontalAlignment31.equals(org.jfree.chart.api.HorizontalAlignment.CENTER));
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test598");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        compositeTitle0.setMargin((double) 0L, (double) 100L, (double) 10L, (double) (short) -1);
        double double10 = compositeTitle0.getWidth();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test599");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        boolean boolean1 = compositeTitle0.getNotify();
        java.awt.Paint paint2 = compositeTitle0.getBackgroundPaint();
        org.jfree.chart.event.TitleChangeListener titleChangeListener3 = null;
        compositeTitle0.addChangeListener(titleChangeListener3);
        double double5 = compositeTitle0.getHeight();
        double double6 = compositeTitle0.getWidth();
        org.jfree.chart.title.CompositeTitle compositeTitle7 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str8 = compositeTitle7.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge9 = compositeTitle7.getPosition();
        boolean boolean10 = compositeTitle7.getNotify();
        java.lang.String str11 = compositeTitle7.getID();
        compositeTitle7.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        double double17 = compositeTitle7.getWidth();
        compositeTitle7.setVisible(true);
        boolean boolean20 = compositeTitle7.visible;
        org.jfree.chart.title.CompositeTitle compositeTitle21 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str22 = compositeTitle21.getID();
        org.jfree.chart.block.BlockContainer blockContainer23 = compositeTitle21.getContainer();
        compositeTitle21.setPadding(0.0d, (double) 1L, (double) 10L, (double) (short) 0);
        compositeTitle21.setPadding((double) 10L, (double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        org.jfree.chart.block.BlockFrame blockFrame34 = compositeTitle21.getFrame();
        compositeTitle7.setFrame(blockFrame34);
        org.jfree.chart.block.BlockContainer blockContainer36 = compositeTitle7.getContainer();
        java.awt.geom.Rectangle2D rectangle2D37 = blockContainer36.getBounds();
        compositeTitle0.setTitleContainer(blockContainer36);
        double double39 = blockContainer36.getWidth();
        blockContainer36.setBorder(10.0d, (double) '4', (double) (-1L), 32.0d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + rectangleEdge9 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge9.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(blockContainer23);
        org.junit.Assert.assertNotNull(blockFrame34);
        org.junit.Assert.assertNotNull(blockContainer36);
        org.junit.Assert.assertNotNull(rectangle2D37);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test600");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        boolean boolean1 = compositeTitle0.getNotify();
        org.jfree.chart.event.TitleChangeListener titleChangeListener2 = null;
        compositeTitle0.removeChangeListener(titleChangeListener2);
        double double4 = compositeTitle0.getHeight();
        org.jfree.chart.api.RectangleInsets rectangleInsets5 = compositeTitle0.getMargin();
        java.awt.Paint paint6 = null;
        compositeTitle0.setBackgroundPaint(paint6);
        org.jfree.chart.api.HorizontalAlignment horizontalAlignment8 = compositeTitle0.getHorizontalAlignment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + horizontalAlignment8 + "' != '" + org.jfree.chart.api.HorizontalAlignment.CENTER + "'", horizontalAlignment8.equals(org.jfree.chart.api.HorizontalAlignment.CENTER));
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test601");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment3 = compositeTitle0.getVerticalAlignment();
        org.jfree.chart.api.VerticalAlignment verticalAlignment4 = compositeTitle0.getVerticalAlignment();
        org.jfree.chart.event.TitleChangeListener titleChangeListener5 = null;
        compositeTitle0.addChangeListener(titleChangeListener5);
        compositeTitle0.setBorder(0.0d, (double) 1.0f, (double) (byte) -1, 1.0d);
        org.jfree.chart.title.CompositeTitle compositeTitle12 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str13 = compositeTitle12.getID();
        org.jfree.chart.block.BlockContainer blockContainer14 = compositeTitle12.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment15 = compositeTitle12.getVerticalAlignment();
        org.jfree.chart.api.VerticalAlignment verticalAlignment16 = compositeTitle12.getVerticalAlignment();
        org.jfree.chart.api.VerticalAlignment verticalAlignment17 = compositeTitle12.getVerticalAlignment();
        double double18 = compositeTitle12.getContentYOffset();
        compositeTitle12.setPadding((double) '#', (double) (short) 0, (double) 0.0f, (double) 10.0f);
        java.awt.geom.Rectangle2D rectangle2D24 = compositeTitle12.getBounds();
        compositeTitle0.setBounds(rectangle2D24);
        compositeTitle0.setNotify(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertTrue("'" + verticalAlignment3 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment3.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + verticalAlignment4 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment4.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(blockContainer14);
        org.junit.Assert.assertTrue("'" + verticalAlignment15 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment15.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + verticalAlignment16 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment16.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + verticalAlignment17 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment17.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertNotNull(rectangle2D24);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test602");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge5 = compositeTitle0.getPosition();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + rectangleEdge5 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge5.equals(org.jfree.chart.api.RectangleEdge.TOP));
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test603");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        boolean boolean1 = compositeTitle0.getNotify();
        org.jfree.chart.event.TitleChangeListener titleChangeListener2 = null;
        compositeTitle0.removeChangeListener(titleChangeListener2);
        double double4 = compositeTitle0.getHeight();
        org.jfree.chart.api.RectangleInsets rectangleInsets5 = compositeTitle0.getMargin();
        double double6 = compositeTitle0.getWidth();
        org.jfree.chart.title.CompositeTitle compositeTitle7 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str8 = compositeTitle7.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge9 = compositeTitle7.getPosition();
        boolean boolean10 = compositeTitle7.getNotify();
        java.lang.String str11 = compositeTitle7.getID();
        compositeTitle7.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        double double17 = compositeTitle7.getWidth();
        compositeTitle7.setVisible(true);
        boolean boolean20 = compositeTitle7.visible;
        boolean boolean21 = compositeTitle7.isVisible();
        org.jfree.chart.block.BlockFrame blockFrame22 = compositeTitle7.getFrame();
        org.jfree.chart.block.BlockContainer blockContainer23 = compositeTitle7.getContainer();
        org.jfree.chart.api.RectangleInsets rectangleInsets24 = blockContainer23.getPadding();
        double double25 = blockContainer23.getWidth();
        compositeTitle0.setTitleContainer(blockContainer23);
        java.awt.Paint paint27 = compositeTitle0.getBackgroundPaint();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + rectangleEdge9 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge9.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(blockFrame22);
        org.junit.Assert.assertNotNull(blockContainer23);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNull(paint27);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test604");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        compositeTitle0.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        org.jfree.chart.api.HorizontalAlignment horizontalAlignment10 = org.jfree.chart.title.Title.DEFAULT_HORIZONTAL_ALIGNMENT;
        compositeTitle0.setHorizontalAlignment(horizontalAlignment10);
        org.jfree.chart.title.CompositeTitle compositeTitle12 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str13 = compositeTitle12.getID();
        org.jfree.chart.block.BlockContainer blockContainer14 = compositeTitle12.getContainer();
        compositeTitle12.setPadding(0.0d, (double) 1L, (double) 10L, (double) (short) 0);
        compositeTitle12.setPadding((double) 10L, (double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        org.jfree.chart.api.RectangleInsets rectangleInsets25 = compositeTitle12.getMargin();
        compositeTitle0.setMargin(rectangleInsets25);
        org.jfree.chart.event.TitleChangeListener titleChangeListener27 = null;
        compositeTitle0.addChangeListener(titleChangeListener27);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + horizontalAlignment10 + "' != '" + org.jfree.chart.api.HorizontalAlignment.CENTER + "'", horizontalAlignment10.equals(org.jfree.chart.api.HorizontalAlignment.CENTER));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(blockContainer14);
        org.junit.Assert.assertNotNull(rectangleInsets25);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test605");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment3 = compositeTitle0.getVerticalAlignment();
        org.jfree.chart.api.VerticalAlignment verticalAlignment4 = compositeTitle0.getVerticalAlignment();
        boolean boolean5 = compositeTitle0.isVisible();
        org.jfree.chart.title.CompositeTitle compositeTitle6 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str7 = compositeTitle6.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge8 = compositeTitle6.getPosition();
        boolean boolean9 = compositeTitle6.getNotify();
        java.lang.String str10 = compositeTitle6.getID();
        compositeTitle6.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        double double16 = compositeTitle6.getWidth();
        compositeTitle6.setVisible(true);
        boolean boolean19 = compositeTitle6.visible;
        org.jfree.chart.title.CompositeTitle compositeTitle20 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str21 = compositeTitle20.getID();
        org.jfree.chart.block.BlockContainer blockContainer22 = compositeTitle20.getContainer();
        compositeTitle20.setPadding(0.0d, (double) 1L, (double) 10L, (double) (short) 0);
        compositeTitle20.setPadding((double) 10L, (double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        org.jfree.chart.block.BlockFrame blockFrame33 = compositeTitle20.getFrame();
        compositeTitle6.setFrame(blockFrame33);
        org.jfree.chart.block.BlockContainer blockContainer35 = compositeTitle6.getContainer();
        java.awt.geom.Rectangle2D rectangle2D36 = blockContainer35.getBounds();
        compositeTitle0.setBounds(rectangle2D36);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertTrue("'" + verticalAlignment3 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment3.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + verticalAlignment4 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment4.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + rectangleEdge8 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge8.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(blockContainer22);
        org.junit.Assert.assertNotNull(blockFrame33);
        org.junit.Assert.assertNotNull(blockContainer35);
        org.junit.Assert.assertNotNull(rectangle2D36);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test606");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        org.jfree.chart.api.HorizontalAlignment horizontalAlignment5 = compositeTitle0.getHorizontalAlignment();
        boolean boolean6 = compositeTitle0.isVisible();
        boolean boolean7 = compositeTitle0.isVisible();
        compositeTitle0.setHeight((double) ' ');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + horizontalAlignment5 + "' != '" + org.jfree.chart.api.HorizontalAlignment.CENTER + "'", horizontalAlignment5.equals(org.jfree.chart.api.HorizontalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test607");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        org.jfree.chart.api.VerticalAlignment verticalAlignment5 = compositeTitle0.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle6 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str7 = compositeTitle6.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge8 = compositeTitle6.getPosition();
        boolean boolean9 = compositeTitle6.getNotify();
        java.awt.geom.Rectangle2D rectangle2D10 = compositeTitle6.getBounds();
        compositeTitle0.setBounds(rectangle2D10);
        org.jfree.chart.api.HorizontalAlignment horizontalAlignment12 = compositeTitle0.getHorizontalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle13 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str14 = compositeTitle13.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge15 = compositeTitle13.getPosition();
        boolean boolean16 = compositeTitle13.getNotify();
        java.lang.String str17 = compositeTitle13.getID();
        compositeTitle13.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        org.jfree.chart.api.HorizontalAlignment horizontalAlignment23 = org.jfree.chart.title.Title.DEFAULT_HORIZONTAL_ALIGNMENT;
        compositeTitle13.setHorizontalAlignment(horizontalAlignment23);
        compositeTitle0.setHorizontalAlignment(horizontalAlignment23);
        org.jfree.chart.api.RectangleInsets rectangleInsets26 = compositeTitle0.getPadding();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + verticalAlignment5 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment5.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + rectangleEdge8 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge8.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(rectangle2D10);
        org.junit.Assert.assertTrue("'" + horizontalAlignment12 + "' != '" + org.jfree.chart.api.HorizontalAlignment.CENTER + "'", horizontalAlignment12.equals(org.jfree.chart.api.HorizontalAlignment.CENTER));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + rectangleEdge15 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge15.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + horizontalAlignment23 + "' != '" + org.jfree.chart.api.HorizontalAlignment.CENTER + "'", horizontalAlignment23.equals(org.jfree.chart.api.HorizontalAlignment.CENTER));
        org.junit.Assert.assertNotNull(rectangleInsets26);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test608");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.awt.geom.Rectangle2D rectangle2D4 = compositeTitle0.getBounds();
        compositeTitle0.setNotify(false);
        org.jfree.chart.event.TitleChangeListener titleChangeListener7 = null;
        compositeTitle0.removeChangeListener(titleChangeListener7);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        org.jfree.chart.title.CompositeTitle compositeTitle11 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str12 = compositeTitle11.getID();
        org.jfree.chart.block.BlockContainer blockContainer13 = compositeTitle11.getContainer();
        compositeTitle11.setPadding(0.0d, (double) 1L, (double) 10L, (double) (short) 0);
        compositeTitle11.setPadding((double) 10L, (double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        org.jfree.chart.api.RectangleInsets rectangleInsets24 = compositeTitle11.getMargin();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = compositeTitle0.draw(graphics2D9, rectangle2D10, (java.lang.Object) rectangleInsets24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getWidth()\" because \"area\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(rectangle2D4);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(blockContainer13);
        org.junit.Assert.assertNotNull(rectangleInsets24);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test609");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        org.jfree.chart.title.CompositeTitle compositeTitle1 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str2 = compositeTitle1.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge3 = compositeTitle1.getPosition();
        boolean boolean4 = compositeTitle1.getNotify();
        java.lang.String str5 = compositeTitle1.getID();
        compositeTitle1.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        double double11 = compositeTitle1.getWidth();
        compositeTitle1.setVisible(true);
        boolean boolean14 = compositeTitle1.visible;
        org.jfree.chart.api.VerticalAlignment verticalAlignment15 = compositeTitle1.getVerticalAlignment();
        compositeTitle0.setVerticalAlignment(verticalAlignment15);
        double double17 = compositeTitle0.getWidth();
        org.jfree.chart.event.TitleChangeListener titleChangeListener18 = null;
        compositeTitle0.removeChangeListener(titleChangeListener18);
        java.awt.Paint paint20 = compositeTitle0.getBackgroundPaint();
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.block.Size2D size2D22 = compositeTitle0.arrange(graphics2D21);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + rectangleEdge3 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge3.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + verticalAlignment15 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment15.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNull(paint20);
        org.junit.Assert.assertNotNull(size2D22);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test610");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        boolean boolean1 = compositeTitle0.getNotify();
        org.jfree.chart.title.CompositeTitle compositeTitle2 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str3 = compositeTitle2.getID();
        org.jfree.chart.block.BlockContainer blockContainer4 = compositeTitle2.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment5 = compositeTitle2.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle6 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str7 = compositeTitle6.getID();
        org.jfree.chart.block.BlockContainer blockContainer8 = compositeTitle6.getContainer();
        compositeTitle2.setTitleContainer(blockContainer8);
        org.jfree.chart.title.CompositeTitle compositeTitle10 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str11 = compositeTitle10.getID();
        org.jfree.chart.block.BlockContainer blockContainer12 = compositeTitle10.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment13 = compositeTitle10.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle14 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str15 = compositeTitle14.getID();
        org.jfree.chart.block.BlockContainer blockContainer16 = compositeTitle14.getContainer();
        compositeTitle10.setTitleContainer(blockContainer16);
        compositeTitle2.setTitleContainer(blockContainer16);
        double double19 = blockContainer16.getContentXOffset();
        compositeTitle0.setTitleContainer(blockContainer16);
        org.jfree.chart.title.CompositeTitle compositeTitle21 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str22 = compositeTitle21.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge23 = compositeTitle21.getPosition();
        boolean boolean24 = compositeTitle21.getNotify();
        java.lang.String str25 = compositeTitle21.getID();
        org.jfree.chart.api.VerticalAlignment verticalAlignment26 = compositeTitle21.getVerticalAlignment();
        org.jfree.chart.block.BlockContainer blockContainer27 = compositeTitle21.getContainer();
        org.jfree.chart.title.CompositeTitle compositeTitle28 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str29 = compositeTitle28.getID();
        org.jfree.chart.block.BlockContainer blockContainer30 = compositeTitle28.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment31 = compositeTitle28.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle32 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str33 = compositeTitle32.getID();
        org.jfree.chart.block.BlockContainer blockContainer34 = compositeTitle32.getContainer();
        compositeTitle28.setTitleContainer(blockContainer34);
        compositeTitle21.setTitleContainer(blockContainer34);
        compositeTitle0.setTitleContainer(blockContainer34);
        org.jfree.chart.title.CompositeTitle compositeTitle38 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str39 = compositeTitle38.getID();
        org.jfree.chart.block.BlockContainer blockContainer40 = compositeTitle38.getContainer();
        compositeTitle38.setPadding((double) (byte) 100, (double) '#', (double) 0L, (double) 100);
        org.jfree.chart.event.TitleChangeListener titleChangeListener46 = null;
        compositeTitle38.removeChangeListener(titleChangeListener46);
        org.jfree.chart.title.CompositeTitle compositeTitle48 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str49 = compositeTitle48.getID();
        org.jfree.chart.block.BlockContainer blockContainer50 = compositeTitle48.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment51 = compositeTitle48.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle52 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str53 = compositeTitle52.getID();
        org.jfree.chart.block.BlockContainer blockContainer54 = compositeTitle52.getContainer();
        compositeTitle48.setTitleContainer(blockContainer54);
        org.jfree.chart.title.CompositeTitle compositeTitle56 = new org.jfree.chart.title.CompositeTitle(blockContainer54);
        org.jfree.chart.title.CompositeTitle compositeTitle57 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str58 = compositeTitle57.getID();
        org.jfree.chart.block.BlockContainer blockContainer59 = compositeTitle57.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment60 = compositeTitle57.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle61 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str62 = compositeTitle61.getID();
        org.jfree.chart.block.BlockContainer blockContainer63 = compositeTitle61.getContainer();
        compositeTitle57.setTitleContainer(blockContainer63);
        org.jfree.chart.title.CompositeTitle compositeTitle65 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str66 = compositeTitle65.getID();
        org.jfree.chart.block.BlockContainer blockContainer67 = compositeTitle65.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment68 = compositeTitle65.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle69 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str70 = compositeTitle69.getID();
        org.jfree.chart.block.BlockContainer blockContainer71 = compositeTitle69.getContainer();
        compositeTitle65.setTitleContainer(blockContainer71);
        compositeTitle57.setTitleContainer(blockContainer71);
        compositeTitle56.setTitleContainer(blockContainer71);
        org.jfree.chart.api.RectangleEdge rectangleEdge75 = compositeTitle56.getPosition();
        compositeTitle38.setPosition(rectangleEdge75);
        compositeTitle0.setPosition(rectangleEdge75);
        java.awt.Graphics2D graphics2D78 = null;
        org.jfree.chart.block.Size2D size2D79 = compositeTitle0.arrange(graphics2D78);
        org.jfree.chart.block.BlockContainer blockContainer80 = compositeTitle0.getContainer();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(blockContainer4);
        org.junit.Assert.assertTrue("'" + verticalAlignment5 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment5.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(blockContainer8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(blockContainer12);
        org.junit.Assert.assertTrue("'" + verticalAlignment13 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment13.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(blockContainer16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + rectangleEdge23 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge23.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + verticalAlignment26 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment26.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNotNull(blockContainer27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(blockContainer30);
        org.junit.Assert.assertTrue("'" + verticalAlignment31 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment31.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(blockContainer34);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(blockContainer40);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(blockContainer50);
        org.junit.Assert.assertTrue("'" + verticalAlignment51 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment51.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(blockContainer54);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(blockContainer59);
        org.junit.Assert.assertTrue("'" + verticalAlignment60 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment60.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(blockContainer63);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(blockContainer67);
        org.junit.Assert.assertTrue("'" + verticalAlignment68 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment68.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(blockContainer71);
        org.junit.Assert.assertTrue("'" + rectangleEdge75 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge75.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertNotNull(size2D79);
        org.junit.Assert.assertNotNull(blockContainer80);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test611");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        double double4 = compositeTitle0.getWidth();
        org.jfree.chart.event.TitleChangeListener titleChangeListener5 = null;
        compositeTitle0.removeChangeListener(titleChangeListener5);
        org.jfree.chart.title.CompositeTitle compositeTitle7 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str8 = compositeTitle7.getID();
        org.jfree.chart.block.BlockContainer blockContainer9 = compositeTitle7.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment10 = compositeTitle7.getVerticalAlignment();
        org.jfree.chart.api.VerticalAlignment verticalAlignment11 = compositeTitle7.getVerticalAlignment();
        java.awt.Paint paint12 = null;
        compositeTitle7.setBackgroundPaint(paint12);
        org.jfree.chart.api.RectangleInsets rectangleInsets14 = compositeTitle7.getPadding();
        compositeTitle0.setMargin(rectangleInsets14);
        double double16 = compositeTitle0.getContentXOffset();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(blockContainer9);
        org.junit.Assert.assertTrue("'" + verticalAlignment10 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment10.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + verticalAlignment11 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment11.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.0d + "'", double16 == 2.0d);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test612");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        compositeTitle0.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        double double10 = compositeTitle0.getWidth();
        compositeTitle0.setVisible(true);
        boolean boolean13 = compositeTitle0.visible;
        boolean boolean14 = compositeTitle0.isVisible();
        org.jfree.chart.block.BlockFrame blockFrame15 = compositeTitle0.getFrame();
        org.jfree.chart.block.BlockContainer blockContainer16 = compositeTitle0.getContainer();
        org.jfree.chart.title.CompositeTitle compositeTitle17 = new org.jfree.chart.title.CompositeTitle(blockContainer16);
        org.jfree.chart.title.CompositeTitle compositeTitle18 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str19 = compositeTitle18.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge20 = compositeTitle18.getPosition();
        boolean boolean21 = compositeTitle18.getNotify();
        java.lang.String str22 = compositeTitle18.getID();
        compositeTitle18.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        org.jfree.chart.title.CompositeTitle compositeTitle28 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str29 = compositeTitle28.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge30 = compositeTitle28.getPosition();
        boolean boolean31 = compositeTitle28.getNotify();
        java.awt.geom.Rectangle2D rectangle2D32 = compositeTitle28.getBounds();
        compositeTitle18.setBounds(rectangle2D32);
        org.jfree.chart.api.RectangleInsets rectangleInsets34 = compositeTitle18.getPadding();
        blockContainer16.setPadding(rectangleInsets34);
        org.jfree.chart.title.CompositeTitle compositeTitle36 = new org.jfree.chart.title.CompositeTitle(blockContainer16);
        java.lang.String str37 = compositeTitle36.getID();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(blockFrame15);
        org.junit.Assert.assertNotNull(blockContainer16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + rectangleEdge20 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge20.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + rectangleEdge30 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge30.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(rectangle2D32);
        org.junit.Assert.assertNotNull(rectangleInsets34);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test613");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        org.jfree.chart.api.HorizontalAlignment horizontalAlignment5 = compositeTitle0.getHorizontalAlignment();
        boolean boolean6 = compositeTitle0.isVisible();
        java.lang.Object obj7 = compositeTitle0.clone();
        org.jfree.chart.api.RectangleInsets rectangleInsets8 = compositeTitle0.getPadding();
        org.jfree.chart.title.CompositeTitle compositeTitle9 = new org.jfree.chart.title.CompositeTitle();
        boolean boolean10 = compositeTitle9.getNotify();
        java.awt.Paint paint11 = compositeTitle9.getBackgroundPaint();
        org.jfree.chart.event.TitleChangeListener titleChangeListener12 = null;
        compositeTitle9.addChangeListener(titleChangeListener12);
        double double14 = compositeTitle9.getHeight();
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.block.Size2D size2D16 = compositeTitle9.arrange(graphics2D15);
        org.jfree.chart.title.CompositeTitle compositeTitle17 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str18 = compositeTitle17.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge19 = compositeTitle17.getPosition();
        boolean boolean20 = compositeTitle17.getNotify();
        java.lang.String str21 = compositeTitle17.getID();
        compositeTitle17.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        double double27 = compositeTitle17.getWidth();
        compositeTitle17.setVisible(true);
        boolean boolean30 = compositeTitle17.visible;
        boolean boolean31 = compositeTitle17.isVisible();
        org.jfree.chart.block.BlockFrame blockFrame32 = compositeTitle17.getFrame();
        org.jfree.chart.block.BlockContainer blockContainer33 = compositeTitle17.getContainer();
        org.jfree.chart.title.CompositeTitle compositeTitle34 = new org.jfree.chart.title.CompositeTitle(blockContainer33);
        org.jfree.chart.title.CompositeTitle compositeTitle35 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str36 = compositeTitle35.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge37 = compositeTitle35.getPosition();
        boolean boolean38 = compositeTitle35.getNotify();
        java.lang.String str39 = compositeTitle35.getID();
        compositeTitle35.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        org.jfree.chart.title.CompositeTitle compositeTitle45 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str46 = compositeTitle45.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge47 = compositeTitle45.getPosition();
        boolean boolean48 = compositeTitle45.getNotify();
        java.awt.geom.Rectangle2D rectangle2D49 = compositeTitle45.getBounds();
        compositeTitle35.setBounds(rectangle2D49);
        org.jfree.chart.api.RectangleInsets rectangleInsets51 = compositeTitle35.getPadding();
        blockContainer33.setPadding(rectangleInsets51);
        compositeTitle9.setMargin(rectangleInsets51);
        compositeTitle0.setPadding(rectangleInsets51);
        boolean boolean55 = compositeTitle0.getNotify();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + horizontalAlignment5 + "' != '" + org.jfree.chart.api.HorizontalAlignment.CENTER + "'", horizontalAlignment5.equals(org.jfree.chart.api.HorizontalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(size2D16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + rectangleEdge19 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge19.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(blockFrame32);
        org.junit.Assert.assertNotNull(blockContainer33);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + rectangleEdge37 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge37.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + rectangleEdge47 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge47.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(rectangle2D49);
        org.junit.Assert.assertNotNull(rectangleInsets51);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test614");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        org.jfree.chart.title.CompositeTitle compositeTitle3 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str4 = compositeTitle3.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge5 = compositeTitle3.getPosition();
        compositeTitle0.setPosition(rectangleEdge5);
        org.jfree.chart.title.CompositeTitle compositeTitle7 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str8 = compositeTitle7.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge9 = compositeTitle7.getPosition();
        boolean boolean10 = compositeTitle7.getNotify();
        java.lang.String str11 = compositeTitle7.getID();
        compositeTitle7.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        double double17 = compositeTitle7.getWidth();
        compositeTitle7.setVisible(true);
        boolean boolean20 = compositeTitle7.visible;
        org.jfree.chart.title.CompositeTitle compositeTitle21 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str22 = compositeTitle21.getID();
        org.jfree.chart.block.BlockContainer blockContainer23 = compositeTitle21.getContainer();
        compositeTitle21.setPadding(0.0d, (double) 1L, (double) 10L, (double) (short) 0);
        compositeTitle21.setPadding((double) 10L, (double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        org.jfree.chart.block.BlockFrame blockFrame34 = compositeTitle21.getFrame();
        compositeTitle7.setFrame(blockFrame34);
        compositeTitle0.setFrame(blockFrame34);
        java.awt.Graphics2D graphics2D37 = null;
        org.jfree.chart.title.CompositeTitle compositeTitle38 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str39 = compositeTitle38.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge40 = compositeTitle38.getPosition();
        boolean boolean41 = compositeTitle38.getNotify();
        java.lang.String str42 = compositeTitle38.getID();
        compositeTitle38.setMargin((double) 0L, (double) 100L, (double) 10L, (double) (short) -1);
        org.jfree.chart.event.TitleChangeListener titleChangeListener48 = null;
        compositeTitle38.removeChangeListener(titleChangeListener48);
        compositeTitle38.setNotify(false);
        java.awt.geom.Rectangle2D rectangle2D52 = compositeTitle38.getBounds();
        // The following exception was thrown during execution in test generation
        try {
            compositeTitle0.draw(graphics2D37, rectangle2D52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics2D.setPaint(java.awt.Paint)\" because \"g2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + rectangleEdge5 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge5.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + rectangleEdge9 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge9.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(blockContainer23);
        org.junit.Assert.assertNotNull(blockFrame34);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + rectangleEdge40 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge40.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(rectangle2D52);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test615");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        boolean boolean1 = compositeTitle0.getNotify();
        org.jfree.chart.event.TitleChangeListener titleChangeListener2 = null;
        compositeTitle0.removeChangeListener(titleChangeListener2);
        double double4 = compositeTitle0.getHeight();
        org.jfree.chart.api.RectangleInsets rectangleInsets5 = compositeTitle0.getMargin();
        double double6 = compositeTitle0.getWidth();
        double double7 = compositeTitle0.getContentXOffset();
        compositeTitle0.visible = false;
        compositeTitle0.setID("");
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.block.Size2D size2D13 = compositeTitle0.arrange(graphics2D12);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test616");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.block.BlockContainer blockContainer2 = compositeTitle0.getContainer();
        compositeTitle0.setPadding(0.0d, (double) 1L, (double) 10L, (double) (short) 0);
        org.jfree.chart.api.RectangleInsets rectangleInsets8 = compositeTitle0.getPadding();
        boolean boolean9 = compositeTitle0.visible;
        org.jfree.chart.block.BlockContainer blockContainer10 = compositeTitle0.getContainer();
        org.jfree.chart.api.RectangleInsets rectangleInsets11 = blockContainer10.getPadding();
        org.jfree.chart.block.BlockFrame blockFrame12 = blockContainer10.getFrame();
        double double13 = blockContainer10.getHeight();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(blockContainer2);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(blockContainer10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(blockFrame12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test617");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        compositeTitle0.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        org.jfree.chart.api.HorizontalAlignment horizontalAlignment10 = org.jfree.chart.title.Title.DEFAULT_HORIZONTAL_ALIGNMENT;
        compositeTitle0.setHorizontalAlignment(horizontalAlignment10);
        java.awt.Paint paint12 = null;
        compositeTitle0.setBackgroundPaint(paint12);
        double double14 = compositeTitle0.getWidth();
        org.jfree.chart.title.CompositeTitle compositeTitle15 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str16 = compositeTitle15.getID();
        compositeTitle15.visible = false;
        org.jfree.chart.block.BlockFrame blockFrame19 = compositeTitle15.getFrame();
        compositeTitle0.setFrame(blockFrame19);
        boolean boolean21 = compositeTitle0.visible;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + horizontalAlignment10 + "' != '" + org.jfree.chart.api.HorizontalAlignment.CENTER + "'", horizontalAlignment10.equals(org.jfree.chart.api.HorizontalAlignment.CENTER));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(blockFrame19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test618");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        compositeTitle0.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        org.jfree.chart.title.CompositeTitle compositeTitle10 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str11 = compositeTitle10.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge12 = compositeTitle10.getPosition();
        boolean boolean13 = compositeTitle10.getNotify();
        java.awt.geom.Rectangle2D rectangle2D14 = compositeTitle10.getBounds();
        compositeTitle0.setBounds(rectangle2D14);
        java.awt.geom.Rectangle2D rectangle2D16 = compositeTitle0.getBounds();
        compositeTitle0.setVisible(true);
        org.jfree.chart.title.CompositeTitle compositeTitle19 = new org.jfree.chart.title.CompositeTitle();
        boolean boolean20 = compositeTitle19.getNotify();
        org.jfree.chart.title.CompositeTitle compositeTitle21 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str22 = compositeTitle21.getID();
        org.jfree.chart.block.BlockContainer blockContainer23 = compositeTitle21.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment24 = compositeTitle21.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle25 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str26 = compositeTitle25.getID();
        org.jfree.chart.block.BlockContainer blockContainer27 = compositeTitle25.getContainer();
        compositeTitle21.setTitleContainer(blockContainer27);
        org.jfree.chart.title.CompositeTitle compositeTitle29 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str30 = compositeTitle29.getID();
        org.jfree.chart.block.BlockContainer blockContainer31 = compositeTitle29.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment32 = compositeTitle29.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle33 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str34 = compositeTitle33.getID();
        org.jfree.chart.block.BlockContainer blockContainer35 = compositeTitle33.getContainer();
        compositeTitle29.setTitleContainer(blockContainer35);
        compositeTitle21.setTitleContainer(blockContainer35);
        double double38 = blockContainer35.getContentXOffset();
        compositeTitle19.setTitleContainer(blockContainer35);
        boolean boolean40 = compositeTitle0.equals((java.lang.Object) compositeTitle19);
        double double41 = compositeTitle19.getContentYOffset();
        org.jfree.chart.title.CompositeTitle compositeTitle42 = new org.jfree.chart.title.CompositeTitle();
        org.jfree.chart.api.RectangleEdge rectangleEdge43 = compositeTitle42.getPosition();
        org.jfree.chart.title.CompositeTitle compositeTitle44 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str45 = compositeTitle44.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge46 = compositeTitle44.getPosition();
        boolean boolean47 = compositeTitle44.getNotify();
        java.lang.String str48 = compositeTitle44.getID();
        org.jfree.chart.api.HorizontalAlignment horizontalAlignment49 = compositeTitle44.getHorizontalAlignment();
        compositeTitle42.setHorizontalAlignment(horizontalAlignment49);
        compositeTitle19.setHorizontalAlignment(horizontalAlignment49);
        java.awt.geom.Rectangle2D rectangle2D52 = compositeTitle19.getBounds();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + rectangleEdge12 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge12.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(rectangle2D14);
        org.junit.Assert.assertNotNull(rectangle2D16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(blockContainer23);
        org.junit.Assert.assertTrue("'" + verticalAlignment24 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment24.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(blockContainer27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(blockContainer31);
        org.junit.Assert.assertTrue("'" + verticalAlignment32 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment32.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(blockContainer35);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
        org.junit.Assert.assertTrue("'" + rectangleEdge43 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge43.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + rectangleEdge46 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge46.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + horizontalAlignment49 + "' != '" + org.jfree.chart.api.HorizontalAlignment.CENTER + "'", horizontalAlignment49.equals(org.jfree.chart.api.HorizontalAlignment.CENTER));
        org.junit.Assert.assertNotNull(rectangle2D52);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTitleRegressionTest1.test619");
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str1 = compositeTitle0.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge2 = compositeTitle0.getPosition();
        boolean boolean3 = compositeTitle0.getNotify();
        java.lang.String str4 = compositeTitle0.getID();
        org.jfree.chart.title.CompositeTitle compositeTitle5 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str6 = compositeTitle5.getID();
        org.jfree.chart.block.BlockContainer blockContainer7 = compositeTitle5.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment8 = compositeTitle5.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle9 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str10 = compositeTitle9.getID();
        org.jfree.chart.block.BlockContainer blockContainer11 = compositeTitle9.getContainer();
        compositeTitle5.setTitleContainer(blockContainer11);
        org.jfree.chart.title.CompositeTitle compositeTitle13 = new org.jfree.chart.title.CompositeTitle(blockContainer11);
        org.jfree.chart.title.CompositeTitle compositeTitle14 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str15 = compositeTitle14.getID();
        org.jfree.chart.block.BlockContainer blockContainer16 = compositeTitle14.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment17 = compositeTitle14.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle18 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str19 = compositeTitle18.getID();
        org.jfree.chart.block.BlockContainer blockContainer20 = compositeTitle18.getContainer();
        compositeTitle14.setTitleContainer(blockContainer20);
        org.jfree.chart.title.CompositeTitle compositeTitle22 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str23 = compositeTitle22.getID();
        org.jfree.chart.block.BlockContainer blockContainer24 = compositeTitle22.getContainer();
        org.jfree.chart.api.VerticalAlignment verticalAlignment25 = compositeTitle22.getVerticalAlignment();
        org.jfree.chart.title.CompositeTitle compositeTitle26 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str27 = compositeTitle26.getID();
        org.jfree.chart.block.BlockContainer blockContainer28 = compositeTitle26.getContainer();
        compositeTitle22.setTitleContainer(blockContainer28);
        compositeTitle14.setTitleContainer(blockContainer28);
        compositeTitle13.setTitleContainer(blockContainer28);
        org.jfree.chart.api.RectangleEdge rectangleEdge32 = compositeTitle13.getPosition();
        compositeTitle0.setPosition(rectangleEdge32);
        org.jfree.chart.block.BlockContainer blockContainer34 = compositeTitle0.getContainer();
        java.awt.Graphics2D graphics2D35 = null;
        org.jfree.chart.title.CompositeTitle compositeTitle36 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str37 = compositeTitle36.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge38 = compositeTitle36.getPosition();
        boolean boolean39 = compositeTitle36.getNotify();
        java.lang.String str40 = compositeTitle36.getID();
        compositeTitle36.setPadding((double) 10.0f, (double) (byte) 0, 100.0d, (double) (-1.0f));
        org.jfree.chart.title.CompositeTitle compositeTitle46 = new org.jfree.chart.title.CompositeTitle();
        java.lang.String str47 = compositeTitle46.getID();
        org.jfree.chart.api.RectangleEdge rectangleEdge48 = compositeTitle46.getPosition();
        boolean boolean49 = compositeTitle46.getNotify();
        java.awt.geom.Rectangle2D rectangle2D50 = compositeTitle46.getBounds();
        compositeTitle36.setBounds(rectangle2D50);
        org.jfree.chart.block.BlockContainer blockContainer52 = compositeTitle36.getContainer();
        blockContainer52.setID("hi!");
        java.awt.geom.Rectangle2D rectangle2D55 = blockContainer52.getBounds();
        // The following exception was thrown during execution in test generation
        try {
            compositeTitle0.draw(graphics2D35, rectangle2D55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics2D.setPaint(java.awt.Paint)\" because \"g2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + rectangleEdge2 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge2.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(blockContainer7);
        org.junit.Assert.assertTrue("'" + verticalAlignment8 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment8.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(blockContainer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(blockContainer16);
        org.junit.Assert.assertTrue("'" + verticalAlignment17 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment17.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(blockContainer20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(blockContainer24);
        org.junit.Assert.assertTrue("'" + verticalAlignment25 + "' != '" + org.jfree.chart.api.VerticalAlignment.CENTER + "'", verticalAlignment25.equals(org.jfree.chart.api.VerticalAlignment.CENTER));
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(blockContainer28);
        org.junit.Assert.assertTrue("'" + rectangleEdge32 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge32.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertNotNull(blockContainer34);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + rectangleEdge38 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge38.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + rectangleEdge48 + "' != '" + org.jfree.chart.api.RectangleEdge.TOP + "'", rectangleEdge48.equals(org.jfree.chart.api.RectangleEdge.TOP));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(rectangle2D50);
        org.junit.Assert.assertNotNull(blockContainer52);
        org.junit.Assert.assertNotNull(rectangle2D55);
    }
}


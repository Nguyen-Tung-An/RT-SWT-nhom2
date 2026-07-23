package org.jsoup.examples;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HtmlToPlainTextRegressionTest0 {

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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HtmlToPlainTextRegressionTest0.test1");
        org.jsoup.select.Elements elements0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements1 = org.jsoup.examples.HtmlToPlainText.trimParents(elements0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jsoup.select.Elements.size()\" because \"elements\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HtmlToPlainTextRegressionTest0.test2");
        org.jsoup.nodes.Element element0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.jsoup.examples.HtmlToPlainText.getPlainText(element0);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HtmlToPlainTextRegressionTest0.test3");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HtmlToPlainTextRegressionTest0.test4");
        org.jsoup.examples.HtmlToPlainText htmlToPlainText0 = new org.jsoup.examples.HtmlToPlainText();
        java.lang.Class<?> wildcardClass1 = htmlToPlainText0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}


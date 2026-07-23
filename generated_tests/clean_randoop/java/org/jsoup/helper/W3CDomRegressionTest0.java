package org.jsoup.helper;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class W3CDomRegressionTest0 {

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
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0001");
        org.w3c.dom.Document document0 = null;
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = org.jsoup.helper.W3CDom.OutputXml();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.W3CDom.asString(document0, (java.util.Map<java.lang.String, java.lang.String>) strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0002");
        java.lang.String str0 = org.jsoup.helper.W3CDom.SourceProperty;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "jsoupSource" + "'", str0, "jsoupSource");
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0003");
        org.w3c.dom.Document document0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.W3CDom.W3CBuilder w3CBuilder1 = new org.jsoup.helper.W3CDom.W3CBuilder(document0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0004");
        org.jsoup.nodes.Document document0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document1 = org.jsoup.helper.W3CDom.convert(document0);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0005");
        org.w3c.dom.Document document0 = null;
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = org.jsoup.helper.W3CDom.OutputXml();
        java.util.Properties properties2 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.helper.W3CDom.asString(document0, (java.util.Map<java.lang.String, java.lang.String>) strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(properties2);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0006");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Properties properties1 = org.jsoup.helper.W3CDom.propertiesFromMap(strMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.size()\" because \"m\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0007");
        java.util.HashMap<java.lang.String, java.lang.String> strMap0 = org.jsoup.helper.W3CDom.OutputXml();
        java.util.Properties properties1 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap0);
        java.util.Properties properties2 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap0);
        java.lang.Class<?> wildcardClass3 = strMap0.getClass();
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0008");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory3 = null;
        w3CDom2.factory = documentBuilderFactory3;
        org.w3c.dom.Document document6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList7 = w3CDom2.selectXpath("hi!", document6);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0009");
        java.lang.String str0 = org.jsoup.helper.W3CDom.XPathFactoryProperty;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "javax.xml.xpath.XPathFactory:jsoup" + "'", str0, "javax.xml.xpath.XPathFactory:jsoup");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0010");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.nodes.Element element1 = null;
        org.w3c.dom.Document document2 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom0.convert(element1, document2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0011");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.w3c.dom.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList7 = w3CDom2.selectXpath("hi!", node6);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0012");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.w3c.dom.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList9 = w3CDom6.selectXpath("", node8);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'xpath' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0013");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.nodes.Document document5 = null;
        org.w3c.dom.Document document6 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom2.convert(document5, document6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0014");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        java.lang.Class<?> wildcardClass1 = w3CDom0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0015");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.w3c.dom.Document document5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node6 = w3CDom4.contextNode(document5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0016");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.w3c.dom.Document document8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList9 = w3CDom2.selectXpath("", document8);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'xpath' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0017");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.w3c.dom.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList9 = w3CDom6.selectXpath("jsoupSource", node8);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0018");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory1 = w3CDom0.factory;
        org.w3c.dom.Document document3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList4 = w3CDom0.selectXpath("", document3);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'xpath' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(documentBuilderFactory1);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0019");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.w3c.dom.Document document7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node8 = w3CDom2.contextNode(document7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0020");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory1 = w3CDom0.factory;
        org.jsoup.nodes.Element element2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document3 = w3CDom0.fromJsoup(element2);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(documentBuilderFactory1);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0021");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        boolean boolean7 = w3CDom6.namespaceAware();
        org.jsoup.nodes.Document document8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document9 = w3CDom6.fromJsoup(document8);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0022");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        boolean boolean3 = w3CDom0.namespaceAware();
        boolean boolean4 = w3CDom0.namespaceAware();
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document6 = w3CDom0.fromJsoup(element5);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0023");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        java.lang.Class<?> wildcardClass7 = w3CDom4.getClass();
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0024");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.w3c.dom.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList7 = w3CDom4.selectXpath("javax.xml.xpath.XPathFactory:jsoup", node6);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0025");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom7 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory8 = w3CDom7.factory;
        w3CDom2.factory = documentBuilderFactory8;
        org.w3c.dom.Document document10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = w3CDom2.asString(document10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(documentBuilderFactory8);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0026");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.nodes.Document document5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document6 = w3CDom2.fromJsoup(document5);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0027");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory3 = null;
        w3CDom2.factory = documentBuilderFactory3;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"javax.xml.parsers.DocumentBuilderFactory.setNamespaceAware(boolean)\" because \"this.factory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0028");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.w3c.dom.Document document6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList7 = w3CDom4.selectXpath("hi!", document6);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0029");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory3 = null;
        w3CDom2.factory = documentBuilderFactory3;
        org.w3c.dom.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList7 = w3CDom2.selectXpath("hi!", node6);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0030");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.nodes.Document document7 = null;
        org.w3c.dom.Document document8 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom2.convert(document7, document8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0031");
        org.w3c.dom.Document document0 = null;
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = org.jsoup.helper.W3CDom.OutputHtml();
        java.util.Properties properties2 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.helper.W3CDom.asString(document0, (java.util.Map<java.lang.String, java.lang.String>) strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(properties2);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0032");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory3 = null;
        w3CDom2.factory = documentBuilderFactory3;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory5 = w3CDom2.factory;
        org.jsoup.nodes.Document document6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document7 = w3CDom2.fromJsoup(document6);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNull(documentBuilderFactory5);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0033");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.nodes.Document document1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document2 = w3CDom0.fromJsoup(document1);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0034");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        boolean boolean3 = w3CDom0.namespaceAware();
        boolean boolean4 = w3CDom0.namespaceAware();
        org.jsoup.nodes.Document document5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document6 = w3CDom0.fromJsoup(document5);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0035");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.nodes.Document document7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document8 = w3CDom2.fromJsoup(document7);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0036");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.w3c.dom.Document document3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node4 = w3CDom2.contextNode(document3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0037");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory3 = null;
        w3CDom2.factory = documentBuilderFactory3;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory5 = w3CDom2.factory;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom2.factory;
        org.w3c.dom.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList9 = w3CDom2.selectXpath("", node8);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'xpath' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNull(documentBuilderFactory5);
        org.junit.Assert.assertNull(documentBuilderFactory6);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0038");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory3 = null;
        w3CDom2.factory = documentBuilderFactory3;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory5 = w3CDom2.factory;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom2.factory;
        org.w3c.dom.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList9 = w3CDom2.selectXpath("hi!", node8);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNull(documentBuilderFactory5);
        org.junit.Assert.assertNull(documentBuilderFactory6);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0039");
        java.util.HashMap<java.lang.String, java.lang.String> strMap0 = org.jsoup.helper.W3CDom.OutputHtml();
        java.util.Properties properties1 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap0);
        java.lang.Class<?> wildcardClass2 = strMap0.getClass();
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0040");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.w3c.dom.Document document3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node4 = w3CDom0.contextNode(document3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0041");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom4.namespaceAware(false);
        org.jsoup.nodes.Document document9 = null;
        org.w3c.dom.Document document10 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom8.convert(document9, document10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0042");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom7 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory8 = w3CDom7.factory;
        w3CDom2.factory = documentBuilderFactory8;
        org.w3c.dom.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList12 = w3CDom2.selectXpath("hi!", node11);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(documentBuilderFactory8);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0043");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory5 = w3CDom2.factory;
        org.jsoup.nodes.Document document6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document7 = w3CDom2.fromJsoup(document6);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory5);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0044");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        boolean boolean3 = w3CDom0.namespaceAware();
        boolean boolean4 = w3CDom0.namespaceAware();
        org.w3c.dom.Document document6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList7 = w3CDom0.selectXpath("jsoupSource", document6);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0045");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        boolean boolean3 = w3CDom0.namespaceAware();
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document5 = w3CDom0.fromJsoup(element4);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0046");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.nodes.Element element5 = null;
        org.w3c.dom.Document document6 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom0.convert(element5, document6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0047");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.w3c.dom.Document document8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList9 = w3CDom2.selectXpath("javax.xml.xpath.XPathFactory:jsoup", document8);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0048");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom4.namespaceAware(false);
        org.w3c.dom.Document document9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = w3CDom8.asString(document9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0049");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom4.namespaceAware(false);
        org.w3c.dom.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList11 = w3CDom8.selectXpath("", node10);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'xpath' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0050");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        boolean boolean3 = w3CDom0.namespaceAware();
        boolean boolean4 = w3CDom0.namespaceAware();
        org.jsoup.nodes.Element element5 = null;
        org.w3c.dom.Document document6 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom0.convert(element5, document6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0051");
        org.w3c.dom.Document document0 = null;
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = org.jsoup.helper.W3CDom.OutputHtml();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.W3CDom.asString(document0, (java.util.Map<java.lang.String, java.lang.String>) strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0052");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        java.lang.Class<?> wildcardClass17 = documentBuilderFactory14.getClass();
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0053");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.w3c.dom.Document document5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = w3CDom0.asString(document5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0054");
        org.w3c.dom.Document document0 = null;
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = org.jsoup.helper.W3CDom.OutputHtml();
        java.util.Properties properties2 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        java.util.Properties properties3 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.jsoup.helper.W3CDom.asString(document0, (java.util.Map<java.lang.String, java.lang.String>) strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertNotNull(properties3);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0055");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        boolean boolean3 = w3CDom0.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory4 = w3CDom0.factory;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document6 = w3CDom0.fromJsoup(element5);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(documentBuilderFactory4);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0056");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory5 = w3CDom2.factory;
        org.w3c.dom.Document document6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = w3CDom2.asString(document6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory5);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0057");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.nodes.Document document3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document4 = w3CDom0.fromJsoup(document3);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0058");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.w3c.dom.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList7 = w3CDom2.selectXpath("javax.xml.xpath.XPathFactory:jsoup", node6);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0059");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom2.namespaceAware(true);
        org.w3c.dom.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList11 = w3CDom8.selectXpath("", node10);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'xpath' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0060");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.nodes.Element element7 = null;
        org.w3c.dom.Document document8 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom4.convert(element7, document8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0061");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.nodes.Document document1 = null;
        org.w3c.dom.Document document2 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom0.convert(document1, document2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0062");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom4.namespaceAware(false);
        org.w3c.dom.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList11 = w3CDom8.selectXpath("jsoupSource", node10);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0063");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.w3c.dom.Document document3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = w3CDom0.asString(document3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0064");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory7 = w3CDom4.factory;
        org.w3c.dom.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList10 = w3CDom4.selectXpath("", node9);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'xpath' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(documentBuilderFactory7);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0065");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom0.namespaceAware(true);
        org.w3c.dom.Document document11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList12 = w3CDom9.selectXpath("javax.xml.xpath.XPathFactory:jsoup", document11);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom9);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0066");
        org.w3c.dom.Document document0 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.W3CDom.asString(document0, strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0067");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom4.namespaceAware(false);
        org.w3c.dom.Document document9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = w3CDom4.asString(document9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0068");
        java.util.HashMap<java.lang.String, java.lang.String> strMap0 = org.jsoup.helper.W3CDom.OutputXml();
        java.util.Properties properties1 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap0);
        java.util.Properties properties2 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap0);
        java.lang.Class<?> wildcardClass3 = properties2.getClass();
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0069");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom7 = w3CDom5.namespaceAware(true);
        boolean boolean8 = w3CDom5.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory9 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory9;
        org.jsoup.nodes.Element element11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document12 = w3CDom0.fromJsoup(element11);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(documentBuilderFactory9);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0070");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory7 = w3CDom4.factory;
        java.lang.Class<?> wildcardClass8 = documentBuilderFactory7.getClass();
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(documentBuilderFactory7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0071");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.w3c.dom.Document document1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = w3CDom0.asString(document1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0072");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        boolean boolean7 = w3CDom4.namespaceAware();
        java.lang.Class<?> wildcardClass8 = w3CDom4.getClass();
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0073");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.nodes.Document document7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document8 = w3CDom4.fromJsoup(document7);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0074");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        org.jsoup.nodes.Document document19 = null;
        org.w3c.dom.Document document20 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom18.convert(document19, document20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0075");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory3 = w3CDom0.factory;
        org.w3c.dom.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList6 = w3CDom0.selectXpath("javax.xml.xpath.XPathFactory:jsoup", node5);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(documentBuilderFactory3);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0076");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        boolean boolean1 = w3CDom0.namespaceAware();
        org.jsoup.nodes.Element element2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document3 = w3CDom0.fromJsoup(element2);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0077");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom2.namespaceAware(true);
        org.jsoup.nodes.Document document9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document10 = w3CDom2.fromJsoup(document9);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0078");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom0.namespaceAware(true);
        org.w3c.dom.Document document10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node11 = w3CDom9.contextNode(document10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom9);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0079");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom2.namespaceAware(true);
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document10 = w3CDom2.fromJsoup(element9);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0080");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(false);
        org.w3c.dom.Document document21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node22 = w3CDom18.contextNode(document21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(w3CDom20);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0081");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.w3c.dom.Document document8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node9 = w3CDom0.contextNode(document8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0082");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        boolean boolean7 = w3CDom4.namespaceAware();
        org.w3c.dom.Document document8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node9 = w3CDom4.contextNode(document8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0083");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        boolean boolean3 = w3CDom0.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory4 = w3CDom0.factory;
        org.w3c.dom.Document document5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = w3CDom0.asString(document5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(documentBuilderFactory4);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0084");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        boolean boolean3 = w3CDom0.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory4 = w3CDom0.factory;
        org.w3c.dom.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList7 = w3CDom0.selectXpath("javax.xml.xpath.XPathFactory:jsoup", node6);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(documentBuilderFactory4);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0085");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory3 = null;
        w3CDom2.factory = documentBuilderFactory3;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory5 = w3CDom2.factory;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom2.factory;
        boolean boolean7 = w3CDom2.namespaceAware();
        org.jsoup.nodes.Element element8 = null;
        org.w3c.dom.Document document9 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom2.convert(element8, document9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNull(documentBuilderFactory5);
        org.junit.Assert.assertNull(documentBuilderFactory6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0086");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.w3c.dom.Document document6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList7 = w3CDom2.selectXpath("javax.xml.xpath.XPathFactory:jsoup", document6);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0087");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        java.lang.Class<?> wildcardClass5 = w3CDom2.getClass();
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0088");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        org.w3c.dom.Document document19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node20 = w3CDom18.contextNode(document19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0089");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory3 = null;
        w3CDom2.factory = documentBuilderFactory3;
        org.w3c.dom.Document document5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node6 = w3CDom2.contextNode(document5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0090");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom7 = w3CDom5.namespaceAware(true);
        boolean boolean8 = w3CDom5.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory9 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory9;
        org.w3c.dom.Document document11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node12 = w3CDom0.contextNode(document11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(documentBuilderFactory9);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0091");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document8 = w3CDom6.fromJsoup(element7);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0092");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory17 = w3CDom0.factory;
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory19 = w3CDom18.factory;
        w3CDom0.factory = documentBuilderFactory19;
        java.lang.Class<?> wildcardClass21 = w3CDom0.getClass();
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(documentBuilderFactory17);
        org.junit.Assert.assertNotNull(documentBuilderFactory19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0093");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom0.namespaceAware(true);
        org.w3c.dom.Document document11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList12 = w3CDom9.selectXpath("", document11);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'xpath' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom9);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0094");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory17 = w3CDom0.factory;
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory19 = w3CDom18.factory;
        w3CDom0.factory = documentBuilderFactory19;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory21 = w3CDom0.factory;
        org.w3c.dom.Document document22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node23 = w3CDom0.contextNode(document22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(documentBuilderFactory17);
        org.junit.Assert.assertNotNull(documentBuilderFactory19);
        org.junit.Assert.assertNotNull(documentBuilderFactory21);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0095");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory17 = w3CDom0.factory;
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory19 = w3CDom18.factory;
        w3CDom0.factory = documentBuilderFactory19;
        org.jsoup.nodes.Document document21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document22 = w3CDom0.fromJsoup(document21);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(documentBuilderFactory17);
        org.junit.Assert.assertNotNull(documentBuilderFactory19);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0096");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom7 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory8 = w3CDom7.factory;
        w3CDom2.factory = documentBuilderFactory8;
        org.w3c.dom.Document document10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node11 = w3CDom2.contextNode(document10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(documentBuilderFactory8);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0097");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document8 = w3CDom2.fromJsoup(element7);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0098");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom7 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory8 = w3CDom7.factory;
        w3CDom2.factory = documentBuilderFactory8;
        java.lang.Class<?> wildcardClass10 = documentBuilderFactory8.getClass();
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(documentBuilderFactory8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0099");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        org.jsoup.nodes.Document document19 = null;
        org.w3c.dom.Document document20 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom0.convert(document19, document20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0100");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory17 = w3CDom0.factory;
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory19 = w3CDom18.factory;
        w3CDom0.factory = documentBuilderFactory19;
        org.jsoup.helper.W3CDom w3CDom21 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom22 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom24 = w3CDom22.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom26 = w3CDom22.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom27 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory28 = w3CDom27.factory;
        w3CDom22.factory = documentBuilderFactory28;
        w3CDom21.factory = documentBuilderFactory28;
        w3CDom0.factory = documentBuilderFactory28;
        org.w3c.dom.Node node33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList34 = w3CDom0.selectXpath("hi!", node33);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(documentBuilderFactory17);
        org.junit.Assert.assertNotNull(documentBuilderFactory19);
        org.junit.Assert.assertNotNull(w3CDom24);
        org.junit.Assert.assertNotNull(w3CDom26);
        org.junit.Assert.assertNotNull(documentBuilderFactory28);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0101");
        java.util.HashMap<java.lang.String, java.lang.String> strMap0 = org.jsoup.helper.W3CDom.OutputHtml();
        java.lang.Class<?> wildcardClass1 = strMap0.getClass();
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0102");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory17 = w3CDom0.factory;
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory19 = w3CDom18.factory;
        w3CDom0.factory = documentBuilderFactory19;
        org.jsoup.nodes.Document document21 = null;
        org.w3c.dom.Document document22 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom0.convert(document21, document22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(documentBuilderFactory17);
        org.junit.Assert.assertNotNull(documentBuilderFactory19);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0103");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory5 = w3CDom2.factory;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document7 = w3CDom2.fromJsoup(element6);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory5);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0104");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        java.lang.Class<?> wildcardClass7 = w3CDom6.getClass();
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0105");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory17 = w3CDom0.factory;
        org.w3c.dom.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList20 = w3CDom0.selectXpath("hi!", node19);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(documentBuilderFactory17);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0106");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory1 = w3CDom0.factory;
        org.w3c.dom.Node node3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList4 = w3CDom0.selectXpath("javax.xml.xpath.XPathFactory:jsoup", node3);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(documentBuilderFactory1);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0107");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory3 = null;
        w3CDom2.factory = documentBuilderFactory3;
        org.w3c.dom.Document document5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = w3CDom2.asString(document5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0108");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.w3c.dom.Document document7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = w3CDom6.asString(document7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0109");
        org.w3c.dom.Document document0 = null;
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = org.jsoup.helper.W3CDom.OutputXml();
        java.util.Properties properties2 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        java.util.Properties properties3 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.jsoup.helper.W3CDom.asString(document0, (java.util.Map<java.lang.String, java.lang.String>) strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertNotNull(properties3);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0110");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom0.namespaceAware(false);
        org.w3c.dom.Document document7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = w3CDom6.asString(document7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0111");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory17 = w3CDom0.factory;
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory19 = w3CDom18.factory;
        w3CDom0.factory = documentBuilderFactory19;
        org.jsoup.helper.W3CDom w3CDom21 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom22 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom24 = w3CDom22.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom26 = w3CDom22.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom27 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory28 = w3CDom27.factory;
        w3CDom22.factory = documentBuilderFactory28;
        w3CDom21.factory = documentBuilderFactory28;
        w3CDom0.factory = documentBuilderFactory28;
        org.w3c.dom.Document document32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node33 = w3CDom0.contextNode(document32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(documentBuilderFactory17);
        org.junit.Assert.assertNotNull(documentBuilderFactory19);
        org.junit.Assert.assertNotNull(w3CDom24);
        org.junit.Assert.assertNotNull(w3CDom26);
        org.junit.Assert.assertNotNull(documentBuilderFactory28);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0112");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory5 = w3CDom2.factory;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom2.factory;
        org.jsoup.nodes.Document document7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document8 = w3CDom2.fromJsoup(document7);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory5);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0113");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom9 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom11 = w3CDom9.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom13 = w3CDom11.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom15 = w3CDom11.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom16 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory17 = w3CDom16.factory;
        w3CDom11.factory = documentBuilderFactory17;
        w3CDom4.factory = documentBuilderFactory17;
        org.w3c.dom.Document document20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node21 = w3CDom4.contextNode(document20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertNotNull(w3CDom11);
        org.junit.Assert.assertNotNull(w3CDom13);
        org.junit.Assert.assertNotNull(w3CDom15);
        org.junit.Assert.assertNotNull(documentBuilderFactory17);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0114");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory3 = null;
        w3CDom2.factory = documentBuilderFactory3;
        org.jsoup.nodes.Document document5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document6 = w3CDom2.fromJsoup(document5);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0115");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory3 = null;
        w3CDom2.factory = documentBuilderFactory3;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory5 = w3CDom2.factory;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom2.factory;
        boolean boolean7 = w3CDom2.namespaceAware();
        org.w3c.dom.Document document9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList10 = w3CDom2.selectXpath("hi!", document9);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNull(documentBuilderFactory5);
        org.junit.Assert.assertNull(documentBuilderFactory6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0116");
        org.w3c.dom.Document document0 = null;
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = org.jsoup.helper.W3CDom.OutputXml();
        java.util.Properties properties2 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        java.util.Properties properties3 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        java.util.Properties properties4 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.jsoup.helper.W3CDom.asString(document0, (java.util.Map<java.lang.String, java.lang.String>) strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(properties4);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0117");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory5 = w3CDom2.factory;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom2.factory;
        org.w3c.dom.Document document7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = w3CDom2.asString(document7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory5);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0118");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory17 = w3CDom0.factory;
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory19 = w3CDom18.factory;
        w3CDom0.factory = documentBuilderFactory19;
        org.jsoup.helper.W3CDom w3CDom21 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom22 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom24 = w3CDom22.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom26 = w3CDom22.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom27 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory28 = w3CDom27.factory;
        w3CDom22.factory = documentBuilderFactory28;
        w3CDom21.factory = documentBuilderFactory28;
        w3CDom0.factory = documentBuilderFactory28;
        java.lang.Class<?> wildcardClass32 = documentBuilderFactory28.getClass();
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(documentBuilderFactory17);
        org.junit.Assert.assertNotNull(documentBuilderFactory19);
        org.junit.Assert.assertNotNull(w3CDom24);
        org.junit.Assert.assertNotNull(w3CDom26);
        org.junit.Assert.assertNotNull(documentBuilderFactory28);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0119");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory17 = w3CDom0.factory;
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory19 = w3CDom18.factory;
        w3CDom0.factory = documentBuilderFactory19;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory21 = w3CDom0.factory;
        org.jsoup.nodes.Document document22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document23 = w3CDom0.fromJsoup(document22);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(documentBuilderFactory17);
        org.junit.Assert.assertNotNull(documentBuilderFactory19);
        org.junit.Assert.assertNotNull(documentBuilderFactory21);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0120");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.w3c.dom.Document document6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList7 = w3CDom0.selectXpath("hi!", document6);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0121");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom0.namespaceAware(false);
        org.w3c.dom.Document document7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = w3CDom0.asString(document7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0122");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory3 = null;
        w3CDom2.factory = documentBuilderFactory3;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory5 = w3CDom2.factory;
        org.jsoup.helper.W3CDom w3CDom6 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom6.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom6.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom11 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory12 = w3CDom11.factory;
        w3CDom6.factory = documentBuilderFactory12;
        org.jsoup.helper.W3CDom w3CDom14 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom16 = w3CDom14.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom14.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom19 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory20 = w3CDom19.factory;
        w3CDom14.factory = documentBuilderFactory20;
        w3CDom6.factory = documentBuilderFactory20;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory23 = w3CDom6.factory;
        w3CDom2.factory = documentBuilderFactory23;
        org.jsoup.nodes.Document document25 = null;
        org.w3c.dom.Document document26 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom2.convert(document25, document26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNull(documentBuilderFactory5);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(documentBuilderFactory12);
        org.junit.Assert.assertNotNull(w3CDom16);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(documentBuilderFactory20);
        org.junit.Assert.assertNotNull(documentBuilderFactory23);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0123");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.nodes.Document document5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document6 = w3CDom4.fromJsoup(document5);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0124");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory1 = w3CDom0.factory;
        boolean boolean2 = w3CDom0.namespaceAware();
        org.jsoup.nodes.Document document3 = null;
        org.w3c.dom.Document document4 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom0.convert(document3, document4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(documentBuilderFactory1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0125");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.nodes.Document document5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document6 = w3CDom0.fromJsoup(document5);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0126");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom2.namespaceAware(true);
        org.w3c.dom.Document document9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node10 = w3CDom8.contextNode(document9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0127");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom21 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom22 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom24 = w3CDom22.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom26 = w3CDom22.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom27 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory28 = w3CDom27.factory;
        w3CDom22.factory = documentBuilderFactory28;
        w3CDom21.factory = documentBuilderFactory28;
        w3CDom20.factory = documentBuilderFactory28;
        org.w3c.dom.Document document32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node33 = w3CDom20.contextNode(document32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom24);
        org.junit.Assert.assertNotNull(w3CDom26);
        org.junit.Assert.assertNotNull(documentBuilderFactory28);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0128");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory3 = null;
        w3CDom2.factory = documentBuilderFactory3;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory5 = w3CDom2.factory;
        org.w3c.dom.Document document7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList8 = w3CDom2.selectXpath("hi!", document7);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNull(documentBuilderFactory5);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0129");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.w3c.dom.Document document5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = w3CDom2.asString(document5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0130");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.w3c.dom.Document document17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = w3CDom0.asString(document17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0131");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        boolean boolean7 = w3CDom4.namespaceAware();
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document9 = w3CDom4.fromJsoup(element8);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0132");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom1 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom3 = w3CDom1.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom5 = w3CDom1.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory7 = w3CDom6.factory;
        w3CDom1.factory = documentBuilderFactory7;
        w3CDom0.factory = documentBuilderFactory7;
        org.jsoup.nodes.Element element10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document11 = w3CDom0.fromJsoup(element10);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom3);
        org.junit.Assert.assertNotNull(w3CDom5);
        org.junit.Assert.assertNotNull(documentBuilderFactory7);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0133");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.w3c.dom.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList5 = w3CDom2.selectXpath("jsoupSource", node4);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0134");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.nodes.Document document17 = null;
        org.w3c.dom.Document document18 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom0.convert(document17, document18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0135");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.nodes.Document document7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document8 = w3CDom6.fromJsoup(document7);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0136");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom4.namespaceAware(false);
        org.w3c.dom.Document document9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node10 = w3CDom8.contextNode(document9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0137");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory3 = w3CDom0.factory;
        org.w3c.dom.Document document4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node5 = w3CDom0.contextNode(document4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(documentBuilderFactory3);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0138");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom0.namespaceAware(false);
        org.w3c.dom.Document document7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node8 = w3CDom6.contextNode(document7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0139");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory3 = w3CDom0.factory;
        org.jsoup.helper.W3CDom w3CDom5 = w3CDom0.namespaceAware(false);
        org.w3c.dom.Document document6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node7 = w3CDom5.contextNode(document6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(documentBuilderFactory3);
        org.junit.Assert.assertNotNull(w3CDom5);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0140");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom2.namespaceAware(true);
        org.jsoup.nodes.Element element9 = null;
        org.w3c.dom.Document document10 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom2.convert(element9, document10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0141");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom2.namespaceAware(true);
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document10 = w3CDom8.fromJsoup(element9);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0142");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        boolean boolean3 = w3CDom0.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory4 = w3CDom0.factory;
        org.w3c.dom.Document document5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node6 = w3CDom0.contextNode(document5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(documentBuilderFactory4);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0143");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom4.namespaceAware(true);
        org.jsoup.nodes.Document document11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document12 = w3CDom10.fromJsoup(document11);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertNotNull(w3CDom10);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0144");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory3 = null;
        w3CDom2.factory = documentBuilderFactory3;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory5 = w3CDom2.factory;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom2.factory;
        boolean boolean7 = w3CDom2.namespaceAware();
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document9 = w3CDom2.fromJsoup(element8);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNull(documentBuilderFactory5);
        org.junit.Assert.assertNull(documentBuilderFactory6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0145");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory5 = w3CDom2.factory;
        org.w3c.dom.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList8 = w3CDom2.selectXpath("", node7);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'xpath' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory5);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0146");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        boolean boolean3 = w3CDom0.namespaceAware();
        boolean boolean4 = w3CDom0.namespaceAware();
        org.w3c.dom.Document document5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node6 = w3CDom0.contextNode(document5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0147");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom7 = w3CDom5.namespaceAware(true);
        boolean boolean8 = w3CDom5.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory9 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory9;
        org.jsoup.helper.W3CDom w3CDom11 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom13 = w3CDom11.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = null;
        w3CDom13.factory = documentBuilderFactory14;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory16 = w3CDom13.factory;
        org.jsoup.helper.W3CDom w3CDom17 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom19 = w3CDom17.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom21 = w3CDom17.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom22 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory23 = w3CDom22.factory;
        w3CDom17.factory = documentBuilderFactory23;
        org.jsoup.helper.W3CDom w3CDom25 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom27 = w3CDom25.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom29 = w3CDom25.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom30 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory31 = w3CDom30.factory;
        w3CDom25.factory = documentBuilderFactory31;
        w3CDom17.factory = documentBuilderFactory31;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory34 = w3CDom17.factory;
        w3CDom13.factory = documentBuilderFactory34;
        w3CDom0.factory = documentBuilderFactory34;
        org.w3c.dom.Document document37 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node38 = w3CDom0.contextNode(document37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(documentBuilderFactory9);
        org.junit.Assert.assertNotNull(w3CDom13);
        org.junit.Assert.assertNull(documentBuilderFactory16);
        org.junit.Assert.assertNotNull(w3CDom19);
        org.junit.Assert.assertNotNull(w3CDom21);
        org.junit.Assert.assertNotNull(documentBuilderFactory23);
        org.junit.Assert.assertNotNull(w3CDom27);
        org.junit.Assert.assertNotNull(w3CDom29);
        org.junit.Assert.assertNotNull(documentBuilderFactory31);
        org.junit.Assert.assertNotNull(documentBuilderFactory34);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0148");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(false);
        boolean boolean21 = w3CDom20.namespaceAware();
        org.w3c.dom.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList24 = w3CDom20.selectXpath("hi!", node23);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0149");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        org.jsoup.nodes.Element element19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document20 = w3CDom0.fromJsoup(element19);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0150");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom6.namespaceAware(false);
        org.jsoup.nodes.Element element9 = null;
        org.w3c.dom.Document document10 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom8.convert(element9, document10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0151");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        boolean boolean3 = w3CDom0.namespaceAware();
        boolean boolean4 = w3CDom0.namespaceAware();
        boolean boolean5 = w3CDom0.namespaceAware();
        org.jsoup.nodes.Element element6 = null;
        org.w3c.dom.Document document7 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom0.convert(element6, document7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0152");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom0.namespaceAware(true);
        org.w3c.dom.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList12 = w3CDom9.selectXpath("javax.xml.xpath.XPathFactory:jsoup", node11);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom9);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0153");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory3 = w3CDom0.factory;
        org.jsoup.helper.W3CDom w3CDom5 = w3CDom0.namespaceAware(false);
        org.jsoup.nodes.Document document6 = null;
        org.w3c.dom.Document document7 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom0.convert(document6, document7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(documentBuilderFactory3);
        org.junit.Assert.assertNotNull(w3CDom5);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0154");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom2.namespaceAware(true);
        org.jsoup.nodes.Document document9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document10 = w3CDom8.fromJsoup(document9);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0155");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory7 = w3CDom4.factory;
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom4.namespaceAware(false);
        org.jsoup.nodes.Document document10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document11 = w3CDom4.fromJsoup(document10);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(documentBuilderFactory7);
        org.junit.Assert.assertNotNull(w3CDom9);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0156");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory17 = w3CDom0.factory;
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory19 = w3CDom18.factory;
        w3CDom0.factory = documentBuilderFactory19;
        org.w3c.dom.Document document21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node22 = w3CDom0.contextNode(document21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(documentBuilderFactory17);
        org.junit.Assert.assertNotNull(documentBuilderFactory19);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0157");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom4.namespaceAware(true);
        org.w3c.dom.Document document11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = w3CDom4.asString(document11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertNotNull(w3CDom10);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0158");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.w3c.dom.Document document6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList7 = w3CDom4.selectXpath("", document6);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'xpath' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0159");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory1 = w3CDom0.factory;
        boolean boolean2 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom3 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom5 = w3CDom3.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom7 = w3CDom3.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        boolean boolean11 = w3CDom8.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory12 = w3CDom8.factory;
        w3CDom3.factory = documentBuilderFactory12;
        w3CDom0.factory = documentBuilderFactory12;
        org.w3c.dom.Document document15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = w3CDom0.asString(document15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(documentBuilderFactory1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(w3CDom5);
        org.junit.Assert.assertNotNull(w3CDom7);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(documentBuilderFactory12);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0160");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.w3c.dom.Document document6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList7 = w3CDom0.selectXpath("", document6);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'xpath' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0161");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory3 = w3CDom0.factory;
        java.lang.Class<?> wildcardClass4 = documentBuilderFactory3.getClass();
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(documentBuilderFactory3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0162");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory1 = w3CDom0.factory;
        boolean boolean2 = w3CDom0.namespaceAware();
        org.w3c.dom.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList5 = w3CDom0.selectXpath("hi!", node4);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(documentBuilderFactory1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0163");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom0.namespaceAware(true);
        org.jsoup.nodes.Document document10 = null;
        org.w3c.dom.Document document11 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom0.convert(document10, document11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom9);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0164");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom0.namespaceAware(false);
        org.w3c.dom.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList9 = w3CDom6.selectXpath("jsoupSource", node8);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0165");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        boolean boolean7 = w3CDom6.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom6.namespaceAware(false);
        org.w3c.dom.Document document11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList12 = w3CDom9.selectXpath("hi!", document11);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(w3CDom9);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0166");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom7 = w3CDom5.namespaceAware(true);
        boolean boolean8 = w3CDom5.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory9 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory9;
        org.jsoup.helper.W3CDom w3CDom11 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom13 = w3CDom11.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = null;
        w3CDom13.factory = documentBuilderFactory14;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory16 = w3CDom13.factory;
        org.jsoup.helper.W3CDom w3CDom17 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom19 = w3CDom17.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom21 = w3CDom17.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom22 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory23 = w3CDom22.factory;
        w3CDom17.factory = documentBuilderFactory23;
        org.jsoup.helper.W3CDom w3CDom25 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom27 = w3CDom25.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom29 = w3CDom25.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom30 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory31 = w3CDom30.factory;
        w3CDom25.factory = documentBuilderFactory31;
        w3CDom17.factory = documentBuilderFactory31;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory34 = w3CDom17.factory;
        w3CDom13.factory = documentBuilderFactory34;
        w3CDom0.factory = documentBuilderFactory34;
        java.lang.Class<?> wildcardClass37 = documentBuilderFactory34.getClass();
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(documentBuilderFactory9);
        org.junit.Assert.assertNotNull(w3CDom13);
        org.junit.Assert.assertNull(documentBuilderFactory16);
        org.junit.Assert.assertNotNull(w3CDom19);
        org.junit.Assert.assertNotNull(w3CDom21);
        org.junit.Assert.assertNotNull(documentBuilderFactory23);
        org.junit.Assert.assertNotNull(w3CDom27);
        org.junit.Assert.assertNotNull(w3CDom29);
        org.junit.Assert.assertNotNull(documentBuilderFactory31);
        org.junit.Assert.assertNotNull(documentBuilderFactory34);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0167");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        boolean boolean7 = w3CDom6.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom6.namespaceAware(false);
        boolean boolean10 = w3CDom6.namespaceAware();
        org.w3c.dom.Document document12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList13 = w3CDom6.selectXpath("javax.xml.xpath.XPathFactory:jsoup", document12);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0168");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory17 = w3CDom0.factory;
        org.jsoup.nodes.Document document18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document19 = w3CDom0.fromJsoup(document18);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(documentBuilderFactory17);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0169");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom0.namespaceAware(true);
        org.jsoup.nodes.Element element10 = null;
        org.w3c.dom.Document document11 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom0.convert(element10, document11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom9);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0170");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        org.jsoup.nodes.Element element19 = null;
        org.w3c.dom.Document document20 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom18.convert(element19, document20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0171");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory3 = null;
        w3CDom2.factory = documentBuilderFactory3;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory5 = w3CDom2.factory;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom2.factory;
        boolean boolean7 = w3CDom2.namespaceAware();
        java.lang.Class<?> wildcardClass8 = w3CDom2.getClass();
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNull(documentBuilderFactory5);
        org.junit.Assert.assertNull(documentBuilderFactory6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0172");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        boolean boolean3 = w3CDom0.namespaceAware();
        boolean boolean4 = w3CDom0.namespaceAware();
        boolean boolean5 = w3CDom0.namespaceAware();
        java.lang.Class<?> wildcardClass6 = w3CDom0.getClass();
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0173");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom6.namespaceAware(false);
        boolean boolean9 = w3CDom6.namespaceAware();
        org.jsoup.nodes.Element element10 = null;
        org.w3c.dom.Document document11 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom6.convert(element10, document11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0174");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(false);
        boolean boolean21 = w3CDom20.namespaceAware();
        org.jsoup.nodes.Element element22 = null;
        org.w3c.dom.Document document23 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom20.convert(element22, document23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0175");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom4.namespaceAware(true);
        org.jsoup.nodes.Document document9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document10 = w3CDom4.fromJsoup(document9);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0176");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        boolean boolean5 = w3CDom4.namespaceAware();
        boolean boolean6 = w3CDom4.namespaceAware();
        boolean boolean7 = w3CDom4.namespaceAware();
        org.jsoup.nodes.Document document8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document9 = w3CDom4.fromJsoup(document8);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0177");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom6.namespaceAware(false);
        org.w3c.dom.Document document9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = w3CDom6.asString(document9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0178");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.w3c.dom.Document document2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList3 = w3CDom0.selectXpath("jsoupSource", document2);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0179");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom0.namespaceAware(true);
        org.jsoup.nodes.Element element10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document11 = w3CDom0.fromJsoup(element10);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom9);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0180");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom4.namespaceAware(false);
        org.jsoup.nodes.Document document9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document10 = w3CDom8.fromJsoup(document9);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0181");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(false);
        org.w3c.dom.Document document21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = w3CDom20.asString(document21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(w3CDom20);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0182");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.w3c.dom.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList19 = w3CDom0.selectXpath("javax.xml.xpath.XPathFactory:jsoup", node18);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0183");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory3 = null;
        w3CDom2.factory = documentBuilderFactory3;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory5 = w3CDom2.factory;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom2.factory;
        boolean boolean7 = w3CDom2.namespaceAware();
        org.jsoup.nodes.Document document8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document9 = w3CDom2.fromJsoup(document8);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNull(documentBuilderFactory5);
        org.junit.Assert.assertNull(documentBuilderFactory6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0184");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        boolean boolean3 = w3CDom0.namespaceAware();
        org.w3c.dom.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList6 = w3CDom0.selectXpath("javax.xml.xpath.XPathFactory:jsoup", node5);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0185");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom6.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory9 = w3CDom6.factory;
        org.jsoup.nodes.Document document10 = null;
        org.w3c.dom.Document document11 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom6.convert(document10, document11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertNotNull(documentBuilderFactory9);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0186");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory3 = null;
        w3CDom2.factory = documentBuilderFactory3;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory5 = w3CDom2.factory;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom2.factory;
        org.jsoup.nodes.Document document7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document8 = w3CDom2.fromJsoup(document7);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNull(documentBuilderFactory5);
        org.junit.Assert.assertNull(documentBuilderFactory6);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0187");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory5 = w3CDom4.factory;
        org.jsoup.nodes.Document document6 = null;
        org.w3c.dom.Document document7 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom4.convert(document6, document7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory5);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0188");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom6.namespaceAware(false);
        org.w3c.dom.Document document9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = w3CDom8.asString(document9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0189");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        boolean boolean3 = w3CDom0.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory4 = w3CDom0.factory;
        org.jsoup.nodes.Element element5 = null;
        org.w3c.dom.Document document6 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom0.convert(element5, document6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(documentBuilderFactory4);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0190");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        boolean boolean1 = w3CDom0.namespaceAware();
        org.w3c.dom.Node node3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList4 = w3CDom0.selectXpath("jsoupSource", node3);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0191");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.w3c.dom.Document document4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList5 = w3CDom0.selectXpath("javax.xml.xpath.XPathFactory:jsoup", document4);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0192");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory3 = null;
        w3CDom2.factory = documentBuilderFactory3;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory5 = w3CDom2.factory;
        org.jsoup.helper.W3CDom w3CDom6 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom6.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom6.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom11 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory12 = w3CDom11.factory;
        w3CDom6.factory = documentBuilderFactory12;
        org.jsoup.helper.W3CDom w3CDom14 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom16 = w3CDom14.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom14.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom19 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory20 = w3CDom19.factory;
        w3CDom14.factory = documentBuilderFactory20;
        w3CDom6.factory = documentBuilderFactory20;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory23 = w3CDom6.factory;
        w3CDom2.factory = documentBuilderFactory23;
        org.w3c.dom.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList27 = w3CDom2.selectXpath("", node26);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'xpath' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNull(documentBuilderFactory5);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(documentBuilderFactory12);
        org.junit.Assert.assertNotNull(w3CDom16);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(documentBuilderFactory20);
        org.junit.Assert.assertNotNull(documentBuilderFactory23);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0193");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.w3c.dom.Document document8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList9 = w3CDom4.selectXpath("hi!", document8);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0194");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        java.lang.Class<?> wildcardClass19 = w3CDom18.getClass();
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0195");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        boolean boolean5 = w3CDom4.namespaceAware();
        boolean boolean6 = w3CDom4.namespaceAware();
        boolean boolean7 = w3CDom4.namespaceAware();
        org.w3c.dom.Document document8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = w3CDom4.asString(document8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0196");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom4.namespaceAware(true);
        org.jsoup.nodes.Element element9 = null;
        org.w3c.dom.Document document10 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom4.convert(element9, document10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0197");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.w3c.dom.Document document6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList7 = w3CDom4.selectXpath("jsoupSource", document6);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0198");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory7 = w3CDom4.factory;
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom4.namespaceAware(false);
        org.jsoup.nodes.Element element10 = null;
        org.w3c.dom.Document document11 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom9.convert(element10, document11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(documentBuilderFactory7);
        org.junit.Assert.assertNotNull(w3CDom9);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0199");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom7 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom7.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom11 = w3CDom9.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = w3CDom11.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom11.factory;
        w3CDom6.factory = documentBuilderFactory14;
        org.w3c.dom.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList18 = w3CDom6.selectXpath("hi!", node17);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertNotNull(w3CDom11);
        org.junit.Assert.assertNotNull(w3CDom13);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0200");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom4.namespaceAware(true);
        boolean boolean9 = w3CDom4.namespaceAware();
        org.w3c.dom.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList12 = w3CDom4.selectXpath("jsoupSource", node11);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0201");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        boolean boolean5 = w3CDom4.namespaceAware();
        boolean boolean6 = w3CDom4.namespaceAware();
        boolean boolean7 = w3CDom4.namespaceAware();
        org.jsoup.nodes.Document document8 = null;
        org.w3c.dom.Document document9 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom4.convert(document8, document9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0202");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory1 = w3CDom0.factory;
        org.w3c.dom.Document document2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = w3CDom0.asString(document2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(documentBuilderFactory1);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0203");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document8 = w3CDom6.fromJsoup(element7);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0204");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom4.namespaceAware(false);
        org.jsoup.nodes.Document document9 = null;
        org.w3c.dom.Document document10 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom4.convert(document9, document10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0205");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        boolean boolean7 = w3CDom4.namespaceAware();
        boolean boolean8 = w3CDom4.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom4.namespaceAware(false);
        boolean boolean11 = w3CDom4.namespaceAware();
        org.w3c.dom.Document document12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node13 = w3CDom4.contextNode(document12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0206");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.w3c.dom.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList9 = w3CDom6.selectXpath("", node8);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'xpath' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0207");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(false);
        org.jsoup.nodes.Document document21 = null;
        org.w3c.dom.Document document22 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom18.convert(document21, document22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(w3CDom20);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0208");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(false);
        boolean boolean21 = w3CDom20.namespaceAware();
        org.jsoup.nodes.Element element22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document23 = w3CDom20.fromJsoup(element22);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0209");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom9 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom11 = w3CDom9.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom13 = w3CDom11.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom15 = w3CDom11.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom16 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory17 = w3CDom16.factory;
        w3CDom11.factory = documentBuilderFactory17;
        w3CDom4.factory = documentBuilderFactory17;
        org.jsoup.nodes.Document document20 = null;
        org.w3c.dom.Document document21 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom4.convert(document20, document21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertNotNull(w3CDom11);
        org.junit.Assert.assertNotNull(w3CDom13);
        org.junit.Assert.assertNotNull(w3CDom15);
        org.junit.Assert.assertNotNull(documentBuilderFactory17);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0210");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom7 = w3CDom5.namespaceAware(true);
        boolean boolean8 = w3CDom5.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory9 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory9;
        org.w3c.dom.Document document12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList13 = w3CDom0.selectXpath("javax.xml.xpath.XPathFactory:jsoup", document12);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(documentBuilderFactory9);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0211");
        org.w3c.dom.Document document0 = null;
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = org.jsoup.helper.W3CDom.OutputXml();
        java.util.Properties properties2 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        java.util.Properties properties3 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        java.util.Properties properties4 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        java.util.Properties properties5 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.jsoup.helper.W3CDom.asString(document0, (java.util.Map<java.lang.String, java.lang.String>) strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(properties5);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0212");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory7 = w3CDom4.factory;
        org.w3c.dom.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList10 = w3CDom4.selectXpath("javax.xml.xpath.XPathFactory:jsoup", node9);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(documentBuilderFactory7);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0213");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom4.namespaceAware(true);
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document10 = w3CDom4.fromJsoup(element9);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0214");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        boolean boolean19 = w3CDom0.namespaceAware();
        java.lang.Class<?> wildcardClass20 = w3CDom0.getClass();
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0215");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory10 = w3CDom0.factory;
        org.jsoup.nodes.Element element11 = null;
        org.w3c.dom.Document document12 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom0.convert(element11, document12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertNotNull(documentBuilderFactory10);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0216");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory5 = w3CDom2.factory;
        org.jsoup.nodes.Element element6 = null;
        org.w3c.dom.Document document7 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom2.convert(element6, document7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory5);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0217");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom2.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom2.namespaceAware(false);
        org.w3c.dom.Document document11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node12 = w3CDom2.contextNode(document11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertNotNull(w3CDom10);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0218");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory7 = w3CDom4.factory;
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom10 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom10.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom14 = w3CDom10.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom15 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory16 = w3CDom15.factory;
        w3CDom10.factory = documentBuilderFactory16;
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom22 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom23 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory24 = w3CDom23.factory;
        w3CDom18.factory = documentBuilderFactory24;
        w3CDom10.factory = documentBuilderFactory24;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory27 = w3CDom10.factory;
        w3CDom9.factory = documentBuilderFactory27;
        java.lang.Class<?> wildcardClass29 = w3CDom9.getClass();
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(documentBuilderFactory7);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(w3CDom14);
        org.junit.Assert.assertNotNull(documentBuilderFactory16);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom22);
        org.junit.Assert.assertNotNull(documentBuilderFactory24);
        org.junit.Assert.assertNotNull(documentBuilderFactory27);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0219");
        org.w3c.dom.Document document0 = null;
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = org.jsoup.helper.W3CDom.OutputHtml();
        java.util.Properties properties2 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        java.util.Properties properties3 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        java.util.Properties properties4 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.jsoup.helper.W3CDom.asString(document0, (java.util.Map<java.lang.String, java.lang.String>) strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(properties4);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0220");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory7 = w3CDom4.factory;
        org.jsoup.nodes.Document document8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document9 = w3CDom4.fromJsoup(document8);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(documentBuilderFactory7);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0221");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom4.namespaceAware(true);
        org.jsoup.nodes.Document document9 = null;
        org.w3c.dom.Document document10 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom4.convert(document9, document10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0222");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory7 = w3CDom4.factory;
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom4.namespaceAware(false);
        org.jsoup.nodes.Document document10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document11 = w3CDom9.fromJsoup(document10);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(documentBuilderFactory7);
        org.junit.Assert.assertNotNull(w3CDom9);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0223");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        boolean boolean7 = w3CDom4.namespaceAware();
        boolean boolean8 = w3CDom4.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom4.namespaceAware(false);
        org.w3c.dom.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList13 = w3CDom4.selectXpath("jsoupSource", node12);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(w3CDom10);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0224");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        boolean boolean3 = w3CDom0.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory4 = w3CDom0.factory;
        java.lang.Class<?> wildcardClass5 = documentBuilderFactory4.getClass();
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(documentBuilderFactory4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0225");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        boolean boolean7 = w3CDom4.namespaceAware();
        boolean boolean8 = w3CDom4.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom4.namespaceAware(false);
        org.w3c.dom.Document document11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node12 = w3CDom4.contextNode(document11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(w3CDom10);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0226");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        boolean boolean17 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom22 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom23 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory24 = w3CDom23.factory;
        w3CDom18.factory = documentBuilderFactory24;
        org.jsoup.helper.W3CDom w3CDom26 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom28 = w3CDom26.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom30 = w3CDom26.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom31 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory32 = w3CDom31.factory;
        w3CDom26.factory = documentBuilderFactory32;
        w3CDom18.factory = documentBuilderFactory32;
        org.jsoup.helper.W3CDom w3CDom36 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom38 = w3CDom36.namespaceAware(false);
        boolean boolean39 = w3CDom38.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory40 = w3CDom38.factory;
        w3CDom0.factory = documentBuilderFactory40;
        org.jsoup.nodes.Document document42 = null;
        org.w3c.dom.Document document43 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom0.convert(document42, document43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom22);
        org.junit.Assert.assertNotNull(documentBuilderFactory24);
        org.junit.Assert.assertNotNull(w3CDom28);
        org.junit.Assert.assertNotNull(w3CDom30);
        org.junit.Assert.assertNotNull(documentBuilderFactory32);
        org.junit.Assert.assertNotNull(w3CDom36);
        org.junit.Assert.assertNotNull(w3CDom38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(documentBuilderFactory40);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0227");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        boolean boolean19 = w3CDom0.namespaceAware();
        org.w3c.dom.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList22 = w3CDom0.selectXpath("javax.xml.xpath.XPathFactory:jsoup", node21);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0228");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory3 = null;
        w3CDom2.factory = documentBuilderFactory3;
        org.jsoup.nodes.Document document5 = null;
        org.w3c.dom.Document document6 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom2.convert(document5, document6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0229");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom2.namespaceAware(true);
        org.w3c.dom.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList11 = w3CDom2.selectXpath("javax.xml.xpath.XPathFactory:jsoup", node10);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0230");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom7 = w3CDom5.namespaceAware(true);
        boolean boolean8 = w3CDom5.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory9 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory9;
        org.jsoup.nodes.Document document11 = null;
        org.w3c.dom.Document document12 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom0.convert(document11, document12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(documentBuilderFactory9);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0231");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory3 = null;
        w3CDom2.factory = documentBuilderFactory3;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory5 = w3CDom2.factory;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom2.factory;
        org.jsoup.nodes.Element element7 = null;
        org.w3c.dom.Document document8 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom2.convert(element7, document8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNull(documentBuilderFactory5);
        org.junit.Assert.assertNull(documentBuilderFactory6);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0232");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        boolean boolean3 = w3CDom0.namespaceAware();
        boolean boolean4 = w3CDom0.namespaceAware();
        boolean boolean5 = w3CDom0.namespaceAware();
        org.jsoup.nodes.Document document6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document7 = w3CDom0.fromJsoup(document6);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0233");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.nodes.Document document5 = null;
        org.w3c.dom.Document document6 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom4.convert(document5, document6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0234");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory17 = w3CDom0.factory;
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom22 = w3CDom20.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom24 = w3CDom20.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom25 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory26 = w3CDom25.factory;
        w3CDom20.factory = documentBuilderFactory26;
        w3CDom0.factory = documentBuilderFactory26;
        java.lang.Class<?> wildcardClass29 = documentBuilderFactory26.getClass();
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(documentBuilderFactory17);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom22);
        org.junit.Assert.assertNotNull(w3CDom24);
        org.junit.Assert.assertNotNull(documentBuilderFactory26);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0235");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        boolean boolean3 = w3CDom0.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory4 = w3CDom0.factory;
        org.jsoup.nodes.Document document5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document6 = w3CDom0.fromJsoup(document5);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(documentBuilderFactory4);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0236");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.nodes.Element element3 = null;
        org.w3c.dom.Document document4 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom2.convert(element3, document4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0237");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory17 = w3CDom0.factory;
        org.jsoup.nodes.Element element18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document19 = w3CDom0.fromJsoup(element18);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(documentBuilderFactory17);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0238");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        boolean boolean17 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom22 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom23 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory24 = w3CDom23.factory;
        w3CDom18.factory = documentBuilderFactory24;
        org.jsoup.helper.W3CDom w3CDom26 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom28 = w3CDom26.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom30 = w3CDom26.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom31 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory32 = w3CDom31.factory;
        w3CDom26.factory = documentBuilderFactory32;
        w3CDom18.factory = documentBuilderFactory32;
        org.jsoup.helper.W3CDom w3CDom36 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom38 = w3CDom36.namespaceAware(false);
        boolean boolean39 = w3CDom38.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory40 = w3CDom38.factory;
        w3CDom0.factory = documentBuilderFactory40;
        boolean boolean42 = w3CDom0.namespaceAware();
        org.w3c.dom.Document document43 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node44 = w3CDom0.contextNode(document43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom22);
        org.junit.Assert.assertNotNull(documentBuilderFactory24);
        org.junit.Assert.assertNotNull(w3CDom28);
        org.junit.Assert.assertNotNull(w3CDom30);
        org.junit.Assert.assertNotNull(documentBuilderFactory32);
        org.junit.Assert.assertNotNull(w3CDom36);
        org.junit.Assert.assertNotNull(w3CDom38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(documentBuilderFactory40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0239");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        boolean boolean3 = w3CDom0.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory4 = w3CDom0.factory;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory5 = null;
        w3CDom0.factory = documentBuilderFactory5;
        boolean boolean7 = w3CDom0.namespaceAware();
        org.jsoup.nodes.Document document8 = null;
        org.w3c.dom.Document document9 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom0.convert(document8, document9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(documentBuilderFactory4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0240");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom7 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory8 = w3CDom7.factory;
        w3CDom2.factory = documentBuilderFactory8;
        org.w3c.dom.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList12 = w3CDom2.selectXpath("", node11);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'xpath' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(documentBuilderFactory8);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0241");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.nodes.Document document5 = null;
        org.w3c.dom.Document document6 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom0.convert(document5, document6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0242");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(false);
        boolean boolean21 = w3CDom20.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory22 = w3CDom20.factory;
        org.w3c.dom.Document document23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = w3CDom20.asString(document23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(documentBuilderFactory22);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0243");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document4 = w3CDom2.fromJsoup(element3);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0244");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom4.namespaceAware(true);
        boolean boolean9 = w3CDom4.namespaceAware();
        org.w3c.dom.Document document11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList12 = w3CDom4.selectXpath("javax.xml.xpath.XPathFactory:jsoup", document11);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0245");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom7 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom7.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom11 = w3CDom9.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = w3CDom11.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom11.factory;
        w3CDom6.factory = documentBuilderFactory14;
        org.w3c.dom.Document document16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node17 = w3CDom6.contextNode(document16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertNotNull(w3CDom11);
        org.junit.Assert.assertNotNull(w3CDom13);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0246");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory7 = w3CDom4.factory;
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom4.namespaceAware(false);
        org.w3c.dom.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList12 = w3CDom9.selectXpath("javax.xml.xpath.XPathFactory:jsoup", node11);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(documentBuilderFactory7);
        org.junit.Assert.assertNotNull(w3CDom9);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0247");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        boolean boolean3 = w3CDom0.namespaceAware();
        org.jsoup.nodes.Element element4 = null;
        org.w3c.dom.Document document5 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom0.convert(element4, document5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0248");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory17 = w3CDom0.factory;
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom22 = w3CDom20.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom24 = w3CDom20.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom25 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory26 = w3CDom25.factory;
        w3CDom20.factory = documentBuilderFactory26;
        w3CDom0.factory = documentBuilderFactory26;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory29 = w3CDom0.factory;
        org.w3c.dom.Document document31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList32 = w3CDom0.selectXpath("", document31);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'xpath' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(documentBuilderFactory17);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom22);
        org.junit.Assert.assertNotNull(w3CDom24);
        org.junit.Assert.assertNotNull(documentBuilderFactory26);
        org.junit.Assert.assertNotNull(documentBuilderFactory29);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0249");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        boolean boolean3 = w3CDom0.namespaceAware();
        org.w3c.dom.Document document4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node5 = w3CDom0.contextNode(document4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0250");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom6.namespaceAware(false);
        org.w3c.dom.Document document10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList11 = w3CDom8.selectXpath("hi!", document10);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0251");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory1 = w3CDom0.factory;
        org.jsoup.helper.W3CDom w3CDom3 = w3CDom0.namespaceAware(true);
        org.w3c.dom.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList6 = w3CDom3.selectXpath("", node5);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'xpath' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(documentBuilderFactory1);
        org.junit.Assert.assertNotNull(w3CDom3);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0252");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory3 = w3CDom0.factory;
        org.jsoup.helper.W3CDom w3CDom5 = w3CDom0.namespaceAware(false);
        org.w3c.dom.Document document7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList8 = w3CDom5.selectXpath("", document7);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'xpath' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(documentBuilderFactory3);
        org.junit.Assert.assertNotNull(w3CDom5);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0253");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory7 = w3CDom4.factory;
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom10 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom10.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom14 = w3CDom10.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom15 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory16 = w3CDom15.factory;
        w3CDom10.factory = documentBuilderFactory16;
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom22 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom23 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory24 = w3CDom23.factory;
        w3CDom18.factory = documentBuilderFactory24;
        w3CDom10.factory = documentBuilderFactory24;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory27 = w3CDom10.factory;
        w3CDom9.factory = documentBuilderFactory27;
        org.w3c.dom.Document document29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node30 = w3CDom9.contextNode(document29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(documentBuilderFactory7);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(w3CDom14);
        org.junit.Assert.assertNotNull(documentBuilderFactory16);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom22);
        org.junit.Assert.assertNotNull(documentBuilderFactory24);
        org.junit.Assert.assertNotNull(documentBuilderFactory27);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0254");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        boolean boolean3 = w3CDom0.namespaceAware();
        boolean boolean4 = w3CDom0.namespaceAware();
        boolean boolean5 = w3CDom0.namespaceAware();
        org.jsoup.nodes.Document document6 = null;
        org.w3c.dom.Document document7 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom0.convert(document6, document7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0255");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom4.namespaceAware(true);
        org.w3c.dom.Document document9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node10 = w3CDom4.contextNode(document9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0256");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom17 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom19 = w3CDom17.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom21 = w3CDom17.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom22 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory23 = w3CDom22.factory;
        w3CDom17.factory = documentBuilderFactory23;
        org.jsoup.helper.W3CDom w3CDom25 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom27 = w3CDom25.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom29 = w3CDom25.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom30 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory31 = w3CDom30.factory;
        w3CDom25.factory = documentBuilderFactory31;
        w3CDom17.factory = documentBuilderFactory31;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory34 = w3CDom17.factory;
        w3CDom0.factory = documentBuilderFactory34;
        org.w3c.dom.Document document36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node37 = w3CDom0.contextNode(document36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom19);
        org.junit.Assert.assertNotNull(w3CDom21);
        org.junit.Assert.assertNotNull(documentBuilderFactory23);
        org.junit.Assert.assertNotNull(w3CDom27);
        org.junit.Assert.assertNotNull(w3CDom29);
        org.junit.Assert.assertNotNull(documentBuilderFactory31);
        org.junit.Assert.assertNotNull(documentBuilderFactory34);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0257");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory3 = null;
        w3CDom2.factory = documentBuilderFactory3;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory5 = w3CDom2.factory;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom2.factory;
        boolean boolean7 = w3CDom2.namespaceAware();
        boolean boolean8 = w3CDom2.namespaceAware();
        org.jsoup.nodes.Document document9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document10 = w3CDom2.fromJsoup(document9);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNull(documentBuilderFactory5);
        org.junit.Assert.assertNull(documentBuilderFactory6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0258");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory3 = w3CDom2.factory;
        org.w3c.dom.Document document4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node5 = w3CDom2.contextNode(document4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(documentBuilderFactory3);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0259");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        boolean boolean7 = w3CDom6.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom6.namespaceAware(false);
        org.jsoup.nodes.Document document10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document11 = w3CDom9.fromJsoup(document10);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(w3CDom9);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0260");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory3 = w3CDom2.factory;
        org.w3c.dom.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList6 = w3CDom2.selectXpath("jsoupSource", node5);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(documentBuilderFactory3);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0261");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        boolean boolean17 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom22 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom23 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory24 = w3CDom23.factory;
        w3CDom18.factory = documentBuilderFactory24;
        org.jsoup.helper.W3CDom w3CDom26 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom28 = w3CDom26.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom30 = w3CDom26.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom31 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory32 = w3CDom31.factory;
        w3CDom26.factory = documentBuilderFactory32;
        w3CDom18.factory = documentBuilderFactory32;
        org.jsoup.helper.W3CDom w3CDom36 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom38 = w3CDom36.namespaceAware(false);
        boolean boolean39 = w3CDom38.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory40 = w3CDom38.factory;
        w3CDom0.factory = documentBuilderFactory40;
        org.jsoup.helper.W3CDom w3CDom43 = w3CDom0.namespaceAware(true);
        org.w3c.dom.Document document44 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str45 = w3CDom0.asString(document44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom22);
        org.junit.Assert.assertNotNull(documentBuilderFactory24);
        org.junit.Assert.assertNotNull(w3CDom28);
        org.junit.Assert.assertNotNull(w3CDom30);
        org.junit.Assert.assertNotNull(documentBuilderFactory32);
        org.junit.Assert.assertNotNull(w3CDom36);
        org.junit.Assert.assertNotNull(w3CDom38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(documentBuilderFactory40);
        org.junit.Assert.assertNotNull(w3CDom43);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0262");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        boolean boolean3 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom5 = w3CDom0.namespaceAware(false);
        org.w3c.dom.Document document7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList8 = w3CDom5.selectXpath("", document7);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'xpath' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(w3CDom5);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0263");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory7 = w3CDom4.factory;
        org.jsoup.nodes.Document document8 = null;
        org.w3c.dom.Document document9 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom4.convert(document8, document9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(documentBuilderFactory7);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0264");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom4.namespaceAware(true);
        boolean boolean11 = w3CDom4.namespaceAware();
        org.jsoup.nodes.Element element12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document13 = w3CDom4.fromJsoup(element12);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0265");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory17 = w3CDom0.factory;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory18 = null;
        w3CDom0.factory = documentBuilderFactory18;
        org.w3c.dom.Document document20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node21 = w3CDom0.contextNode(document20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(documentBuilderFactory17);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0266");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom1 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom3 = w3CDom1.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom5 = w3CDom1.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory7 = w3CDom6.factory;
        w3CDom1.factory = documentBuilderFactory7;
        w3CDom0.factory = documentBuilderFactory7;
        org.jsoup.helper.W3CDom w3CDom10 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom10.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom14 = w3CDom10.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom15 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory16 = w3CDom15.factory;
        w3CDom10.factory = documentBuilderFactory16;
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom22 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom23 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory24 = w3CDom23.factory;
        w3CDom18.factory = documentBuilderFactory24;
        w3CDom10.factory = documentBuilderFactory24;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory27 = w3CDom10.factory;
        org.jsoup.helper.W3CDom w3CDom28 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory29 = w3CDom28.factory;
        w3CDom10.factory = documentBuilderFactory29;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory31 = w3CDom10.factory;
        w3CDom0.factory = documentBuilderFactory31;
        org.w3c.dom.Node node34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList35 = w3CDom0.selectXpath("javax.xml.xpath.XPathFactory:jsoup", node34);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom3);
        org.junit.Assert.assertNotNull(w3CDom5);
        org.junit.Assert.assertNotNull(documentBuilderFactory7);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(w3CDom14);
        org.junit.Assert.assertNotNull(documentBuilderFactory16);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom22);
        org.junit.Assert.assertNotNull(documentBuilderFactory24);
        org.junit.Assert.assertNotNull(documentBuilderFactory27);
        org.junit.Assert.assertNotNull(documentBuilderFactory29);
        org.junit.Assert.assertNotNull(documentBuilderFactory31);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0267");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory5 = w3CDom2.factory;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom2.factory;
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom2.namespaceAware(true);
        org.jsoup.nodes.Element element9 = null;
        org.w3c.dom.Document document10 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom2.convert(element9, document10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory5);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom8);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0268");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom21 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom23 = w3CDom21.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory24 = null;
        w3CDom23.factory = documentBuilderFactory24;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory26 = w3CDom23.factory;
        org.jsoup.helper.W3CDom w3CDom27 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom29 = w3CDom27.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom31 = w3CDom27.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom32 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory33 = w3CDom32.factory;
        w3CDom27.factory = documentBuilderFactory33;
        org.jsoup.helper.W3CDom w3CDom35 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom37 = w3CDom35.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom39 = w3CDom35.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom40 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory41 = w3CDom40.factory;
        w3CDom35.factory = documentBuilderFactory41;
        w3CDom27.factory = documentBuilderFactory41;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory44 = w3CDom27.factory;
        w3CDom23.factory = documentBuilderFactory44;
        w3CDom20.factory = documentBuilderFactory44;
        org.w3c.dom.Node node48 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList49 = w3CDom20.selectXpath("", node48);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'xpath' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom23);
        org.junit.Assert.assertNull(documentBuilderFactory26);
        org.junit.Assert.assertNotNull(w3CDom29);
        org.junit.Assert.assertNotNull(w3CDom31);
        org.junit.Assert.assertNotNull(documentBuilderFactory33);
        org.junit.Assert.assertNotNull(w3CDom37);
        org.junit.Assert.assertNotNull(w3CDom39);
        org.junit.Assert.assertNotNull(documentBuilderFactory41);
        org.junit.Assert.assertNotNull(documentBuilderFactory44);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0269");
        org.w3c.dom.Document document0 = null;
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = org.jsoup.helper.W3CDom.OutputHtml();
        java.util.Properties properties2 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        java.util.Properties properties3 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        java.util.Properties properties4 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        java.util.Properties properties5 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        java.util.Properties properties6 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.jsoup.helper.W3CDom.asString(document0, (java.util.Map<java.lang.String, java.lang.String>) strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertNotNull(properties6);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0270");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom6.namespaceAware(false);
        boolean boolean9 = w3CDom6.namespaceAware();
        boolean boolean10 = w3CDom6.namespaceAware();
        org.w3c.dom.Document document11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node12 = w3CDom6.contextNode(document11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0271");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom6.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom9 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom11 = w3CDom9.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom13 = w3CDom9.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom14 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory15 = w3CDom14.factory;
        w3CDom9.factory = documentBuilderFactory15;
        org.jsoup.helper.W3CDom w3CDom17 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom19 = w3CDom17.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom21 = w3CDom17.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom22 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory23 = w3CDom22.factory;
        w3CDom17.factory = documentBuilderFactory23;
        w3CDom9.factory = documentBuilderFactory23;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory26 = w3CDom9.factory;
        org.jsoup.helper.W3CDom w3CDom27 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory28 = w3CDom27.factory;
        w3CDom9.factory = documentBuilderFactory28;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory30 = w3CDom9.factory;
        w3CDom8.factory = documentBuilderFactory30;
        org.jsoup.helper.W3CDom w3CDom33 = w3CDom8.namespaceAware(false);
        org.w3c.dom.Node node35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList36 = w3CDom8.selectXpath("javax.xml.xpath.XPathFactory:jsoup", node35);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertNotNull(w3CDom11);
        org.junit.Assert.assertNotNull(w3CDom13);
        org.junit.Assert.assertNotNull(documentBuilderFactory15);
        org.junit.Assert.assertNotNull(w3CDom19);
        org.junit.Assert.assertNotNull(w3CDom21);
        org.junit.Assert.assertNotNull(documentBuilderFactory23);
        org.junit.Assert.assertNotNull(documentBuilderFactory26);
        org.junit.Assert.assertNotNull(documentBuilderFactory28);
        org.junit.Assert.assertNotNull(documentBuilderFactory30);
        org.junit.Assert.assertNotNull(w3CDom33);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0272");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        boolean boolean17 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom22 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom23 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory24 = w3CDom23.factory;
        w3CDom18.factory = documentBuilderFactory24;
        org.jsoup.helper.W3CDom w3CDom26 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom28 = w3CDom26.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom30 = w3CDom26.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom31 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory32 = w3CDom31.factory;
        w3CDom26.factory = documentBuilderFactory32;
        w3CDom18.factory = documentBuilderFactory32;
        org.jsoup.helper.W3CDom w3CDom36 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom38 = w3CDom36.namespaceAware(false);
        boolean boolean39 = w3CDom38.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory40 = w3CDom38.factory;
        w3CDom0.factory = documentBuilderFactory40;
        org.jsoup.helper.W3CDom w3CDom43 = w3CDom0.namespaceAware(true);
        org.jsoup.nodes.Element element44 = null;
        org.w3c.dom.Document document45 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom0.convert(element44, document45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom22);
        org.junit.Assert.assertNotNull(documentBuilderFactory24);
        org.junit.Assert.assertNotNull(w3CDom28);
        org.junit.Assert.assertNotNull(w3CDom30);
        org.junit.Assert.assertNotNull(documentBuilderFactory32);
        org.junit.Assert.assertNotNull(w3CDom36);
        org.junit.Assert.assertNotNull(w3CDom38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(documentBuilderFactory40);
        org.junit.Assert.assertNotNull(w3CDom43);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0273");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        boolean boolean7 = w3CDom6.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom6.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom11 = w3CDom9.namespaceAware(true);
        org.w3c.dom.Document document12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = w3CDom9.asString(document12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertNotNull(w3CDom11);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0274");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        boolean boolean7 = w3CDom6.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom6.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom10 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom10.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom14 = w3CDom12.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory15 = w3CDom12.factory;
        w3CDom9.factory = documentBuilderFactory15;
        org.jsoup.nodes.Document document17 = null;
        org.w3c.dom.Document document18 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom9.convert(document17, document18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(w3CDom14);
        org.junit.Assert.assertNotNull(documentBuilderFactory15);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0275");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom7 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom7.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom11 = w3CDom9.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = w3CDom11.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom11.factory;
        w3CDom6.factory = documentBuilderFactory14;
        org.jsoup.nodes.Element element16 = null;
        org.w3c.dom.Document document17 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom6.convert(element16, document17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertNotNull(w3CDom11);
        org.junit.Assert.assertNotNull(w3CDom13);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0276");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom4.namespaceAware(true);
        org.jsoup.nodes.Document document11 = null;
        org.w3c.dom.Document document12 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom4.convert(document11, document12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertNotNull(w3CDom10);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0277");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory7 = w3CDom6.factory;
        org.w3c.dom.Document document9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList10 = w3CDom6.selectXpath("", document9);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'xpath' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(documentBuilderFactory7);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0278");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom9 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom11 = w3CDom9.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom13 = w3CDom11.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom15 = w3CDom11.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom16 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory17 = w3CDom16.factory;
        w3CDom11.factory = documentBuilderFactory17;
        w3CDom4.factory = documentBuilderFactory17;
        org.jsoup.nodes.Element element20 = null;
        org.w3c.dom.Document document21 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom4.convert(element20, document21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertNotNull(w3CDom11);
        org.junit.Assert.assertNotNull(w3CDom13);
        org.junit.Assert.assertNotNull(w3CDom15);
        org.junit.Assert.assertNotNull(documentBuilderFactory17);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0279");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom4.namespaceAware(true);
        boolean boolean11 = w3CDom4.namespaceAware();
        org.w3c.dom.Document document12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node13 = w3CDom4.contextNode(document12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0280");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom6.namespaceAware(false);
        boolean boolean9 = w3CDom6.namespaceAware();
        boolean boolean10 = w3CDom6.namespaceAware();
        org.jsoup.nodes.Element element11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document12 = w3CDom6.fromJsoup(element11);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0281");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        boolean boolean7 = w3CDom6.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom6.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory10 = w3CDom6.factory;
        org.w3c.dom.Document document11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node12 = w3CDom6.contextNode(document11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertNotNull(documentBuilderFactory10);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0282");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        boolean boolean7 = w3CDom4.namespaceAware();
        boolean boolean8 = w3CDom4.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom4.namespaceAware(false);
        org.w3c.dom.Document document12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList13 = w3CDom10.selectXpath("jsoupSource", document12);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(w3CDom10);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0283");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom7 = w3CDom5.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom5.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom11 = w3CDom5.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom12 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom14 = w3CDom12.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom16 = w3CDom14.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom16.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory19 = w3CDom16.factory;
        w3CDom11.factory = documentBuilderFactory19;
        w3CDom4.factory = documentBuilderFactory19;
        java.lang.Class<?> wildcardClass22 = documentBuilderFactory19.getClass();
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom7);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertNotNull(w3CDom11);
        org.junit.Assert.assertNotNull(w3CDom14);
        org.junit.Assert.assertNotNull(w3CDom16);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(documentBuilderFactory19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0284");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        boolean boolean17 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom22 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom23 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory24 = w3CDom23.factory;
        w3CDom18.factory = documentBuilderFactory24;
        org.jsoup.helper.W3CDom w3CDom26 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom28 = w3CDom26.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom30 = w3CDom26.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom31 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory32 = w3CDom31.factory;
        w3CDom26.factory = documentBuilderFactory32;
        w3CDom18.factory = documentBuilderFactory32;
        org.jsoup.helper.W3CDom w3CDom36 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom38 = w3CDom36.namespaceAware(false);
        boolean boolean39 = w3CDom38.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory40 = w3CDom38.factory;
        w3CDom0.factory = documentBuilderFactory40;
        boolean boolean42 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom43 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom45 = w3CDom43.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom47 = w3CDom43.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom48 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory49 = w3CDom48.factory;
        w3CDom43.factory = documentBuilderFactory49;
        org.jsoup.helper.W3CDom w3CDom51 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom53 = w3CDom51.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom55 = w3CDom51.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom56 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory57 = w3CDom56.factory;
        w3CDom51.factory = documentBuilderFactory57;
        w3CDom43.factory = documentBuilderFactory57;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory60 = w3CDom43.factory;
        org.jsoup.helper.W3CDom w3CDom61 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom63 = w3CDom61.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom65 = w3CDom63.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom67 = w3CDom63.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom68 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory69 = w3CDom68.factory;
        w3CDom63.factory = documentBuilderFactory69;
        w3CDom43.factory = documentBuilderFactory69;
        w3CDom0.factory = documentBuilderFactory69;
        org.w3c.dom.Node node74 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList75 = w3CDom0.selectXpath("", node74);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'xpath' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom22);
        org.junit.Assert.assertNotNull(documentBuilderFactory24);
        org.junit.Assert.assertNotNull(w3CDom28);
        org.junit.Assert.assertNotNull(w3CDom30);
        org.junit.Assert.assertNotNull(documentBuilderFactory32);
        org.junit.Assert.assertNotNull(w3CDom36);
        org.junit.Assert.assertNotNull(w3CDom38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(documentBuilderFactory40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(w3CDom45);
        org.junit.Assert.assertNotNull(w3CDom47);
        org.junit.Assert.assertNotNull(documentBuilderFactory49);
        org.junit.Assert.assertNotNull(w3CDom53);
        org.junit.Assert.assertNotNull(w3CDom55);
        org.junit.Assert.assertNotNull(documentBuilderFactory57);
        org.junit.Assert.assertNotNull(documentBuilderFactory60);
        org.junit.Assert.assertNotNull(w3CDom63);
        org.junit.Assert.assertNotNull(w3CDom65);
        org.junit.Assert.assertNotNull(w3CDom67);
        org.junit.Assert.assertNotNull(documentBuilderFactory69);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0285");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory17 = w3CDom0.factory;
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory19 = w3CDom18.factory;
        w3CDom0.factory = documentBuilderFactory19;
        org.jsoup.helper.W3CDom w3CDom21 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom22 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom24 = w3CDom22.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom26 = w3CDom22.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom27 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory28 = w3CDom27.factory;
        w3CDom22.factory = documentBuilderFactory28;
        w3CDom21.factory = documentBuilderFactory28;
        org.jsoup.helper.W3CDom w3CDom31 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom33 = w3CDom31.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom35 = w3CDom31.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom36 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory37 = w3CDom36.factory;
        w3CDom31.factory = documentBuilderFactory37;
        org.jsoup.helper.W3CDom w3CDom39 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom41 = w3CDom39.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom43 = w3CDom39.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom44 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory45 = w3CDom44.factory;
        w3CDom39.factory = documentBuilderFactory45;
        w3CDom31.factory = documentBuilderFactory45;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory48 = w3CDom31.factory;
        org.jsoup.helper.W3CDom w3CDom49 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory50 = w3CDom49.factory;
        w3CDom31.factory = documentBuilderFactory50;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory52 = w3CDom31.factory;
        w3CDom21.factory = documentBuilderFactory52;
        w3CDom0.factory = documentBuilderFactory52;
        java.lang.Class<?> wildcardClass55 = documentBuilderFactory52.getClass();
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(documentBuilderFactory17);
        org.junit.Assert.assertNotNull(documentBuilderFactory19);
        org.junit.Assert.assertNotNull(w3CDom24);
        org.junit.Assert.assertNotNull(w3CDom26);
        org.junit.Assert.assertNotNull(documentBuilderFactory28);
        org.junit.Assert.assertNotNull(w3CDom33);
        org.junit.Assert.assertNotNull(w3CDom35);
        org.junit.Assert.assertNotNull(documentBuilderFactory37);
        org.junit.Assert.assertNotNull(w3CDom41);
        org.junit.Assert.assertNotNull(w3CDom43);
        org.junit.Assert.assertNotNull(documentBuilderFactory45);
        org.junit.Assert.assertNotNull(documentBuilderFactory48);
        org.junit.Assert.assertNotNull(documentBuilderFactory50);
        org.junit.Assert.assertNotNull(documentBuilderFactory52);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0286");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        boolean boolean5 = w3CDom4.namespaceAware();
        boolean boolean6 = w3CDom4.namespaceAware();
        org.w3c.dom.Document document7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = w3CDom4.asString(document7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0287");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom1 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom3 = w3CDom1.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom5 = w3CDom1.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory7 = w3CDom6.factory;
        w3CDom1.factory = documentBuilderFactory7;
        w3CDom0.factory = documentBuilderFactory7;
        org.jsoup.nodes.Document document10 = null;
        org.w3c.dom.Document document11 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom0.convert(document10, document11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom3);
        org.junit.Assert.assertNotNull(w3CDom5);
        org.junit.Assert.assertNotNull(documentBuilderFactory7);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0288");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom0.namespaceAware(false);
        org.jsoup.nodes.Document document7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document8 = w3CDom6.fromJsoup(document7);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0289");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory17 = w3CDom0.factory;
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory19 = w3CDom18.factory;
        w3CDom0.factory = documentBuilderFactory19;
        org.jsoup.helper.W3CDom w3CDom21 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom22 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom24 = w3CDom22.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom26 = w3CDom22.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom27 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory28 = w3CDom27.factory;
        w3CDom22.factory = documentBuilderFactory28;
        w3CDom21.factory = documentBuilderFactory28;
        org.jsoup.helper.W3CDom w3CDom31 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom33 = w3CDom31.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom35 = w3CDom31.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom36 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory37 = w3CDom36.factory;
        w3CDom31.factory = documentBuilderFactory37;
        org.jsoup.helper.W3CDom w3CDom39 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom41 = w3CDom39.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom43 = w3CDom39.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom44 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory45 = w3CDom44.factory;
        w3CDom39.factory = documentBuilderFactory45;
        w3CDom31.factory = documentBuilderFactory45;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory48 = w3CDom31.factory;
        org.jsoup.helper.W3CDom w3CDom49 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory50 = w3CDom49.factory;
        w3CDom31.factory = documentBuilderFactory50;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory52 = w3CDom31.factory;
        w3CDom21.factory = documentBuilderFactory52;
        w3CDom0.factory = documentBuilderFactory52;
        org.jsoup.nodes.Document document55 = null;
        org.w3c.dom.Document document56 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom0.convert(document55, document56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(documentBuilderFactory17);
        org.junit.Assert.assertNotNull(documentBuilderFactory19);
        org.junit.Assert.assertNotNull(w3CDom24);
        org.junit.Assert.assertNotNull(w3CDom26);
        org.junit.Assert.assertNotNull(documentBuilderFactory28);
        org.junit.Assert.assertNotNull(w3CDom33);
        org.junit.Assert.assertNotNull(w3CDom35);
        org.junit.Assert.assertNotNull(documentBuilderFactory37);
        org.junit.Assert.assertNotNull(w3CDom41);
        org.junit.Assert.assertNotNull(w3CDom43);
        org.junit.Assert.assertNotNull(documentBuilderFactory45);
        org.junit.Assert.assertNotNull(documentBuilderFactory48);
        org.junit.Assert.assertNotNull(documentBuilderFactory50);
        org.junit.Assert.assertNotNull(documentBuilderFactory52);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0290");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        boolean boolean17 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom22 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom23 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory24 = w3CDom23.factory;
        w3CDom18.factory = documentBuilderFactory24;
        org.jsoup.helper.W3CDom w3CDom26 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom28 = w3CDom26.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom30 = w3CDom26.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom31 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory32 = w3CDom31.factory;
        w3CDom26.factory = documentBuilderFactory32;
        w3CDom18.factory = documentBuilderFactory32;
        org.jsoup.helper.W3CDom w3CDom36 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom38 = w3CDom36.namespaceAware(false);
        boolean boolean39 = w3CDom38.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory40 = w3CDom38.factory;
        w3CDom0.factory = documentBuilderFactory40;
        org.jsoup.helper.W3CDom w3CDom43 = w3CDom0.namespaceAware(true);
        org.w3c.dom.Document document44 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node45 = w3CDom0.contextNode(document44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom22);
        org.junit.Assert.assertNotNull(documentBuilderFactory24);
        org.junit.Assert.assertNotNull(w3CDom28);
        org.junit.Assert.assertNotNull(w3CDom30);
        org.junit.Assert.assertNotNull(documentBuilderFactory32);
        org.junit.Assert.assertNotNull(w3CDom36);
        org.junit.Assert.assertNotNull(w3CDom38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(documentBuilderFactory40);
        org.junit.Assert.assertNotNull(w3CDom43);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0291");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        boolean boolean19 = w3CDom0.namespaceAware();
        org.jsoup.nodes.Document document20 = null;
        org.w3c.dom.Document document21 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom0.convert(document20, document21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0292");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom19 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom21 = w3CDom19.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom23 = w3CDom19.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom24 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory25 = w3CDom24.factory;
        w3CDom19.factory = documentBuilderFactory25;
        org.jsoup.helper.W3CDom w3CDom28 = w3CDom19.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory29 = w3CDom19.factory;
        w3CDom18.factory = documentBuilderFactory29;
        org.w3c.dom.Node node32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList33 = w3CDom18.selectXpath("", node32);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'xpath' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(w3CDom21);
        org.junit.Assert.assertNotNull(w3CDom23);
        org.junit.Assert.assertNotNull(documentBuilderFactory25);
        org.junit.Assert.assertNotNull(w3CDom28);
        org.junit.Assert.assertNotNull(documentBuilderFactory29);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0293");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom0.namespaceAware(true);
        org.jsoup.nodes.Document document10 = null;
        org.w3c.dom.Document document11 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom9.convert(document10, document11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom9);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0294");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        boolean boolean17 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom22 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom23 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory24 = w3CDom23.factory;
        w3CDom18.factory = documentBuilderFactory24;
        org.jsoup.helper.W3CDom w3CDom26 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom28 = w3CDom26.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom30 = w3CDom26.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom31 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory32 = w3CDom31.factory;
        w3CDom26.factory = documentBuilderFactory32;
        w3CDom18.factory = documentBuilderFactory32;
        org.jsoup.helper.W3CDom w3CDom36 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom38 = w3CDom36.namespaceAware(false);
        boolean boolean39 = w3CDom38.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory40 = w3CDom38.factory;
        w3CDom0.factory = documentBuilderFactory40;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory42 = w3CDom0.factory;
        org.jsoup.nodes.Element element43 = null;
        org.w3c.dom.Document document44 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom0.convert(element43, document44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom22);
        org.junit.Assert.assertNotNull(documentBuilderFactory24);
        org.junit.Assert.assertNotNull(w3CDom28);
        org.junit.Assert.assertNotNull(w3CDom30);
        org.junit.Assert.assertNotNull(documentBuilderFactory32);
        org.junit.Assert.assertNotNull(w3CDom36);
        org.junit.Assert.assertNotNull(w3CDom38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(documentBuilderFactory40);
        org.junit.Assert.assertNotNull(documentBuilderFactory42);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0295");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory21 = w3CDom18.factory;
        org.w3c.dom.Document document22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = w3CDom18.asString(document22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(documentBuilderFactory21);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0296");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory1 = w3CDom0.factory;
        boolean boolean2 = w3CDom0.namespaceAware();
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document4 = w3CDom0.fromJsoup(element3);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(documentBuilderFactory1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0297");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory3 = w3CDom2.factory;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory4 = w3CDom2.factory;
        org.w3c.dom.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList7 = w3CDom2.selectXpath("hi!", node6);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(documentBuilderFactory3);
        org.junit.Assert.assertNotNull(documentBuilderFactory4);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0298");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        boolean boolean3 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom5 = w3CDom0.namespaceAware(false);
        org.w3c.dom.Document document7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList8 = w3CDom0.selectXpath("hi!", document7);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(w3CDom5);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0299");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        boolean boolean3 = w3CDom0.namespaceAware();
        boolean boolean4 = w3CDom0.namespaceAware();
        boolean boolean5 = w3CDom0.namespaceAware();
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document7 = w3CDom0.fromJsoup(element6);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0300");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom21 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom22 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom24 = w3CDom22.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom26 = w3CDom22.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom27 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory28 = w3CDom27.factory;
        w3CDom22.factory = documentBuilderFactory28;
        w3CDom21.factory = documentBuilderFactory28;
        w3CDom20.factory = documentBuilderFactory28;
        boolean boolean32 = w3CDom20.namespaceAware();
        org.w3c.dom.Document document33 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = w3CDom20.asString(document33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom24);
        org.junit.Assert.assertNotNull(w3CDom26);
        org.junit.Assert.assertNotNull(documentBuilderFactory28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0301");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory7 = w3CDom4.factory;
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom4.namespaceAware(false);
        boolean boolean10 = w3CDom4.namespaceAware();
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(documentBuilderFactory7);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0302");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom4.namespaceAware(true);
        org.w3c.dom.Document document11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node12 = w3CDom4.contextNode(document11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertNotNull(w3CDom10);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0303");
        org.w3c.dom.Document document0 = null;
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = org.jsoup.helper.W3CDom.OutputHtml();
        java.util.Properties properties2 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        java.util.Properties properties3 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        java.util.Properties properties4 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        java.util.Properties properties5 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.jsoup.helper.W3CDom.asString(document0, (java.util.Map<java.lang.String, java.lang.String>) strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(properties5);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0304");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        boolean boolean7 = w3CDom6.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom6.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom10 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom10.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom14 = w3CDom12.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory15 = w3CDom12.factory;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory16 = w3CDom12.factory;
        w3CDom6.factory = documentBuilderFactory16;
        org.w3c.dom.Document document18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node19 = w3CDom6.contextNode(document18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(w3CDom14);
        org.junit.Assert.assertNotNull(documentBuilderFactory15);
        org.junit.Assert.assertNotNull(documentBuilderFactory16);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0305");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom4.namespaceAware(true);
        boolean boolean11 = w3CDom4.namespaceAware();
        org.jsoup.nodes.Document document12 = null;
        org.w3c.dom.Document document13 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom4.convert(document12, document13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0306");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom19 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom21 = w3CDom19.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom23 = w3CDom19.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom24 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory25 = w3CDom24.factory;
        w3CDom19.factory = documentBuilderFactory25;
        org.jsoup.helper.W3CDom w3CDom28 = w3CDom19.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory29 = w3CDom19.factory;
        w3CDom18.factory = documentBuilderFactory29;
        org.jsoup.nodes.Document document31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document32 = w3CDom18.fromJsoup(document31);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(w3CDom21);
        org.junit.Assert.assertNotNull(w3CDom23);
        org.junit.Assert.assertNotNull(documentBuilderFactory25);
        org.junit.Assert.assertNotNull(w3CDom28);
        org.junit.Assert.assertNotNull(documentBuilderFactory29);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0307");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory3 = w3CDom0.factory;
        org.jsoup.helper.W3CDom w3CDom5 = w3CDom0.namespaceAware(false);
        org.w3c.dom.Document document6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = w3CDom5.asString(document6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(documentBuilderFactory3);
        org.junit.Assert.assertNotNull(w3CDom5);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0308");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        boolean boolean19 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom21 = w3CDom0.namespaceAware(false);
        org.w3c.dom.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList24 = w3CDom21.selectXpath("", node23);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'xpath' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(w3CDom21);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0309");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        boolean boolean17 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom22 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom23 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory24 = w3CDom23.factory;
        w3CDom18.factory = documentBuilderFactory24;
        org.jsoup.helper.W3CDom w3CDom26 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom28 = w3CDom26.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom30 = w3CDom26.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom31 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory32 = w3CDom31.factory;
        w3CDom26.factory = documentBuilderFactory32;
        w3CDom18.factory = documentBuilderFactory32;
        org.jsoup.helper.W3CDom w3CDom36 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom38 = w3CDom36.namespaceAware(false);
        boolean boolean39 = w3CDom38.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory40 = w3CDom38.factory;
        w3CDom0.factory = documentBuilderFactory40;
        boolean boolean42 = w3CDom0.namespaceAware();
        org.w3c.dom.Node node44 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList45 = w3CDom0.selectXpath("hi!", node44);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom22);
        org.junit.Assert.assertNotNull(documentBuilderFactory24);
        org.junit.Assert.assertNotNull(w3CDom28);
        org.junit.Assert.assertNotNull(w3CDom30);
        org.junit.Assert.assertNotNull(documentBuilderFactory32);
        org.junit.Assert.assertNotNull(w3CDom36);
        org.junit.Assert.assertNotNull(w3CDom38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(documentBuilderFactory40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0310");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        org.w3c.dom.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList21 = w3CDom0.selectXpath("jsoupSource", node20);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0311");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory7 = w3CDom6.factory;
        java.lang.Class<?> wildcardClass8 = documentBuilderFactory7.getClass();
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(documentBuilderFactory7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0312");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory7 = w3CDom4.factory;
        org.w3c.dom.Document document9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList10 = w3CDom4.selectXpath("jsoupSource", document9);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(documentBuilderFactory7);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0313");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory10 = w3CDom0.factory;
        org.w3c.dom.Document document11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node12 = w3CDom0.contextNode(document11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertNotNull(documentBuilderFactory10);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0314");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom1 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom3 = w3CDom1.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom5 = w3CDom1.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory7 = w3CDom6.factory;
        w3CDom1.factory = documentBuilderFactory7;
        w3CDom0.factory = documentBuilderFactory7;
        java.lang.Class<?> wildcardClass10 = documentBuilderFactory7.getClass();
        org.junit.Assert.assertNotNull(w3CDom3);
        org.junit.Assert.assertNotNull(w3CDom5);
        org.junit.Assert.assertNotNull(documentBuilderFactory7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0315");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory7 = w3CDom6.factory;
        org.w3c.dom.Document document8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node9 = w3CDom6.contextNode(document8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(documentBuilderFactory7);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0316");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom0.namespaceAware(false);
        org.jsoup.nodes.Document document7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document8 = w3CDom0.fromJsoup(document7);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0317");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory7 = w3CDom4.factory;
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom4.namespaceAware(false);
        org.jsoup.nodes.Document document10 = null;
        org.w3c.dom.Document document11 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom4.convert(document10, document11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(documentBuilderFactory7);
        org.junit.Assert.assertNotNull(w3CDom9);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0318");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        boolean boolean5 = w3CDom4.namespaceAware();
        boolean boolean6 = w3CDom4.namespaceAware();
        org.jsoup.nodes.Element element7 = null;
        org.w3c.dom.Document document8 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom4.convert(element7, document8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0319");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom21 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom22 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom24 = w3CDom22.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom26 = w3CDom22.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom27 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory28 = w3CDom27.factory;
        w3CDom22.factory = documentBuilderFactory28;
        w3CDom21.factory = documentBuilderFactory28;
        w3CDom20.factory = documentBuilderFactory28;
        org.jsoup.helper.W3CDom w3CDom33 = w3CDom20.namespaceAware(false);
        org.w3c.dom.Document document35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList36 = w3CDom20.selectXpath("javax.xml.xpath.XPathFactory:jsoup", document35);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom24);
        org.junit.Assert.assertNotNull(w3CDom26);
        org.junit.Assert.assertNotNull(documentBuilderFactory28);
        org.junit.Assert.assertNotNull(w3CDom33);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0320");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory3 = null;
        w3CDom2.factory = documentBuilderFactory3;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory5 = w3CDom2.factory;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom2.factory;
        boolean boolean7 = w3CDom2.namespaceAware();
        org.w3c.dom.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList10 = w3CDom2.selectXpath("", node9);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'xpath' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNull(documentBuilderFactory5);
        org.junit.Assert.assertNull(documentBuilderFactory6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0321");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom0.namespaceAware(true);
        org.jsoup.nodes.Document document10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document11 = w3CDom9.fromJsoup(document10);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom9);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0322");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        boolean boolean3 = w3CDom0.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory4 = w3CDom0.factory;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory5 = null;
        w3CDom0.factory = documentBuilderFactory5;
        boolean boolean7 = w3CDom0.namespaceAware();
        org.w3c.dom.Document document8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node9 = w3CDom0.contextNode(document8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(documentBuilderFactory4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0323");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(false);
        org.w3c.dom.Document document22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList23 = w3CDom20.selectXpath("jsoupSource", document22);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(w3CDom20);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0324");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        boolean boolean19 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom21 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom23 = w3CDom0.namespaceAware(false);
        org.w3c.dom.Document document25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList26 = w3CDom23.selectXpath("", document25);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'xpath' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(w3CDom21);
        org.junit.Assert.assertNotNull(w3CDom23);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0325");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom6.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom9 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom11 = w3CDom9.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom13 = w3CDom9.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom14 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory15 = w3CDom14.factory;
        w3CDom9.factory = documentBuilderFactory15;
        org.jsoup.helper.W3CDom w3CDom17 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom19 = w3CDom17.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom21 = w3CDom17.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom22 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory23 = w3CDom22.factory;
        w3CDom17.factory = documentBuilderFactory23;
        w3CDom9.factory = documentBuilderFactory23;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory26 = w3CDom9.factory;
        org.jsoup.helper.W3CDom w3CDom27 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory28 = w3CDom27.factory;
        w3CDom9.factory = documentBuilderFactory28;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory30 = w3CDom9.factory;
        w3CDom8.factory = documentBuilderFactory30;
        org.jsoup.helper.W3CDom w3CDom33 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom35 = w3CDom33.namespaceAware(false);
        org.jsoup.nodes.Document document36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document37 = w3CDom33.fromJsoup(document36);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertNotNull(w3CDom11);
        org.junit.Assert.assertNotNull(w3CDom13);
        org.junit.Assert.assertNotNull(documentBuilderFactory15);
        org.junit.Assert.assertNotNull(w3CDom19);
        org.junit.Assert.assertNotNull(w3CDom21);
        org.junit.Assert.assertNotNull(documentBuilderFactory23);
        org.junit.Assert.assertNotNull(documentBuilderFactory26);
        org.junit.Assert.assertNotNull(documentBuilderFactory28);
        org.junit.Assert.assertNotNull(documentBuilderFactory30);
        org.junit.Assert.assertNotNull(w3CDom33);
        org.junit.Assert.assertNotNull(w3CDom35);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0326");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        boolean boolean19 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom21 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom23 = w3CDom0.namespaceAware(false);
        org.jsoup.nodes.Element element24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document25 = w3CDom0.fromJsoup(element24);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(w3CDom21);
        org.junit.Assert.assertNotNull(w3CDom23);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0327");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom2.namespaceAware(true);
        org.w3c.dom.Document document10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList11 = w3CDom8.selectXpath("jsoupSource", document10);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0328");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        boolean boolean7 = w3CDom6.namespaceAware();
        org.jsoup.nodes.Document document8 = null;
        org.w3c.dom.Document document9 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom6.convert(document8, document9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0329");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory3 = null;
        w3CDom2.factory = documentBuilderFactory3;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory5 = w3CDom2.factory;
        org.w3c.dom.Document document6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = w3CDom2.asString(document6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNull(documentBuilderFactory5);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0330");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom19 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom21 = w3CDom19.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom23 = w3CDom19.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom24 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory25 = w3CDom24.factory;
        w3CDom19.factory = documentBuilderFactory25;
        org.jsoup.helper.W3CDom w3CDom28 = w3CDom19.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory29 = w3CDom19.factory;
        w3CDom18.factory = documentBuilderFactory29;
        org.jsoup.nodes.Element element31 = null;
        org.w3c.dom.Document document32 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom18.convert(element31, document32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(w3CDom21);
        org.junit.Assert.assertNotNull(w3CDom23);
        org.junit.Assert.assertNotNull(documentBuilderFactory25);
        org.junit.Assert.assertNotNull(w3CDom28);
        org.junit.Assert.assertNotNull(documentBuilderFactory29);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0331");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory17 = w3CDom0.factory;
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom22 = w3CDom20.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom24 = w3CDom20.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom25 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory26 = w3CDom25.factory;
        w3CDom20.factory = documentBuilderFactory26;
        w3CDom0.factory = documentBuilderFactory26;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory29 = w3CDom0.factory;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory30 = w3CDom0.factory;
        org.w3c.dom.Document document32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList33 = w3CDom0.selectXpath("", document32);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'xpath' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(documentBuilderFactory17);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom22);
        org.junit.Assert.assertNotNull(w3CDom24);
        org.junit.Assert.assertNotNull(documentBuilderFactory26);
        org.junit.Assert.assertNotNull(documentBuilderFactory29);
        org.junit.Assert.assertNotNull(documentBuilderFactory30);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0332");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom6.namespaceAware(false);
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document10 = w3CDom8.fromJsoup(element9);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0333");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom21 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom22 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom24 = w3CDom22.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom26 = w3CDom22.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom27 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory28 = w3CDom27.factory;
        w3CDom22.factory = documentBuilderFactory28;
        w3CDom21.factory = documentBuilderFactory28;
        w3CDom20.factory = documentBuilderFactory28;
        boolean boolean32 = w3CDom20.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom33 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom35 = w3CDom33.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom37 = w3CDom35.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom39 = w3CDom35.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom41 = w3CDom39.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory42 = w3CDom39.factory;
        w3CDom20.factory = documentBuilderFactory42;
        java.lang.Class<?> wildcardClass44 = documentBuilderFactory42.getClass();
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom24);
        org.junit.Assert.assertNotNull(w3CDom26);
        org.junit.Assert.assertNotNull(documentBuilderFactory28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(w3CDom35);
        org.junit.Assert.assertNotNull(w3CDom37);
        org.junit.Assert.assertNotNull(w3CDom39);
        org.junit.Assert.assertNotNull(w3CDom41);
        org.junit.Assert.assertNotNull(documentBuilderFactory42);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0334");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory7 = w3CDom4.factory;
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom10 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom10.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom14 = w3CDom10.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom15 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory16 = w3CDom15.factory;
        w3CDom10.factory = documentBuilderFactory16;
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom22 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom23 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory24 = w3CDom23.factory;
        w3CDom18.factory = documentBuilderFactory24;
        w3CDom10.factory = documentBuilderFactory24;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory27 = w3CDom10.factory;
        w3CDom9.factory = documentBuilderFactory27;
        org.w3c.dom.Document document29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = w3CDom9.asString(document29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(documentBuilderFactory7);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(w3CDom14);
        org.junit.Assert.assertNotNull(documentBuilderFactory16);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom22);
        org.junit.Assert.assertNotNull(documentBuilderFactory24);
        org.junit.Assert.assertNotNull(documentBuilderFactory27);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0335");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        boolean boolean7 = w3CDom6.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom6.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom11 = w3CDom9.namespaceAware(true);
        org.jsoup.nodes.Document document12 = null;
        org.w3c.dom.Document document13 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom11.convert(document12, document13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertNotNull(w3CDom11);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0336");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom21 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom22 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom24 = w3CDom22.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom26 = w3CDom22.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom27 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory28 = w3CDom27.factory;
        w3CDom22.factory = documentBuilderFactory28;
        w3CDom21.factory = documentBuilderFactory28;
        w3CDom18.factory = documentBuilderFactory28;
        org.jsoup.nodes.Document document32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document33 = w3CDom18.fromJsoup(document32);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom24);
        org.junit.Assert.assertNotNull(w3CDom26);
        org.junit.Assert.assertNotNull(documentBuilderFactory28);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0337");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(true);
        org.jsoup.nodes.Element element21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document22 = w3CDom18.fromJsoup(element21);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(w3CDom20);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0338");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        boolean boolean7 = w3CDom6.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom6.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory10 = w3CDom6.factory;
        org.jsoup.nodes.Document document11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document12 = w3CDom6.fromJsoup(document11);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertNotNull(documentBuilderFactory10);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0339");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        boolean boolean7 = w3CDom6.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom6.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom11 = w3CDom9.namespaceAware(true);
        org.jsoup.nodes.Element element12 = null;
        org.w3c.dom.Document document13 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom9.convert(element12, document13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertNotNull(w3CDom11);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0340");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        boolean boolean3 = w3CDom0.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory4 = w3CDom0.factory;
        org.w3c.dom.Document document6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList7 = w3CDom0.selectXpath("hi!", document6);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(documentBuilderFactory4);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0341");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory3 = w3CDom0.factory;
        org.jsoup.helper.W3CDom w3CDom5 = w3CDom0.namespaceAware(false);
        org.jsoup.nodes.Element element6 = null;
        org.w3c.dom.Document document7 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom5.convert(element6, document7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(documentBuilderFactory3);
        org.junit.Assert.assertNotNull(w3CDom5);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0342");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom7 = w3CDom5.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom5.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom11 = w3CDom5.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom12 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom14 = w3CDom12.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom16 = w3CDom14.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom16.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory19 = w3CDom16.factory;
        w3CDom11.factory = documentBuilderFactory19;
        w3CDom4.factory = documentBuilderFactory19;
        org.jsoup.nodes.Document document22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document23 = w3CDom4.fromJsoup(document22);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom7);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertNotNull(w3CDom11);
        org.junit.Assert.assertNotNull(w3CDom14);
        org.junit.Assert.assertNotNull(w3CDom16);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(documentBuilderFactory19);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0343");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.w3c.dom.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList9 = w3CDom4.selectXpath("javax.xml.xpath.XPathFactory:jsoup", node8);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0344");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        boolean boolean1 = w3CDom0.namespaceAware();
        org.w3c.dom.Document document2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node3 = w3CDom0.contextNode(document2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0345");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        boolean boolean7 = w3CDom4.namespaceAware();
        boolean boolean8 = w3CDom4.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom4.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory11 = w3CDom4.factory;
        org.jsoup.nodes.Element element12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document13 = w3CDom4.fromJsoup(element12);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(documentBuilderFactory11);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0346");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom21 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom22 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom24 = w3CDom22.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom26 = w3CDom22.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom27 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory28 = w3CDom27.factory;
        w3CDom22.factory = documentBuilderFactory28;
        w3CDom21.factory = documentBuilderFactory28;
        w3CDom18.factory = documentBuilderFactory28;
        org.w3c.dom.Document document32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = w3CDom18.asString(document32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom24);
        org.junit.Assert.assertNotNull(w3CDom26);
        org.junit.Assert.assertNotNull(documentBuilderFactory28);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0347");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.w3c.dom.Document document2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList3 = w3CDom0.selectXpath("hi!", document2);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0348");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory5 = w3CDom2.factory;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom2.factory;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory7 = w3CDom2.factory;
        boolean boolean8 = w3CDom2.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom2.namespaceAware(true);
        org.jsoup.nodes.Document document11 = null;
        org.w3c.dom.Document document12 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom2.convert(document11, document12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory5);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(documentBuilderFactory7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(w3CDom10);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0349");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(true);
        org.jsoup.nodes.Document document7 = null;
        org.w3c.dom.Document document8 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom4.convert(document7, document8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0350");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory7 = w3CDom4.factory;
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom4.namespaceAware(false);
        org.w3c.dom.Document document11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList12 = w3CDom9.selectXpath("javax.xml.xpath.XPathFactory:jsoup", document11);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(documentBuilderFactory7);
        org.junit.Assert.assertNotNull(w3CDom9);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0351");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        boolean boolean3 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom5 = w3CDom0.namespaceAware(false);
        org.w3c.dom.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList8 = w3CDom5.selectXpath("jsoupSource", node7);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(w3CDom5);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0352");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.w3c.dom.Document document18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList19 = w3CDom0.selectXpath("javax.xml.xpath.XPathFactory:jsoup", document18);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0353");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom21 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom22 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom24 = w3CDom22.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom26 = w3CDom22.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom27 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory28 = w3CDom27.factory;
        w3CDom22.factory = documentBuilderFactory28;
        w3CDom21.factory = documentBuilderFactory28;
        w3CDom20.factory = documentBuilderFactory28;
        boolean boolean32 = w3CDom20.namespaceAware();
        org.jsoup.nodes.Element element33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document34 = w3CDom20.fromJsoup(element33);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom24);
        org.junit.Assert.assertNotNull(w3CDom26);
        org.junit.Assert.assertNotNull(documentBuilderFactory28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0354");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory3 = null;
        w3CDom2.factory = documentBuilderFactory3;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory5 = w3CDom2.factory;
        org.jsoup.nodes.Document document6 = null;
        org.w3c.dom.Document document7 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom2.convert(document6, document7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNull(documentBuilderFactory5);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0355");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom21 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom22 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom24 = w3CDom22.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom26 = w3CDom22.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom27 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory28 = w3CDom27.factory;
        w3CDom22.factory = documentBuilderFactory28;
        w3CDom21.factory = documentBuilderFactory28;
        w3CDom20.factory = documentBuilderFactory28;
        org.jsoup.helper.W3CDom w3CDom33 = w3CDom20.namespaceAware(false);
        org.w3c.dom.Node node35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList36 = w3CDom33.selectXpath("", node35);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'xpath' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom24);
        org.junit.Assert.assertNotNull(w3CDom26);
        org.junit.Assert.assertNotNull(documentBuilderFactory28);
        org.junit.Assert.assertNotNull(w3CDom33);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0356");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom6.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom9 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom11 = w3CDom9.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom13 = w3CDom9.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom14 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory15 = w3CDom14.factory;
        w3CDom9.factory = documentBuilderFactory15;
        org.jsoup.helper.W3CDom w3CDom17 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom19 = w3CDom17.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom21 = w3CDom17.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom22 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory23 = w3CDom22.factory;
        w3CDom17.factory = documentBuilderFactory23;
        w3CDom9.factory = documentBuilderFactory23;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory26 = w3CDom9.factory;
        org.jsoup.helper.W3CDom w3CDom27 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory28 = w3CDom27.factory;
        w3CDom9.factory = documentBuilderFactory28;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory30 = w3CDom9.factory;
        w3CDom8.factory = documentBuilderFactory30;
        org.jsoup.helper.W3CDom w3CDom33 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom35 = w3CDom33.namespaceAware(false);
        org.w3c.dom.Document document36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node37 = w3CDom35.contextNode(document36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertNotNull(w3CDom11);
        org.junit.Assert.assertNotNull(w3CDom13);
        org.junit.Assert.assertNotNull(documentBuilderFactory15);
        org.junit.Assert.assertNotNull(w3CDom19);
        org.junit.Assert.assertNotNull(w3CDom21);
        org.junit.Assert.assertNotNull(documentBuilderFactory23);
        org.junit.Assert.assertNotNull(documentBuilderFactory26);
        org.junit.Assert.assertNotNull(documentBuilderFactory28);
        org.junit.Assert.assertNotNull(documentBuilderFactory30);
        org.junit.Assert.assertNotNull(w3CDom33);
        org.junit.Assert.assertNotNull(w3CDom35);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0357");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom4.namespaceAware(true);
        boolean boolean9 = w3CDom4.namespaceAware();
        java.lang.Class<?> wildcardClass10 = w3CDom4.getClass();
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0358");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        boolean boolean17 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom22 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom23 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory24 = w3CDom23.factory;
        w3CDom18.factory = documentBuilderFactory24;
        org.jsoup.helper.W3CDom w3CDom26 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom28 = w3CDom26.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom30 = w3CDom26.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom31 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory32 = w3CDom31.factory;
        w3CDom26.factory = documentBuilderFactory32;
        w3CDom18.factory = documentBuilderFactory32;
        org.jsoup.helper.W3CDom w3CDom36 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom38 = w3CDom36.namespaceAware(false);
        boolean boolean39 = w3CDom38.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory40 = w3CDom38.factory;
        w3CDom0.factory = documentBuilderFactory40;
        boolean boolean42 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom43 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom45 = w3CDom43.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom47 = w3CDom43.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom48 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory49 = w3CDom48.factory;
        w3CDom43.factory = documentBuilderFactory49;
        org.jsoup.helper.W3CDom w3CDom51 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom53 = w3CDom51.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom55 = w3CDom51.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom56 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory57 = w3CDom56.factory;
        w3CDom51.factory = documentBuilderFactory57;
        w3CDom43.factory = documentBuilderFactory57;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory60 = w3CDom43.factory;
        org.jsoup.helper.W3CDom w3CDom61 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom63 = w3CDom61.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom65 = w3CDom63.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom67 = w3CDom63.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom68 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory69 = w3CDom68.factory;
        w3CDom63.factory = documentBuilderFactory69;
        w3CDom43.factory = documentBuilderFactory69;
        w3CDom0.factory = documentBuilderFactory69;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory73 = w3CDom0.factory;
        org.w3c.dom.Document document75 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList76 = w3CDom0.selectXpath("jsoupSource", document75);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom22);
        org.junit.Assert.assertNotNull(documentBuilderFactory24);
        org.junit.Assert.assertNotNull(w3CDom28);
        org.junit.Assert.assertNotNull(w3CDom30);
        org.junit.Assert.assertNotNull(documentBuilderFactory32);
        org.junit.Assert.assertNotNull(w3CDom36);
        org.junit.Assert.assertNotNull(w3CDom38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(documentBuilderFactory40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(w3CDom45);
        org.junit.Assert.assertNotNull(w3CDom47);
        org.junit.Assert.assertNotNull(documentBuilderFactory49);
        org.junit.Assert.assertNotNull(w3CDom53);
        org.junit.Assert.assertNotNull(w3CDom55);
        org.junit.Assert.assertNotNull(documentBuilderFactory57);
        org.junit.Assert.assertNotNull(documentBuilderFactory60);
        org.junit.Assert.assertNotNull(w3CDom63);
        org.junit.Assert.assertNotNull(w3CDom65);
        org.junit.Assert.assertNotNull(w3CDom67);
        org.junit.Assert.assertNotNull(documentBuilderFactory69);
        org.junit.Assert.assertNotNull(documentBuilderFactory73);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0359");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        boolean boolean5 = w3CDom4.namespaceAware();
        boolean boolean6 = w3CDom4.namespaceAware();
        boolean boolean7 = w3CDom4.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory8 = w3CDom4.factory;
        org.w3c.dom.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList11 = w3CDom4.selectXpath("jsoupSource", node10);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(documentBuilderFactory8);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0360");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        boolean boolean19 = w3CDom0.namespaceAware();
        org.jsoup.nodes.Document document20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document21 = w3CDom0.fromJsoup(document20);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0361");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom6.namespaceAware(false);
        org.w3c.dom.Document document10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList11 = w3CDom6.selectXpath("jsoupSource", document10);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0362");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom2.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom2.namespaceAware(false);
        org.jsoup.nodes.Element element11 = null;
        org.w3c.dom.Document document12 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom10.convert(element11, document12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertNotNull(w3CDom10);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0363");
        org.w3c.dom.Document document0 = null;
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = org.jsoup.helper.W3CDom.OutputHtml();
        java.util.Properties properties2 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        java.util.Properties properties3 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        java.util.Properties properties4 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        java.util.Properties properties5 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        java.util.Properties properties6 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        java.util.Properties properties7 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.jsoup.helper.W3CDom.asString(document0, (java.util.Map<java.lang.String, java.lang.String>) strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNotNull(properties7);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0364");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom6.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom9 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom11 = w3CDom9.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom13 = w3CDom9.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom14 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory15 = w3CDom14.factory;
        w3CDom9.factory = documentBuilderFactory15;
        org.jsoup.helper.W3CDom w3CDom17 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom19 = w3CDom17.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom21 = w3CDom17.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom22 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory23 = w3CDom22.factory;
        w3CDom17.factory = documentBuilderFactory23;
        w3CDom9.factory = documentBuilderFactory23;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory26 = w3CDom9.factory;
        org.jsoup.helper.W3CDom w3CDom27 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory28 = w3CDom27.factory;
        w3CDom9.factory = documentBuilderFactory28;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory30 = w3CDom9.factory;
        w3CDom8.factory = documentBuilderFactory30;
        org.jsoup.helper.W3CDom w3CDom33 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom35 = w3CDom33.namespaceAware(true);
        org.w3c.dom.Node node37 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList38 = w3CDom35.selectXpath("", node37);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'xpath' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertNotNull(w3CDom11);
        org.junit.Assert.assertNotNull(w3CDom13);
        org.junit.Assert.assertNotNull(documentBuilderFactory15);
        org.junit.Assert.assertNotNull(w3CDom19);
        org.junit.Assert.assertNotNull(w3CDom21);
        org.junit.Assert.assertNotNull(documentBuilderFactory23);
        org.junit.Assert.assertNotNull(documentBuilderFactory26);
        org.junit.Assert.assertNotNull(documentBuilderFactory28);
        org.junit.Assert.assertNotNull(documentBuilderFactory30);
        org.junit.Assert.assertNotNull(w3CDom33);
        org.junit.Assert.assertNotNull(w3CDom35);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0365");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.w3c.dom.Document document18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList19 = w3CDom0.selectXpath("jsoupSource", document18);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0366");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory5 = w3CDom2.factory;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom2.factory;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory7 = w3CDom2.factory;
        org.jsoup.nodes.Document document8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document9 = w3CDom2.fromJsoup(document8);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory5);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(documentBuilderFactory7);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0367");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        boolean boolean7 = w3CDom6.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom6.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom11 = w3CDom9.namespaceAware(true);
        org.jsoup.nodes.Document document12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document13 = w3CDom11.fromJsoup(document12);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertNotNull(w3CDom11);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0368");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        boolean boolean19 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom21 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom23 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom25 = w3CDom0.namespaceAware(true);
        org.jsoup.nodes.Document document26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document27 = w3CDom0.fromJsoup(document26);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(w3CDom21);
        org.junit.Assert.assertNotNull(w3CDom23);
        org.junit.Assert.assertNotNull(w3CDom25);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0369");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        boolean boolean7 = w3CDom6.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory8 = w3CDom6.factory;
        org.jsoup.nodes.Element element9 = null;
        org.w3c.dom.Document document10 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom6.convert(element9, document10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(documentBuilderFactory8);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0370");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        boolean boolean7 = w3CDom6.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom6.namespaceAware(false);
        boolean boolean10 = w3CDom6.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom6.namespaceAware(true);
        org.w3c.dom.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList15 = w3CDom12.selectXpath("", node14);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'xpath' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(w3CDom12);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0371");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom21 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom22 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom24 = w3CDom22.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom26 = w3CDom22.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom27 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory28 = w3CDom27.factory;
        w3CDom22.factory = documentBuilderFactory28;
        w3CDom21.factory = documentBuilderFactory28;
        w3CDom20.factory = documentBuilderFactory28;
        org.jsoup.helper.W3CDom w3CDom33 = w3CDom20.namespaceAware(false);
        java.lang.Class<?> wildcardClass34 = w3CDom33.getClass();
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom24);
        org.junit.Assert.assertNotNull(w3CDom26);
        org.junit.Assert.assertNotNull(documentBuilderFactory28);
        org.junit.Assert.assertNotNull(w3CDom33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0372");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        boolean boolean5 = w3CDom4.namespaceAware();
        boolean boolean6 = w3CDom4.namespaceAware();
        boolean boolean7 = w3CDom4.namespaceAware();
        org.w3c.dom.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList10 = w3CDom4.selectXpath("", node9);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'xpath' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0373");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        boolean boolean17 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom22 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom23 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory24 = w3CDom23.factory;
        w3CDom18.factory = documentBuilderFactory24;
        org.jsoup.helper.W3CDom w3CDom26 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom28 = w3CDom26.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom30 = w3CDom26.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom31 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory32 = w3CDom31.factory;
        w3CDom26.factory = documentBuilderFactory32;
        w3CDom18.factory = documentBuilderFactory32;
        org.jsoup.helper.W3CDom w3CDom36 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom38 = w3CDom36.namespaceAware(false);
        boolean boolean39 = w3CDom38.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory40 = w3CDom38.factory;
        w3CDom0.factory = documentBuilderFactory40;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory42 = w3CDom0.factory;
        boolean boolean43 = w3CDom0.namespaceAware();
        org.jsoup.nodes.Document document44 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document45 = w3CDom0.fromJsoup(document44);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom22);
        org.junit.Assert.assertNotNull(documentBuilderFactory24);
        org.junit.Assert.assertNotNull(w3CDom28);
        org.junit.Assert.assertNotNull(w3CDom30);
        org.junit.Assert.assertNotNull(documentBuilderFactory32);
        org.junit.Assert.assertNotNull(w3CDom36);
        org.junit.Assert.assertNotNull(w3CDom38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(documentBuilderFactory40);
        org.junit.Assert.assertNotNull(documentBuilderFactory42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0374");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        boolean boolean19 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom21 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom23 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom25 = w3CDom0.namespaceAware(true);
        org.w3c.dom.Document document26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = w3CDom0.asString(document26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(w3CDom21);
        org.junit.Assert.assertNotNull(w3CDom23);
        org.junit.Assert.assertNotNull(w3CDom25);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0375");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        boolean boolean19 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom21 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom23 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom25 = w3CDom0.namespaceAware(true);
        org.w3c.dom.Document document27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList28 = w3CDom0.selectXpath("hi!", document27);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(w3CDom21);
        org.junit.Assert.assertNotNull(w3CDom23);
        org.junit.Assert.assertNotNull(w3CDom25);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0376");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom17 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom19 = w3CDom17.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom21 = w3CDom17.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom22 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory23 = w3CDom22.factory;
        w3CDom17.factory = documentBuilderFactory23;
        org.jsoup.helper.W3CDom w3CDom25 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom27 = w3CDom25.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom29 = w3CDom25.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom30 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory31 = w3CDom30.factory;
        w3CDom25.factory = documentBuilderFactory31;
        w3CDom17.factory = documentBuilderFactory31;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory34 = w3CDom17.factory;
        w3CDom0.factory = documentBuilderFactory34;
        java.lang.Class<?> wildcardClass36 = w3CDom0.getClass();
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom19);
        org.junit.Assert.assertNotNull(w3CDom21);
        org.junit.Assert.assertNotNull(documentBuilderFactory23);
        org.junit.Assert.assertNotNull(w3CDom27);
        org.junit.Assert.assertNotNull(w3CDom29);
        org.junit.Assert.assertNotNull(documentBuilderFactory31);
        org.junit.Assert.assertNotNull(documentBuilderFactory34);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0377");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        boolean boolean17 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom22 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom23 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory24 = w3CDom23.factory;
        w3CDom18.factory = documentBuilderFactory24;
        org.jsoup.helper.W3CDom w3CDom26 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom28 = w3CDom26.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom30 = w3CDom26.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom31 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory32 = w3CDom31.factory;
        w3CDom26.factory = documentBuilderFactory32;
        w3CDom18.factory = documentBuilderFactory32;
        org.jsoup.helper.W3CDom w3CDom36 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom38 = w3CDom36.namespaceAware(false);
        boolean boolean39 = w3CDom38.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory40 = w3CDom38.factory;
        w3CDom0.factory = documentBuilderFactory40;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory42 = w3CDom0.factory;
        org.jsoup.nodes.Element element43 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document44 = w3CDom0.fromJsoup(element43);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom22);
        org.junit.Assert.assertNotNull(documentBuilderFactory24);
        org.junit.Assert.assertNotNull(w3CDom28);
        org.junit.Assert.assertNotNull(w3CDom30);
        org.junit.Assert.assertNotNull(documentBuilderFactory32);
        org.junit.Assert.assertNotNull(w3CDom36);
        org.junit.Assert.assertNotNull(w3CDom38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(documentBuilderFactory40);
        org.junit.Assert.assertNotNull(documentBuilderFactory42);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0378");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory7 = w3CDom4.factory;
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom11 = w3CDom9.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom12 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom14 = w3CDom12.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom16 = w3CDom14.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom16.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory19 = w3CDom16.factory;
        org.jsoup.helper.W3CDom w3CDom21 = w3CDom16.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom22 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom24 = w3CDom22.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom26 = w3CDom22.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom27 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory28 = w3CDom27.factory;
        w3CDom22.factory = documentBuilderFactory28;
        org.jsoup.helper.W3CDom w3CDom30 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom32 = w3CDom30.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom34 = w3CDom30.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom35 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory36 = w3CDom35.factory;
        w3CDom30.factory = documentBuilderFactory36;
        w3CDom22.factory = documentBuilderFactory36;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory39 = w3CDom22.factory;
        w3CDom21.factory = documentBuilderFactory39;
        w3CDom11.factory = documentBuilderFactory39;
        org.jsoup.nodes.Document document42 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document43 = w3CDom11.fromJsoup(document42);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(documentBuilderFactory7);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertNotNull(w3CDom11);
        org.junit.Assert.assertNotNull(w3CDom14);
        org.junit.Assert.assertNotNull(w3CDom16);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(documentBuilderFactory19);
        org.junit.Assert.assertNotNull(w3CDom21);
        org.junit.Assert.assertNotNull(w3CDom24);
        org.junit.Assert.assertNotNull(w3CDom26);
        org.junit.Assert.assertNotNull(documentBuilderFactory28);
        org.junit.Assert.assertNotNull(w3CDom32);
        org.junit.Assert.assertNotNull(w3CDom34);
        org.junit.Assert.assertNotNull(documentBuilderFactory36);
        org.junit.Assert.assertNotNull(documentBuilderFactory39);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0379");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        boolean boolean7 = w3CDom6.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom6.namespaceAware(false);
        boolean boolean10 = w3CDom6.namespaceAware();
        org.w3c.dom.Document document12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList13 = w3CDom6.selectXpath("hi!", document12);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0380");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        boolean boolean7 = w3CDom6.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom6.namespaceAware(false);
        boolean boolean10 = w3CDom6.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom6.namespaceAware(true);
        boolean boolean13 = w3CDom12.namespaceAware();
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0381");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom7 = w3CDom5.namespaceAware(true);
        boolean boolean8 = w3CDom5.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory9 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory9;
        org.jsoup.nodes.Document document11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document12 = w3CDom0.fromJsoup(document11);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(documentBuilderFactory9);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0382");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        boolean boolean7 = w3CDom6.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom6.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory10 = w3CDom6.factory;
        org.jsoup.helper.W3CDom w3CDom11 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom13 = w3CDom11.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom15 = w3CDom11.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom16 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom16.namespaceAware(true);
        boolean boolean19 = w3CDom16.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory20 = w3CDom16.factory;
        w3CDom11.factory = documentBuilderFactory20;
        org.jsoup.helper.W3CDom w3CDom22 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom24 = w3CDom22.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory25 = null;
        w3CDom24.factory = documentBuilderFactory25;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory27 = w3CDom24.factory;
        org.jsoup.helper.W3CDom w3CDom28 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom30 = w3CDom28.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom32 = w3CDom28.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom33 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory34 = w3CDom33.factory;
        w3CDom28.factory = documentBuilderFactory34;
        org.jsoup.helper.W3CDom w3CDom36 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom38 = w3CDom36.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom40 = w3CDom36.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom41 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory42 = w3CDom41.factory;
        w3CDom36.factory = documentBuilderFactory42;
        w3CDom28.factory = documentBuilderFactory42;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory45 = w3CDom28.factory;
        w3CDom24.factory = documentBuilderFactory45;
        w3CDom11.factory = documentBuilderFactory45;
        w3CDom6.factory = documentBuilderFactory45;
        org.w3c.dom.Document document49 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str50 = w3CDom6.asString(document49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertNotNull(documentBuilderFactory10);
        org.junit.Assert.assertNotNull(w3CDom13);
        org.junit.Assert.assertNotNull(w3CDom15);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(documentBuilderFactory20);
        org.junit.Assert.assertNotNull(w3CDom24);
        org.junit.Assert.assertNull(documentBuilderFactory27);
        org.junit.Assert.assertNotNull(w3CDom30);
        org.junit.Assert.assertNotNull(w3CDom32);
        org.junit.Assert.assertNotNull(documentBuilderFactory34);
        org.junit.Assert.assertNotNull(w3CDom38);
        org.junit.Assert.assertNotNull(w3CDom40);
        org.junit.Assert.assertNotNull(documentBuilderFactory42);
        org.junit.Assert.assertNotNull(documentBuilderFactory45);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0383");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        boolean boolean3 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom4 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom9 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory10 = w3CDom9.factory;
        w3CDom4.factory = documentBuilderFactory10;
        org.jsoup.helper.W3CDom w3CDom12 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom14 = w3CDom12.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom16 = w3CDom12.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom17 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory18 = w3CDom17.factory;
        w3CDom12.factory = documentBuilderFactory18;
        w3CDom4.factory = documentBuilderFactory18;
        org.jsoup.helper.W3CDom w3CDom22 = w3CDom4.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom23 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom25 = w3CDom23.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom27 = w3CDom23.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom28 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory29 = w3CDom28.factory;
        w3CDom23.factory = documentBuilderFactory29;
        org.jsoup.helper.W3CDom w3CDom31 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom33 = w3CDom31.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom35 = w3CDom31.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom36 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory37 = w3CDom36.factory;
        w3CDom31.factory = documentBuilderFactory37;
        w3CDom23.factory = documentBuilderFactory37;
        org.jsoup.helper.W3CDom w3CDom41 = w3CDom23.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom43 = w3CDom41.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom44 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom46 = w3CDom44.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory47 = null;
        w3CDom46.factory = documentBuilderFactory47;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory49 = w3CDom46.factory;
        org.jsoup.helper.W3CDom w3CDom50 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom52 = w3CDom50.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom54 = w3CDom50.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom55 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory56 = w3CDom55.factory;
        w3CDom50.factory = documentBuilderFactory56;
        org.jsoup.helper.W3CDom w3CDom58 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom60 = w3CDom58.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom62 = w3CDom58.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom63 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory64 = w3CDom63.factory;
        w3CDom58.factory = documentBuilderFactory64;
        w3CDom50.factory = documentBuilderFactory64;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory67 = w3CDom50.factory;
        w3CDom46.factory = documentBuilderFactory67;
        w3CDom43.factory = documentBuilderFactory67;
        w3CDom22.factory = documentBuilderFactory67;
        w3CDom0.factory = documentBuilderFactory67;
        org.jsoup.helper.W3CDom w3CDom73 = w3CDom0.namespaceAware(true);
        org.w3c.dom.Document document74 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node75 = w3CDom73.contextNode(document74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertNotNull(documentBuilderFactory10);
        org.junit.Assert.assertNotNull(w3CDom14);
        org.junit.Assert.assertNotNull(w3CDom16);
        org.junit.Assert.assertNotNull(documentBuilderFactory18);
        org.junit.Assert.assertNotNull(w3CDom22);
        org.junit.Assert.assertNotNull(w3CDom25);
        org.junit.Assert.assertNotNull(w3CDom27);
        org.junit.Assert.assertNotNull(documentBuilderFactory29);
        org.junit.Assert.assertNotNull(w3CDom33);
        org.junit.Assert.assertNotNull(w3CDom35);
        org.junit.Assert.assertNotNull(documentBuilderFactory37);
        org.junit.Assert.assertNotNull(w3CDom41);
        org.junit.Assert.assertNotNull(w3CDom43);
        org.junit.Assert.assertNotNull(w3CDom46);
        org.junit.Assert.assertNull(documentBuilderFactory49);
        org.junit.Assert.assertNotNull(w3CDom52);
        org.junit.Assert.assertNotNull(w3CDom54);
        org.junit.Assert.assertNotNull(documentBuilderFactory56);
        org.junit.Assert.assertNotNull(w3CDom60);
        org.junit.Assert.assertNotNull(w3CDom62);
        org.junit.Assert.assertNotNull(documentBuilderFactory64);
        org.junit.Assert.assertNotNull(documentBuilderFactory67);
        org.junit.Assert.assertNotNull(w3CDom73);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0384");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom4.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom4.namespaceAware(false);
        org.jsoup.nodes.Element element13 = null;
        org.w3c.dom.Document document14 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom4.convert(element13, document14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0385");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom4.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom11 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom13 = w3CDom11.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom15 = w3CDom11.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom16 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory17 = w3CDom16.factory;
        w3CDom11.factory = documentBuilderFactory17;
        org.jsoup.helper.W3CDom w3CDom19 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom21 = w3CDom19.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom23 = w3CDom19.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom24 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory25 = w3CDom24.factory;
        w3CDom19.factory = documentBuilderFactory25;
        w3CDom11.factory = documentBuilderFactory25;
        org.jsoup.helper.W3CDom w3CDom29 = w3CDom11.namespaceAware(true);
        boolean boolean30 = w3CDom11.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom32 = w3CDom11.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom34 = w3CDom11.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom36 = w3CDom11.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory37 = w3CDom11.factory;
        w3CDom10.factory = documentBuilderFactory37;
        org.w3c.dom.Document document40 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList41 = w3CDom10.selectXpath("jsoupSource", document40);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom13);
        org.junit.Assert.assertNotNull(w3CDom15);
        org.junit.Assert.assertNotNull(documentBuilderFactory17);
        org.junit.Assert.assertNotNull(w3CDom21);
        org.junit.Assert.assertNotNull(w3CDom23);
        org.junit.Assert.assertNotNull(documentBuilderFactory25);
        org.junit.Assert.assertNotNull(w3CDom29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(w3CDom32);
        org.junit.Assert.assertNotNull(w3CDom34);
        org.junit.Assert.assertNotNull(w3CDom36);
        org.junit.Assert.assertNotNull(documentBuilderFactory37);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0386");
        java.util.HashMap<java.lang.String, java.lang.String> strMap0 = org.jsoup.helper.W3CDom.OutputHtml();
        java.util.Properties properties1 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap0);
        java.util.Properties properties2 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap0);
        java.util.Properties properties3 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap0);
        java.util.Properties properties4 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap0);
        java.lang.Class<?> wildcardClass5 = strMap0.getClass();
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0387");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom4.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom4.namespaceAware(false);
        org.w3c.dom.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList15 = w3CDom12.selectXpath("hi!", node14);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0388");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom4.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom11 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom13 = w3CDom11.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom15 = w3CDom11.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom16 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory17 = w3CDom16.factory;
        w3CDom11.factory = documentBuilderFactory17;
        org.jsoup.helper.W3CDom w3CDom19 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom21 = w3CDom19.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom23 = w3CDom19.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom24 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory25 = w3CDom24.factory;
        w3CDom19.factory = documentBuilderFactory25;
        w3CDom11.factory = documentBuilderFactory25;
        org.jsoup.helper.W3CDom w3CDom29 = w3CDom11.namespaceAware(true);
        boolean boolean30 = w3CDom11.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom32 = w3CDom11.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom34 = w3CDom11.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom36 = w3CDom11.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory37 = w3CDom11.factory;
        w3CDom10.factory = documentBuilderFactory37;
        java.lang.Class<?> wildcardClass39 = w3CDom10.getClass();
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom13);
        org.junit.Assert.assertNotNull(w3CDom15);
        org.junit.Assert.assertNotNull(documentBuilderFactory17);
        org.junit.Assert.assertNotNull(w3CDom21);
        org.junit.Assert.assertNotNull(w3CDom23);
        org.junit.Assert.assertNotNull(documentBuilderFactory25);
        org.junit.Assert.assertNotNull(w3CDom29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(w3CDom32);
        org.junit.Assert.assertNotNull(w3CDom34);
        org.junit.Assert.assertNotNull(w3CDom36);
        org.junit.Assert.assertNotNull(documentBuilderFactory37);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0389");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        boolean boolean5 = w3CDom4.namespaceAware();
        boolean boolean6 = w3CDom4.namespaceAware();
        boolean boolean7 = w3CDom4.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory8 = w3CDom4.factory;
        org.w3c.dom.Document document9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = w3CDom4.asString(document9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(documentBuilderFactory8);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0390");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory17 = w3CDom0.factory;
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory19 = w3CDom18.factory;
        w3CDom0.factory = documentBuilderFactory19;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory21 = w3CDom0.factory;
        org.jsoup.helper.W3CDom w3CDom22 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom24 = w3CDom22.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory25 = w3CDom22.factory;
        w3CDom0.factory = documentBuilderFactory25;
        org.jsoup.nodes.Element element27 = null;
        org.w3c.dom.Document document28 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom0.convert(element27, document28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(documentBuilderFactory17);
        org.junit.Assert.assertNotNull(documentBuilderFactory19);
        org.junit.Assert.assertNotNull(documentBuilderFactory21);
        org.junit.Assert.assertNotNull(w3CDom24);
        org.junit.Assert.assertNotNull(documentBuilderFactory25);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0391");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.nodes.Document document17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document18 = w3CDom0.fromJsoup(document17);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0392");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom4.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom11 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom13 = w3CDom11.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom15 = w3CDom11.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom16 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory17 = w3CDom16.factory;
        w3CDom11.factory = documentBuilderFactory17;
        org.jsoup.helper.W3CDom w3CDom19 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom21 = w3CDom19.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom23 = w3CDom19.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom24 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory25 = w3CDom24.factory;
        w3CDom19.factory = documentBuilderFactory25;
        w3CDom11.factory = documentBuilderFactory25;
        org.jsoup.helper.W3CDom w3CDom29 = w3CDom11.namespaceAware(true);
        boolean boolean30 = w3CDom11.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom32 = w3CDom11.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom34 = w3CDom11.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom36 = w3CDom11.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory37 = w3CDom11.factory;
        w3CDom10.factory = documentBuilderFactory37;
        org.jsoup.nodes.Element element39 = null;
        org.w3c.dom.Document document40 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom10.convert(element39, document40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom13);
        org.junit.Assert.assertNotNull(w3CDom15);
        org.junit.Assert.assertNotNull(documentBuilderFactory17);
        org.junit.Assert.assertNotNull(w3CDom21);
        org.junit.Assert.assertNotNull(w3CDom23);
        org.junit.Assert.assertNotNull(documentBuilderFactory25);
        org.junit.Assert.assertNotNull(w3CDom29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(w3CDom32);
        org.junit.Assert.assertNotNull(w3CDom34);
        org.junit.Assert.assertNotNull(w3CDom36);
        org.junit.Assert.assertNotNull(documentBuilderFactory37);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0393");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.w3c.dom.Document document5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node6 = w3CDom0.contextNode(document5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0394");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom4.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom4.namespaceAware(false);
        org.w3c.dom.Document document13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = w3CDom4.asString(document13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0395");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom7 = w3CDom5.namespaceAware(true);
        boolean boolean8 = w3CDom5.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory9 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory9;
        org.jsoup.helper.W3CDom w3CDom11 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom13 = w3CDom11.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = null;
        w3CDom13.factory = documentBuilderFactory14;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory16 = w3CDom13.factory;
        org.jsoup.helper.W3CDom w3CDom17 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom19 = w3CDom17.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom21 = w3CDom17.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom22 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory23 = w3CDom22.factory;
        w3CDom17.factory = documentBuilderFactory23;
        org.jsoup.helper.W3CDom w3CDom25 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom27 = w3CDom25.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom29 = w3CDom25.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom30 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory31 = w3CDom30.factory;
        w3CDom25.factory = documentBuilderFactory31;
        w3CDom17.factory = documentBuilderFactory31;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory34 = w3CDom17.factory;
        w3CDom13.factory = documentBuilderFactory34;
        w3CDom0.factory = documentBuilderFactory34;
        org.w3c.dom.Document document38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList39 = w3CDom0.selectXpath("javax.xml.xpath.XPathFactory:jsoup", document38);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(documentBuilderFactory9);
        org.junit.Assert.assertNotNull(w3CDom13);
        org.junit.Assert.assertNull(documentBuilderFactory16);
        org.junit.Assert.assertNotNull(w3CDom19);
        org.junit.Assert.assertNotNull(w3CDom21);
        org.junit.Assert.assertNotNull(documentBuilderFactory23);
        org.junit.Assert.assertNotNull(w3CDom27);
        org.junit.Assert.assertNotNull(w3CDom29);
        org.junit.Assert.assertNotNull(documentBuilderFactory31);
        org.junit.Assert.assertNotNull(documentBuilderFactory34);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0396");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.nodes.Document document3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document4 = w3CDom2.fromJsoup(document3);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0397");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        boolean boolean17 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom22 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom23 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory24 = w3CDom23.factory;
        w3CDom18.factory = documentBuilderFactory24;
        org.jsoup.helper.W3CDom w3CDom26 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom28 = w3CDom26.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom30 = w3CDom26.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom31 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory32 = w3CDom31.factory;
        w3CDom26.factory = documentBuilderFactory32;
        w3CDom18.factory = documentBuilderFactory32;
        org.jsoup.helper.W3CDom w3CDom36 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom38 = w3CDom36.namespaceAware(false);
        boolean boolean39 = w3CDom38.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory40 = w3CDom38.factory;
        w3CDom0.factory = documentBuilderFactory40;
        boolean boolean42 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom43 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom45 = w3CDom43.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom47 = w3CDom43.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom48 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory49 = w3CDom48.factory;
        w3CDom43.factory = documentBuilderFactory49;
        org.jsoup.helper.W3CDom w3CDom51 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom53 = w3CDom51.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom55 = w3CDom51.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom56 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory57 = w3CDom56.factory;
        w3CDom51.factory = documentBuilderFactory57;
        w3CDom43.factory = documentBuilderFactory57;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory60 = w3CDom43.factory;
        org.jsoup.helper.W3CDom w3CDom61 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom63 = w3CDom61.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom65 = w3CDom63.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom67 = w3CDom63.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom68 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory69 = w3CDom68.factory;
        w3CDom63.factory = documentBuilderFactory69;
        w3CDom43.factory = documentBuilderFactory69;
        w3CDom0.factory = documentBuilderFactory69;
        org.w3c.dom.Document document73 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node74 = w3CDom0.contextNode(document73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom22);
        org.junit.Assert.assertNotNull(documentBuilderFactory24);
        org.junit.Assert.assertNotNull(w3CDom28);
        org.junit.Assert.assertNotNull(w3CDom30);
        org.junit.Assert.assertNotNull(documentBuilderFactory32);
        org.junit.Assert.assertNotNull(w3CDom36);
        org.junit.Assert.assertNotNull(w3CDom38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(documentBuilderFactory40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(w3CDom45);
        org.junit.Assert.assertNotNull(w3CDom47);
        org.junit.Assert.assertNotNull(documentBuilderFactory49);
        org.junit.Assert.assertNotNull(w3CDom53);
        org.junit.Assert.assertNotNull(w3CDom55);
        org.junit.Assert.assertNotNull(documentBuilderFactory57);
        org.junit.Assert.assertNotNull(documentBuilderFactory60);
        org.junit.Assert.assertNotNull(w3CDom63);
        org.junit.Assert.assertNotNull(w3CDom65);
        org.junit.Assert.assertNotNull(w3CDom67);
        org.junit.Assert.assertNotNull(documentBuilderFactory69);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0398");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        boolean boolean17 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom19 = w3CDom0.namespaceAware(false);
        org.jsoup.nodes.Element element20 = null;
        org.w3c.dom.Document document21 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom19.convert(element20, document21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(w3CDom19);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0399");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom19 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom21 = w3CDom19.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom23 = w3CDom19.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom24 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory25 = w3CDom24.factory;
        w3CDom19.factory = documentBuilderFactory25;
        org.jsoup.helper.W3CDom w3CDom27 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom29 = w3CDom27.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom31 = w3CDom27.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom32 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory33 = w3CDom32.factory;
        w3CDom27.factory = documentBuilderFactory33;
        w3CDom19.factory = documentBuilderFactory33;
        org.jsoup.helper.W3CDom w3CDom37 = w3CDom19.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom39 = w3CDom37.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom40 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom42 = w3CDom40.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory43 = null;
        w3CDom42.factory = documentBuilderFactory43;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory45 = w3CDom42.factory;
        org.jsoup.helper.W3CDom w3CDom46 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom48 = w3CDom46.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom50 = w3CDom46.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom51 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory52 = w3CDom51.factory;
        w3CDom46.factory = documentBuilderFactory52;
        org.jsoup.helper.W3CDom w3CDom54 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom56 = w3CDom54.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom58 = w3CDom54.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom59 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory60 = w3CDom59.factory;
        w3CDom54.factory = documentBuilderFactory60;
        w3CDom46.factory = documentBuilderFactory60;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory63 = w3CDom46.factory;
        w3CDom42.factory = documentBuilderFactory63;
        w3CDom39.factory = documentBuilderFactory63;
        w3CDom18.factory = documentBuilderFactory63;
        java.lang.Class<?> wildcardClass67 = w3CDom18.getClass();
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(w3CDom21);
        org.junit.Assert.assertNotNull(w3CDom23);
        org.junit.Assert.assertNotNull(documentBuilderFactory25);
        org.junit.Assert.assertNotNull(w3CDom29);
        org.junit.Assert.assertNotNull(w3CDom31);
        org.junit.Assert.assertNotNull(documentBuilderFactory33);
        org.junit.Assert.assertNotNull(w3CDom37);
        org.junit.Assert.assertNotNull(w3CDom39);
        org.junit.Assert.assertNotNull(w3CDom42);
        org.junit.Assert.assertNull(documentBuilderFactory45);
        org.junit.Assert.assertNotNull(w3CDom48);
        org.junit.Assert.assertNotNull(w3CDom50);
        org.junit.Assert.assertNotNull(documentBuilderFactory52);
        org.junit.Assert.assertNotNull(w3CDom56);
        org.junit.Assert.assertNotNull(w3CDom58);
        org.junit.Assert.assertNotNull(documentBuilderFactory60);
        org.junit.Assert.assertNotNull(documentBuilderFactory63);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0400");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom6.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom9 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom11 = w3CDom9.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom13 = w3CDom9.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom14 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory15 = w3CDom14.factory;
        w3CDom9.factory = documentBuilderFactory15;
        org.jsoup.helper.W3CDom w3CDom17 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom19 = w3CDom17.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom21 = w3CDom17.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom22 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory23 = w3CDom22.factory;
        w3CDom17.factory = documentBuilderFactory23;
        w3CDom9.factory = documentBuilderFactory23;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory26 = w3CDom9.factory;
        org.jsoup.helper.W3CDom w3CDom27 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory28 = w3CDom27.factory;
        w3CDom9.factory = documentBuilderFactory28;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory30 = w3CDom9.factory;
        w3CDom8.factory = documentBuilderFactory30;
        org.jsoup.helper.W3CDom w3CDom33 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom35 = w3CDom33.namespaceAware(false);
        org.w3c.dom.Document document36 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = w3CDom35.asString(document36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertNotNull(w3CDom11);
        org.junit.Assert.assertNotNull(w3CDom13);
        org.junit.Assert.assertNotNull(documentBuilderFactory15);
        org.junit.Assert.assertNotNull(w3CDom19);
        org.junit.Assert.assertNotNull(w3CDom21);
        org.junit.Assert.assertNotNull(documentBuilderFactory23);
        org.junit.Assert.assertNotNull(documentBuilderFactory26);
        org.junit.Assert.assertNotNull(documentBuilderFactory28);
        org.junit.Assert.assertNotNull(documentBuilderFactory30);
        org.junit.Assert.assertNotNull(w3CDom33);
        org.junit.Assert.assertNotNull(w3CDom35);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0401");
        org.w3c.dom.Document document0 = null;
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = org.jsoup.helper.W3CDom.OutputXml();
        java.util.Properties properties2 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        java.util.Properties properties3 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        java.util.Properties properties4 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        java.util.Properties properties5 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        java.util.Properties properties6 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        java.util.Properties properties7 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.jsoup.helper.W3CDom.asString(document0, (java.util.Map<java.lang.String, java.lang.String>) strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNotNull(properties7);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0402");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom1 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom3 = w3CDom1.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom5 = w3CDom1.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory7 = w3CDom6.factory;
        w3CDom1.factory = documentBuilderFactory7;
        w3CDom0.factory = documentBuilderFactory7;
        org.jsoup.helper.W3CDom w3CDom10 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom10.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom14 = w3CDom10.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom15 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory16 = w3CDom15.factory;
        w3CDom10.factory = documentBuilderFactory16;
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom22 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom23 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory24 = w3CDom23.factory;
        w3CDom18.factory = documentBuilderFactory24;
        w3CDom10.factory = documentBuilderFactory24;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory27 = w3CDom10.factory;
        org.jsoup.helper.W3CDom w3CDom28 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory29 = w3CDom28.factory;
        w3CDom10.factory = documentBuilderFactory29;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory31 = w3CDom10.factory;
        w3CDom0.factory = documentBuilderFactory31;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory33 = w3CDom0.factory;
        org.jsoup.helper.W3CDom w3CDom34 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom36 = w3CDom34.namespaceAware(true);
        boolean boolean37 = w3CDom34.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom39 = w3CDom34.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory40 = w3CDom39.factory;
        w3CDom0.factory = documentBuilderFactory40;
        org.jsoup.nodes.Element element42 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document43 = w3CDom0.fromJsoup(element42);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom3);
        org.junit.Assert.assertNotNull(w3CDom5);
        org.junit.Assert.assertNotNull(documentBuilderFactory7);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(w3CDom14);
        org.junit.Assert.assertNotNull(documentBuilderFactory16);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom22);
        org.junit.Assert.assertNotNull(documentBuilderFactory24);
        org.junit.Assert.assertNotNull(documentBuilderFactory27);
        org.junit.Assert.assertNotNull(documentBuilderFactory29);
        org.junit.Assert.assertNotNull(documentBuilderFactory31);
        org.junit.Assert.assertNotNull(documentBuilderFactory33);
        org.junit.Assert.assertNotNull(w3CDom36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(w3CDom39);
        org.junit.Assert.assertNotNull(documentBuilderFactory40);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0403");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        boolean boolean3 = w3CDom0.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory4 = w3CDom0.factory;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory5 = null;
        w3CDom0.factory = documentBuilderFactory5;
        org.w3c.dom.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList9 = w3CDom0.selectXpath("jsoupSource", node8);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(documentBuilderFactory4);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0404");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom4.namespaceAware(false);
        org.w3c.dom.Document document10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList11 = w3CDom4.selectXpath("", document10);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'xpath' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0405");
        org.w3c.dom.Document document0 = null;
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = org.jsoup.helper.W3CDom.OutputXml();
        java.util.Properties properties2 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        java.util.Properties properties3 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        java.util.Properties properties4 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        java.util.Properties properties5 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        java.util.Properties properties6 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        java.util.Properties properties7 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        java.util.Properties properties8 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.jsoup.helper.W3CDom.asString(document0, (java.util.Map<java.lang.String, java.lang.String>) strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(properties8);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0406");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        boolean boolean5 = w3CDom0.namespaceAware();
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document7 = w3CDom0.fromJsoup(element6);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0407");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        boolean boolean17 = w3CDom0.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory18 = w3CDom0.factory;
        org.jsoup.nodes.Document document19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document20 = w3CDom0.fromJsoup(document19);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(documentBuilderFactory18);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0408");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory17 = w3CDom0.factory;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory18 = null;
        w3CDom0.factory = documentBuilderFactory18;
        org.jsoup.nodes.Document document20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document21 = w3CDom0.fromJsoup(document20);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(documentBuilderFactory17);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0409");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        boolean boolean17 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom19 = w3CDom0.namespaceAware(false);
        org.jsoup.nodes.Document document20 = null;
        org.w3c.dom.Document document21 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom0.convert(document20, document21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(w3CDom19);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0410");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory21 = w3CDom18.factory;
        java.lang.Class<?> wildcardClass22 = documentBuilderFactory21.getClass();
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(documentBuilderFactory21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0411");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory5 = w3CDom2.factory;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom2.factory;
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom2.namespaceAware(true);
        org.w3c.dom.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList11 = w3CDom2.selectXpath("javax.xml.xpath.XPathFactory:jsoup", node10);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory5);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom8);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0412");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom1 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom3 = w3CDom1.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom5 = w3CDom1.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory7 = w3CDom6.factory;
        w3CDom1.factory = documentBuilderFactory7;
        w3CDom0.factory = documentBuilderFactory7;
        org.w3c.dom.Document document10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node11 = w3CDom0.contextNode(document10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom3);
        org.junit.Assert.assertNotNull(w3CDom5);
        org.junit.Assert.assertNotNull(documentBuilderFactory7);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0413");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory17 = w3CDom0.factory;
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom22 = w3CDom20.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom24 = w3CDom20.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom25 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory26 = w3CDom25.factory;
        w3CDom20.factory = documentBuilderFactory26;
        w3CDom0.factory = documentBuilderFactory26;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory29 = w3CDom0.factory;
        org.jsoup.nodes.Document document30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document31 = w3CDom0.fromJsoup(document30);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(documentBuilderFactory17);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom22);
        org.junit.Assert.assertNotNull(w3CDom24);
        org.junit.Assert.assertNotNull(documentBuilderFactory26);
        org.junit.Assert.assertNotNull(documentBuilderFactory29);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0414");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        boolean boolean19 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom21 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom23 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom25 = w3CDom0.namespaceAware(true);
        java.lang.Class<?> wildcardClass26 = w3CDom0.getClass();
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(w3CDom21);
        org.junit.Assert.assertNotNull(w3CDom23);
        org.junit.Assert.assertNotNull(w3CDom25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0415");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom11 = w3CDom9.namespaceAware(true);
        org.jsoup.nodes.Element element12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document13 = w3CDom9.fromJsoup(element12);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertNotNull(w3CDom11);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0416");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom0.namespaceAware(true);
        org.w3c.dom.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList12 = w3CDom0.selectXpath("hi!", node11);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom9);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0417");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        boolean boolean17 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom22 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom23 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory24 = w3CDom23.factory;
        w3CDom18.factory = documentBuilderFactory24;
        org.jsoup.helper.W3CDom w3CDom26 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom28 = w3CDom26.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom30 = w3CDom26.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom31 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory32 = w3CDom31.factory;
        w3CDom26.factory = documentBuilderFactory32;
        w3CDom18.factory = documentBuilderFactory32;
        org.jsoup.helper.W3CDom w3CDom36 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom38 = w3CDom36.namespaceAware(false);
        boolean boolean39 = w3CDom38.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory40 = w3CDom38.factory;
        w3CDom0.factory = documentBuilderFactory40;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory42 = w3CDom0.factory;
        boolean boolean43 = w3CDom0.namespaceAware();
        org.w3c.dom.Document document45 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList46 = w3CDom0.selectXpath("jsoupSource", document45);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom22);
        org.junit.Assert.assertNotNull(documentBuilderFactory24);
        org.junit.Assert.assertNotNull(w3CDom28);
        org.junit.Assert.assertNotNull(w3CDom30);
        org.junit.Assert.assertNotNull(documentBuilderFactory32);
        org.junit.Assert.assertNotNull(w3CDom36);
        org.junit.Assert.assertNotNull(w3CDom38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(documentBuilderFactory40);
        org.junit.Assert.assertNotNull(documentBuilderFactory42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0418");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory7 = w3CDom4.factory;
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom11 = w3CDom9.namespaceAware(false);
        org.jsoup.nodes.Document document12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document13 = w3CDom9.fromJsoup(document12);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(documentBuilderFactory7);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertNotNull(w3CDom11);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0419");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory21 = w3CDom18.factory;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory22 = w3CDom18.factory;
        org.w3c.dom.Document document23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node24 = w3CDom18.contextNode(document23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(documentBuilderFactory21);
        org.junit.Assert.assertNotNull(documentBuilderFactory22);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0420");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory17 = w3CDom0.factory;
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom22 = w3CDom20.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom24 = w3CDom20.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom25 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory26 = w3CDom25.factory;
        w3CDom20.factory = documentBuilderFactory26;
        w3CDom0.factory = documentBuilderFactory26;
        org.w3c.dom.Document document29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = w3CDom0.asString(document29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(documentBuilderFactory17);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom22);
        org.junit.Assert.assertNotNull(w3CDom24);
        org.junit.Assert.assertNotNull(documentBuilderFactory26);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0421");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory17 = w3CDom0.factory;
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom22 = w3CDom20.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom24 = w3CDom20.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom25 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory26 = w3CDom25.factory;
        w3CDom20.factory = documentBuilderFactory26;
        w3CDom0.factory = documentBuilderFactory26;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory29 = w3CDom0.factory;
        org.w3c.dom.Document document30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node31 = w3CDom0.contextNode(document30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(documentBuilderFactory17);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom22);
        org.junit.Assert.assertNotNull(w3CDom24);
        org.junit.Assert.assertNotNull(documentBuilderFactory26);
        org.junit.Assert.assertNotNull(documentBuilderFactory29);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0422");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom7 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom7.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom11 = w3CDom9.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = w3CDom11.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom11.factory;
        w3CDom6.factory = documentBuilderFactory14;
        org.w3c.dom.Document document16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = w3CDom6.asString(document16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertNotNull(w3CDom11);
        org.junit.Assert.assertNotNull(w3CDom13);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0423");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom11 = w3CDom9.namespaceAware(true);
        org.w3c.dom.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList14 = w3CDom9.selectXpath("", node13);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'xpath' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertNotNull(w3CDom11);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0424");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom0.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory7 = w3CDom0.factory;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory8 = w3CDom0.factory;
        org.jsoup.nodes.Element element9 = null;
        org.w3c.dom.Document document10 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom0.convert(element9, document10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(documentBuilderFactory7);
        org.junit.Assert.assertNotNull(documentBuilderFactory8);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0425");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory3 = w3CDom0.factory;
        org.jsoup.helper.W3CDom w3CDom5 = w3CDom0.namespaceAware(false);
        java.lang.Class<?> wildcardClass6 = w3CDom0.getClass();
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(documentBuilderFactory3);
        org.junit.Assert.assertNotNull(w3CDom5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0426");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom1 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom3 = w3CDom1.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom5 = w3CDom1.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory7 = w3CDom6.factory;
        w3CDom1.factory = documentBuilderFactory7;
        w3CDom0.factory = documentBuilderFactory7;
        org.jsoup.helper.W3CDom w3CDom10 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom10.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom14 = w3CDom10.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom15 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory16 = w3CDom15.factory;
        w3CDom10.factory = documentBuilderFactory16;
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom22 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom23 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory24 = w3CDom23.factory;
        w3CDom18.factory = documentBuilderFactory24;
        w3CDom10.factory = documentBuilderFactory24;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory27 = w3CDom10.factory;
        org.jsoup.helper.W3CDom w3CDom28 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory29 = w3CDom28.factory;
        w3CDom10.factory = documentBuilderFactory29;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory31 = w3CDom10.factory;
        w3CDom0.factory = documentBuilderFactory31;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory33 = w3CDom0.factory;
        org.jsoup.helper.W3CDom w3CDom34 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom36 = w3CDom34.namespaceAware(true);
        boolean boolean37 = w3CDom34.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom39 = w3CDom34.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory40 = w3CDom39.factory;
        w3CDom0.factory = documentBuilderFactory40;
        java.lang.Class<?> wildcardClass42 = documentBuilderFactory40.getClass();
        org.junit.Assert.assertNotNull(w3CDom3);
        org.junit.Assert.assertNotNull(w3CDom5);
        org.junit.Assert.assertNotNull(documentBuilderFactory7);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(w3CDom14);
        org.junit.Assert.assertNotNull(documentBuilderFactory16);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom22);
        org.junit.Assert.assertNotNull(documentBuilderFactory24);
        org.junit.Assert.assertNotNull(documentBuilderFactory27);
        org.junit.Assert.assertNotNull(documentBuilderFactory29);
        org.junit.Assert.assertNotNull(documentBuilderFactory31);
        org.junit.Assert.assertNotNull(documentBuilderFactory33);
        org.junit.Assert.assertNotNull(w3CDom36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(w3CDom39);
        org.junit.Assert.assertNotNull(documentBuilderFactory40);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0427");
        org.w3c.dom.Document document0 = null;
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = org.jsoup.helper.W3CDom.OutputXml();
        java.util.Properties properties2 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        java.util.Properties properties3 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        java.util.Properties properties4 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        java.util.Properties properties5 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        java.util.Properties properties6 = org.jsoup.helper.W3CDom.propertiesFromMap((java.util.Map<java.lang.String, java.lang.String>) strMap1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.jsoup.helper.W3CDom.asString(document0, (java.util.Map<java.lang.String, java.lang.String>) strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertNotNull(properties6);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0428");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory3 = null;
        w3CDom2.factory = documentBuilderFactory3;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory5 = w3CDom2.factory;
        org.w3c.dom.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList8 = w3CDom2.selectXpath("", node7);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'xpath' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNull(documentBuilderFactory5);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0429");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        boolean boolean7 = w3CDom6.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom6.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory10 = w3CDom6.factory;
        org.jsoup.nodes.Document document11 = null;
        org.w3c.dom.Document document12 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom6.convert(document11, document12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertNotNull(documentBuilderFactory10);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0430");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory21 = w3CDom18.factory;
        org.jsoup.helper.W3CDom w3CDom23 = w3CDom18.namespaceAware(false);
        org.jsoup.nodes.Document document24 = null;
        org.w3c.dom.Document document25 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom23.convert(document24, document25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(documentBuilderFactory21);
        org.junit.Assert.assertNotNull(w3CDom23);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0431");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory5 = w3CDom2.factory;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom2.factory;
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom2.namespaceAware(true);
        org.w3c.dom.Document document10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList11 = w3CDom8.selectXpath("javax.xml.xpath.XPathFactory:jsoup", document10);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory5);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom8);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0432");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.w3c.dom.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList5 = w3CDom0.selectXpath("", node4);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'xpath' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0433");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom2.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom2.namespaceAware(false);
        org.w3c.dom.Document document11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = w3CDom10.asString(document11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertNotNull(w3CDom10);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0434");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.nodes.Document document7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document8 = w3CDom6.fromJsoup(document7);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0435");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        boolean boolean17 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom22 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom23 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory24 = w3CDom23.factory;
        w3CDom18.factory = documentBuilderFactory24;
        org.jsoup.helper.W3CDom w3CDom26 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom28 = w3CDom26.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom30 = w3CDom26.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom31 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory32 = w3CDom31.factory;
        w3CDom26.factory = documentBuilderFactory32;
        w3CDom18.factory = documentBuilderFactory32;
        org.jsoup.helper.W3CDom w3CDom36 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom38 = w3CDom36.namespaceAware(false);
        boolean boolean39 = w3CDom38.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory40 = w3CDom38.factory;
        w3CDom0.factory = documentBuilderFactory40;
        boolean boolean42 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom43 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom45 = w3CDom43.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom47 = w3CDom43.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom48 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory49 = w3CDom48.factory;
        w3CDom43.factory = documentBuilderFactory49;
        org.jsoup.helper.W3CDom w3CDom51 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom53 = w3CDom51.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom55 = w3CDom51.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom56 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory57 = w3CDom56.factory;
        w3CDom51.factory = documentBuilderFactory57;
        w3CDom43.factory = documentBuilderFactory57;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory60 = w3CDom43.factory;
        org.jsoup.helper.W3CDom w3CDom61 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom63 = w3CDom61.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom65 = w3CDom63.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom67 = w3CDom63.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom68 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory69 = w3CDom68.factory;
        w3CDom63.factory = documentBuilderFactory69;
        w3CDom43.factory = documentBuilderFactory69;
        w3CDom0.factory = documentBuilderFactory69;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory73 = null;
        w3CDom0.factory = documentBuilderFactory73;
        org.jsoup.nodes.Document document75 = null;
        org.w3c.dom.Document document76 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom0.convert(document75, document76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom22);
        org.junit.Assert.assertNotNull(documentBuilderFactory24);
        org.junit.Assert.assertNotNull(w3CDom28);
        org.junit.Assert.assertNotNull(w3CDom30);
        org.junit.Assert.assertNotNull(documentBuilderFactory32);
        org.junit.Assert.assertNotNull(w3CDom36);
        org.junit.Assert.assertNotNull(w3CDom38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(documentBuilderFactory40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(w3CDom45);
        org.junit.Assert.assertNotNull(w3CDom47);
        org.junit.Assert.assertNotNull(documentBuilderFactory49);
        org.junit.Assert.assertNotNull(w3CDom53);
        org.junit.Assert.assertNotNull(w3CDom55);
        org.junit.Assert.assertNotNull(documentBuilderFactory57);
        org.junit.Assert.assertNotNull(documentBuilderFactory60);
        org.junit.Assert.assertNotNull(w3CDom63);
        org.junit.Assert.assertNotNull(w3CDom65);
        org.junit.Assert.assertNotNull(w3CDom67);
        org.junit.Assert.assertNotNull(documentBuilderFactory69);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0436");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom19 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom21 = w3CDom19.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom23 = w3CDom19.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom24 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory25 = w3CDom24.factory;
        w3CDom19.factory = documentBuilderFactory25;
        org.jsoup.helper.W3CDom w3CDom27 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom29 = w3CDom27.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom31 = w3CDom27.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom32 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory33 = w3CDom32.factory;
        w3CDom27.factory = documentBuilderFactory33;
        w3CDom19.factory = documentBuilderFactory33;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory36 = w3CDom19.factory;
        org.jsoup.helper.W3CDom w3CDom37 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom39 = w3CDom37.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom41 = w3CDom39.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom43 = w3CDom39.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom44 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory45 = w3CDom44.factory;
        w3CDom39.factory = documentBuilderFactory45;
        w3CDom19.factory = documentBuilderFactory45;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory48 = w3CDom19.factory;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory49 = w3CDom19.factory;
        w3CDom0.factory = documentBuilderFactory49;
        org.jsoup.nodes.Document document51 = null;
        org.w3c.dom.Document document52 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom0.convert(document51, document52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(w3CDom21);
        org.junit.Assert.assertNotNull(w3CDom23);
        org.junit.Assert.assertNotNull(documentBuilderFactory25);
        org.junit.Assert.assertNotNull(w3CDom29);
        org.junit.Assert.assertNotNull(w3CDom31);
        org.junit.Assert.assertNotNull(documentBuilderFactory33);
        org.junit.Assert.assertNotNull(documentBuilderFactory36);
        org.junit.Assert.assertNotNull(w3CDom39);
        org.junit.Assert.assertNotNull(w3CDom41);
        org.junit.Assert.assertNotNull(w3CDom43);
        org.junit.Assert.assertNotNull(documentBuilderFactory45);
        org.junit.Assert.assertNotNull(documentBuilderFactory48);
        org.junit.Assert.assertNotNull(documentBuilderFactory49);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0437");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(true);
        java.lang.Class<?> wildcardClass7 = w3CDom4.getClass();
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0438");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom6.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom9 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom11 = w3CDom9.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom13 = w3CDom9.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom14 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory15 = w3CDom14.factory;
        w3CDom9.factory = documentBuilderFactory15;
        org.jsoup.helper.W3CDom w3CDom17 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom19 = w3CDom17.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom21 = w3CDom17.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom22 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory23 = w3CDom22.factory;
        w3CDom17.factory = documentBuilderFactory23;
        w3CDom9.factory = documentBuilderFactory23;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory26 = w3CDom9.factory;
        org.jsoup.helper.W3CDom w3CDom27 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory28 = w3CDom27.factory;
        w3CDom9.factory = documentBuilderFactory28;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory30 = w3CDom9.factory;
        w3CDom8.factory = documentBuilderFactory30;
        org.jsoup.helper.W3CDom w3CDom33 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom35 = w3CDom33.namespaceAware(true);
        org.w3c.dom.Document document37 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList38 = w3CDom33.selectXpath("hi!", document37);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertNotNull(w3CDom11);
        org.junit.Assert.assertNotNull(w3CDom13);
        org.junit.Assert.assertNotNull(documentBuilderFactory15);
        org.junit.Assert.assertNotNull(w3CDom19);
        org.junit.Assert.assertNotNull(w3CDom21);
        org.junit.Assert.assertNotNull(documentBuilderFactory23);
        org.junit.Assert.assertNotNull(documentBuilderFactory26);
        org.junit.Assert.assertNotNull(documentBuilderFactory28);
        org.junit.Assert.assertNotNull(documentBuilderFactory30);
        org.junit.Assert.assertNotNull(w3CDom33);
        org.junit.Assert.assertNotNull(w3CDom35);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0439");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom0.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory7 = w3CDom0.factory;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory8 = w3CDom0.factory;
        org.jsoup.nodes.Document document9 = null;
        org.w3c.dom.Document document10 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom0.convert(document9, document10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(documentBuilderFactory7);
        org.junit.Assert.assertNotNull(documentBuilderFactory8);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0440");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom0.namespaceAware(true);
        java.lang.Class<?> wildcardClass10 = w3CDom0.getClass();
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0441");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        boolean boolean5 = w3CDom4.namespaceAware();
        boolean boolean6 = w3CDom4.namespaceAware();
        boolean boolean7 = w3CDom4.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom4.namespaceAware(false);
        org.w3c.dom.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList12 = w3CDom4.selectXpath("jsoupSource", node11);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(w3CDom9);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0442");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        boolean boolean17 = w3CDom0.namespaceAware();
        org.w3c.dom.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList20 = w3CDom0.selectXpath("", node19);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'xpath' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0443");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom6.namespaceAware(false);
        boolean boolean9 = w3CDom6.namespaceAware();
        org.w3c.dom.Document document11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList12 = w3CDom6.selectXpath("", document11);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'xpath' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0444");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom7 = w3CDom5.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom5.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom11 = w3CDom5.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom12 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom14 = w3CDom12.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom16 = w3CDom14.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom16.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory19 = w3CDom16.factory;
        w3CDom11.factory = documentBuilderFactory19;
        w3CDom4.factory = documentBuilderFactory19;
        org.jsoup.nodes.Element element22 = null;
        org.w3c.dom.Document document23 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom4.convert(element22, document23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom7);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertNotNull(w3CDom11);
        org.junit.Assert.assertNotNull(w3CDom14);
        org.junit.Assert.assertNotNull(w3CDom16);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(documentBuilderFactory19);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0445");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        boolean boolean19 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom21 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom23 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom25 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory26 = w3CDom0.factory;
        org.jsoup.nodes.Document document27 = null;
        org.w3c.dom.Document document28 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom0.convert(document27, document28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(w3CDom21);
        org.junit.Assert.assertNotNull(w3CDom23);
        org.junit.Assert.assertNotNull(w3CDom25);
        org.junit.Assert.assertNotNull(documentBuilderFactory26);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0446");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom4.namespaceAware(false);
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document10 = w3CDom4.fromJsoup(element9);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0447");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(false);
        boolean boolean21 = w3CDom20.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory22 = w3CDom20.factory;
        org.jsoup.nodes.Element element23 = null;
        org.w3c.dom.Document document24 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom20.convert(element23, document24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(documentBuilderFactory22);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0448");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom0.namespaceAware(true);
        java.lang.Class<?> wildcardClass10 = w3CDom9.getClass();
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0449");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom1 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom3 = w3CDom1.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom5 = w3CDom1.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory7 = w3CDom6.factory;
        w3CDom1.factory = documentBuilderFactory7;
        w3CDom0.factory = documentBuilderFactory7;
        org.jsoup.helper.W3CDom w3CDom10 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom10.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom14 = w3CDom10.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom15 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory16 = w3CDom15.factory;
        w3CDom10.factory = documentBuilderFactory16;
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom22 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom23 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory24 = w3CDom23.factory;
        w3CDom18.factory = documentBuilderFactory24;
        w3CDom10.factory = documentBuilderFactory24;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory27 = w3CDom10.factory;
        org.jsoup.helper.W3CDom w3CDom28 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory29 = w3CDom28.factory;
        w3CDom10.factory = documentBuilderFactory29;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory31 = w3CDom10.factory;
        w3CDom0.factory = documentBuilderFactory31;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory33 = w3CDom0.factory;
        java.lang.Class<?> wildcardClass34 = documentBuilderFactory33.getClass();
        org.junit.Assert.assertNotNull(w3CDom3);
        org.junit.Assert.assertNotNull(w3CDom5);
        org.junit.Assert.assertNotNull(documentBuilderFactory7);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(w3CDom14);
        org.junit.Assert.assertNotNull(documentBuilderFactory16);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom22);
        org.junit.Assert.assertNotNull(documentBuilderFactory24);
        org.junit.Assert.assertNotNull(documentBuilderFactory27);
        org.junit.Assert.assertNotNull(documentBuilderFactory29);
        org.junit.Assert.assertNotNull(documentBuilderFactory31);
        org.junit.Assert.assertNotNull(documentBuilderFactory33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0450");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        boolean boolean7 = w3CDom6.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom6.namespaceAware(false);
        boolean boolean10 = w3CDom6.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom6.namespaceAware(true);
        org.w3c.dom.Document document13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node14 = w3CDom12.contextNode(document13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(w3CDom12);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0451");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom4.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom4.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory13 = w3CDom12.factory;
        org.jsoup.helper.W3CDom w3CDom14 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom16 = w3CDom14.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom16.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom22 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom24 = w3CDom18.namespaceAware(true);
        boolean boolean25 = w3CDom18.namespaceAware();
        boolean boolean26 = w3CDom18.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom27 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom29 = w3CDom27.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom31 = w3CDom29.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom33 = w3CDom29.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom35 = w3CDom33.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom36 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom38 = w3CDom36.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom40 = w3CDom36.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom41 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory42 = w3CDom41.factory;
        w3CDom36.factory = documentBuilderFactory42;
        org.jsoup.helper.W3CDom w3CDom44 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom46 = w3CDom44.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom48 = w3CDom44.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom49 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory50 = w3CDom49.factory;
        w3CDom44.factory = documentBuilderFactory50;
        w3CDom36.factory = documentBuilderFactory50;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory53 = w3CDom36.factory;
        org.jsoup.helper.W3CDom w3CDom54 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory55 = w3CDom54.factory;
        w3CDom36.factory = documentBuilderFactory55;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory57 = w3CDom36.factory;
        w3CDom35.factory = documentBuilderFactory57;
        w3CDom18.factory = documentBuilderFactory57;
        w3CDom12.factory = documentBuilderFactory57;
        org.jsoup.nodes.Document document61 = null;
        org.w3c.dom.Document document62 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom12.convert(document61, document62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory13);
        org.junit.Assert.assertNotNull(w3CDom16);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom22);
        org.junit.Assert.assertNotNull(w3CDom24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(w3CDom29);
        org.junit.Assert.assertNotNull(w3CDom31);
        org.junit.Assert.assertNotNull(w3CDom33);
        org.junit.Assert.assertNotNull(w3CDom35);
        org.junit.Assert.assertNotNull(w3CDom38);
        org.junit.Assert.assertNotNull(w3CDom40);
        org.junit.Assert.assertNotNull(documentBuilderFactory42);
        org.junit.Assert.assertNotNull(w3CDom46);
        org.junit.Assert.assertNotNull(w3CDom48);
        org.junit.Assert.assertNotNull(documentBuilderFactory50);
        org.junit.Assert.assertNotNull(documentBuilderFactory53);
        org.junit.Assert.assertNotNull(documentBuilderFactory55);
        org.junit.Assert.assertNotNull(documentBuilderFactory57);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0452");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        boolean boolean7 = w3CDom6.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom6.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom11 = w3CDom9.namespaceAware(true);
        org.w3c.dom.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList14 = w3CDom11.selectXpath("", node13);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'xpath' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertNotNull(w3CDom11);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0453");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom4.namespaceAware(true);
        boolean boolean11 = w3CDom4.namespaceAware();
        boolean boolean12 = w3CDom4.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom15 = w3CDom13.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom17 = w3CDom15.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom19 = w3CDom15.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom21 = w3CDom19.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom22 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom24 = w3CDom22.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom26 = w3CDom22.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom27 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory28 = w3CDom27.factory;
        w3CDom22.factory = documentBuilderFactory28;
        org.jsoup.helper.W3CDom w3CDom30 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom32 = w3CDom30.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom34 = w3CDom30.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom35 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory36 = w3CDom35.factory;
        w3CDom30.factory = documentBuilderFactory36;
        w3CDom22.factory = documentBuilderFactory36;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory39 = w3CDom22.factory;
        org.jsoup.helper.W3CDom w3CDom40 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory41 = w3CDom40.factory;
        w3CDom22.factory = documentBuilderFactory41;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory43 = w3CDom22.factory;
        w3CDom21.factory = documentBuilderFactory43;
        w3CDom4.factory = documentBuilderFactory43;
        org.jsoup.helper.W3CDom w3CDom46 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom48 = w3CDom46.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom50 = w3CDom46.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom51 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory52 = w3CDom51.factory;
        w3CDom46.factory = documentBuilderFactory52;
        org.jsoup.helper.W3CDom w3CDom54 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom56 = w3CDom54.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom58 = w3CDom54.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom59 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory60 = w3CDom59.factory;
        w3CDom54.factory = documentBuilderFactory60;
        w3CDom46.factory = documentBuilderFactory60;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory63 = w3CDom46.factory;
        org.jsoup.helper.W3CDom w3CDom64 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory65 = w3CDom64.factory;
        w3CDom46.factory = documentBuilderFactory65;
        org.jsoup.helper.W3CDom w3CDom67 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom68 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom70 = w3CDom68.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom72 = w3CDom68.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom73 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory74 = w3CDom73.factory;
        w3CDom68.factory = documentBuilderFactory74;
        w3CDom67.factory = documentBuilderFactory74;
        w3CDom46.factory = documentBuilderFactory74;
        w3CDom4.factory = documentBuilderFactory74;
        org.jsoup.nodes.Document document79 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document80 = w3CDom4.fromJsoup(document79);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(w3CDom15);
        org.junit.Assert.assertNotNull(w3CDom17);
        org.junit.Assert.assertNotNull(w3CDom19);
        org.junit.Assert.assertNotNull(w3CDom21);
        org.junit.Assert.assertNotNull(w3CDom24);
        org.junit.Assert.assertNotNull(w3CDom26);
        org.junit.Assert.assertNotNull(documentBuilderFactory28);
        org.junit.Assert.assertNotNull(w3CDom32);
        org.junit.Assert.assertNotNull(w3CDom34);
        org.junit.Assert.assertNotNull(documentBuilderFactory36);
        org.junit.Assert.assertNotNull(documentBuilderFactory39);
        org.junit.Assert.assertNotNull(documentBuilderFactory41);
        org.junit.Assert.assertNotNull(documentBuilderFactory43);
        org.junit.Assert.assertNotNull(w3CDom48);
        org.junit.Assert.assertNotNull(w3CDom50);
        org.junit.Assert.assertNotNull(documentBuilderFactory52);
        org.junit.Assert.assertNotNull(w3CDom56);
        org.junit.Assert.assertNotNull(w3CDom58);
        org.junit.Assert.assertNotNull(documentBuilderFactory60);
        org.junit.Assert.assertNotNull(documentBuilderFactory63);
        org.junit.Assert.assertNotNull(documentBuilderFactory65);
        org.junit.Assert.assertNotNull(w3CDom70);
        org.junit.Assert.assertNotNull(w3CDom72);
        org.junit.Assert.assertNotNull(documentBuilderFactory74);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0454");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        boolean boolean19 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom21 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom23 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom25 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory26 = w3CDom0.factory;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory27 = w3CDom0.factory;
        org.w3c.dom.Document document28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node29 = w3CDom0.contextNode(document28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(w3CDom21);
        org.junit.Assert.assertNotNull(w3CDom23);
        org.junit.Assert.assertNotNull(w3CDom25);
        org.junit.Assert.assertNotNull(documentBuilderFactory26);
        org.junit.Assert.assertNotNull(documentBuilderFactory27);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0455");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        boolean boolean17 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom22 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom23 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory24 = w3CDom23.factory;
        w3CDom18.factory = documentBuilderFactory24;
        org.jsoup.helper.W3CDom w3CDom26 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom28 = w3CDom26.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom30 = w3CDom26.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom31 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory32 = w3CDom31.factory;
        w3CDom26.factory = documentBuilderFactory32;
        w3CDom18.factory = documentBuilderFactory32;
        org.jsoup.helper.W3CDom w3CDom36 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom38 = w3CDom36.namespaceAware(false);
        boolean boolean39 = w3CDom38.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory40 = w3CDom38.factory;
        w3CDom0.factory = documentBuilderFactory40;
        boolean boolean42 = w3CDom0.namespaceAware();
        org.w3c.dom.Document document44 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList45 = w3CDom0.selectXpath("hi!", document44);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom22);
        org.junit.Assert.assertNotNull(documentBuilderFactory24);
        org.junit.Assert.assertNotNull(w3CDom28);
        org.junit.Assert.assertNotNull(w3CDom30);
        org.junit.Assert.assertNotNull(documentBuilderFactory32);
        org.junit.Assert.assertNotNull(w3CDom36);
        org.junit.Assert.assertNotNull(w3CDom38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(documentBuilderFactory40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0456");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        boolean boolean17 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom22 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom23 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory24 = w3CDom23.factory;
        w3CDom18.factory = documentBuilderFactory24;
        org.jsoup.helper.W3CDom w3CDom26 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom28 = w3CDom26.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom30 = w3CDom26.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom31 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory32 = w3CDom31.factory;
        w3CDom26.factory = documentBuilderFactory32;
        w3CDom18.factory = documentBuilderFactory32;
        org.jsoup.helper.W3CDom w3CDom36 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom38 = w3CDom36.namespaceAware(false);
        boolean boolean39 = w3CDom38.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory40 = w3CDom38.factory;
        w3CDom0.factory = documentBuilderFactory40;
        boolean boolean42 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom43 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom45 = w3CDom43.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom47 = w3CDom43.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom48 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory49 = w3CDom48.factory;
        w3CDom43.factory = documentBuilderFactory49;
        org.jsoup.helper.W3CDom w3CDom51 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom53 = w3CDom51.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom55 = w3CDom51.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom56 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory57 = w3CDom56.factory;
        w3CDom51.factory = documentBuilderFactory57;
        w3CDom43.factory = documentBuilderFactory57;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory60 = w3CDom43.factory;
        org.jsoup.helper.W3CDom w3CDom61 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom63 = w3CDom61.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom65 = w3CDom63.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom67 = w3CDom63.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom68 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory69 = w3CDom68.factory;
        w3CDom63.factory = documentBuilderFactory69;
        w3CDom43.factory = documentBuilderFactory69;
        w3CDom0.factory = documentBuilderFactory69;
        org.jsoup.nodes.Document document73 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document74 = w3CDom0.fromJsoup(document73);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom22);
        org.junit.Assert.assertNotNull(documentBuilderFactory24);
        org.junit.Assert.assertNotNull(w3CDom28);
        org.junit.Assert.assertNotNull(w3CDom30);
        org.junit.Assert.assertNotNull(documentBuilderFactory32);
        org.junit.Assert.assertNotNull(w3CDom36);
        org.junit.Assert.assertNotNull(w3CDom38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(documentBuilderFactory40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(w3CDom45);
        org.junit.Assert.assertNotNull(w3CDom47);
        org.junit.Assert.assertNotNull(documentBuilderFactory49);
        org.junit.Assert.assertNotNull(w3CDom53);
        org.junit.Assert.assertNotNull(w3CDom55);
        org.junit.Assert.assertNotNull(documentBuilderFactory57);
        org.junit.Assert.assertNotNull(documentBuilderFactory60);
        org.junit.Assert.assertNotNull(w3CDom63);
        org.junit.Assert.assertNotNull(w3CDom65);
        org.junit.Assert.assertNotNull(w3CDom67);
        org.junit.Assert.assertNotNull(documentBuilderFactory69);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0457");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory17 = w3CDom0.factory;
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom22 = w3CDom20.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom24 = w3CDom20.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom25 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory26 = w3CDom25.factory;
        w3CDom20.factory = documentBuilderFactory26;
        w3CDom0.factory = documentBuilderFactory26;
        org.w3c.dom.Document document30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList31 = w3CDom0.selectXpath("hi!", document30);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(documentBuilderFactory17);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom22);
        org.junit.Assert.assertNotNull(w3CDom24);
        org.junit.Assert.assertNotNull(documentBuilderFactory26);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0458");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        boolean boolean3 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom5 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom7 = w3CDom0.namespaceAware(false);
        org.jsoup.nodes.Document document8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document9 = w3CDom0.fromJsoup(document8);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(w3CDom5);
        org.junit.Assert.assertNotNull(w3CDom7);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0459");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        boolean boolean3 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom5 = w3CDom0.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        org.w3c.dom.Document document7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = w3CDom5.asString(document7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(w3CDom5);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0460");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom0.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory7 = w3CDom0.factory;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory8 = w3CDom0.factory;
        org.jsoup.nodes.Document document9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document10 = w3CDom0.fromJsoup(document9);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(documentBuilderFactory7);
        org.junit.Assert.assertNotNull(documentBuilderFactory8);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0461");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory1 = w3CDom0.factory;
        boolean boolean2 = w3CDom0.namespaceAware();
        org.jsoup.nodes.Element element3 = null;
        org.w3c.dom.Document document4 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom0.convert(element3, document4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(documentBuilderFactory1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0462");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        boolean boolean3 = w3CDom2.namespaceAware();
        boolean boolean4 = w3CDom2.namespaceAware();
        org.jsoup.nodes.Document document5 = null;
        org.w3c.dom.Document document6 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom2.convert(document5, document6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0463");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory5 = w3CDom2.factory;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom2.factory;
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom2.namespaceAware(true);
        org.w3c.dom.Document document9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = w3CDom2.asString(document9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory5);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom8);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0464");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom11 = w3CDom9.namespaceAware(true);
        boolean boolean12 = w3CDom9.namespaceAware();
        org.w3c.dom.Document document13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = w3CDom9.asString(document13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertNotNull(w3CDom11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0465");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        boolean boolean7 = w3CDom4.namespaceAware();
        boolean boolean8 = w3CDom4.namespaceAware();
        org.w3c.dom.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList11 = w3CDom4.selectXpath("", node10);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'xpath' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0466");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory7 = w3CDom4.factory;
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom4.namespaceAware(false);
        java.lang.Class<?> wildcardClass10 = w3CDom9.getClass();
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(documentBuilderFactory7);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0467");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory1 = w3CDom0.factory;
        boolean boolean2 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom3 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom5 = w3CDom3.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom7 = w3CDom3.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        boolean boolean11 = w3CDom8.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory12 = w3CDom8.factory;
        w3CDom3.factory = documentBuilderFactory12;
        w3CDom0.factory = documentBuilderFactory12;
        org.w3c.dom.Document document15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node16 = w3CDom0.contextNode(document15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(documentBuilderFactory1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(w3CDom5);
        org.junit.Assert.assertNotNull(w3CDom7);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(documentBuilderFactory12);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0468");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        boolean boolean7 = w3CDom6.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom6.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom11 = w3CDom9.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom13 = w3CDom11.namespaceAware(true);
        org.w3c.dom.Document document14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = w3CDom11.asString(document14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertNotNull(w3CDom11);
        org.junit.Assert.assertNotNull(w3CDom13);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0469");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom6.namespaceAware(true);
        org.jsoup.nodes.Element element9 = null;
        org.w3c.dom.Document document10 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom8.convert(element9, document10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0470");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        boolean boolean7 = w3CDom6.namespaceAware();
        org.w3c.dom.Document document8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node9 = w3CDom6.contextNode(document8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0471");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        boolean boolean19 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom21 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom23 = w3CDom0.namespaceAware(false);
        org.w3c.dom.Document document24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node25 = w3CDom23.contextNode(document24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(w3CDom21);
        org.junit.Assert.assertNotNull(w3CDom23);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0472");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        boolean boolean5 = w3CDom0.namespaceAware();
        org.w3c.dom.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList8 = w3CDom0.selectXpath("jsoupSource", node7);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0473");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom4.namespaceAware(true);
        org.w3c.dom.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList13 = w3CDom4.selectXpath("hi!", node12);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertNotNull(w3CDom10);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0474");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom21 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom22 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom24 = w3CDom22.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom26 = w3CDom22.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom27 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory28 = w3CDom27.factory;
        w3CDom22.factory = documentBuilderFactory28;
        w3CDom21.factory = documentBuilderFactory28;
        w3CDom20.factory = documentBuilderFactory28;
        org.jsoup.helper.W3CDom w3CDom33 = w3CDom20.namespaceAware(false);
        org.w3c.dom.Document document34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = w3CDom20.asString(document34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom24);
        org.junit.Assert.assertNotNull(w3CDom26);
        org.junit.Assert.assertNotNull(documentBuilderFactory28);
        org.junit.Assert.assertNotNull(w3CDom33);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0475");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom1 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom3 = w3CDom1.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom5 = w3CDom1.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory7 = w3CDom6.factory;
        w3CDom1.factory = documentBuilderFactory7;
        w3CDom0.factory = documentBuilderFactory7;
        org.jsoup.helper.W3CDom w3CDom10 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom10.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom14 = w3CDom10.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom15 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory16 = w3CDom15.factory;
        w3CDom10.factory = documentBuilderFactory16;
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom22 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom23 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory24 = w3CDom23.factory;
        w3CDom18.factory = documentBuilderFactory24;
        w3CDom10.factory = documentBuilderFactory24;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory27 = w3CDom10.factory;
        org.jsoup.helper.W3CDom w3CDom28 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory29 = w3CDom28.factory;
        w3CDom10.factory = documentBuilderFactory29;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory31 = w3CDom10.factory;
        w3CDom0.factory = documentBuilderFactory31;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory33 = w3CDom0.factory;
        java.lang.Class<?> wildcardClass34 = w3CDom0.getClass();
        org.junit.Assert.assertNotNull(w3CDom3);
        org.junit.Assert.assertNotNull(w3CDom5);
        org.junit.Assert.assertNotNull(documentBuilderFactory7);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(w3CDom14);
        org.junit.Assert.assertNotNull(documentBuilderFactory16);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom22);
        org.junit.Assert.assertNotNull(documentBuilderFactory24);
        org.junit.Assert.assertNotNull(documentBuilderFactory27);
        org.junit.Assert.assertNotNull(documentBuilderFactory29);
        org.junit.Assert.assertNotNull(documentBuilderFactory31);
        org.junit.Assert.assertNotNull(documentBuilderFactory33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0476");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom6.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory9 = w3CDom6.factory;
        org.jsoup.helper.W3CDom w3CDom11 = w3CDom6.namespaceAware(true);
        java.lang.Class<?> wildcardClass12 = w3CDom11.getClass();
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertNotNull(documentBuilderFactory9);
        org.junit.Assert.assertNotNull(w3CDom11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0477");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory21 = w3CDom18.factory;
        boolean boolean22 = w3CDom18.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom24 = w3CDom18.namespaceAware(false);
        org.jsoup.nodes.Document document25 = null;
        org.w3c.dom.Document document26 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom18.convert(document25, document26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(documentBuilderFactory21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(w3CDom24);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0478");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        boolean boolean17 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom22 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom23 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory24 = w3CDom23.factory;
        w3CDom18.factory = documentBuilderFactory24;
        org.jsoup.helper.W3CDom w3CDom26 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom28 = w3CDom26.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom30 = w3CDom26.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom31 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory32 = w3CDom31.factory;
        w3CDom26.factory = documentBuilderFactory32;
        w3CDom18.factory = documentBuilderFactory32;
        org.jsoup.helper.W3CDom w3CDom36 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom38 = w3CDom36.namespaceAware(false);
        boolean boolean39 = w3CDom38.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory40 = w3CDom38.factory;
        w3CDom0.factory = documentBuilderFactory40;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory42 = w3CDom0.factory;
        boolean boolean43 = w3CDom0.namespaceAware();
        org.jsoup.nodes.Element element44 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document45 = w3CDom0.fromJsoup(element44);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom22);
        org.junit.Assert.assertNotNull(documentBuilderFactory24);
        org.junit.Assert.assertNotNull(w3CDom28);
        org.junit.Assert.assertNotNull(w3CDom30);
        org.junit.Assert.assertNotNull(documentBuilderFactory32);
        org.junit.Assert.assertNotNull(w3CDom36);
        org.junit.Assert.assertNotNull(w3CDom38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(documentBuilderFactory40);
        org.junit.Assert.assertNotNull(documentBuilderFactory42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0479");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.w3c.dom.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList3 = w3CDom0.selectXpath("hi!", node2);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0480");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory21 = w3CDom18.factory;
        org.jsoup.helper.W3CDom w3CDom23 = w3CDom18.namespaceAware(false);
        org.jsoup.nodes.Document document24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document25 = w3CDom18.fromJsoup(document24);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(documentBuilderFactory21);
        org.junit.Assert.assertNotNull(w3CDom23);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0481");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        boolean boolean17 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom22 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom23 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory24 = w3CDom23.factory;
        w3CDom18.factory = documentBuilderFactory24;
        org.jsoup.helper.W3CDom w3CDom26 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom28 = w3CDom26.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom30 = w3CDom26.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom31 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory32 = w3CDom31.factory;
        w3CDom26.factory = documentBuilderFactory32;
        w3CDom18.factory = documentBuilderFactory32;
        org.jsoup.helper.W3CDom w3CDom36 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom38 = w3CDom36.namespaceAware(false);
        boolean boolean39 = w3CDom38.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory40 = w3CDom38.factory;
        w3CDom0.factory = documentBuilderFactory40;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory42 = w3CDom0.factory;
        org.w3c.dom.Document document43 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node44 = w3CDom0.contextNode(document43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom22);
        org.junit.Assert.assertNotNull(documentBuilderFactory24);
        org.junit.Assert.assertNotNull(w3CDom28);
        org.junit.Assert.assertNotNull(w3CDom30);
        org.junit.Assert.assertNotNull(documentBuilderFactory32);
        org.junit.Assert.assertNotNull(w3CDom36);
        org.junit.Assert.assertNotNull(w3CDom38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(documentBuilderFactory40);
        org.junit.Assert.assertNotNull(documentBuilderFactory42);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0482");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        boolean boolean7 = w3CDom6.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom6.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory10 = w3CDom6.factory;
        java.lang.Class<?> wildcardClass11 = w3CDom6.getClass();
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertNotNull(documentBuilderFactory10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0483");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom0.namespaceAware(true);
        boolean boolean19 = w3CDom0.namespaceAware();
        org.w3c.dom.Document document20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = w3CDom0.asString(document20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0484");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom7 = w3CDom5.namespaceAware(true);
        boolean boolean8 = w3CDom5.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory9 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory9;
        org.jsoup.helper.W3CDom w3CDom11 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom13 = w3CDom11.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = null;
        w3CDom13.factory = documentBuilderFactory14;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory16 = w3CDom13.factory;
        org.jsoup.helper.W3CDom w3CDom17 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom19 = w3CDom17.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom21 = w3CDom17.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom22 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory23 = w3CDom22.factory;
        w3CDom17.factory = documentBuilderFactory23;
        org.jsoup.helper.W3CDom w3CDom25 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom27 = w3CDom25.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom29 = w3CDom25.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom30 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory31 = w3CDom30.factory;
        w3CDom25.factory = documentBuilderFactory31;
        w3CDom17.factory = documentBuilderFactory31;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory34 = w3CDom17.factory;
        w3CDom13.factory = documentBuilderFactory34;
        w3CDom0.factory = documentBuilderFactory34;
        org.jsoup.helper.W3CDom w3CDom38 = w3CDom0.namespaceAware(false);
        org.jsoup.nodes.Document document39 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document40 = w3CDom0.fromJsoup(document39);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(documentBuilderFactory9);
        org.junit.Assert.assertNotNull(w3CDom13);
        org.junit.Assert.assertNull(documentBuilderFactory16);
        org.junit.Assert.assertNotNull(w3CDom19);
        org.junit.Assert.assertNotNull(w3CDom21);
        org.junit.Assert.assertNotNull(documentBuilderFactory23);
        org.junit.Assert.assertNotNull(w3CDom27);
        org.junit.Assert.assertNotNull(w3CDom29);
        org.junit.Assert.assertNotNull(documentBuilderFactory31);
        org.junit.Assert.assertNotNull(documentBuilderFactory34);
        org.junit.Assert.assertNotNull(w3CDom38);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0485");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory1 = w3CDom0.factory;
        org.jsoup.helper.W3CDom w3CDom3 = w3CDom0.namespaceAware(true);
        org.jsoup.nodes.Document document4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document5 = w3CDom0.fromJsoup(document4);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(documentBuilderFactory1);
        org.junit.Assert.assertNotNull(w3CDom3);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0486");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        boolean boolean7 = w3CDom6.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom6.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom10 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom10.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom14 = w3CDom12.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory15 = w3CDom12.factory;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory16 = w3CDom12.factory;
        w3CDom6.factory = documentBuilderFactory16;
        org.jsoup.helper.W3CDom w3CDom19 = w3CDom6.namespaceAware(true);
        org.jsoup.nodes.Element element20 = null;
        org.w3c.dom.Document document21 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom6.convert(element20, document21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(w3CDom14);
        org.junit.Assert.assertNotNull(documentBuilderFactory15);
        org.junit.Assert.assertNotNull(documentBuilderFactory16);
        org.junit.Assert.assertNotNull(w3CDom19);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0487");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom4.namespaceAware(true);
        boolean boolean11 = w3CDom4.namespaceAware();
        boolean boolean12 = w3CDom4.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom15 = w3CDom13.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom17 = w3CDom15.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom19 = w3CDom15.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom21 = w3CDom19.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom22 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom24 = w3CDom22.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom26 = w3CDom22.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom27 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory28 = w3CDom27.factory;
        w3CDom22.factory = documentBuilderFactory28;
        org.jsoup.helper.W3CDom w3CDom30 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom32 = w3CDom30.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom34 = w3CDom30.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom35 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory36 = w3CDom35.factory;
        w3CDom30.factory = documentBuilderFactory36;
        w3CDom22.factory = documentBuilderFactory36;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory39 = w3CDom22.factory;
        org.jsoup.helper.W3CDom w3CDom40 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory41 = w3CDom40.factory;
        w3CDom22.factory = documentBuilderFactory41;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory43 = w3CDom22.factory;
        w3CDom21.factory = documentBuilderFactory43;
        w3CDom4.factory = documentBuilderFactory43;
        org.jsoup.helper.W3CDom w3CDom46 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom48 = w3CDom46.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom50 = w3CDom46.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom51 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory52 = w3CDom51.factory;
        w3CDom46.factory = documentBuilderFactory52;
        org.jsoup.helper.W3CDom w3CDom54 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom56 = w3CDom54.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom58 = w3CDom54.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom59 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory60 = w3CDom59.factory;
        w3CDom54.factory = documentBuilderFactory60;
        w3CDom46.factory = documentBuilderFactory60;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory63 = w3CDom46.factory;
        org.jsoup.helper.W3CDom w3CDom64 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory65 = w3CDom64.factory;
        w3CDom46.factory = documentBuilderFactory65;
        org.jsoup.helper.W3CDom w3CDom67 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom68 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom70 = w3CDom68.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom72 = w3CDom68.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom73 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory74 = w3CDom73.factory;
        w3CDom68.factory = documentBuilderFactory74;
        w3CDom67.factory = documentBuilderFactory74;
        w3CDom46.factory = documentBuilderFactory74;
        w3CDom4.factory = documentBuilderFactory74;
        java.lang.Class<?> wildcardClass79 = documentBuilderFactory74.getClass();
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(w3CDom15);
        org.junit.Assert.assertNotNull(w3CDom17);
        org.junit.Assert.assertNotNull(w3CDom19);
        org.junit.Assert.assertNotNull(w3CDom21);
        org.junit.Assert.assertNotNull(w3CDom24);
        org.junit.Assert.assertNotNull(w3CDom26);
        org.junit.Assert.assertNotNull(documentBuilderFactory28);
        org.junit.Assert.assertNotNull(w3CDom32);
        org.junit.Assert.assertNotNull(w3CDom34);
        org.junit.Assert.assertNotNull(documentBuilderFactory36);
        org.junit.Assert.assertNotNull(documentBuilderFactory39);
        org.junit.Assert.assertNotNull(documentBuilderFactory41);
        org.junit.Assert.assertNotNull(documentBuilderFactory43);
        org.junit.Assert.assertNotNull(w3CDom48);
        org.junit.Assert.assertNotNull(w3CDom50);
        org.junit.Assert.assertNotNull(documentBuilderFactory52);
        org.junit.Assert.assertNotNull(w3CDom56);
        org.junit.Assert.assertNotNull(w3CDom58);
        org.junit.Assert.assertNotNull(documentBuilderFactory60);
        org.junit.Assert.assertNotNull(documentBuilderFactory63);
        org.junit.Assert.assertNotNull(documentBuilderFactory65);
        org.junit.Assert.assertNotNull(w3CDom70);
        org.junit.Assert.assertNotNull(w3CDom72);
        org.junit.Assert.assertNotNull(documentBuilderFactory74);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0488");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom4.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom4.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom4.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory13 = w3CDom12.factory;
        org.jsoup.helper.W3CDom w3CDom14 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom16 = w3CDom14.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom16.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom22 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom24 = w3CDom18.namespaceAware(true);
        boolean boolean25 = w3CDom18.namespaceAware();
        boolean boolean26 = w3CDom18.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom27 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom29 = w3CDom27.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom31 = w3CDom29.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom33 = w3CDom29.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom35 = w3CDom33.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom36 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom38 = w3CDom36.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom40 = w3CDom36.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom41 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory42 = w3CDom41.factory;
        w3CDom36.factory = documentBuilderFactory42;
        org.jsoup.helper.W3CDom w3CDom44 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom46 = w3CDom44.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom48 = w3CDom44.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom49 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory50 = w3CDom49.factory;
        w3CDom44.factory = documentBuilderFactory50;
        w3CDom36.factory = documentBuilderFactory50;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory53 = w3CDom36.factory;
        org.jsoup.helper.W3CDom w3CDom54 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory55 = w3CDom54.factory;
        w3CDom36.factory = documentBuilderFactory55;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory57 = w3CDom36.factory;
        w3CDom35.factory = documentBuilderFactory57;
        w3CDom18.factory = documentBuilderFactory57;
        w3CDom12.factory = documentBuilderFactory57;
        org.w3c.dom.Document document62 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList63 = w3CDom12.selectXpath("javax.xml.xpath.XPathFactory:jsoup", document62);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory13);
        org.junit.Assert.assertNotNull(w3CDom16);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom22);
        org.junit.Assert.assertNotNull(w3CDom24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(w3CDom29);
        org.junit.Assert.assertNotNull(w3CDom31);
        org.junit.Assert.assertNotNull(w3CDom33);
        org.junit.Assert.assertNotNull(w3CDom35);
        org.junit.Assert.assertNotNull(w3CDom38);
        org.junit.Assert.assertNotNull(w3CDom40);
        org.junit.Assert.assertNotNull(documentBuilderFactory42);
        org.junit.Assert.assertNotNull(w3CDom46);
        org.junit.Assert.assertNotNull(w3CDom48);
        org.junit.Assert.assertNotNull(documentBuilderFactory50);
        org.junit.Assert.assertNotNull(documentBuilderFactory53);
        org.junit.Assert.assertNotNull(documentBuilderFactory55);
        org.junit.Assert.assertNotNull(documentBuilderFactory57);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0489");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom6.namespaceAware(false);
        boolean boolean9 = w3CDom6.namespaceAware();
        org.w3c.dom.Document document10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = w3CDom6.asString(document10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0490");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom8 = w3CDom2.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom2.namespaceAware(false);
        org.jsoup.nodes.Document document11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document12 = w3CDom2.fromJsoup(document11);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(w3CDom8);
        org.junit.Assert.assertNotNull(w3CDom10);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0491");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory1 = w3CDom0.factory;
        boolean boolean2 = w3CDom0.namespaceAware();
        org.w3c.dom.Document document3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = w3CDom0.asString(document3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getDoctype()\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(documentBuilderFactory1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0492");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        boolean boolean17 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom19 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom21 = w3CDom19.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom23 = w3CDom19.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom24 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory25 = w3CDom24.factory;
        w3CDom19.factory = documentBuilderFactory25;
        w3CDom18.factory = documentBuilderFactory25;
        org.jsoup.helper.W3CDom w3CDom28 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom30 = w3CDom28.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom32 = w3CDom28.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom33 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory34 = w3CDom33.factory;
        w3CDom28.factory = documentBuilderFactory34;
        org.jsoup.helper.W3CDom w3CDom36 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom38 = w3CDom36.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom40 = w3CDom36.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom41 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory42 = w3CDom41.factory;
        w3CDom36.factory = documentBuilderFactory42;
        w3CDom28.factory = documentBuilderFactory42;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory45 = w3CDom28.factory;
        org.jsoup.helper.W3CDom w3CDom46 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory47 = w3CDom46.factory;
        w3CDom28.factory = documentBuilderFactory47;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory49 = w3CDom28.factory;
        w3CDom18.factory = documentBuilderFactory49;
        w3CDom0.factory = documentBuilderFactory49;
        org.jsoup.nodes.Document document52 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document53 = w3CDom0.fromJsoup(document52);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(w3CDom21);
        org.junit.Assert.assertNotNull(w3CDom23);
        org.junit.Assert.assertNotNull(documentBuilderFactory25);
        org.junit.Assert.assertNotNull(w3CDom30);
        org.junit.Assert.assertNotNull(w3CDom32);
        org.junit.Assert.assertNotNull(documentBuilderFactory34);
        org.junit.Assert.assertNotNull(w3CDom38);
        org.junit.Assert.assertNotNull(w3CDom40);
        org.junit.Assert.assertNotNull(documentBuilderFactory42);
        org.junit.Assert.assertNotNull(documentBuilderFactory45);
        org.junit.Assert.assertNotNull(documentBuilderFactory47);
        org.junit.Assert.assertNotNull(documentBuilderFactory49);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0493");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom2.namespaceAware(false);
        boolean boolean7 = w3CDom6.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom6.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory10 = w3CDom6.factory;
        org.jsoup.helper.W3CDom w3CDom11 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom13 = w3CDom11.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom15 = w3CDom13.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom17 = w3CDom15.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom19 = w3CDom15.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom20 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom22 = w3CDom20.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom24 = w3CDom22.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom26 = w3CDom22.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom27 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory28 = w3CDom27.factory;
        w3CDom22.factory = documentBuilderFactory28;
        w3CDom15.factory = documentBuilderFactory28;
        w3CDom6.factory = documentBuilderFactory28;
        org.w3c.dom.Document document32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node33 = w3CDom6.contextNode(document32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertNotNull(documentBuilderFactory10);
        org.junit.Assert.assertNotNull(w3CDom13);
        org.junit.Assert.assertNotNull(w3CDom15);
        org.junit.Assert.assertNotNull(w3CDom17);
        org.junit.Assert.assertNotNull(w3CDom19);
        org.junit.Assert.assertNotNull(w3CDom22);
        org.junit.Assert.assertNotNull(w3CDom24);
        org.junit.Assert.assertNotNull(w3CDom26);
        org.junit.Assert.assertNotNull(documentBuilderFactory28);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0494");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        boolean boolean17 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom22 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom23 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory24 = w3CDom23.factory;
        w3CDom18.factory = documentBuilderFactory24;
        org.jsoup.helper.W3CDom w3CDom26 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom28 = w3CDom26.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom30 = w3CDom26.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom31 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory32 = w3CDom31.factory;
        w3CDom26.factory = documentBuilderFactory32;
        w3CDom18.factory = documentBuilderFactory32;
        org.jsoup.helper.W3CDom w3CDom36 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom38 = w3CDom36.namespaceAware(false);
        boolean boolean39 = w3CDom38.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory40 = w3CDom38.factory;
        w3CDom0.factory = documentBuilderFactory40;
        org.jsoup.helper.W3CDom w3CDom43 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom44 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom46 = w3CDom44.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom48 = w3CDom46.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom50 = w3CDom48.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom52 = w3CDom48.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom54 = w3CDom48.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom55 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom57 = w3CDom55.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom59 = w3CDom55.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom60 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory61 = w3CDom60.factory;
        w3CDom55.factory = documentBuilderFactory61;
        org.jsoup.helper.W3CDom w3CDom63 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom65 = w3CDom63.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom67 = w3CDom63.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom68 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory69 = w3CDom68.factory;
        w3CDom63.factory = documentBuilderFactory69;
        w3CDom55.factory = documentBuilderFactory69;
        org.jsoup.helper.W3CDom w3CDom73 = w3CDom55.namespaceAware(true);
        boolean boolean74 = w3CDom55.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom76 = w3CDom55.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom78 = w3CDom55.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom80 = w3CDom55.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory81 = w3CDom55.factory;
        w3CDom54.factory = documentBuilderFactory81;
        w3CDom43.factory = documentBuilderFactory81;
        org.w3c.dom.Document document84 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node85 = w3CDom43.contextNode(document84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom22);
        org.junit.Assert.assertNotNull(documentBuilderFactory24);
        org.junit.Assert.assertNotNull(w3CDom28);
        org.junit.Assert.assertNotNull(w3CDom30);
        org.junit.Assert.assertNotNull(documentBuilderFactory32);
        org.junit.Assert.assertNotNull(w3CDom36);
        org.junit.Assert.assertNotNull(w3CDom38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(documentBuilderFactory40);
        org.junit.Assert.assertNotNull(w3CDom43);
        org.junit.Assert.assertNotNull(w3CDom46);
        org.junit.Assert.assertNotNull(w3CDom48);
        org.junit.Assert.assertNotNull(w3CDom50);
        org.junit.Assert.assertNotNull(w3CDom52);
        org.junit.Assert.assertNotNull(w3CDom54);
        org.junit.Assert.assertNotNull(w3CDom57);
        org.junit.Assert.assertNotNull(w3CDom59);
        org.junit.Assert.assertNotNull(documentBuilderFactory61);
        org.junit.Assert.assertNotNull(w3CDom65);
        org.junit.Assert.assertNotNull(w3CDom67);
        org.junit.Assert.assertNotNull(documentBuilderFactory69);
        org.junit.Assert.assertNotNull(w3CDom73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(w3CDom76);
        org.junit.Assert.assertNotNull(w3CDom78);
        org.junit.Assert.assertNotNull(w3CDom80);
        org.junit.Assert.assertNotNull(documentBuilderFactory81);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0495");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory5 = w3CDom2.factory;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom2.factory;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory7 = w3CDom2.factory;
        boolean boolean8 = w3CDom2.namespaceAware();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory9 = w3CDom2.factory;
        java.lang.Class<?> wildcardClass10 = w3CDom2.getClass();
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory5);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(documentBuilderFactory7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(documentBuilderFactory9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0496");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom1 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom3 = w3CDom1.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom5 = w3CDom1.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory7 = w3CDom6.factory;
        w3CDom1.factory = documentBuilderFactory7;
        w3CDom0.factory = documentBuilderFactory7;
        org.jsoup.helper.W3CDom w3CDom10 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom10.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom14 = w3CDom10.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom15 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory16 = w3CDom15.factory;
        w3CDom10.factory = documentBuilderFactory16;
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom22 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom23 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory24 = w3CDom23.factory;
        w3CDom18.factory = documentBuilderFactory24;
        w3CDom10.factory = documentBuilderFactory24;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory27 = w3CDom10.factory;
        org.jsoup.helper.W3CDom w3CDom28 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory29 = w3CDom28.factory;
        w3CDom10.factory = documentBuilderFactory29;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory31 = w3CDom10.factory;
        w3CDom0.factory = documentBuilderFactory31;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory33 = w3CDom0.factory;
        org.w3c.dom.Document document35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList36 = w3CDom0.selectXpath("", document35);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'xpath' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom3);
        org.junit.Assert.assertNotNull(w3CDom5);
        org.junit.Assert.assertNotNull(documentBuilderFactory7);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(w3CDom14);
        org.junit.Assert.assertNotNull(documentBuilderFactory16);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom22);
        org.junit.Assert.assertNotNull(documentBuilderFactory24);
        org.junit.Assert.assertNotNull(documentBuilderFactory27);
        org.junit.Assert.assertNotNull(documentBuilderFactory29);
        org.junit.Assert.assertNotNull(documentBuilderFactory31);
        org.junit.Assert.assertNotNull(documentBuilderFactory33);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0497");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom2.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom6 = w3CDom4.namespaceAware(false);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory7 = w3CDom6.factory;
        boolean boolean8 = w3CDom6.namespaceAware();
        org.w3c.dom.Document document9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node10 = w3CDom6.contextNode(document9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"wDoc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(w3CDom6);
        org.junit.Assert.assertNotNull(documentBuilderFactory7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0498");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory1 = w3CDom0.factory;
        org.jsoup.helper.W3CDom w3CDom3 = w3CDom0.namespaceAware(true);
        org.w3c.dom.Document document5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.NodeList nodeList6 = w3CDom0.selectXpath("javax.xml.xpath.XPathFactory:jsoup", document5);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'contextNode' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(documentBuilderFactory1);
        org.junit.Assert.assertNotNull(w3CDom3);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0499");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory3 = null;
        w3CDom2.factory = documentBuilderFactory3;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory5 = w3CDom2.factory;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom2.factory;
        org.jsoup.helper.W3CDom w3CDom7 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom9 = w3CDom7.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom11 = w3CDom9.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = w3CDom11.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom15 = w3CDom11.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom16 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom18 = w3CDom16.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom20 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom22 = w3CDom18.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom23 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory24 = w3CDom23.factory;
        w3CDom18.factory = documentBuilderFactory24;
        w3CDom11.factory = documentBuilderFactory24;
        w3CDom2.factory = documentBuilderFactory24;
        org.jsoup.nodes.Element element28 = null;
        org.w3c.dom.Document document29 = null;
        // The following exception was thrown during execution in test generation
        try {
            w3CDom2.convert(element28, document29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.w3c.dom.Document.getUserData(String)\" because \"doc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNull(documentBuilderFactory5);
        org.junit.Assert.assertNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom9);
        org.junit.Assert.assertNotNull(w3CDom11);
        org.junit.Assert.assertNotNull(w3CDom13);
        org.junit.Assert.assertNotNull(w3CDom15);
        org.junit.Assert.assertNotNull(w3CDom18);
        org.junit.Assert.assertNotNull(w3CDom20);
        org.junit.Assert.assertNotNull(w3CDom22);
        org.junit.Assert.assertNotNull(documentBuilderFactory24);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "W3CDomRegressionTest0.test0500");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom2 = w3CDom0.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom4 = w3CDom0.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom5 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory6 = w3CDom5.factory;
        w3CDom0.factory = documentBuilderFactory6;
        org.jsoup.helper.W3CDom w3CDom8 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom10 = w3CDom8.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom12 = w3CDom8.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom13 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory14 = w3CDom13.factory;
        w3CDom8.factory = documentBuilderFactory14;
        w3CDom0.factory = documentBuilderFactory14;
        boolean boolean17 = w3CDom0.namespaceAware();
        org.jsoup.helper.W3CDom w3CDom18 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom19 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom21 = w3CDom19.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom23 = w3CDom19.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom24 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory25 = w3CDom24.factory;
        w3CDom19.factory = documentBuilderFactory25;
        w3CDom18.factory = documentBuilderFactory25;
        org.jsoup.helper.W3CDom w3CDom28 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom30 = w3CDom28.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom32 = w3CDom28.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom33 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory34 = w3CDom33.factory;
        w3CDom28.factory = documentBuilderFactory34;
        org.jsoup.helper.W3CDom w3CDom36 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom38 = w3CDom36.namespaceAware(true);
        org.jsoup.helper.W3CDom w3CDom40 = w3CDom36.namespaceAware(false);
        org.jsoup.helper.W3CDom w3CDom41 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory42 = w3CDom41.factory;
        w3CDom36.factory = documentBuilderFactory42;
        w3CDom28.factory = documentBuilderFactory42;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory45 = w3CDom28.factory;
        org.jsoup.helper.W3CDom w3CDom46 = new org.jsoup.helper.W3CDom();
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory47 = w3CDom46.factory;
        w3CDom28.factory = documentBuilderFactory47;
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory49 = w3CDom28.factory;
        w3CDom18.factory = documentBuilderFactory49;
        w3CDom0.factory = documentBuilderFactory49;
        java.lang.Class<?> wildcardClass52 = documentBuilderFactory49.getClass();
        org.junit.Assert.assertNotNull(w3CDom2);
        org.junit.Assert.assertNotNull(w3CDom4);
        org.junit.Assert.assertNotNull(documentBuilderFactory6);
        org.junit.Assert.assertNotNull(w3CDom10);
        org.junit.Assert.assertNotNull(w3CDom12);
        org.junit.Assert.assertNotNull(documentBuilderFactory14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(w3CDom21);
        org.junit.Assert.assertNotNull(w3CDom23);
        org.junit.Assert.assertNotNull(documentBuilderFactory25);
        org.junit.Assert.assertNotNull(w3CDom30);
        org.junit.Assert.assertNotNull(w3CDom32);
        org.junit.Assert.assertNotNull(documentBuilderFactory34);
        org.junit.Assert.assertNotNull(w3CDom38);
        org.junit.Assert.assertNotNull(w3CDom40);
        org.junit.Assert.assertNotNull(documentBuilderFactory42);
        org.junit.Assert.assertNotNull(documentBuilderFactory45);
        org.junit.Assert.assertNotNull(documentBuilderFactory47);
        org.junit.Assert.assertNotNull(documentBuilderFactory49);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }
}

